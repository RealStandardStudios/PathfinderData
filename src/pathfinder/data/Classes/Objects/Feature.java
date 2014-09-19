package pathfinder.data.Classes.Objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Effects.Effect;

/**
 * The generic class for Features
 * 
 * @author Matthew Meehan
 */
public class Feature {
	private StringProperty name;
	private StringProperty type;
	private StringProperty description;

	private ObjectProperty<Effect> effect;

	/**
	 * @return an effect
	 */
	public ObjectProperty<Effect> getEffectProperty() {
		return effect;
	}

	/**
	 * @param effect
	 */
	public void setEffect(Effect effect) {
		this.effect.set(effect);
	}

	/**
	 * @return the description
	 */
	public StringProperty getDescriptionProperty() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description.set(description);
	}

	/**
	 * @return the Name
	 */
	public StringProperty getNameProperty() {
		return name;
	}

	/**
	 * @return the type
	 */
	public StringProperty getTypeProperty() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type.set(type);
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Feature() {
	}

	/**
	 * @param Name
	 * @param description
	 */
	public Feature(String name, String type, String description) {
		this.name = new SimpleStringProperty(name);
		this.type = new SimpleStringProperty(type);
		this.description = new SimpleStringProperty(description);
		this.effect = new SimpleObjectProperty<>();
	}
}
