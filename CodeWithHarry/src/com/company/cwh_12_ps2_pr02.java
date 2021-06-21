package com.company;

public class cwh_12_ps2_pr02
{
    public static void main(String[] args)
    {
        char grade = 'B';
        grade = (char) (grade + 8); // Encrypted
        System.out.println(grade);

        // Decrypting the grade
        grade = (char) (grade - 8); // Decrypted
        System.out.println(grade);
    }
}
