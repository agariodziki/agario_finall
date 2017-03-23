package agario;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;



/**
 * Created by goodstuff on 23.03.2017.
 */

public class Panel extends JPanel{
    private Image image = null;
    public Panel(String filename){
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.white);
        this.image = new ImageIcon(filename).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
    }

}
