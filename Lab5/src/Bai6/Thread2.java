/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author kuxut
 */
public class Thread2 {

    myObject obj;

    public Thread2(myObject obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            while (true) {
                obj.kiemtra();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }

}
