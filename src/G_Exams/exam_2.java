package G_Exams;

// File: SimpleAdder.java
/**
 * SimpleAdder — Exam 2 preview
 *
 * Single class, single method that takes two parameters and returns their sum.
 *
 * Requirements students will be tested on:
 *  - correct method signature
 *  - adding two integers
 *  - return the correct type
 *
 * (Students should NOT add extra public methods or fields unless the
 * exercise explicitly allows them.)
 */
public class exam_2 {

    /**
     * Adds two integers and returns the sum.
     *
     * @param a first integer
     * @param b second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        exam_2 exam = new exam_2();
        int result = exam.add(10, 20);
        System.out.println(result);

    }
}
