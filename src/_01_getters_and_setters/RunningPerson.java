package _01_getters_and_setters;

public class RunningPerson {
	static Person a = new Person();
	static Person b = new Person();
	static Person c = new Person();
	public static void main(String[] args) {
		a.setSuperpower("laser vision");
		a.setName("Angel");
		String lololol = a.toString();
		b.setSuperpower("teleportation");
		b.setName("Hans");
		c.setSuperpower("flying");
		c.setName("Marker");
	
		System.out.println(lololol);
	}

	@Override
	public String toString() {
		
		String lol = a.getName(); 
		String lolol = a.getSuperpower();
		return lol + " has mad " + lolol + " skills.";
	}
	
}
