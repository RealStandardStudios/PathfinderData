package pathfinder.data.Feats;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Effects.Effect;

/** 
 * A data class for character Feats
 * @author Real Standard Studios - Matthew Meehan 
 */
public class Feat {
	private StringProperty name;
	private ObjectProperty<Feat> prerequisite;
	private StringProperty benefit;
	private ObjectProperty<Effect> effect;
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public ObjectProperty<Feat> prerequisitePropety() {
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
	public Feat getPrerequisite() {
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
	}

	public Feat(String name, Feat prerequisite, String benefit) {
		this.name = new SimpleStringProperty(name);
		this.prerequisite = new SimpleObjectProperty<Feat>(prerequisite);
		this.benefit = new SimpleStringProperty(benefit);
	}
}
