/**
 * 
 */
package pathfinder.data.Classes.Objects;

import pathfinder.data.Attributes.SaveAttribute;
import pathfinder.data.Spells.Spell;

/**
 * The table of benefits gained each level from a
 * specific spell casting class
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SpellLevelTableRow extends LevelTableRow {

	private Spell[] spellsPerDay;

	/**
	 * @return the spellsPerDay
	 */
	public Spell[] getSpellsPerDay() {
		return spellsPerDay;
	}

	/**
	 * The empty constructor for Kryo
	 */
	public SpellLevelTableRow() {
	}

	/**
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 * @param spellsPerDay
	 */
	public SpellLevelTableRow(int levelNum, int[] baseAttackBonus,
			SaveAttribute fortitudeSave, SaveAttribute reflexSave,
			SaveAttribute willSave, String[] specialFeatures,
			Spell[] spellsPerDay) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.spellsPerDay = spellsPerDay;
	}

}
