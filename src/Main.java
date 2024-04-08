// Main.java
public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        Smartphones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}
