package innerclass;

public class _17_InterfaceInsideAClass {
    interface Vehicles{
        public int getNoOfWheels();
    }

    class Bus implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 4;
        }
    }


    class Auto implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 3;
        }
    }


}
