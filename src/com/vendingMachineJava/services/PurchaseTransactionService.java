package com.vendingMachineJava.services;

import com.vendingMachineJava.models.Product;
import com.vendingMachineJava.models.PurchaseTransaction;
import com.vendingMachineJava.models.VendingMachine;

import java.sql.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.time.*;
import java.sql.Driver;

public class PurchaseTransactionService {
    //Connection to SQL Database
    private String _connectionString;
    private Connection connection;

    private Product product;


    public Connection getCon() {
        return this.connection;
    }

    public void setCon(Connection connection) {
        this.connection = connection;
    }


    public PurchaseTransactionService() {

        _connectionString = "jdbc:mysql://localhost/vendingmachinedb?user=Philip" + " " + "Martin&password=Safety123?";
    }

    //Get All Controller
    public List<PurchaseTransaction> GetAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(_connectionString);

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT PurchaseTotal, PurchaseQty, Time, p.[Id] AS ProductId, p.[Name] AS ProductName, v.[Id] AS VendingMachineId, v.[Name] AS VendingMachineName, v.[PricePerSoda] AS VendingMachinePricePerSoda FROM PurchaseTransactions pt JOIN Product p ON pt.ProductId = p.Id JOIN VendingMachine v ON pt.VendingMachineId = v.Id");

            List<PurchaseTransaction> types = new ArrayList<>();

            while (rs.next()) {
                {
                    int PurchaseTotal = rs.getInt(0);
                    int PurchaseQty = rs.getInt(1);
                    Date Time = rs.getDate(2);

                    product = new Product(rs.getInt(3), rs.getString(4));

                    VendingMachine vendingMachine = new VendingMachine(rs.getInt(7), rs.getString(8), rs.getInt(9));

                    PurchaseTransaction type = new PurchaseTransaction(1, 1, 1, null, 1, null, 1, null);

                    types.add(type);

                }

            }

            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            connection.close();

            return types;

        }
        catch (Exception e) {
            System.out.println(e);
        }

       return null;

    }
}

//            using (var cmd = conn.CreateCommand())
//            {
//                cmd.CommandText = @"SELECT
//                PurchaseTotal,
//                        PurchaseQty,
//                        Time,
//                        p.[Name] AS ProductName,
//                v.[Name] AS VendingMachineName
//                FROM PurchaseTransactions pt
//                JOIN Product p ON pt.ProductId = p.Id
//                JOIN VendingMachine v ON pt.VendingMachineId = v.Id";
//
//                var reader = cmd.ExecuteReader();
//                var types = new List<PurchaseTransaction>();
//                while (reader.Read())
//                {
//                    var type = new PurchaseTransaction()
//                    {
//                        PurchaseTotal = reader.GetInt32(reader.GetOrdinal("PurchaseTotal")),
//                        PurchaseQty = reader.GetInt32(reader.GetOrdinal("PurchaseQty")),
//                        Time = reader.GetDateTime(reader.GetOrdinal("Time")),
//                        Product = new Product
//                    {
//                        Name = reader.GetString(reader.GetOrdinal("ProductName"))
//                    },
//                        VendingMachine = new VendingMachine
//                    {
//                        Name = reader.GetString(reader.GetOrdinal("VendingMachineName"))
//                    },
//                    };
//                    types.Add(type);
//                }
//
//                reader.Close();
//
//               return types;
//            }
  //      }
   // }

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
  //     }
//   }
//}
