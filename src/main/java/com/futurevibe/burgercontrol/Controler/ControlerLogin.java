package com.futurevibe.burgercontrol.Controler;

import com.futureVibe.burgerControl.Model.Usuario;
import com.futurevibe.burgercontrol.Model.DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControlerLogin {

    public String efetuarLogin(JTextField user) {

        UsuarioDAO userDao = new UsuarioDAO();

        String login = userDao.verificarUser(user.getText());
        

        if (login.equals("Usuario não encontrado")) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado");
        } else if (login.equals(null)) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao Banco de Dados!");
        }
        
        return login;
        
    }

    public boolean logar(JTextField user1, JPasswordField password) {
        UsuarioDAO userDao = new UsuarioDAO();

        Usuario usuario = userDao.VerificarLogin(user1.getText());

        if (!new String(password.getPassword()).equals(usuario.getPassword())) {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
            return false;
        }

        if (usuario.getEstatusLogin().equals("SUSPENSO")) {
            JOptionPane.showMessageDialog(null, "Seu acesso está Suspenso!\n Entre em contato para regularizar");
            return false;
        }
        
        if ((usuario.getEstatusLogin().equals("ATIVO"))) {
            return true;
        }
        return false;
    }
}
