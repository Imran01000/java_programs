import java.util.*;
public class Gambler {
	
	//Variable declaration.
	static int won=0;
	static int loss=0;
	static int stake=100;
	static int stakeTemp=stake;
	static int bet=1;
	static int half=stake/2;
	static int cash=0;
	static int count1=0;
	static int count0=0;
	static int winMoney=0;
	static int lossMoney=0;
	
	//Array declaration.
	static int arrayDays[]=new int[20];

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(stake);
		
	//For loop taken for 20 days and total amount of win and loss
		for(int days=0;days<20;days++)
		{	
			int played=r.nextInt(2);
			if(played==1)
			{
				System.out.println("You win bet");
				stakeTemp=stakeTemp+half;
				System.out.println("You win by 50 ");
				System.out.println(stakeTemp);
				count1++;
				
										
			}
			else
			{
				System.out.println("you loss bet");
				stakeTemp=stakeTemp-half;
				System.out.println("You loss ny 50");
				System.out.println(stake);
				count0++;
				
			}
				arrayDays[days]=stakeTemp;	
		}
				System.out.println("Number of times win : "+count1);
				System.out.println("Number of times loss : "+count0);
				winMoney=count1*half;
				lossMoney=count0*half;
			
		//Displaying each days loss and win in array.	
			for (int i = 0; i <arrayDays.length; i++) {
				System.out.print(arrayDays[i]+" ");
			}
				System.out.println();
				System.out.println("Total win amount = "+winMoney);
				System.out.println("Total loss amount = "+lossMoney);		
	}
}	


