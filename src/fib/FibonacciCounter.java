package fib;

/**
 * This interface represents a set of operations on a fibonacci counter. A fibonacci counter is a
 * machine that has increment and decrement functions. It also shows the current position and its
 * corresponding fibonacci number.
 */

public interface FibonacciCounter {
  FibonacciCounter incCount();

  FibonacciCounter decCount();

  int curPos();

  int curPosNum();
}