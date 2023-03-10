package factoryDegine;

public class FactoryMain {


    public static void main(String[] args) {

            OperatingSystemFactory osf = new OperatingSystemFactory();
            OS obj = osf.getInstance("Closed");
            obj.spec();


            obj = osf.getInstance("Open");
            obj.spec();

            obj = osf.getInstance("Window");
            obj.spec();

    }

}
