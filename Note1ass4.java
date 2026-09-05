class Note1ass4 {
    public static void main(String[] args) {
        int num = 1;
        int n =10;
        System.out.print("The first " + n+" fibonnaci numbers are. . ");
        while (num<=n){
            System.out.print(fibonnaci(num)+" ");
            num++;
        }
    }
    static int factorial(int n){
        if (n==0||n==1){
            // This is the base case
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fibonnaci(int n){
        if (n<=2) {
            // This doesn't work with negative integer inputs
            // This is the base case
            return n-1;
        }
        else{
            int result = fibonnaci(n-1) + fibonnaci(n-2);
            return result;
        }
    }
}