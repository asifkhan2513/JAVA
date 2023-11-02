class Room{
    int length, breath;
    Room(int x , int y){
        length = x;
        breath = y;    
    }
    void Area(){
        int area = length*breath;
        System.out.println(" the area is = "+area);
    }

} 
class kitchen extends Room{
    int height;
    kitchen(int x ,int y,int z){
        super(x,y);
        height= z;

    }
    void Valume(){
        int vol= (length*breath*height);
        System.out.println("the valume is = "+vol);
    }
}

 class Calc {
    public static void main(String[] args) {
        kitchen s = new kitchen(2, 3, 4);
             s.Valume();
             s.Area();
    }
}
