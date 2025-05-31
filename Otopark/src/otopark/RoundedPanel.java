package otopark;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private int cornerRadius = 30;

    public RoundedPanel() {
        setOpaque(false); // Arka planı saydam yap
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint(); // Radius değiştiğinde paneli yeniden çiz
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
    }
}
