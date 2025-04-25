package OOPs;

public class GetterSetter {
    public static void main(String[] args) {
        check ob=new check();
        ob.setId(12);
        ob.setName("Tarun");
        System.out.println(ob.getId());
        System.out.println(ob.getName());
    }
}
class check{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
}