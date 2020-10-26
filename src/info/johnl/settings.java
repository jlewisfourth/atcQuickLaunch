package info.johnl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class settings {
    private JButton selectVATISFileLocationButton;
    private JPanel settingsPanel;
    private JButton selectVERAMFileLocationButton;
    private JButton selectVSTARSFileLocationButton;
    private JButton selectVRCFileLocationButton;
    private JButton saveAndExitButton;

    public static JFrame frame = new JFrame("Settings");

    public static void openSettings(){
        frame.setContentPane(new settings().settingsPanel);
        frame.setContentPane(new settings().settingsPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    public settings() {
        saveAndExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
        });

        selectVRCFileLocationButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){


                }
            }
        }
    }
}


    //TODO add function to the file selector
    //TODO style settings panel

    public static void main(String[] args) {
        //PASS
    }


}
