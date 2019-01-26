package cl.martinez.modulo6.mvc.model;

public class ModeloLogin extends ModeloAbstracto {

	public String buscarUsuario(String username) 
	{
		String password = null;
		
		switch (username)
		{
			case "Boris": password = "kaka"; break;
			case "Carlos": password = "pixi"; break;
			default: break;
		}
		
		return password;
	}

}
