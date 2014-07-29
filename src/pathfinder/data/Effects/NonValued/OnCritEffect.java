/**
 * 
 */
package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} That occurs when the player scores a Crit
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
	 * 
	 */
	public OnCritEffect() {
		super();
	}

	/**
	 * @param name The name of the effect
	 * @param effect The effect as a string
	 */
	public OnCritEffect(String name, String effect) {
		super(0, name);
		this.effect = effect;
	}
	
	
}
