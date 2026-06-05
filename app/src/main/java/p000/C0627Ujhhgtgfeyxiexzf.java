package p000;

import java.util.Arrays;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0627Ujhhgtgfeyxiexzf {
    public static final C0626Ujhhgtgfeyxiexzf Companion = new C0626Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f2656Ujhhgtgfeyxiexzf = {null, null, null, null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C3471Ujhhgtgfeyxiexzf(4))};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f2657Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f2658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f2659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f2660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String[] f2661Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0627Ujhhgtgfeyxiexzf(int i, String str, int i2, String str2, boolean z, String[] strArr) {
        if (31 != (i & 31)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 31, C0625Ujhhgtgfeyxiexzf.f2655Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f2657Ujhhgtgfeyxiexzf = str;
        this.f2658Ujhhgtgfeyxiexzf = i2;
        this.f2659Ujhhgtgfeyxiexzf = str2;
        this.f2660Ujhhgtgfeyxiexzf = z;
        this.f2661Ujhhgtgfeyxiexzf = strArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0627Ujhhgtgfeyxiexzf m1903Ujhhgtgfeyxiexzf(C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf, int i, String str, int i2) {
        String str2 = c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf;
        if ((i2 & 2) != 0) {
            i = c0627Ujhhgtgfeyxiexzf.f2658Ujhhgtgfeyxiexzf;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf;
        }
        boolean z = c0627Ujhhgtgfeyxiexzf.f2660Ujhhgtgfeyxiexzf;
        String[] strArr = c0627Ujhhgtgfeyxiexzf.f2661Ujhhgtgfeyxiexzf;
        c0627Ujhhgtgfeyxiexzf.getClass();
        return new C0627Ujhhgtgfeyxiexzf(str2, i3, str, z, strArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2657Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf) && this.f2658Ujhhgtgfeyxiexzf == c0627Ujhhgtgfeyxiexzf.f2658Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2659Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf) && this.f2660Ujhhgtgfeyxiexzf == c0627Ujhhgtgfeyxiexzf.f2660Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2661Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2661Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.f2660Ujhhgtgfeyxiexzf) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((Integer.hashCode(this.f2658Ujhhgtgfeyxiexzf) + (this.f2657Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31, 31, this.f2659Ujhhgtgfeyxiexzf)) * 31) + Arrays.hashCode(this.f2661Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928782320019703178L, strArr));
        sb.append(this.f2657Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928782388739179914L, strArr));
        sb.append(this.f2658Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928781388011799946L, strArr));
        sb.append(this.f2659Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928781349357094282L, strArr));
        sb.append(this.f2660Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928781443846374794L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, Arrays.toString(this.f2661Ujhhgtgfeyxiexzf), ')');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m1904Ujhhgtgfeyxiexzf() {
        EnumC0628Ujhhgtgfeyxiexzf enumC0628UjhhgtgfeyxiexzfM1905Ujhhgtgfeyxiexzf = m1905Ujhhgtgfeyxiexzf();
        if (enumC0628UjhhgtgfeyxiexzfM1905Ujhhgtgfeyxiexzf != EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf) {
            return enumC0628UjhhgtgfeyxiexzfM1905Ujhhgtgfeyxiexzf.f2672Ujhhgtgfeyxiexzf;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928782105271338378L, strArr));
        sb.append(AbstractC2391Ujhhgtgfeyxiexzf.m3651feyxiexzfUjhhgtg(this.f2661Ujhhgtgfeyxiexzf, null, MagicFactory.get(4928782152515978634L, strArr), MagicFactory.get(4928782281364997514L, strArr), new C3528Ujhhgtgfeyxiexzf(2), 25));
        sb.append(MagicFactory.get(4928782272775062922L, strArr));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final EnumC0628Ujhhgtgfeyxiexzf m1905Ujhhgtgfeyxiexzf() {
        Object next;
        String str;
        String lowerCase;
        EnumC0628Ujhhgtgfeyxiexzf.f2662Ujhhgtgfeyxiexzf.getClass();
        C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg = EnumC0628Ujhhgtgfeyxiexzf.f2670Ujhhgtgfeyxiexzf;
        c3369feyxiexzfUjhhgtg.getClass();
        C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg);
        do {
            if (!c2930Ujhhgtgfeyxiexzf.hasNext()) {
                next = null;
                break;
            }
            next = c2930Ujhhgtgfeyxiexzf.next();
            str = ((EnumC0628Ujhhgtgfeyxiexzf) next).f2671Ujhhgtgfeyxiexzf;
            lowerCase = this.f2657Ujhhgtgfeyxiexzf.toLowerCase(Locale.ROOT);
            MagicFactory.get(4928781400896701834L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
        } while (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, lowerCase));
        EnumC0628Ujhhgtgfeyxiexzf enumC0628Ujhhgtgfeyxiexzf = (EnumC0628Ujhhgtgfeyxiexzf) next;
        return enumC0628Ujhhgtgfeyxiexzf != null ? enumC0628Ujhhgtgfeyxiexzf : EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf;
    }

    public C0627Ujhhgtgfeyxiexzf(String str, int i, String str2, boolean z, String[] strArr) {
        this.f2657Ujhhgtgfeyxiexzf = str;
        this.f2658Ujhhgtgfeyxiexzf = i;
        this.f2659Ujhhgtgfeyxiexzf = str2;
        this.f2660Ujhhgtgfeyxiexzf = z;
        this.f2661Ujhhgtgfeyxiexzf = strArr;
    }
}
