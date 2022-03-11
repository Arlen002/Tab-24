package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int [] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        LinkedList<Integer> linkedList = new LinkedList<>();
        sortArray(array,arrayList,linkedList);


    }
  public static void sortArray(int [] array,ArrayList<Integer> arrayList,LinkedList<Integer> linkedList){
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
         array[i] = random.nextInt(2);
         arrayList.add(random.nextInt(2));
         linkedList.add(random.nextInt(2));
      }
      System.out.println("Элементы массива: ");
      System.out.println(Arrays.toString(array));
      System.out.println(arrayList);
      System.out.println(linkedList);
      System.out.println("Sort elements: ");
      Arrays.sort(array);
      Collections.sort(arrayList);
      Collections.sort(linkedList);
      System.out.println(Arrays.toString(array));
      System.out.println(arrayList);
      System.out.println(linkedList);
  }
  public static Comparator<ArrayList> myComparator = new Comparator<ArrayList>() {
      @Override
      public int compare(ArrayList o1, ArrayList o2) {
          return o1.size() - o2.size();
      }
  };
    public static Comparator<LinkedList> linComparator = new Comparator<LinkedList>() {
        @Override
        public int compare(LinkedList o1, LinkedList o2) {
           return o1.size() - o2.size();
        }
    }  ;
}
