package pathfinder.data.Items;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * An {@link Item} that is considered a weapon
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Weapon extends Item{
	private StringProperty wieldStyle;
	private StringProperty dmgS;
	private StringProperty dmgM;
	private StringProperty critical;
	private StringProperty range;
	private StringProperty weaponDmgType; //this revers to what damage weaponDmgType is is E.G Bashing, Percing or Slashing
	private StringProperty special;
	private StringProperty weaponType;
	
	//weapon type
	public StringProperty getTypeProperty() {
		return this.weaponType;
	}
	
	/**
	 * @returns a String
	 */
	public String getWeaponType() {
		return weaponType.getValue();
	}

	/**
	 * @param weaponType
	 */
	public void setWeaponType(String weaponType) {
		this.weaponType.set(weaponType);
	}
	
	//special
	public StringProperty getSpecialProperty() {
		return this.special;
	}
	/**
	 * @returns a String
	 */
	public String getSpecial() {
		return special.getValue();
	}

	/**
	 * @param special
	 */
	public void setSpecial(String special) {
		this.special.set(special);
	}
	
	//wield style
	public StringProperty getWieldProperty() {
		return this.wieldStyle;
	}

	/**
	 * @returns a String
	 */
	public String getWieldStyle() {
		return wieldStyle.getValue();
	}

	/**
	 * @param wieldStyle
	 */
	public void setWieldStyle(String wieldStyle) {
		this.wieldStyle.set(wieldStyle);
	}
	
	//dmg(s)
	public StringProperty getDmgSProperty() {
		return this.dmgS;
	}

	/**
	 * @returns a String
	 */
	public String getDmgS() {
		return dmgS.getValue();
	}

	/**
	 * @param dmgS
	 */
	public void setDmgS(String dmgS) {
		this.dmgS.set(dmgS);
	}
	
	//dmg(m)
	public StringProperty getDmgMProperty() {
		return this.dmgM;
	}

	/**
	 * @returns a String
	 */
	public String getDmgM() {
		return dmgM.getValue();
	}

	/**
	 * @param dmgM
	 */
	public void setDmgM(String dmgM) {
		this.dmgM.set(dmgM);
	}
	
	//crit
	public StringProperty getCritProperty() {
		return this.critical;
	}
	
	/**
	 * @returns a String
	 */
	public String getCritical() {
		return critical.getValue();
	}

	/**
	 * @param critical
	 */
	public void setCritical(String critical) {
		this.critical.set(critical);
	}
	
	//range
	public StringProperty getRangeProperty() {
		return this.range;
	}
	
	/**
	 * @returns a String
	 */
	public String getRange() {
		return range.getValue();
	}

	/**
	 * @param range
	 */
	public void setRange(String range) {
		this.range.set(range);
	}
	
	//weapon damage type
	public StringProperty getDmgTypeProperty() {
		return this.weaponDmgType;
	}

	/**
	 * @returns a String
	 */
	public String getWeaponDmgType() {
		return weaponDmgType.getValue();
	}

	/**
	 * @param weaponDmgType
	 */
	public void setWeaponDmgType(String weaponDmgType) {
		this.weaponDmgType.set(weaponDmgType);
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
		this.wieldStyle = new SimpleStringProperty(wieldStyle);
		this.weaponType = new SimpleStringProperty(weaponType);
		this.dmgS = new SimpleStringProperty(dmgS);
		this.dmgM = new SimpleStringProperty(dmgM);
		this.critical = new SimpleStringProperty(critical);
		this.range = new SimpleStringProperty(range);
		this.weaponDmgType = new SimpleStringProperty(weaponDmgType);
		this.special = new SimpleStringProperty(special);
	}
	
}