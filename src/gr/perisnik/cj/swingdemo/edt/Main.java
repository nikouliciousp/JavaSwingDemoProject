package gr.perisnik.cj.swingdemo.edt;

import java.awt.EventQueue;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame main = new MainFrame();
				main.setVisible(true);
			}
		});
		
		
	}
}