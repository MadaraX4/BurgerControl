package com.futureVibe.burgerControl.Model;

import java.time.LocalDate;

public class Usuario {
 
    private String user;
    private String password;
    private String cpf;
    private String nome;
    private String estatusLogin;
    private String estatusPagamento;
    private int diaDoPagamento;
    private String email;
    private String telefone;
    
    public Usuario(){
    
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstatusLogin() {
        return estatusLogin;
    }

    public void setEstatusLogin(String estatusLogin) {
        this.estatusLogin = estatusLogin;
    }

    public String getEstatusPagamento() {
        return estatusPagamento;
    }

    public void setEstatusPagamento(String estatusPagamento) {
        this.estatusPagamento = estatusPagamento;
    }

    public int getDiaDoPagamento() {
        return diaDoPagamento;
    }

    public void setDiaDoPagamento(int diaDoPagamento) {
        this.diaDoPagamento = diaDoPagamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
  }
