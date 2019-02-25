import java.util.Scanner;

public class StudentScore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tổng số SV :");
        int total = scanner.nextInt();
        double[] arrScore = new double[total];
        int x = 0;
        while (x < total)
        {
            System.out.println("Điểm thứ " + (x +1));
            arrScore[x] = scanner.nextDouble();
            x++;
        }
        int count = 0;
        for ( int i = 0; i < arrScore.length; i++)
        {
            System.out.print(arrScore[i] + ".");
            if ( arrScore[i] >=5)
            {
                count++;
            }

        }
        System.out.println();
        System.out.println("Số SV đỗ là : " + count);
    }
}
