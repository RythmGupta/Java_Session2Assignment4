import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Choose the month:");
		Scanner s=new Scanner(System.in);
		String month=s.nextLine();
		switch(month)
		{
		case "Jan": System.out.println(31);break;
		case "Feb": System.out.println(28);break;
		case "Mar": System.out.println(31);break;
		case "Apr": System.out.println(30);break;
		case "May": System.out.println(31);break;
		case "Jun": System.out.println(31);break;
		case "Jul": System.out.println(31);break;
		
		}

	}

}
