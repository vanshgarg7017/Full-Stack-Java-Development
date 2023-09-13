package Fullstack.org;

public class forEach {
	public static void main(String[] args) {
		String[] stringArray= {"Chand","Pan","Pooja","Mia","Ram Ji"};
//		for(int i=0;i<=stringArray.length-1;i++)
		for(String name:stringArray)
		{
//			System.out.println(stringArray[i]);
			System.out.println(name);
		}
	}

}
