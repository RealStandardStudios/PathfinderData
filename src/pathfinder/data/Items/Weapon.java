package pathfinder.data.Items;

/**
 * 
 * @author Who ever gets here Josh can you fill this out cause you did all the
 *         item things
 *         COOOOOOOOLLLL BROOOOOOOO ~ josh
 */
public class Weapon extends Item{
	private WeaponType weaponType;
	private String dmgS;
	private String dmgM;
	private String critical;
	private String range;
	private String type; //this revers to what damage type is is E.G Bashing, Percing or Slashing
	private String special;
	
	public String getSpecial() {
		return special;
	}


	public void setSpecial(String special) {
		this.special = special;
	}


	public WeaponType getWeaponType() {
		return weaponType;
	}


	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}


	public String getDmgS() {
		return dmgS;
	}


	public void setDmgS(String dmgS) {
		this.dmgS = dmgS;
	}


	public String getDmgM() {
		return dmgM;
	}


	public void setDmgM(String dmgM) {
		this.dmgM = dmgM;
	}


	public String getCritical() {
		return critical;
	}


	public void setCritical(String critical) {
		this.critical = critical;
	}


	public String getRange() {
		return range;
	}


	public void setRange(String range) {
		this.range = range;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public Weapon()
	{
		
	}
		
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