package Projekat1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
     Nutriment f1= new Food("Dynazzy" , "Cleaner  -  Lime  Away" , 78.25 ,
             770.09 , 18.23 , 10.04 , 7.74 , 6.3);
     Nutriment f2= new Food("Vinder" , "Tart  Shells  -  Barquettes,  Savory" , 73.54 ,
             495.52 , 6.62 , 21.45 , 13.24 , 18.82);
     Nutriment f3= new Food("Demimbu" , "Broom  -  Corn" , 368.65 ,
             472.08 , 19.26 , 2.91 , 14.95 , 2.38 );
     Nutriment f4 = new Food("Thoughtbeat" , "Lamb  -  Sausage  Casings" , 552.21 ,
             1448.35 , 3.31 , 9.06 , 18.95 , 21.31 );
     Nutriment f5 = new Food("Zoomlounge", "Lettuce  -  Mini  Greens,  Whole" , 652.65 ,
             1466.6 , 5.41 , 13.07 , 16.36 , 19.53 );
     Nutriment f6= new Food("Reallinks" , "Cheese  -  Swiss  Sliced" , 360.39 , 104.49 ,
             11.44 , 17.22 , 17.18 , 20.9 );
     Nutriment f7 = new Food("Blogpad" , "Eggplant  Oriental" , 870.63 , 31.0 , 19.49 ,
             1.11 , 6.17 , 13.73 );
     Nutriment f8= new Food("Aivee" , "Shiratamako  -  Rice  Flour" , 492.31 , 490.32 ,
             16.48 , 19.15 , 23.68 , 3.34);
     Nutriment f9= new Food( "Einti" , "Tarts  Assorted" , 728.18 , 986.88 ,
             21.19 , 12.03 , 10.1 , 21.87);
     Nutriment f10= new Food("LiveZ" , "Beef  -  Ground  Medium" , 797.59 , 628.1 , 11.5 , 2.67 , 20.11 , 16.57);
     Nutriment d1= new Drink("Buzzdog" , "Wine  -  Piper  Heidsieck  Brut" , 120.75 ,
             862.29 , 21.12 , 19.5 , 5.34 , 1.06 );
     Nutriment d2= new Drink( "Fivechat" , "Wine  -  Magnotta  -  Pinot  Gris  Sr" , 678.68 ,
             414.5 , 8.53 , 5.18 , 24.47 , 21.83 );
     Nutriment d3= new Drink("Topicblab" , "Coffee  Guatemala  Dark" , 824.7 , 563.19 ,
             1.39 , 14.41 , 24.72 , 13.01 );
     Nutriment d4= new Drink("Gigabox" , "Wine  -  Ice  Wine" , 361.58 , 779.91 ,
             7.09 , 17.62 , 10.85 , 5.26);
     Nutriment d5 = new Drink("Leenti" , "Juice  -  Grapefruit,  341  Ml" , 829.03 ,
             1398.13 , 24.65 , 17.15 , 21.79 , 13.36);
     Nutriment d6= new Drink( "Skajo" , "Wine  -  Marlbourough  Sauv  Blanc" , 311.8 ,
                551.16 , 0.87 , 19.57 , 24.63 , 20.28 );
    Nutriment d7= new Drink ( "Topdrive" , "Wine  -  White,  Concha  Y  Toro" , 152.14 ,
            57.62 , 18.99 , 21.49 , 7.29 , 21.8);
    Nutriment d8= new Drink("Linklinks" , "Bacardi  Raspberry" , 7.38 , 777.31 ,
            23.47 , 15.43 , 7.89 , 23.03 );
    Nutriment d9= new Drink("Tambee" , "Wine  -  White,  Ej" , 81.93 , 952.83 ,
            19.92 , 21.71 , 4.87 , 9.82 );
    Nutriment d10= new Drink("Flashspan" , "Wine  -  Harrow  Estates,  Vidal" , 884.48 ,
            1417.45 , 16.87 , 12.18 , 17.34 , 4.82 );
   List<Nutriment> n= new ArrayList<>();
       n.add(f3);
       n.add(d2);
       n.add(f7);
   Meal m1= new Meal(n, "Hamburger");
   Meal m2 = new Meal("Cheesburger");
       m1.add(d4);
       m1.add(d6);
       m1.add(d1);
       m1.add(f7);
       m2.add(d10);
       m2.add(f5);
       m2.add(f8);
       m2.add(d3);
       n.add(f5);
   Meals menu = new Meals();
        menu.add(m1);
        menu.add(m1);
        menu.add(m2);
        Fridge frizz= new Fridge();
        frizz.add(f1);
        frizz.add(f3);
        frizz.add(f8);
        frizz.add(f10);
        frizz.add(f4);
        frizz.add(d2);
        frizz.add(d10);
        frizz.add(d4);
        frizz.add(f7);
        frizz.add(d6);

    }



}
