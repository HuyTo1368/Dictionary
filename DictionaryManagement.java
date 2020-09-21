import java.util.Scanner;

public class DictionaryManagement {
    public static void insertFromCommandline(Dictionary dictionary) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tu dien");
        System.out.print("So tu muon them: ");
        int number;
        number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap tu tieng anh: ");
            String target = scanner.nextLine();
            System.out.print("Nhap giai nghia: ");
            String exphain = scanner.nextLine();

            Word word = new Word(target, exphain);
            dictionary.words.add(word);
        }
    }
}
