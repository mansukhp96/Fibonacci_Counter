import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

  private FibonacciCounter fi;

  @Before
  public void setUp(){
    fi = new Counter(8);
  }

  @Test
  public void testInit(){
    assertEquals(21,fi.incCount());
  }

}