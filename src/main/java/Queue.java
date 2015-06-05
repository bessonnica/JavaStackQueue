import java.util.NoSuchElementException;

/**
 * Очередь: FIFO = First Input First Output
 */
public class Queue<T> {


    Element head = null;
    Element tail = null;
    int size = 0;
    /**
     * Добавить в конец очереди
     *
     * @param v значение
     */
    public void put(T v) {
        // TODO: реализовать
        Element putElement = new Element(v);
        if (head == null) {
            assert tail == null;
            head = putElement;
            tail = putElement;
            return;
        }
        tail.next = putElement;
        tail = putElement;
        size++;
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() throws NoSuchElementException {
        // TODO: реализовать
        if (head == null) {
            assert tail == null;
            throw new NoSuchElementException();
        }
        Element current = head;
        head = head.next;
        --size;
        return current.value;
    }

    /**
     * Элемент очереди
     */
    class Element {
        T value;
        Element next = null;

        public Element(T v) {
            this.value = v;
        }
    }
}
