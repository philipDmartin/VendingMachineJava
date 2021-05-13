package com.vendingMachineJava.services;

import com.vendingMachineJava.models.Product;
import com.vendingMachineJava.models.PurchaseTransaction;
import com.vendingMachineJava.models.VendingMachine;

import java.sql.*;
import java.sql.Time;
import java.util.List;
import java.lang.Object;



public class PurchaseTransactionService
{
    //Connection to SQL Database
    private String _connectionString;
    private Connection connection;

    public Connection getCon() { return this.connection; }
    public void setCon(Connection connection) { this.connection = connection; }

    public PurchaseTransactionService()
    {
        _connectionString = "jdbc:mysql://localhost:3306/vendingmachinedb\",\"Philip Martin\",\"Safety123?";
    }

//    public Connection Connection;
//    {
//        get { return new Connection(_connectionString); }
//    }

    //Get All Controller
    public List<PurchaseTransaction> GetAll()
    {
//        using (var conn = connection)
      // {
//        Connection.open()
        try{
            connection = DriverManager.getConnection(_connectionString);

            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT PurchaseTotal, PurchaseQty, Time, p.[Name] AS ProductName, v.[Name] AS VendingMachineName FROM PurchaseTransactions pt JOIN Product p ON pt.ProductId = p.Id JOIN VendingMachine v ON pt.VendingMachineId = v.Id");

//            types = new Variant();
            Variant types = new List<PurchaseTransaction>();
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            connection.close();

            } catch(Exception e){ System.out.println(e);}

//            using (var cmd = conn.CreateCommand())
            {
                cmd.CommandText = @"SELECT
                PurchaseTotal,
                        PurchaseQty,
                        Time,
                        p.[Name] AS ProductName,
                v.[Name] AS VendingMachineName
                FROM PurchaseTransactions pt
                JOIN Product p ON pt.ProductId = p.Id
                JOIN VendingMachine v ON pt.VendingMachineId = v.Id";

                var reader = cmd.ExecuteReader();
                var types = new List<PurchaseTransaction>();
                while (reader.Read())
                {
                    var type = new PurchaseTransaction()
                    {
                        PurchaseTotal = reader.GetInt32(reader.GetOrdinal("PurchaseTotal")),
                        PurchaseQty = reader.GetInt32(reader.GetOrdinal("PurchaseQty")),
                        Time = reader.GetDateTime(reader.GetOrdinal("Time")),
                        Product = new Product
                    {
                        Name = reader.GetString(reader.GetOrdinal("ProductName"))
                    },
                        VendingMachine = new VendingMachine
                    {
                        Name = reader.GetString(reader.GetOrdinal("VendingMachineName"))
                    },
                    };
                    types.Add(type);
                }

                reader.Close();

                return types;
            }
  //      }
    }

    //Update Controller
//    public void Update(PurchaseTransactions type)
//    {
//        using (var conn = Connection)
//        {
//            conn.Open();
//            using (var cmd = conn.CreateCommand())
//            {
//                cmd.CommandText = @"
//                UPDATE PurchaseTransactions
//                SET PurchaseTotal = @purchaseTotal
//                        PurchaseQty = @purchaseQty,
//                Time = @time
//                        ProductId = @productId
//                        VendingMachineId = @vendingMachineId
//                        WHERE Id = @id";
//                cmd.Parameters.AddWithValue("@PurchaseTotal", type.PurchaseTotal);
//                cmd.Parameters.AddWithValue("@PurchaseQty", type.PurchaseQty);
//                cmd.Parameters.AddWithValue("@Time", type.Time);
//                cmd.Parameters.AddWithValue("@ProductId", type.ProductId);
//                cmd.Parameters.AddWithValue("@vendingMachineId", type.VendingMachineId);
//
//                cmd.ExecuteNonQuery();
//            }
//        }
//    }

    //Add Controller
//    public void Add(PurchaseTransactions type)
//    {
//        using (var conn = Connection)
//        {
//            conn.Open();
//            using (var cmd = conn.CreateCommand())
//            {
//                cmd.CommandText = @"
//                INSERT INTO PurchaseTransactions (PurchaseTotal, PurchaseQty, Time, ProductId, VendingMachineId)
//                OUTPUT INSERTED.ID
//                VALUES (@purchaseTotal, @purchaseQty, @time, @productId, @vendingMachineId)";
//                cmd.Parameters.AddWithValue("@purchaseTotal", type.PurchaseTotal);
//                cmd.Parameters.AddWithValue("@purchaseQty", type.PurchaseQty);
//                cmd.Parameters.AddWithValue("@time", type.Time);
//                cmd.Parameters.AddWithValue("@productId", type.ProductId);
//                cmd.Parameters.AddWithValue("@vendingMachineId", type.VendingMachineId);
//
//                type.Id = (int)cmd.ExecuteScalar();
//            }
//        }
//    }
}
