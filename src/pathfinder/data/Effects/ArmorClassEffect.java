/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that gives a bonus of some kind to AC
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
	 * 
	 */
	public ArmorClassEffect() {
		super();
	}

	/**
	 * @param val
	 * @param name
	 */
	public ArmorClassEffect(int val, String name, String bonusType) {
		super(val, name);
		this.bonusType = bonusType;
	}
	
}
