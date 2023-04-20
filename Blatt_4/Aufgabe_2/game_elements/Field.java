package game_elements;

public class Field {
    double lengthXAxis, lengthYAxis;
    double spacing;
    final String separator = "+";
    final String spacer = "    ";

    public Field(double diameter) {
        this.lengthXAxis = diameter;
        this.lengthYAxis = diameter;
        this.spacing = lengthXAxis / 3;
        draw(this.lengthXAxis, this.lengthYAxis);
    }

    private void draw(double lengthXAxis, double lengthYAxis) {
        boolean horizontalDone = false;
        boolean verticalDone = false;
        int horizontalStart = 0;
        int verticalStart = 0;
        int verticalPartial = 0;
        int horizontalPartial = 0;

        while (!verticalDone && !horizontalDone) {
            for (; verticalStart < this.spacing; verticalStart += 1) {
                for (int i = 0; i < spacing / 3; i++) {
                    System.out.print(spacer);
                }
                System.out.println(separator);
            }
            verticalPartial += spacing;

            if (verticalPartial >= lengthYAxis) {
                verticalDone = true;
            }
            verticalStart = 0;

            for (; horizontalStart < this.spacing; horizontalStart += 1) {
                /*
                for (int i = 0; i < spacing / 3; i++) {
                    System.out.print(" ");
                }

                 */
                System.out.print(separator + " ");
            }
            horizontalPartial += spacing;

            if (horizontalPartial >= lengthXAxis) {
                horizontalDone = true;
            }
            horizontalStart = 0;
        }
    }
}
