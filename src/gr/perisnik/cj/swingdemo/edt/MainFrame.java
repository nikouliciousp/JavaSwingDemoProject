package gr.perisnik.cj.swingdemo.edt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setTitle("Hello");
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		this.setContentPane(contentPane);
		
		JButton btnOne = new JButton("Warning Button");
		btnOne.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		JButton btnTwo = new JButton("Confirm Button");
		btnTwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "Message", "Title", JOptionPane.YES_NO_OPTION);
				
				if (answer == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		contentPane.add(btnOne);
		contentPane.add(btnTwo);
	}
}