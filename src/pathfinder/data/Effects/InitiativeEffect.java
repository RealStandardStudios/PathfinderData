/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives a bonus to Initiative
 * @author Real Standard Studios - Matthew Meehan
 */
public class InitiativeEffect extends Effect {

	/**
	 * The Default Constructor for Kryo
	 */
	public InitiativeEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect} 
	 */
	public InitiativeEffect(int val, String name) {
		super(val, name);
	}
	
}
