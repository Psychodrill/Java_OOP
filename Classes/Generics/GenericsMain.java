package Classes.Generics;

public class GenericsMain {
     public static void main(String[] args) {
     
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("5");
         list.add("2");
        list.add("9");
        list.add("6");
        System.out.println(list);
       System.out.println(list.get(0));
       System.out.println(list.get(3));
        list.delete("2");
        System.out.println(list);

        
    }
    
}
