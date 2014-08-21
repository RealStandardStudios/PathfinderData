package pathfinder.data.Items;

/**
 * An {@link Item} that is considered Armour
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Armor extends Item {
	private String armorType;
	private String armorBonus;
	private String maxDexBonus;
	private String armorCheckPenalty;
	private String arcaneSpellFailiure;
	private String speed30feet;
	private String speed20feet;

	/**
	 * @param armorType
	 */
	public void setArmorType(String  armorType) {
		this.armorType = armorType;
	}

	/**
	 * @param armorBonus
	 */
	public void setArmorBonus(String armorBonus) {
		this.armorBonus = armorBonus;
	}

	/**
	 * @param maxDexBonus
	 */
	public void setMaxDexBonus(String maxDexBonus) {
		this.maxDexBonus = maxDexBonus;
	}

	/**
	 * @param armorCheckPenalty
	 */
	public void setArmorCheckPenalty(String armorCheckPenalty) {
		this.armorCheckPenalty = armorCheckPenalty;
	}

	/**
	 * @param arcaneSpellFailiure
	 */
	public void setArcaneSpellFailiure(String arcaneSpellFailiure) {
		this.arcaneSpellFailiure = arcaneSpellFailiure;
	}

	/**
	 * @param speed30feet
	 */
	public void setSpeed30feet(String speed30feet) {
		this.speed30feet = speed30feet;
	}

	/**
	 * @param speed20feet
	 */
	public void setSpeed20feet(String speed20feet) {
		this.speed20feet = speed20feet;
	}

	/**
	 * @return the armorType
	 */
	public String  getArmorType() {
		return armorType;
	}

	/**
	 * @return the armorBonus
	 */
	public String getArmorBonus() {
		return armorBonus;
	}
	
	/**
	 * @return the armorBonusAsAInt
	 */
	public int getArmorBonusInt() {
		int armorBonusAsInt = Integer.parseInt(armorBonus);
		return armorBonusAsInt;
	}

	/**
	 * @return the maxDexBonus
	 */
	public String getMaxDexBonus() {
		return maxDexBonus;
	}

	/**
	 * @return the armorCheckPenalty
	 */
	public String getArmorCheckPenalty() {
		return armorCheckPenalty;
	}

	/**
	 * @return the arcaneSpellFailiure
	 */
	public String getArcaneSpellFailiure() {
		return arcaneSpellFailiure;
	}

	/**
	 * @return the speed30feet
	 */
	public String getSpeed30feet() {
		return speed30feet;
	}

	/**
	 * @return the speed20feet
	 */
	public String getSpeed20feet() {
		return speed20feet;
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Armor() {
	}

	/**
	 * @param armorType
	 * @param cost
	 * @param armorBonus
	 * @param maxDexBonus
	 * @param armorCheckPenalty
	 * @param arcaneSpellFailiure
	 * @param speed30feet
	 * @param speed20feet
	 * @param weight
	 */
	public Armor(String  name, String armorType, String  cost, String armorBonus,
			String maxDexBonus, String armorCheckPenalty, String arcaneSpellFailiure,
			String speed30feet, String speed20feet, String  weight) {
		super(name,cost,weight);
		this.armorType = armorType;
		this.armorBonus = armorBonus;
		this.maxDexBonus = maxDexBonus;
		this.armorCheckPenalty = armorCheckPenalty;
		this.arcaneSpellFailiure = arcaneSpellFailiure;
		this.speed30feet = speed30feet;
		this.speed20feet = speed20feet;
	}
}