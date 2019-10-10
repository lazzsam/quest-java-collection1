import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> list = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
    
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

    	Hero hero1= new Hero("Black Widow", 34);
    	Hero hero2= new Hero("Captain America", 100);
    	Hero hero3= new Hero("Vision", 3);
    	Hero hero4= new Hero("Iron Man", 48);
    	Hero hero5= new Hero("Scarlet Witch", 29);
    	Hero hero6=new Hero("Thor", 1500);
    	Hero hero7=new Hero("Spider-Man", 18);
    	Hero hero8=new Hero("Hulk", 49);
    	Hero hero9=new Hero("Doctor Strange", 42);
    	
    	
    	list.add(hero1); //index à 0
    	list.add(hero2);
    	list.add(hero3);
    	list.add(hero4);
    	list.add(hero5);
    	list.add(hero6);
    	list.add(hero7);
    	list.add(hero8);
    	list.add(hero9);//index à 8
    	
        // TODO 3 : It's Thor birthday, now he's 1501
    	hero6.setAge(1501);

        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(list);

        // TODO 5 : Keep only the half of the list
    	List<Hero> halfHero = Hero.sublist(0, (int) (Hero.size/2));

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(int i = 0; i < halfHero.size(); i++)
        {
          System.out.println(halfHero.get(i).getName());
        }
    	
    }
}
