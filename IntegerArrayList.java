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
        int a=0;
        for (int i=index; i<data.length; i++)
        {
            temp[a] = data[i];
            a++;
        }
        if (size+1 >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length*2];
            for (int i=0; i<index; i++)
                biggerArray[i] = data[i];
            biggerArray[index] = val;
            data = biggerArray + temp;
        }
        else
        {
            for (int i=index; i<size-2; i++)
                temp = data[i+1];
                data[i+1] = data[i];
                data[i+2] = temp;
            data[index] = val;
        }
        
    }

    public void set(int index, Integer val){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("index: " + index);
        data[index] = val;
    }

    public void clear(){
        size = 0;
    }

    public void remove(int index){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("index: " + index);
        for (int i=index; i<size-1; i++)
            data[i] = data[i+1];
        size-=1;
    }

    public Integer get(int index){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("index: " + index);
        return data[index];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (size==0)
            return true;
        return false;
    }

    public boolean contains(int val){
        for (int i=0; i<size; i++)
            if (data[i]==val)
                return true;
        return false;
    }

    public int indexOf(int val){
        for (int i=0; i<size; i++)
            if (data[i]==val)
                return i;
        return -1;
    }

    public boolean equals(IntegerArrayList other){
        if (other.size != size)
            return false;
        for (int i=0; i<size; i++)
        {
            if (data[i].equals(other[i])==false)
                return false;
        }
        return true;
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



