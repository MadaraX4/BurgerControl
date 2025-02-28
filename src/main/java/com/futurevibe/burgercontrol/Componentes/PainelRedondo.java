package com.futurevibe.burgercontrol.Componentes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PainelRedondo extends JPanel {

    private static final int arc_width = 60;
    private static final int arc_height = 60;

    public PainelRedondo() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arc_width, arc_height);

        g2d.setColor(Color.BLUE);  // Cor da borda
        g2d.setStroke(new BasicStroke(0));  // Espessura da borda
        g2d.drawRoundRect(0, 0, getWidth(), getHeight(), arc_width, arc_height);
    }

}
