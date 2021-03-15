/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author MINH
 */
public class Thread1 extends Thread {

    Number number;

    public Thread1(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            number.inSo();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
