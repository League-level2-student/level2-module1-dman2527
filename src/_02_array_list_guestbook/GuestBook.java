package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	ArrayList<String> list = new ArrayList<String>();
	public void setup() {
		frame.add(panel);
		panel.add(button0);
		panel.add(button1);
		button0.setText("Add Name");
		button1.setText("View Names");
		button0.addActionListener(this);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button0) {
			String name = JOptionPane.showInputDialog("What name would you like to add?");
			list.add(name);
		}
		if(arg0.getSource() == button1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Guest #" + i + ": " + list.get(i));
			
			}
		}
	}
}
