

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> n = new MyLinkedList<>();
        n.addEl(12);
        n.addEl(1);
        n.addEl(4);
        n.addEl(4);

        System.out.println(n.getSize());
        System.out.println(n);
        n.addInStart(5);
        for (Integer i: n) {
            System.out.println(i);
        }
        System.out.println(n.getSize());
    }
}