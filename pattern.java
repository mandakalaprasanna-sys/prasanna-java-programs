class Pattern{
    public static void main(String[] args) {
        int rows = 5;  // Number of rows

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
