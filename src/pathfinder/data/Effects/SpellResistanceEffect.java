/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that adds a bonus to a {@link Skill}
 */
public class SpellResistanceEffect extends Effect {
	private String bonusVs;

	/**
	 * @return the bonusVs
	 */
	public String getBonusVs() {
		return bonusVs;
	}

	/**
	 * @param bonusVs the bonusVs to set
	 */
	public void setBonusVs(String bonusVs) {
		this.bonusVs = bonusVs;
	}

	/**
	 * The default constructor for Kryo
	 */
	public SpellResistanceEffect() {
		super();
	}

	/**
	 * @param val The value of the bonus
	 * @param name The name of the Effect
	 * @param bonusVs What the bonus is Against/For
	 */
	public SpellResistanceEffect(int val, String name, String bonusVs) {
		super(val, name);
		this.bonusVs = bonusVs;
	}
	
	
}
