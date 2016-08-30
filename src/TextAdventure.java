import java.util.Scanner;

public class TextAdventure {

	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		
	String Go, East, West, North, South, Yes, No, Look;
	
	String Test = "hurray";
		
	System.out.println("tbd(start)");
	Go = keyboard.nextLine();
	
	int StringPosition = Go.indexOf("yes");
		
	if(StringPosition != -1)
	{
		System.out.printf("I found your string at position %d\n",StringPosition);
		System.out.println(Test);
	}
		
	if (Go.equalsIgnoreCase("Yes"))
	{
		System.out.println("tbd");
	}
	Look = keyboard.next();

	} //static void close
} //close class TextAdventure