package org.itstep;

import java.util.ArrayList;
import java.util.Iterator;

public class MyWorkMain {

	public static void main(String[] args) {
		Triangle one = new Triangle();
		Rectangle two = new Rectangle();
		Circle three = new Circle();
		three.setRadius(12);
		three.setArea((int) Math.PI * three.getRadius() * three.getRadius());
		;
		one.setHeight(20);
		one.setBase(45);
		one.setArea((int) (one.getBase() * one.getHeight() * 0.5));
		two.setLength(23);
		two.setWidth(12);
		two.setArea(two.getLength() * two.getWidth());
System.out.printf("Area our the circle %d\nArea our the triangle %d\n"
		+ "Area our the Rectangle %d\n", three.getArea(),one.getArea(), two.getArea());
ArrayList <Shapes> listOfShapes = new ArrayList<>();
listOfShapes.add(one);
listOfShapes.add(two);
listOfShapes.add(three);

for (int i = 0; i < listOfShapes.size(); i++) {
	System.out.println(listOfShapes.get(i).getArea());
	
}
for (Shapes shapes : listOfShapes) {
	System.out.println(shapes.getArea());
	
 }
String ip ="192.168.0.";
ArrayList<String> listOfIp = new ArrayList<>();
for (int i = 100; i<=199; i++){
	listOfIp.add(ip+i);
}
System.out.println(listOfIp.size());
System.out.println(listOfIp.get(listOfIp.size()-1));
	}

}
