package pathfinder.data.Classes.Objects;

import pathfinder.data.Effects.Effect;

/**
 * The generic class for Features
 * 
 * @author Matthew Meehan
 */
public class Feature {
	private String name;

	private String description;

	private Effect effect;

	/**
	 * @return an effect
	 */
	public Effect getEffect() {
		return effect;
	}

	/**
	 * @param effect
	 */
	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Feature() {
	}

	/**
	 * @param Name
	 * @param description
	 */
	public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
