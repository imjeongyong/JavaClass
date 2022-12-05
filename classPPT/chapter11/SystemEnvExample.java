package chapter11;

public class SystemEnvExample { // 환경변수 읽기(getenv())
	public static void main(String[] args ) {
		String javaHome = System.getenv("Path");
		System.out.println("Path : " + javaHome);
	}
}