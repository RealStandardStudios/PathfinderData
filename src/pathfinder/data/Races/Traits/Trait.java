package pathfinder.data.Races.Traits;

import pathfinder.data.Effects.Effect;

/**
 * 
 * @author Joshua Boyd
 * A generic type for extending all the traits from
 */
public abstract class Trait {
	private String name;
	private Effect effect;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * @param name The name of the trait
	 * @param effect The effect of the trait
	 */
	public Trait(String name, Effect effect) {
		this.name = name;
		this.effect = effect;
	}
	
	
}
