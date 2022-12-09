import models.Items;
import models.Orders;
import models.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Items i1=new Items("shirt",30,400, "Huba", "blackXL");
        Items i2= new Items("halfT-shirt",34,600,"Zara", "blueXXL");
        Items i3= new Items("T-shirt",34,600,"Zara", "blueXXL");
        Items i4= new Items("Hoddie",34,600,"Zara", "blueXXL");
        Items i5= new Items("FullT-shirt",34,600,"Zara", "blueXXL");


        ArrayList<Items> firstOrder = new ArrayList<Items>();
        firstOrder.add(i1);
        firstOrder.add(i4);
        firstOrder.add(i2);

        ArrayList<Items> secondOrder = new ArrayList<Items>();
        secondOrder.add(i3);
        secondOrder.add(i5);


        Orders o1= new Orders(30, 1, 400, 5,);
        Orders o2= new Orders(34,2,600,3,);

        ArrayList<Orders>FOrder= new ArrayList<Orders>();
        FOrder.add(o1);
        ArrayList<Orders>SOrder= new ArrayList<Orders>();
        SOrder.add(o2);

        Users u1= new Users ("ram", "987654321","Pasikot",FOrder);
        Users u2= new Users ("Ali","9876543217","sifal", SOrder);



    }
}
