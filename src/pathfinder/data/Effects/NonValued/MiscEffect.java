/**
 * 
 */
package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * An {@link Effect} of some kind with an uncategorizable value
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class MiscEffect extends Effect {
	private String effect;

	/**
	 * @return the effect
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * @param effect the effect to set
	 */
	public void setEffect(String benifit) {
		this.effect = benifit;
	}

	/**
	 * Constructor for Kryo
	 */
	public MiscEffect() {
		super();
		this.NameProperty().set("Misc Effect");
		this.effect = "";
	}

	/**
	 * @param Name The Name of the effect
	 * @param effect The effect as a string
	 */
	public MiscEffect(String name, String effect) {
		super(0, name);
		this.effect = effect;
	}
	
	
}
