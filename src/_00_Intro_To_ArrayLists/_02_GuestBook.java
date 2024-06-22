package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addNameButton = new JButton();
	JButton viewNamesButton = new JButton();


	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		_02_GuestBook guestBook = new _02_GuestBook();
		guestBook.run();

	}

	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addNameButton.addActionListener(this);
		viewNamesButton.addActionListener(this);


		frame.setTitle("Guest Book");

		addNameButton.setText("Add Name");
		viewNamesButton.setText("View Names");

		panel.add(addNameButton);
		panel.add(viewNamesButton);

		frame.add(panel);

		frame.pack();

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)arg0.getSource();

		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList.

		if(addNameButton == buttonClicked) {
			names.add(JOptionPane.showInputDialog("Enter a name"));
		}

		// When the "View Names" button is clicked, display a message dialog that displays all the names added to the list.
		// Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners

		else if(viewNamesButton == buttonClicked) {
			String finalPrintMessage = "";
			for(int i = 0; i < names.size(); i++) {
				finalPrintMessage = finalPrintMessage + "Guest #" + (i+1) + ": " + names.get(i) + "\n";
			}

			JOptionPane.showMessageDialog(null, finalPrintMessage, "Guest Book", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
