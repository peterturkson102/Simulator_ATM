package src;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LogoAnimatorJPanel extends JPanel {
    private static final String IMAGE_NAME = "deitel";
    protected ImageIcon[] images = new ImageIcon[30];
    private final int TOTAL_IMAGES = 30;
    private int currentImage = 0;
    private final int ANIMATION_DELAY = 200;
    private int width;
    private int height;
    private Timer animationTimer;

    public LogoAnimatorJPanel() {
        for(int var1 = 0; var1 < this.images.length; ++var1) {
            this.images[var1] = new ImageIcon(this.getClass().getResource("images/deitel" + var1 + ".gif"));
        }

        this.width = this.images[0].getIconWidth();
        this.height = this.images[0].getIconHeight();
    }

    public void paintComponent(Graphics var1) {
        super.paintComponent(var1);
        this.images[this.currentImage].paintIcon(this, var1, 0, 0);
        if (this.animationTimer.isRunning()) {
            this.currentImage = (this.currentImage + 1) % 30;
        }

    }

    public void startAnimation() {
        if (this.animationTimer == null) {
            this.currentImage = 0;
            this.animationTimer = new Timer(200, new LogoAnimatorJPanel.TimerHandler());
            this.animationTimer.start();
        } else if (!this.animationTimer.isRunning()) {
            this.animationTimer.restart();
        }

    }

    public void stopAnimation() {
        this.animationTimer.stop();
    }

    public Dimension getMinimumSize() {
        return this.getPreferredSize();
    }

    public Dimension getPreferredSize() {
        return new Dimension(this.width, this.height);
    }

    private class TimerHandler implements ActionListener {
        private TimerHandler() {
        }

        public void actionPerformed(ActionEvent var1) {
            LogoAnimatorJPanel.this.repaint();
        }
    }
}
