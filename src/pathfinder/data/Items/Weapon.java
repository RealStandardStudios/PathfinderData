package pathfinder.data.Items;

/**
 * An {@link Item} that is considered a weapon
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Weapon extends Item{
	private WeaponType weaponType;
	private String dmgS;
	private String dmgM;
	private String critical;
	private String range;
	private String type; //this revers to what damage type is is E.G Bashing, Percing or Slashing
	private String special;
	
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
	 * @returns a WeaponType
	 */
	public WeaponType getWeaponType() {
		return weaponType;
	}

	/**
	 * @param weaponType
	 */
	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
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
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @param type
	 * @param special
	 */
	public Weapon(String name, String cost, String dmgS, String dmgM, String critical, String range, String weight, String type, String special)
	{
		this.setName(name);
		this.setCost(cost);
		this.setDmgS(dmgS);
		this.setDmgM(dmgM);
		this.setCritical(critical);
		this.setRange(range);
		this.setWeight(weight);
		this.setType(type);
		this.setSpecial(special);
	}
	
}