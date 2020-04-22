package test;

import universities.University;

public class TestUniversity {
    public static void main(String[] args) {
        University u1 = new University("AAU","As Salt",true,"IT","Dr. Qusai Shambour",20);
        u1.printInfo();
        u1.setStaffNo(21);
        u1.printInfo();
    }
    
}
