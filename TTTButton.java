import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTButton extends JButton implements ActionListener {
    private static int turn = 0;
    public TTTButton() {
        super();
        setPreferredSize(new Dimension(100,100));
        setForeground(Color.BLACK);
        setOpaque(true);
        setFont(new Font("Helvetica", Font.PLAIN, 60));
        setText(" ");
        addActionListener(this);
    }

    // Notice button clicks to record moves.
    public void actionPerformed(ActionEvent e) {
        if (turn % 2 == 0 && getText().equals(" ")) {
            setText("O");
        }else if (turn % 2 == 1 && getText().equals(" ")) {
            setText("X");
        }
        if (isThereAWinner()) {
            showWin();
            ShallWePlayAgain();
        }else if (noPlaceLeftToPlay()) {
            ShallWePlayAgain();
        }else {
            turn++;
        }
    }
    private boolean isThereAWinner() {
       boolean winner = false;
        JButton [] spaces = new JButton[0];
        System.out.print("Winner?");
        System.out.println(spaces[0].getText());
        if (spaces[0].getText().equals("1")) {
            winner = true;
            System.out.println("Winner");
       }
        return winner;
    }
    private boolean noPlaceLeftToPlay() {
            return true;
        }
    private void ShallWePlayAgain() {
        System.out.println("game over");
    }
    private void showWin() {

    }
    private void newGame() {

    }

}
