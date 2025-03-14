import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame 
{
	public static void main(String[] args)throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int randomNumber=random.nextInt(11);
		int attempts=3;
		int guessNumber=0;
		try {

		}
		finally {
			System.out.println("🎯WELCOME TO THE GAME🎯");
			Thread.sleep(2000);
			System.out.println("I have choosen the random number🥱! try to guess it😁! ");
			Thread.sleep(2000);
			System.out.println("you have "+attempts+" attempts only! Be carefull😊");
			while(guessNumber!=randomNumber && attempts >0)
			{
				Thread.sleep(2000);
				System.out.println("guess the number:");
				int number=scanner.nextInt();
				if(number>randomNumber)
				{
					if(attempts>0) {
						Thread.sleep(2000);
						System.out.println("you are too close! but your number is greater then my number");
						attempts--;
						Thread.sleep(2000);
						System.out.println("you have "+attempts+" attempts!");
					}
				}
				else if(number<randomNumber)
				{
					if(attempts>0) {
						Thread.sleep(2000);
						System.out.println("you are too close! but your number is less then my number");
						attempts--;
						Thread.sleep(2000);
						System.out.println("you have "+attempts+" attempts!");
					}
				}
				else
				{
					Thread.sleep(2000);
					System.out.println("Congratulations you guessed the correct number👏👏");
					System.exit(0);
				}
				if(attempts==0)
				{
					Thread.sleep(2000);
					System.out.println("😍Better luck next time😍");
				}
				
			}
			Thread.sleep(3000);
			System.out.println("the correct answer is "+randomNumber);
			scanner.close();
		}
	}

}
