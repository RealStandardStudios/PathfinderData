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

	private ObjectProperty<Integer>[] spellsPerDay;
	private int[] spellsKnown;

	/**
	 * @return the spellsPerDay
	 */

	public ObjectProperty<Integer>[] getSpellsPerDay() {
		return spellsPerDay;
	}
	
	public void setSpellsPerDay(ObjectProperty<Integer>[] spellsPerDay) {
		this.spellsPerDay = spellsPerDay;
	}
	
	@SuppressWarnings("unchecked")
	public void setSpellsPerDay(int[] spellsPerDay) {
		this.spellsPerDay = new ObjectProperty[10];
		for (int i=0;i<spellsPerDay.length;i++) {
			this.spellsPerDay[i] = new SimpleObjectProperty<Integer>(spellsPerDay[i]);
		}
	}
	
	/**
	 * @return the spellsKnown
	 */
	
	public int[] getSpellsKnown() {
		return spellsKnown;
	}
	
	public void setSpellsKnown(int[] spellsKnown) {
		this.spellsKnown = spellsKnown;
	}
	
	public ObjectProperty<Integer> getSpellsKnownProperty() {
		return new SimpleObjectProperty<Integer>();
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
			int[] spellsPerDay, int[] spellsKnown) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.setSpellsPerDay(spellsPerDay);
		this.spellsKnown = spellsKnown;
	}
}
