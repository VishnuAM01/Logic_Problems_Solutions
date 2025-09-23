package Logic_Problems_Solutions;
public class ProveStringIsImmutable {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2= "Java";
		String s3= new String("Java");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("is s1==s2? =>"+ (s1==s2));
		System.out.println("is s1==s3? =>"+ (s1==s3));
		System.out.println("is s1.equals(s2) => "+s1.equals(s2));
		System.out.println("is s1.equals(s3) => "+s1.equals(s3));
	}
}
