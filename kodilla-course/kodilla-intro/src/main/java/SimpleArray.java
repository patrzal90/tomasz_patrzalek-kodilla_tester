public class SimpleArray {
    public static void main(String[] args){
        String[] animals = new String [5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "bee";
        animals[3] = "rhino";
        animals[4] = "wolf";

        String animal = animals[2];
        System.out.println(animal);
        int numberOfElements = animals.length;

        System.out.println("Ilość elementów mojej tablicy to " + numberOfElements);

    }
}
