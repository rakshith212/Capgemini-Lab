public class AlterString {

	public static String alterString(String str) {
		String temp=new String();
		int l=str.length();
		for(int i=0;i<l;i++) {
			char t=str.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U') {
				temp+=t;
			}
			else {
				t+=1;
				temp+=t;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		String result=alterString("JAVA");
		System.out.println(result);

	}
