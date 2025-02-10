public class Example{
  public static void example(String[] args){
    //ways to declare arrays in java
    String[] cars;
    String [] cars = {"Volvo","BMW","Ford","Mazda"};
    int [] myNumber = {10,34,58};
    //ways to perform operations on an array
    System.out.println(cars[0]);//getting "Volvo" from cars array
    //changing value of a specific element in an array
    cars[0] = "Opel"; //changing "Volvo" to "Opel"
    //getting length of an array
    System.out.println(cars.length);

  }
}


class SecondExample{
  public static void main example(String [] args){
    String[] names = {"lily", "lianne", "liliane" ,"thegreatest", "themostnoble", "thebrightest"};
    for (String i : cars){
      System.out.println(i);
 
  }
}


class InstantiatingArrays{
  public static void main(String[] args){
    int [] myNewArray = new int[10];//fixed array size
    //setting a value for an index position in the int array
    myNewArray[5] = 50; //this is setting the 6th position as 50


    //double array
    double[] myDoubleArray = new double[10];
    myDoubleArray[2] = 3.5;
    System.out.println(myDoubleArray[2]);
    
      
      
  }
}

class question{
    public static void main(String[] args){

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("---------------------------");
        for (int i : firstTen){
            System.out.println(i);
            System.out.println("----------------------------");
        }


    }
}

class newExample{
  public static void main(String[] args){
    int[] newArray;
    newArray = new int[] {1,2,3,4,5};
    for (int i = 0; i<newArray.length; i++){
      System.out.println(newArray[i] + " ");}
  }

  


  

