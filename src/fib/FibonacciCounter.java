package fib;

/**
 * This interface represents a set of operations on rectangles. It is a scaled down functionality of
 * google maps tiles.
 */

public interface FibonacciCounter {
  FibonacciCounter incCount();

  FibonacciCounter decCount();

  int curPos();

  int curPosNum();
}