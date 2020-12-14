package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class lambdaReduce {
	public static void main(String[] args) {
		//��reduce���ǿ�����sum,min,max,average
		
		 List<Integer> integers = Arrays.asList(1, 2, 34, 4, 15);
	        // û����ʼֵʱ����ΪOptional����
	        Optional<Integer> sumOptional = integers.stream().reduce(Integer::sum);
	        System.out.println(sumOptional.get());

	        // ���Ը�һ����ʼ����ֵ
	        Integer sumReduce = integers.stream().reduce(0, Integer::sum);
	        System.out.println(sumReduce);
	        
	        // ���Ը�һ����ʼ����ֵ
	        Integer Reduce = integers.stream().reduce(0,(a,b)->a+b);
	        System.out.println(Reduce);
	        
	        //ֱ����sum����
	        int sum = integers.stream().mapToInt(a -> a).sum();
	        System.out.println(sum);
	        
	        //�����ַ�����
	        List<String> strs = Arrays.asList("H", "E", "L", "L", "O");
	        // reduce
	        String concatReduce = strs.stream().reduce("", String::concat);
	        System.out.println(concatReduce);
	}
}
