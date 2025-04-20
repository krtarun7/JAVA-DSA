package OOPs;
public class Employee{
    public static void main(String[] args) {
        details ob=new details();
        ob.id=12;
        ob.name="Tarun kumar";
        ob.salary=12000;
        ob.printdetails();
        ob.getsalary();
    }
}

class details {
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println(id);
        System.out.println(name);
    }
    public int getsalary(){
        return salary;
    }
}

