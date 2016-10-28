
public class Stack extends StackDemo {

    public Stack(int m) {
        super(m);
    }

    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        stack.pop();
        stack.pop();

        System.out.println("Cтек:");
          while (!stack.isEmpty()){
                String value=stack.pop();
                System.out.println(value);
                System.out.println(" ");
        }
        System.out.println(" ");

    }
}
