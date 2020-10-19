package info.johnl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
<<<<<<< Updated upstream
=======
import java.net.URL;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
>>>>>>> Stashed changes

public class quickweb {
    private JButton vrc;
    private JPanel mainPanel;
    private JButton vERAMButton;
    private JButton AFVButton;
    private JButton vStarsButton;
    private JButton vAtisButton;
    private JButton airnavButton;
<<<<<<< Updated upstream
=======
    private JTextField prefferredAirportText;
    private JLabel timeCurrentZulu;
>>>>>>> Stashed changes

    public quickweb() {
        vrc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Program Files (x86)\\VRC\\VRC.exe");
            }
        });
        vStarsButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Program Files (x86)\\vSTARS\\vSTARS.exe");
            }
        });
        vERAMButton.addActionListener(new ActionListener() {
            @Override

            /*
            We need to change the Users/LOCALUSER
            to %appdatalocal% so it can pull that users directory instead of yours john.
             */

            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Users\\jlewi\\AppData\\Local\\vERAM\\vERAM.exe");
            }
        });
        vAtisButton.addActionListener(new ActionListener() {
            @Override

            /*
            We need to change the Users/LOCALUSER
            to %appdatalocal% so it can pull that users directory instead of yours john.
             */

            public void actionPerformed(ActionEvent e) {
                openExe("C:\\Users\\jlewi\\AppData\\Local\\vATIS\\vATIS.exe");
            }
        });

        AFVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openExe("C:\\AudioForVATSIM\\AudioForVATSIM.exe");
            }
        });

        airnavButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebsite("http://airnav.com/airport/kden");
            }
        });
<<<<<<< Updated upstream
    }

=======

        

    }

    static void showTime(){
        // Creating date object, and creating the format to display the time in.

        // I think we may need to create a loop in a seperate thread to run the time check, and have that thread publish a time check once every second.
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
    }

>>>>>>> Stashed changes
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
