package tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * Класс, описывающий клетку с символом
 */
public class Figure extends Rectangle {
    /**
     * Свойства, указывающие на то, какой элемент содержится в клетке игрового поля
     * markX = true - "X";
     * mark0 = true - "0";
     * оба false - пустая клетка.
     */
    private boolean markX = false;
    private boolean markO = false;

    // Конструктор по умолчанию
    public Figure() {
    }

    //  Параметризованный конструктор
    public Figure(boolean markX, boolean markO) {
        this.markX = markX;
        this.markO = markO;
    }

    /**
     * Устанавливает значение для символьных маркеров
     * @param markX - значение маркера "Х", при true "0" будет false и наоборот.
     */
    public void take(boolean markX) {
            this.markX = markX;
            this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}
