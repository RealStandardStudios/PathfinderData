package pathfinder.data.Effects;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * An effect of some kind with a definable value to the character
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class Effect {
	private int value;
	private StringProperty name;
	
	/**
	 * @return a StringProperty
	 */
	public StringProperty getNameProperty() {
		return name;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return name.getValue();
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String name) {
		this.name.set(name);
	}

	/**
	 * @return an int
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * The default Constructor for Kryo
	 */
	public Effect() {
		this.name = new SimpleStringProperty();
	}
	
	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public Effect(int val, String name) {
		this.value = val;
		this.name = new SimpleStringProperty(name);
	}
}
