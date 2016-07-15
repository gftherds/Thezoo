package Animal;

import java.util.*;
import java.util.jar.Attributes;

/**
 * Created by Therdsak on 7/13/2016.
 */
public class Projectzoo {


    public static void main(String[] args) {
        System.out.println("ต้องการดูข้อมูลหรือไม่\n" + " 1 ต้องการดู\n" + " 2 ไม่ต้องการดู ");
        Scanner scn = new Scanner(System.in);
        int frist = scn.nextInt();
        if (frist == 1) {
            System.out.println("ดูข้อมูลทั้งหมด");
            Duty a = new Duty();
            a.add_Animal("T0001", "tiger", "P'Ble", "male");
            a.add_Animal("T0002", "bird", "N'Golf", "male");
            a.add_Animal("T0003", "lion", "P'Aof", "Female");
            a.add_Animal("T0004", "rabbit", "N'Nack", "male");
            a.add_Animal("T0005", "girrate", "Game", "female");

            System.out.println(a.show(1));
            System.out.println(a.show(2));
            System.out.println(a.show(3));
            System.out.println(a.show(4));
            System.out.println(a.show(5));
            System.out.println("ต้องการดูผู้ดูเเลหรือไม่\n" + " 1 ต้องการดู\n" + " 2 ไม่ต้องการดู ");
            Scanner scn1 = new Scanner(System.in);
            int secoond = scn.nextInt();
            if (secoond == 1) {
                System.out.println("ดูข้อมูลทั้งหมด");
                Duty b = new Duty();
                a.add_Duty("Therdsak", "Meat");
                a.add_Duty("Suraphong", "Plant");

                System.out.println(a.show1(1));
                System.out.println(a.show1(2));
            }       else if(frist == 2) {
                System.out.println("ขอบคุณครับ");
            }
            else{
                System.out.println("กรอกข้อมูลผิดพลาด");
            }
        }else if(frist == 2) {
            System.out.println("ขอบคุณครับ");
        }
        else{
            System.out.println("กรอกข้อมูลผิดพลาด");
        }
    }

}