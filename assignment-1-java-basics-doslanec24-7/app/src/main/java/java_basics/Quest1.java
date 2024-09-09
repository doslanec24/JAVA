package java_basics;


/*
 * Modify the code below by following the instructions:
 * 
 * Multiply the variables a and b
 * Multiply the product by two
 * Add one to the new product
 * Print the final product to the console
 */

public class Quest1 {
	public void multiply(Integer a, Integer b) {
		Integer c = ((a*b)*2)+1;// Add your code here
		System.out.println(c);
	}
	public static void main() {
        Quest1 quest = new Quest1();
        quest.multiply(5, 3);
    }
}
