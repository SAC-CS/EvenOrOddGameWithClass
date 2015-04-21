
import java.util.Scanner;
public class classEvenOrOdd 
{

	public void next()
	{
	Scanner Input = new Scanner(System.in);
	
	
	int playerguess;
	int computerguess;
	String playerInput;
	int count = 1;
	int won = 1;
	int lost = 1;
	String convertion;
	String odd;
	String even;
	
	while ( count < 5)
	{
	
	computerguess = 1 + (int)(Math.random ()*2);
	
	
	System.out.println("even or odd:");
	playerInput = Input.next();
	
	
	switch ( computerguess )
	{
	case 1: convertion = "odd"; 
		switch ( playerInput )
		{
		case "even": System.out.println("You lose!"); lost++; break;
		case "odd": System.out.println("You win!");won++;break;
		}
		System.out.printf( "Round %d \n" , count++);
		break;
	case 2: convertion = "even"; 
		switch ( playerInput )
		{
		case "even": System.out.println("You win!");won++;break;
		case "odd": System.out.println("You lose!");lost++;break;
		}
		System.out.printf( "Round %d \n" , count++);
		break;

	
	
	
	}

	}
	System.out.printf( "you lost %d \n" , lost++ -1);
	System.out.printf( "you won %d \n" , won++ -1);
}
}