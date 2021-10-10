package general;

public class SwapNumbers {
    public static void swapWithTemp(Integer first, Integer second) {
        Integer temp = first;
        first = second;
        second = temp;

        System.out.println("In swap");
        System.out.println("a = " + first);
        System.out.println("b = " + second);
    }

    public static void swapWithoutTemp1(Integer first, Integer second) {
        first = first - second;
        System.out.println("Step 1 | first = first - second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        second = first + second;
        System.out.println("Step 2 | second = first + second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first = second - first;
        System.out.println("Step 3 | first = second - first");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        System.out.println("In swap");
        System.out.println("a = " + first);
        System.out.println("b = " + second);
    }

    public static void swapWithoutTemp2(Integer first, Integer second) {
        first = first + second;
        System.out.println("Step 1 | first = first + second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        second = first - second;
        System.out.println("Step 2 | second = first - second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first = first - second;
        System.out.println("Step 3 | first = first - second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        System.out.println("In swap");
        System.out.println("a = " + first);
        System.out.println("b = " + second);
    }

    public static void main(String[] args) {
        Integer first = 10;
        Integer second = 20;
        System.out.println("Before");
        System.out.println("a = " + first);
        System.out.println("b = " + second);
//        swapWithTemp(first, second);
//        swapWithoutTemp1(first, second);
        swapWithoutTemp2(first, second);
        System.out.println("After");
        System.out.println("a = " + first);
        System.out.println("b = " + second);
    }
}
