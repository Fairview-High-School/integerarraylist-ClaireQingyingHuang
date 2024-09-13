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

        System.out.println("Test get(index): try to get the item at invalid index(position 11) from the List");
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

        System.out.println("Test add(index, val): try to add an item at invalid index(position 11) from the List");
        System.out.println("expected: IndexOutOfBoundException: 11");
        try {
            System.out.println(list.add(11, 1));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }
   
        System.out.println("Test clear() and isEmpty(): try to clear the list and test if it's empty after clearing");
        System.out.println("expected: True");
        list.clear();
        System.out.println(list.isEmpty());
        
        System.out.println("Test add(index, val): add the 11th item to the list (causes an array resize)");
        System.out.println("Expected: 10 20 30 40 50 60 70 80 90 100 110");
        int a=0;
        for (int val=10; val<=110; val+=10)
        {
            list.add(a, val);
            a++;
        }
        System.out.println(list);

        System.out.println("Test remove(index): remove  values from list");
        System.out.println("Excepted: 10 20 30 40 50 60 70 80 90 100");
        list.remove(11);
        System.out.println(list);

        System.out.println("Test remove(index): try to remove an item at invalid index(position 11) from the List");
        System.out.println("expected: IndexOutOfBoundException: 11");
        try {
            System.out.println(list.remove(11));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Test size(): try to get the size of the List");
        System.out.println("expected: 10");
        System.out.println(list.size());

        System.out.println("Test set(index, val): try to add an item at invalid index(position 11) from the List");
        System.out.println("expected: IndexOutOfBoundException: 11");
        try {
            System.out.println(list.set(11, 1));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Test set(index, val): try to set the first item in the List to 0");
        System.out.println("expected: 0 20 30 40 50 60 70 80 90 100");
        list.set(0, 0);
        System.out.println(list);

        System.out.println("Test contains(val): try to see if an element 10 is in the List");
        System.out.println("expeted: false");
        System.out.println(list.contains(10));

        list.set(0, 10);

        System.out.println("Test contains(val): try to see if an element 10 is in the List");
        System.out.println("expeted: true");
        System.out.println(list.contains(10));

        System.out.println("Test indexOf(val): try to find a nonexist element's index in the List");
        System.out.println("expected: -1");
        System.out.println(list.indexOf(0));

        System.out.println("Test indexOf(val): try to find an exist element's index in the List");
        System.out.println("expected: 0");
        System.out.println(list.indexOf(10));

        IntegerArrayList other = new IntegerArrayList[10];
        other = list;
        System.out.println("Test equals(other): try to see if the 2 same lists are the equal");
        System.out.println("expected: true");
        System.out.println(list.equals(other));

        other.clear();
        System.out.println("Test equals(other): try to see if the 2 different lists are the equal");
        System.out.println("expected: false");
        System.out.println(list.equals(other));

        

        
    }  
}

