public class Stringfunc {
    public static void main(String[] args) {
        String personalised=myGreet("Tarun kumar");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message="Hello "+ name;
        return message;
        
    }
}
