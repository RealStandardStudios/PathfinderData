	/**
 * 
 */
package pathfinder.data.Classes.Objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Attributes.SaveAttribute;

/**
 * The table of benefits gained each level from a
 * specific spell casting class
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class SpellLevelTableRow extends LevelTableRow {

	private int[] spellsPerDay;
	private int[] spellsKnown;

	/**
	 * @return the spellsPerDay
	 */
	
	public int[] getSPD() {
		return spellsPerDay;
	}
	
	public void setSPD(int[] spd) {
		this.spellsPerDay = spd;
	}
	
	public StringProperty[] getSPDProperty() {
		 StringProperty[] pallet = new StringProperty[spellsPerDay.length];
		 for (int i = 0; i < spellsPerDay.length; i++) {
			StringProperty wgbox = new SimpleStringProperty(Integer.toString(spellsPerDay[i]));
			pallet[i] = wgbox;
		}
		return pallet;
		
		//new array of wirlygigboxes
		//for each thing in the int array
		//put the int in the box through the pipe
		//put the box in the big box
		//end for
		//give the controller the big box
	}
	
	/*
	@SuppressWarnings("unchecked")
	public void setSpellsPerDay(int[] spellsPerDay) {
		this.spellsPerDay = new ObjectProperty[10];
		for (int i=0;i<spellsPerDay.length;i++) {
			this.spellsPerDay[i] = new SimpleObjectProperty<Integer>(spellsPerDay[i]);
		}
	}
	*/
	
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
		this.spellsPerDay = spellsPerDay;
		this.spellsKnown = spellsKnown;
	}
}
