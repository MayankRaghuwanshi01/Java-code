import java.util.Scanner;
class calculator{
	
	public static void main(String args[]){
	
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for modulus");
	int input = s1.nextInt();
	System.out.println("\nEnter the first number: ");
	int n1=s1.nextInt();
	System.out.println("\nEnter the second number: "); //enter 2nd number
	int n2=s1.nextInt();
	switch(input)
	{
		case 1:
		{
			System.out.println("\nThe addition of "+n1+" and "+n2+" is "+(n1+n2));
			break;
		}
		case 2:
		{
			System.out.println("\nThe subtraction of "+n1+" and "+n2+" is "+(n1-n2));
			break;
		}
		case 3:
		{
			System.out.println("\nThe multiplication of "+n1+" and "+n2+" is "+(n1*n2));
			break;
		}
		case 4:
		{
			System.out.println("\nThe division of "+n1+" and "+n2+" is "+(n1/n2));
			break;
		}
		case 5:
		{
			System.out.println("\nThe modulus of "+n1+" and "+n2+" is "+(n1%n2));
			break;
		}
		default:
		{
			System.out.println("\nInvalid Input");
			break;
		}


	}
}
}
