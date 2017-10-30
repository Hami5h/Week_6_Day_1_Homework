import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  Person person;

  @Before
  public void before() {
    this.bus = new Bus(10, 26);
    this.person = new Person();
  }

@Test
public void hasService() {
  int service = bus.getService();
  assertEquals(10, service);
}

@Test
public void hasCapacity() {
  int capacity = bus.getCapacity();
  assertEquals(26, capacity);
}

}
