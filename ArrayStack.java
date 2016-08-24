
public class ArrayStack {
  
  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public ArrayStack(int size) {
    // assign the value of size to capacity
      capacity=size;
    storage = new String[capacity];
  } 

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int j = capacity-1; j >= 0; j--) { 
      for (int i = capacity-1; i >= 0; i--) {
          System.out.print("stack[" + j--  + "] = " + storage[i]);
      }
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage == null) {
      System.out.println("Storage is Empty.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
        System.out.print("Storage is Full.");
        System.out.println();
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Add failed. Element did not push");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.println("Remove failed. No element to pop.");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }

  
  public static void main(String[] args) {
    ArrayStack storage = new ArrayStack (10);
        System.out.println("STORAGE CAPACITY = " + storage.capacity);
        System.out.println();
    storage.show();
    storage.pop();
    storage.peek();
    storage.push("one");
    storage.show();
    storage.peek();
    storage.push("two");
    storage.show();
    storage.peek();
    storage.push("three");
    storage.show();
    storage.peek();
    storage.push("four");
    storage.show();
    storage.peek();
    storage.push("five");
    storage.show();
    storage.peek();
    storage.push("six");
    storage.push("seven");
    storage.push("eight");
    storage.push("nine");
    storage.push("ten");
    storage.show();
    storage.peek();
    storage.push("eleven");
    storage.push("tweleve");
    storage.show();
 }
}