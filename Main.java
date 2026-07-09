

public class Main {


  public String findGreater(int num1, int num2){
    if (num1>num2){
      return "the greater number";
    }else{
      return "not the greater nuber";
    }
  }
 
       

  
  
    public static void main(String[] args){

      int a = 100;
      int b = 20;

      Main obj = new Main();
    
      obj.findGreater(a,b);
      String result = obj.findGreater(a,b);
      System.out.println(result);
      
       

      
       }

    }