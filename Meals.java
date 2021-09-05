package Projekat1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Meals {
    private List<Meal> meals;

    public Meals() {
        meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m) {
        if (!meals.contains(m)) {
            meals.add(m);
            return true;
        }
        else
            return false;
    }
    public void remove(Meal m){
        if (meals.contains(m))
            meals.remove(m);
    }
    public List<Meal> search(String s){
        ArrayList<Meal> x= new ArrayList<>();
        for (Meal m:meals) {
            if (m.getName().toLowerCase().contains(s.toLowerCase()))
                x.add(m);
        }
        return x;
    }
    public List<Meal> search(List<Nutriment> nutriment){
        List<Meal> x = new ArrayList<>();
        for (Meal m:meals
             ) {if (nutriment.containsAll(m.getNutriments()))
                 x.add(m);
        }
        return x;
    }
    public List<Meal> search(Double kcal){
        ArrayList<Meal> x= new ArrayList<>();
        for (Meal m:meals) {
            if (m.getKcal()<=kcal)
                x.add(m);
        }
        return x;
    }
    public List<Meal> search(Double kcal,List<Nutriment> nutriment ){
        ArrayList<Meal> x= new ArrayList<>();
        for (Meal m:meals) {
            if (m.getKcal()<=kcal && nutriment.containsAll(m.getNutriments()))
                x.add(m);
        }
        return x;
    }
    public List<Meal> search(Nutriment n ){
        ArrayList<Meal> x= new ArrayList<>();
        for (Meal m:meals) {
            if (!m.getNutriments().contains(n)){
                x.add(m);
            }
        }
        return x;
    }
@Override
    public String toString(){
        String str="";
    for (Meal m:meals) {
        str+= "Name: "+m.getName()+" | "+m.getId()+"\n";
    }
    return str;
}
}
