package pathfinder.data.Classes.Objects.LevelTable;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Attributes.SaveAttribute;

/**
 * A row of the table of benefits gained each level from
 * a specific class
 * 
 * @author Real Standard Studios - Matthew Meehan 
 */
public class LevelTableRow {
	private ObjectProperty<Integer> levelNum;
	private int[] baseAttackBonus;
	private SaveAttribute fortitudeSave;
	private SaveAttribute reflexSave;
	private SaveAttribute willSave;
	//private Feature[] specialFeatures;
	private String[] special;

	public ObjectProperty<Integer> getLevelNumProperty() {
		return this.levelNum;
	}
	
	public void setLevelNum(int levelNum) {
		this.levelNum.set(levelNum);
	}
	
	/**
	 * @return the baseAttackBonus
	 */
	public int[] getBAB() {
		return baseAttackBonus;
	}
	
	public void setBAB(int[] bab) {
		this.baseAttackBonus = bab;
	}
	
	public StringProperty getBABProperty() {
		
		String output = Integer.toString(baseAttackBonus[0]);
		
		for (int i = 1; i < baseAttackBonus.length; i++) {
			output += "/" + Integer.toString(baseAttackBonus[i]);
		}
		return new SimpleStringProperty(output);
	}

	/**
	 * @return the fortitudeSave
	 */
	public SaveAttribute getFortSave() {
		return fortitudeSave;
	}

	/**
	 * @return the reflexSave
	 */
	public SaveAttribute getRefSave() {
		return reflexSave;
	}

	/**
	 * @return the willSave
	 */
	public SaveAttribute getWillSave() {
		return willSave;
	}

//	/**
//	 * @return the specialFeatures
//	 */
//	public Feature[] getSpecialFeatures() {
//		return specialFeatures;
//	}
	
	public StringProperty getSpecialProperty() {
		String output = this.special[0];
		
		for (int i = 1; i < special.length; i++) {
			output += ", " + special[i].trim();
		}
		return new SimpleStringProperty(output);
	}
	
	public void setSpecial(String input) {
		this.special = input.split(",");
	}

	/**
	 * the empty Constructor for Kryo
	 */
	public LevelTableRow() {
	}

	/**
	 * @param levelNum
	 * @param baseAttackBonus
	 * @param fortitudeSave
	 * @param reflexSave
	 * @param willSave
	 * @param specialFeatures
	 */
	public LevelTableRow(int levelNum, int[] baseAttackBonus, SaveAttribute fortitudeSave,
			SaveAttribute reflexSave, SaveAttribute willSave,
			String[] specialFeatures) {
		super();
		this.levelNum = new SimpleObjectProperty<Integer>(levelNum);
		this.baseAttackBonus = baseAttackBonus;
		this.fortitudeSave = fortitudeSave;
		this.reflexSave = reflexSave;
		this.willSave = willSave;
		this.special = specialFeatures;
	}

}