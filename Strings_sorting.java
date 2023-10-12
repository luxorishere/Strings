import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Anju_Class {
    public static void main(String[] args) {
        String[] arr1 = string_input();
        System.out.println(start(arr1));
        System.out.println(Arrays.toString(sort(arr1)));

    }

    static String[] string_input() {
        System.out.println("Enter the length");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("Enter the Strings now");
        String[] string_array = new String[length];
        for (int i = 0; i < length; i++) {
            string_array[i] = input.next();
        }
        return string_array;
    }

    static ArrayList<String> start(String[] string_array) {
        int length = string_array.length;
        ArrayList<String> list = new ArrayList<>();
        while (length != 0) {
            list.clear();
            for (int i = 0; i < string_array.length - 1; i++) {
                list.add(arrangement(string_array[i], string_array[i + 1], i, i + 1, string_array));

            }
            list.add(string_array[string_array.length - 1]);
            length--;
        }
        String[] ans = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return list;
    }

    static String arrangement(String first, String second, int first_index, int second_index, String[] array) {
        int[] arr = new int[first.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = first.charAt(i);
        }
        int[] arr1 = new int[second.length()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = second.charAt(i);

        }
        return stringcheck(arr, arr1, first, second, array, first_index, second_index);

    }

    static String stringcheck(int[] first, int[] second, String first_array, String second_array, String[] array, int first_index, int second_index) {
        if (first[0] < second[0]) {
            return first_array;
        } else {
            swap(array, first_index, second_index);
            return second_array;
        }

    }

    static void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    static String[] sort(String[] arr){
        int length = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    swap(arr , j , j + 1);
                }
            }
        }
        return arr;
    }
}
