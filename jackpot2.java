 

//Gives us the scanner and random generator 
import java.util.*;

public class jackpot2 //name of the file 
{
		public static void main (String args[]) //first block of code run 
		{
			Scanner input = new Scanner (System.in);//allows user input 
			Random gen = new Random ();//makes random numbers 
			//all the variables initalized 
			int i, j, c; 
			int r =0;
			int times;
			int check;
			int usernumber [] =  new int [6];
			int winningnumber [] = new int [6];
			int winnings = 0; 
			boolean same = true;
			
			
			//this is where we ask how many times they want to play 
			//and then they give us the amount they want to play 
			System.out.printf("How many times would you like to play\n");
			times = input.nextInt ();  
			
			//this is the loop for the entirre game it runs the code 
			//as many times as the person wants to play 
			for (c = 0; c < times; c++)
			{
				//prints this to the screen
				System.out.printf ("Your numbers are: ");
				//makes a random set of nunbers for user number array 
				usernumber[0] = gen.nextInt(54) + 1;
			
				//this is the code to check and make sure the numbers dont match 
				for (i=0; i<usernumber.length; i++)
				{
					
					check = i - 1;
					
					
					same = true;
					
					//if they do match it goes through this and creates another number 
					while (same == true)
					{
						same = false;
						
						r = gen.nextInt(54) + 1;
					
						for (j = 0; j <= check; j++)
						{
							if (r == usernumber[j])
								same = true;
						}
					}

					usernumber[i] = r;
					//stores the nunmbers in r 
				
				}
				
			
				
				//this prints the array numbers to the screen
				for (i=0; i <6; i++)
					System.out.printf (" %d ", usernumber[i]);
		
					System.out.printf("\n");
					//jjust for the interface to look nicer
					
					
				System.out.printf ("Winning numbers are: ");//prints the winning numbers to the screen
				
				winningnumber[0] = gen.nextInt(54) + 1;//random numbers to the 
			
				//checks the numbers in the array to make sure there is no repeats 
				for (i=1; i<winningnumber.length; i++)
				{
					
					check = i - 1;
					
					same = true;
				
					while (same == true)
					{
						same = false;
						
						r = gen.nextInt(54) + 1;
					
						for (j = 0; j <= check; j++)
						{
							if (r == winningnumber[j])
								same = true;
						}
					}

					winningnumber[i] = r;
				
				}
				
			
				
				//prints the winning numbers to the screen
				for (i=0; i <6; i++)
					System.out.printf (" %d ", winningnumber[i]);
		
					System.out.printf("\n");
			
						
					

				
				int matches = 0; // this is a variable to use to keep track of the matches 
			
			
				//this block of code checks to see how many numbers match 
				for (i=0; i < usernumber.length; i++)
				{	
					for (j=0; j <winningnumber.length; j++)
					{
						
						if(winningnumber [j] == usernumber[i])
						{
							matches++;
						}
					}
						
				}
				
				System.out.printf ("matches: %d\n", matches);
				//prints out how many matches you have 
					
				
				
			//this is to see how much you won by going through how many matches you have 	
			switch (matches)
			{
				case 0: 
					System.out.printf("You won nothing\n");
					winnings = winnings -1;
					break;
				case 1:
					System.out.printf("You won nothing\n");
					winnings = winnings -1;
					break;
				case 2:
					System.out.printf("You win nothing \n");
					winnings = winnings -1;
					break;
				case 3: 
					System.out.printf("You won $3\n");
					winnings = winnings + 2;
					break;
				case 4:
					System.out.printf("You won $50\n");
					winnings = winnings + 49;
					break;
				case 5:
					System.out.printf("You won $2000\n");
					winnings = winnings + 1999;
					break;
				case 6:
					System.out.printf("You won $20,000,000!!!\n");
					winnings = winnings + 19999999;
					break ;
			}	
			
			
				System.out.printf("Your total winnings is: %d \n", winnings);
				//tells you your total winnings 
				
				
				
				System.out.printf ("\n");//makes the interface nicer 
				
	
				
				
				
			}
			
		
			
			
			
		}
	
}