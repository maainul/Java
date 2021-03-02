package innerclass;

interface EmailService {
    public void sendEmail(EmailDetails details);

    class EmailDetails {
        String to_list;
        String to_cc;
        String subject;
        String body;
    }
}


public class _19_ClassInsideInterface {
}
