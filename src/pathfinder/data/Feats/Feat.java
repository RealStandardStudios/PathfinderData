package pathfinder.data.Feats;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.FeatPrerequisite;
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

	public StringProperty nameProperty() {
		return Name;
	}

	public ObjectProperty<FeatPrerequisite> prerequisitePropety() {
		return prerequisite;
	}

	public StringProperty benifitProperty() {
		return benefit;
	}

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

	public Effect getEffect() {
		return effect.get();
	}

	public void setEffect(Effect effect) {
		this.effect.set(effect);
	}

	public Feat() {
		this.Name.set("-");
		this.prerequisite = new SimpleObjectProperty<FeatPrerequisite>();
		this.benefit = new SimpleStringProperty("-");
		this.effect = new SimpleObjectProperty<Effect>(new MiscEffect("-", "-"));
	}

	public Feat(String name, FeatPrerequisite prerequisite, String benefit, Effect effect) {
		this.Name.set(name);
		this.prerequisite = new SimpleObjectProperty<FeatPrerequisite>(prerequisite);
		this.benefit = new SimpleStringProperty(benefit);
		this.effect = new SimpleObjectProperty<Effect>(effect);
	}
	
	public String toString() {
		return this.getName();
	}
}
