package pathfinder.data.Classes.Objects;

/**
 * A static class that is used to check if an experience value
 * reaches the threshold needed to level up
 * 
 * @author Real Standard Studios - Matthew Meehan 
 */
public class AdvancmentTable {
	public static LevelOption IsLeveled(int expValue, int track) {

		// set to level one by default in case the track is wrong some how
		LevelOption result = LevelOption.LevelOne;
		// Slow track
		if (track == 0) {
			if (expValue < 3000)
				result = LevelOption.LevelOne;
			else if (expValue < 7500)
				result = LevelOption.LevelTwo;
			else if (expValue < 14000)
				result = LevelOption.LevelThree;
			else if (expValue < 23000)
				result = LevelOption.LevelFour;
			else if (expValue < 35000)
				result = LevelOption.LevelFive;
			else if (expValue < 53000)
				result = LevelOption.LevelSix;
			else if (expValue < 77000)
				result = LevelOption.LevelSeven;
			else if (expValue < 115000)
				result = LevelOption.LevelEight;
			else if (expValue < 160000)
				result = LevelOption.LevelNine;
			else if (expValue < 235000)
				result = LevelOption.LevelTen;
			else if (expValue < 330000)
				result = LevelOption.LevelEleven;
			else if (expValue < 475000)
				result = LevelOption.LevelTwelve;
			else if (expValue < 665000)
				result = LevelOption.LevelThirteen;
			else if (expValue < 955000)
				result = LevelOption.LevelFourteen;
			else if (expValue < 1350000)
				result = LevelOption.LevelFifteen;
			else if (expValue < 1900000)
				result = LevelOption.LevelSixteen;
			else if (expValue < 2700000)
				result = LevelOption.LevelSeventeen;
			else if (expValue < 3850000)
				result = LevelOption.LevelEighteen;
			else if (expValue < 5350000)
				result = LevelOption.LevelNineteen;
			else if (expValue >= 5350000)
				result = LevelOption.LevelTwenty;
		}
		// Medium Track
		else if (track == 1) {
			if (expValue < 2000)
				result = LevelOption.LevelOne;
			else if (expValue < 5000)
				result = LevelOption.LevelTwo;
			else if (expValue < 9000)
				result = LevelOption.LevelThree;
			else if (expValue < 15000)
				result = LevelOption.LevelFour;
			else if (expValue < 23000)
				result = LevelOption.LevelFive;
			else if (expValue < 35000)
				result = LevelOption.LevelSix;
			else if (expValue < 51000)
				result = LevelOption.LevelSeven;
			else if (expValue < 75000)
				result = LevelOption.LevelEight;
			else if (expValue < 105000)
				result = LevelOption.LevelNine;
			else if (expValue < 155000)
				result = LevelOption.LevelTen;
			else if (expValue < 220000)
				result = LevelOption.LevelEleven;
			else if (expValue < 315000)
				result = LevelOption.LevelTwelve;
			else if (expValue < 445000)
				result = LevelOption.LevelThirteen;
			else if (expValue < 635000)
				result = LevelOption.LevelFourteen;
			else if (expValue < 890000)
				result = LevelOption.LevelFifteen;
			else if (expValue < 1300000)
				result = LevelOption.LevelSixteen;
			else if (expValue < 1800000)
				result = LevelOption.LevelSeventeen;
			else if (expValue < 2550000)
				result = LevelOption.LevelEighteen;
			else if (expValue < 3600000)
				result = LevelOption.LevelNineteen;
			else if (expValue >= 3600000)
				result = LevelOption.LevelTwenty;
		}
		// Fast Track
		else if (track == 2) {
			if (expValue < 1300)
				result = LevelOption.LevelOne;
			else if (expValue < 3300)
				result = LevelOption.LevelTwo;
			else if (expValue < 6000)
				result = LevelOption.LevelThree;
			else if (expValue < 10000)
				result = LevelOption.LevelFour;
			else if (expValue < 15000)
				result = LevelOption.LevelFive;
			else if (expValue < 23000)
				result = LevelOption.LevelSix;
			else if (expValue < 34000)
				result = LevelOption.LevelSeven;
			else if (expValue < 50000)
				result = LevelOption.LevelEight;
			else if (expValue < 71000)
				result = LevelOption.LevelNine;
			else if (expValue < 105000)
				result = LevelOption.LevelTen;
			else if (expValue < 145000)
				result = LevelOption.LevelEleven;
			else if (expValue < 210000)
				result = LevelOption.LevelTwelve;
			else if (expValue < 295000)
				result = LevelOption.LevelThirteen;
			else if (expValue < 425000)
				result = LevelOption.LevelFourteen;
			else if (expValue < 600000)
				result = LevelOption.LevelFifteen;
			else if (expValue < 850000)
				result = LevelOption.LevelSixteen;
			else if (expValue < 1200000)
				result = LevelOption.LevelSeventeen;
			else if (expValue < 1700000)
				result = LevelOption.LevelEighteen;
			else if (expValue < 2400000)
				result = LevelOption.LevelNineteen;
			else if (expValue >= 2400000)
				result = LevelOption.LevelTwenty;
		}

		return result;
	}
}
