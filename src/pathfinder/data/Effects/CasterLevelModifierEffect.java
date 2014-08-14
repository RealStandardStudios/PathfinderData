/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that adds a bonus for caster level in a given situation
 * @Author Real Standard Studios - Matthew Meehan
 */
public class CasterLevelModifierEffect extends Effect {
	private String bonusFor;

	/**
	 * @return the bonusFor
	 */
	public String getBonusFor() {
		return bonusFor;
	}

	/**
	 * @param bonusFor the bonusFor to set
	 */
	public void setBonusFor(String bonusFor) {
		this.bonusFor = bonusFor;
	}

	/**
	 * Default Constructor for Kryo
	 */
	public CasterLevelModifierEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 * @param bonusFor What the bonus is applied for
	 */
	public CasterLevelModifierEffect(int val, String name, String bonusFor) {
		super(val, name);
		this.bonusFor = bonusFor;
	}
}
