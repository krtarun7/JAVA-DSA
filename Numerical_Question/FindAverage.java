public class FindAverage {
    static double findaverage(double x, double y , double z){
        return (x+y+z)/3;
    }
    public static void main(String args[]){
        double average=findaverage(25,45,65);
        System.out.println("The average is: "+average);
    }
}
