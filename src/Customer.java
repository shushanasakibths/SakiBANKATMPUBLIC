public class Customer {
    private int pin;
    private String name;
    public Customer(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int newPin) {
        pin = newPin;
    }
}
