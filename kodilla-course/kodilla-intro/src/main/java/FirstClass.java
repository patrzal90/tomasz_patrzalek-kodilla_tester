public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000,2015);
        System.out.println("Notebook weight and price is: " + Notebook.weight + "," + Notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000,1500,2010);
        System.out.println ("heavyNotebook weight and price is: " + heavyNotebook.weight + "," + heavyNotebook.price);
        heavyNotebook.checkPrice();
        Notebook oldNotebook = new Notebook(1200,500,2005);
        System.out.println ("oldNotebook weight and price is: " + oldNotebook.weight + "," + oldNotebook.price);
        oldNotebook.checkPrice();
    }
}
