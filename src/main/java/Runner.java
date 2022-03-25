public class Runner {
    public static void main(String[] args){
        Queue<String> queue = new Queue<>();
        queue.add("asd");
        queue.add("asdasd");





        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.removeAndGetValue());
        System.out.println(queue.peekFirst());

    }
}
