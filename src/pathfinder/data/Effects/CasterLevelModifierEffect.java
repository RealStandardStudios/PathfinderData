/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that adds a bonus for caster level in a given situation
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

	public CasterLevelModifierEffect() {
		super();
	}

	public CasterLevelModifierEffect(int val, String name, String bonusFor) {
		super(val, name);
		this.bonusFor = bonusFor;
	}
}
