class ArrayDemo {
    public static void main(String[] args) {
        // 1. One-Dimensional Array
        int[] oneD = {10, 20, 30, 40, 50};
        System.out.println("One-Dimensional Array:");
        for (int num : oneD) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 2. Two-Dimensional Array (Matrix)
        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Two-Dimensional Array (Matrix):");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 3. Jagged Array (rows of different length)
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};

        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
