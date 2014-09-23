/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that adds a bonus to Combat Maneuver Bonus
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class CombatManeuverBonusEffect extends Effect {

	/**
	 * Default Constructor for Kryo
	 */
	public CombatManeuverBonusEffect() {
		super();
		this.getNameProperty().set("Combat Maneuver Bonus Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public CombatManeuverBonusEffect(int val, String name) {
		super(val, name);
	}
	
}
