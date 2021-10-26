public class main {

    public static void main(String[] args) {

        person p1= new person("hodi zoubi",184d,200,"black",22);
        System.out.println(p1);
        worker w1= new worker("nicki",155d,66,"black", 8000 ,33);
        System.out.println(w1);

        p1.walk();
        w1.walk();
        ceo c1 = new ceo("yaron",200d,93,"green",25000,"bmw z4",44);
        System.out.println(c1);
        c1.walk();
/*
        System.out.println(p1);
        p1.walk();
        System.out.println(w1);
        w1.walk();
        w1.work();
        System.out.println(c1);
        c1.walk();
        c1.work();
        c1.manage();


       /* Employee ameer= new Employee("ameer",
                "ecom",5000, 2,1);
        Employee shmulik = new Employee("shmulik",
                "ecom",12600d,8,314854987);
        Employee alex = new Employee("alex",
                "ecom",24200d,16,998877);

        System.out.println(ameer);
        System.out.println(shmulik);
        System.out.println(alex);

        shmulik.raiseSalary();
        shmulik.raiseSalary();
        alex.changeFloor(12);

        System.out.println(shmulik);
        System.out.println(alex);*/

    }
}
