public class Queue<T> {
    private Node<T> head;

    public Queue(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void add(T data){
        Node<T> temp = new Node<>(data);

        temp.setNext(head);
        head = temp;
    }

    public T peekLast(){
        if (isEmpty()){
            return null;
        }

        return head.getData();
    }

    public T peekFirst(){
        if (isEmpty()){
            return null;
        }

        Node<T> currentNode = head;

        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }

        return currentNode.getData();
    }

    public void remove(){
       removeAndGetValue();
    }

    public T removeAndGetValue(){
        if (isEmpty()){
            return null;
        }

        Node<T> currentNode = head;
        Node<T> previousNode = head;

        while (currentNode.getNext() != null){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        previousNode.setNext(null);

        return currentNode.getData();
    }


}
