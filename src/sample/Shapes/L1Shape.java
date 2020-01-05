package sample.Shapes;

import sample.Position;

public class L1Shape extends Shape {

    private Position position = Position.START;
    private int offset = 3;
    private int colorCode = 2;
    private boolean rotate = true;
    private int midPoint = 2;
    private int[][] shape = {
            {2,0,0},
            {2,2,2}
    };

    public L1Shape() {
        super.setPosition(position);
        super.setOffset(offset);
        super.setColorCode(colorCode);
        super.setRotate(rotate);
        super.setMidPoint(midPoint);
        super.setShape(shape);
    }

}
