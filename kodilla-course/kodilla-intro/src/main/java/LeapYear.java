public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        String nie = "nie jest przystępny";
        String tak = "jest przystępny";
        if (year%4>0){
            System.out.println(nie);}
        else if (year%4=0 && year%100=0 && year%400>0){
            System.out.println(nie);}
        else if (year%4=0 && year%100>0){
            System.out.println(tak);}
        else (year%4=0 && year%100=0 && year%400=0);{
            System.out.println(tak);}
        }
        }


