public class worker extends person {
    //data
    //String Name;
    //Double height;
    //int weight;
    //String hairColor;
    int salary;

    public worker(String name, Double height, int weight, String hairColor, int id, int salary) {
        super(name, height, weight, hairColor, id);
        this.salary=salary;
    }

    //fun'


    // void walk(){
   //     System.out.println("walking");
   // }
   // void talk() {
   //     System.out.println("talking");
   // }
    @Override
    void walk(){
        System.out.println("Running");
    }

    void work(){
        System.out.println("working");
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hairColor='" + hairColor + '\'' +
                ", salary=" + salary +
                '}';
    }
}
