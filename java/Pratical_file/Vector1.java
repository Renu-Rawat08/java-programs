import java.util.Vector;
class Vector1{
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("apple");
        v.add("banana");
        v.add("mango");
        System.out.println("vector after adding :" + v);
        v.add(2,"grapes");
        System.out.println("after inserting at index 2 : " + v);

        v.set(1,"pineapple");
        System.out.println("after updating at index 1 : " + v);

        v.remove("mango");
        System.out.println("after removing at mango : " + v);

        v.remove(0);
         System.out.println("after removing element  at index 0 : " + v);
          System.out.println("size of vector : " + v.size());

           System.out.println("contain orange ? : " + v.contains("orange"));
            
            System.out.println();
            System.out.println("using for loop : ");
            for (int i = 0 ; i < v.size(); i++) {
                 System.out.println( v.get(i));
            }
            System.out.println();
            System.out.println("using for-each loop : ");
            for (String item : v) {
                System.out.println(item);
            }
            System.out.println();
            System.out.println("first element : " + v.firstElement());
             System.out.println("last  element : " + v.lastElement());
             
            System.out.println("is vector empty ? " + v.isEmpty());
            v.clear();
            System.out.println("after clearing : "+ v);
            System.out.println("is vector empty now  ? " + v.isEmpty());
    }
}