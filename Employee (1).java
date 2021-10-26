public class Employee {
    //DATA
    String firstName;
    String lastName;
    double salary;
    int floor;
    int id;
    //func

    public Employee(String firstName, String lastName, double salary, int floor, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.floor = floor;
        this.id = id;
    }

    public void raiseSalary(){
        this.salary += 500;
    }

    void changeFloor(int newFloor){
        this.floor=newFloor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                ", id=" + id +
                '}';
    }
}
