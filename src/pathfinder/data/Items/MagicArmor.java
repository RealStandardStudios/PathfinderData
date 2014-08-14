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
	
	
	public MagicArmor(String baseArmor, String name, String slot,
			String strength, String caster, String price, String weight, String description, String construction)
	{
		Armor armor = new Armor();//Fix this when you know how to josh
		this.setName(name);
		this.setSlot(slot);
		this.setAuraStrength(strength);
		this.setCasterLevel(caster);
		this.setCost(price);
		this.setWeight(weight);
		this.setDescription(description);
		this.setConstruction(construction);
	}	
}
