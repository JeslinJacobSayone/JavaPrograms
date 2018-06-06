package myjava;

class Container<T>{
    T values;
    public void getvalues(T a){
        values=a;
    }
    public void putvalue(){
        System.out.println("value is : "+values);
    }
    
}
public class GenericsDemo {
    public static void main(String[] args) {
        
        Container<Integer> val=new Container<>();
        val.getvalues(100);
        val.putvalue();
        
        Container<Double> valfloat=new Container<>();
        valfloat.getvalues(19.11);
        valfloat.putvalue();
    }
}
