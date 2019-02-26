package cl.cmartinez.varios;

public class SFia {
	public static void main(String[] args) 
	{
		/*short x = 5;
		short y = 10;
		short z = (short) (x + y);*/
		
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false);
		//System.out.println(x+", "+y+", "+z);
		
		// comparador
		
		/*Integer uno = 1;
		Integer dos = 2;
		Integer tres = 3;
		Integer otrotres = new Integer(3);
		
		System.out.println("uno compareTo dos => " + uno.compareTo(dos));
		System.out.println("uno compareTo tres => " + uno.compareTo(tres));
		System.out.println("dos compareTo uno => " + dos.compareTo(uno));
		System.out.println("dos compareTo tres => " + dos.compareTo(tres));
		System.out.println("tres compareTo uno => " + tres.compareTo(uno));
		System.out.println("tres compareTo dos => " + tres.compareTo(dos));

		System.out.println("tres compareTo otrotres => " + tres.compareTo(otrotres));
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.setNombre("Pedro");
		p1.setEdad(30);
		p2.setNombre("pedro");
		p2.setEdad(45);
		
		System.out.println("" + p1.getNombre() + " compareTo " + p2.getNombre() + " => " + p1.compareTo(p2));*/
		
		for(int i = 0; i < 10; i++)
		{
			i = ++i;
			System.out.println("Hola Mundo => " + i);
		}
		
	}
}
