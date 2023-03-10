package builderDegine;

public class Shop {
    public static void main(String[] args) {

        // without builder pattern
        Phone p = new Phone("Android", 2, "Snapdragon", 5.5, 3000);
        System.out.println(p);



        // using builder pattern
        Phone pb = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setProcessor("Snapdragon")
                .setScreenSize(5.5)
                .setBattery(3000)
                .getPhone();
        System.out.println(pb);








    }
}
