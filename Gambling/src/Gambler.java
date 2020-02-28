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
	static int luckyDay=0;
	static int unluckyDay=0;
	static int temp=0;
			
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
				luckyDay=arrayDays[0];
				unluckyDay=arrayDays[0];
			for (int i = 0; i < arrayDays.length; i++) {
					System.out.print(arrayDays[i]+" ");
			}
				System.out.println();
			for (int j = 0; j < arrayDays.length; j++) {
				if(luckyDay < arrayDays[j])			//Getting larger value
				{
					luckyDay=arrayDays[j];	
				}
				if(unluckyDay > arrayDays[j])			// Getting smaller value
				{
					unluckyDay=arrayDays[j];
				}
			}
				System.out.println();
				System.out.println("Total win amount = "+winMoney);
				System.out.println("Total loss amount = "+lossMoney);

		//getting in which day and  how many days that larger and smaller value generated.
				for (int k = 0; k < arrayDays.length; k++) {
					if(arrayDays[k]==luckyDay)
						System.out.println("Gambler luckyday : "+(k+1));
					if(arrayDays[k]==unluckyDay)
						System.out.println("Gambler unluckyday : "+(k+1));
				}
	}
}


