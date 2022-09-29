public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] array; //Declaration
        array = new int[10]; //Instantiation

        //Initialization
        for (int i= 0; i < array.length; i++) {
            array[i] = (i +1) * 100;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
