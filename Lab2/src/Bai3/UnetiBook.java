/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class UnetiBook extends Book {

    private String language;
    private int semester;

    public UnetiBook() {
    }

    public UnetiBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ngon ngu:" + language);
        System.out.println("Hoc ky:" + semester);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngon ngu: ");
        language = sc.nextLine();
        System.out.println("nhap hoc ky:");
        semester = Integer.parseInt(sc.nextLine());
    }

    public void sort(UnetiBook[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].getYearPublishing() < b[j].getYearPublishing()) {
                    UnetiBook tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }

    public void searchNameBook(UnetiBook[] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sach:");
        String nameBook = sc.nextLine();
        int dem = 0;
        System.out.println("thong tin sach ban muon tim la :");
        for (int i = 0; i < b.length; i++) {
            if (b[i].getBookName().equals(nameBook)) {
                b[i].display();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("khong co sach ban muon tim");
        }
    }
    
    public void searchNameAuthor(UnetiBook[] b){
        
    }
    
}
