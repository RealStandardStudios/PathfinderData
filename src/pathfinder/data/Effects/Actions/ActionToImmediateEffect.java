/**
 * 
 */
package pathfinder.data.Effects.Actions;


/**
 * An {@link ActionEffect} that lets you complete the specified action as an Immediate action
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToImmediateEffect extends ActionEffect {

	/**
	 * The default Constructor for Kryo
	 */
	public ActionToImmediateEffect() {
		super();
	}

	/**
	 * @param Name The Name of the Effect
	 * @param specifiedAction The Action that can be completed as a move action
	 */
	public ActionToImmediateEffect(String name, String specifiedAction) {
		super(0, name, specifiedAction);
	}
	
}
