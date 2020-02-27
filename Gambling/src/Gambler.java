import java.util.*;
public class Gambler {
	static int won=0;
	static int loss=0;
	static int stake=100;
	static int bet=1;
	final static int full=150;
	final static int half=50;
	public static void main(String[] args) {
		
		Gambler g=new Gambler();
		Random r=new Random();
		System.out.println(stake);
		for(int days=1;days<=20;days++)
		{	
			while(true)
			{
				int played=r.nextInt(2);
				if(played==1)
				{
					System.out.println("You win bet");
					stake++;
					if(stake==full)
					{
						won=won+50;
						break;
					}
				
				}
				else
				{
					System.out.println("you loss bet");
					stake=stake-bet;
					if(stake==half)
					{
						loss=loss-50;
						break;
					}
				
				}
			}
		System.out.println("Current stake condition : "+stake);
		System.out.println(won);
		System.out.println(loss);
		}
	}
}
