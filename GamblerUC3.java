import java.util.Scanner;

public class GamblerUC3 {

	public static void main(String[] args) {
		
		int amount = 100;
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter the amount that gambler bet : ");
		int betting = scanner.nextInt();*/
		System.out.println("Enter the no. of Days : ");
		int Day = scanner.nextInt();
		int j = (amount/2);
		for(int i=1; i<=Day;i++)
		{
			
			for(amount=1; amount<=j;amount++)
			{
				int bet = (int) Math.floor((Math.random()*10)%2);
				if (bet ==1)
				{
					
					System.out.println("Won");
					amount += 1;
					System.out.println("Amount =" + amount);
				}
				else
				{
					System.out.println("Loose");
					amount -= 1;
					System.out.println("Amount =" + amount);
				}
			}
			System.out.println("Total amount end of the day =" +amount);
		}


	}

}
