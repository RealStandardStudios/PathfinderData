package pathfinder.data.Races;

import pathfinder.data.Skills.Skill;

/**
 * 
 * @author Joshua Boyd
 *
 * A trait for when a race has one or more skills
 */
public class SkillTrait extends Trait {
	private Skill skill[];
	private String bonusType;
	//shows if its like a racial trait or curumstance bonus
        private String bonusAgainst;
        //for if the bonus is for certian events.
        //E.G. idenifying lawful good outsiders
}
