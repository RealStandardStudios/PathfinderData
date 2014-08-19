package pathfinder.data.Spells;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * A data class for the varied Spells available
 * 
 * @author Real Standard Studios - Matthew Meehan, Kenneth Cooper
 */

public class Spell {
    private String school;
    private String castingTime;
    private String range;
    //private Ranges range;  // change to Ranges from int
    //private int rangePerLevel;  // may have to remove entirely
    private String effect;
    private String duration;
    private String savingThrow;  // needs looked at, data functions differently than this does
    private String spellResistance;  // needs looked at, data functions differently than this does
    private String description;
    private StringProperty name;
//    private String[] className;
//    private int[] spellLevel;
    private HashMap<String, Integer> spellLevel;
    private String components;
    private String target;
    private String area;
    private String[] tablePicture;
    
    /**     
     * @param school
     */
    public void setSchool(String school) {
		this.school = school;
	}

    /**
     * @param castingTime
     */
	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}

	/**
	 * @param range
	 */
	public void setRange(String range) {
		this.range = range;
	}

	/**
	 * @param effect
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * @param duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @param savingThrow
	 */
	public void setSavingThrow(String savingThrow) {
		this.savingThrow = savingThrow;
	}

	/**
	 * @param spellResistance
	 */
	public void setSpellResistance(String spellResistance) {
		this.spellResistance = spellResistance;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name.setValue(name);
	}

	
//	public void setClassName(String[] className) {
//		this.className = className;
//	}
//
	/**
	 * @param spellLevels
	 */
	public void setSpellLevel(HashMap<String, Integer> spellLevels) {
		this.spellLevel = spellLevels;
	}

	/**
	 * @param components
	 */
	public void setComponents(String components) {
		this.components = components;
	}

	/**
	 * @param target
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @param area
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @param tablePicture
	 */
	public void setTablePicture(String tablePicture) {
		String[] parts = tablePicture.split(",");
		this.tablePicture = parts;
	}

	/**
     * @return a combined string made up of className and spellLevel
     */
    public String getClassAndSpellLevel() {
    	String classAndSpellLevel = "";
    	
    	classAndSpellLevel += spellLevel.keySet().toArray()[0] + " " + spellLevel.values().toArray()[0];
    	
    	for (int i = 1; i < spellLevel.size(); i++) {
    		classAndSpellLevel += ", " + spellLevel.keySet().toArray()[i] + " " + spellLevel.values().toArray()[i];
    	}
    	
    	return classAndSpellLevel;
    }
    
    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }
    
    /**
     * @return the castingTime
     */
    public String getCastingTime() {
        return castingTime;
    }
    
    /**
     * @return the range
     * @param level
     */
//    public int getRange(int level) {
//        return this.range+(this.rangePerLevel*level);
//    }
    
    /**
     * @return range
     */
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
     * @return the Name
     */
    public String getName() {
        return name.getValue();
    }
    
    /**
     * @return Name as a StringProperty
     */
    public StringProperty getNameProperty() {
    	return name;
    }
    
    /**
     * @return components
     */
    public String getComponents() {
    	return components;
    }
    
    /**
     * @return target
     */
    public String getTarget() {
    	return target;
    }
    
    /**
     * @return area
     */
    public String getArea() {
    	return area;
    }
    
    /**
     * @return an array of tablePicture
     */
    public String getTablePicture() {
    	String tablePictures = "";
    	
    	if (tablePicture != null) {
    		tablePictures += tablePicture[0];
        	
        	for (int i = 1; i < tablePicture.length; i++) {
        		tablePictures += ", " + tablePicture[i];
        	}
    	}
    	
    	return tablePictures;
    }
    
    /**
     * @returns a String array made up of image locations.
     */
    public String[] getTablePictures() {
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
     * @param Name
     * @param tablePicture
     */
    public Spell(String name, String school, HashMap<String,Integer> spellLevel, String castingTime, String components, String range,
                    String target, String effect, String area, String duration, String savingThrow,
                    String spellResistance, String description, String[] tablePicture) {
    	this.name = new SimpleStringProperty(name);
    	this.school = school;
        this.spellLevel = spellLevel;
        this.castingTime = castingTime;
        this.components = components;
        this.range = range;
       // this.rangePerLevel = rangePerLevel;
        this.target = target;
        this.effect = effect;
        this.area = area;
        this.duration = duration;
        this.savingThrow = savingThrow;
        this.spellResistance = spellResistance;
        this.description = description;
        this.tablePicture = tablePicture;
    }
}
