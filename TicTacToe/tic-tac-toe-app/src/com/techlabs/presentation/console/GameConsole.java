package com.techlabs.presentation.console;

import java.util.Scanner;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.CellIsAlreadyMarkedException;
import com.techlabs.business.model.Game;
import com.techlabs.business.model.Mark;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.Result;
import com.techlabs.business.model.ResultAnalyzer;

public class GameConsole {

	public static void main(String[] args) {

		Player[] players = new Player[2];
		players[0] = new Player("Ravi", Mark.O);
		players[1] = new Player("Sunny", Mark.X);

		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Game game = new Game(players, board, resultAnalyzer);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello... Welcome to the Tic-Tac-Toe game... hope You'll Enjoy...!!!");

		while (!game.getStatus().equals(Result.WIN) && !game.getStatus().equals(Result.DRAW)) {
			displayBoard(board);
			System.out.println(game.getCurrentPlayer().getName() + " Enter your location:");
			int location = scanner.nextInt();
			try {
			game.play(location);
			}
			catch(CellIsAlreadyMarkedException e) {
				System.out.println(e.getMessage());
				
			}
			game.getStatus();

		}
		game.switchPlayer();
		displayBoard(board);
		if (game.getStatus().equals(Result.WIN))
			System.out.println(game.getCurrentPlayer().getName() + " wins the game");
		else if (game.getStatus().equals(Result.DRAW))
			System.out.println("Match is Draw");
		System.out.println("Game Over");

		scanner.close();

	}

	public static void displayBoard(Board board) {

		int i = 0;
		while (i != 9) {
			System.out.println(board.getCells()[i].getMark() + " | " + board.getCells()[i + 1].getMark() + " | "
					+ board.getCells()[i + 2].getMark());
			System.out.println("----------");
			i += 3;
		}
	}

}
