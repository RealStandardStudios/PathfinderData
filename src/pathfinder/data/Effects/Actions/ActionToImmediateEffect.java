/**
 * 
 */
package pathfinder.data.Effects.Actions;


/**
 * An {@link ActionEffect} that lets you complete the specified action as an Immediate action
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToImmediateEffect extends ActionEffect {
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
	public ActionToImmediateEffect() {
		super();
	}

	/**
	 * @param name The name of the Effect
	 * @param specifiedAction The Action that can be completed as a move action
	 */
	public ActionToImmediateEffect(String name, String specifiedAction) {
		super(0, name, "Immediate");
		this.specifiedAction = specifiedAction;
	}
	
}
