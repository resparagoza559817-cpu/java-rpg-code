package game;
import javax.swing.JOptionPane;
public class Main {
 public static void main(String[] args) {
     String warriorName = JOptionPane.showInputDialog("Enter a name for the Warrior:");
     String mageName = JOptionPane.showInputDialog("Enter a name for the Mage:");
     
     GameCharacter warrior = new Warrior(warriorName);
     GameCharacter mage = new Mage(mageName);

     while (warrior.getHp() > 0 && mage.getHp() > 0) {
         
         String warriorMove = JOptionPane.showInputDialog(
             warrior.getName() + "'s turn! Current HP: " + warrior.getHp() + 
             "\n" + mage.getName() + "'s HP: " + mage.getHp() +
             "\nChoose a move:\n1. Attack\n2. Special Move"
         );
         
         if (warriorMove != null) {
             switch (warriorMove) {
                 case "1":
                     warrior.attack(mage);
                     break;
                 case "2":
                     warrior.specialMove(mage);
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "Invalid move! Turn skipped.");
                     break;
             }
         }
         
         if (mage.getHp() <= 0) {
             break;
         }

         String mageMove = JOptionPane.showInputDialog(
             mage.getName() + "'s turn! Current HP: " + mage.getHp() + 
             "\n" + warrior.getName() + "'s HP: " + warrior.getHp() +
             "\nChoose a move:\n1. Attack\n2. Special Move"
         );
         
         if (mageMove != null) {
             switch (mageMove) {
                 case "1":
                     mage.attack(warrior);
                     break;
                 case "2":
                     mage.specialMove(warrior);
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "Invalid move! Turn skipped.");
                     break;
             }
         }
     }

     if (warrior.getHp() <= 0) {
         JOptionPane.showMessageDialog(null, mage.getName() + " wins!");
     } else {
         JOptionPane.showMessageDialog(null, warrior.getName() + " wins!");
     }
 }
}