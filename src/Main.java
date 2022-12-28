public class Main {
    public static void main(String[] args) {

        /* int i = 0      i < 10    i++
        for (инициализация; условия; изменение)
             int i = 10   i >1      i--
         {

           // что то делаем
         }
         */
        int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int counter = 10;
        for (; counter > 0; counter --) {
            System.out.print(counter + " ");
       }

        System.out.println();
        // вычисляем сумму натуральных чисел от 1 до 10
        // используем цикл for

        int start = 1, end = 11;
        int sum = 0;
        for (int i = start; i < end; i++) {
                sum += i;
        }
        System.out.println(sum);

        // вложенный цикл
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print( i * j + "\t");
            }
            System.out.println();
        }
        // оператор ветвления continue
        int n2 = 10;
        for (int i = 0; i < n2; i++) {
            if (i == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
   }
}


