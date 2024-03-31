/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package serialisasi;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HP
 */
public class Student implements Serializable { 
    //TRANSIENT : Ketika objek dideserialisasi , id akan diinisialisasi dengan nilai default (null).
    private transient String id;
    // STATIC :Ketika suatu variabel dideklarasikan sebagai static, variabel tersebut menjadi milik kelas, bukan dari instance (objek) kelas tersebut. Artinya, nilainya bersifat bersama untuk semua instance dari kelas tersebut.
    private static String grade;
    // FINAL : NILAI TIDAK DAPAT BERUBAH SETELAH PERTAMA KALI DI INISIALISASI
    private static final String programstudi;
    private List<StudentIdentity> identities;
      
    static {
        programstudi = "Teknik Informatika"; // Menginisialisasi variabel programstudi
        //nilai programstudi tidak dapat diubah setelah inisialisasi karena menggunakan access modifier "final".
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Menghapus setter untuk programstudi karena sudah final

    public void setIdentities(List<StudentIdentity> identities) { 
        this.identities = identities; 
    }
    
    @Override
    public String toString() {
        String student, identity = "";
        student = "Identity: \r\n"
                + " Id=" + id + "\r\n"
                + "Grade=" + grade + "\r\n"
                +"ProgramStudi =" + programstudi + "\r\n"
                + "========================\r\n"
                + "Student Identity: \r\n";
        identity = identities.stream().map((obj)
                -> obj.toString()).reduce(identity, String::concat);
        return student + identity;
    }
}
//penggunaan keyword/access modifier transient, static, dan final memberikan kontrol tambahan terhadap proses serialisasi objek dan mempengaruhi bagaimana data disimpan dan dipulihkan saat objek diserialisasi.
