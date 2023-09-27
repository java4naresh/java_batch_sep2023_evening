class NestedForLoopExample 
{
	public static void main(String[] args) 
	{
		/*for(int i=1;i<6;i++) {//6<6
			for(int j=1;j<6;j++) {
			System.out.print("*");
			}
            System.out.println();
		}*/

		/*for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
			System.out.print(i);
			}
            System.out.println();
		}*/

		/*for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
			System.out.print(j);
			}
            System.out.println();
		}*/

		/*for(int i=1; i<6; i++) {
		for(int j=1; j<11; j++) {
		System.out.println(i+"*"+j+"="+(i*j));
		}
		System.out.println("=====================");
		}*/

         /*for(int i=1;i<6;i++) {//5
			for(int j=1;j<6;j++) {//5
				if(j<=i)//5<=5
			     System.out.print("*");
			}
            System.out.println();
		}*/

		for(int i=5;i>0;i--) {
			for(int j=1;j<6;j++) {
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
            System.out.println();
		}

	}
}
