public class HelloWorld {

	static final double EARTH_RADIUS = 3959.0; //final = assigned once, static = shared
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Is there anybody out there?");	
		System.out.println("Just nod if you can hear me.");	
		System.out.println("Is there anyone at home?");		
		Sphere earth = new Sphere(EARTH_RADIUS, "black", false);
		System.out.printf("Come on, now, the entire area of the World is only %.2f square miles \n", earth.getSurfaceArea());
        System.out.println(earth.printSphere());
		System.out.println(earth.toString());
		/*
		I hear you're feeling down.
		Well I can ease your pain
		Get you on your feet again.
		Relax.
		I'll need some information first.
		Just the basic facts.
		Can you show me where it hurts?		
		*/
     }
}
