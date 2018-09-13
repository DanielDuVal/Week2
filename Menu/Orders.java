package Menu;

public class Orders {
	 
	public static void main(String[] args) {
		Bakery boston = new BostonBakery();
		Bakery seattle = new SeattleBakery();
 
		Cake cake = boston.orderPizza("angel");
		System.out.println();
 
		cake = boston.orderPizza("sponge");
		System.out.println();

		cake = boston.orderPizza("carrot");
		System.out.println();
 
		cake = seattle.orderPizza("angel");
		System.out.println();
		
		cake = seattle.orderPizza("sponge");
		System.out.println();
 
		cake = seattle.orderPizza("carrot");
		System.out.println();
	}
}