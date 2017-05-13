package pl.sudoljola;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//	MySQLService mySQLService = new MySQLService();
//	mySQLService.getData("select * from customer");


        JFrame frame = new JFrame("Retarded SQL Workbench");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));

        DataPanel dataPanel = new DataPanel();
        dataPanel.fillWithDataByQuery("select * from customer");
        frame.setContentPane(dataPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
