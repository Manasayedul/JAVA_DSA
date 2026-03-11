class Animal{
    void speak(){
        System.out.println("Animal makes sound");

    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat meows");

    }
}
class Basic2{
    public static void main(String args[]){
        Animal ob[]=new Animal[3];
        ob[0]=new Dog();
        ob[1]=new Cat();
        ob[2]=new Animal();
    for(Animal obj:ob){
        obj.speak();
    }
        }
}                   */

// BY USING SUPER KEYWORD
/*class Animal{
    String dogname;
    Animal(String name){
        dogname=name;
        System.out.println("Animal created");
    
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    
        System.out.println("Dog created");
    }
}
class Basic2{
    public static void main(String args[]){
        Dog ob = new Dog("Buddy");
    }
}  
