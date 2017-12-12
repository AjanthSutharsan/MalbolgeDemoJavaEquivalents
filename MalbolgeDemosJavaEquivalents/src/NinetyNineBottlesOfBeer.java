public class NinetyNineBottlesOfBeer {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            if (i != 1) {
                System.out.println(i + " bottles of beer, \n" + i + " bottles of beer, \nTake one around, pass it around,\n" + (i-1) + " bottles of beer on the wall.");
            }
            else {
                System.out.println("1 bottle of beer, \n1 bottle of beer, \nTake one around, pass it around,\nNo more bottles of beer on the wall.");
            }
            System.out.println();
        }
    }
}
