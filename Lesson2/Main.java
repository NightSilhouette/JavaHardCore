package JK.Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            int a = result(arr);
            System.out.println(a);
        } catch (MyArraySizeException a) {
            System.out.println("Размер масива превышен");
        } catch (MyArrayDataException a) {
            System.out.println("Неправельное значение." + a.i + "x" + a.j);
        }
    }

    public static int result(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("message");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("message");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException a) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
