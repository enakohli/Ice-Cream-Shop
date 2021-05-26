package IceCream;
import java.util.*;
import java.text.NumberFormat;
public class TestIceCream {

	public static void main(String[] args) {
		//import scanner
		Scanner input=new Scanner (System.in);
		//declare variables
		String type="";
		String again="";
		int numScoops=0;
		int flavour=0;
		int numToppings=0;
		int topping=0;
		double cost=0;
		
		//ask user if they want a bowl or a cone
		do
		{
		System.out.println("Would you like a bowl or a cone (B/C)");
		type=input.next();
		CookiesandCream i1=new CookiesandCream();
		//if the user selects bowl they are asked to enter numbers 
		if (type.equalsIgnoreCase("B"))
		{
			i1.setType("Bowl");
			System.out.println("\n");
			i1.flavours();
			//ask user to enter the number of scoops
			System.out.println("\nEnter number of scoops (price per scoop is $2.00 and limit of scoops is 5): ");
			numScoops=input.nextInt();
			//check for invalid input
			while (numScoops<=0||numScoops>5)
			{
				System.out.println("Invalid Number. Please re-enter number of scoops: ");
				numScoops=input.nextInt();
			}
			i1.setCost1(numScoops*2);
			
			//array for flavours of ice cream
			IceCream ic[]=new IceCream[numScoops];
			System.out.println("\n");
			//for loop for asking the user to enter the flavours
			for (int i=0;i<ic.length;i++)
			{
				//enter flavours
				System.out.println("Enter flavour " + (i+1) + " (enter in the number for the flavour): " ); 
				flavour=input.nextInt();
				while (flavour != 1 && flavour != 2 && flavour != 3 && flavour != 4 && flavour != 5)
				{
					System.out.println("Invalid Input! Try Again\nEnter flavour " + (i+1) + " (enter in the number for the flavour): " ); 
					flavour=input.nextInt();
				}				
				//if flavour is 1 then it is cookies and cream
				if (flavour==1)
				{
					ic[i]=new CookiesandCream();
				}
				//if flavour is 2 then flavour is Moose Tracks
				else if (flavour==2)
				{
					ic[i]=new MooseTracks();
				}
				//if flavour is 3 then the flavour cookie dough
				else if (flavour==3)
				{
					ic[i]=new CookieDough();
				}
				//if flavour is 4 then the flavour is chocolate 
				else if (flavour==4)
				{
					ic[i]=new Chocolate();
				}
				//if flavour is 5 then the flavour is vanilla
				else if (flavour==5)
				{
					ic[i]=new Vanilla();
				}
			}
			i1.toppings();
			//ask the user to enter the number of toppings they want 
			System.out.println("\nEnter number of toppings (price per topping is $0.50 and limit of toppings is 5): ");
			numToppings=input.nextInt();
			//check if there is invalid input 
			while (numToppings <= 0 || numToppings>5)
			{
				System.out.println("Invalid Number. Please re-enter number of toppings: ");
				numToppings=input.nextInt();
			}
			//toppings cost
			i1.setCost2(numToppings*0.50);
			//array for toppings
			IceCream t[]=new IceCream[numToppings];
			System.out.println("\n");
			//for loop for asking the user to enter toppings 
			for (int i=0;i<t.length;i++)
			{
				//ask user to enter the topping
				System.out.println("Enter topping " + (i+1) + " (enter in the number for the topping): " ); 
				topping=input.nextInt();
				while (topping != 1 && topping != 2 && topping != 3 && topping != 4 && topping != 5)
				{
					System.out.println("Invalid Input! Try Again\nEnter topping " + (i+1) + " (enter in the number for the topping): " ); 
					topping=input.nextInt();
				}	
				
				//if topping chosen is 1 then it is chocolate chips
				if (topping==1)
				{
					t[i]=new ChocolateChips();
				}
				//if topping chosen is 2 then it is oreo crumbs
				else if (topping==2)
				{
					t[i]=new OreoCrumbs();
				}
				//if topping chosen is 3 then it is chocolate syrup
				else if (topping==3)
				{
					t[i]=new ChocolateSyrup();
				}
				//if topping chosen is 4 then it is sprinkles
				else if (topping==4)
				{
					t[i]=new Sprinkles();
				}
				//if topping chosen is 5 then it is strawberries
				else if (topping==5)
				{
					t[i]=new Strawberries();
				}
			}
			//order slip
			System.out.println("\nO R D E R  S L I P \n\nType: "+i1.getType() + "\n\nNumber of Scoops: " + numScoops+"\n\nFlavours Chosen:\n");
			//prints flavour 
			for (int i=0;i<ic.length;i++)
			{
				System.out.print((i+1)+".");
				ic[i].flavour();
			}
			//order slip for toppings 
			System.out.println("\nNumber of Toppings: " + numToppings+"\n\nToppings Chosen:\n");
			//prints toppings
			for (int i=0;i<t.length;i++)
			{
				System.out.print((i+1)+".");
				t[i].topping();
			}
			//number format
			NumberFormat money=NumberFormat.getCurrencyInstance();
			//cost
			cost=((i1.getCost1()+i1.getCost2())*1.13);
			//print total
			System.out.println("\n\nTotal: " + money.format(cost));	
			
			System.out.println("\n\nWould you like to exit the program (Y/N)?");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Taking you back to the main menu!");; 
			}
			
		}
		//if user chooses cone
		else if (type.equalsIgnoreCase("C"))
		{
			i1.setType("Cone");
			System.out.println("\n");
			i1.flavours();
			//ask user to enter number of scoops
			System.out.println("\nEnter number of scoops (price per scoop is $2.00 and limit of scoops is 5): ");
			numScoops=input.nextInt();
			//check for invalid input
			while (numScoops<=0||numScoops>5)
			{
				System.out.println("Invalid Number. Please re-enter number of scoops: ");
				numScoops=input.nextInt();
			}
			i1.setCost1(numScoops*2);
			//array for number of scoops
			IceCream ic[]=new IceCream[numScoops];
			System.out.println("\n");
			//for loop for flavour
			for (int i=0;i<ic.length;i++)
			{
				//ask user to enter flavour
				System.out.println("Enter flavour " + (i+1) + " (enter in the number for the flavour): " ); 
				flavour=input.nextInt();			
				while (flavour != 1 && flavour != 2 && flavour != 3 && flavour != 4 && flavour != 5)
				{
					System.out.println("Invalid Input! Try Again\nEnter flavour " + (i+1) + " (enter in the number for the flavour): " ); 
					flavour=input.nextInt();
				}	
				
				//if flavour is 1 then it is cookies and cream
				if (flavour==1)
				{
					ic[i]=new CookiesandCream();
				}
				//if flavour is 2 then flavour is Moose Tracks
				else if (flavour==2)
				{
					ic[i]=new MooseTracks();
				}
				//if flavour is 3 then the flavour cookie dough
				else if (flavour==3)
				{
					ic[i]=new CookieDough();
				}
				//if flavour is 4 then the flavour is chocolate 
				else if (flavour==4)
				{
					ic[i]=new Chocolate();
				}
				//if flavour is 5 then the flavour is vanilla
				else if (flavour==5)
				{
					ic[i]=new Vanilla();
				}
			}
			i1.toppings();
			//enter number of toppings 
			System.out.println("\nEnter number of toppings (price per topping is $0.50 and limit of toppings is 5): ");
			numToppings=input.nextInt();
			//check for invalid input 
			while (numToppings <= 0 || numToppings>5)
			{
				System.out.println("Invalid Number. Please re-enter number of topping: ");
				numToppings=input.nextInt();
			}
			i1.setCost2(numToppings*0.50);
			//array for number of toppings 
			IceCream t[]=new IceCream[numToppings];
			System.out.println("\n");
			//for loop for toppings 
			for (int i=0;i<t.length;i++)
			{
				System.out.println("Enter topping " + (i+1) + ": " ); 
				topping=input.nextInt();
				while (topping != 1 && topping != 2 && topping != 3 && topping != 4 && topping != 5)
				{
					System.out.println("Invalid Input! Try Again\nEnter topping " + (i+1) + " (enter in the number for the topping): " ); 
					topping=input.nextInt();
				}	
				
				//if topping chosen is 1 then it is chocolate chips
				if (topping==1)
				{
					t[i]=new ChocolateChips();
				}
				//if topping chosen is 2 then it is oreo crumbs
				else if (topping==2)
				{
					t[i]=new OreoCrumbs();
				}
				//if topping chosen is 3 then it is chocolate syrup
				else if (topping==3)
				{
					t[i]=new ChocolateSyrup();
				}
				//if topping chosen is 4 then it is sprinkles
				else if (topping==4)
				{
					t[i]=new Sprinkles();
				}
				//if topping chosen is 5 then it is strawberries
				else if (topping==5)
				{
					t[i]=new Strawberries();
				}
			}
			//order slip
			System.out.println("\nO R D E R  S L I P \n**********************************\nType: "+i1.getType() + "\n\nNumber of Scoops: " + numScoops+"\n\nFlavours Chosen:\n");
			//for loop for printing flavour
			for (int i=0;i<ic.length;i++)
			{
				System.out.print((i+1)+".");
				ic[i].flavour();
			}
			//print number of toppings 
			System.out.println("\nNumber of Toppings: " + numToppings+"\n\nToppings Chosen:\n");
			//for loop for toppings 
			for (int i=0;i<t.length;i++)
			{
				System.out.print((i+1)+".");
				t[i].topping();
			}
			//number format
			NumberFormat money=NumberFormat.getCurrencyInstance();
			//cost 
			cost=((i1.getCost1()+i1.getCost2())*1.13);
			//print cost
			System.out.println("\n\nTotal: " + money.format(cost));		
						
			System.out.println("**********************************\n\nWould you like to exit the program (Y/N)?");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Taking you back to the main menu!") ;
			}			
		}
		//else prints invalid input 
		else
		{
			System.out.println("Invalid Input");
		}
		
		}while (!type.equalsIgnoreCase("C")||!type.equalsIgnoreCase("B"));
	}

}
