package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229 {
    public static LocaleList m1282(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void m1283(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
