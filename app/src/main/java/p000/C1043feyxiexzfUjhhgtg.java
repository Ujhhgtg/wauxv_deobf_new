package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ能不能要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1043feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0600Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1043feyxiexzfUjhhgtg f4063Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4064Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4065Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4066Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928831574704653706L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4063Ujhhgtgfeyxiexzf = new C1043feyxiexzfUjhhgtg(MagicFactory.get(4928832176000075146L, strArr));
        f4064Ujhhgtgfeyxiexzf = MagicFactory.get(4928831725028509066L, strArr);
        f4065Ujhhgtgfeyxiexzf = MagicFactory.get(4928831712143607178L, strArr);
        f4066Ujhhgtgfeyxiexzf = MagicFactory.get(4928831819517789578L, strArr);
    }

    @Override // p000.InterfaceC0600Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final List mo1871Ujhhgtgfeyxiexzf(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo1424feyxiexzfUjhhgtg()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            String stringExtra = intent.getStringExtra(MagicFactory.get(4928832364978636170L, strArr));
            if (stringExtra == null) {
                stringExtra = MagicFactory.get(4928832446583014794L, strArr);
            }
            if (!stringExtra.startsWith(MagicFactory.get(4928832433698112906L, strArr))) {
                String str = MagicFactory.get(4928832416518243722L, strArr);
                String str2 = MagicFactory.get(4928831467330471306L, strArr);
                String strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), MagicFactory.get(4928831617654326666L, strArr), stringExtra);
                Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(C0854feyxiexzfUjhhgtg.f3346Ujhhgtgfeyxiexzf.m2261feyxiexzfUjhhgtg(), new Object[]{activity});
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1449feyxiexzfUjhhgtg.f5060Ujhhgtgfeyxiexzf).invoke(objM4168Ujhhgtgfeyxiexzf, str2);
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0852feyxiexzfUjhhgtg.f3345Ujhhgtgfeyxiexzf).invoke(objM4168Ujhhgtgfeyxiexzf, strM2706Ujhhgtgfeyxiexzf);
                return Collections.singletonList(new C3682feyxiexzfUjhhgtg(str, objM4168Ujhhgtgfeyxiexzf, 1, new C0530Ujhhgtgfeyxiexzf(stringExtra, 4, activity)));
            }
        }
        return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4066Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4065Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4064Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
