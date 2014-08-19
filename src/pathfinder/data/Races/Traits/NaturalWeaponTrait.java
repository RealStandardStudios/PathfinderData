package pathfinder.data.Races.Traits;

import pathfinder.data.Effects.Effect;
import pathfinder.data.Items.WeaponType;


/**
 * A trait that gives the user a natural weapon
 * 
 * @Author Real Standard Studios - Joshua Boyd
 */
public class NaturalWeaponTrait  extends Trait{
    //claws, tail, teeth...		
	private String weaponDescription;
	
	//e.g. Simple
    private WeaponType weaponType;
    
    //e.g humannoid with 2 claw weapons
    private int numberOfWeapons;
    
    // 4 would be 1d4
    private int diceType;
	
    /**
	 * @return the weaponDescription
	 */
	public String getWeaponDescription() {
		return weaponDescription;
	}
	
	/**
	 * @param weaponDescription the weaponDescription to set
	 */
	public void setWeaponDescription(String weaponDescription) {
		this.weaponDescription = weaponDescription;
	}
	
	/**
	 * @return the weaponType
	 */
	public WeaponType getWeaponType() {
		return weaponType;
	}
	
	/**
	 * @param weaponType the weaponType to set
	 */
	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}
	
	/**
	 * @return the numberOfWeapons
	 */
	public int getNumberOfWeapons() {
		return numberOfWeapons;
	}
	
	/**
	 * @param numberOfWeapons the numberOfWeapons to set
	 */
	public void setNumberOfWeapons(int numberOfWeapons) {
		this.numberOfWeapons = numberOfWeapons;
	}
	
	/**
	 * @return the diceType
	 */
	public int getDiceType() {
		return diceType;
	}
	
	/**
	 * @param diceType the diceType to set
	 */
	public void setDiceType(int diceType) {
		this.diceType = diceType;
	}
	
	/**
	 * The default constructor for Kryo
	 */
	public NaturalWeaponTrait() {
		super();
	}
	
	/**
	 * @param Name
	 * @param effect
	 */
	public NaturalWeaponTrait(String name, Effect effect, String weaponDescription, WeaponType weaponType, int numberOfWeapons, int diceType) {
		super(name, effect);
		this.weaponDescription =weaponDescription;
		this.weaponType = weaponType;
		this.numberOfWeapons = numberOfWeapons;
		this.diceType = diceType;
	}
}
