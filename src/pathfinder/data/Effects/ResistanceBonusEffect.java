/**
 * 
 */
package pathfinder.data.Effects;

import pathfinder.data.Character.Resistance;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that adds a bonus to a {@link Resistance} type
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

	public ResistanceBonusEffect() {
		super();
	}

	public ResistanceBonusEffect(int val, String name, String resistanceName) {
		super(val, name);
		this.resistanceName = resistanceName;
	}
	
	
}
