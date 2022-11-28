package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer(String ellen, String gmit, String telephone, String abc123, String aTrue) {
    }

    public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList) {
        super(name, address, telephone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + " "+
                "customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
