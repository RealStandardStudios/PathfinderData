package pathfinder.data.Races.Traits;

import pathfinder.data.Spells.Spell;

/**
 * 
 * @author Joshua Boyd
 * 
 * Please explain this to me also josh - Matthew
 */
public class SpellTrait extends Trait{
	private Spell spell;
        //which spell they have
	private int amount;
        //how many times they can cast it per day.
        private boolean spellEdit;
        //if true, there will be modifications to the spell
        private String condutionModifier;
        //tells you what needs to be modified        
}
