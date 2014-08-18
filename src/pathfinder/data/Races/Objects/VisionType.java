package pathfinder.data.Races.Objects;

/**
 * A class that determines the different levels of alternate vision of races
 * in Pathfinder
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class VisionType {
	private int distance;
	private String name;
	
	/**
	 * @returns an int
	 */
	public int getDistance() {
		return distance;
	}
	
	/**
	 * @param distance
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	/**
	 * @returns a String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * constructor for Kryo
	 */
	public VisionType() {
		
	}
	
	/**
	 * @param distance
	 * @param name
	 */
	public VisionType(int distance, String name) {
		super();
		this.distance = distance;
		this.name = name;
	}
}