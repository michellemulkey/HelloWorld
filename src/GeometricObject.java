
public class GeometricObject {
private String color = "blue";
private boolean anyoneHome;
private java.util.Date dateCreated;

public GeometricObject() {
	dateCreated = new java.util.Date();
}

public GeometricObject(String color, boolean anyoneHome) {
	dateCreated = new java.util.Date();
	this.color = color;
	this.anyoneHome = anyoneHome;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
public boolean isAnyoneHome() {
	return anyoneHome;
}

public void setAnyoneHome (boolean anyoneHome) {
	this.anyoneHome = anyoneHome;
}

public java.util.Date getDateCreated() {
	return dateCreated;
}

public String toString() {
	return "created on " + dateCreated + "\nanyone at home = " + anyoneHome;
}
}
