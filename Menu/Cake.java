package Menu;

	public abstract class Cake {
		String name;
		String icing;
		String fruit;
		String cream;
	 
		void prepare() {
			System.out.println("Preparing " + toString());
			
		}
	  
		void bake() {
			System.out.println("Baking...");
		}
		
		void cool() {
			System.out.println("Setting out to cool...");
		}
		
		void decorate() {
			System.out.println("Decorating...");
		}
	  
		void box() {
			System.out.println("Gently transfer cake to box");
		}
		
			public String getName() {
				return name;
			}

			public String toString() {
				StringBuffer display = new StringBuffer();
				display.append(name);
				if(icing != null)
					display.append(" with " + icing);
				if((fruit != null) && (cream != null))
					display.append(", " + fruit);
				else if (fruit != null)
					display.append(" and " + fruit);
				if(cream != null)
					display.append(" and " + cream);
				return display.toString();
			}
		}
