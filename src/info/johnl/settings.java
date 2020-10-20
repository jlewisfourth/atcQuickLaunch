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

    public settings() {
    }

    public static void main(String[] args) {
        JFrame settings = new JFrame("Settings");
        settings.setContentPane(new settings().settingsPanel);
        settings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        settings.pack();
        settings.setVisible(true);
    }

}
