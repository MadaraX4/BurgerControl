package com.futurevibe.burgercontrol.Componentes;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GradientePanel extends JPanel {

    private Color color1;
    private Color color2;

    
     @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int widht = getWidth();
        int height = getHeight();
        
        Color color1 = new Color(234,135,26);
        Color color2 = new Color(216,68,19);
        GradientPaint gp = new GradientPaint(0,0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, widht, height);
    }
}
