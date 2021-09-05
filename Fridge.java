package Projekat1;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge() {
        nutriments= new ArrayList<>();
    }



    public List<Nutriment> getNutriments() {
        return nutriments;
    }
    public void remove(Nutriment n){
        nutriments.remove(n);
    }
    public void remove(Nutriment n, double weight){
        for (Nutriment t:nutriments) {
            if (t.equals(n))
                t.setWeight(t.getWeight()-weight);
        }

    }
    public void add(Nutriment n){
        boolean flag= false;
        if (!nutriments.contains(n))
            flag = true;
       if (flag)
           nutriments.add(n);
       else
           for (Nutriment t:nutriments) {
               if (t.equals(n))
                   t.setWeight(t.getWeight()+n.getWeight());
           }

    }
}

