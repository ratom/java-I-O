/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.iohp;

import com.atom.iohp_entity.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author rabin dulal
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            /*
        FileWriter writer=new FileWriter(new File("d:/student.txt"));
        writer.write("this is file writer and it writes a string into a file");
        writer.close();*/
        /*    FileReader reader=new FileReader("d:/boys.txt");
            int i=0;
            while((i=reader.read())!=-1){
            System.out.print((char)i);
            
        }
        reader.close();
        */
            
           /* BufferedReader reader=new BufferedReader(new FileReader("d:/student.txt"));
            FileWriter writer=new FileWriter(new File("d:/students1.txt"));
           String line="";
            while((line=reader.readLine())!=null){
                System.out.println(line);
               // writer.append(line);
                writer.write(line);
                
                
                
            }
            reader.close();
            writer.close();*/
            
            
            
            BufferedReader reader=new BufferedReader(new FileReader("d:/student.txt"));
            FileWriter writer=new FileWriter(new File("d:/students1.txt"));
           String line="";
            while((line=reader.readLine())!=null){
               // System.out.println(line);
               // writer.append(line);
                //writer.write(line);
                StringTokenizer token=new StringTokenizer(line, ",");
                if(token.countTokens()>=5){
                    Student s=new Student();
                    s.setId(Integer.parseInt(token.nextToken()));
                    s.setFirstName(token.nextToken());
                    s.setLastName(token.nextToken());
                    s.setEmail(token.nextToken());
                    s.setStatus(Boolean.parseBoolean(token.nextToken()));
                    System.out.println(s.toString());
                    
                    
                    
                }
                writer.write(line);
                }
            writer.close();
            reader.close();
            
            
            
        }catch(IOException exp){
            System.out.println("I/O exception occured " +exp.getMessage());
        }
        
        
        
    }
    
}
