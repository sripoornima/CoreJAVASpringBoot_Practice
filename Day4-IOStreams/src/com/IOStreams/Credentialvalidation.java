package com.IOStreams;
import java.io.*;
import java.util.*;
import java.util.regex.*;

// User Class
class User implements Serializable {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String dob;
    private String gender;

    public User(String name, String email, String password, String phoneNumber, String address, String dob, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phoneNumber +
               ", Address: " + address + ", DOB: " + dob + ", Gender: " + gender;
    }
}

// Custom Exceptions
class RegisteredUserException extends Exception {
    public RegisteredUserException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

// UserManagementSystem Class
class UserManagementSystem {
    private static final String FILE_NAME = "users.dat";
    private List<User> users;

    public UserManagementSystem() {
        users = loadUsers();
    }

    private List<User> loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.err.println("Error saving users: " + e.getMessage());
        }
    }

    public void registerUser(String name, String email, String password, String phoneNumber, String address, String dob, String gender)
            throws RegisteredUserException, WeakPasswordException, InvalidEmailFormatException {

        if (!isValidEmail(email)) {
            throw new InvalidEmailFormatException("Invalid email format.");
        }

        if (users.stream().anyMatch(user -> user.getEmail().equals(email))) {
            throw new RegisteredUserException("Email is already registered.");
        }

        if (!isStrongPassword(password)) {
            throw new WeakPasswordException("Password is too weak. It must have at least 8 characters, one uppercase letter, one lowercase letter, and one number.");
        }

        User newUser = new User(name, email, password, phoneNumber, address, dob, gender);
        users.add(newUser);
        saveUsers();
        System.out.println("User registered successfully!");
    }

    public void validateUser(String email, String password)
            throws UserNotFoundException, IncorrectPasswordException {
        User user = users.stream().filter(u -> u.getEmail().equals(email)).findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found."));

        if (!user.getPassword().equals(password)) {
            throw new IncorrectPasswordException("Incorrect password.");
        }

        System.out.println("User validated successfully: " + user);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private boolean isStrongPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        return pattern.matcher(password).matches();
    }
}

// Main Class
public class Credentialvalidation {
    public static void main(String[] args) {
        UserManagementSystem ums = new UserManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Register User\n2. Validate User\n3. Exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.println("Enter Password: ");
                        String password = scanner.nextLine();
                        System.out.println("Enter Phone Number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Enter Address: ");
                        String address = scanner.nextLine();
                        System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
                        String dob = scanner.nextLine();
                        System.out.println("Enter Gender: ");
                        String gender = scanner.nextLine();

                        ums.registerUser(name, email, password, phoneNumber, address, dob, gender);
                        break;
                    case 2:
                        System.out.println("Enter Email: ");
                        String loginEmail = scanner.nextLine();
                        System.out.println("Enter Password: ");
                        String loginPassword = scanner.nextLine();

                        ums.validateUser(loginEmail, loginPassword);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
