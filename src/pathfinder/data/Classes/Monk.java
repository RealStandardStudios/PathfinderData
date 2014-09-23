package pathfinder.data.Classes;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;

/**
 * The Monk Class http://paizo.com/pathfinderRPG/prd/classes/monk.html#_monk
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Monk extends Class {
	private ObservableList<LevelTableRow> levelTable;
	
	private int[] flurryOfBlowsBAB;
	
	private int[] unarmedDamageMultiplier;
	
	private DiceType[] unarmedDamage;
	
	private int[] acBonus;
	
	private int[] fastMovement;

	/**
	 * An observable list for class levels
	 */
	@Override
	public ObservableList<LevelTableRow> getLeveltableRow() {
		return this.levelTable;
	}
	
	/**
	 * sets the class level table
	 */
	@Override
	public void setLevelTable(ObservableList<LevelTableRow> levelTable) {
		this.levelTable = levelTable;
	}

	/**
	 * @return the flurryOfBlowsBAB
	 */
	public int[] getFlurryOfBlowsBAB() {
		return flurryOfBlowsBAB;
	}

	/**
	 * @return the unarmedDamageMultiplier
	 */
	public int[] getUnarmedDamageMultiplier() {
		return unarmedDamageMultiplier;
	}

	/**
	 * @return the unarmedDamage
	 */
	public DiceType[] getUnarmedDamage() {
		return unarmedDamage;
	}

	/**
	 * @return the acBonus
	 */
	public int[] getAcBonus() {
		return acBonus;
	}

	/**
	 * @return the fastMovement
	 */
	public int[] getFastMovement() {
		return fastMovement;
	}

	
	/**
	 * an empty constructor for Kryo
	 */
	public Monk() {
	}

	/**
	 * @param Name
	 * @param description
	 * @param role
	 * @param level
	 * @param requireAlignments
	 * @param hitDice
	 * @param startingWealthD6
	 * @param skillRanksPerLevel
	 * @param classSkills
	 * @param features
	 * @param weaponProficiencies
	 * @param armorProficiencies
	 * @param levelTable
	 * @param flurryOfBlowsBAB
	 * @param unarmedDamageMultiplier
	 * @param unarmedDamage
	 * @param acBonus
	 * @param fastMovement
	 */
	public Monk(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			ArrayList<Feature> features, String[] weaponProficiencies,
			String[] armorProficiencies, LevelTableRow[] levelTable,
			int[] flurryOfBlowsBAB, int[] unarmedDamageMultiplier,
			DiceType[] unarmedDamage, int[] acBonus, int[] fastMovement) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.levelTable = FXCollections.observableArrayList(levelTable);
		this.flurryOfBlowsBAB = flurryOfBlowsBAB;
		this.unarmedDamageMultiplier = unarmedDamageMultiplier;
		this.unarmedDamage = unarmedDamage;
		this.acBonus = acBonus;
		this.fastMovement = fastMovement;
	}
	
	
}
