public class Circle extends Shape {
    //hekef = 2*pi*r     area= r*r*pi      pi =3.14
    //DATA     hekef, area
    double r;

    //fun   ctor--tostring---override calchekef calcarea


    public Circle(Double area, Double hekef, double r) {
        super(area, hekef);
        this.r = r;
    }

    @Override
    void calcArea() {
        this.area=r*r*3.14;
    }

    @Override
    void calcHekef() {
        this.hekef=2*r*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
