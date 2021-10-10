package general;

public class ScopeCheck {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun2();
//        b.fun3();
        char[] charArr = "abc".toCharArray();
        System.out.println(charArr[1]);
    }
}

class Base {
    public void fun() {
        System.out.println("Base - fun");
    }

    public void fun2() {
        System.out.println("Base - fun 2");
    }
}

class Derived extends Base {
    public void fun() {
        System.out.println("Derived - fun");
    }

    public void fun3() {
        System.out.println("Derived - fun3");
    }
}
