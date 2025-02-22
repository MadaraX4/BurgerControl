package com.futurevibe.burgercontrol.Componentes;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GradientePanel extends JPanel {

    private Color color1;
    private Color color2;

    public GradientePanel(){
        setOpaque(false);
    }
     @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int widht = getWidth();
        int height = getHeight();
        
        Color color1 = Color.decode("#60392a");
        Color color2 = Color.decode("#e5d1ae");
        GradientPaint gp = new GradientPaint(0,0, color1, 130, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, widht, height);
    }
}
