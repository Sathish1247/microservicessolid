package com.l;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width,int height) {
    	this.width=width;
    	this.height=height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
    
    public int getWidth(){
    	return this.width;
    }
    
    public int getHeight() {
    	return this.height;
    }
    public Rectangle() {
    	
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; 
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
    
    @Override
    public int getArea() {
        return width * width;
    }
}

class Test {
	 static void getAreaTest(Rectangle r) {
	      r.setHeight(10);
	      System.out.println("Expected area of rectangle is " + r.getArea());
	  }
	 
	 static void getAreaTest(Square sq) {
	      System.out.println("Expected area of sqaure is "+ sq.getArea());
	  }

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(2, 3);
	      getAreaTest(rc);

	      Rectangle sq = new Square();
	      sq.setWidth(5);
	      getAreaTest(sq);
	  }
	}
