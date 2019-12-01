
package MCADatabase;

public class time {
    public static void main(String args[]){
        for(int count = 0; count < 24; count++){
            for(int counter = 0; counter < 50; counter++){
                System.out.println(count+":"+counter);
                counter = counter + 14;
            }
        }
    }
}
