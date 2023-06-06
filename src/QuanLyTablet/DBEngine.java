/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTablet;


import java.io.FileWriter;


/**
 *
 * @author pc2
 */
public class DBEngine {
    public void saveFile(String fileName, Tablet obj) throws Exception {
        
        FileWriter fw = new FileWriter(fileName,true);
        //String value = String.format("%5d %5s %5s %5s %5d %5d %5d %5s %5s %5s\n",obj.getId(),obj.getName(),obj.getColor(),obj.getCompany(),obj.getYear(),obj.getNumber(),obj.getPrice()
                //,obj.getChip(),obj.getRam(),obj.getScreen());
        fw.write(obj.toString());
        fw.close();
    }
    
    
}
