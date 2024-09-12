public class IntegerArrayList implements IntegerList{
    private Integer[] data;
    private int size;
    public IntegerArrayList(){
        data = new Integer[10];
        size = 0;
    }

    public void add(Integer val){
        if (size >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length*2];
            for (int i=0; i<data.length; i++)
                biggerArray[i] = data[i];
            data = biggerArray;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("index: " + index);
        for (int i=index; i<data.length; i++)
        {
            int a=0;
            temp[a] = data[i];
            a++;
        }
        Integer[] biggerArray = new Integer[data.length*2];
        for (int i=0; i<index; i++)
            biggerArray[i] = data[i];
        biggerArray.add(val);
        data = biggerArray + temp;
    }

    public void set(int index, Integer val){

    }

    public void clear(){

    }

    public void remove(int index){

    }

    public Integer get(int index){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("index: " + index);
        return data[index];
    }

    public int size(){
        return null;
    }

    public String toString(){
        String result = "[";
        for (int i=0; i<size-1; i++)
        {
            result += data[i] + ",";
        }
        result += data[size-1] + "]";
        return result;
    }


}



