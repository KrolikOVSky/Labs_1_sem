package Lab11;

public class Lab11_2{

    public static void main(String [] args){
        Family_2 f1 = new Family_2(2, 9, false, 100000);
        Family_2 f2 = f1;
        Family_2 f3 = new Family_2();
        f3.setAdult(f2.getAdult());
        f3.setChildren(f2.getChildren());
        f3.setAnimals(f2.getAnimals());
        f3.setMoney(f2.getMoney());
        Family_2 f4 = new Family_2(2, 2, true, 35753.21f);
        Family_2 f5 = null;
        System.out.println("f1:"+ f1);
        System.out.println("f2:"+ f2);
        System.out.println("f3:"+ f3);
        System.out.println("f4:"+ f4);
        System.out.println("f5:"+ f5);
        System.out.println("\nf1==f2: "+ f1.equals(f2));
        System.out.println("f1==f3: "+ f1.equals(f3));
        System.out.println("f1==f4: "+ f1.equals(f4));
        System.out.println("f2==f3: "+ f2.equals(f3));
        System.out.println("f2==f4: "+ f2.equals(f4));
        System.out.println("f3==f4: "+ f3.equals(f4));
        System.out.println("f3==f5: "+ f3.equals(f5));
    }
}