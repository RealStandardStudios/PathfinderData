package pathfinder.data.Attributes;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * The SaveAttribute class handles Fortitude, Reflex and Will saving throw
 * information
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SaveAttribute {
	private String attributeName;
	private ObjectProperty<Integer> baseValue;
	private int total;
	private int magicMod;
	private int miscMod;
	private Ability abilityScore;
	private AbilityName abilityName;

	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	public ObjectProperty<Integer> getBaseValueProperty() {
		return this.baseValue;
	}

	/**
	 * @return the baseValue
	 */
	public int getBaseValue() {
		return baseValue.get();
	}

	/**
	 * @param baseValue the baseValue to set
	 */
	public void setBaseValue(int baseValue) {
		this.baseValue.set(baseValue);
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
	 * @param magicMod the magicMod to set
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
	 * @param miscMod the miscMod to set
	 */
	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}

	public AbilityName getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(AbilityName abilityName) {
		this.abilityName = abilityName;
	}

	/**
	 * Empty constructor for Kryo
	 */
	public SaveAttribute() {
	}

	/**
	 * Constructor for SaveAttribute
	 * 
	 * @param pAbility the ability relevant to the Save Attribute 
	 * @param baseValue the base value of the Save Attribute
	 * @param magicMod the magical modifier of the Save Attribute
	 * @param miscMod the Misc. modifier for the Save Attribute
	 */
	public SaveAttribute(Ability pAbility, int baseValue, int magicMod,
			int miscMod) {
		this.baseValue = new SimpleObjectProperty<Integer>(baseValue);
		this.magicMod = magicMod;
		this.miscMod = miscMod;
		this.abilityScore = pAbility;
		this.setTotal();
	}
	
	/**
	 * Constructor for SaveAttribute
	 * 
	 * @param pAbility the {@link AbilityName} relevant to the Save Attribute 
	 * @param baseValue the base value of the Save Attribute
	 */
	public SaveAttribute(String name, AbilityName pAbility, int baseValue) {
		this.attributeName = name;
		this.abilityName = pAbility;
	}

}
