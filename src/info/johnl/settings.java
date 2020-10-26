package info.johnl;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    private JFileChooser vrcPathChooser;
    private JFileChooser vStarsPathChooser;
    private JFileChooser vEramPathChooser;
    private JFileChooser vAtisPathChooser;

    /*
    Initialize the Default file paths.  Read the file for what each of the paths are
     */

    String userprofile = System.getenv("USERPROFILE");
    String vrcPath = "C:\\Program Files (x86)\\VRC\\VRC.exe";
    String vStarsPath = "C:\\Program Files (x86)\\vSTARS\\vSTARS.exe";
    String vEramPath = userprofile + "\\AppData\\Local\\vERAM\\vERAM.exe";
    String vAtisPath = userprofile + "\\AppData\\Local\\vATIS\\vATIS.exe";

    /*
    Create and Open Settings Panel
     */

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

        selectVRCFileLocationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "VRC Executable", "exe");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(chooser.getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("User Selected VRC EXE Location");
                    // We need to place the save location storing thing in here

                }
            }

            //vrcPathChooser.setDialogTitle("Select VRC .exe");
        });

        selectVATISFileLocationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "vATIS Executable", "exe");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(chooser.getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("User Selected vATIS Location");
                    // We need to place the save location storing thing in here

                }
            }
        });

        selectVERAMFileLocationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "vERAM Executable", "exe");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(chooser.getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("User Selected vERAM EXE Location");
                    // We need to place the save location storing thing in here

                }
            }
    });

        selectVSTARSFileLocationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "vERAM Executable", "exe");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(chooser.getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("User Selected vERAM EXE Location");
                    // We need to place the save location storing thing in here
                }
            }
        });
    }




    //TODO Create a text file to read and write to: Pulls the file paths from this file
    //TODO add function to the file selector
    //TODO style settings panel

    public static void main(String[]args){
            //PASS
        }


}
