package agario;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;



/**
 * Created by goodstuff on 23.03.2017.
 */

public class Panel extends JPanel implements MouseMotionListener{
    private Image image = null;
    Gracz gracz = new Gracz(0,0,10);
    public Panel(String filename){
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.white);
        addMouseMotionListener(this);
        this.image = new ImageIcon(filename).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(gracz.getWspol_x(),gracz.getWspol_y(),gracz.getPromien(),gracz.getPromien());
    }

    public void mouseDragged(MouseEvent e) {

    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("ruch");
        gracz.setWspol_x(gracz.getWspol_x());
        gracz.setWspol_y(gracz.getWspol_y());
        repaint();

    }

}
