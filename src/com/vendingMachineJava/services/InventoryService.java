package com.vendingMachineJava.services;

import java.sql.*;
import com.vendingMachineJava.models.*;

import javax.swing.*;

class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/vendingmachinedb","Philip Martin","Safety123?");
            //here vendingmachinedb is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product, select * from inventory, select * from purchasetransaction, select * from vendinmachine");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

public class InventoryService {

//    public List<Inventory> GetAll()
//    {
//
//
//            con.Open();
//            using (var cmd = conn.CreateCommand())
//            {
//                cmd.CommandText = @"SELECT
//                Qty,
//                p.[Name] AS ProductName,
//                VendingMachineId
//                FROM Inventory i
//                JOIN Product p ON i.ProductId = p.Id";
//
//                var reader = cmd.ExecuteReader();
//                var types = new List<Inventory>();
//                while (reader.Read())
//                {
//                    var type = new Inventory()
//                    {
//                        Qty = reader.GetInt32(reader.GetOrdinal("Qty")),
//                        Product = new Product
//                        {
//                        Name = reader.GetString(reader.GetOrdinal("ProductName"))
//                        },
//                        VendingMachineId = reader.GetInt32(reader.GetOrdinal("VendingMachineId"))
//                    };
//                    types.Add(type);
//                }
//
//                reader.Close();
//
//                return types;
//            }
//
//    }
}
