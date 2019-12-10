import com.sun.org.apache.xpath.internal.operations.Gt;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class ProfilePanel extends JPanel {
    private JPanel profile;
    JPanel info, heartrate,bodytemp,bloodpress,resprate, ecg;
    private GridLayout grid;
    private JLabel title,name,id,hr,bt,rr,bp ;
    private int normalvalues[]={60,37,14,110,70};

    public ProfilePanel(){
        profile=new JPanel();
        info = new JPanel();
        grid=new GridLayout(7,2,1,1);
        profile.setLayout(grid);
        profile.setBorder( new MatteBorder(2, 2, 2, 2, Color.BLACK) );

        JLabel title=new JLabel("<html><h1> Patient Profile </h1>");
        JLabel name= new JLabel("<html> <h2>Martin Holloway </h2>");
        JLabel id=new JLabel("Patient id: 0001 ");

        heartrate=new JPanel();
        heartrate.setLayout(new GridLayout(1,1));
        bodytemp=new JPanel();
        bodytemp.setLayout(new GridLayout(1,3));
        resprate=new JPanel();
        resprate.setLayout(new GridLayout(1,3));
        bloodpress=new JPanel();
        bloodpress.setLayout(new GridLayout(1,3));
        ecg=new JPanel();
        ecg.setLayout(new GridLayout(1,3));

        info.setLayout(new GridLayout(2, 1));
        info.add(name);
        info.add(id);

        heartrate.add(new JLabel("<html> <h4> Heart Rate:  </h4>"));
        heartrate.add(new JLabel(String.valueOf(normalvalues[1])+" bpm", SwingConstants.LEFT));


        bodytemp.add(new JLabel("<html> <h4> Body Temperature:  </h4>", SwingConstants.LEFT));
        bodytemp.add(new JLabel(normalvalues[1]+ " °C"));


        resprate.add(new JLabel("<html> <h4>Respiratory Rate: </h4>"));
        resprate.add(new JLabel((normalvalues[2])+ " breaths/min"));

        bloodpress.add(new JLabel("<html> <h4>Blood Pressure:   </h4>"));
        bloodpress.add(new JLabel((normalvalues[3])+" mmHg (systolic pressure)  "+normalvalues[4]+ " mmHg (diastolic pressure)"));

        profile.add(title);
        profile.add(info);
        profile.add(heartrate);
        profile.add(bodytemp);
        profile.add(resprate);
        profile.add(bloodpress);
        profile.add(ecg);


        profile.setPreferredSize(new Dimension(1400, 310));

    }

    public JPanel getProfile() {
        return profile;
    }

}