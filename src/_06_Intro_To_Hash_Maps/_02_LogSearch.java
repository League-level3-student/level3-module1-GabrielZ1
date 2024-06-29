package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _00_Intro_To_ArrayLists._02_GuestBook;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */

	HashMap<Integer, String> map = new HashMap<Integer, String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton addEntryButton = new JButton();
	JButton searchByIDButton = new JButton();
	JButton viewListButton = new JButton();
	JButton removeEntryButton = new JButton();

	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.run();

	}

	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addEntryButton.addActionListener(this);
		searchByIDButton.addActionListener(this);
		viewListButton.addActionListener(this);
		removeEntryButton.addActionListener(this);

		frame.setTitle("Log Search");

		addEntryButton.setText("Add Entry");
		searchByIDButton.setText("Search by ID");
		viewListButton.setText("View List");
		removeEntryButton.setText("Remove Entry");
		
		panel.add(addEntryButton);
		panel.add(searchByIDButton);
		panel.add(viewListButton);
		panel.add(removeEntryButton);

		frame.add(panel);

		frame.pack();

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();

		if (addEntryButton == buttonClicked) {

			String inputID = JOptionPane.showInputDialog("Enter an ID.");
			String inputName = JOptionPane.showInputDialog("Enter a name.");

			map.put(Integer.valueOf(inputID), inputName);
			
		} else if (searchByIDButton == buttonClicked) {

			//in progress
			
		} else if (viewListButton == buttonClicked) {

			
			
		} else if (removeEntryButton == buttonClicked) {

			
			
		}

	}

}
