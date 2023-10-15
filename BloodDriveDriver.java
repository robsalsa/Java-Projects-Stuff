import java.util.*;

public class BloodDriveDriver {
    public static void main(String[] args) {
        keySheet();
        BloodBank bloodCount = new BloodBank();
        Admin overseeing = new Admin(bloodCount);
        Donor offering = new Donor(bloodCount);
        Patient vampire = new Patient(bloodCount);
        Scanner something = new Scanner(System.in);
        boolean flag = false;

        do {
            System.out.println("Please enter if you are an Admin, Donor, or Patient");
            String response = something.nextLine();

            if (response.equalsIgnoreCase("Admin")) {
                overseeing.adminLogin(something);
            } else if (response.equalsIgnoreCase("Donor")) {
                offering.donorLogin(something);
            } else if (response.equalsIgnoreCase("Patient")) {
                vampire.patientLogIn(something);
            } else if (response.equalsIgnoreCase("Exit")) {
                flag = true;
            } else {
                System.out.println("Sorry, but that is not an answer we understand. Please try again");
            }
        } while (!flag);
    }

    public static void keySheet() {
        System.out.println("The username of Admin is ImAdmin");
        System.out.println("The username of Donor is: ImDonor");
        System.out.println("The username of Patient is: ImPatient");
        System.out.println("Finally, the password for all of them is: password");
    }
}