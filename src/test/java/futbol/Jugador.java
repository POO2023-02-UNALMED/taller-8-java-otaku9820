package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
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
public int compareTo(Object f) {
    	Jugador nuevoJugador=(Jugador)f;
    	return Math.abs( this.getEdad()-nuevoJugador.getEdad());
    	
    	
    		
    	
    	
    	
    }
public String toString() {
	return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
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
