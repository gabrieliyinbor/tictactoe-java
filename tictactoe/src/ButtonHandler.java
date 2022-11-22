package tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    TicTacToe frame;


    String symbol = "x";

    public ButtonHandler(TicTacToe frame) {
        this.frame = frame;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == frame.gameBoard[i]){
                if (frame.gameBoard[i].getText().isEmpty() && frame.playerTurn){
                    frame.gameBoard[i].setText("x");
                    frame.playerTurn = false;
                }
                else {
                    frame.gameBoard[i].setText("o");
                    frame.playerTurn = true;
                }
                checkWinner();
            }
        }
    }


    public void checkWinner(){
        // wins by row for x or o
        if (frame.gameBoard[0].getText().equals("x") && frame.gameBoard[1].getText().equals("x") && frame.gameBoard[2].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");

        }
        else if (frame.gameBoard[0].getText().equals("o") && frame.gameBoard[1].getText().equals("o") && frame.gameBoard[2].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }

        else if (frame.gameBoard[3].getText().equals("x") && frame.gameBoard[4].getText().equals("x") && frame.gameBoard[5].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[3].getText().equals("o") && frame.gameBoard[4].getText().equals("o") && frame.gameBoard[5].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }
        else if (frame.gameBoard[6].getText().equals("x") && frame.gameBoard[7].getText().equals("x") && frame.gameBoard[8].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[6].getText().equals("o") && frame.gameBoard[7].getText().equals("o") && frame.gameBoard[8].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }

        // wins by column
        else if (frame.gameBoard[0].getText().equals("x") && frame.gameBoard[3].getText().equals("x") && frame.gameBoard[6].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[0].getText().equals("o") && frame.gameBoard[3].getText().equals("o") && frame.gameBoard[6].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }
        else if (frame.gameBoard[1].getText().equals("x") && frame.gameBoard[4].getText().equals("x") && frame.gameBoard[7].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[1].getText().equals("o") && frame.gameBoard[4].getText().equals("o") && frame.gameBoard[7].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }
        else if (frame.gameBoard[2].getText().equals("x") && frame.gameBoard[5].getText().equals("x") && frame.gameBoard[8].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[2].getText().equals("o") && frame.gameBoard[5].getText().equals("o") && frame.gameBoard[8].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }


        //wins diagonal
        else if (frame.gameBoard[0].getText().equals("x") && frame.gameBoard[4].getText().equals("x") && frame.gameBoard[8].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"Player x win!");
        }
        else if (frame.gameBoard[0].getText().equals("o") && frame.gameBoard[4].getText().equals("o") && frame.gameBoard[8].getText().equals("o")){
            JOptionPane.showMessageDialog(frame,"Player o win!");
        }




    }



}

