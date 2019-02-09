package cl.cmartinez.varios;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	@Override
	public int compareTo(Persona otraPersona) 
	{
		/*if(this.edad == otraPersona.getEdad())
		{
			return 0;
		}
		else if(this.edad > otraPersona.getEdad())
		{
			return 1;
		}
		else
		{
			return -1;
		}*/
		
		//return this.edad.compareTo(otraPersona.getEdad());
		
		return this.nombre.compareTo(otraPersona.getNombre());
	}

}
