package Menu;


public abstract class Bakery {
 
	abstract Cake createCake(String item);
 
	public Cake orderPizza(String type) {
		Cake cake = createCake(type);
		cake.prepare();
		cake.bake();
		cake.cool();
		cake.decorate();
		cake.box();
		return cake;
	}
}