package com.warehouse.dao;

import java.sql.*;
import com.warehouse.bean.Shipment;
import com.warehouse.util.DBUtil;

public class ShipmentDAO {

    public boolean addShipment(Shipment s) {
        try {
            Connection con = DBUtil.getDBConnection();
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO SHIPMENT_TBL VALUES (?,?,?,?,?)");

            ps.setString(1, s.getShipmentID());
            ps.setString(2, s.getItemDescription());
            ps.setInt(3, s.getTotalQuantity());
            ps.setInt(4, s.getAvailableQuantity());
            ps.setDate(5, new java.sql.Date(s.getReceivedDate().getTime()));

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public Shipment findShipment(String id) {
        try {
            Connection con = DBUtil.getDBConnection();
            PreparedStatement ps =
                con.prepareStatement("SELECT * FROM SHIPMENT_TBL WHERE SHIPMENT_ID=?");
            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Shipment s = new Shipment();
                s.setShipmentID(rs.getString(1));
                s.setItemDescription(rs.getString(2));
                s.setTotalQuantity(rs.getInt(3));
                s.setAvailableQuantity(rs.getInt(4));
                s.setReceivedDate(rs.getDate(5));
                return s;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
