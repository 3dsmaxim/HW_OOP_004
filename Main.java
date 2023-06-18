import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

        public static void main(String[] args) {

                Student student1 = new Student(4, "Mich",
                                "yty", "Glen", LocalDate.now());
                Student student2 = new Student(2, "Nik",
                                "Tyt", "Len", LocalDate.now());
                Student student3 = new Student(3, "Lika",
                                "Tot", "Jen", LocalDate.now());

                TreeSet<Student> treeSet = new TreeSet<Student>(new UserComparator<>());
                treeSet.add(student1);
                treeSet.add(student2);
                treeSet.add(student3);

                for (var b : treeSet) {
                        System.out.println(b);
                }
                System.out.println("------------");

                Teacher teacher1 = new Teacher(4l, 222,
                                "Petrov",
                                "Petr",
                                "Petrovich", LocalDate.now());
                teacher1.setTeacherId(4l);
                teacher1.setGroupId(222);
                Teacher teacher2 = new Teacher(7, 222,
                                "Ivanov",
                                "Ivan",
                                "Ivanich", LocalDate.now());
                teacher2.setTeacherId(7L);
                teacher2.setGroupId(222);
                Teacher teacher3 = new Teacher(6, 122,
                                "Arsenev",
                                "Arsenyy",
                                "Arsenyevich", LocalDate.now());
                teacher3.setTeacherId(6L);
                teacher3.setGroupId(122);

                TreeSet<Teacher> treeSet2 = new TreeSet<Teacher>(new UserComparator<>());

                treeSet2.add(teacher1);
                treeSet2.add(teacher2);
                treeSet2.add(teacher3);

                for (var b : treeSet2) {
                        System.out.println(b);
                }
                System.out.println("------------");

                UserGroup<Teacher> userGroup = new UserGroup<Teacher>(List.of(teacher1, teacher2, teacher3));

                Iterator<User> iter = userGroup;
                while (iter.hasNext()) {
                System.out.println(iter.next());
                }
                System.out.println("------------");
                System.out.println(userGroup);

                System.out.println("------------");
                UserGroup<Student> userGroup2 = new UserGroup<Student>(List.of(student1, student2, student3));
                System.out.println(userGroup2);
                
                
                

        }
}