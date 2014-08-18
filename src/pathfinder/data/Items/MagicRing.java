package pathfinder.data.Items;

/**
 * An {@link Item} that is considered a magic ring
 * 
 * @author Real Standard Studios
 */
public class MagicRing extends Item {

	private String auraStrength;
	private String casterLevel;
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
	 * a constructor for Kryo
	 */
	public MagicRing()
	{
		
	}
	
	/**
	 * @param name
	 * @param aura
	 * @param cl
	 * @param price
	 * @param description
	 * @param construction
	 */
	public MagicRing(String name, String aura, String cl, String price,
			String description, String construction)
	{
		super(name, price, "-");
		//rings do not have a weight, so a "-" is sent instead
		this.setAuraStrength(aura);
		this.setCasterLevel(cl);
		this.setConstruction(construction);
		this.setDescription(description);
	}
	
}
