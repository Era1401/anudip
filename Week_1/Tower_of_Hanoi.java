public class tower_of_hanoi{

    public void toh (int n, char a, char b, char c){
        if(n==0){
            return;
        }
        toh(n-1, a, c, b);
        System.out.println("Disk " + n + ": " +  a + "->"+ b);
        toh (n-1, c, b, a);
    }

    public static void main(String[] args){
        tower_of_hanoi obj = new tower_of_hanoi();
        
        obj.toh(3, 'a' , 'b', 'c' );
    }
}