package com.company;

import javax.swing.*;
import java.awt.*;

public class GuiRps extends JFrame{

    private JButton buttonRock1;
    private JButton buttonPaper1;
    private JButton buttonScissors1;

    private JButton buttonRock2;
    private JButton buttonPaper2;
    private JButton buttonScissors2;

    private JButton buttonFight;


    public GuiRps(String titel){
        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setSize(380, 200);
        setResizable(false);

        initComponents();
        add(buttonRock1);
        add(buttonPaper1);
        add(buttonScissors1);

        add(buttonRock2);
        add(buttonPaper2);
        add(buttonScissors2);
        add(buttonFight);


        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void initComponents(){
        buttonRock1 = new JButton("S1: Rock");
        buttonPaper1 = new JButton("S1: Paper");
        buttonScissors1 = new JButton("S1: Scissors");

        buttonRock2 = new JButton("S2: Rock");
        buttonPaper2 = new JButton("S2: Paper");
        buttonScissors2 = new JButton("S2: Scissors");

        buttonFight = new JButton(("._---> Fight <---_."));


        buttonRock1.addActionListener(e -> Game.setSpielerWahl1(1));
        buttonPaper1.addActionListener(e -> Game.setSpielerWahl1(2));
        buttonScissors1.addActionListener(e -> Game.setSpielerWahl1(3));

        buttonRock2.addActionListener(e -> Game.setSpielerWahl2(1));
        buttonPaper2.addActionListener(e -> Game.setSpielerWahl2(2));
        buttonScissors2.addActionListener(e -> Game.setSpielerWahl2(3));
        buttonFight.addActionListener(e -> {

            String Ergebnis = "Tie!";

            if (Game.getSpielerWahl1() == 1) {
                if (Game.getSpielerWahl2() == 3) Ergebnis = "Player 1";
                if (Game.getSpielerWahl2() == 2) Ergebnis = "Player 2";
            }
            if (Game.getSpielerWahl1() == 2) {
                if (Game.getSpielerWahl2() == 1) Ergebnis = "Player 1";
                if (Game.getSpielerWahl2() == 3) Ergebnis = "Player 2";
            }
            if (Game.getSpielerWahl1() == 3) {
                if (Game.getSpielerWahl2() == 2) Ergebnis = "Player 1";
                if (Game.getSpielerWahl2() == 1) Ergebnis = "Player 2";
            }
            JOptionPane.showMessageDialog(null,"The winner is: "+ Ergebnis);
        });

    }




}
