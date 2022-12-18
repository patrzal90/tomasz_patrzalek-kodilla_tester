public class Notebook {
    static int weight;
    static int price;
    static int year;

    public Notebook(int weight, int price, int year)
    {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }public void checkPrice(){
        if (price < 900){
            System.out.println("This notebook is very cheap.");}
        else if (price<1000 && price>600) {
            System.out.println("The price is good.");}
        else if (price>1000){
            System.out.println("This notebook is expensive.");}
    }public void checkWeight(){
        if (weight < 1100){
            System.out.println("This Laptop is light");
        }else if (weight>1200 && weight<1500){
            System.out.println("It's not to heavy");
        }else if (weight> 1500){
            System.out.print("heavy as hell");
        }
    }
    public void yearAndPrice(){
    if (year>2014 && price<900){
        System.out.println("a good choise");}
    else if (year<2011 && price>1100){
        System.out.println("just say no");}
    else{
        System.out.println("think again about what you need");
    }
    }

        }
