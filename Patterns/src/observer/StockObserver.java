package observer;

public class StockObserver implements Observer{
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	private static int observerIdTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIdTracker;
		
		System.out.println("New observer: " + observerID);
		
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}
	
	public void printThePrices(){
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
	}

	public int getObserverID() {
		return observerID;
	}

}
