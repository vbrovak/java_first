package ru.someerrors;

public class ErrorInput {
    public ErrorInput() {
        System.out.println(" === Блок Демо1 Система ждет, что ей будет передано число в строке переменной ===");

        getInt("1.Переменная пустая. Ничего не передано","");
        getInt("2.Ситуация : Вместо числа передана строка \"aaa\"","aaa");
        getInt("3. Ситуация : Передано корректное число","99999");

        System.out.println();

        getInt2(988, 0);
        getInt2(100, 25);
    }

    private void getInt(String aMess, String numb) {
        Integer val;
        System.out.println(" "+aMess);

        try {
            if (numb.equals("")) {
                throw new NullPointerException(" Сообщение ошибки: Переменная не задана");
            }
            val = new Integer(numb); //обработчик встроен

            System.out.println("Результат конвертации: " + val);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Выполнение процедуры прервано");
            return;
        }
    }

    private void getInt2(Integer i1, Integer i2) {
        Integer val = -1;
        System.out.println(" === Блок Демо2 Система делит A на B. Если исключение, то выводится -1 ");
        try {
            val = i1 / i2;
        } finally {
            System.out.println(" A "+i1 + ", B " + i2 + ". Результат деления A на B = "  + val);
            return;
        }
    }
}
