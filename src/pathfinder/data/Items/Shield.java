/**
 * 
 */
package pathfinder.data.Items;

/*
 * An {@link Armor} that is considered a Shield
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Shield extends Armor {

	/**
	 * The empty constructor for Kryo
	 */
	public Shield() {
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
	public Shield(String name, String  armorType, String cost, String armorBonus,
			String maxDexBonus, String armorCheckPenalty, String arcaneSpellFailiure,
			String speed30feet, String speed20feet, String weight) {
		super(name, armorType, cost, armorBonus, maxDexBonus,
				armorCheckPenalty, arcaneSpellFailiure, speed30feet,
				speed20feet, weight);
	}

}
		//DO WE EVEN NEED THIS CLASS????? ~Josh
