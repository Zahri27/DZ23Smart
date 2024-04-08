// Androids.java
public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Making a call from Android.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from Android.");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands on Android.");
    }
}
