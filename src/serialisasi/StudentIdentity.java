/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;


/**
 *
 * @author HP
 */
public class StudentIdentity  implements Serializable{
    String nama; 
    String NISN;
    String umur;
    String TTL;
    String alamat;
    
    
    
 
    public StudentIdentity(String name,String nisn ,String age, String born, String address ) { 
        this.nama = name;
        this.NISN = nisn;
        this.umur = age;
        this. TTL = born;
        this. alamat = address;
        

    } 
 
    @Override 
    public String toString() { 
        return "\r\nNama=" + nama + "\r\nUmur=" + umur + "\r\nNISN = " + NISN + "\r\nTTL = " + TTL + "\r\nAlamat = " + alamat  ; 
    }     
}
    
    

