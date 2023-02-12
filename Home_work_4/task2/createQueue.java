// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.


package Home_work_4.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class createQueue {
    private static LinkedList<Integer> LinkedList = new LinkedList<>();
    public static void main(String[] args) {
        
        LinkedList.add(5);
        LinkedList.add(6);
        LinkedList.add(7);
        enqueue(8);
        System.out.println(Arrays.toString(LinkedList.toArray()));
        System.out.println(first());
        System.out.printf("Первый удаленный элемент: %d\n", decueue());
        System.out.println(Arrays.toString(LinkedList.toArray()));

    }
    private static void enqueue(int element){
        LinkedList.addLast(element);
    }
    private static int decueue(){
        if (LinkedList.size() == 0)
            throw new IllegalStateException("Стек пустой!");
        return LinkedList.removeFirst();
    }
    private static int first(){
        if (LinkedList.size() == 0)
            throw new IllegalStateException("Стэк пустой!");
        return LinkedList.peekFirst();
    }

}
