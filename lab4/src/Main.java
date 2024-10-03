import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Пример работы GetAverage
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Среднее значение: " + GetAverage.getAverage(numbers));

        // Пример работы TransformStrings
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Преобразованные строки: " + TransformStrings.transformStrings(strings));

        // Пример работы GetUniqueSquares
        List<Integer> numsWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        System.out.println("Уникальные квадраты: " + GetUniqueSquares.getUniqueSquares(numsWithDuplicates));

        // Пример работы GetLastElement
        List<String> collection = Arrays.asList("first", "middle", "last");
        System.out.println("Последний элемент коллекции: " + GetLastElement.getLastElement(collection));

        // Пример работы SumOfEvenNumbers
        int[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Сумма четных чисел: " + SumOfEvenNumbers.sumOfEvenNumbers(intArray));

        // Пример работы ConvertToMap
        List<String> stringsForMap = Arrays.asList("apple", "banana", "cherry");
        Map<Character, String> resultMap = ConvertToMap.convertToMap(stringsForMap);
        System.out.println("Преобразование в Map: " + resultMap);
    }
}
