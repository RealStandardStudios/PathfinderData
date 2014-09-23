package pathfinder.data.Items;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * An {@link Item} that is considered a weapon
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Weapon extends Item{
	public StringProperty WieldStyle;
	public StringProperty DmgS;
	public StringProperty DmgM;
	public StringProperty Critical;
	public StringProperty Range;
	public StringProperty WeaponDmgType; //this reverts to what damage weaponDmgType is is E.G Bashing, Percing or Slashing
	public StringProperty Special;
	public StringProperty WeaponType;
	
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
		this.WieldStyle = new SimpleStringProperty(wieldStyle);
		this.WeaponType = new SimpleStringProperty(weaponType);
		this.DmgS = new SimpleStringProperty(dmgS);
		this.DmgM = new SimpleStringProperty(dmgM);
		this.Critical = new SimpleStringProperty(critical);
		this.Range = new SimpleStringProperty(range);
		this.WeaponDmgType = new SimpleStringProperty(weaponDmgType);
		this.Special = new SimpleStringProperty(special);
	}
	
}