package dispensable;

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    coordinates.add(new Coordinates(5, 3));
    coordinates.add(new Coordinates(16, 10));
    
    double distance = Coordinates.calculateDistance(coordinates.get(0), coordinates.get(1));

    System.out.print(distance);
  }
}

class Coordinates{
  
  private int x, y;

  Coordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  public String getAllCoordinates(){
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
  
  public static double calculateDistance(Coordinates c1, Coordinates c2) {
    int delta_X = Math.abs(c2.getX() - c1.getX());
    int delta_Y = Math.abs(c2.getY() - c1.getY());
    return Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));
  }
}