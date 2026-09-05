class Scratch {
    final static class Circle{
        final static double PI = 3.14159;
    }
    // Now trying to extend the final class Circle to see what would happen
    static class Test extends Circle{
    }
    public static void main(String[] args) {
        System.out.println("The value of PI is"+ Test.PI);
        // will output
        // Cannot inherit from final class 'Scratch.Circle'
    }

}