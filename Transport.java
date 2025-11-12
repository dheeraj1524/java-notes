class Transport {
  
    void move() {
        System.out.println("Transport is moving.");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck is carrying goods.");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();

        System.out.println("Bus:");
        bus.move();
        bus.carryPassengers();

        System.out.println("\nTruck:");
        truck.move();
        truck.carryGoods();
    }
}
