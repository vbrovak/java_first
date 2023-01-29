package ru_propis;
import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;

public class LibConvertClass {
    public String getPropLibStr(Integer strForConvert) {
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(
                Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);
          return nf.format(strForConvert);
    }
}
