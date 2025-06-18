class MethodOverloading {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("int:"+ plusMethod(5, 10));
        System.out.println("double:"+ plusMethod(1.25, 2.75));
    }
}
