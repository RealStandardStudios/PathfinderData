package pathfinder.data.Items;

/**
 * An {@link Item} that is considered a wonderous item
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class WondrousGood extends Item{

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
	
	/**
	 * constructor for Kryo
	 */
	public WondrousGood() {
		
	}
	
	/**
	 * @param name
	 * @param auraStrength
	 * @param casterLevel
	 * @param slot
	 * @param price
	 * @param weight
	 * @param description
	 * @param construction
	 */
	public WondrousGood(String name, String auraStrength, String casterLevel, String slot,
			String price, String weight, String description, String construction) {
		super(name, price, weight);
		this.setAuraStrength(auraStrength);
		this.setCasterLevel(casterLevel);
		this.setConstruction(construction);
		this.setDescription(description);
		this.setSlot(slot);
	}
	
	
}
