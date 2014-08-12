package pathfinder.data.Spells;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Real Standard Studios - Matthew Meehan, Kenneth Cooper
 * @description A data class for the varied Spells available
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
    private String[] className;
    private int[] spellLevel;
    private String components;
    private String target;
    private String area;
    private String[] tablePicture;
    
         
    public void setSchool(String school) {
		this.school = school;
	}

	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setSavingThrow(String savingThrow) {
		this.savingThrow = savingThrow;
	}

	public void setSpellResistance(String spellResistance) {
		this.spellResistance = spellResistance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name.setValue(name);
	}

	public void setClassName(String[] className) {
		this.className = className;
	}

	public void setSpellLevel(int[] spellLevel) {
		this.spellLevel = spellLevel;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setTablePicture(String tablePicture) {
		String[] parts = tablePicture.split(",");
		this.tablePicture = parts;
	}

	/**
     * @return a combined string made up of className and spellLevel
     */
    public String getClassAndSpellLevel() {
    	String classAndSpellLevel = "";
    	
    	classAndSpellLevel += className[0] + " " + spellLevel[0];
    	
    	for (int i = 1; i < className.length; i++) {
    		classAndSpellLevel += ", " + className[i] + " " + spellLevel[i];
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
     * @return the name
     */
    public String getName() {
        return name.getValue();
    }
    /**
     * @return name as a StringProperty
     */
    public StringProperty getNameProperty() {
    	return name;
    }
    /**
     * @return className
     */
    public String[] getClassName() {
    	return className;
    }
    /**
     * @return spellLevel
     */
    public int[] getSpellLevel() {
    	return spellLevel;
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
     * @param name
     * @param tablePicture
     * 
     * Constructor for Spell
     */
    public Spell(String name, String school, String[] className, int[] spellLevel, String castingTime, String components, String range,
                    String target, String effect, String area, String duration, String savingThrow,
                    String spellResistance, String description, String[] tablePicture) {
    	this.name = new SimpleStringProperty(name);
    	this.school = school;
        this.className = className;
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