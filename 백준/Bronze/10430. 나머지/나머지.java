import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
		
	}
 
}
/*

sc.close(); 해야하는 이유 및 resource를 사용하는 경우
JAVA에서 resource는 외부의 데이터(DB, Network, File)인데, 
이런 데이터들은 JAVA 내부에 위치한 요소가 아니기 때문에 프로세스 외부에 있는 데이터에 자바코드에서 접근하려고 하면 문제가 발생할 여지가 있ek.
특히, 입출력에 관련된 resource에 접근해 사용 중 그 resource를 사용 중에 다른 곳에서 같은 resource에 접근하여 사용하다보면 코드가 꼬일 수 있어 한 입출력에서 resource를  
사용했다면, sc.close();를 사용하여 닫아주는것이 제일 좋다.

*/
