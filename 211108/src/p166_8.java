import java.util.Scanner;
public class p166_8 {

   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
      System.out.println("���� �� ��?>>");
      int array [];
      int num = S.nextInt();
      
      array = new int[num];          //�Է¹��� ���� ũ�� ��ŭ�� �迭 array ����
      
      for (int i =0; i < num; i++) {         //�Է��� ���ڸ�ŭ �迭 ���� ������ �������� ����� 
         array [i] = (int)(Math.random()*100+1); //������ ���ڸ� array[i]�� ���� 
         for(int j =0; j < i; j++) {
            if(array[i] == array[j]) { //��� ���� array[j]�� ����array[i] �� ���ٸ� 
               i--; //i-1 �� �ؼ� �ٽ� for���� �ݺ��Ѵ�
            }
         }
      }
      for(int i=0; i<num; i++) {            //i=0����  (array�迭 ����)��ŭ �ݺ� 
         System.out.print(array[i]+" ");      //array[i]���
         if(i%10==9) {                  //�迭�� 0���� ������. �������� 9�����Ǵ� ���ڱ��� ����ϰ� 
            System.out.println();         //���̸� �ٹٲ�
         }
      }
      System.out.println();            //���������� �ٹٲ�(for���� ������ )
      S.close();
   }
}
