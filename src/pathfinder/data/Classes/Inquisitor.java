package pathfinder.data.Classes;

import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;
import pathfinder.data.Classes.Objects.LevelTable.SpellLevelTableRow;
import pathfinder.data.Spells.Spell;

/**
 * The Inquisitor Class http://paizo.com/pathfinderRPG/prd/advanced/baseClasses/inquisitor.html
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Inquisitor extends Class {
	/**
	 * An array of a HashMaps containing spells, an index of the array equals a level
	 */
	private HashMap<String,Spell> spells;
	
	private ObservableList<LevelTableRow> levelTable;

	/**
	 * @return the spells
	 */
	public HashMap<String, Spell> getSpells() {
		return spells;
	}

	@Override
	public ObservableList<LevelTableRow> getLeveltableRow() {
		return this.levelTable;
	}
	
	@Override
	public void SetLevelTable(ObservableList<LevelTableRow> levelTable) {
		this.levelTable = levelTable;
	}
	
	/**
	 * an empty constructor for Kryo
	 */
	public Inquisitor() {
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
	 * @param spells
	 * @param levelTable
	 */
	public Inquisitor(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			Feature[] features, String[] weaponProficiencies,
			String[] armorProficiencies, HashMap<String, Spell> spells,
			SpellLevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.spells = spells;
		this.levelTable = FXCollections.observableArrayList(levelTable);
	}
	
	
}
