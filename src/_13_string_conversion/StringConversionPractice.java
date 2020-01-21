package _13_string_conversion;
import javax.swing.JOptionPane;

public class StringConversionPractice {
public static void main(String[] args) {
	

	String LuckyNumber= JOptionPane.showInputDialog(null, "Enter your lucky number!!!");
	int num = Integer.parseInt(LuckyNumber);
	JOptionPane.showMessageDialog(null, "Your special number is"+(num+5));
}
}