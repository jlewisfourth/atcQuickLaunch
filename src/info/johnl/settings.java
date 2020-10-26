package info.johnl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;


public class settings {
    private JButton selectVATISFileLocationButton;
    private JPanel settingsPanel;
    private JButton selectVERAMFileLocationButton;
    private JButton selectVSTARSFileLocationButton;
    private JButton selectVRCFileLocationButton;
    private JButton saveAndExitButton;

    String userprofile = System.getenv("USERPROFILE");
    String vrcPath = "C:\\Program Files (x86)\\VRC\\VRC.exe";
    String vstarsPath = "C:\\Program Files (x86)\\vSTARS\\vSTARS.exe";
    String veramPath = userprofile + "\\AppData\\Local\\vERAM\\vERAM.exe";
    String vatisPath = userprofile + "\\AppData\\Local\\vATIS\\vATIS.exe";

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
            }
        });
    }

        selectVRCFileLocationButton.addActionListener(new ActionListener();
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime.getRuntime().exec("explorer.exe /select," + vrcPath);
            }
    )};



    public JButton

    //TODO add function to the file selector
    //TODO style settings panel

    public static void main(String[] args) {
        //PASS
    }


}
