package cl.cmartinez.varios;

public class SuperCool {
	static String os = "";

	void doStuff() {
		os += "super";
	}
}

class Cool extends SuperCool {
	public static void main(String[] args) {
		new Cool().go();
	}

	void go() {
		SuperCool s = new Cool();
		Cool c = (Cool) s;
		c.super.doStuff();
		this.super.doStuff();
		c.doStuff();
	}
	
	void doStuff()
	{
		os += "cool";
	}
}
