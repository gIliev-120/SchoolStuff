
public class divine implements Operations {

	private int[] arguments;
	int sum=0;
	public divine(int[] anArray){
		this.arguments=anArray;
	}
	
		
		
		@Override
		public int exec() {
			int index = 0;
			for(int arg : arguments){
				if(arguments[index]!=0){
						if(index == 0){
						sum=arguments[index];
								
						}else{
						sum/=arguments[index];
						}
						index++;
				}else{break;}
			}
			System.out.println(sum);
			return sum;
		}

}
