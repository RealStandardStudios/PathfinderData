package pathfinder.data.Items;

import pathfinder.data.Items.Armor;

public class MagicArmor extends Armor 
{
	private String slot;
	private String auraStrength;
	private String casterLevel;
	private String description;
	private String construction;
	
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public String getAuraStrength() {
		return auraStrength;
	}
	public void setAuraStrength(String auraStrength) {
		this.auraStrength = auraStrength;
	}
	public String getCasterLevel() {
		return casterLevel;
	}
	public void setCasterLevel(String casterLevel) {
		this.casterLevel = casterLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getConstruction() {
		return construction;
	}
	public void setConstruction(String construction) {
		this.construction = construction;
	}
	
	
	public MagicArmor(Armor baseArmor, String name, String slot, String strength, String caster, int price, int weight, String description, String construction)
	{
		setValuesFromArmor(baseArmor);
		this.setName(name);
		this.setSlot(slot);
		this.setAuraStrength(strength);
		this.setCasterLevel(caster);
		this.setCost(price);
		this.setWeight(weight);
		this.setDescription(description);
		this.setConstruction(construction);
	}
	
	private void setValuesFromArmor(Armor baseArmor)
	{
		this.setArmorBonus(baseArmor.getArmorBonus());
		this.setArcaneSpellFailiure(baseArmor.getArcaneSpellFailiure());
		this.setArmorCheckPenalty(baseArmor.getArmorCheckPenalty());
		this.setArmorType(baseArmor.getArmorType());
		this.setMaxDexBonus(baseArmor.getMaxDexBonus());
		this.setSpeed20feet(baseArmor.getSpeed20feet());
		this.setSpeed30feet(baseArmor.getSpeed30feet());
		this.setWeight(baseArmor.getWeight());
	}
	
	
}
