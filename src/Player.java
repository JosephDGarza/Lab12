/**
 * 
 */

/**
 * @author gastu_000
 *
 */
public abstract class Player {
	private String name;
	private int roshambo;
	public abstract int generateRoshambo();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoshambo() {
		return roshambo;
	}
	public void setRoshambo(int roshambo) {
		this.roshambo = roshambo;
	}
		
		 
	

}
