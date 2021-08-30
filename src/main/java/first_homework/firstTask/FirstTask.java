package first_homework.firstTask;

public class FirstTask {
    public static int factorialByLoop(int n){
        if (n < 0) return -1;
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result*i;
        }
        return result;
    }
    public static int factorialByRecursion(int n){
        if (n<0) return -1;
        else if (n <= 1){
            return 1;
        }
        return n*factorialByRecursion(n-1);
    }
}
