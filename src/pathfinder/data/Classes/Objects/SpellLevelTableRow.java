	/**
 * 
 */
package pathfinder.data.Classes.Objects;

import javafx.beans.property.StringProperty;
import pathfinder.data.Attributes.SaveAttribute;

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
	 * @return the spellsPerDay
	 */
	
	public StringProperty[] getSPD() {
		return spellsPerDay;
	}
	
	public void setSPD(StringProperty[] spd) {
		this.spellsPerDay = spd;
	}
	
	/**
	 * @return the spellsKnown
	 */
	
	public StringProperty[] getSpellsKnown() {
		return spellsKnown;
	}
	
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
			SaveAttribute fortitudeSave, SaveAttribute reflexSave,
			SaveAttribute willSave, String[] specialFeatures,
			StringProperty[] spellsPerDay, StringProperty[] spellsKnown) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.spellsPerDay = spellsPerDay;
		this.spellsKnown = spellsKnown;
	}
}
