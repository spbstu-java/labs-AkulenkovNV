class Hero {
    private int x; // Координата x
    private int y; // Координата y
    private MoveStrategy moveStrategy; // Стратегия перемещения

    // Конструктор, который инициализирует начальные координаты
    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Устанавливаем стратегию перемещения
    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    // Метод перемещения героя к новым координатам
    public void move(int newX, int newY) {
        if (moveStrategy != null) {
            moveStrategy.move(newX, newY);
            x = newX;
            y = newY;
            System.out.println("Герой переместился в новые координаты (" + x + ", " + y + ").");
        } else {
            System.out.println("Способ перемещения не выбран.");
        }
    }

    // Получение текущих координат
    public void getCoordinates() {
        System.out.println("Текущие координаты героя: (" + x + ", " + y + ").");
    }
}
