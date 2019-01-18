public class Counter implements FibonacciCounter {

  public int pos;

  public Counter(int pos) {
    this.pos = pos;
  }

  @Override
  public FibonacciCounter incCount() {
    pos = pos + 1;
    System.out.println(pos);
    return this;
  }

  @Override
  public FibonacciCounter decCount() {
    this.pos = this.pos - 1;
    System.out.println(pos);
    return this;
  }

  @Override
  public int curPos() {
//    int x = curPosNum(pos-1);
//    System.out.println(x+"Fib");
    return pos;
  }

  @Override
  public int curPosNum(int pos) {
    if (pos <= 1)
      return pos;
    int i = curPosNum(pos - 1) + curPosNum(pos - 2);
    return i;
  }

  public static void main(String[] args) {
    Counter fb = new Counter(0);

    //fb.incCount();
    System.out.println(fb.curPos());
    System.out.println(fb.curPosNum(fb.curPos())+":Fibo");
  }
}