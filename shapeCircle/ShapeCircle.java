package shapeCircle;

public class ShapeCircle {
    public static void main(String[] args)
    {
        Shape s = new Shape(10, 11);
        System.out.println(s);

//        shapeCircle.Circle c = new shapeCircle.Circle(3, 7, 1);
//        System.out.println(c);
//        s = c;
//        System.out.println(s);

        s = new Circle(3, 7, 1);// net, eto ne to zhe samoe))
        System.out.println(s);

    }
}