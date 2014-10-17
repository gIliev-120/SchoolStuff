
public class minus implements Operations {

	private int[] arguments;
	int sum=0;
	public minus(int[] anArray){
		this.arguments=anArray;
	}
	
		
		
		@Override
		public int exec() {
			int index = 0;
			for(int arg : arguments){
				if(index == 0){
					sum=arguments[index];
					
					
					
				}else{
				sum-=arguments[index];;
				}
				index++;
			}
			System.out.println(sum);
			return sum;
		}
	
		
	}


