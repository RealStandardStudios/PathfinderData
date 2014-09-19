package pathfinder.data.Items;


/**
 * An {@link Armor} that is considered magical.
 * 
 * @author Real Standard Studios - Joahua Boyd
 */
public class MagicArmor extends Armor 
{
	private String slot;
	private String auraStrength;
	private String casterLevel;
	private String description;
	private String construction;
	
	/**
	 * @returns a String
	 */
	public String getSlot() {
		return slot;
	}
	
	/**
	 * @param slot
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}
	
	/**
	 * @returns a String
	 */
	public String getAuraStrength() {
		return auraStrength;
	}
	
	/**
	 * @param auraStrength
	 */
	public void setAuraStrength(String auraStrength) {
		this.auraStrength = auraStrength;
	}
	
	/**
	 * @returns a String
	 */
	public String getCasterLevel() {
		return casterLevel;
	}
	
	/**
	 * @param casterLevel
	 */
	public void setCasterLevel(String casterLevel) {
		this.casterLevel = casterLevel;
	}
	
	/**
	 * @returns a String
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @returns a String
	 */
	public String getConstruction() {
		return construction;
	}
	
	/**
	 * @param construction
	 */
	public void setConstruction(String construction) {
		this.construction = construction;
	}
	
	/**
	 * a constructor for Kryo
	 */
	public MagicArmor() {
		
	}
	
	/**
	 * @param baseArmor
	 * @param name
	 * @param slot
	 * @param strength
	 * @param caster
	 * @param price
	 * @param weight
	 * @param description
	 * @param construction
	 */
	public MagicArmor(Armor baseArmor, String name, String slot,
			String strength, String caster, String price, String weight, String description, String construction)
	{
		super(name, baseArmor.getArmorType(), price, baseArmor.getArmorBonus(), baseArmor.getMaxDexBonus(),
				baseArmor.getArmorCheckPenalty(), baseArmor.getArcaneSpellFailiure(), baseArmor.getSpeed30feet(), baseArmor.getSpeed20feet(), weight);
		this.setSlot(slot);
		this.setAuraStrength(strength);
		this.setCasterLevel(caster);
		this.setDescription(description);
		this.setConstruction(construction);
	}	
}
