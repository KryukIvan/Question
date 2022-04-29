import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадка- Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String ansver = "Заархивированный вирус";
        String hint = "Подсказка";
        int i = 3;
            while (i > 0) {
                System.out.print("Ведите ответ: ");
                String s = in.nextLine();
                if (ansver.equalsIgnoreCase(s)) {
                    System.out.print("Правильно!");
                    i = 0;
                    break;
                }
                else if (i == 3 & hint.equalsIgnoreCase(s)) {
                    System.out.println("Это не съедобное");
                    System.out.print("Ведите ответ: ");
                    String ss = in.nextLine();
                    if (ansver.equalsIgnoreCase(ss)){
                        System.out.print("Правильно!");
                        i = 0;
                        break;
                    }
                    else {System.out.print("Обидно, приходи в другой раз");}
                    i = 0;
                    break;
                }
                else if (i != 3 & hint.equalsIgnoreCase(s)) {
                    System.out.println("Подсказка уже недоступна");
                    i++;
                }
                else if (i > 1) {System.out.println("Подумай еще");}
                i--;
                if (i == 0) {System.out.println("Обидно, приходи в другой раз");}
            }

    }
}

