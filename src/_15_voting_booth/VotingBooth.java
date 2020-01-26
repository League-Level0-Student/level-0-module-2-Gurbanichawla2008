package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {

	String height = JOptionPane.showInputDialog(" Put in your age (only number)!!!!");
	int userHeight = Integer.parseInt(height);
	
	if (userHeight < 18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!!!");
		
	}
	
	if (userHeight > 18) {
		JOptionPane.showInputDialog("Who should the next president be?");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
