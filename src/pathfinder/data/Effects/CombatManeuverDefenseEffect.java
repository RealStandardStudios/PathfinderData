/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that adds a bonus to Combat Maneuver Defense
 * @Author Real Standard Studios - Matthew Meehan
 */
public class CombatManeuverDefenseEffect extends Effect {

	/**
	 * Default Constructor for Kryo
	 */
	public CombatManeuverDefenseEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public CombatManeuverDefenseEffect(int val, String name) {
		super(val, name);
	}
	
}
