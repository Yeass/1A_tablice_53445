import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] tab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Przed: ");
        System.out.println(Arrays.toString(tab));

        for (int i = 1; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                int wieksza = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = wieksza;
            }
        }
        System.out.println("Po: ");
        System.out.println(Arrays.toString(tab));
    }
}