/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that adds a bonus to Combat Maneuver Defense
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class CombatManeuverDefenseEffect extends Effect {
	private String bonusType;
	
	private String bonusVs;

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
	 * @return the bonusVs
	 */
	public String getBonusVs() {
		return bonusVs;
	}

	/**
	 * @param bonusVs the bonusVs to set
	 */
	public void setBonusVs(String bonusVs) {
		this.bonusVs = bonusVs;
	}

	/**
	 * Default Constructor for Kryo
	 */
	public CombatManeuverDefenseEffect() {
		super();
	}

	/**
	 * @param bonusType The type of bonus for the CMD
	 * @param bonusVs What the bonus is for/vs
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public CombatManeuverDefenseEffect(String bonusType, String bonusVs, int val, String name) {
		super(val, name);
		this.bonusType = bonusType;
		this.bonusVs = bonusVs;
	}
	
}
