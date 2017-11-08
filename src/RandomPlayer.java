/**
 * 
 */

/**
 * @author gastu_000
 *
 */
public class RandomPlayer extends Player {

	/* (non-Javadoc)
	 * @see Player#generateRoshambo()
	 */
	@Override
	public int generateRoshambo() {
		
		return (int) (Math.random() * 3 +1);
	}

}
