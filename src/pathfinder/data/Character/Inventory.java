package pathfinder.data.Character;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Consumables;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Weapon;

/**
 * A data class that stores the information about the items the character has on
 * them and equipped
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Inventory {

	private ObservableList<Armor> armor;
	private ObservableList<Weapon> weapons;
	private ObservableList<Consumables> consumables;
	private ObservableList<Goods> goods;

	private ObservableList<Armor> armorWorn;
	private ObservableList<Weapon> weaponEquipped;

	private double characterGold = 0;

	/**
	 * @return the armor
	 */
	public ObservableList<Armor> getArmor() {
		return armor;
	}

	/**
	 * @return the goods
	 */
	public ObservableList<Goods> getGoods() {
		return goods;
	}

	/**
	 * @return the weapons
	 */
	public ObservableList<Weapon> getWeapons() {
		return weapons;
	}

	/**
	 * @return the consumables
	 */
	public ObservableList<Consumables> getConsumables() {
		return consumables;
	}

	/**
	 * @return the armorWorn
	 */
	public ObservableList<Armor> getArmorWorn() {
		return armorWorn;
	}

	/**
	 * @return the weaponEquipped
	 */
	public ObservableList<Weapon> getWeaponEquipped() {
		return weaponEquipped;
	}

	public double getCharacterGold() {
		return characterGold;
	}

	public void setCharacterGold(double characterGold) {
		this.characterGold = characterGold;
	}

	public void setArmor(ObservableList<Armor> armor) {
		this.armor = armor;
	}

	public void setWeapons(ObservableList<Weapon> weapons) {
		this.weapons = weapons;
	}

	public void setConsumables(ObservableList<Consumables> consumables) {
		this.consumables = consumables;
	}

	public void setGoods(ObservableList<Goods> goods) {
		this.goods = goods;
	}

	public void setArmorWorn(ObservableList<Armor> armorWorn) {
		this.armorWorn = armorWorn;
	}

	public void setWeaponEquipped(ObservableList<Weapon> weaponEquipped) {
		this.weaponEquipped = weaponEquipped;
	}

	/**
	 * empty constructor for Kryo
	 */
	public Inventory() {

	}

	public Inventory(ObservableList<Weapon> weapons, ObservableList<Armor> armor, ObservableList<Goods> goods, double money) {
		super();
		this.armor = armor;
		this.weapons = weapons;
		this.goods = goods;
		this.characterGold = money;

		consumables = FXCollections.observableArrayList();
		armorWorn = FXCollections.observableArrayList();
		weaponEquipped = FXCollections.observableArrayList();
	}
}
