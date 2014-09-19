/**
 * 
 */
package pathfinder.data.Effects;

import pathfinder.data.Skill;

/**
 * An {@link Effect} that adds a bonus to a {@link Skill}
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SkillEffect extends Effect {
	// The Name of the skill that is effected
	String skillName;
	// The type of bonus this is
	String bonusType;
	// What the bonus is Vs I.e. +1 to identify evil hats
	String bonusVs;

	/**
	 * @return the skillName
	 */
	public String getSkillName() {
		return skillName;
	}

	/**
	 * @param skillName
	 *            the skillName to set
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/**
	 * @return the bonusType
	 */
	public String getBonusType() {
		return bonusType;
	}

	/**
	 * @param bonusType
	 *            the bonusType to set
	 */
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}

	/**
	 * @return the bonusVs
	 */
	public String getBonusVs() {
		return bonusVs;
	}

	/**
	 * @param bonusVs
	 *            the bonusVs to set
	 */
	public void setBonusVs(String bonusVs) {
		this.bonusVs = bonusVs;
	}

	/**
	 * The default constructor for Kryo
	 */
	public SkillEffect() {
		super();
		this.getNameProperty().set("Skill Effect");
	}

	/**
	 * @param val The value of the bonus
	 * @param Name The Name of the effect
	 * @param skillName The Name of the skill effected
	 * @param bonusType The type of bonus
	 * @param bonusVs What the bonus is Against/to
	 */
	public SkillEffect(int val, String name, String skillName,
			String bonusType) {
		super(val, name);
		this.skillName = skillName;
		this.bonusType = bonusType;
	}

}
