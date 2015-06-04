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
        size++;
        Element putElement = new Element(v);
        if (size == 0) {
            head = putElement;
            tail = putElement;
            return;
        }
        tail.next = putElement;
        tail = putElement;
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() {
        // TODO: реализовать
        if (size != 0) {
            --size;
            Element current = head;
            head = head.next;
            return current.value;
        } else {
            System.out.println("Очередь пуста");
            return null;
        }
    }

    /**
     * Элемент очереди
     */
    class Element {
        T value;
        Element next;

        public Element(T v) {
            this.value = v;
        }
    }
}
