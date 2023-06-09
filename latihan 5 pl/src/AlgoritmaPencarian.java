public class AlgoritmaPencarian {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // a. Menampilkan semua nilai di dalam array
        System.out.println("a. Menampilkan semua nilai di dalam array:");
        displayArray(array);

        // b. Mencari sebuah angka di dalam array
        int target = 55;
        System.out.println("\nb. Mencari angka " + target + " di dalam array:");
        boolean found = searchNumber(array, target);
        if (found) {
            System.out.println(target + " ditemukan di dalam array.");
        } else {
            System.out.println(target + " tidak ditemukan di dalam array.");
        }

        // c. Menampilkan angka-angka ganjil di dalam array
        System.out.println("\nc. Menampilkan angka-angka ganjil di dalam array:");
        displayOddNumbers(array);

        // d. Menampilkan angka-angka kelipatan 3 di dalam array
        System.out.println("\nd. Menampilkan angka-angka kelipatan 3 di dalam array:");
        displayMultiplesOfThree(array);

        // e. Menampilkan angka-angka yang memiliki angka 2 di dalam array
        System.out.println("\ne. Menampilkan angka-angka yang memiliki angka 2 di dalam array:");
        displayNumbersWithDigitTwo(array);

        // f. Menampilkan angka-angka ganjil yang diapit oleh angka genap
        System.out.println("\nf. Menampilkan angka-angka ganjil yang diapit oleh angka genap:");
        displayOddNumbersBetweenEvens(array);

        // g. Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5
        System.out.println("\ng. Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5:");
        displayMultiplesOfFiveWithPreviousMultiple(array);

        // h. Menghitung jumlah angka di dalam array
        System.out.println("\nh. Jumlah angka di dalam array: " + countNumbers(array));

        // i. Menampilkan selisih angka-angka dengan angka setelahnya
        System.out.println("\ni. Menampilkan selisih angka-angka dengan angka setelahnya:");
        displayDifferencesWithNextNumber(array);

        // j. Menampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula
        System.out.println("\nj. Menampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula:");
        displayEvenDifferencesWithNextEven(array);

        // k. Menampilkan angka-angka yang setelahnya bernilai lebih besar
        System.out.println("\nk. Menampilkan angka-angka yang setelahnya bernilai lebih besar:");
        displayNumbersWithGreaterNextNumber(array);

        // l. Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap
        System.out.println("\nl. Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap:");
        displayNumbersWithEvenSumWithNextNumber(array);

        // m. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i)
        System.out.println("\nm. Jumlah angka-angka selisih yang ditampilkan pada poin (i): " + sumDifferencesWithNextNumber(array));

        // n. Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya
        System.out.println("\nn. Menampilkan jumlah angka-angka dengan seluruh angka-angka sebelumnya:");
        displayRunningSum(array);
    }

    // a. Menampilkan semua nilai di dalam array
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // b. Mencari sebuah angka di dalam array
    public static boolean searchNumber(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // c. Menampilkan angka-angka ganjil di dalam array
    public static void displayOddNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // d. Menampilkan angka-angka kelipatan 3 di dalam array
    public static void displayMultiplesOfThree(int[] array) {
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // e. Menampilkan angka-angka yang memiliki angka 2 di dalam array
    public static void displayNumbersWithDigitTwo(int[] array) {
        for (int num : array) {
            if (String.valueOf(num).contains("2")) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // f. Menampilkan angka-angka ganjil yang diapit oleh angka genap
    public static void displayOddNumbersBetweenEvens(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % 2 != 0 && array[i - 1] % 2 == 0 && array[i + 1] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // g. Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5
    public static void displayMultiplesOfFiveWithPreviousMultiple(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i - 1] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // h. Menghitung jumlah angka di dalam array
    public static int countNumbers(int[] array) {
        return array.length;
    }

    // i. Menampilkan selisih angka-angka dengan angka setelahnya
    public static void displayDifferencesWithNextNumber(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            System.out.print(difference + " ");
        }
        System.out.println();
    }

    // j. Menampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula
    public static void displayEvenDifferencesWithNextEven(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                int difference = array[i + 1] - array[i];
                System.out.print(difference + " ");
            }
        }
        System.out.println();
    }

    // k. Menampilkan angka-angka yang setelahnya bernilai lebih besar
    public static void displayNumbersWithGreaterNextNumber(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // l. Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap
    public static void displayNumbersWithEvenSumWithNextNumber(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int sum = array[i] + array[i + 1];
            if (sum % 2 == 0) {
                System.out.print(sum + " ");
            }
        }
        System.out.println();
    }

    // m. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i)
    public static int sumDifferencesWithNextNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            sum += difference;
        }
        return sum;
    }

    // n. Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya
    public static void displayRunningSum(int[] array) {
        int[] runningSumArray = new int[array.length];
        runningSumArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            runningSumArray[i] = runningSumArray[i - 1] + array[i];
        }
        displayArray(runningSumArray);
    }
}
