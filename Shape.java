public class Shape {
    //DATA

    Double area;
    Double hekef;

    //fun'

    public Shape(Double area, Double hekef) {
        this.area = area;
        this.hekef = hekef;
    }

    void calcArea(){

    }
    void  calcHekef(){

    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
