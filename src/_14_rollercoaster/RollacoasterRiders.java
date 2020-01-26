package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollacoasterRiders {
	public static void main(String[] args) {

		String height = JOptionPane.showInputDialog(
				"Put in your hieght in inches (only number) and we will tell you if you are tall enough to ride our rollacoaster!!!");
		int userHeight = Integer.parseInt(height);
		if (userHeight > 48) {
			JOptionPane.showMessageDialog(null, "Great!!! You are tall enough to go on the ride!!");
		}
		if (userHeight < 48) {
		
		JOptionPane.showMessageDialog(null, "Sorry. Your not tall enough. Go wait in the kids section.");
		}
	}
}