package pathfinder.data;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Effects.NonValued.MiscEffect;

/**
 * A data class for character Feats
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Feat extends FeatPrerequisite{
	public static final Feat NullFeat = new Feat();
	private ObjectProperty<FeatPrerequisite> prerequisite;
	private StringProperty benefit;
	private ObjectProperty<Effect> effect;

	/**
	 * @returns a StringProperty
	 */
	public StringProperty nameProperty() {
		return Name;
	}

	/**
	 * @returns an ObjectProperty of prerequistite
	 */
	public ObjectProperty<FeatPrerequisite> prerequisitePropety() {
		return prerequisite;
	}

	/**
	 * @returns a StringProperty
	 */
	public StringProperty benifitProperty() {
		return benefit;
	}

	/**
	 * @returns an ObjectProperty of Effect
	 */
	public ObjectProperty<Effect> effectProperty() {
		return effect;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return Name.get();
	}

	/**
	 * @return the prerequisite
	 */
	public FeatPrerequisite getPrerequisite() {
		return prerequisite.get();
	}

	/**
	 * @return the benefit
	 */
	public String getBenefit() {
		return benefit.get();
	}

	/**
	 * @return the effect
	 */
	public Effect getEffect() {
		return effect.get();
	}

	/**
	 * @param effect
	 */
	public void setEffect(Effect effect) {
		this.effect.set(effect);
	}

	/**
	 * constructor for Kryo
	 */
	public Feat() {
		this.Name.set("-");
		this.prerequisite = new SimpleObjectProperty<FeatPrerequisite>();
		this.benefit = new SimpleStringProperty("-");
		this.Description.set("-");
		this.effect = new SimpleObjectProperty<Effect>(new MiscEffect("-", "-"));
	}

	/**
	 * @param name
	 * @param prerequisite
	 * @param benefit
	 * @param effect
	 */
	public Feat(String name, FeatPrerequisite prerequisite, String benefit, Effect effect) {
		this.Name.set(name);
		this.prerequisite = new SimpleObjectProperty<FeatPrerequisite>(prerequisite);
		this.benefit = new SimpleStringProperty(benefit);
		this.Description.set(benefit);
		this.effect = new SimpleObjectProperty<Effect>(effect);
	}
	
	/**
	 * a toString method
	 */
	public String toString() {
		return this.getName();
	}
}
