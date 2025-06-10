
import java.util.*;
class TwoSetsOps{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> s2 = new HashSet<>();
		System.out.println("Enter no.of elememts in set 1:");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++){
			s1.add(sc.nextInt());
			
		}

		System.out.println("Enter no.of elememts in set 2:");
		int n2=sc.nextInt();
		for(int i=0;i<n2;i++){
			s2.add(sc.nextInt());
			
		}

		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		HashSet<Integer> intersect = new HashSet<>(s1);
		intersect.retainAll(s2);
		

		System.out.println(union);
		System.out.println(intersect);
		
	}
}


/*
Enter no.of elememts in set 1:
4
4
2
1
3
Enter no.of elememts in set 2:
5
4
5
1
7
1
[1, 2, 3, 4, 5, 7]
[1, 4]
*/