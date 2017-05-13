package pl.sudoljola;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by RENT on 2017-05-13.
 */
public class DataPanel extends JPanel {

    private JTable dataTable;
    private JScrollPane dataScrollPane;

    public DataPanel() {
        super(new GridLayout(1, 1));
        dataTable = new JTable();
        dataTable.setModel(new DefaultTableModel());


        String[][] data = {{"a", "b", "c"}, {"d", "e", "f"}};
        String[] columns = {"Imię", "Nazwisko", "Panel"};
        dataTable.setModel(new DefaultTableModel(data, columns));
        dataScrollPane = new JScrollPane(dataTable);

        add(dataScrollPane);
    }

    public void fillWithDataByQuery(String query) {
        MySQLService mySQLService = new MySQLService();

        String[][] data = mySQLService.data(query);
        String[] columns = {"Imię", "Nazwisko", "Panel", "Imię", "Nazwisko", "Panel", "Imię", "Nazwisko", "Panel"};
        dataTable.setModel(new DefaultTableModel(data, columns));

    }
}
