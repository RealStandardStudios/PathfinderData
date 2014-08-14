package pathfinder.data.Classes.Objects;

import pathfinder.data.Effects.Effect;

/**
 * 
 * @author Matthew Meehan the generic Class Feature
 */
public class Feature {
	private String name;

	private String description;

	private Effect effect;

	public Effect getEffect() {
		return effect;
	}

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
