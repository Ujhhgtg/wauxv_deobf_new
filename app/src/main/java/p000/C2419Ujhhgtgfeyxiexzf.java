package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2419Ujhhgtgfeyxiexzf implements Comparator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7832Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2419Ujhhgtgfeyxiexzf(int i) {
        this.f7832Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7832Ujhhgtgfeyxiexzf) {
            case 0:
                int iM1909Ujhhgtgfeyxiexzf = ((C2420Ujhhgtgfeyxiexzf) obj).f7835Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
                int iM1909Ujhhgtgfeyxiexzf2 = ((C2420Ujhhgtgfeyxiexzf) obj2).f7835Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
                if (iM1909Ujhhgtgfeyxiexzf < iM1909Ujhhgtgfeyxiexzf2) {
                    return -1;
                }
                return iM1909Ujhhgtgfeyxiexzf > iM1909Ujhhgtgfeyxiexzf2 ? 1 : 0;
            case 1:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj).f2658Ujhhgtgfeyxiexzf), Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj2).f2658Ujhhgtgfeyxiexzf));
            case 2:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj).f2658Ujhhgtgfeyxiexzf), Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj2).f2658Ujhhgtgfeyxiexzf));
            case 3:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj).f2658Ujhhgtgfeyxiexzf), Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj2).f2658Ujhhgtgfeyxiexzf));
            case 4:
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 5:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(((AbstractC0571Ujhhgtgfeyxiexzf) obj).getClass().getSimpleName(), ((AbstractC0571Ujhhgtgfeyxiexzf) obj2).getClass().getSimpleName());
            case 6:
                return ((C1442feyxiexzfUjhhgtg) obj).f5046Ujhhgtgfeyxiexzf - ((C1442feyxiexzfUjhhgtg) obj2).f5046Ujhhgtgfeyxiexzf;
            case 7:
                return ((C0239Ujhhgtgfeyxiexzf) obj).f1568Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf - ((C0239Ujhhgtgfeyxiexzf) obj2).f1568Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf;
            case 8:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(((C2803Ujhhgtgfeyxiexzf) obj).f8910Ujhhgtgfeyxiexzf, ((C2803Ujhhgtgfeyxiexzf) obj2).f8910Ujhhgtgfeyxiexzf);
            case 9:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(((C0385Ujhhgtgfeyxiexzf) obj).f2119Ujhhgtgfeyxiexzf, ((C0385Ujhhgtgfeyxiexzf) obj2).f2119Ujhhgtgfeyxiexzf);
            case 10:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C3485Ujhhgtgfeyxiexzf) obj).f10821Ujhhgtgfeyxiexzf), Integer.valueOf(((C3485Ujhhgtgfeyxiexzf) obj2).f10821Ujhhgtgfeyxiexzf));
            case 11:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C3485Ujhhgtgfeyxiexzf) obj).f10821Ujhhgtgfeyxiexzf), Integer.valueOf(((C3485Ujhhgtgfeyxiexzf) obj2).f10821Ujhhgtgfeyxiexzf));
            case Opcodes.FCONST_1 /* 12 */:
                C3566Ujhhgtgfeyxiexzf c3566Ujhhgtgfeyxiexzf = (C3566Ujhhgtgfeyxiexzf) obj;
                C3566Ujhhgtgfeyxiexzf c3566Ujhhgtgfeyxiexzf2 = (C3566Ujhhgtgfeyxiexzf) obj2;
                RecyclerView recyclerView = c3566Ujhhgtgfeyxiexzf.f11088Ujhhgtgfeyxiexzf;
                if ((recyclerView == null) == (c3566Ujhhgtgfeyxiexzf2.f11088Ujhhgtgfeyxiexzf == null)) {
                    boolean z3 = c3566Ujhhgtgfeyxiexzf.f11085Ujhhgtgfeyxiexzf;
                    if (z3 == c3566Ujhhgtgfeyxiexzf2.f11085Ujhhgtgfeyxiexzf) {
                        int i = c3566Ujhhgtgfeyxiexzf2.f11086Ujhhgtgfeyxiexzf - c3566Ujhhgtgfeyxiexzf.f11086Ujhhgtgfeyxiexzf;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c3566Ujhhgtgfeyxiexzf.f11087Ujhhgtgfeyxiexzf - c3566Ujhhgtgfeyxiexzf2.f11087Ujhhgtgfeyxiexzf;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 13:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj).f2658Ujhhgtgfeyxiexzf), Integer.valueOf(((C0627Ujhhgtgfeyxiexzf) obj2).f2658Ujhhgtgfeyxiexzf));
            case Opcodes.DCONST_0 /* 14 */:
                return ((AbstractC1335feyxiexzfUjhhgtg) obj).mo1275Ujhhgtgfeyxiexzf().compareTo(((AbstractC1335feyxiexzfUjhhgtg) obj2).mo1275Ujhhgtgfeyxiexzf());
            case 15:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C1364feyxiexzfUjhhgtg) obj).f4846Ujhhgtgfeyxiexzf), Integer.valueOf(((C1364feyxiexzfUjhhgtg) obj2).f4846Ujhhgtgfeyxiexzf));
            case 16:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(Integer.valueOf(((C1364feyxiexzfUjhhgtg) obj).f4846Ujhhgtgfeyxiexzf), Integer.valueOf(((C1364feyxiexzfUjhhgtg) obj2).f4846Ujhhgtgfeyxiexzf));
            case Opcodes.SIPUSH /* 17 */:
                String name = ((File) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                MagicFactory.get(4928402649205704074L, strArr);
                String lowerCase2 = ((File) obj2).getName().toLowerCase(locale);
                MagicFactory.get(4928402713630213514L, strArr);
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(lowerCase, lowerCase2);
            case Opcodes.LDC /* 18 */:
                return ((C1224feyxiexzfUjhhgtg) obj).f4535Ujhhgtgfeyxiexzf - ((C1224feyxiexzfUjhhgtg) obj2).f4535Ujhhgtgfeyxiexzf;
            case 19:
                return AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf(((C1414feyxiexzfUjhhgtg) obj).f4968Ujhhgtgfeyxiexzf, ((C1414feyxiexzfUjhhgtg) obj2).f4968Ujhhgtgfeyxiexzf);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        switch (this.f7832Ujhhgtgfeyxiexzf) {
            case 6:
                return obj == this;
            case 7:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }
}
