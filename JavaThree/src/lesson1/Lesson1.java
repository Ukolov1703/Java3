package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[2];

        intArray[0] = 1;
        intArray[1] = 2;

        System.out.println(Arrays.deepToString(intArray));
        change(intArray,0,1);
        System.out.println(Arrays.deepToString(intArray));

        ArrayList<Integer> arrayList = toArrayList(intArray);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1,apple2,apple3);
        Box<Orange> box2 = new Box<Orange>(orange1,orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);

    }

    public static void change(Object[] array, int index1, int index2){
        Object tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static <T>ArrayList<T> toArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
    }
}
