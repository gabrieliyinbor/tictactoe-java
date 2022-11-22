package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe extends JFrame {
    private final int width = 400;
    private final int height = 400;
    public boolean playerTurn = true;
    public JPanel panelCenter;

    public JButton[] gameBoard = new JButton[9];


    public TicTacToe() {
        setSize(width, height);
        setTitle("TicToeGame");


        panelCenter = new JPanel(new GridLayout(3, 3));
        add(panelCenter, BorderLayout.CENTER);


        for (int i = 0; i < 9; i++) {
            gameBoard[i] = new JButton();
            panelCenter.add(gameBoard[i]);
            gameBoard[i].addActionListener(new ButtonHandler(this));

        }







    }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.setDefaultCloseOperation(game.EXIT_ON_CLOSE);
        game.setVisible(true);
    }
}
