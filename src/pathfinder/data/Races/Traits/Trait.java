package pathfinder.data.Races.Traits;

import pathfinder.data.FeatPrerequisite;
import pathfinder.data.Effects.Effect;

/**
 * 
 * @author Real Standard Studios - Joshua Boyd, Matthew Meehan
 * A generic type for extending all the traits from
 */
public abstract class Trait extends FeatPrerequisite {
	private Effect effect;	
	

	/**
	 * @return the effect
	 */
	public Effect getEffect() {
		return effect;
	}

	/**
	 * @param effect the effect to set
	 */
	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	/**
	 * The default constructor for Kryo
	 */
	public Trait() {
	}

	/**
	 * @param Name The Name of the trait
	 * @param effect The effect of the trait
	 */
	public Trait(String name, Effect effect) {
		this.Name.set(name);
		this.effect = effect;
	}
	
	
}
