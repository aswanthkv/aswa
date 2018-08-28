package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static parking.Park.opt;


public class Addressbook {

    int houseid;
    String ownname;
    String adress;
    int age;

    Addressbook(int houseid, String ownname, String adress, int age) {
        this.houseid = houseid;
        this.ownname = ownname;
        this.adress = adress;
        this.age = age;
    }


    static void display(HashMap<Integer, Addressbook> tr)
    {
        System.out.println("hi");
        for (Map.Entry<Integer, Addressbook> ob : tr.entrySet())
        {
            Addressbook b =ob.getValue();
            System.out.println(ob.getKey());
            System.out.println("house number=" + b.houseid + " name=" + b.ownname + " age=" + b.age + " address=" + b.adress);
        }

    }


    static void dele(HashMap<Integer, Addressbook> tr, int id) {
        for (Map.Entry<Integer, Addressbook> obj : tr.entrySet()) {
            Addressbook a = obj.getValue();
            if (a.houseid == id) {
                int k=obj.getKey();
                tr.remove(k);
                break;
            }
        }
    }
    static void update(HashMap<Integer, Addressbook> tr, int id) {
        for (Map.Entry<Integer, Addressbook> obj : tr.entrySet()) {
            Addressbook a = obj.getValue();
            if (a.houseid == id) {
                int k=obj.getKey();
                System.out.println("enter new address");
                Scanner c=new Scanner(System.in);
                String p=c.nextLine();
                tr.put(k,new Addressbook(id,a.ownname,p,a.age));
                break;
            }
        }
    }


    public static void main(String[] args) {
        //for (int i = 0; i < 20; i++) {
            int opt;
            int id;
            int hid;
            String add;
            String name;
            int ag;
            HashMap<Integer, Addressbook> tr = new HashMap<>();
            //tr.put(457,new Addressbook(45,"yu","rty",89));
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your option" + "\n1-Add \n2-Display\n3-delete");

//                Scanner scn = new Scanner(System.in);
//                Scanner j = new Scanner(System.in);
//                System.out.println("enter house number");
//                hid = scn.nextInt();
//                System.out.println("enter owner name");
//                name = j.nextLine();
//                System.out.println("enter address");
//                add = j.nextLine();
//                System.out.println("enter age");
//                ag = scn.nextInt();
                tr.put(33,new Addressbook(516,"jishnu","palarivattom",22));
                tr.put(50,new Addressbook(34,"kl","wee",4));
                tr.put(99,new Addressbook(600,"arun","pampady",25));
                //tr.put(hid, new Addressbook(hid, name, add, ag));
                System.out.println("size" + tr.size());
                //display(tr);
                //opt = sc.nextInt();
                display(tr);
                System.out.println("enter id to be deleted");
                Scanner scan = new Scanner(System.in);
                id = scan.nextInt();
                dele(tr,id);
                display(tr);
        System.out.println("enter house id of house to be updated;");
        int k=scan.nextInt();
        update(tr,k);
        display(tr);
    }
    }






