/**
 * 
 */
package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * An {@link Effect} That occurs when the player scores a Crit
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class OnCritEffect extends Effect {
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
	 * constructor for Kryo
	 */
	public OnCritEffect() {
		super();
		this.NameProperty().set("On Crit Effect");
	}

	/**
	 * @param Name The Name of the effect
	 * @param effect The effect as a string
	 */
	public OnCritEffect(String name, String effect) {
		super(0, name);
		this.effect = effect;
	}
	
	
}
