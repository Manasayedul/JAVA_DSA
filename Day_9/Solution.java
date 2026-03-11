import java.util.Scanner;
class Solution {
    char data;
    Solution link;
    Solution head;

        void push(char c){
            Solution newNode = new Solution();
            newNode.data=c;
            if(head==null){
                head=newNode;
            }else{
                newNode.link=head;
                head=newNode;
            }
        }
        void pop(){
            if(!isEmpty()){
                head=head.link;
            }
        }
        char peek(){
                if(!isEmpty()){
                return head.data;
            }
            return '*';
        }
        boolean isEmpty(){
            return head==null;
        }
    
    public boolean isValid(String s) {
        Solution ob = new Solution();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='[' || ch == '{'){
                ob.push(ch);
            }else{
                if(ob.isEmpty()){
                    return false;
                }
                if((ch==')' && ob.peek()!= '(') ||
                (ch==']' && ob.peek()!='[')  ||
                (ch=='}' && ob.peek()!='{')  ){
                    return false;
                }
                ob.pop();
            }
        }
        return ob.isEmpty();
    }
    8public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();

        Solution obj = new Solution();
        boolean result = obj.isValid(input);

        System.out.println(result);
    }
}

