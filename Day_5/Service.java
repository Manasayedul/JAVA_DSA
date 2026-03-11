class Service{
    static void process(Task t){
        System.out.println(t);

    }
}
class Task {
    static Task o=new Task();
    static void start(){
        Service.process(o);

    }
}
class Example1{
    public static void main(String args[]){
          
        Task.start();
}
}
