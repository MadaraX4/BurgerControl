package com.futurevibe.burgercontrol.Componentes;

import java.awt.BasicStroke;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class JButtonRedondo extends JButton {

    public JButtonRedondo() {
       setContentAreaFilled(false);
        setBorder(new EmptyBorder(5,0,5,0));
        setBackground(new java.awt.Color(245,245,245));
        setCursor(new Cursor(Cursor.HAND_CURSOR));   
    }

    @Override
     protected void paintComponent(Graphics g){
    int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Desenhar o fundo arredondado
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width - 1, height - 1, height, height);

        super.paintComponent(g);
    }
  @Override
    protected void paintBorder(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getForeground());
        g2.setStroke(new BasicStroke(0));
        g2.drawRoundRect(0, 0, width - 1, height - 1, height, height);
    }
}
