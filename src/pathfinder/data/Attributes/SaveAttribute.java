package pathfinder.data.Attributes;

/**
 * The SaveAttribute class handles Fortitude, Reflex and Will saving throw
 * information
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SaveAttribute {
	private String attributeName;
	private int baseValue;
	private int total;
	private int magicMod;
	private int miscMod;
	private Ability abilityScore;

	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName
	 *            the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * @return the baseValue
	 */
	public int getBaseValue() {
		return baseValue;
	}

	/**
	 * @param baseValue
	 *            the baseValue to set
	 */
	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Collects information from getModifier, magicMod & miscMod and totals them
	 * in total
	 */
	public void setTotal() {
		this.total = this.abilityScore.getModifier() + this.magicMod
				+ this.miscMod;
	}

	/**
	 * @return the magicMod
	 */
	public int getMagicMod() {
		return magicMod;
	}

	/**
	 * @param magicMod
	 *            the magicMod to set
	 */
	public void setMagicMod(int magicMod) {
		this.magicMod = magicMod;
	}

	/**
	 * @return the miscMod
	 */
	public int getMiscMod() {
		return miscMod;
	}

	/**
	 * @param miscMod
	 *            the miscMod to set
	 */
	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}

	/**
	 * Empty constructor for Kryo
	 */
	public SaveAttribute() {
	}

	/**
	 * Constructor for SaveAttribute
	 * @param pAbility the ability relevant to the Save Attribute 
	 * @param baseValue the base value of the Save Attribute
	 * @param magicMod the magical modifier of the Save Attribute
	 * @param miscMod the Misc. modifier for the Save Attribute
	 */
	public SaveAttribute(Ability pAbility, int baseValue, int magicMod,
			int miscMod) {
		this.baseValue = baseValue;
		this.magicMod = magicMod;
		this.miscMod = miscMod;
		this.abilityScore = pAbility;
		this.setTotal();
	}

}
