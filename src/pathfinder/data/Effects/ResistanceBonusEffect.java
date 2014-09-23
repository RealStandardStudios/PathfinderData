/**
 * 
 */
package pathfinder.data.Effects;

import pathfinder.data.Character.Resistance;

/**
 * An {@link Effect} that adds a bonus to a {@link Resistance} type
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class ResistanceBonusEffect extends Effect {
	private String resistanceName;

	/**
	 * @return the resistanceName
	 */
	public String getResistanceName() {
		return resistanceName;
	}

	/**
	 * @param resistanceName the resistanceName to set
	 */
	public void setResistanceName(String resistanceName) {
		this.resistanceName = resistanceName;
	}

	/**
	 * Default Constructor for Kryo
	 */
	public ResistanceBonusEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 * @param resistanceName The Name of the Applicable Resistance
	 */
	public ResistanceBonusEffect(int val, String name, String resistanceName) {
		super(val, name);
		this.resistanceName = resistanceName;
	}
	
	
}
