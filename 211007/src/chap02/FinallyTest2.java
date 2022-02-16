package chap02;

public class FinallyTest2 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		}
		}
		static void startInstall() {
			System.out.println("startInstall");
		}
		static void copyFiles() {
			System.out.println("copyFiles");
			
		}
		static void deleteTempFiles() {
			System.out.println("deleteTempFiles");
		}

	}


