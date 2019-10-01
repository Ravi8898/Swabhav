package com.techlabs.presentation.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import com.techlabs.business.model.Game;

public class EventHandler implements ActionListener {

	private Game game;
	private GameFrame gameFrame;

	public EventHandler(Game game, GameFrame gameFrame) {
		this.game = game;
		this.gameFrame = gameFrame;

		for (JButton button : gameFrame.getButtons())
			button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		for (JButton button : gameFrame.getButtons())
			if (event.getSource() == button && (!gameFrame.getLabels()[4].getText().equals("WIN")
					&& (!gameFrame.getLabels()[4].getText().equals("DRAW")))) {
				try {
					game.play(Integer.parseInt(button.getText()));
				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());


				}

				button.setText(game.getCurrentPlayer().getMark().toString());

				gameFrame.getLabels()[3].setText(game.getCurrentPlayer().getName());
				gameFrame.getLabels()[3].setBounds(830, 80, 40, 20);

				gameFrame.getLabels()[4].setText(game.getStatus().toString());
				gameFrame.getLabels()[4].setBounds(830, 110, 80, 20);
				
				
				if(gameFrame.getLabels()[4].getText().equals("WIN")) {
					game.switchPlayer();
					gameFrame.getLabels()[5].setText(game.getCurrentPlayer().getName()+" Won the match");
					gameFrame.getLabels()[5].setBounds(700,150,200,20);
					
				}
				
				if(gameFrame.getLabels()[4].getText().equals("DRAW")) {
					game.switchPlayer();
					gameFrame.getLabels()[6].setText(" Game Over...!!!");
					gameFrame.getLabels()[6].setBounds(700,150,200,20);
					
				}
					

				gameFrame.add(gameFrame.getLabels()[4]);
				gameFrame.add(gameFrame.getLabels()[3]);
				gameFrame.add(gameFrame.getLabels()[5]);
			}

	}

}
