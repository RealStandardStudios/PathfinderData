/**
 * 
 */
package pathfinder.data.Effects.Actions;


/**
 * An {@link ActionEffect} that lets you complete the specified action as a Swift action
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToSwiftEffect extends ActionEffect {
	private String specifiedAction;

	/**
	 * @return the specifiedAction
	 */
	public String getSpecifiedAction() {
		return specifiedAction;
	}

	/**
	 * @param specifiedAction the specifiedAction to set
	 */
	public void setSpecifiedAction(String specifiedAction) {
		this.specifiedAction = specifiedAction;
	}

	/**
	 * The default Constructor for Kryo
	 */
	public ActionToSwiftEffect() {
		super();
	}

	/**
	 * @param name The name of the Effect
	 * @param specifiedAction The Action that can be completed as a move action
	 */
	public ActionToSwiftEffect(String name, String specifiedAction) {
		super(0, name, "Swift");
		this.specifiedAction = specifiedAction;
	}
	
}
