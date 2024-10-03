import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            DictionaryLoader loader = new DictionaryLoader("C:/Users/paska/Учеба/ООП_3КУРС/lab3/src/dictionary.txt");
            Translator translator = new Translator(loader.getDictionary());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для перевода:");
            String input = scanner.nextLine();

            String translatedText = translator.translate(input);
            System.out.println("Перевод:");
            System.out.println(translatedText);

        } catch (FileReadException | InvalidFileFormatException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
