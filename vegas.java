import java.util.Scanner;
import java.lang.Math;   

public class vegas {
	
	public static int rng()
	{
		int min = 100;  
		int max = 999;  
		int b = (int)(Math.random()*(max-min+1)+min);   
		return b;
	}
	
	public static boolean machine1(int mach1, int totMach1)
	{
	
		System.out.println("Machine 1 was used.");
		System.out.println("You rolled: " + rng());
		System.out.println("Machine 1 has been used " + totMach1 + " times.");
		
		if (mach1 == 35)
		{
			return true;
		}
		return false;
	}
	
	public static boolean machine2(int mach2, int totMach2)
	{
	
		System.out.println("Machine 2 was used.");
		System.out.println("You rolled: " + rng());
		System.out.println("Machine 2 has been used " + totMach2 + " times.");
		
		if (mach2 == 100)
		{
			return true;
		}
		return false;
	}
	
	public static boolean machine3(int mach3, int totMach3)
	{
	
		System.out.println("Machine 3 was used.");
		System.out.println("You rolled: " + rng());
		System.out.println("Machine 3 has been used " + totMach3 + " times.");
		
		if (mach3 == 8)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int quarters, machineOrder, mach1, totMach1, mach2, totMach2, mach3, totMach3, playAmnt;
		
		machineOrder = 1;
		playAmnt = 0;
		mach1 = 0;
		totMach1 = 0;
		mach2 = 0;
		totMach2 = 0;
		mach3 = 0;
		totMach3 = 0;

	    Scanner num = new Scanner(System.in);
	    System.out.println("Enter the number of quarters you have: ");
	    quarters = num.nextInt();
		
		do {
				
		switch(machineOrder){
			case 1:
				machineOrder++;
				quarters--;
				playAmnt++;
				mach1++;
				totMach1++;

				if (machine1(mach1, totMach1) == true)
				{
					quarters += 25;
					mach1 = 0;
					System.out.println("Congrats! You won $6.25 from machine 1!");
				}
				
				System.out.println("You have played " + playAmnt + " times.");
				System.out.println("You now have " + quarters + " quarter(s)\n");
			break;
			
			case 2:
				machineOrder++;
				quarters--;
				playAmnt++;
				mach2++;
				totMach2++;

				if (machine2(mach2, totMach2))
				{
					quarters += 75;
					mach2 = 0;
					System.out.println("Congrats! You won $18.75 from machine 2!");
				}

				System.out.println("You have played " + playAmnt + " times.");
				System.out.println("You now have " + quarters + " quarter(s)\n");
			break;
			
			case 3:
				machineOrder = 1;
				quarters--;
				playAmnt++;
				mach3++;
				totMach3++;

				if (machine3(mach3, totMach3))
				{
					quarters += 5;
					mach3 = 0;
					System.out.println("Congrats! You won $1.25 from machine 3!");
				}
				
				System.out.println("You have played " + playAmnt + " times.");
				System.out.println("You now have " + quarters + " quarter(s)\n");
			break;
			}
		} while(quarters != 0);
		
		System.out.println("In total, you played " + playAmnt + " times.");
		
	}
}