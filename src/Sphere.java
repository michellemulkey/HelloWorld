

public class Sphere extends GeometricObject {
  double radius = 1;  // instance variable
  
  Sphere() {
  }
  
  Sphere (double newRadius) {
	  radius = newRadius;
  }
  
  Sphere (double newRadius, String color, boolean anyoneHome) {
	  radius = newRadius;
	  setColor(color);
	  setAnyoneHome(anyoneHome);
  }
  
  double getSurfaceArea() {
	  return 4 * radius * radius * Math.PI;
  }
  
  double getCircumference() {
	  return 2 * radius * Math.PI;
  }
  
  void setRadius(double newRadius) {
	  radius = newRadius;
  }
  
  public String printSphere() {
	  return ("created on " + super.getDateCreated() + "\nradius = " + radius);
	} 
  
}
