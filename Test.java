public class Test {

    public IntegerArrayList(){
        IntegerArrayList list = new IntegerArrayList[10];
    }
    public static void main(String[] args){
        IntegerArrayList list = new IntegerArrayList();
        
        System.out.println("Test add(val) and get(index): add 5 values to list, and then get the 5 values from the list");
        System.out.println("Excepted: 10 20 30 40 50");
        for (int val=10; val<=50; val+=10)
        {
            list.add(val);
        }
        System.out.println(list);
        for (int i=0; i<5; i++)
        {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Test add(val): add the 11th item to the list (causes an array resize)");
        System.out.println("Expected: 10 20 30 40 50 60 70 80 90 100 110");
        for (int val=60; val<=110; val+=10)
        {
            list.add(val);
        }
        System.out.println(list);

        System.out.println("Test get(index): try to get the item at invalid index(position 11) from teh List");
        System.out.println("expected: IndexOutOfBoundException: 11");
        try {
            System.out.println(list.get(11));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Test get(index): try to get the item at invalid index(position -1) from teh List");
        System.out.println("expected: IndexOutOfBoundException: -1");

        try {    
            System.out.println(list.get(-1));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }  
    }  
}

