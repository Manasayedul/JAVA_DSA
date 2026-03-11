class FunctionCalling{
    void rec(int num){
        if(num>10){
            return;
        }
        System.out.println(num);
        rec(num+1);
    }
    public static void main(String args[]){
        FunctionCalling ob=new FunctionCalling();
        ob.rec(1);
    }
}
