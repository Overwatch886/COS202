class Note1ass1{
        public static void main(String[] args) {
        int[] int_arr = new int[10];
        int_arr = new int[] {12, 13, 42, 732, 678, 63, 1, 753, 677, 2};
        int smallest = int_arr[0];
        int largest = int_arr[0];
        for (int num:int_arr){
            if (num<smallest){
                smallest = num;
            }
            if (num>largest){
                largest = num;
            }
        }
        System.out.println("The Largest is "+ largest);
        System.out.println("The Smallest is "+ smallest);
    }
}