package Futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;

    // Constructor que recibe los valores para nombre, edad y posición
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Constructor por defecto que crea un Futbolista con valores predeterminados
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    // Resto de métodos y propiedades de la clase
    
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " años, y juega de " + posicion + ".";
    }
    
    public int compareTo(Futbolista f) {
    	
    	return this.edad-f.edad;
    	
    }
    public boolean equals(Futbolista f, Futbolista f2) {
    	if ((f.nombre.equals(f2.nombre)&& f.edad==f2.edad &&f.posicion.equals(f2.posicion))){
    		return true;
    		
    	}else {
    		return false;
    	}
    }
    public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
    
    
    
}