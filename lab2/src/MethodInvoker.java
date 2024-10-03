import java.lang.reflect.Method;

public class MethodInvoker {

    public static void main(String[] args) throws Exception {
        MyClass myClassInstance = new MyClass();

        // Получаем все методы класса MyClass
        Method[] methods = MyClass.class.getDeclaredMethods();

        // Проходим по каждому методу
        for (Method method : methods) {
            // Проверяем, аннотирован ли метод аннотацией @RunCount
            if (method.isAnnotationPresent(RunCount.class)) {
                // Получаем аннотацию
                RunCount runCount = method.getAnnotation(RunCount.class);
                int times = runCount.value(); // Сколько раз нужно вызвать метод

                // Делаем метод доступным для вызова, даже если он приватный
                method.setAccessible(true);

                // Вызов метода столько раз, сколько указано в аннотации
                for (int i = 0; i < times; i++) {
                    // Проверяем количество параметров метода
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Object[] params = new Object[parameterTypes.length];

                    // Заполняем параметры в зависимости от их типов
                    for (int j = 0; j < parameterTypes.length; j++) {
                        if (parameterTypes[j] == String.class) {
                            params[j] = "Test String"; // Если параметр строка
                        } else if (parameterTypes[j] == int.class) {
                            params[j] = 42; // Если параметр целое число
                        } else if (parameterTypes[j] == boolean.class) {
                            params[j] = true; // Если параметр логический (boolean)
                        } else if (parameterTypes[j] == double.class) {
                            params[j] = 3.14; // Если параметр типа double
                        } else if (parameterTypes[j] == float.class) {
                            params[j] = 2.5f; // Если параметр типа float
                        } else if (parameterTypes[j] == char.class) {
                            params[j] = 'A'; // Если параметр типа char
                        } else if (parameterTypes[j] == int[].class) {
                            params[j] = new int[]{1, 2, 3}; // Если параметр массив int
                        } else if (parameterTypes[j] == String[].class) {
                            params[j] = new String[]{"One", "Two", "Three"}; // Если параметр массив строк
                        } else {
                            params[j] = null; // Если параметр неизвестен, оставляем null
                        }
                    }

                    // Вызов метода с параметрами
                    method.invoke(myClassInstance, params);
                }
            }
        }
    }
}