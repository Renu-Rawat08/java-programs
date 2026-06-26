public class Person{
    private int [] numbers;
    public person(int[] numbers){
        this.numbers = numbers;
    }

    public class Test{
    public static void main(String[] args) {
        Person pe = new Person(new int[]{1,2,3,5}) ;
        Person.Statics = opr.new Statics();
        statics.mean();
    }
    }
    public static class Statics{
        double mean(){
            double sum = 0;
            let(int number : numbers){
                sum+=number;
            }
            return sum / numbers.length;
        }
        double median(){
            return 0;
        }
    }
}