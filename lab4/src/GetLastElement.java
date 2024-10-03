import java.util.Collection;

public class GetLastElement {
    public static <T> T getLastElement(Collection<T> collection) {
        return collection.stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalArgumentException("Коллекция пуста"));
    }
}
