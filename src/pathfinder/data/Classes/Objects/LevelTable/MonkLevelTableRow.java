/**
 * 
 */
package pathfinder.data.Classes.Objects.LevelTable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * The special Level Table row for the monk because it follows no leaders and doesn't do the other things
 * @author Real Standard Studios - Matthew Meehan
 */
public class MonkLevelTableRow extends LevelTableRow {
	int[] flurryOfBlows;
	StringProperty unarmedDamage;
	StringProperty acBonus;
	StringProperty fastMovement;

	/**
	 * @return the unarmedDamage
	 */
	public StringProperty getUnarmedDamageProperty() {
		return unarmedDamage;
	}

	/**
	 * @param unarmedDamage the unarmedDamage to set
	 */
	public void setUnarmedDamage(String unarmedDamage) {
		this.unarmedDamage.set(unarmedDamage);
	}

	/**
	 * @return the acBonus
	 */
	public StringProperty getAcBonusProperty() {
		return acBonus;
	}

	/**
	 * @param acBonus the acBonus to set
	 */
	public void setAcBonus(String acBonus) {
		this.acBonus.set(acBonus);
	}

	/**
	 * @return the fastMovement
	 */
	public StringProperty getFastMovementProperty() {
		return fastMovement;
	}

	/**
	 * @param fastMovement the fastMovement to set
	 */
	public void setFastMovement(String fastMovement) {
		this.fastMovement.set(fastMovement);
	}

	/**
	 * empty constructor for Kryo
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
			int fortitudeSave, int reflexSave,
			int willSave, String[] specialFeatures, 
			int[] flurryOfBlows, String unarmedDamage, String acBonus, String fastMovement) {
		super(levelNum, baseAttackBonus, fortitudeSave, reflexSave, willSave,
				specialFeatures);
		this.acBonus = new SimpleStringProperty(acBonus);
		this.fastMovement = new SimpleStringProperty(fastMovement);
		this.flurryOfBlows = flurryOfBlows;
		this.unarmedDamage = new SimpleStringProperty(unarmedDamage);
	}

	public StringProperty getFlurryOfBlowsString() {
		String output = Integer.toString(flurryOfBlows[0]);
		for (int i = 1; i < flurryOfBlows.length; i++) {
			output += "/" + Integer.toString(flurryOfBlows[i]);
		}
		return new SimpleStringProperty(output);
	}

}
