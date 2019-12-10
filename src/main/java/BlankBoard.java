import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JComponent;

public class BlankBoard extends JPanel {
    private JPanel mainpanel;
    //private VitalSignsBoard board;

    private MenuBoard menuBoard;
    private GridLayout grid;

    public BlankBoard(){
        mainpanel = new JPanel();

        //VitalSignsBoard board = new VitalSignsBoard();

        grid=new GridLayout(1,1);
        menuBoard=new MenuBoard();
        mainpanel.setLayout(grid);
        mainpanel.add(menuBoard.getHeader());

    }

    public JPanel getMainpanel() {
        return mainpanel;
    }
}

