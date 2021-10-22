import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switcheroo");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme: Dark");
    JButton buttonThemeWarren = new JButton("Theme: Warren");
    JButton buttonThemePrimary = new JButton("Theme: Primary");


    public ColorSwitchGUI(){
        //create your GUI
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        //Add Action Listeners to buttons
        buttonThemeDark.addActionListener(new ThemeDark());
        buttonThemeWarren.addActionListener(new ThemeWarren());
        buttonThemePrimary.addActionListener(new ThemePrimary());

        panel.add(buttonThemeDark);
        panel.add(buttonThemePrimary);
        panel.add(buttonThemeWarren);

        window.add(panel);
        window.setVisible(true);

    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent){

        Color panelback = new Color(38, 28, 44);
        Color buttonback = new Color(62, 44, 65);
        Color buttontext = new Color(110, 133, 178);

        panel.setBackground(panelback);
        buttonThemeDark.setBackground(buttonback);
        buttonThemeDark.setForeground(buttontext);
        buttonThemeWarren.setBackground(buttonback);
        buttonThemeWarren.setForeground(buttontext);
        buttonThemePrimary.setBackground(buttonback);
        buttonThemePrimary.setForeground(buttontext);


      }
    }
    private class ThemeWarren implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelback = new Color(26, 28, 32);
            Color buttonback = new Color(207, 117, 0);
            Color buttontext = new Color(244, 244, 244);

            panel.setBackground(panelback);
            buttonThemeDark.setBackground(buttonback);
            buttonThemeDark.setForeground(buttontext);
            buttonThemeWarren.setBackground(buttonback);
            buttonThemeWarren.setForeground(buttontext);
            buttonThemePrimary.setBackground(buttonback);
            buttonThemePrimary.setForeground(buttontext);

        }
    }
    private class ThemePrimary implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelback = Color.RED;
            Color buttonback = Color.BLUE;
            Color buttontext = Color.GREEN;

            panel.setBackground(panelback);
            buttonThemeDark.setBackground(buttonback);
            buttonThemeDark.setForeground(buttontext);
            buttonThemeWarren.setBackground(buttonback);
            buttonThemeWarren.setForeground(buttontext);
            buttonThemePrimary.setBackground(buttonback);
            buttonThemePrimary.setForeground(buttontext);
        }
    }
}
