package agario;

import javax.swing.*;
import java.awt.*;

/**
 * Created by goodstuff on 23.03.2017.
 */

public class Panel extends JPanel{
    public Panel(){
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.WHITE);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // kolo
        g2d.fillOval(10, 10, 30, 30);
    }
}
