package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BackJoon10814 {
    public static class Customer {
        int id;
        int age;
        String name;

        public Customer(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Customer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            String[] arr =  br.readLine().split(" ");
            int age = Integer.parseInt(arr[0]);
            String name = arr[1];
            Customer customer = new Customer(i,age,name);
            list.add(customer);
        }
        list.sort(Comparator.comparing(Customer::getAge).thenComparing(Customer::getId));

        list.forEach(System.out::println);

    }
}
