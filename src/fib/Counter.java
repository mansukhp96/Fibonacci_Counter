package fib;

public class Counter implements FibonacciCounter {

  private int pos;

  public Counter() {
    this.pos = 1; //Initialize counter to 1;
  }

  @Override
  public FibonacciCounter incCount() { // method to increment counter
    pos = pos + 1;
    return this;
  }

  @Override
  public FibonacciCounter decCount() { //method to decrement counter
    pos = pos - 1;
    return this;
  }

  @Override
  public int curPos() throws IllegalArgumentException { //method that returns the current position number
    if (pos <= 0) {
      throw new IllegalArgumentException("Invalid Position");
    }
    return pos;
  }

  @Override
  public int curPosNum() { //method to calculate fibonacci num for the current position
    int j = curPosNumHelp(pos);
    return j;
  }

  private int curPosNumHelp(int n) { //Helper method to calculate fibonacci sequence
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }
    int i = curPosNumHelp(n - 1) + curPosNumHelp(n - 2);
    return i;
  }
}