public class DrBob {

    public class Canvas {
        private Position size;
    }

    public class Circle {
        private String color; // color in String
        private int radius; // radius in cm
        private Position position; // position in (x,y)-coordinates, Position is its own class
        private boolean filling; // flag if the shape should be filled or not, true = filled, false = not filled

    }

    public class Trianlge {
        private String color; // color in String
        private int tagentSize; // tagentSize in cm
        private Position position; // position in (x,y)-coordinates, Position is its own class
        private boolean filling; // flag if the shape should be filled or not, true = filled, false = not filled

    }

    public class Square {

        private String color; // color in String
        private int size; // size in cm
        private Position position; // position in (x,y)-coordinates, Position is its own class
        private boolean filling; // flag if the shape should be filled or not, true = filled, false = not filled
    }

    public class Rectangle {
        private String color; // color in String
        private SizeRectangle sizes; // sizes A and B in cm stored in one custom datatype
        private Position position; // position in (x,y)-coordinates, Position is its own class
        private boolean filling; // flag if the shape should be filled or not, true = filled, false = not filled
    }

    public class Position {
        private int xPos;
        private int yPos;
    }

    public class SizeRectangle {
        private int sizeA;
        private int sizeB;
    }

}
