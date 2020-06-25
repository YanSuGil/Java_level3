import java.util.ArrayList;
import java.util.Arrays;

public class Main_Class {

    public static void main(String[] args) {

        // Задание 1
        String[] array = new String[]{"a","b","c","d"};
        System.out.println(Arrays.deepToString(array));

        swap(array, 1, 3);
        System.out.println(Arrays.deepToString(array));

        // Задание 2
        ArrayList<String> arrList = toArrayList(array);

        // Задание 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> appleBox = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> orangeBox1 = new Box<Orange>(orange1, orange2);
        Box<Orange> orangeBox2 = new Box<Orange>(orange3, orange4, orange5);

        System.out.println(orangeBox2.getWeight());
        System.out.println(appleBox.compared(orangeBox1));
        System.out.println(orangeBox1.compared(orangeBox2));

        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getWeight());

        orangeBox1.sprinkle(orangeBox2);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());

    }

    public static void swap(Object[] array, int first, int second) {
        Object tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}