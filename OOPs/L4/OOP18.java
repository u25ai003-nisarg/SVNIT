public class OOP18{
    public static int  getindex(int x,int y,int z){
        return(x*3*3+y*3+z);
    }

    public static void set(int value,int indexX,int indexY,int indexZ,int [] Array){
        int index=getindex(indexX,indexY,indexZ);
        Array[index]=value;
    }

    public static int get(int indexX,int indexY,int indexZ,int [] Array){
        int index=getindex(indexX,indexY,indexZ);
        return Array[index];
    }

    public static void main(String args[]){
        int [] Array=new int[3*3*3];

        set(10,0,1,2,Array);
        set(20,1,0,2,Array);
        set(30,2,1,0,Array);

        System.out.println("Value at the index(0,1,2) is->"+get(0,1,2,Array));
        System.out.println("Value at the index(1,0,2) is->"+get(1,0,2,Array));
        System.out.println("Value at the index(2,1,0) is->"+get(2,1,0,Array));
    }
}