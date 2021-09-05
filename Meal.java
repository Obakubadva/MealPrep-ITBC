package Projekat1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meal implements Energy{
    private UUID id;
    private List<Nutriment>nutriments;
    private String mealName;

    public Meal(List<Nutriment> nutriments, String mealName) {
        this.nutriments = nutriments;
        this.mealName = mealName;
        id= UUID.randomUUID();
    }

    public Meal() {
        this.nutriments = nutriments;
        this.mealName = mealName;
        id= UUID.randomUUID();
    }

    public Meal(String mealName) {
        id= UUID.randomUUID();
        nutriments=new ArrayList<>();
        this.mealName = mealName;
    }

    public String getName() {
        return mealName;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public Double getKcal() {
        Double sum=0.0;
        for (Nutriment n:nutriments) {
            sum+=n.getKcal();
        }
        return sum;
    }
    public Double getProteins() {
        Double sum=0.0;
        for (Nutriment n:nutriments) {
            sum+=n.getProteins();
        }
        return sum;
    }
    public Double getCarbohydrates() {
        Double sum=0.0;
        for (Nutriment n:nutriments) {
            sum+=n.getCarbohydrates();
        }
        return sum;
    }
    public Double getFats() {
        Double sum=0.0;
        for (Nutriment n:nutriments) {
            sum+=n.getFats();
        }
        return sum;
    }
    public Double getFiber() {
        Double sum=0.0;
        for (Nutriment n:nutriments) {
            sum+=n.getFiber();
        }
        return sum;
    }
    @Override
    public boolean equals(Object o){
        Meal m=(Meal) o;
        if (this.id.equals(m.id))
            return true;
        else
            return false;
    }

    public void add(Nutriment n){
        if (!nutriments.contains(n))
            nutriments.add(n);
        else {
            for (Nutriment k:nutriments) {
                if (k.equals(n))
                    k.setWeight(k.getWeight()+n.getWeight());
            }
        }


    }
    public void remove(Nutriment n){
        nutriments.remove(n);
    }
    public void remove(Nutriment n, Double weight){
        boolean flag= false;
        if (nutriments.contains(n))
            flag = true;
        else
            System.out.println("The meal does not contain this ingredient");
        if (flag){
            for (Nutriment k:nutriments) {
                if (k.equals(n)){
                   k.setWeight(k.getWeight()- weight);
                }
            }
        }
    }

}
