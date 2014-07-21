package pathfinder.data.Classes.Objects;

import pathfinder.data.Effect;

/**
 * 
 * @author Matthew Meehan
 * the generic Class Feature
 */
public abstract class Feature {
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Feature() { }
	
	/**
	 * @param name
         * @param description
	 */
	public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
