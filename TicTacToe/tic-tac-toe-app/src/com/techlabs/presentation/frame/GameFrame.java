package com.techlabs.presentation.frame;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.CellIsAlreadyMarkedException;
import com.techlabs.business.model.Game;
import com.techlabs.business.model.Mark;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.Result;
import com.techlabs.business.model.ResultAnalyzer;

public class GameFrame extends JFrame implements ActionListener {

	private static JButton[] buttons;
	private static Label[] labels;
	private static int n;

	public GameFrame() {

		buttons = new JButton[9];
		labels = new Label[5];

		setTitle("Tic-Tac-Toe");
		setSize(1024, 768);
		getContentPane().setBackground(Color.GREEN);

		initializeComponent();
		setComponents();
		addComponents();

		setLayout(null);
		setVisible(true);
	}

	public void setComponents() {

//		for (int i = 0; i < 9; i++) {
//			buttons[i].setText("" + Mark.E);
//		}

		buttons[0].setText("0");
		buttons[1].setText("1");
		buttons[2].setText("2");
		buttons[3].setText("3");
		buttons[4].setText("4");
		buttons[5].setText("5");
		buttons[6].setText("6");
		buttons[7].setText("7");
		buttons[8].setText("8");

		buttons[0].setBounds(305, 105, 100, 100);
		buttons[1].setBounds(405, 105, 100, 100);
		buttons[2].setBounds(505, 105, 100, 100);
		buttons[3].setBounds(305, 205, 100, 100);
		buttons[4].setBounds(405, 205, 100, 100);
		buttons[5].setBounds(505, 205, 100, 100);
		buttons[6].setBounds(305, 305, 100, 100);
		buttons[7].setBounds(405, 305, 100, 100);
		buttons[8].setBounds(505, 305, 100, 100);

		labels[0].setText("Hello... Welcome to the Tic-Tac-Toe game... hope You'll Enjoy...!!!");
		labels[0].setBounds(280, 55, 500, 30);
		labels[1].setText("Current Player:");
		labels[1].setBounds(720, 75, 100, 30);
		labels[2].setText("Status:");
		labels[2].setBounds(720, 105, 100, 30);

	}

	public void initializeComponent() {

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
		}

		for (int i = 0; i < 3; i++)
			labels[i] = new Label();
	}

	public void addComponents() {

		add(buttons[0]);
		add(buttons[1]);
		add(buttons[2]);
		add(buttons[3]);
		add(buttons[4]);
		add(buttons[5]);
		add(buttons[6]);
		add(buttons[7]);
		add(buttons[8]);

		add(labels[0]);
		add(labels[1]);
		add(labels[2]);
	}

	public static void main(String[] args) {

		GameFrame gameFrame = new GameFrame();

		Player[] players = new Player[2];
		players[0] = new Player("Ravi", Mark.O);
		players[1] = new Player("Sunny", Mark.X);

		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Game game = new Game(players, board, resultAnalyzer);

		while (!game.getStatus().equals(Result.WIN) && !game.getStatus().equals(Result.DRAW)) {
			labels[3] = new Label(game.getCurrentPlayer().getName());
			labels[3].setBounds(830, 80, 30, 20);
			gameFrame.add(labels[3]);

			labels[4] = new Label("" + game.getStatus());
			labels[4].setBounds(830, 110, 80, 20);
			gameFrame.add(labels[4]);
			
			try {
			game.play(n);
			}catch(CellIsAlreadyMarkedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		for(int i=0; i<9; i++)
		if(event.getSource()==buttons[i].getText()) {
			n=Integer.parseInt(buttons[i].getText());
		}
		
	}

}
