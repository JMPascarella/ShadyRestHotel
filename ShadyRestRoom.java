import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * ShadyRestRoom
 */
public class ShadyRestRoom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price;

        JOptionPane.showMessageDialog(null, "Welcome to the Shady Rest Hotel!");
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose your room from one of our three options: >> \nEnter 1 for a QUEEN \nEnter 2 for a KING \nEnter 3 for our SUITE (KING + PULLOUT COUCH)"));

        switch (userChoice) {
            case 1:
                price = 125;
                JOptionPane.showMessageDialog(null, "You have chosen to stay in our luxorious QUEEN sized room! \nThe total is $" + price + " per night.");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a room with a lake view or a park view? \nEnter (1) for LAKE (+$15) and (2) for PARK"));
                    switch (userChoice) {
                        case 1:
                            price += 15;
                            JOptionPane.showMessageDialog(null, "You have chosen to upgrade to a Lake view! Good Choice! Your new total is $" + price + " per night." );
                            break;
                    
                        case 2:
                            JOptionPane.showMessageDialog(null, "You have chosen a Park view room! Good Choice! Your total is $" + price + " per night.");
                            break;

                        default: 
                            JOptionPane.showMessageDialog(null, "It seems you have chosen an invalid option. \nFor your convienence we have set your room to a park view! \nYour total is $" + price + " per night. \nThank you for your business! ");
                            break;
                    }
                break;

            case 2:
                price = 139;
                JOptionPane.showMessageDialog(null, "You have chosen to stay in our luxorious KING sized room! \nThe total is $" + price + " per night.");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a room with a lake view or a park view? \nEnter (1) for LAKE (+$15) and (2) for PARK"));
                    switch (userChoice) {
                        case 1:
                            price += 15;
                            JOptionPane.showMessageDialog(null, "You have chosen to upgrade to a Lake view! Good Choice! Your new total is $" + price + " per night.");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "You have chosen a Park view room! Good Choice! Your total is $" + price + " per night.");
                        break;

                    default: 
                        JOptionPane.showMessageDialog(null, "It seems you have chosen an invalid option. \nFor your convienence we have set your room to a park view! \nYour total is $" + price + " per night. \nThank you for your business! ");
                        break;
                    }
                break;

            case 3:
                price = 165;
                JOptionPane.showMessageDialog(null, "You have chosen to stay in our luxorious SUITE sized room! \nThe total is $" + price + " per night.");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a room with a lake view or a park view? \nEnter (1) for LAKE (+$15) and (2) for PARK"));
                    switch (userChoice) {
                        case 1:
                            price += 15;
                            JOptionPane.showMessageDialog(null, "You have chosen to upgrade to a Lake view! Good Choice! Your new total is $" + price + " per night.");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "You have chosen a Park view room! Good Choice! Your total is $" + price + " per night.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "It seems you have chosen an invalid option. \nFor your convienence we have set your room to a park view! \nYour total is $" + price + " per night. \nThank you for your business! ");
                        break;
                    }
                break;

            default:
                price = 0;
                JOptionPane.showMessageDialog(null, "It seems like you have chosen an option we don't offer! \nThe total is $" + price + " per night.", "Invalid Selection", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}