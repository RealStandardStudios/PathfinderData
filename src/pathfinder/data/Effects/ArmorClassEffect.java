/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives a bonus of some kind to AC
 * @Author Real Standard Studios - Matthew Meehan
 */
public class ArmorClassEffect extends Effect {
	// as in dodge bonus
	private String bonusType;

	/**
	 * @return the bonusType
	 */
	public String getBonusType() {
		return bonusType;
	}

	/**
	 * @param bonusType the bonusType to set
	 */
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}

	/**
	 * Default Constructor for Kryo
	 */
	public ArmorClassEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public ArmorClassEffect(int val, String name, String bonusType) {
		super(val, name);
		this.bonusType = bonusType;
	}
	
}