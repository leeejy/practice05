package prob5;

public class MyStack implements Stack {
	String[] stack;
	String[] buffer;
	int top = -1;

	MyStack() {
		
	}

	MyStack(int size) {
		stack = new String[size];
		buffer = new String[size*2];
	}

	@Override
	public void push(String item) {
		buffer[++top]=item;
	}

	@Override
	public String pop() throws MyStackException {
		if(isEmpty())
			throw new MyStackException();
		return buffer[top--];
	}

	@Override
	public boolean isEmpty() {
		return (top==-1);
	}

	@Override
	public int size() {
		return (top+1);
	}

}
