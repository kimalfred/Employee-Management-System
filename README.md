# Employee Management System

## Overview
The Employee Management System is a comprehensive application designed to manage various employee-related functions in an organization. This system allows for different roles (Admin, Manager, Employee) with specific permissions and capabilities. Key features include employee attendance, leave management, salary details, generate payslip, department management, and project assignments. 

## Features
- **Admin, Manager, and Employee Login:**
  - Admin: Full access to manage employees, departments, projects, salary, and view reports.
  - Manager: Can manage assigned projects, and approve leaves.
  - Employee: Can mark attendance, apply for leaves, and view salary details & print payslip.

- **Employee Attendance:**
  - Track employee time-in and time-out.
  - Generate attendance reports.

- **Leave Management:**
  - Employees can apply for leave.
  - Admins & Managers can approve or reject leave requests.

- **Salary Management:**
  - View and manage employee salary details.
  - Generate pdf and print payslip.

- **Department Management:**
  - Manage different departments within the organization.

- **Project Management:**
  - Assign projects to employees.
  - Track project progress.

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- MySQL Database
- JavaMail API (Download from [here](https://javaee.github.io/javamail/))

### Database Setup
1. Install MySQL and create a database for the Employee Management System.
2. Run the provided SQL scripts to create necessary tables.
3. Update the database configuration in the project to connect to your MySQL database.

### Project Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/Employee-Management-System.git
    cd Employee-Management-System
    ```
2. Open the project in Netbeans.
3. Add `mail.jar` to your project library.
4. Configure your database connection in the project.

### Email Setup
To enable email functionality in the project, follow these steps:

1. Download the JavaMail API (`mail.jar`) from [here](https://javaee.github.io/javamail/).
2. Add the `mail.jar` file to your project's classpath.

### Implementing Email Functionality
Here is the code snippet to set up the mailer in your Java application. This can be integrated into your email-sending logic in the application (e.g., for notifications).

![javaemail](https://github.com/kimalfred/Employee-Management-System/assets/119164038/1c6a960f-2672-481b-9c85-83d833723927)

```java
//import this for mailer
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

//For button on your GUI or your own logic
String ToEmail = txtToEmail.getText();
String FromEmail = txtFromEmail.getText();
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
