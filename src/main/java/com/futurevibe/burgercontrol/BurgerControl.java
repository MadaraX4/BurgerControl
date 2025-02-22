package com.futurevibe.burgercontrol;

import com.futurevibe.burgercontrol.Componentes.JTextFieldRedondo;
import com.futurevibe.burgercontrol.ConecctionFactory.ConnectionLogin;


public class BurgerControl {

    public static void main(String[] args) {
        ConnectionLogin log = new ConnectionLogin();
        log.getConnection();
    }
}