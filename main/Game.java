package main;

import javax.swing.JFrame;

public class Game {

	public void noo() {
		System.out.println("stilly");
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("completely new game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GamePanel());
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}


// WARMUP: Add an enemy class to the game. Give them an x and y velocity,
// then make it so they collide when they hit the edges of the window.
