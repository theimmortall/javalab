import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class StudentRegistrationForm extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField fatherNameField;
    private JTextField motherNameField;
    private JTextField adhaarIdField;
    private JTextField mobileField;
    private JTextField emailIdField;

    private JComboBox<String> courseComboBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    private JComboBox<Integer> dayComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<Integer> yearComboBox;

    private JTextField imagePathField;
    private JButton browseButton;

    private JButton submitButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        addComponents();
    }

    private void initComponents() {
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        fatherNameField = new JTextField();
        motherNameField = new JTextField();
        adhaarIdField = new JTextField();
        mobileField = new JTextField();
        emailIdField = new JTextField();

        courseComboBox = new JComboBox<>(new String[]{"Computer Science", "Mathematics", "Physics", "Biology", "Chemistry"});

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        dayComboBox = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(i);
        }

        monthComboBox = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});

        yearComboBox = new JComboBox<>();
        for (int i = 1900; i <= 2022; i++) {
            yearComboBox.addItem(i);
        }

        imagePathField = new JTextField();
        browseButton = new JButton("Browse");
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browseImage();
            }
        });

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });
    }

    private void addComponents() {
        setLayout(new GridLayout(15, 2));

        add(new JLabel("First Name:"));
        add(firstNameField);

        add(new JLabel("Last Name:"));
        add(lastNameField);

        add(new JLabel("Father Name:"));
        add(fatherNameField);

        add(new JLabel("Mother Name:"));
        add(motherNameField);

        add(new JLabel("Adhaar ID:"));
        add(adhaarIdField);

        add(new JLabel("Mobile Number:"));
        add(mobileField);

        add(new JLabel("Email ID:"));
        add(emailIdField);

        add(new JLabel("Date of Birth:"));
        JPanel dobPanel = new JPanel();
        dobPanel.add(dayComboBox);
        dobPanel.add(monthComboBox);
        dobPanel.add(yearComboBox);
        add(dobPanel);

        add(new JLabel("Course:"));
        add(courseComboBox);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderPanel);

        add(new JLabel("Image:"));
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());
        imagePanel.add(imagePathField, BorderLayout.CENTER);
        imagePanel.add(browseButton, BorderLayout.EAST);
        add(imagePanel);

        add(new JLabel()); // Empty label for spacing

        add(new JLabel());
        add(submitButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    private void browseImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePathField.setText(selectedFile.getAbsolutePath());
        }
    }

    private void submitForm() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String fatherName = fatherNameField.getText();
        String motherName = motherNameField.getText();
        String adhaarId = adhaarIdField.getText();
        String mobile = mobileField.getText();
        String emailId = emailIdField.getText();
        String course = (String) courseComboBox.getSelectedItem();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        int day = (int) dayComboBox.getSelectedItem();
        String month = (String) monthComboBox.getSelectedItem();
        int year = (int) yearComboBox.getSelectedItem();
        String imagePath = imagePathField.getText();

        JOptionPane.showMessageDialog(this,
                "Registration Successful!\n\n" +
                        "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Father's Name: " + fatherName + "\n" +
                        "Mother's Name: " + motherName + "\n" +
                        "Adhaar ID: " + adhaarId + "\n" +
                        "Mobile: " + mobile + "\n" +
                        "Email ID: " + emailId + "\n" +
                        "Date of Birth: " + day + " " + month + " " + year + "\n" +
                        "Course: " + course + "\n" +
                        "Gender: " + gender + "\n" +
                        "Image Path: " + imagePath);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }
}
