package lambda;

import java.util.Calendar;

public class BigDecimal {

	
	public static void main(String[] args) {
		/**
	    BigDecimal.setScale()������������ڸ�ʽ��С����
		setScale(0)��ʾ��������
		setScale(1)��ʾ����һλС����Ĭ�����������뷽ʽ
		setScale(1,BigDecimal.ROUND_DOWN)ֱ��ɾ�������С��λ����2.35����2.3
		setScale(1,BigDecimal.ROUND_UP)��λ����2.35���2.4
		setScale(1,BigDecimal.ROUND_HALF_UP)�������룬2.35���2.4
		setScaler(1,BigDecimal.ROUND_HALF_DOWN)�������룬2.35���2.3�������5��������
		 */
		String a ="2016.0";
		java.math.BigDecimal b = new java.math.BigDecimal(a);
		System.out.println(Integer.valueOf(String.valueOf(b.setScale(0))));
	}
	
}
