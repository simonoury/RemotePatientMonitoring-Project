package Menu;

import Model.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabsMenu{
    //Declaration of variables
    private JTabbedPane tabbedPanel;
    private JPanel patient1,patient2;
    private JPanel patients[] = new JPanel[11];
    private DropDownMenu dropdown,dropdown2;
    private DropDownMenu[] dropDownMenu = new DropDownMenu[11];

    public TabsMenu() {
        //Instantiate the drop-down menu
        dropDownMenu[0] = new DropDownMenu(1);
        dropDownMenu[1] = new DropDownMenu(2);
        dropDownMenu[2] = new DropDownMenu(3);
        dropDownMenu[3] = new DropDownMenu(4);
        dropDownMenu[4] = new DropDownMenu(5);
        dropDownMenu[5] = new DropDownMenu(6);
        dropDownMenu[6] = new DropDownMenu(7);
        dropDownMenu[7] = new DropDownMenu(8);
        dropDownMenu[8] = new DropDownMenu(9);
        dropDownMenu[9] = new DropDownMenu(10);
        dropDownMenu[10] = new DropDownMenu();


        //Instantiation of Panels
        for (int i=0; i<patients.length; i++)
        {
            patients[i] = new JPanel();
            patients[i].setLayout(new FlowLayout());
            patients[i].add(dropDownMenu[i].getOptions());
            patients[i].add(dropDownMenu[i].getSelectedPanel());
            if(i==10){
                JButton augmentKButton = new JButton("Augment");
                augmentKButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dropDownMenu[10].Augment();
                    }
                });
                JButton decrementKButton = new JButton("Decrement");
                decrementKButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dropDownMenu[10].Decrement();
                    }
                });
                patients[i].add(augmentKButton);
                patients[i].add(decrementKButton);

            }
        }

        //Tabs Menu
        tabbedPanel = new JTabbedPane();

        for (int i=0; i<11; i++)
        {
            tabbedPanel.addTab("Patient "+(i+1), null, patients[i], "Patient "+(i+1));
        }
        tabbedPanel.setSelectedIndex(0);
        tabbedPanel.setPreferredSize(new Dimension(1450, 925));
        tabbedPanel.setVisible(true);
    }

    public JTabbedPane getTabbedPanel() {
        return tabbedPanel;
    }

    public void Update()
    {
        int index = tabbedPanel.getSelectedIndex();
        dropDownMenu[index].Update();
    }
}

