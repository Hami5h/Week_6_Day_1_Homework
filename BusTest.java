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

@Test
public void busStartsEmpty() {
  assertEquals(0, bus.passengerCount());
}

@Test
public void canBoardPassenger() {
  bus.board(person);
  assertEquals(1, bus.passengerCount());
}

@Test
public void cannotBoardPassengersWhenBusIsFull() {
  for(int i = 0; i < 30; i++) {
    bus.board(person);
  }
  assertEquals(26, bus.passengerCount());
}

@Test
public void busIsFull() {
  for(int i = 0; i < 26; i++){
    bus.board(person);
  }
  assertEquals(true, bus.isBusFull());
}

}
