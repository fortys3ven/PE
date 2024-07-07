/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fortys3ven.exe
 */
public class DocGhiFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void readFile(String fname) {
        try (BufferedReader bf = new BufferedReader(new FileReader(fname))) {
            String cus;
            while ((cus = bf.readLine()) != null) {
                String[] b = cus.split(":");
                if (cus.length() == 4) {
                    try {
                        customer.add(new Customer(b[0], b[1], b[2], b[3]));
                    } catch (DateTimeException e) {
                        System.out.println("Please correct format dd/MM/yyyy");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Skip next line" + cus);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
