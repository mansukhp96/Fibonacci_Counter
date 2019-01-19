package fib;

public class Counter implements FibonacciCounter {

  private int pos;

  public Counter() {
    this.pos = 1;
  }

  @Override
  public FibonacciCounter incCount() {
    pos = pos + 1;
    return this;
  }

  @Override
  public FibonacciCounter decCount() {
    pos = pos - 1;
    return this;
  }

  @Override
  public int curPos() {
    return pos;
  }

  public int curPosNum(){
    int j = curPosNumHelp(pos);
    return j;
  }

  private int curPosNumHelp(int n) {
    if (n == 1)
      return 0;
    if (n == 2)
      return 1;
    int i = curPosNumHelp(n - 1) + curPosNumHelp(n - 2);
    return i;
  }

  public static void main(String[] args) {
    FibonacciCounter fo = new Counter();
    fo.incCount();
    fo.incCount();
    fo.incCount();
    fo.incCount();
    fo.incCount();
    System.out.println(fo.curPos());
  }
}