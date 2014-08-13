/**
 * 
 */
package pathfinder.data.Effects.Actions;

import pathfinder.data.Effects.Effect;

/**
 * An {@link Effect} that occurs with a specific Action
 * @author Real Standard Studios - Matthew Meehan
 */
public class ActionEffect extends Effect {
	// The action that this bonus occurs for
	private String action;

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * The default constructor for Kryo
	 */
	public ActionEffect() {
		super();
		this.NameProperty().set("Action Effect");
	}

	/**
	 * @param val
	 * @param name
	 */
	public ActionEffect(int val, String name, String action) {
		super(val, name);
		this.action = action;
	}
	
	
}
