class Parent{
    String name="Parent";
    Parent(){
    System.out.println(name);

}}

class Child extends Parent {
    String name="Child";
    Child(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class Example3{
    public static void main(String[] args) {
      Child obj=new Child();
}
}



