package VectorsAndStacks;
import linkedLists.ak_42_MyLinkedList;
public class ak_43_MyStack<E> {
    private ak_42_MyLinkedList<E> l1 = new ak_42_MyLinkedList<>();
    void push(E e){
        l1.add(e);
    }
    E pop() throws Exception{
        if(l1.isEmpty()){
            throw new Exception("Popping from empty stack is not allowed");
        }
        return l1.removeLast();
    }

    E peek()throws Exception{
        if(l1.isEmpty()){
            throw new Exception("Peeking from empty stack is not allowed");
        }
        return l1.getLast();
    }
}
