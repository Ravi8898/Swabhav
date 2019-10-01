package com.techlabs.presentation.frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.techlabs.business.model.Board;
import com.techlabs.business.model.Game;
import com.techlabs.business.model.Mark;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.ResultAnalyzer;

public class GameFrame extends JFrame {

	private JButton[] buttons;
	private JLabel[] labels;

	public GameFrame() {

		buttons = new JButton[9];
		labels = new JLabel[7];

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

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
		}

		for (int i = 0; i < labels.length; i++)
			labels[i] = new JLabel();
	}

	public void addComponents() {

		for (JButton button : buttons)
			add(button);

		for (JLabel label : labels)
			add(label);
	}

	public static void main(String[] args) {

		GameFrame gameFrame = new GameFrame();

		Player[] players = new Player[2];
		players[0] = new Player("Ravi", Mark.O);
		players[1] = new Player("Sunny", Mark.X);

		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Game game = new Game(players, board, resultAnalyzer);

		EventHandler eventHandler = new EventHandler(game, gameFrame);
	}

	public JButton[] getButtons() {
		return buttons;
	}

	public JLabel[] getLabels() {
		return labels;
	}

	

}
