package questionV14_64;

public class QE88 {

	public static void main(String[] args) {

		int wd = 0;

		String days[] = { "Sun", "Mon", "Wed", "Sat" };

		for (String s : days) {
			switch (s) {
			case "Sat":
			
			case "Sun":

				wd -= 1;// 0-1=-1 loop will break;
				        //0-1=-1 loop will break
				break;

			case "Mon":

				wd -= 1;// -1-1=-2 loop will break
				break;
			
			case "Wed":

				wd += 2;// -2+2=0 
			}
		}
		System.out.println(wd);

	}

}
