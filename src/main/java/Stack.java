import java.util.EmptyStackException;

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
        Element current = new Element(v);
        if (top == null) {
            current.next = null;
        }
        current.next = top;
        top = current;
        size ++;
    }

    /**
     * Получить значение с вершины
     *
     * @return значение
     */
    public T pop() throws EmptyStackException {
        // TODO: реализовать
        if (top == null) {
            throw new EmptyStackException();
        }
        Element current = top;
        top = top.next;
        size--;
        return current.value;
    }

    /**
     * Элемент стека
     */
    class Element {
        T value;
        Element next;

        public Element(T value) {
            this.value = value;
        }
    }
}
