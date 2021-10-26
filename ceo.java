public class ceo extends worker{
    //data     name height weight haircolor salary id
    String car;


    //func'


    //super(name, height, weight, hairColor,id,salary)



    public ceo(String name, Double height, int weight, String hairColor, int salary, String car, int id) {
        super(name, height, weight, hairColor, salary,id);
        this.car = car;
    }

    @Override
    void walk(){
        System.out.println("im ceo and iam walking");
    }
    void manage(){
        System.out.println("manging");
    }

    @Override
    public String toString() {
        return "ceo{" +
                "car='" + car + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hairColor='" + hairColor + '\'' +
                ", salary=" + salary +
                '}';
    }
}
