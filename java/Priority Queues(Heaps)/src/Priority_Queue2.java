import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue2 {
    static class Student implements Comparable<Student>{//overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student student){
            return this.rank - student.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(new Student("Aadityan ", 1));
        priorityQueue.add(new Student("Mayank ", 10));
        priorityQueue.add(new Student("Akshay ", 13));
        priorityQueue.add(new Student("Abhishek ", 21));
        priorityQueue.add(new Student("Raman ", 17));
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek().name + priorityQueue.peek().rank);
            priorityQueue.remove();
        }
    }
}
