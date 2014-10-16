package pathfinder.data.Classes.Objects.LevelTable;

import javafx.beans.property.StringProperty;

/**
 * The table of benefits gained each level from a
 * specific spell casting class
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SpellLevelTableRow extends LevelTableRow {

	private StringProperty[] spellsPerDay;
	private StringProperty[] spellsKnown;

	/**
	 * gets Spells Per Day
	 * 
	 * @returns a StringProperty array
	 */
	public StringProperty[] getSPD() {
		return spellsPerDay;
	}
	
	/**
	 * sets Spells Per Day
	 * 
	 * @param spd
	 */
	public void setSPD(StringProperty[] spd) {
		this.spellsPerDay = spd;
	}
	
	/**
	 * gets Spells Known
	 * 
	 * @returns a StringProperty array
	 */
	public StringProperty[] getSpellsKnown() {
		return spellsKnown;
	}
	
	/**
	 * sets Spells Known
	 * 
	 * @param spellsKnown
	 */
	public void setSpellsKnown(StringProperty[] spellsKnown) {
		this.spellsKnown = spellsKnown;
	}
	
	/**
	 * The empty constructor for Kryo
	 */
	public SpellLevelTableRow() {
	}

	/**
	 * @param levelNum
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 * @param spellsPerDay
	 * @param spellsKnown
	 */
	public SpellLevelTableRow(int levelNum, int[] baseAttackBonus,
			int fortitudeSave, int reflexSave,
			int willSave, String[] specialFeatures,
			StringProperty[] spellsPerDay, StringProperty[] spellsKnown) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.spellsPerDay = spellsPerDay;
		this.spellsKnown = spellsKnown;
	}
}
