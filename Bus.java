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
}
