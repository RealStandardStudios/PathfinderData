package pathfinder.data.Items;

/**
 * An {@link Item} that is considered a weapon
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Weapon extends Item{
	private String wieldStyle;
	private String dmgS;
	private String dmgM;
	private String critical;
	private String range;
	private String weaponDmgType; //this revers to what damage weaponDmgType is is E.G Bashing, Percing or Slashing
	private String special;
	private String weaponType;
	
	/**
	 * @returns a String
	 */
	public String getWeaponType() {
		return weaponType;
	}

	/**
	 * @param weaponType
	 */
	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	/**
	 * @returns a String
	 */
	public String getSpecial() {
		return special;
	}

	/**
	 * @param special
	 */
	public void setSpecial(String special) {
		this.special = special;
	}

	/**
	 * @returns a String
	 */
	public String getWieldStyle() {
		return wieldStyle;
	}

	/**
	 * @param wieldStyle
	 */
	public void setWieldStyle(String wieldStyle) {
		this.wieldStyle = wieldStyle;
	}

	/**
	 * @returns a String
	 */
	public String getDmgS() {
		return dmgS;
	}

	/**
	 * @param dmgS
	 */
	public void setDmgS(String dmgS) {
		this.dmgS = dmgS;
	}

	/**
	 * @returns a String
	 */
	public String getDmgM() {
		return dmgM;
	}

	/**
	 * @param dmgM
	 */
	public void setDmgM(String dmgM) {
		this.dmgM = dmgM;
	}

	/**
	 * @returns a String
	 */
	public String getCritical() {
		return critical;
	}

	/**
	 * @param critical
	 */
	public void setCritical(String critical) {
		this.critical = critical;
	}

	/**
	 * @returns a String
	 */
	public String getRange() {
		return range;
	}

	/**
	 * @param range
	 */
	public void setRange(String range) {
		this.range = range;
	}

	/**
	 * @returns a String
	 */
	public String getWeaponDmgType() {
		return weaponDmgType;
	}

	/**
	 * @param weaponDmgType
	 */
	public void setWeaponDmgType(String weaponDmgType) {
		this.weaponDmgType = weaponDmgType;
	}
	
	/**
	 * constructor for Kryo
	 */
	public Weapon()
	{
		
	}
		
	/**
	 * @param name
	 * @param cost
	 * @param dmgS
	 * @param dmgM
	 * @param critical
	 * @param range
	 * @param weight
	 * @param weaponDmgType
	 * @param special
	 */
	public Weapon(String name, String wieldStyle, String weaponType, String cost, String dmgS,
					String dmgM, String critical, String range, String weight, String weaponDmgType, String special)
	{
		super(name, cost, weight);
		this.setWieldStyle(wieldStyle);
		this.setWeaponType(weaponType);
		this.setDmgS(dmgS);
		this.setDmgM(dmgM);
		this.setCritical(critical);
		this.setRange(range);
		this.setWeaponDmgType(weaponDmgType);
		this.setSpecial(special);
	}
	
}