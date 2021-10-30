package taller3.televisores;

public class TV {
	private Marca marca;
	public int canal=1;
	private int precio=500;
	int volumen=1;
	public boolean estado=false;
	Control control;
	private static int numTV=0;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
	    this.estado = estado;
	    TV.numTV ++;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}




	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getVolumen() {
		return volumen;
	}


	public void setVolumen(int volumen) {
		this.volumen = volumen;
		
	}

	static public int getNumTV() {
		return TV.numTV;
	}
	
	static public void setNumTV(int numtv) {
		numTV = numtv;
	}
	public Control getControl() {
		return control;
	}


	public void setControl(Control control) {
		this.control = control;
	}    
	    
	public int getCanal() {
		return canal;
	}


	public void setCanal(int canal) {
		 if(estado==false) {
			 return;
		 }
		 if(canal>=1 || canal <=120) {
			this.canal=canal;
		}	
	}
	public void volumenDown() {
		if ( estado == false || volumen==0) {
			return;
		}
		else {
			volumen --;
		}
	}
	public void volumenUp() {
		if ( estado== false|| volumen==7) {
			return;
		}
		else {
			volumen ++;
		}
	}
	
	
	public void canalDown() {
		if ( estado== false|| canal==0) {
			return;
		}
		else {
			canal ++;
		}
	}
	
	
	
	public void canalUp() {
		if ( estado== false|| canal==120) {
			return;
		}
		else {
			canal ++;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void turnOn() {
		estado = true;
	}
	
}
	
	   

	
	
	
	
	
		
	
	
	
	









	