public class Helper{
    public static double CalcFare(double distance, double Price){
        return distance*Price;
    }
    
    public static void PrintThanks(String CustomerName, String CabType,double TotalFare){
        System.out.println("Yoour Ride is confirmed with "+CabType);
        System.out.println("Customer :"+CustomerName);
        System.out.println("Total Price :"+TotalFare);
        System.out.println("Have a Safe and Wonderful Trip!!");
    }
}