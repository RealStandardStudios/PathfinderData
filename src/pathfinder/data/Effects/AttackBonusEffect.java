package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives an attack bonus vs something
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class AttackBonusEffect extends Effect{
	private String bonusVs;
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
	 * Default Constructor for Kryo
	 */
	public AttackBonusEffect() { 
		super();
		this.getNameProperty().set("Attack Bonus Effect");
	}
	
	/**
	 * @param bonusVs
	 * @param bonusType
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public AttackBonusEffect(String bonusVs, String bonusType, int val, String name) {
		super(val, name);
		this.bonusVs = bonusVs;
		this.bonusType = bonusType;
	}

}
