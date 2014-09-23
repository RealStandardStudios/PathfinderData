/**
 * 
 */
package pathfinder.data.Effects.Actions;

/**
<<<<<<< HEAD
 * An {@link ActionEffect} that lets you complete the specified action as a Free
 * action
=======
 * An {@link ActionEffect} that lets you complete the specified action as a Free action
>>>>>>> branch 'master' of https://github.com/RealStandardStudios/PathfinderData.git
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToFreeEffect extends ActionEffect {

	/**
	 * The default Constructor for Kryo
	 */
	public ActionToFreeEffect() {
		super();
		this.getNameProperty().set("Action To Free Effect");
	}

	/**
	 * @param Name
	 *            The Name of the Effect
	 * @param specifiedAction
	 *            The Action that can be completed as a move action
	 */
	public ActionToFreeEffect(String name, String specifiedAction) {
		super(0, name, specifiedAction);
	}

}
