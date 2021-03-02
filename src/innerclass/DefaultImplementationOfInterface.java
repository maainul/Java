package innerclass;

interface Vehicles{
    public int getNoOfWheels();


    class DefaultWheels implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 2;
        }
    }

    class Bus implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 6;
        }
    }

    class Auto implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 3;
        }
    }

}


public class DefaultImplementationOfInterface {
    public static void main(String[] args) {
        Vehicles.DefaultWheels defaultWheels = new Vehicles.DefaultWheels();
        System.out.println(defaultWheels.getNoOfWheels());

        Vehicles.Bus bus = new Vehicles.Bus();
        System.out.println(bus.getNoOfWheels());


        Vehicles.Auto auto = new Vehicles.Auto();
        System.out.println(auto.getNoOfWheels());

    }




}
