package pathfinder.data.Items;

import pathfinder.data.Items.Weapon;

public class MagicWeapon extends Weapon{
	private String auraStrength;
	private String casterLevel;
	private String description;
	private String construction;
	
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


}
