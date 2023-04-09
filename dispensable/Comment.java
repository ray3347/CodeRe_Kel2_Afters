//comment
package dispensable;

import java.util.ArrayList;

public void calculateArea(String shapeType, int side, int width) {
    int area = 0;

    if (shapeType == "square") {
        area = side * side;
    } else if (shapeType == "rectangle") {
        area = side * width;
    } else if (shapeType== "circle") {
        area = 3.14 * side * side;
    }

    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public static void main(String[] args) {
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        calculateArea("square", squareSide, 0);
        calculateArea("rectangle", rectangleWidth, rectangleHeight);
        calculateArea("circle", circleRadius, 0);
    }
}