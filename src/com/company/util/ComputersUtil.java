package com.company.util;

import com.company.tables.Computers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ComputersUtil {
    public static Computers toObj (ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String optionNumb = resultSet.getString("option_numb");
        String processor = resultSet.getString("processor");
        String compType = resultSet.getString("comp_type");
        int ramGb = resultSet.getInt("ram_gb");
        int hddGb = resultSet.getInt("hdd_gb");
        int ssdGb = resultSet.getInt("ssd_gb");
        String videoCard = resultSet.getString("videocard");
        String monitorInch = resultSet.getString("monitor_inch");
        int price = resultSet.getInt("price");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

       return new Computers(id, optionNumb, processor, compType, ramGb, hddGb, ssdGb, videoCard, monitorInch, price, createdAt, updatedAt);
    }
}
