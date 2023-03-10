package singletonDegine;

public class Main {

        public static void main(String[] args) {

            A a = A.getA();
            A b = A.getA();

            System.out.println(a == b);
            System.out.println(a);
            System.out.println(b);
            //singletonDegine.A@1b28cdfa
            //singletonDegine.A@1b28cdfa
            // addrss are same

        }
}
