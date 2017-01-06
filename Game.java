import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main (String [] args) {
        JButton [] spaces;
        String title = "Simple Tic Tac Toe";
        int width = 3;
        int height = 3;

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(width, height));
        spaces = new JButton [width * height];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = new TTTButton();
            jp.add(spaces[i]);
        }
        jf.add(jp);

        jf.pack();
        jf.setVisible(true);




    }
}
