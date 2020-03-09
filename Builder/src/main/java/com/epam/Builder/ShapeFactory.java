package com.epam.Builder;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }
	      return null;
	   }
	}

