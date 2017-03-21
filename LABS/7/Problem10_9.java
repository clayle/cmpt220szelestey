
public class Problem10_9 {

	public static void main(String[] args) {
		Course cmpt220 = new Course("cmpt220");

		cmpt220.addStudent("Clayton");
		cmpt220.addStudent("Steven");
		cmpt220.addStudent("Audrey");

		cmpt220.dropStudent("Steven");

		String[] students = cmpt220.getStudents();
		for (int i = 0; i < cmpt220.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
	}
}