package com.orm;

import com.orm.repository.ConnectionMySQL;
import org.apache.commons.io.IOUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        new Main().initDDL();
    }


    private void initDDL() {
        try (Statement statement = ConnectionMySQL.getConnection().createStatement()) {
            statement.execute(IOUtils.toString(this.getClass().getResourceAsStream("recourses/script.sql")));
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

}