package com.warehouse.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.warehouse.util.DBUtil;
public class DispatchService {
    public boolean dispatchShipment(String shipmentID, String destination, int quantity) {
        try {
            Connection con = DBUtil.getDBConnection();
            PreparedStatement ps1 =con.prepareStatement("SELECT AVAILABLE_QUANTITY FROM SHIPMENT_TBL WHERE SHIPMENT_ID=?");
            ps1.setString(1, shipmentID);
            ResultSet rs = ps1.executeQuery();
            if (!rs.next()) {
                System.out.println("Shipment not found");
                return false;
            }
            int available = rs.getInt(1);
            if (quantity > available) {
                System.out.println("Insufficient stock");
                return false;
            }
            PreparedStatement ps2 =con.prepareStatement("UPDATE SHIPMENT_TBL SET AVAILABLE_QUANTITY=? WHERE SHIPMENT_ID=?");
            ps2.setInt(1, available - quantity);
            ps2.setString(2, shipmentID);
            ps2.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean cancelDispatch(int dispatchID) {
        System.out.println("Dispatch ID " + dispatchID + " cancelled");
        return true;
    }
}
