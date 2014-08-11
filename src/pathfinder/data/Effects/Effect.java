package pathfinder.data.Effects;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * An effect of some kind with a definable value to the character
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class Effect {
	private int value;
	private StringProperty name;
	
	public StringProperty NameProperty() {
		return name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name.getValue();
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name.set(name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * The default Constructor for Kryo
	 */
	public Effect() { }
	
	/**
	 * 
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public Effect(int val, String name) {
		this.value = val;
		this.name = new SimpleStringProperty(name);
	}
}
