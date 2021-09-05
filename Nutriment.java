package Projekat1;

public abstract class Nutriment extends Grocery {
    private Double weight;
    private Double kcal;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;

    public Nutriment(String company, String name, Double weight, Double kcal, Double proteins,
                     Double carbohydrates, Double fats, Double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }
    public void update(String company, String name, Double weight, Double kcal, Double proteins,
                       Double carbohydrates, Double fats, Double fiber){
        if (company!=null)
            this.company=company;
        if (name!=null)
            this.name=name;
        if (weight!=null)
            this.weight=weight;
        if (kcal!=null)
            this.kcal=kcal;
        if (proteins!=null)
            this.proteins=proteins;
        if (carbohydrates!=null)
            this.carbohydrates=carbohydrates;
        if (fats!=null)
            this.fats=fats;
        if (fiber!=null)
            this.fiber=fiber;
    }


    public Double getWeight() {
        return weight;
    }

    @Override
    public Double getKcal() {
        return kcal;
    }

    public Double getProteins() {
        return proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public Double getFiber() {
        return fiber;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String str= "Company: "+company+"\n"+
                "Name: "+name+"\n"+
                "Weight: 100g"+"\n"+
                "Kcal: "+kcal+"\n"+
                "Proteins: "+proteins+"%"+"\n"+
                "Carbohydrates: "+carbohydrates+"%"+"\n"+
                "Fats: "+fats+"%"+"\n"+
                "Fibres: "+fiber+"%"+"\n";
        return str;
    }
    public String totalNutrientTable(){
        return "Company: "+company+"\n"+
                "Name: "+name+"\n"+
                "Weight: "+ weight+"\n"+
                "Kcal: "+(weight*kcal/100)+"\n"+
                "Proteins: "+(weight*proteins/100)+"\n"+
                "Carbohydrates: "+(weight*carbohydrates/100)+"\n"+
                "Fats: "+(weight*fats/100)+"\n"+
                "Fibres: "+(weight*fiber/100)+"\n";
    }

}
