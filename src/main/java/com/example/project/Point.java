package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public void setX(int x) {
      this.x = x;
  }

    public void setY(int y) {
      this.y = y;
  }

    public int getX(){ 
      return x;
    }

    public int getY(){ 
      return y;
    }
    public String toString() {
      return "(" + x + ", " + y + ")";
  }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "(" + x + ", " + y + ")";
    }
  }
  