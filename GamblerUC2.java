import java.util.Scanner;

public class GamblerUC2 {

	public static void main(String[] args) {
		int nw=0;
		int nl=0;
		int i=1;
		int j=100;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount that gambler bet : ");
		int betting = scanner.nextInt();
		System.out.println("Enter the no. of Days : ");
		int Day = scanner.nextInt();
		while(i<=Day && betting<=j)
		{
			int bet = (int) Math.floor((Math.random()*10)%2);
			if (bet ==1)
			{
				j += 1;
				System.out.println("Won");
				System.out.println("Total Amount =" +j);
				i++;
			}
			else
			{
				j -=1;
				System.out.println("Loose");
				System.out.println("Total Amount =" +j);
				i++;
			}
		}

	}

}
