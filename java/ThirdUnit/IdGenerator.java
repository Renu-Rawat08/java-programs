public class IdGenerator{
    private static int nextId=1;
    public static int genertorId(){
        return nextId++;
    }
    public static void main(String[] args) {
        System.out.println("first generation id : " + IdGenerator.genertorId());
        System.out.println("Second generation id : " + IdGenerator.genertorId());
        System.out.println("Third generation id : " + IdGenerator.genertorId());
        int newId = IdGenerator.genertorId();
        System.out.println("fourth generation id : " + newId);
    }
}