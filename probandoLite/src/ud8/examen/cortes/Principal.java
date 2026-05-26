package ud8.examen.cortes;

import java.sql.*;

public class Principal {

    public static void main(String[] args) {
    	Connection con = Conexion.conectar();
    	
        // Comprobamos la conexión ANTES del try/catch
        if (con == null) {
            System.out.println("No se pudo establecer conexión con la BD.");
            return;
        }

        try {
        	
        	con.setAutoCommit(false);

            // TRANSACCIÓN 1: insertar dos pagos
            PagoModel.insertPago(con,
                    new Pago(103, "PAGO1", "2026-05-25", 200.00));
            System.out.println("Insertado PAGO1");

            
            PagoModel.insertPago(con,
                    new Pago(103, "PAGO2", "2026-05-26", 350.00));
            System.out.println("Insertado PAGO2");
            
            con.commit();
            
            System.out.println("Transacción 1 completada\n");
            
            

            // TRANSACCIÓN 2: actualizar importes con IVA 21%
            double imp1 = PagoModel.getImporte(con, 103, "PAGO1");
            double imp2 = PagoModel.getImporte(con, 103, "PAGO2");

            double iva = 1.21;

            PagoModel.updateImporte(con, 103, "PAGO1", imp1 * iva);
            System.out.println("Actualizado PAGO1 con IVA");

            PagoModel.updateImporte(con, 103, "PAGO2", imp2 * iva);
            System.out.println("Actualizado PAGO2 con IVA");

            con.commit();
            
            System.out.println("Transacción 2 completada\n");
            
            
            
            // TRANSACCIÓN 3: borrar ambos pagos
            PagoModel.deletePago(con, 103, "PAGO1");
            System.out.println("Eliminado PAGO1");
            
            PagoModel.deletePago(con, 103, "PAGO2");
            System.out.println("Eliminado PAGO2");
            
            con.commit();
            System.out.println("Transacción 3 completada\n");
            
            
            con.close();
            System.out.println("\nConexión cerrada");
            

        } catch (SQLException e) {
        	
            System.out.println("Error detectado, intentando rollback...");

            try {
            		if(con != null) {
            			System.out.println("Rollback realizado.");
            			con.rollback();
                } 
            } catch (SQLException ex) {
                System.out.println("Error en rollback: " + ex.getMessage());
                ex.printStackTrace();
            }

            System.out.println("Error: " + e.getMessage());
        }
    }
}

