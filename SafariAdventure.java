/*
    Name: Evelyn Zuniga
    Project: Safari Adventure
    Date: 10/3/2026

*/
import java.util.Scanner; // for user input 
import java.util.Random; // to randomly select an event (learned how to use from GeeksforGeeks)

public class SafariAdventure
{
	public static void main(String[] args) 
	{
		int totalPoints = 0; // keeps track of points for all 5 days
	
		Scanner input = new Scanner(System.in); // initializes a new scanner object
		Random random = new Random(); // creates a new random object 
		
		System.out.println("🌄  Welcome to Safari Adventure!");
		
		for(int day = 1; day <= 5; day++) //represents 5 days of exploration 
		{
		    int dailyPoints = 0; // daily points are declared in the for loop so they can reset after each day
		    System.out.println("Day " + day +": ");
		    
		    String area; // represents the 4 area options
		    
		    //do while loop is inside for loop because each day the user needs to choose an area
		    do
		    {
		        System.out.print("Where would you like to explore?");
		        System.out.print("(Jungle, River, Desert, Mountains): ");
		        
		        area = input.nextLine(); // user input
		        
		        // if statement is for an error message such as the one in the Sample Interaction
		        // the equalsIgnoreCase() method compares two strings, ignoring lower and upper case differences (w3schools)
		        if (!area.equalsIgnoreCase("Jungle") &&
		            !area.equalsIgnoreCase("River") &&
		            !area.equalsIgnoreCase("Desert") &&
		            !area.equalsIgnoreCase("Mountains"))
		           {
		               System.out.println("Invalid area. Please choose again.");
		               
		           }
		   // the while statement is what let's the program go onto the next day
		    } while (!area.equalsIgnoreCase("Jungle") &&
		            !area.equalsIgnoreCase("River") &&
		            !area.equalsIgnoreCase("Desert") &&
		            !area.equalsIgnoreCase("Mountains"));
		  
    		  System.out.println();
    		  System.out.println("You chose: " + area);
    		  System.out.println("Exploring " + area + "...");
    		  System.out.println();
		  
    		int dailyEvent = 1;
		
		    while (dailyEvent <= 3) // 3 events happen each day 
		    {
    		    int possibleEvent;
    		    possibleEvent = random.nextInt(6); // 6 possible events, however only 3 actually happened 
    		    
    		    System.out.print("Event " + dailyEvent + ":");
		    
    		    // Jungle Events
    		    if (area.equalsIgnoreCase("Jungle")) 
    		    {

                    if (possibleEvent == 0) // this event give user points 
                    {
                        System.out.println("You found figs! (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 1) // this event give user points 
                    {
                        System.out.print("You discovered a palm tree 🌴 and found");
                        System.out.println(" hearts of palm (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 2) // this event give user points 
                    {
                        System.out.println("You found some nuts 🥜 (+15 points)");
                        System.out.println();
                        
                        dailyPoints += 15;
                        totalPoints += 15;
                    }

                    else if (possibleEvent == 3) 
                    {
                        System.out.println("You saw a heart shaped cloud 🩷☁️");
                        System.out.println("Sorry, no points earned");
                        System.out.println();

                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }

                    else if (possibleEvent == 4) //dangerous event 
                    {
                        System.out.println("A jaguar appears! 😧");
                        System.out.print("Type 'run' to escape: ");
                        

                        String escape = input.nextLine(); // used so user can type "run"

                        if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println();
                            System.out.println("You escaped safely! Ending the day early.");
                            
                            
                            break; // breaks out of event loop
                        }
                    }
                    
                    else //dangerous event 
                    {
                        System.out.println("An anoconda appears!");
                        System.out.print("Type 'run' to escape: ");
                        
                        
                        String escape = input.nextLine(); // used so user can type "run"
                        
                         if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println();
                            System.out.println("You escaped safely! Ending the day early.");
                            break; // breaks out of event loop
                        }
                    }
		        } // end of possible events for Jungle 
            
                // River Events  
                else if (area.equalsIgnoreCase("River")) 
                {

                    if (possibleEvent == 0)  // this event give user points 
                    {
                        System.out.println("You found edible berries 🫐! (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 1) // this event give user points 
                    {
                        System.out.print("You caught a fish 🐟 (+30 points)");
                        System.out.println();

                        dailyPoints += 30;
                        totalPoints += 30;
                    }

                    else if (possibleEvent == 2) // this event give user points 
                    {
                        System.out.println("You found gold 🪙 (+25 points)");
                        System.out.println();

                        dailyPoints += 25;
                        totalPoints += 25;
                    }

                    else if (possibleEvent == 3) 
                    {
                        System.out.println("You spotted a bird 🐦");
                        System.out.println("Sorry, no points earned");
                        System.out.println();

                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }

                    else if (possibleEvent == 4) //dangerous event 
                    {
                        System.out.println("A crocodile appears! 😱");
                        System.out.print("Type 'run' to escape: ");
                        

                        String escape = input.nextLine(); // used so user can type "run"

                        if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println();
                            System.out.println("You escaped safely! Ending the day early.");
                            System.out.println();
                            
                            break; // breaks out of event loop
                        }
                    }
                    
                    else //dangerous event 
                    {
                        System.out.println();
                        System.out.println("Oh no, it started flooding 🌊");
                        System.out.print("Type 'run' to escape: ");
                    
                        String escape = input.nextLine(); // used so user can type "run"
                        
                         if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println("You escaped safely! Ending the day early.");
                            break; // breaks out of event loop
                        }
                    }
                } // end of possible events for River
                
                // Desert Events
                else if (area.equalsIgnoreCase("Desert")) 
                {

                    if (possibleEvent == 0) // this event give user points 
                    {
                        System.out.println("You found some water 💧 (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 1) // this event give user points 
                    {
                        System.out.print("You found some shelter 🛖 (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 2) // this event give user points 
                    {
                        System.out.println("Yout found some fruit (+15 points)");
                        System.out.println();

                        dailyPoints += 15;
                        totalPoints += 15;
                    
                    }

                    else if (possibleEvent == 3) 
                    {
                        System.out.println("You spotted tumbleweed");
                        System.out.println("Sorry, no points earned");
                        System.out.println();

                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }

                    else if (possibleEvent == 4)
                    {
                        System.out.println("You spotted a small lizard 🦎");
                        System.out.println("Too small to track. Moving on.");
                        System.out.println();
                        
                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }
                    
                    else // dangerous event 
                    {
                        System.out.println("Oh no, quicksand 🏜️");
                        System.out.print("Type 'run' to escape: ");
                        
                        String escape = input.nextLine(); // used so user can type "run"
                        
                         if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println("You escaped safely! Ending the day early.");
                            break; // breaks out of event loop
                        }
                    }
                } // end of possible events for Desert
                
                // Mountain Events 
                else if (area.equalsIgnoreCase("Mountains")) 
                {

                    if (possibleEvent == 0) // this event give user points 
                    {
                        System.out.println("You found treasure 🪎 (+35 points)");
                        System.out.println();

                        dailyPoints += 35;
                        totalPoints += 35;
                    }

                    else if (possibleEvent == 1) // this event give user points 
                    {
                        System.out.print("You found some edible plants 🌿 (+20 points)");
                        System.out.println();

                        dailyPoints += 20;
                        totalPoints += 20;
                    }

                    else if (possibleEvent == 2) // this event give user points 
                    {
                        System.out.println("You found a cave to rest for a bit ⛰️ (+15 points)");
                        System.out.println();
                        
                        dailyPoints += 15;
                        totalPoints += 15;
                    }

                    else if (possibleEvent == 3) 
                    {
                        System.out.println("You spotted an insect 🦟");
                        System.out.println("Sorry, no points earned");
                        System.out.println();

                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }

                    else if (possibleEvent == 4)
                    {
                        System.out.println("You found a cool rock 🪨");
                        System.out.println("Sorry, no points earned");
                        System.out.println();
                        
                        dailyEvent++;
                        continue; // no points are earned, so program continues to next event 
                    }
                    
                    else //dangerous event 
                    {
                        System.out.println("️A bear appears! 🐻");
                        System.out.print("Type 'run' to escape: ");
                        
                        
                        String escape = input.nextLine(); // used so user can type "run"
                        
                         if (escape.equalsIgnoreCase("run")) 
                        {
                            System.out.println("You escaped safely! Ending the day early.");
                            break; // breaks out of event loop
                        }
                    }
                } // end of possible events for Mountains
                
                 dailyEvent++; // so that the event number actually changes
                
            } // end of while loop
		
		
    		 // daily summary
    		 // this will print out for each day
                System.out.println();
                System.out.print("Day " + day + " Summary:");
                System.out.println(dailyPoints + " points earned.");
                System.out.println("-----------------------------------");
                System.out.println();
        } // end of for loop


        // total summary
        
        System.out.println("🎉 Safari Complete!");
        System.out.println("You collected " +  totalPoints +" points!");

        if (totalPoints >= 100) 
        {
            System.out.println("You survived and completed the adventure!");
        }
        else 
        {
            System.out.println("Sorry :( you did not survive");
        }
        
        input.close();
	}
}
