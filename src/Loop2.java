public class Loop2 {
  //Create the main method
    public static void main(String[]args){
     //Create for loop to display odd numbers from 1-20
     for(int i =1;i<=20; i++){
         //Create an if statement using the modulo operator
         if(i%2==1){
             System.out.println(i);
         }
     }
//Create a for loop to display even numbers from 1-20
        for(int i=1;i<=20;i++){
            //Create an if statement using the modulo operator
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
