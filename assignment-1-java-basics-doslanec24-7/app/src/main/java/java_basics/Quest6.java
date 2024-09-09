package java_basics;

/*
 * Modify the method below to greet all visitors by printing out to console
 * the string "Hello n!" for each of them, where n is the number of visitor,
 * starting from 1.
 */

public class Quest6 {
    public Integer fibonacci(Integer n) {
        // Replace with your code here
        Integer fibo1=0;
        Integer fibo2=1;
        Integer finalfibo=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(Integer i=2; i<=n; i++){
            finalfibo = fibo1+fibo2;
            fibo1=fibo2;
            fibo2=finalfibo;
        }
        return finalfibo;
    }
    public static void main(String[] args){
        Quest6 quest6= new Quest6();
        quest6.fibonacci(0);
    }
}
