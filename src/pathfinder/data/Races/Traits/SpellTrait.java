package pathfinder.data.Races.Traits;

import pathfinder.data.Effects.Effect;
import pathfinder.data.Spells.Spell;

/**
 * A {@link Trait} that gives the user a new spell
 * 
 * @Author Real Standard Studios - Joshua Boyd, Matthew Meehan
 */
public class SpellTrait extends Trait {
	// which spell they have
	private Spell spell;
	
	// how many times they can cast it per day.
	private int amount;
	
	// if true, there will be modifications to the spell
	private boolean spellEdit;
	
	// tells you what needs to be modified
	private String conditionModifier;

	/**
	 * 
	 */
	public SpellTrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Creates an {@link Trait} that gives the user a new spell
	 * @param name the name of the Trait
	 * @param effect the effect of the trait
	 * @param amount the number of times the spell can be cast per day
	 * @param Spell the spell gained
	 */
	public SpellTrait(String name, Effect effect, Spell spell, int amount) {
		super(name, effect);
		this.spell = spell;
		this.amount = amount;
	}
	
	
}
