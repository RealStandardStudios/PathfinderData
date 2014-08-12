package pathfinder.data.Feats;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Effects.NonValued.MiscEffect;

/**
 * A data class for character Feats
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Feat {
	public static final Feat NullFeat = new Feat();
	
	private StringProperty name;
	private ObjectProperty<Object> prerequisite;
	private StringProperty benefit;
	private ObjectProperty<Effect> effect;

	public StringProperty nameProperty() {
		return name;
	}

	public ObjectProperty<Object> prerequisitePropety() {
		return prerequisite;
	}

	public StringProperty benifitProperty() {
		return benefit;
	}

	public ObjectProperty<Effect> effectProperty() {
		return effect;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name.get();
	}

	/**
	 * @return the prerequisite
	 */
	public Object getPrerequisite() {
		return prerequisite.get();
	}

	/**
	 * @return the benefit
	 */
	public String getBenefit() {
		return benefit.get();
	}

	public Effect getEffect() {
		return effect.get();
	}

	public void setEffect(Effect effect) {
		this.effect.set(effect);
	}

	public Feat() {
		this.name = new SimpleStringProperty("-");
		this.prerequisite = new SimpleObjectProperty<Object>();
		this.benefit = new SimpleStringProperty("-");
		this.effect = new SimpleObjectProperty<Effect>(new MiscEffect("-", "-"));
	}

	public Feat(String name, Feat prerequisite, String benefit, Effect effect) {
		this.name = new SimpleStringProperty(name);
		this.prerequisite = new SimpleObjectProperty<Object>(prerequisite);
		this.benefit = new SimpleStringProperty(benefit);
		this.effect = new SimpleObjectProperty<Effect>(effect);
	}
	
	public Feat(String name, Feature prerequisite, String benefit) {
		this.name = new SimpleStringProperty(name);
		this.prerequisite = new SimpleObjectProperty<Object>(prerequisite);
		this.benefit = new SimpleStringProperty(benefit);
		this.effect = new SimpleObjectProperty<Effect>(new MiscEffect("Misc Effect", "Tests the data"));
	}
	
	public String toString() {
		return this.getName();
	}
}
