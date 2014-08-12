package pathfinder.data.Items;

public class CursedItem extends Item {
	
	private String auraStrength;
	private String casterLevel;
	private String slot;
	private String description;
	private String construction;
	/**
	 * @return the auraStrength
	 */
	public String getAuraStrength() {
		return auraStrength;
	}
	/**
	 * @param auraStrength the auraStrength to set
	 */
	public void setAuraStrength(String auraStrength) {
		this.auraStrength = auraStrength;
	}
	/**
	 * @return the casterLevel
	 */
	public String getCasterLevel() {
		return casterLevel;
	}
	/**
	 * @param casterLevel the casterLevel to set
	 */
	public void setCasterLevel(String casterLevel) {
		this.casterLevel = casterLevel;
	}
	/**
	 * @return the slot
	 */
	public String getSlot() {
		return slot;
	}
	/**
	 * @param slot the slot to set
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the construction
	 */
	public String getConstruction() {
		return construction;
	}
	/**
	 * @param construction the construction to set
	 */
	public void setConstruction(String construction) {
		this.construction = construction;
	}
	
	public CursedItem()
	{
		
	}
	public CursedItem(String name,String aura, String casterLevel, String slot, String weight,
			String description, String construction)
	{
		super(name, "-", weight);
		//price is set to "-" due to the nature of cursed items not having a cost to make
		this.setAuraStrength(aura);
		this.setCasterLevel(casterLevel);
		this.setConstruction(construction);
		this.setDescription(description);
		this.setSlot(slot);
	}
}
