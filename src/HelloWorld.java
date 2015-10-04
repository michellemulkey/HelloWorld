import java.util.StringTokenizer;

import Day6.*;

public class HelloWorld {

	static final double EARTH_RADIUS = 3959.0; //final = assigned once, static = shared (not an instance variable)
			
	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("Is there anybody out there?");	
		System.out.println("Just nod if you can hear me.");	
		System.out.println("Is there anyone at home?");		
		Sphere earth = new Sphere(EARTH_RADIUS, "black", false);
		System.out.printf("Come on, now, the entire area of the World is only %.2f square miles \n", earth.getSurfaceArea());
        System.out.println(earth.printSphere());
		System.out.println(earth.toString()); //uses GeometricObject method
		System.out.println(earth.getClass().getName()); //Sphere 
		System.out.println(Sphere.class.toString()); //Sphere
		System.out.println(GeometricObject.class.toString());
		System.out.println(Object.class.toString());
		
		/*
		I hear you're feeling down.
		Well I can ease your pain
		Get you on your feet again.
		Relax.
		I'll need some information first.
		Just the basic facts.
		Can you show me where it hurts?		
		*/
		
		//Teach yourself Java in 21 days...
		
		//Day 1
		VolcanoRobot dante = new VolcanoRobot();
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        
        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
        
        //Day 2
        
        //Day 3
        StringTokenizer st1, st2;
        
        String quote1 = "FFFDX 14.65 0.0";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        
        String quote2 = "COL@80.55@-0.45";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());  
        
        //Day 6. Packages, Interfaces, and Other Class Features
        System.out.println("Starting with " +
        		InstanceCounter.getCount() + " objects");
        for (int i = 0; i < 500; ++i)
            new InstanceCounter();
        System.out.println("Created " +
                InstanceCounter.getCount() + " objects");

        
        // Day 7 Threads and Exceptions
        // Threads are objects that implement the Runnable interface or extend the Thread clas
        System.out.println("I'll be back!");       
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException ie) {
            // do nothing
        }   
        System.out.println("I'm back!");
        
        // runs forever...
        StockTicker tix = new StockTicker();
        Thread tickerThread = new Thread(tix);   
        tickerThread.start();
        
        PrimeFinder finder10 = new PrimeFinder(10);
        PrimeFinder finder100 = new PrimeFinder(100);         
        
     }
}
