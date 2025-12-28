class PrimeMultiplication {
    public static void main(String[] args) {
        int start = 1, end = 20;
        long product = 1;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                product = product * num;
            }
        }
        System.out.println("Product of prime numbers = " + product);
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}