package Futbol;

public class Jugador extends Futbolista {
	private short golesMarcados;
	private byte dorsal;
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nombre, int edad, String posicion,short goles, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados=goles;
		this.dorsal=dorsal;
	}
public int compareTo(Futbolista f) {
    	
    	return Math.abs( this.getEdad()-f.getEdad());
    	
    	
    		
    	
    	
    	
    }
public String toString() {
    return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + " años, y juega de " + this.getPosicion()
            + " con el dorsal " + dorsal + ". Ha marcado " + this.golesMarcados + " goles.";
}
public boolean jugarConLasManos() {
	if (this.getPosicion().equals("portero")){
		return true;
		
	}
	else {
		return false;
	}
	
}


	
	

}
