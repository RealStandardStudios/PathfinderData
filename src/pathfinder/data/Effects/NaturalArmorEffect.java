/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that adds a bonus to AC through Natural Armor
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class NaturalArmorEffect extends Effect {

	/**
	 * Default Constructor for Kryo
	 */
	public NaturalArmorEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public NaturalArmorEffect(int val, String name) {
		super(val, name);
	}
	
}
