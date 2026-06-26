class Sum37{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if(i%9==0)
            sum = sum + i;
        }
        System.out.println("The sum of number between 100 and 200 which are divisible by 9 is "+ sum);
    }
}