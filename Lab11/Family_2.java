package Lab11;

public class Family_2{

    //Main vars

    public final static String familyFormatString = "\nFamily:\nNum of adults: %d;\nNum of children: %d;\nHaving cat or dog: %s\nSum of pays: %.2f(rub)\n";
    private int adult, children;
    private boolean animals;
    private float money;
    public Family_2(){adult = 0; children = 0; animals = false; money = 0.0f;}

    public Family_2(int adult, int children, boolean animals, float money){
        this.adult = adult;
        this.children = children;
        this.animals = animals;
        this.money = (float)money;
    }

    //Getters

    public int getAdult(){return adult;}

    public int getChildren(){return children;}

    public boolean getAnimals(){return animals;}

    public float getMoney(){return money;}

    //Setters

    public void setAdult (int adult){this.adult = adult;}

    public void setChildren (int children){this.children = children;}

    public void setAnimals (boolean animals){this.animals = animals;}

    public void setMoney (float money){this.money = (float)money;}

    //Additional methods

    public String toString() {return String.format(familyFormatString, adult, children, animals, money);}

    public boolean equals(Family_2 obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(adult == obj.adult && children == obj.children && animals == obj.animals && money == obj.money) return true;
        return false;
    }
}