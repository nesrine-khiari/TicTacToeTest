package tictactoegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI {
    private TicTacToe game;
    private JButton[][] buttons;
    private JFrame frame;

    public TicTacToeGUI() {
        game = new TicTacToe();
        frame = new JFrame("Tic Tac Toe");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[i][j].setFocusPainted(false);
                final int x = i, y = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            game.play(x, y);
                            buttons[x][y].setText(String.valueOf(game.getCurrentPlayer() == 'X' ? 'O' : 'X'));
                            String result = game.checkWinner();
                            if (!result.equals("Game in progress")) {
                                JOptionPane.showMessageDialog(frame, result);
                                resetBoard();
                            }
                        } catch (RuntimeException ex) {
                            JOptionPane.showMessageDialog(frame, ex.getMessage());
                        }
                    }
                });
                frame.add(buttons[i][j]);
            }
        }
        frame.setVisible(true);
    }

    private void resetBoard() {
        game = new TicTacToe();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText(" ");
            }
        }
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
