package cl.cmartinez.colegio.vista.impl.principal;

public class ItemComboBox {
	private String nombre;
	private Object valor;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString()
	{
		return nombre;
	}
}
