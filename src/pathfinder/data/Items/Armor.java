package pathfinder.data.Items;

public class Armor extends Item {
	private ArmorType armorType;
	private int armorBonus;
	private int maxDexBonus;
	private int armorCheckPenalty;
	private int arcaneSpellFailiure;
	private int speed30feet;
	private int speed20feet;

	public void setArmorType(ArmorType armorType) {
		this.armorType = armorType;
	}

	public void setArmorBonus(int armorBonus) {
		this.armorBonus = armorBonus;
	}

	public void setMaxDexBonus(int maxDexBonus) {
		this.maxDexBonus = maxDexBonus;
	}

	public void setArmorCheckPenalty(int armorCheckPenalty) {
		this.armorCheckPenalty = armorCheckPenalty;
	}

	public void setArcaneSpellFailiure(int arcaneSpellFailiure) {
		this.arcaneSpellFailiure = arcaneSpellFailiure;
	}

	public void setSpeed30feet(int speed30feet) {
		this.speed30feet = speed30feet;
	}

	public void setSpeed20feet(int speed20feet) {
		this.speed20feet = speed20feet;
	}

	/**
	 * @return the armorType
	 */
	public ArmorType getArmorType() {
		return armorType;
	}

	/**
	 * @return the armorBonus
	 */
	public int getArmorBonus() {
		return armorBonus;
	}

	/**
	 * @return the maxDexBonus
	 */
	public int getMaxDexBonus() {
		return maxDexBonus;
	}

	/**
	 * @return the armorCheckPenalty
	 */
	public int getArmorCheckPenalty() {
		return armorCheckPenalty;
	}

	/**
	 * @return the arcaneSpellFailiure
	 */
	public int getArcaneSpellFailiure() {
		return arcaneSpellFailiure;
	}

	/**
	 * @return the speed30feet
	 */
	public int getSpeed30feet() {
		return speed30feet;
	}

	/**
	 * @return the speed20feet
	 */
	public int getSpeed20feet() {
		return speed20feet;
	}


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
	public Armor(String name, ArmorType armorType, String cost, int armorBonus,
			int maxDexBonus, int armorCheckPenalty, int arcaneSpellFailiure,
			int speed30feet, int speed20feet, String weight) {
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