/**
 * 
 */
package pathfinder.data.Classes.Objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import pathfinder.data.Attributes.SaveAttribute;

/**
 * The table of benefits gained each level from a
 * specific spell casting class
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SpellLevelTableRow extends LevelTableRow {

	//private Spell[] spellsPerDay;
	private ObjectProperty<Integer> spellsPerDay;
	//private Spell[] spellsKnown;
	private ObjectProperty<Integer> spellsKnown;

	/**
	 * @return the spellsPerDay
	 */
//	public Spell[] getSpellsPerDay() {
//		return spellsPerDay;
//	}
	public ObjectProperty<Integer> getSpellsPerDayProperty() {
		return this.spellsPerDay;
	}
	
	public void setSpellsPerDay(int spellsPerDay) {
		this.spellsPerDay.set(spellsPerDay);
	}
	
	/**
	 * @return the spellsKnown
	 */
//	public Spell[] getSpellsKnown() {
//		return spellsKnown;
//	}
	public ObjectProperty<Integer> getSpellsKnownProperty() {
		return this.spellsKnown;
	}
	
	public void setSpellsKnown(int spellsKnown) {
		this.spellsKnown.set(spellsKnown);
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
			int spellsPerDay, int spellsKnown) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
/* Changed Constructor to reflect addition of spellsKnown and Properties:
 * Was Spell[] spellsPerDay
 * Now int spellsPerDay and int spellsKnown   */
//		this.spellsPerDay = spellsPerDay;
//		this.spellsKnown = spellsKnown;
		this.spellsPerDay = new SimpleObjectProperty<Integer>(spellsPerDay);
		this.spellsKnown = new SimpleObjectProperty<Integer>(spellsKnown);
	}

}
