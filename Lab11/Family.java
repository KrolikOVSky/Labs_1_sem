package Lab11;

public class Family{
    
    //Main vars
    
    public final static String familyFormatString = "\nFamily:\nNum of adults: %d;\nNum of children: %d;\nHaving cat or dog: %s\nSum of pays: %.2f(rub)\n";
    private int adult, children;
    private boolean animals;
    private float money;
    public Family(){adult = 0; children = 0; animals = false; money = 0.0f;}

    public Family(int adult1, int children1, boolean animals1, float money1){
        adult = adult1;
        children = children1;
        animals = animals1;
        money = (float)money1;
    }

    //Getters

    public int getAdult(){return adult;}

    public int getChildren(){return children;}

    public boolean getAnimals(){return animals;}

    public float getMoney(){return money;}

    //Setters

    public void setAdult (int adult1){adult = adult1;}

    public void setChildren (int children1){children = children1;}

    public void setAnimals (boolean animals1){animals = animals1;}

    public void setMoney (float money1){money = (float)money1;}

    //Additional methods

    public String toString() {return String.format(familyFormatString, adult, children, animals, money);}

    public boolean equals(Family obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(adult == obj.adult && children == obj.children && animals == obj.animals && money == obj.money) return true;
        return false;
    }
}