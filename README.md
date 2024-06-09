# Employee Management System
Employee Managemnet System using Java GUI and MySQL Database

## Setup Mailer in Java
To setup your Java Mailer download mail.jar here https://javaee.github.io/javamail/

![image](https://github.com/kimalfred/Employee-Management-System/assets/119164038/d341ea48-32f6-4d7c-abdb-25ea2265d338)

```
//import this for mailer
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

//For button on your GUI and your own logic
        String ToEmail = txtToEmail.getText();
        String FromEmail = txtFromEmail.getText(); // Your email address
        String FromEmailPassword = "__"; // Your App Password
        String Subject = txtSubject.getText();
        String MessageText = txtMessage.getText(); 

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subject); 
            message.setText(MessageText);
            Transport.send(message);

            
            JOptionPane.showMessageDialog(null, "Email sent successfully!");
        } catch (Exception ex) {            
            JOptionPane.showMessageDialog(null, "An error occurred while sending the email. Please check the console for details.");
            ex.printStackTrace();
        }
```
