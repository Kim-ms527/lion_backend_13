package day15;
interface MessageService{
    public void sendMessage(String msg);
}

class EmailService implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email : "+ msg);
    }
}

class SMSService implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS : "+msg);
    }
}



class MessageSender{
    private final MessageService messageService;

    public MessageSender(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(String msg){
        messageService.sendMessage(msg);
    }
}

//class EmailService {
//    public void sendEmail(String msg){
//        System.out.println("Email : "+ msg);
//    }
//}
//
//class SmsService{
//    public void sendSms(String msg){
//        System.out.println("SMs : "+ msg);
//    }
//}
//
//class MessageSender{
//    private final EmailService emailService;
//    private final SmsService smsService;
//    public MessageSender(){
//        this.emailService = new EmailService();
//        this.smsService = new SmsService();
//    }
//    public void send(String msg){
//        emailService.sendEmail(msg);
//        smsService.sendSms(msg);
//    }
//}

public class DIPDemo {
    public static void main(String[] args) {
//        MessageSender sender = new MessageSender();
//        sender.send("hello~~  ");

        MessageSender emailSender = new MessageSender(new EmailService());
        emailSender.send("hello~~~");

        MessageSender smsSender = new MessageSender(new SMSService());
        smsSender.send("hello sms ~~");

    }
}
