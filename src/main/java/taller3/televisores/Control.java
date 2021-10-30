package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control = this;
		
		
	}
	
	
	
	public TV getTv() {
		return tv;
	}



	public void setTv(TV tv) {
		this.tv = tv;
	}



	public void turnOn() {
		this.tv.turnOn();
	}

	public void turnOff() {
		this.tv.turnOff();
	}
	
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
		
	}	
	
	public void canalUp() {
		tv.canalUp();
		
	}
	public void canalDown() {
		tv.canalDown();
	}
	
	
	public void volumenDown() {
		tv.volumenDown();
	}
		
	
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	
			
}			 	
	
	
	

