import org.junit.Before;
import org.junit.Test;

import fib.Counter;
import fib.FibonacciCounter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CounterTest {

  private FibonacciCounter fi;

  @Before
  public void setFi() {
    fi = new Counter();
  }

  @Test
  public void testIncOnce() {
    fi.incCount();
    assertEquals(2, fi.curPos());
  }

  @Test
  public void testDecOnce() {
    fi.decCount();
    assertEquals("Invalid Position", fi.curPos());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIIlegalArgExcp() {
    try {
      fi.decCount();
      fi.curPos();
      fail("The exception was not called!");
    } catch (IllegalArgumentException e) {
      System.out.println("bro");
    }
  }

  @Test
  public void testIncTwice() {
    fi.incCount();
    fi.incCount();
    assertEquals(3, fi.curPos());
    assertEquals(1, fi.curPosNum());
  }

  @Test
  public void testRandIncAndDec() {
    int randInc = (int) (Math.random() * 100);
    int randDec = (int) (Math.random() * 10);
    if (randInc > randDec) {
      for (int i = 1; i < randInc; i++) {
        fi.incCount();
      }
      for (int j = 0; j < randDec; j++) {
        fi.decCount();
      }
      assertEquals(randInc - randDec, fi.curPos());
    }
  }

  @Test
  public void testRandomInc() {
    int rand = (int) (Math.random() * 100);
    for (int i = 1; i < rand; i++) {
      fi.incCount();
    }
    assertEquals(rand, fi.curPos());
  }

  @Test
  public void testRandomIncFibNum() {
    int rand = (int) (Math.random() * 50);
    for (int i = 1; i < rand; i++) {
      fi.incCount();
    }
    int randNum = fi.curPosNum();
    assertEquals(randNum, fi.curPosNum());
  }
}