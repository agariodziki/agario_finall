package agario;

import javax.swing.*;

/**
 * Created by goodstuff on 23.03.2017.
 */
public class okno extends JFrame{
    public okno() {
        super("agar.io");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel Panel = new panel();
        add(Panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
