public class person {
    //data
    int id;
    String name;
    Double height;
    int weight;
    String hairColor;

    //func'
    public person(String name, Double height, int weight, String hairColor, int id) {
        this.name = name;
        this.id=id;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
    }

    void walk(){
        System.out.println("walking");
    }
    void talk(){
        System.out.println("talking");
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
