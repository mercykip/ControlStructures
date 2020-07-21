public class Task3 {
    int n=3;

    public void check(){
        int r=5;//number of rows
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++) {
                System.out.print("(");
            }
            for (int k=1; k<=r; k++) {

                System.out.print(")");
            }
            System.out.println("");
        }


    }


    public static void main(String[] args) {
        Task3 t3=new Task3();
        t3.check();
    }
}
