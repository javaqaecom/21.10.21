public class main {
    public static void main(String[] args) {

        Triangle t1= new Triangle(0d,0d,9d,12d,14d,8d);
        System.out.println(t1);
        t1.calcHekef();
        t1.calcArea();
        System.out.println(t1);

        Circle c1 = new Circle
                (0d,0d,5.88);
        c1.calcArea();
        c1.calcHekef();
        System.out.println(c1);

    }
}
