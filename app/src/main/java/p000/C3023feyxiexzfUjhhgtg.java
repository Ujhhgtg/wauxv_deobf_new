package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3023feyxiexzfUjhhgtg extends C3339feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f9386Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2975feyxiexzfUjhhgtg(4));

    @Override // p000.C3339feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final List mo4504Ujhhgtgfeyxiexzf(Class cls) {
        int i = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
        List listMo4504Ujhhgtgfeyxiexzf = super.mo4504Ujhhgtgfeyxiexzf(cls);
        if (AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf < 28) {
            return listMo4504Ujhhgtgfeyxiexzf;
        }
        List listM1837Ujhhgtgfeyxiexzf = AbstractC0550Ujhhgtgfeyxiexzf.m1837Ujhhgtgfeyxiexzf(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1837Ujhhgtgfeyxiexzf) {
            if (obj instanceof Constructor) {
                arrayList.add(obj);
            }
        }
        return AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(arrayList);
    }

    @Override // p000.C3339feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final List mo4505Ujhhgtgfeyxiexzf(Class cls) {
        int i = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
        List listMo4505Ujhhgtgfeyxiexzf = super.mo4505Ujhhgtgfeyxiexzf(cls);
        if (AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf < 28) {
            return listMo4505Ujhhgtgfeyxiexzf;
        }
        List listM1837Ujhhgtgfeyxiexzf = AbstractC0550Ujhhgtgfeyxiexzf.m1837Ujhhgtgfeyxiexzf(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1837Ujhhgtgfeyxiexzf) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        return AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(arrayList);
    }
}
