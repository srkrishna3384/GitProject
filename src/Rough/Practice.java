package Rough;

public class Practice {
	private String Name = "RK";
	private int sal=1000;
	private String getNam() {
		return Name;
	}
	private int getSal() {
		return sal;
	}
	public static void getDisplay() {
		System.out.println("HIiIHIHIH");
	}
	public static void main(String[] args) {
		Practice pr = new Practice();
		System.out.println(pr.getNam());
		Practice.getDisplay();
	}

}
