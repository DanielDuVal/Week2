package Menu;

public class BostonBakery extends Bakery {

	Cake createCake(String item) {
        	if (item.equals("angel")) {
            		return new BostonAngelFoodCake();
        	} else if (item.equals("sponge")) {
        	    	return new BostonSpongeCake();
        	} else if (item.equals("carrot")) {
        	    	return new BostonCarrotCake();
        	} else return null;
	}
}