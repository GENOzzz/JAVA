import java.util.Scanner;
public class p166_8 {

   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
      System.out.println("정수 몇 개?>>");
      int array [];
      int num = S.nextInt();
      
      array = new int[num];          //입력받은 정수 크기 만큼의 배열 array 생성
      
      for (int i =0; i < num; i++) {         //입력한 숫자만큼 배열 안의 정수를 랜덤으로 만들기 
         array [i] = (int)(Math.random()*100+1); //랜덤한 숫자를 array[i]에 저장 
         for(int j =0; j < i; j++) {
            if(array[i] == array[j]) { //방금 만든 array[j]가 위의array[i] 와 같다면 
               i--; //i-1 을 해서 다시 for문을 반복한다
            }
         }
      }
      for(int i=0; i<num; i++) {            //i=0부터  (array배열 길이)만큼 반복 
         System.out.print(array[i]+" ");      //array[i]출력
         if(i%10==9) {                  //배열은 0부터 시작함. 나머지가 9까지되는 숫자까지 출력하고 
            System.out.println();         //참이면 줄바꿈
         }
      }
      System.out.println();            //마지막으로 줄바꿈(for문이 끝나고 )
      S.close();
   }
}
