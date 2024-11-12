package gr.perisnik.cj.swingdemo;

import javax.swing.*;

public class HelloSwing {
	public static void main(String[] args) {
		
		JFrame helloFrame = new JFrame();
		helloFrame.setTitle("Hello Swing");
		helloFrame.setSize(600, 300);
		helloFrame.setLocationRelativeTo(null);
		helloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		helloFrame.setVisible(true);
	}
}
