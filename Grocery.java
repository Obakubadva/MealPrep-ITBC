package Projekat1;

public abstract class Grocery implements Energy{
    public String company;
    public String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public Grocery(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Grocery g=(Grocery) obj;
        if (this.company.equals(((Grocery) obj).company)&& this.name.equals(((Grocery) obj).name))
            return true;
        else
        return false;
    }
    public abstract String getId();
    public String getName(){
        return name;
    }

}
