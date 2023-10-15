package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad,"portero" );
		this.golesRecibidos=goles;
		this.dorsal=dorsal;
		// TODO Auto-generated constructor stub
	}
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	 public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + "juega de " + getPosicion()
                + " con el dorsal " + getDorsal() + ". Le han marcado " + golesRecibidos + " goles.";
    }
	
	 public int compareTo(Object f) {
		    
		        Portero otroPortero = (Portero) f;
		        return Math.abs(this.getGolesRecibidos() - otroPortero.getGolesRecibidos());}
		    
	 public  boolean jugarConLasManos(){
		 return true;
	 }
	
	
	
	

}