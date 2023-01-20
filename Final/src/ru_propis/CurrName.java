package ru_propis;

public enum CurrName {

    RUB(new String[]{"рубль", "рубля", "рублей"}) {
    },
    USD(new String[]{"доллар", "доллара", "долларов"}) {
    };

    private final String[] endings;

    CurrName(String[] endings) {
        this.endings = endings;
    }

    public String getEndingMessage(String num) {
        int numLength = num.length();
        int tmpAmount = Integer.parseInt(num.substring(numLength - 1, numLength));
        if (num.length() > 1 && num.charAt(numLength - 2) == '1') //11-19 на конце
        {
            return endings[2];
        } else if (tmpAmount == 1) {
            return endings[0];
        } else if (tmpAmount <= 4 && tmpAmount >= 2) {
            return endings[1];
        } else {
            return endings[2];
        }
    }

}
