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
	public CombatManeuverDefenseEffect() {
		super();
	}

	/**
	 * @param bonusType The type of bonus for the CMD
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public CombatManeuverDefenseEffect(String bonusType, int val, String name) {
		super(val, name);
		this.bonusType = bonusType;
	}
	
}
