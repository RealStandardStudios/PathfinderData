package pathfinder.data.Items;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * An {@link Item} that is considered Armour
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Armor extends Item {
	public StringProperty ArmorType;
	public StringProperty ArmorBonus;
	public StringProperty MaxDexBonus;
	public StringProperty ArmorCheckPenalty;
	public StringProperty ArcaneSpellFailure;
	public StringProperty Speed30feet;
	public StringProperty Speed20feet;
	
	/**
	 * @return the armorBonusAsAInt
	 */
	public int getArmorBonusInt() {
		int armorBonusAsInt = Integer.parseInt(ArmorBonus.get());
		return armorBonusAsInt;
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Armor() {
	}

	/**
	 * @param armorType
	 * @param cost
	 * @param armorBonus
	 * @param maxDexBonus
	 * @param armorCheckPenalty
	 * @param arcaneSpellFailiure
	 * @param speed30feet
	 * @param speed20feet
	 * @param weight
	 */
	public Armor(String  name, String armorType, String  cost, String armorBonus,
			String maxDexBonus, String armorCheckPenalty, String arcaneSpellFailiure,
			String speed30feet, String speed20feet, String  weight) {
		super(name,cost,weight);
		this.ArmorType = new SimpleStringProperty(armorType);
		this.ArmorBonus = new SimpleStringProperty(armorBonus);
		this.MaxDexBonus =  new SimpleStringProperty(maxDexBonus);
		this.ArmorCheckPenalty =  new SimpleStringProperty(armorCheckPenalty);
		this.ArcaneSpellFailure =  new SimpleStringProperty(arcaneSpellFailiure);
		this.Speed30feet =  new SimpleStringProperty(speed30feet);
		this.Speed20feet =  new SimpleStringProperty(speed20feet);
	}
}