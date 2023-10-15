package futbol;

public class Portero extends Futbolista {
	private short golesRecibidos;
	private byte dorsal;
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
	
	 public int compareTo(Portero f) {
	    	
	    	return Math.abs( this.getGolesRecibidos()-f.getGolesRecibidos());
	    	
	    	
	    		
	    	
	    	
	    	
	    }
	 public  boolean jugarConLasManos(){
		 return true;
	 }
	
	
	
	

}
