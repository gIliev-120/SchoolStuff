package reversePolish;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> input = new Stack<String>();
		Stack<String> operators = new Stack<String>();
		String check;
		int[] arr;
		int lastIndex = args.length - 1;
		arr = new int[lastIndex];
		final char operator = args[lastIndex].charAt(0);

		for (int i = args.length - 1; i >= 0; i--) {
			input.push(args[i]);
		}
		int k = 0;
		SwitchOp op = new SwitchOp();
		while (input.size() != 0) {
			check = input.pop();
			//System.out.println(check);
			if (check.equals("+")||check.equals("-")||check.equals("*")||check.equals("/")) {
				//System.out.println("here i put operator");
				
				for(int z=0;z<=k;z++){
				int calcNums[]={arr[z],arr[z+1]};
				op.switchOperation(calcNums, check.charAt(0)).execute();
				}
				
				
				
				
				
				
			} else {
				arr[k] = Integer.parseInt(check);
				
			}
			k++;
		}

		// System.out.println("Elemnt from input =" + input.pop());

	
		// op.switchOperation(arr, operator).execute();

	}
}
