package arrays;

public class Twodimesnsionalarray {

	public static void main(String[] args) {
		/*int i[][]=new int[3][2];
		i[0][0]=10;
		i[0][1]=20;
		i[1][0]=30;
		i[1][1]=40;
		i[2][0]=50;
		i[2][1]=60;
		/*for(int j=0;j<=2;j++)
		{
			for(int k=0;k<=1;k++)
			{
				System.out.print(i[j][k]+"     ");
			}*/
		int i[][]= {{10,20,30},{40,50,60},{70,80,90},{100,110,120},{130,140,150}};
		for(int j[]:i) 
		{
			for(int k:j)
			{
				
			
			System.out.print(k+"   ");
		}
			System.out.println();

	}

}
}
		
		

