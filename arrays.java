public class arrays {

    public static String arrayInSequence(int[] arr) {
        String positiveNumber = "";
        String NagetiveNumber = "";
        String ZeroNumber = "";
        String peven = "";
        String podd = "";
        String Neven = "";
        String Nodd = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveNumber += arr[i] + " ";
                if (arr[i] % 2 == 0)
                    peven += arr[i] + " ";
                else
                    podd += arr[i] + " ";

            } else if (arr[i] < 0) {
                NagetiveNumber += arr[i] + " ";
                if (arr[i] % 2 == 0)
                    Neven += arr[i] + " ";
                else
                    Nodd += arr[i] + " ";
            } else if (arr[i] == 0) {
                ZeroNumber += arr[i] + " ";
            }

        }
        return positiveNumber + "\n" + NagetiveNumber + "\n" + ZeroNumber + peven + Neven + "\n" + podd + Nodd + "\n"
                + ZeroNumber;
    }

    public static void main(String[] args) {
        // int[] arr={2,34,-34,-43,-423,43,6,7,043,0,230,43,0,0,0,-23,-234,44};
        int[] arr = { 0, 1, -2, 0, 3, -4, 7, -5, 0, 6, -9, 8, 10 };
        System.out.println(arrayInSequence(arr));
    }
}
