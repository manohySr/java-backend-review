abstract class Notification {
  public String message;

  public Notification(String message) {
    this.message = message;
  }

  abstract void send();
}

class EmailNotification extends Notification {
  public EmailNotification(String message) {
    super(message);
  }

  @Override
  void send() {
    System.out.println("Hey you have a message: " + this.message);
  }
}

class SMSNotification extends Notification {
  public SMSNotification(String message) {
    super(message);
  }

  @Override
  void send() {
    System.out.println("Hey you have a message: " + this.message);
  }
}

public class main {
  public static void main(String[] args) {
    EmailNotification email = new EmailNotification("Hey gang welcome to my youtube channel");
    SMSNotification sms = new SMSNotification("Hey I also have a SMS API");

    email.send();
    sms.send();
  }
}
