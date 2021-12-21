package collections;

public class ComparableCode implements Comparable<Student>{
		int rollno;
		String name;
		int age;
		//Create constructor
		public ComparableCode(int rollno, String name, int age) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.age = age;
		}
		//Create compareTo()
		public int compareTo(ComparableCode st) {
			if(age==st.age)
				return 0;
			else if(age>st.age)
				return 1;
			else 
				return -1;
			
		}
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}

}
