public class Multiplication {
    public static void main(String[] args){

        for(int i = 1; i<11;i++){
            System.out.print("\t"+i);
        }
        System.out.println();


        System.out.println("-------------------------------------------------------------------------------------------------------");

        for(int i =1; i<11;i++){
            System.out.print(i+"\t");
            for(int j=1;j<11;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }

    
}
