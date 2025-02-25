package com.futurevibe.burgercontrol.Model.DAO;

import com.futureVibe.burgerControl.Model.Usuario;
import com.futurevibe.burgercontrol.ConecctionFactory.ConnectionLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public String verificarUser(String usuario) {

        Connection con = ConnectionLogin.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT usuario FROM usuarios WHERE usuario=? LIMIT 1";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("usuario");
            } else {
                return "Usuario não encontrado";

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            ConnectionLogin.closeConnection(con, stmt, rs);
        }
    }

    public Usuario VerificarLogin (String usuario) {

        Connection con = ConnectionLogin.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT senha,cpf,nome,estatusLogin,estatusPagamento,diaDoPagamento,email,telefone FROM usuarios WHERE usuario=?";
        Usuario user = new Usuario();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();

            while (rs.next()) {
                user.setPassword(rs.getString("senha"));
                user.setCpf(rs.getString("cpf"));
                user.setDiaDoPagamento(rs.getInt("diaDoPagamento"));
                user.setEmail(rs.getString("email"));
                user.setEstatusLogin(rs.getString("estatusLogin"));
                user.setEstatusPagamento(rs.getString("estatusPagamento"));
                user.setNome(rs.getString("nome"));
                user.setTelefone(rs.getString("telefone"));
                return user;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
