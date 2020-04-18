public class OperatorTest {
    public static void main(String[] args) {
        //set values to test
        double x = 2;
        double y = 2;
        boolean  result;
        result = x > y;
        System.out.println("Is X greater then Y ? " +result );
        result = (x*2)>y;
        System.out.println("Is X*2 grater then Y ? "+result);
        result = y>(x+3) && y>(x-2);
        System.out.println("Is Y is grater then X + 3 and Is Y grater then X -2 ? " + result);
        result = (x*y)%2 == 0;
        System.out.println("Is x*y even number? "+result);
    }
}
