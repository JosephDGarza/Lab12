import java.util.Scanner;

import javax.xml.bind.Validator;

public class RoshamboApp {

	public static void main(String[] args) {
		Player human = new humanPlayer();
		Scanner scnr = new Scanner(System.in);
		int user;
		int enemy;
		int scoreKeeper = 0;
		int enemyScore = 0;
//		String changeOpp = "n";
		String cont = "y";
		// rock = 1
		// papper = 2
		// scissors = 3
		
		//1. Prompt player for name
		System.out.println("Please enter a name: ");
		
		
		//2.Get user input
		String name = scnr.nextLine();
		
		while (cont.equalsIgnoreCase("y")) {
		//4. Prompt user to select opponent
		System.out.println("Please select an opponent: (Rock or Random)");
		
		//5. Get user opponent input
		String opponent = scnr.nextLine();
		
//		while (cont.equalsIgnoreCase("y")) {
		//6. Prompt player to select Rock, paper or scissors
		System.out.println("Make your choice: Rock(1), paper(2), scissors(3): (Input only the correlating number!)");
		
		//7. Get user choice
		//TODO Replace with Enums later
//		String userSelection = scnr.nextLine();
//		human.generateRoshambo();
		
		//8. Display user choice
		user = human.generateRoshambo();
		System.out.println(name + "'s choice: "  + numToRoshambo(user));
		
		//9. Display opponents choice
		
		
		
		Player opponentPlayer = null;
		if (opponent.equalsIgnoreCase("rock")) {
			opponentPlayer = new RockPlayer();
		
		}
		else if (opponent.equalsIgnoreCase("random")) {
			opponentPlayer = new RandomPlayer();

		}
	
		enemy = opponentPlayer.generateRoshambo();
		
		System.out.println("Opponent's choice: " + numToRoshambo(enemy));
	
//		10. Display match results
		if (user == 1 && enemy == 2) {
		
		System.out.println("Paper beats rock, you lose ");
		enemyScore= enemyScore +1;
		
	}
	else if (user == 1 && enemy == 3) {
		System.out.println("Rock beats scissors, you win! ");
		scoreKeeper= scoreKeeper +1;
		
}
	else if (user == 1 && enemy == 1) {
		System.out.println("tie");
		
	}
	
	// paper values
	if (user == 2 && enemy == 1) {
		System.out.println("Paper beats rock, you win!");
		scoreKeeper= scoreKeeper +1;
		
	}
	else if (user == 2 && enemy == 2) {
		System.out.println("tie");
		
	}
	
	else if (user == 2 && enemy == 3) {
		System.out.println("Scissors beats paper, you lose");
		enemyScore= enemyScore +1;
		
	}
	// scissor values
	
	if (user == 3 && enemy == 1) {
		System.out.println("Rock beats scissors, you lose ");
		enemyScore= enemyScore +1;
		
	}
	else if (user == 3 && enemy == 2) {
		System.out.println("Scissors beats paper, you win! ");
		scoreKeeper= scoreKeeper +1;
		
	}
	else if (user ==3 && enemy == 3) {
		System.out.println("tie");
		
	}
//		getResults(user, enemy, scoreKeeper, enemyScore, name);
	
		System.out.println(name + "'s score: "  + scoreKeeper);
		System.out.println("Opponent's score: " + enemyScore);
		cont = Validators.getString(scnr, "Would you like to continue playing?  (y/n)");
		
		}
//		cont = Validators.getString(scnr, "Would you like to continue playing? (y/n)");
//		}
		System.out.println("Thanks for playing!");
		scnr.close();
		
	}

//	private static int getResults(int user, int enemy, int scoreKeeper, int enemyScore, String name) {
//		// rock = 1
//		// paper = 2
//		// scissors = 3
//		
//		// rock values
//		if (user == 1 && enemy == 2) {
//			
//			System.out.println("Paper beats rock, you lose ");
//			enemyScore= enemyScore +1;
//			return enemyScore;
//		}
//		else if (user == 1 && enemy == 3) {
//			System.out.println("Rock beats scissors, you win! ");
//			scoreKeeper= scoreKeeper +1;
//			return scoreKeeper;
//	}
//		else if (user == 1 && enemy == 1) {
//			System.out.println("tie");
//			return scoreKeeper;
//		}
//		
//		// paper values
//		if (user == 2 && enemy == 1) {
//			System.out.println("Paper beats rock, you win!");
//			scoreKeeper= scoreKeeper +1;
//			return scoreKeeper;
//		}
//		else if (user == 2 && enemy == 2) {
//			System.out.println("tie");
//			return scoreKeeper;
//		}
//		
//		else if (user == 2 && enemy == 3) {
//			System.out.println("Scissors beats paper, you lose");
//			enemyScore= enemyScore +1;
//			return enemyScore;
//		}
//		// scissor values
//		
//		if (user == 3 && enemy == 1) {
//			System.out.println("Rock beats scissors, you lose ");
//			enemyScore= enemyScore +1;
//			return enemyScore;
//		}
//		else if (user == 3 && enemy == 2) {
//			System.out.println("Scissors beats paper, you win! ");
//			scoreKeeper= scoreKeeper +1;
//			return scoreKeeper;
//		}
//		else if (user ==3 && enemy == 3) {
//			System.out.println("tie");
//			return scoreKeeper;
//		}
//		
//	return scoreKeeper;
//	}
	
	private static String numToRoshambo(int num) {
		String converter = " ";
		if (num == 1) {
			converter = "rock";
		}
		if (num == 2) {
			converter = "paper";
		}
		if (num == 3) {
			converter = "scissors";
		}
		
		return converter;
	}

}
