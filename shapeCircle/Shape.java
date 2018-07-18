package shapeCircle;

class Shape {
    private int x, y;
    public Shape (int aX, int aY) {
        x = aX; y = aY;
    }
    @Override
    public String toString() {
        return "Coord: " + x + " " + y;
    }
}