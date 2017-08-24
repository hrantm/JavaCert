package ch7;

public abstract class CallCenterEmployee {

	private boolean available;
	
	public abstract int getPriority();
	
	public boolean isAvailable(){
		return this.available;
	}

	public void toggleAbalability() {
		this.available = !this.available;
	};

}
