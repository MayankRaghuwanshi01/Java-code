import java.util.*;
public class Grade 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your test score:");
		int ts=sc.nextInt();
		sc.nextLine();
		if(ts>90 && ts<=100)
			System.out.println("A");
		else if(ts>80)
			System.out.println("B");
		else if(ts>70)
			System.out.println("C");
		else if(ts>60)
			System.out.println("D");
		else if(ts>=0)
			System.out.println("F");
		else
			System.out.println("Enter a valid score(0-100)");
		sc.close();
	}

}