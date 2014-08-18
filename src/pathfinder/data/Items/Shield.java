/**
 * 
 */
package pathfinder.data.Items;

/**
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
	public Shield(String name, ArmorType armorType, String cost, int armorBonus,
			int maxDexBonus, int armorCheckPenalty, int arcaneSpellFailiure,
			int speed30feet, int speed20feet, String weight) {
		super(name, armorType, cost, armorBonus, maxDexBonus,
				armorCheckPenalty, arcaneSpellFailiure, speed30feet,
				speed20feet, weight);
	}

}
