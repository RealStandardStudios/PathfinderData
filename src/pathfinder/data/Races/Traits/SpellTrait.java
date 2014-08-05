package pathfinder.data.Races.Traits;

import pathfinder.data.Spells.Spell;

/**
 * @Author Real Standard Studios - Joshua Boyd
 * @description A {@link Trait} that gives the user a new spell
 */
public class SpellTrait extends Trait {
	// which spell they have
	private Spell spell;
	// how many times they can cast it per day.
	private int amount;
	// if true, there will be modifications to the spell
	private boolean spellEdit;
	// tells you what needs to be modified
	private String condutionModifier;

}
