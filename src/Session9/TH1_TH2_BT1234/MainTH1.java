package Session9.TH1_TH2_BT1234;

public class MainTH1 {
    public static void main(String[] args) {
        System.out.println("---------SHAPE----------");
        Shape shape= new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);

        shape = new Shape("red", false) {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);

        System.out.println("---------CIRCLE----------");
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle(3.5);
        System.out.println(circle);

        circle=new Circle(3.5,"indigo",false);
        System.out.println(circle);

        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

//        System.out.println("---------COMPARABLE----------");
//        ComparableCircleTH1 circles[]=new ComparableCircleTH1[3];
//        circles[0]=new ComparableCircleTH1(3.6);
//        circles[1]=new ComparableCircleTH1();
//        circles[2]=new ComparableCircleTH1(3.7, "indigo2",false);
//        System.out.println("Pre-sorted:");
//        for (ComparableCircleTH1 comparableCircle : circles) {
//            System.out.println(comparableCircle);
//        }
//        Arrays.sort(circles);
//        System.out.println("After-sorted:");
//        for (ComparableCircleTH1 comparableCircle: circles) {
//            System.out.println(comparableCircle);
//        }
//        Circle circles2[]=new Circle[3];
//        circles2[0]=new Circle(3.8);
//        circles2[1]=new Circle();
//        circles2[2]=new Circle(3.9, "indigo3", false);
//        System.out.println("Pre-sorted: ");
//        for(Circle c:circles){
//            System.out.println(c);
//        }
//        Comparator circleComparator = new CircleComparatorTH2();
//        Arrays.sort(circles, circleComparator);
//        System.out.println("After-sorted");
//        for(Circle c:circles){
//            System.out.println(c);
//        }
        System.out.println("---------SQUARE----------");
        SquareBT1 square = new SquareBT1();
        System.out.println(square);
        square = new SquareBT1(2.3);
        System.out.println(square);
        square = new SquareBT1(5.8, "yellow", true);
        System.out.println(square);

        ResizableBT1 shapes[]=new ResizableBT1[3];
        shapes[0]=new Circle(2.0);
        shapes[1] = new Rectangle(3.0, 4.0);
        shapes[2] = new SquareBT1(5.0);
        double resizePercent = 20.0;

        for (ResizableBT1 s:shapes){
            System.out.println("before resize: ");
            System.out.println("Area: " + ((Shape)s).getArea());

            s.resize(resizePercent);

            System.out.println("After resizing with " + resizePercent + "%:");
            System.out.println("Area: " + ((Shape) s).getArea());
//            System.out.println(s.getClass().getSimpleName() + " Area: " + ((Shape) s).getArea());
            System.out.println();
        }

        Shape[] shapes1=new Shape[3];
        shapes1[0] = new Circle(2.0);
        shapes1[1] = new Rectangle(3.0, 4.0);
//        shapes[2] = new SquareBT1(5.0);
        shapes1[2] = new SquareBT1(4.0, "blue", true);
        for(Shape s:shapes1){
            System.out.println("Area: " + s.getArea());
//            System.out.println(s.getClass().getSimpleName() + " Area: " + s.getArea());
            if(s instanceof ColorableBT2){
                ((ColorableBT2) s).howToColor();
            }
            System.out.println();
        }
    }
}