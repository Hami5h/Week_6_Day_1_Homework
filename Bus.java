class Bus {
  private int service;
  private int capacity;
  private Person[] passengers;

  public Bus(int service, int capacity) {
    this.service = service;
    this.capacity = capacity;
    this.passengers = new Person[capacity];
  }

  public int getService() {
    return this.service;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int passengerCount() {
    int count = 0;
    for(Person person : passengers) {
      if(person != null) {
        count++;
      }
    }
    return count;
  }

  public void board(Person person) {
    if(isBusFull()) {
      return;
    }
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }

  public boolean isBusFull() {
    return passengerCount() == passengers.length;
  }
}
