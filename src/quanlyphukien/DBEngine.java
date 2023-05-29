/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphukien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pc2
 */
public class DBEngine {
    public void saveFile(String fileName, PhuKien obj) throws Exception {
        
        FileWriter fw = new FileWriter(fileName,true);
        
        fw.write(obj.toString());
        fw.close();
    }
    
    
}
