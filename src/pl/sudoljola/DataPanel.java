package pl.sudoljola;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by RENT on 2017-05-13.
 */
public class DataPanel extends JPanel {

    private JTable dataTable;

    public DataPanel() {
        super(new GridLayout(1, 1));
        dataTable = new JTable();
        dataTable.setModel(new DefaultTableModel());


        String[][] data = {{"a", "b", "c"}, {"a", "b", "c"}};
        String[] columns = {"Imię", "Nazwisko"};
        dataTable.setModel(new DefaultTableModel(data, columns));

        add(dataTable);
    }
}
