package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ak_44_MainClass {
    public static void main(String[] args) {
        /*Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(32);
        q.add(59);
        System.out.println(q);
        System.out.println(q.element());*/

        ak_44_MyQueue<Integer> mq = new ak_44_MyQueue<Integer>();
        mq.enqueue(15);
        mq.enqueue(27);
        mq.enqueue(68);

//        System.out.println(mq.dequeue());
//        System.out.println(mq.dequeue());
        System.out.println(mq.peek());
        System.out.println(mq.dequeue());


    }
}
