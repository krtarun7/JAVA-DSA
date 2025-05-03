package OOPs;

public class MyEmployee {
    public static void main(String[] args) {
        Emp ob=new Emp();
        ob.setId(12);
        ob.setName("Kumar Tarun");
        System.out.println(ob.getId());
        System.out.println(ob.getName());
    }
}
class Emp{
    private int id;
    private String name;

    //Creating a constructor
     public Emp(){
         id=0;
         name="Tarun kumar";
     }

     //Constructor overloading
     public Emp(String myName,int myId){
         id=myId;
         name=myName;
     }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

