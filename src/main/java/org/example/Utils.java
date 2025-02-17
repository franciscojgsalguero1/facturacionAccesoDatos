package org.example;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Utils {
    static String url = "jdbc:mysql://localhost:3306/gestion";
    static String user = "root";
    static String password = "";

    // Private constructor to prevent instantiation
    private Utils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            System.out.println(url);
            System.out.println(user);
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error1");
        } catch (SQLException e) {
            System.out.println("Error2");
        }
        return connection;
    }

    public static JScrollPane resizeTableColumns(JTable table) {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < table.getRowCount(); row++) {
                Component comp = table.prepareRenderer(table.getCellRenderer(row, column), row, column);
                preferredWidth = Math.max(comp.getPreferredSize().width + 10, preferredWidth);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }

        return new JScrollPane(table);
    }
}