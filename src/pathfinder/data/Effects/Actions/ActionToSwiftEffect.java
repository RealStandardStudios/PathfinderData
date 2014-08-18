/**
 * 
 */
package pathfinder.data.Effects.Actions;


/**
 * An {@link ActionEffect} that lets you complete the specified action as a Swift action
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToSwiftEffect extends ActionEffect {

	/**
	 * The default Constructor for Kryo
	 */
	public ActionToSwiftEffect() {
		super();
		this.NameProperty().set("Action To Swift Effect");
	}

	/**
	 * @param Name The Name of the Effect
	 * @param specifiedAction The Action that can be completed as a move action
	 */
	public ActionToSwiftEffect(String name, String specifiedAction) {
		super(0, name, specifiedAction);
	}
	
}
