class Task{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        boolean result =Sum(num1, num2);
        System.out.println(result);
    }
    
    public static boolean Sum(int num1, int num2) {
        if (num1 + num2 == 20) {
            return true;
        } else if (num1 == 20 || num2 == 20) {
            return true;
        } else {
            return false;
        }
    }
}
