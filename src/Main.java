import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //   int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr2));


//        String[] arr = new String[]{"Hello", "World"};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length(); j++) {
//                System.out.println(arr[i].charAt(j));
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//           sum += arr[i];
//        }
//        System.out.println(sum);

//        int[][] arr = new int[3][3];
//        arr[0][0] = 1;
//        arr[1][1] = 1;
//        arr[2][2] = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        //динамические массивы


//        arrayList.add(10);
//        arrayList.add(15);
//        arrayList.add(20);
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//        arrayList.set(1, 30);
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.indexOf(30));
//        arrayList.size() // размер массива
//        arrayList.toArray();

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int price = scanner.nextInt();
        while (price != 0) {
            arrayList.add(price);

            price = scanner.nextInt();
        }
        int sum = 0;
        int max = 0;
        System.out.println(sum);

        for (int i = 0; i < arrayList.size(); i++) {
            if (max <= arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        System.out.println(arrayList);
        System.out.println(sum);
        System.out.println(max);
    }


}
