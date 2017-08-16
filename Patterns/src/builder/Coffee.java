package builder;

public class Coffee {
	
	private String milkType;
	private double milk;
	
	private String beanType;
	private double beans;
	
	private String sweetenerType;
	private double sweetener;
	
	private double whippedCream;
	private double cinnamon;
	
	private Coffee(String milkType, double milk, String beanType, double beans, String sweetenerType, double sweetener,
			double whippedCream, double cinnamon){
		this.milkType = milkType;
		this.milk = milk;
		
	}
	 
	public static class CoffeeBuilder{
		
		private String milkType;
		private double milk;
		
		private String beanType;
		private double beans;
		
		private String sweetenerType;
		private double sweetener;
		
		private double whippedCream;
		private double cinnamon;
		
		public CoffeeBuilder milkType(String milkType){
			this.milkType = milkType;
			return this;
		}
		
		public Coffee build(){
			return new Coffee(this.milkType, this.milk, this.beanType, this.beans, this.sweetenerType, this.sweetener, 
					this.whippedCream, this.cinnamon);
		}

	}

	public String toString(){
		return "Milk Type: " + this.milkType + "\nMilk: " + this.milk + "\nBean Type" + this.beanType + "\nBeans: " +
				this.beans + "\nSweetener Type: " + this.sweetenerType + "\nSweetener: " + this.sweetener +
					"\nWhipped Cream: " + this.whippedCream + "\nCinnamon: " + this.cinnamon;
	}

}
