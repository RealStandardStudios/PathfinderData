/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that gives a bonus to a SaveAttribute
 */
public class SaveAttributeEffect extends Effect {

	/**
	 * The default Constructor for Kryo
	 */
	public SaveAttributeEffect() {
		super();
	}

	/**
	 * @param val
	 * @param name
	 */
	public SaveAttributeEffect(int val, String name) {
		super(val, name);
	}

}
