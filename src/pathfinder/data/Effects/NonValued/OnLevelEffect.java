/**
 * 
 */
package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * An effect that occurs on level up
 * @author RealStandardStudios - Matthew Meehan
 *
 */
public class OnLevelEffect extends Effect {
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
	public void setEffect(String effect) {
		this.effect = effect;
	}

	public OnLevelEffect() {
		super();
		this.getNameProperty().set("On Level effect");
	}

	/**
	 * @param val
	 * @param name
	 */
	public OnLevelEffect(int val, String name, String effect) {
		super(val, name);
		this.effect = effect;
	}

}
