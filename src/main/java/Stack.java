/**
 * Стек: LIFO = Last Input First Output
 */
public class Stack<T> {

    Element top = null;
    int size = 0;

    /**
     * Добавить на вершину стека
     *
     * @param v значение
     */
    public void push(T v) {
        // TODO: реализовать
        top = new Element(v);
        size++;
    }

    /**
     * Получить значение с вершины
     *
     * @return значение
     */
    public T pop() {
        // TODO: реализовать
        if (size != 0) {
            Element current = top;
            top = top.next;
            --size;
            return current.value;
        } else {
            System.out.println("Стек пуст");
            return null;
        }
    }

    /**
     * Элемент стека
     */
    class Element {
        T value;
        Element next = null;

        public Element(T value) {
            this.value = value;
        }
    }
}
