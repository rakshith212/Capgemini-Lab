	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the text");
		String s=scan.nextLine();
		int w=0;
		int ln=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				w++;
			}
			else if(s.charAt(i)=='\\' && s.charAt(i+1)=='n') {
				ln++;
			}
		}
		System.out.println("Number of Characters in the text are:"+s.length());
		System.out.println("Number of Words in the text are: "+w);
		System.out.println("Number of Lines in the text are: "+ln);

	}
