public class Test {

    public static void main(String[] args){
        IntegerArrayList list = new IntegerArrayList();
        IntegerArrayList list1 = new IntegerArrayList();
        IntegerArrayList list2 = new IntegerArrayList();
        IntegerArrayList list3 = list2;
        IntegerArrayList list4 = list1;



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

        System.out.println("Test add(index, val): try to add item at position 5");
        System.out.println("expected: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110  size: 11");
        list.add(5, 45);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test add(index, val): try to add an item at position 0");
        System.out.println("expected: 1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  size: 11");
        list.add(0, 1);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test add(index, val): add item to position size");
        System.out.println("1, 10, 20, 30, 40, 45, 50, 60, 70, 80, 90, 100, 110  size: 13");
        list.add(list.size(), 130);
        System.out.println("List: " + list + ", Size: " + list.size());
        
        System.out.println("Test add(index, val): add item to position -1");
        System.out.println("Expected: IndexOutOfBoundsException: -1");
        try {    
            list.add(-1, 10);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }  
        System.out.println("List: " + list + ", Size: " + list.size());


        System.out.println("Test add(index, val): add item to position size() + 1");
        System.out.println("expected: IndexOutOfBoundsException: 15");
        try {    
            list.add(list.size()+1, 130);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }  
        System.out.println("List: " + list + ", Size: " + list.size());

        for (int val=10; val<=50; val+=10)
        {
            list1.add(val);
        }

        System.out.println("Test get(index):  get all values from the list1");
        System.out.println("Expected: 10 20 30 40 50");
        for (int i=0; i<list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }

        System.out.println("Test get(index): Try to get the item at invalid index (position 5) from the List1");
        System.out.println("Expected:  IndexOutOfBoundsException: 5");
        try {    
            list1.get(5);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }  

        System.out.println("Test get(index): Try to get the item at invalid index (position -1) from the List");
        System.out.println("IndexOutOfBoundsException: -1");
        try {    
            list1.get(-1);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        } 

        System.out.println("Test size() on an empty list:");
        System.out.println("Expected: [] size: 0");
        System.out.println("List2: " + list2 + ", Size2: " + list2.size());

        System.out.println("Test size() on a list of size 5");
        System.out.println("Expected: [10, 20, 30, 40, 50] size: 5");
        System.out.println("List1: " + list1 + ", Size1: " + list1.size());

        System.out.println("Test clear() on an empty list: ");
        System.out.println("Expected: [] size: 0");
        list2.clear();
        System.out.println("List1: " + list2 + ", Size2: " + list2.size());

        System.out.println("Test clear() on a non-empty list: ");
        System.out.println("Expected: [] size: 0");
        list.clear();
        System.out.println("List: " + list + ", Size: " + list.size());

        for (int val=10; val<=100; val+=10)
        {
            list.add(val);
        }
        System.out.println("Test set(index, val): set position 0 to a value ");
        System.out.println("Expected: 5, 20, 30, 40, 50, 60, 70, 80, 90, 100  size: 10");
        list.set(0, 5);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test set(index, val): set position 5 to a value");
        System.out.println("Expected: 5, 20, 30, 40, 50, 55, 70, 80, 90, 100  size: 10");
        list.set(5, 55);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test set(index, val): set position size()-1 to a value");
        System.out.println("Expected: 5, 20, 30, 40, 50, 55, 70, 80, 90, 95  size: 10");
        list.set(list.size()-1, 95);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test set(index, val): set position -1 to a value");
        System.out.println("IndexOutOfBoundsException: -1");
        try {    
            list.set(-1, 100);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        } 

        System.out.println("Test set(index, val): set position size() to a value");
        System.out.println("Expected:  IndexOutOfBoundsException: 10");
        try {    
            list.set(list.size(), 100);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        } 

        System.out.println("Test remove(index): remove item at index 0");
        System.out.println("Expected: 20, 30, 40, 50, 60, 70, 80, 90, 100  size: 9");
        list.remove(0);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test remove(index): remove item at index 5");
        System.out.println("Expected: 20, 30, 40, 50, 60, 80, 90, 100  size: 8");
        list.remove(5);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test remove(index): remove item at index size()-1");
        System.out.println("Expected: 20, 30, 40, 50, 60, 80, 90  size: 7");
        list.remove(list.size()-1);
        System.out.println("List: " + list + ", Size: " + list.size());

        System.out.println("Test remove(index): remove item at position -1");
        System.out.println("Expected:  IndexOutOfBoundsException: -1");
        try {    
            list.remove(-1);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        } 

        System.out.println("Test remove(index): remove item at position size()");
        System.out.println("Expected:  IndexOutOfBoundsException: 7");
        try {    
            list.remove(list.size());
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        } 

        System.out.println("Test isEmpty() on an empty list:");
        System.out.println("Expected: true");
        System.out.println(list2.isEmpty());

        list.clear();
        for (int val=10; val<=100; val+=10)
        {
            list.add(val);
        }
        System.out.println("Test isEmpty() on an nonempty list:");
        System.out.println("Expected: false");
        System.out.println(list.isEmpty());

        System.out.println("Test contains() on an empty list:");
        System.out.println("Expected: false");
        System.out.println(list2.contains(100));

        System.out.println("Test contains() on an non-empty list when item IS in list:");
        System.out.println("Expected: true");
        System.out.println(list.contains(100));

        System.out.println("Test contains() on an non-empty list when item is NOT in list:");
        System.out.println("Expected: false");
        System.out.println(list.contains(200));

        System.out.println("Test indexOf() on an empty list:");
        System.out.println("Expected: -1");
        System.out.println(list2.indexOf(100));

        System.out.println("Test indexOf() on an non-empty list when item IS in list:");
        System.out.println("Expected: 0");
        System.out.println(list.indexOf(10));

        System.out.println("Test indexOf() on an non-empty list when item is NOT in list:");
        System.out.println("Expected: -1");
        System.out.println(list.indexOf(10000));

        System.out.println("Test indexOf() on an non-empty list when item IS in list:");
        System.out.println("Expected: 4");
        System.out.println(list.indexOf(50));

        System.out.println("Test indexOf() on an non-empty list when item is NOT in list:");
        System.out.println("Expected: -1");
        System.out.println(list1.indexOf(10000));

        System.out.println("Test equals() on two EMPTY lists:");
        System.out.println("Expected: true");
        System.out.println(list2.equals(list3));

        System.out.println("Test equals() on two non-empty lists with the same values in each:");
        System.out.println("Expected: true");
        System.out.println(list1.equals(list4));

        list4.add(0);
        System.out.println("Test equals() on two non-empty lists of unequal size with the same values in corresponding positions:");
        System.out.println("Expected: false");
        System.out.println(list1.equals(list4));

        System.out.println("Test equals() on two non-empty lists of unequal size with the same values in corresponding positions: ");
        System.out.println("Expected: faise");
        System.out.println(list1.equals(list));

        System.out.println("Test equals() on two non-empty lists of unequal size with the same values in corresponding positions: ");
        System.out.println("Expected: faise");
        System.out.println(list1.equals(list));

        list4.remove(list4.size());
        list4.set(2, 0);
        System.out.println("Test equals() on two non-empty lists of equal size with different values:");
        System.out.println("Expected: faise");
        System.out.println(list1.equals(list4));



    }
}

