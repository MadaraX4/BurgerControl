
package com.futurevibe.burgercontrol.Componentes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.AbstractBorder;


public class BordaAbstrata extends AbstractBorder{
    
    private final int radius;
    
    public BordaAbstrata(int radius){
        this.radius = radius;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int widht, int height){
    
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.black);
        
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRoundRect(x, y, widht -1, height -1, radius, radius);
    }
}
