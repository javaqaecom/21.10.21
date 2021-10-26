public class Triangle extends Shape {
    //DATA     hekef, area
    double a;
    double b;
    double c;
    double h;

    //fun'     calcArea(), calcHekef()


    public Triangle(Double area, Double hekef, double a, double b, double c, double h) {
        super(area, hekef);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    } //constructor

    @Override
    void calcArea(){
        this.area=a*h/2d;
    }
    @Override
    void calcHekef(){
        this.hekef=a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                ", hekef=" + hekef +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                '}';
    } // override to toString
}
