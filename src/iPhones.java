// iPhones.java
public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Making a call from iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from iPhone.");
    }

    @Override
    public void runiOSCommands() {
        System.out.println("Running iOS commands on iPhone.");
    }
}
