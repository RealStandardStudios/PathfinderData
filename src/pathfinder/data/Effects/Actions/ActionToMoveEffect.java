/**
 * 
 */
package pathfinder.data.Effects.Actions;


/**
 * An {@link ActionEffect} that lets you complete the specified action as a Move action
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionToMoveEffect extends ActionEffect {
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
	public ActionToMoveEffect() {
		super();
		this.NameProperty().set("Action to Move Effect");
	}

	/**
	 * @param Name The Name of the Effect
	 * @param specifiedAction The Action that can be completed as a move action
	 */
	public ActionToMoveEffect(String name, String specifiedAction) {
		super(0, name, "Move");
		this.specifiedAction = specifiedAction;
	}
	
}
