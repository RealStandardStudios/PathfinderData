package pathfinder.data.Spells;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Real Standard Studios - Matthew Meehan, Kenneth Cooper
 * @description A data class for the varied Spells available
 */

public class Spell {
    private School school;
    private int castingTime;
    private String range;
    //private Ranges range;  // change to Ranges from int
    //private int rangePerLevel;  // may have to remove entirely
    private String effect;
    private String duration;
    private String dismissable;
    private String savingThrow;  // needs looked at, data functions differently than this does
    private String spellResistance;  // needs looked at, data functions differently than this does
    private String description;
    private StringProperty name;
    private String[] className;
    private int[] spellLevel;
    private String components;
    private String target;
    private String area;
    private String[] tablePicture;


    /**
     * @return the school
     */
    public School getSchool() {
        return school;
    }
    /**
     * @return the castingTime
     */
    public int getCastingTime() {
        return castingTime;
    }
    /**
     * @return the range
     * @param level
     */
//    public int getRange(int level) {
//        return this.range+(this.rangePerLevel*level);
//    }
    
    public String getRange() {
    	return this.range;
    }
    /**
     * @return the rangePerLevel
     */
//    public int getRangePerLevel() {
//        return rangePerLevel;
//    }
    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }
    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }
    /**
     * @return the savingThrow
     */
    public String getSavingThrow() {
        return savingThrow;
    }
    /**
     * @return the spellResistance
     */
    public String isSpellResistance() {
        return spellResistance;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name.getValue();
    }

    /**
     * @return the dismissable
     */
    public String isDismissable() {
        return dismissable;
    }
    
    public String[] getClassName() {
    	return className;
    }
    
    public int[] getSpellLevel() {
    	return spellLevel;
    }
    
    public String getComponents() {
    	return components;
    }
    
    public String getTarget() {
    	return target;
    }
    
    public String getArea() {
    	return area;
    }
    
    public String[] getTablePicture() {
    	return tablePicture;
    }
    
    /**
     * Empty constructor for Kryo
     */
    public Spell() {}

    /**
     * @param school
     * @param className
     * @param spellLevel
     * @param castingTime
     * @param components
     * @param range
     * @param target
     * @param effect
     * @param area
     * @param duration
     * @param savingThrow
     * @param spellResistance
     * @param description
     * @param name
     * @param dismissable
     * 
     * Constructor for Spell
     */
    public Spell(School school, String[] className, int[] spellLevel, int castingTime, String components, String range,
                    String target, String effect, String area, String duration, String savingThrow,
                    String spellResistance, String description, String name, String dismissable) {
        this.school = school;
        this.castingTime = castingTime;
        this.range = range;
       // this.rangePerLevel = rangePerLevel;
        this.effect = effect;
        this.duration = duration;
        this.savingThrow = savingThrow;
        this.spellResistance = spellResistance;
        this.description = description;
        this.name = new SimpleStringProperty(name);
        this.dismissable = dismissable;
    }
}