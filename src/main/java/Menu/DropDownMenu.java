package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import LiveMonitoringPage.*;

public class DropDownMenu extends JComboBox implements ActionListener {
    //Declaration of drop-down menu
    private JComboBox<String> options;

    //Declaration of Panel, Labels & string
    private JPanel selectedPanel; //panel stores the correct page

    //Declaration of classes corresponding to pages
    private LiveMonitoringPageView liveMonitoringPageView;

    public DropDownMenu(){
        //Instantiation of variables
        options=new JComboBox<String>();
        liveMonitoringPageView =new LiveMonitoringPageView();
        selectedPanel=new JPanel();

        //Naming options of drop-down menu
        options.addItem("Live Monitoring");
        options.addItem("Records");

        //Setting default panel to Live-Monitoring Page
        selectedPanel.add(liveMonitoringPageView.getPage());

        //Action Listener to select options in menu
        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedoption = (String) combo.getSelectedItem();

                if (selectedoption.equals("Live Monitoring")) {
                    //Refresh page
                    selectedPanel.removeAll();
                    selectedPanel.updateUI();

                    //add page on panel
                    selectedPanel.add(liveMonitoringPageView.getPage());
                }
                else if (selectedoption.equals("Records")) {
                    //Refresh page
                    selectedPanel.removeAll();
                    selectedPanel.updateUI();
                    //add page on panel
                    selectedPanel.add(new JLabel("Records")); // to change with Records Page

                }
            }
        });

    }

    public JComboBox<String> getOptions() {

        return options;
    }

    public JPanel getSelectedPanel() {

        return selectedPanel;
    }
}