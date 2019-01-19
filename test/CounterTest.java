import org.junit.Before;
import org.junit.Test;

import fib.Counter;
import fib.FibonacciCounter;

import static org.junit.Assert.*;

public class CounterTest {

  private FibonacciCounter fi;

  @Before
  public void setFi(){
    fi = new Counter();
  }

  @Test
  public void testIncOnce(){
    fi.incCount();
    assertEquals(2,fi.curPos());
  }

  @Test
  public void testIncTwice(){
    fi.incCount();
    fi.incCount();
    assertEquals(3,fi.curPos());
    assertEquals(1,fi.curPosNum());
  }

  @Test
  public void testZero(){
  }

  @Test
  public void testDecOnce(){
  }

  @Test
  public void testRandomInc(){
    int rand = (int)(Math.random() * 100);
    for(int i=1;i<rand;i++){
      fi.incCount();
    }
    assertEquals(rand,fi.curPos());
  }

  @Test
  public void testRandomIncFibNum(){
    int rand = (int)(Math.random() * 10);
    for(int i=1;i<rand;i++){
      fi.incCount();
    }
    assertEquals(fi.curPosNum(),fi.curPosNum());
  }
}