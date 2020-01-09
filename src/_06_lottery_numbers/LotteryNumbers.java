package _06_lottery_numbers;
import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
	
	
	Random lotteryTicket = new Random ();
	int randomNumber1 = lotteryTicket.nextInt(10);
	int randomNumber2 = lotteryTicket.nextInt(21);
	int randomNumber3 = lotteryTicket.nextInt(6);
	int randomNumber4 = lotteryTicket.nextInt(33);
	int randomNumber5 = lotteryTicket.nextInt(101);
	System.out.println(randomNumber1+" "+randomNumber2+" "+randomNumber3+" "+randomNumber4+" "+randomNumber5+" ");
	}
}
