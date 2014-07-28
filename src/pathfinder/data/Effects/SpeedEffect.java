/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that adds a bonus to a Movement Speed
 */
public class SpeedEffect extends Effect {
	private String speedType;

	/**
	 * @return the speedType
	 */
	public String getSpeedType() {
		return speedType;
	}

	/**
	 * @param speedType the speedType to set
	 */
	public void setSpeedType(String speedType) {
		this.speedType = speedType;
	}

	/**
	 * The default constructor for Kryo
	 */
	public SpeedEffect() {
		super();
	}

	/**
	 * @param val The value of the bonus
	 * @param name The name of the Effect
	 * @param speedType The speed type that is Effected i.e. Swimming
	 */
	public SpeedEffect(int val, String name, String speedType) {
		super(val, name);
		this.speedType = speedType;
	}
	
	
}
