package info.johnl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class settings {
    private JButton selectFileLocationButton3;
    private JPanel settingsPanel;
    private JButton selectFileLocationButton2;
    private JButton selectFileLocationButton1;
    private JButton selectFileLocationButton;
    private JButton saveAndExitButton;

    public static JFrame frame = new JFrame("Settings");

    public settings() {
        saveAndExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    //TODO add function to the file selector
    //TODO style settings panel

    public static void main(String[] args) {
        frame.setContentPane(new settings().settingsPanel);
        frame.setContentPane(new settings().settingsPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
