package pathfinder.data.Items;


/**
 * An {@link Weapon} that is considered magical.
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class MagicWeapon extends Weapon{
	private String auraStrength;
	private String casterLevel;
	private String description;
	private String construction;
	
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
	public MagicWeapon()
	{
		
	}
	
	/**
	 * @param weapon
	 * @param name
	 * @param auraStr
	 * @param cl
	 * @param price
	 * @param weight
	 * @param description
	 * @param construction
	 */
	public MagicWeapon(Weapon weapon, String name, String auraStr, 
			String cl, String price, String weight, String description, 
			String construction) 
	{ 
		super(name, weapon.getWieldStyle(), weapon.getWeaponType(), price, weapon.getDmgS(), weapon.getDmgM(), weapon.getCritical(),
				weapon.getRange(), weight, weapon.getWeaponDmgType(), weapon.getSpecial());
		
		this.setAuraStrength(auraStr);
		this.setCasterLevel(cl);
		this.setDescription(description);
		this.setConstruction(construction);
		
	}

}
