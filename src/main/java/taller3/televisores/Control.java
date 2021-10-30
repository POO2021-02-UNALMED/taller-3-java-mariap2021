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
	
	
	public void canalUp() {
		if ( tv.estado== false|| tv.canal==120) {
			return;
		}
		else {
			tv.canal ++;
		}
	}
	public void canalDown() {
		if ( tv.estado== false|| tv.canal==1) {
			return;
		}
		else {
			tv.canal --;
		}
	}
	
	
	public void volumenDown() {
		if ( tv.estado == false || tv.volumen==0) {
			return;
		}
		else {
			tv.volumen --;
		}
	}
	
	
	public void volumenUp() {
		if ( tv.estado== false|| tv.volumen==7) {
			return;
		}
		else {
			tv.volumen ++;
		}
	}
	
	
	public void setCanal(int canal) {
		if (tv.estado==true) {
			if (canal>=1 || canal<=120) {
				this.tv.canal = canal;
		}
	}
	}			
}			 	
	
	
	

