/**
 * 
 */
package pathfinder.data.Classes.Objects.LevelTable;

import pathfinder.data.Attributes.SaveAttribute;

/**
 * The special Level Table row for the monk because it follows no leaders and doesn't do the other things
 * @author Real Standard Studios - Matthew Meehan
 */
public class MonkLevelTableRow extends LevelTableRow {
	int[] flurryOfBlows;
	String unarmedDamage;
	int acBonus;
	int fastMovement;

	/**
	 * 
	 */
	public MonkLevelTableRow() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param levelNum
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 */
	public MonkLevelTableRow(int levelNum, int[] baseAttackBonus,
			SaveAttribute fortitudeSave, SaveAttribute reflexSave,
			SaveAttribute willSave, String[] specialFeatures, 
			int[] flurryOfBlows, String unarmedDamage, int acBonus, int fastMovement) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.acBonus = acBonus;
		this.fastMovement = fastMovement;
		this.flurryOfBlows = flurryOfBlows;
		this.fastMovement = fastMovement;
	}

}
