/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that adds a bonus to A Saving Throw
 */
public class SavingThrowEffect extends Effect {
	// What the bonus is applied against
	private String bonusVs;
	// When the bonus can be applied
	private String bonusType;
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
	 * @return the bonusType
	 */
	public String getBonusType() {
		return bonusType;
	}
	/**
	 * @param bonusType the bonusType to set
	 */
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	/**
	 * The default constructor for Kryo
	 */
	public SavingThrowEffect() {
		super();
	}
	/**
	 * @param val the value of the {@link Effect}
	 * @param name the name of the {@link Effect}
	 * @param bonusVs What the bonus is Against/to
	 * @param bonusType When the bonus is appied
	 */
	public SavingThrowEffect(int val, String name, String bonusVs, String bonusType) {
		super(val, name);
		this.bonusVs = bonusVs;
		this.bonusType = bonusType;
	}
	
}
