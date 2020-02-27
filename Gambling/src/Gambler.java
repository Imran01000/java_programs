import java.util.*;
public class Gambler {
	static int stake=100;
	static int bet=1;
	public static void main(String[] args) {
		
		Gambler g=new Gambler();
		Random r=new Random();
		System.out.println(stake);
		while(true)
		{
			int played=r.nextInt(2);
			if(played==1)
			{
				System.out.println("You win bet");
				stake++;	
				break;
			}
			else
			{
				System.out.println("you loss bet");
				stake=stake-bet;
				break;
			}
		}
		System.out.println("Current stake condition : "+stake);
	}
	
}
