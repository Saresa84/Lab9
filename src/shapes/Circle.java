package shapes;

import java.text.DecimalFormat;

public class Circle {
	
private double radius;

public Circle (){
	radius= 0.0;
}
public void setRadius(double radius){
	this.radius = radius;
}

public double getCircumference(){
	return 2 * Math.PI * radius;
}

public String getFormattedCircumference(){
	return formatNumber(getCircumference());
}

public double getArea(){
	return Math.PI * radius * radius;
}

public String getFormattedArea(){
	return formatNumber(getArea());
}

public String formatNumber(double x){
	DecimalFormat df = new DecimalFormat("#.00"); 
	String y =df.format(x);
	return  String.valueOf(y);
}
}
