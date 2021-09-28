import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    /*
    1. Create GUI
    2. Get Input, when a button is clicked
    3. The Math - 3.28 Feet in a Meter.
                F-->M DIVIDE BY 3.8
                m-->F MULTIPLY BY 3.28
    4. Display result, probably will prompt the user to enter a distance and convert to feet.
     */

    public static void main(String[] args) {

        JFrame window = new JFrame("Feet/ Meters Conversion");
        JPanel panel = new JPanel();
        JButton feetToMetersBut = new JButton("Feet to Meters");
        JButton metersToFeetBut = new JButton("Meters to feet");

        window.setSize(250, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        feetToMetersBut.addActionListener(new FeetToMeter());
        metersToFeetBut.addActionListener(new MeterToFeet());

        panel.add(feetToMetersBut);
        panel.add(metersToFeetBut);
        window.add(panel);

        window.setVisible(true);
    }

    private static class FeetToMeter implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of feet:"));
            double meters = feet / 3.28;
            JOptionPane.showMessageDialog(null, meters + " meters.");

        }
    }

    private static class MeterToFeet implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            double meters = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of meters:"));
            double feet = meters * 3.28;
            JOptionPane.showMessageDialog(null, feet + " feet.");

        }
    }
}
