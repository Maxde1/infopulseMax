package first_homework.secondTask;

public class DoubleLinkList<T> implements IteratorMethod<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private ListNode<T> prevNode = new ListNode<>();
    private ListNode<T> current;
    @Override
    public ModifyInterator<T> iterator() {
        return new ModifyInterator<T>() {

            @Override
            public T prev() {
                T info = current.previous.info;
                current = current.previous;
                return info;
            }

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T info = current.info;
                current = current.next;
                return info;
            }
        };
    }


    private static class ListNode<T>{
       T info;
       ListNode<T> next;
       ListNode<T> previous;

   }
   public boolean isEmpty(){
       return head == null;
   }

   public void addNodeToEnd(T node){
       ListNode<T> newNode = new ListNode<T>();
       newNode.info = node;
       if (isEmpty()){
           head = newNode;
           tail = newNode;
           tail.previous = null;
           current = head;

       }
       else {
           prevNode = tail;
           tail.next = newNode;
           tail = newNode;
           tail.previous = prevNode;
       }


   }

}
