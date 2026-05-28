package Assignment_3;

public class RowSum_ColumnMax_Q10 {
     public static void main(String[] args) {
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };
        int sum = 0;
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sum = sum + data[i][j];

            }
            System.out.println("sum of row " + i + " is "+sum);
        }
        for(int k=0;k<data.length;k++) {
            max= data[0][k] ;
            for(int l=0;l<data.length;l++) {
                if(data[k][l]>max) {
                    max=data[k][l] ;
                }
            }
            System.out.println("Max no. in col "+k+" is "+max);

        }
    }
}

