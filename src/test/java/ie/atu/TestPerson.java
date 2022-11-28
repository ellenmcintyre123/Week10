package ie.atu;

public class TestPerson {
    public static void main(String[] args) {
        Person steve = new Person();
        steve.setName("Steve");
        steve.setAddress("GMIT");
        steve.setTelephone("1234");

        System.out.println("Steves details " + steve.toString());

        //test customer
        Customer myCustomer = new Customer( "Ellen", "GMIT","12345","abc123","true");

        System.out.println("Details " +myCustomer.toString());
    }
}
