package info.johnl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class quickweb {
    private JButton vrc;
    private JPanel mainPanel;
    private JButton vERAMButton;
    private JButton settingsButton;
    private JButton vStarsButton;
    private JButton vAtisButton;
    private JButton airnavButton;
    private JTextField prefferredAirportText;

    public quickweb() {
        vrc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Program Files (x86)\\VRC\\VRC.exe");
                //TODO Pull from the file selector path
            }
        });
        vStarsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Program Files (x86)\\vSTARS\\vSTARS.exe");
                //TODO Pull from the file selector path
            }
        });
        vERAMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Users\\jlewi\\AppData\\Local\\vERAM\\vERAM.exe");
                //TODO Pull from the file selector path
            }
        });
        vAtisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Users\\jlewi\\AppData\\Local\\vATIS\\vATIS.exe");
                //TODO Pull from the file selector path
            }
        });
        airnavButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String airportSelection = prefferredAirportText.getText();
                openWebsite("http://www.airnav.com/airport/" + airportSelection);

            }
        });


        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO find a way to open settings panel (located in settings.main)
            }
        });
    }


    static void openExe(String url){
        try {
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void openWebsite(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new quickweb().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
