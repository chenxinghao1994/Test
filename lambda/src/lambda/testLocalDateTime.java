package lambda;

import java.time.LocalDateTime;

public class testLocalDateTime {

	public static void main(String[] args) {
	    // ��ȡ��ǰ������ʱ��
	    LocalDateTime currentTime = LocalDateTime.now();
	    System.out.println("��ǰʱ��: " +currentTime.getYear());
	}
}
