package p000;

import android.content.ComponentName;
import android.content.Intent;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛳᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1251feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0746Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1251feyxiexzfUjhhgtg f4597Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4598Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4599Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4600Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final boolean f4601Ujhhgtgfeyxiexzf;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4597Ujhhgtgfeyxiexzf = new C1251feyxiexzfUjhhgtg(MagicFactory.get(4928868970984899978L, strArr));
        f4598Ujhhgtgfeyxiexzf = MagicFactory.get(4928872071951287690L, strArr);
        f4599Ujhhgtgfeyxiexzf = MagicFactory.get(4928872054771418506L, strArr);
        f4600Ujhhgtgfeyxiexzf = MagicFactory.get(4928872162145600906L, strArr);
        EnumC2264feyxiexzfUjhhgtg enumC2264feyxiexzfUjhhgtg = EnumC2264feyxiexzfUjhhgtg.f7383Ujhhgtgfeyxiexzf;
        C0580Ujhhgtgfeyxiexzf c0580Ujhhgtgfeyxiexzf = C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf;
        c0580Ujhhgtgfeyxiexzf.getClass();
        if (C0580Ujhhgtgfeyxiexzf.m1857Ujhhgtgfeyxiexzf() > enumC2264feyxiexzfUjhhgtg.f7390Ujhhgtgfeyxiexzf || C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf()) {
            EnumC2263Ujhhgtgfeyxiexzf enumC2263Ujhhgtgfeyxiexzf = EnumC2263Ujhhgtgfeyxiexzf.f7363Ujhhgtgfeyxiexzf;
            c0580Ujhhgtgfeyxiexzf.getClass();
            if (C0580Ujhhgtgfeyxiexzf.m1857Ujhhgtgfeyxiexzf() > enumC2263Ujhhgtgfeyxiexzf.f7369Ujhhgtgfeyxiexzf || !C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        f4601Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.InterfaceC0746Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2085Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, Intent intent) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg() && f4601Ujhhgtgfeyxiexzf) {
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className != null) {
                int iHashCode = className.hashCode();
                if (iHashCode != -1870020680) {
                    if (iHashCode != 510348960 || !className.equals(MagicFactory.get(4928872630297036170L, strArr))) {
                        return;
                    }
                } else if (!className.equals(MagicFactory.get(4928869043999344010L, strArr))) {
                    return;
                }
                C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                intent.setComponent(new ComponentName(C0580Ujhhgtgfeyxiexzf.m1856Ujhhgtgfeyxiexzf(), MagicFactory.get(4928872982484354442L, strArr)));
            }
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4600Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4599Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4598Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ */
    public final boolean mo2094feyxiexzfUjhhgtg() {
        return f4601Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
