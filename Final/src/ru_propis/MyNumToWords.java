package ru_propis;

public class MyNumToWords {
    private static final String[][] dig1_9 = {
            {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}};
    private static final String[] dig10_19 = {"десять", "одиннадцать", "двенадцать",
            "тринадцать", "четырнадцать",  "пятнадцать", "шестнадцать", "семнадцать",
            "восемнадцать", "девятнадцать"};
    private static final String[] dig20_90 = {"двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] dig100 = {"сто", "двести", "триста", "четыреста",
            "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String[][] digNames = {
            {"миллион", "миллиона", "миллионов"},
            {"тысяча", "тысячи", "тысяч"}};


    private static String getFigNames(int lev, int index) {
        if (lev > 1) {
            return "";
        } else {
            return digNames[lev][index];
        }
    }

    private static String convertNum2Words(int numForConvert, int level) {
        StringBuilder DigitsPartWords = new StringBuilder(100);
        int hun = numForConvert / 100;
        int dec = (numForConvert - (hun * 100)) / 10;
        int units = numForConvert % 10;
        int lastDigitFig = numForConvert % 100;
        int flagSex = level % 2 ;

        //формирование числа
        if (hun > 0) {
            DigitsPartWords.append(dig100[hun - 1]).append(" ");
            if (dec == 0 && units == 0) //100, 200 и т д
            {
                DigitsPartWords.append(getFigNames(level, 2));
            }
        } //сотни

        if (dec == 1) { //11-19
            DigitsPartWords.append(dig10_19[units] + " " + getFigNames(level, 2));
        } else {
            if (dec > 1) {
                if (units == 0) // 20,30 и тд по 90 включительно
                {
                    DigitsPartWords.append(dig20_90[dec - 2] + " " + getFigNames(level, 2));
                } else {
                    DigitsPartWords.append(dig20_90[dec - 2] + " ");
                    DigitsPartWords.append(dig1_9[flagSex][units - 1] + " ");
                }
            } else { //второго разряда нет, например 401
                if (units > 0) {
                    DigitsPartWords.append(dig1_9[flagSex][units - 1] + " ");
                }
            }

            if (lastDigitFig > 0) switch (units) {
                case 0:
                    break;
                case 1:
                    DigitsPartWords.append(getFigNames(level, 0));
                    break;
                case 2:
                case 3:
                case 4:
                    DigitsPartWords.append(getFigNames(level, 1));
                    break;
                default:
                    DigitsPartWords.append(getFigNames(level, 2));
            }
        }
        return (DigitsPartWords.toString());
    }

    private static String makePropsStr(String num) {
        StringBuilder wordsToNumber = new StringBuilder(80);
        Integer myNum = Integer.parseInt(num);

        Integer million = myNum / 1000000;
        if (million > 0) {
            wordsToNumber.append(convertNum2Words(million, 0) + " ");
        }

        Integer thousand = (myNum - (million * 1000000)) / 1000;
        if (thousand > 0) {
            wordsToNumber.append(convertNum2Words(thousand, 1) + " ");
        }

        Integer hundreds = myNum % 1000;
        wordsToNumber.append(convertNum2Words(hundreds, 2));
        return wordsToNumber.toString().trim();

    }

    public String getPropStr(String strForConvert) {
        return MyNumToWords.makePropsStr(strForConvert);
    }

}
