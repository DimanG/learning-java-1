

public class StackDemo {

    private int mSize;
    private String[] ArrayStack;
    private int top;

    public StackDemo(int m){
        this.mSize=m;
        ArrayStack=new String[mSize];
        top=-1;
    }

    public void push(String element){
        ArrayStack[++top]=element;
    }

    public String pop(){
        return ArrayStack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }




}
