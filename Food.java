package Projekat1;

public class Food extends Nutriment{
    public Food(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Double getWeight() {
        return super.getWeight();
    }

    @Override
    public Double getKcal() {
        return super.getKcal();
    }

    @Override
    public Double getProteins() {
        return super.getProteins();
    }

    @Override
    public Double getCarbohydrates() {
        return super.getCarbohydrates();
    }

    @Override
    public Double getFats() {
        return super.getFats();
    }

    @Override
    public Double getFiber() {
        return super.getFiber();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String totalNutrientTable() {
        return super.totalNutrientTable();
    }



    @Override
    public String getId() {
        return null;
    }
}
