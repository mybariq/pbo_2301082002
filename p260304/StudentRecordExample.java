/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p260304;

/**
 *
 * @author Bariq
 */
public class StudentRecordExample {
    public static void main(String[]args)
    {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Bariq");
        student1.setAge(20);
        student1.setAddress("Padang");
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(80);
        
        System.out.println("Nama              :"+student1.getName());
        System.out.println("Umur              :"+student1.getAge());
        System.out.println("Alamat            :"+student1.getAddress());
        System.out.println("Matematika        :"+student1.getMathGrade());
        System.out.println("B.Inggris         :"+student1.getEnglishGrade());
        System.out.println("Ilmu pengetahuan  :"+student1.getScienceGrade());
        System.out.println("Rata-Rata         :"+student1.getAverage());
        System.out.println("Banyak Siswa      :"+StudentRecord.getStudentCount());
        //contoh pemanggilan method overlord
        System.out.println("=================");
        student1.print(student1.getName());
        System.out.println("=================");
        student1.print(student1.getEnglishGrade(),student1.getMathGrade(),student1.getScienceGrade());
        
        StudentRecord annaRecord = new StudentRecord("anna");
        StudentRecord aliRecord = new StudentRecord("ali","padang");
        StudentRecord deniRecord = new StudentRecord(90,80,60);
        
        annaRecord.print(annaRecord.getName());
        aliRecord.print(aliRecord.getName());
        deniRecord.print(deniRecord.getEnglishGrade(),deniRecord.getMathGrade(),deniRecord.getScienceGrade());
        
        System.out.println("Banyak Siswa  :"+StudentRecord.getStudentCount());
       
    }
    
}