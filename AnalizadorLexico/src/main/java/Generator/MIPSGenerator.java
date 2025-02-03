package Generator;

import java.util.List;

public class MIPSGenerator {
    public static void generateMIPS(List<String> irCode) {
        System.out.println(".data");
        System.out.println("result: .word 0");
        System.out.println(".text");
        System.out.println(".globl main");
        System.out.println("main:");

        for (String line : irCode) {
            String[] parts = line.split(" ");
            if (parts.length == 3 && parts[1].equals("=")) {
                System.out.println("    li $t0, " + parts[2]);
                System.out.println("    sw $t0, " + parts[0]);
            } else if (parts.length == 5 && parts[1].equals("=")) {
                String left = parts[2];
                String op = parts[3];
                String right = parts[4];

                System.out.println("    lw $t0, " + left);
                System.out.println("    lw $t1, " + right);

                if (op.equals("+")) {
                    System.out.println("    add $t2, $t0, $t1");
                } else if (op.equals("-")) {
                    System.out.println("    sub $t2, $t0, $t1");
                }

                System.out.println("    sw $t2, " + parts[0]);
            }
        }

        System.out.println("    li $v0, 10");
        System.out.println("    syscall");
    }
}
