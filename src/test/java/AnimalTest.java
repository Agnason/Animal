public class AnimalTest {

    public static void main(String[] args) {


        Cat tvar1 = new Cat("Тосик",200, 500);
        tvar1.run(150);
        tvar1.swim(50);
        Cat cat1= new Cat("Бомбео", 200, 500);
        cat1.run (50);
        cat1.swim(40);
        Dog dog1=new Dog("Бобик", 500, 10);
        dog1.run (50);
        dog1.swim(40);
        Animal dog2 = new Dog("Ричард", 500, 10);
        dog2.run(50);
        dog2.swim(5);
        System.out.println("Создано животных: "+ Animal.countAnimal);
        System.out.println("Создано котов: "+ Cat.countCat);
        System.out.println("Создано собак: "+ Dog.countDog);

    }
}
