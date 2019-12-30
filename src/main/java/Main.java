import Database.DBConnect;

import javax.swing.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Add Board to Frame
        DBConnect connection=new DBConnect();
        MainBoard board=new MainBoard();
        JFrame frame = new JFrame("Remote Patient Monitoring");
        frame.setSize(1450, 925);
        frame.add(board.getMainPanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    }


