/**
 * 
 */
package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} of some kind with an uncategorizable value
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
	 * 
	 */
	public MiscEffect() {
		super();
		this.NameProperty().set("Misc Effect");
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
