package data;

import java.util.Scanner;

import services.ImplementSeatInterface;

public class MainSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit=true;int YesOrNo=1;
		ImplementSeatInterface s=new ImplementSeatInterface();
		
		
		try {
		while(exit) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:\n\t1. Book Seat\n\t2. Cancel Seat");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:s.bookSeat();
			System.out.println("Would you like to continue. Type 1 to continue and type 2 to exit");
			YesOrNo=sc.nextInt();
			break;
						
			case 2:s.cancelSeat();
			System.out.println("Would you like to continue. Type 1 to continue and type 2 to exit");
			YesOrNo=sc.nextInt();
			break;
			
			default:System.out.println("Wrong choice. Try again");
			System.out.println("Would you like to continue. Type 1 to continue and type 2 to exit");
			YesOrNo=sc.nextInt();
			}
			while (YesOrNo != 1 && YesOrNo != 2) {
		        System.out.println("Invalid input.");
		        System.out.println("Type 1 = Continue booking; Type 2 = Exit the program");
		        YesOrNo = sc.nextInt();

		        if (YesOrNo == 2) {
		          System.out.println("Thank you for using this program.");
		          exit=false;
		        }
		     }
		}
	}catch(Exception e) {System.out.println(e);}
}
}
