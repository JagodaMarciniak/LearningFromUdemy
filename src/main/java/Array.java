public class Array {
    public static void main(String[] args) {
        int lista[] = new int[3];
        lista[0] = 101;
        lista[1] = 102;
        System.out.printf("Drugi element listy to: %d zł", lista[1]);
        System.out.println();

        int liczby[] = {404, 405, 420, 1410};
        System.out.printf("Kwota wydana miesięcznie to: %d $", liczby[3]);
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
        String[] fruits = {"berry", "cherry", "banana", "apple", "lemon"};
        System.out.println("Fruits in store: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        int[][] yearMonth = {
                {2018, 2019, 2020, 2060},
                {2, 3, 5, 7}
        };
        System.out.println("year: " + yearMonth[0][1]);
        System.out.println("mounth: " + yearMonth[1][2]);
        String[][] book = {
                {"I", "you", "he"},
                {"have", "has"}
        };
        System.out.println(book[0][0] + " " + book[1][0]);
        System.out.println("..................................");

        for (int row = 0; row < book.length; row++) {
            for (int col = 0; col < book[row].length; col++) {
                System.out.print(book[row][col] + "\t");
            }
            System.out.println();
            {
            }


        }
    }
}
