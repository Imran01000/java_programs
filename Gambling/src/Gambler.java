import java.util.*;
public class Gambler {
	static int stake=100;
	static int bet=1;
	final static int full=150;
	final static int half=50;
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
				if(stake==full)
					break;
				
			}
			else
			{
				System.out.println("you loss bet");
				stake=stake-bet;
				if(stake==half)
					break;
				
			}
		}
		System.out.println("Current stake condition : "+stake);
	}
	
}
