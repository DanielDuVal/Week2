package Menu;

public class SeattleBakery extends Bakery {

		Cake createCake(String item) {
	        	if (item.equals("angel")) {
	            		return new SeattleAngelFoodCake();
	        	} else if (item.equals("sponge")) {
	        	    	return new SeattleSpongeCake();
	        	} else if (item.equals("carrot")) {
	        	    	return new SeattleCarrotCake();
	        	} else return null;
		}
	}