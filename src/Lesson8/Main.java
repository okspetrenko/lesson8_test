package Lesson8;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int result = 0;
        int numberNotrepeat = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            numberNotrepeat++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    number++;
                    break;
                }
            }
        }
        return result = numberNotrepeat - number;
    }
}