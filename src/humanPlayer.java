import java.util.Scanner;

/**
 * 
 */

/**
 * @author gastu_000
 *
 */
public class humanPlayer extends Player {
Scanner scnr = new Scanner(System.in);


@Override
public int generateRoshambo() {
	
	return scnr.nextInt();
}
}


