package java_basics;

/*
 * Create method 'factorial(Integer num)' that calculates the factorial of the given 
 * parameter num, where the value of num must be between 1 and 20. Print out the
 * result to the console. If the value of num is less than 1 or larger than 20,
 * the function prints out string "not allowed".
 * 
 * Note: The method should be public and the return type should be void.
 * 
 * Example output when num is 5:
 * 120
 * 
 * Example output when num is 0:
 * not allowed
 */

public class Quest5 {
    public void factorial(Integer num){
        Integer result=1;
        if(num<1 || num>20){
            System.out.println("not allowed");
        }else{
            for(Integer i=1; i<=num; i++){
                result=result*i;
            }
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        Quest5 quest5= new Quest5();
        quest5.factorial(5);
    }
}


