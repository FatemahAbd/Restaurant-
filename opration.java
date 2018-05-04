

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;


public class opration {
Queue x = new Queue(10);
    ArrayList<Order> m = new ArrayList<Order>();
    Scanner in;

    public void writeOrder(String custumer_name, String order_name) {
        try {
            File f = new File("req.txt");
            Formatter fo = new Formatter(new FileOutputStream(f, true));
            //int numTable, int numOrder, String type, int number, String drink, String makablat
            fo.format("%s :%s %n", custumer_name , order_name);
            fo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<Order> readorder() {
        ArrayList<Order> no = new ArrayList<Order>();
        try {
            in = new Scanner(new FileInputStream("req.txt"));
        } catch (Exception ex) {

        }
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] a = line.split(":");
             Order n = new Order(a[0], a[1]);
            no.add(n);  
            x.inQueue(n);
        }
        in.close();
        return no;
    }

}
