
package com.futurevibe.burgercontrol.Componentes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;

public class JPasswordFieldRedondo extends JPasswordField{

private Shape shape;

public JPasswordFieldRedondo(int size){
    super(size);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
}

@Override
    public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setColor(getForeground());
    g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 30, 30));
    super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.setStroke(new BasicStroke(1)); // Ajuste a espessura da borda se necessário
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 30, 30)); // Aumentando a curvatura
    }
    
    @Override
    public boolean contains(int x, int y){
        if (shape == null || !shape.getBounds().equals(getBounds())) {
           shape = new RoundRectangle2D.Float(0, 0, getWidth() -1, getHeight() - 1, 30, 30);
        }
        return shape.contains(x, y);
    }
}
