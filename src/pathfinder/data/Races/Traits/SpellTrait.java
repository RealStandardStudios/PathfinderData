package pathfinder.data.Races.Traits;

import pathfinder.data.Effects.Effect;
import pathfinder.data.Spells.Spell;

/**
 * A {@link Trait} that gives the user a new spell
 * 
 * @Author Real Standard Studios - Joshua Boyd, Matthew Meehan
 */
public class SpellTrait extends Trait {
	private Spell spell;
	
	// how many times they can cast it per day.
	private int amount;
	
	// if true, there will be modifications to the spell
	private boolean spellEdit;
	
	// tells you what needs to be modified
	private String conditionModifier;
	
	/**
	 * gets which spell they have
	 * @return the spell
	 */
	public Spell getSpell() {
		return spell;
	}

	/**
	 * sets which spell they have
	 * @param spell the spell to set
	 */
	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the spellEdit
	 */
	public boolean isSpellEdit() {
		return spellEdit;
	}

	/**
	 * @param spellEdit the spellEdit to set
	 */
	public void setSpellEdit(boolean spellEdit) {
		this.spellEdit = spellEdit;
	}

	/**
	 * @return the conditionModifier
	 */
	public String getConditionModifier() {
		return conditionModifier;
	}

	/**
	 * @param conditionModifier the conditionModifier to set
	 */
	public void setConditionModifier(String conditionModifier) {
		this.conditionModifier = conditionModifier;
	}

	public SpellTrait() {
		super();
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
