package pathfinder.data.Classes;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;

/**
 * The Rogue Class http://paizo.com/pathfinderRPG/prd/classes/rogue.html#_rogue
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Rogue extends Class {
	private ObservableList<LevelTableRow> levelTable;

	@Override
	public ObservableList<LevelTableRow> getLeveltableRow() {
		return this.levelTable;
	}

	@Override
	public void setLevelTable(ObservableList<LevelTableRow> levelTable) {
		this.levelTable = levelTable;
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Rogue() {
	}

	/**
	 * @param name
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
	 */
	public Rogue(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			ArrayList<Feature> features, String[] weaponProficiencies,
			String[] armorProficiencies, LevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.levelTable = FXCollections.observableArrayList(levelTable);
	}
}