public interface FibonacciCounter {
  FibonacciCounter incCount();

  FibonacciCounter decCount();

  int curPos();

  int curPosNum(int pos);
}