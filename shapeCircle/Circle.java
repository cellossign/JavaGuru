package shapeCircle;

class Circle extends Shape {
    private int r;
    public Circle(int aX, int aY, int aR) {
        super(aX, aY);
        r = aR;
    }
    @Override
    public String toString() {
        return super.toString()   + ", radius: " + r;
    }
}