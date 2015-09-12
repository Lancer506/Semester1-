package semester1;

import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String usertext = "";
        System.out.println("Welcome to the game!\n" + "Please enter your name: ");
        String username = input.nextLine();
        System.out.println("To play, type a command to respond to each scenario, then press enter.\n" + "Remember, you dont need to type out the whole sentance, just use key words, eg. fight, yell, punch.\n" + "Press enter to advance");
        usertext = input.nextLine();
        System.out.println("...A monsterous cyclops has approached, do something  fool!\n" + "Your commands are as follows: ");
        System.out.println("---------------------------");
        System.out.println("Fight!\n" + "Cry!\n" + "Throw dirt into the cyclops's eye!\n" + "Scream!!!");
        String weapon = "";
        boolean dead = false;
        while (!dead) {
            usertext = input.nextLine();
            if (usertext.toUpperCase().contains("GET")) {
                String[] words = usertext.split("\\s");
                if (words.length >= 2) {
                    weapon = words[1];
                }
                System.out.println("You picked up a " + weapon);
            } else if (usertext.toUpperCase().contains("FIGHT")) {
                System.out.println("You put up your fists and put on your best war face,\n" + "filled with confidance, you strike with all your might at the cyclops's knee!\n" + "The cyclops laughs as you tickle his knee, and he crushes you underfoot.");
                dead = true;
                break;
            } else if (usertext.toUpperCase().contains("CRY")) {
                System.out.println("The whole situation is just too much, you curl up in a ball and begin to sob.\n" + "The cyclops, in a mix of sympathy and distaste, shakes his head and wanders off");
                System.out.println("The crowd boos in shame..." + "You look around at the colloseum you are in and hear the grandmaster announce:");
                System.out.println("'Dispite that putrid display of unsportsmanship, " +username + " progresses to the next round!'");
                usertext = input.nextLine();
            } else if (usertext.toUpperCase().contains("THROW")) {
                System.out.println("You muster up your courage and throw some nearby dirt into its eye!\n" + "The cyclops screams as the dirt lands on target!\n" + "It stumbles forward, frantically flailing to grab ahold of something...\n" + "The monster then trips on a rock, sending his body flying your direction!\n" + "You try to doge out of the way, but you are crushed by the cyclops as it lands on top of you.");
                dead = true;
                break;
            } else if (usertext.toUpperCase().contains("SCREAM")) {
                System.out.println("You push all your emotions, love, hate, fear, strength, into your gut and prepare to give it your all.\n" + 
                "You release everything into what is surely to be your most manly war cry of all time!\n" + 
                "The high pitched screech that comes out of your mouth shakes the ground around you,");
                System.out.println("so cringingly high pitched and loud that glass breaks, and the cyclops gripping its ears,\n" + "falls to the ground limp...\n" + "You look around at the colloseum you are in and hear the grandmaster announce:\n" + "'It appears you have knocked out the cyclops using the most shamefull of all magic...\n" + "a power shriek...'");
                System.out.println("The crowd boos in shame...");
                usertext = input.nextLine();
                System.out.println("However, dispite that putrid display of unsportsmanship, " +username + " progresses to the next round!'");
            }else {
            	String death = "You died. Good Job.";
                if (dead) {
                    System.out.println(death);
                    System.out.println("Uhhh, thats not a command, try again.");  
            }
                System.out.println("'Fighters! Prepare for your next round, choose your weapons!'");
            System.out.println("A young squire appraches you carrying an array of weapons, he displays them to you for your selection\n" + "You choose your weapon carefully: ");
            System.out.println("Spear\n" + "Bronze sword\n" + "Cracked sheild and hachet\n" + "Leather shoe\n" + "Chainsaw");
            while (!dead) {
            } if (usertext.toUpperCase().contains("SPEAR")) {
            	System.out.println("You pick up the spear, gripping the shaft. 'This can't be that complicated' you think to yourself, looking down its length.\n");
            } else if (usertext.toUpperCase().contains("SWORD")) {
            	System.out.println("You take the bronze sword, examining the short blade. The grip feels odd in your hand, but at least its sharp.");
            } else if (usertext.toUpperCase().contains("SHEILD")) {
            	System.out.println("'Can't pass up a two for one!' You think to yourself as you take the half broken sheild and the small battle axe that has seen better days");
            } else if (usertext.toUpperCase().contains("SHOE")) {
            	System.out.println("'Mine as well die in style' You think to yourself as you admire the brown leather shoe. It was a nice shoe, but you doubt it could yeild much tactical value in the colloseum");
            } else if (usertext.toUpperCase().contains("CHAINSAW")) {
            	System.out.println("'A chainsaw! Obviously!' You think as you smile. 'No sword can beat this modern specticle!' You ponder as you feel the weight of the automatic saw on your arms.");
            }
            
            
            
        	}
            String death = "You died. Good Job.";
            if (dead) {
                System.out.println(death);
            }
        }
	}
}

