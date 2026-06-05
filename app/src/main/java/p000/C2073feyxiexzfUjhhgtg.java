package p000;

import android.view.View;
import android.view.WindowInsetsAnimation;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2073feyxiexzfUjhhgtg implements InterfaceC1319feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f6809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f6810Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f6811Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2073feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f6809Ujhhgtgfeyxiexzf = i;
        this.f6810Ujhhgtgfeyxiexzf = obj;
        this.f6811Ujhhgtgfeyxiexzf = obj2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3365Ujhhgtgfeyxiexzf(C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
        c0395Ujhhgtgfeyxiexzf.m1669Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf);
        for (C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf : Collections.unmodifiableCollection(c2413Ujhhgtgfeyxiexzf.f7822Ujhhgtgfeyxiexzf.values())) {
            c0395Ujhhgtgfeyxiexzf2.m1671Ujhhgtgfeyxiexzf(c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf);
            m3366Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3366Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3753feyxiexzfUjhhgtg) {
            m3365Ujhhgtgfeyxiexzf(((C3753feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf).f11829Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg);
            return;
        }
        if (!(abstractC3638Ujhhgtgfeyxiexzf instanceof C3755Ujhhgtgfeyxiexzf)) {
            c3268feyxiexzfUjhhgtg.m4774Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf);
            return;
        }
        C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg = ((C3755Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f11830Ujhhgtgfeyxiexzf;
        int length = c3754feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        for (int i = 0; i < length; i++) {
            m3366Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, (AbstractC3638Ujhhgtgfeyxiexzf) c3754feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String m3367Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (m3368Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf) == 30) {
            return "null";
        }
        return abstractC3638Ujhhgtgfeyxiexzf.mo4533Ujhhgtgfeyxiexzf() + ' ' + abstractC3638Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static int m3368Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3134Ujhhgtgfeyxiexzf) {
            return 0;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3055Ujhhgtgfeyxiexzf) {
            return 2;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3137Ujhhgtgfeyxiexzf) {
            return 3;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3144Ujhhgtgfeyxiexzf) {
            return 4;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3151Ujhhgtgfeyxiexzf) {
            return 6;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3141Ujhhgtgfeyxiexzf) {
            return 16;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3138Ujhhgtgfeyxiexzf) {
            return 17;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf) {
            return 21;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) {
            return 22;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) {
            return 23;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3057Ujhhgtgfeyxiexzf) {
            return 24;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3140Ujhhgtgfeyxiexzf) {
            return 25;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3154Ujhhgtgfeyxiexzf) {
            return 26;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3139Ujhhgtgfeyxiexzf) {
            return 27;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3755Ujhhgtgfeyxiexzf) {
            return 28;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3753feyxiexzfUjhhgtg) {
            return 29;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3147Ujhhgtgfeyxiexzf) {
            return 30;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3133Ujhhgtgfeyxiexzf) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public String toString() {
        switch (this.f6809Ujhhgtgfeyxiexzf) {
            case 5:
                return "Bounds{lower=" + ((C0688Ujhhgtgfeyxiexzf) this.f6810Ujhhgtgfeyxiexzf) + " upper=" + ((C0688Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3369Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf) {
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.get(abstractC0821feyxiexzfUjhhgtg);
        if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf == null) {
            c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
            c1044feyxiexzfUjhhgtg.put(abstractC0821feyxiexzfUjhhgtg, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf);
        }
        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7528Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf |= 8;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public View m3370Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        View viewM2202Ujhhgtgfeyxiexzf;
        C1912Ujhhgtgfeyxiexzf c1912Ujhhgtgfeyxiexzf = (C1912Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        C0827feyxiexzfUjhhgtg c0827feyxiexzfUjhhgtg = (C0827feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        int iM2227Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2227Ujhhgtgfeyxiexzf();
        int iM2226Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2226Ujhhgtgfeyxiexzf();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0827feyxiexzfUjhhgtg.f3283Ujhhgtgfeyxiexzf) {
                case 0:
                    viewM2202Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.f3284Ujhhgtgfeyxiexzf.m2202Ujhhgtgfeyxiexzf(i);
                    break;
                default:
                    viewM2202Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.f3284Ujhhgtgfeyxiexzf.m2202Ujhhgtgfeyxiexzf(i);
                    break;
            }
            int iM2225Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2225Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            int iM2224Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2224Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            c1912Ujhhgtgfeyxiexzf.f6377Ujhhgtgfeyxiexzf = iM2227Ujhhgtgfeyxiexzf;
            c1912Ujhhgtgfeyxiexzf.f6378Ujhhgtgfeyxiexzf = iM2226Ujhhgtgfeyxiexzf;
            c1912Ujhhgtgfeyxiexzf.f6379Ujhhgtgfeyxiexzf = iM2225Ujhhgtgfeyxiexzf;
            c1912Ujhhgtgfeyxiexzf.f6380Ujhhgtgfeyxiexzf = iM2224Ujhhgtgfeyxiexzf;
            if (i3 != 0) {
                c1912Ujhhgtgfeyxiexzf.f6376Ujhhgtgfeyxiexzf = i3;
                if (c1912Ujhhgtgfeyxiexzf.m3270Ujhhgtgfeyxiexzf()) {
                    return viewM2202Ujhhgtgfeyxiexzf;
                }
            }
            if (i4 != 0) {
                c1912Ujhhgtgfeyxiexzf.f6376Ujhhgtgfeyxiexzf = i4;
                if (c1912Ujhhgtgfeyxiexzf.m3270Ujhhgtgfeyxiexzf()) {
                    view = viewM2202Ujhhgtgfeyxiexzf;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean m3371Ujhhgtgfeyxiexzf(View view) {
        C1912Ujhhgtgfeyxiexzf c1912Ujhhgtgfeyxiexzf = (C1912Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        C0827feyxiexzfUjhhgtg c0827feyxiexzfUjhhgtg = (C0827feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        int iM2227Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2227Ujhhgtgfeyxiexzf();
        int iM2226Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2226Ujhhgtgfeyxiexzf();
        int iM2225Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2225Ujhhgtgfeyxiexzf(view);
        int iM2224Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg.m2224Ujhhgtgfeyxiexzf(view);
        c1912Ujhhgtgfeyxiexzf.f6377Ujhhgtgfeyxiexzf = iM2227Ujhhgtgfeyxiexzf;
        c1912Ujhhgtgfeyxiexzf.f6378Ujhhgtgfeyxiexzf = iM2226Ujhhgtgfeyxiexzf;
        c1912Ujhhgtgfeyxiexzf.f6379Ujhhgtgfeyxiexzf = iM2225Ujhhgtgfeyxiexzf;
        c1912Ujhhgtgfeyxiexzf.f6380Ujhhgtgfeyxiexzf = iM2224Ujhhgtgfeyxiexzf;
        c1912Ujhhgtgfeyxiexzf.f6376Ujhhgtgfeyxiexzf = 24579;
        return c1912Ujhhgtgfeyxiexzf.m3270Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C0431Ujhhgtgfeyxiexzf m3372Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf;
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf;
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        int iM2534Ujhhgtgfeyxiexzf = c1044feyxiexzfUjhhgtg.m2534Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        if (iM2534Ujhhgtgfeyxiexzf >= 0 && (c2295Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.m2540Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf)) != null) {
            int i2 = c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf = i3;
                if (i == 4) {
                    c0431Ujhhgtgfeyxiexzf = c2295Ujhhgtgfeyxiexzf.f7527Ujhhgtgfeyxiexzf;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0431Ujhhgtgfeyxiexzf = c2295Ujhhgtgfeyxiexzf.f7528Ujhhgtgfeyxiexzf;
                }
                if ((i3 & 12) == 0) {
                    c1044feyxiexzfUjhhgtg.mo2538Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf);
                    c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf = 0;
                    c2295Ujhhgtgfeyxiexzf.f7527Ujhhgtgfeyxiexzf = null;
                    c2295Ujhhgtgfeyxiexzf.f7528Ujhhgtgfeyxiexzf = null;
                    C2295Ujhhgtgfeyxiexzf.f7525Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(c2295Ujhhgtgfeyxiexzf);
                }
                return c0431Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m3373Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) ((C1044feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf).get(abstractC0821feyxiexzfUjhhgtg);
        if (c2295Ujhhgtgfeyxiexzf == null) {
            return;
        }
        c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf &= -2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3374Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        for (int iM1453Ujhhgtgfeyxiexzf = c0267Ujhhgtgfeyxiexzf.m1453Ujhhgtgfeyxiexzf() - 1; iM1453Ujhhgtgfeyxiexzf >= 0; iM1453Ujhhgtgfeyxiexzf--) {
            if (abstractC0821feyxiexzfUjhhgtg == c0267Ujhhgtgfeyxiexzf.m1454Ujhhgtgfeyxiexzf(iM1453Ujhhgtgfeyxiexzf)) {
                Object[] objArr = c0267Ujhhgtgfeyxiexzf.f1658Ujhhgtgfeyxiexzf;
                Object obj = objArr[iM1453Ujhhgtgfeyxiexzf];
                Object obj2 = AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf;
                if (obj == obj2) {
                    break;
                }
                objArr[iM1453Ujhhgtgfeyxiexzf] = obj2;
                c0267Ujhhgtgfeyxiexzf.f1656Ujhhgtgfeyxiexzf = true;
                break;
            }
        }
        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) ((C1044feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf).remove(abstractC0821feyxiexzfUjhhgtg);
        if (c2295Ujhhgtgfeyxiexzf != null) {
            c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf = 0;
            c2295Ujhhgtgfeyxiexzf.f7527Ujhhgtgfeyxiexzf = null;
            c2295Ujhhgtgfeyxiexzf.f7528Ujhhgtgfeyxiexzf = null;
            C2295Ujhhgtgfeyxiexzf.f7525Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(c2295Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m3375Ujhhgtgfeyxiexzf(C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf, boolean z) {
        C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = (C2608Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        boolean z2 = z && c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = (C3268feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf;
        int iM1666Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf2.m1666Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf);
        if (z2) {
            c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("  type_idx: " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1666Ujhhgtgfeyxiexzf) + " // " + c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(c0395Ujhhgtgfeyxiexzf2.m1666Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf));
        Collection<C0412Ujhhgtgfeyxiexzf> collectionUnmodifiableCollection = Collections.unmodifiableCollection(c2413Ujhhgtgfeyxiexzf.f7822Ujhhgtgfeyxiexzf.values());
        int size = collectionUnmodifiableCollection.size();
        if (z2) {
            c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("  size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size)));
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(size);
        int i = 0;
        for (C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf : collectionUnmodifiableCollection) {
            C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf;
            int iM1665Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf.m1665Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf);
            AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf;
            if (z2) {
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "  elements[" + i + "]:");
                i++;
                c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("    name_idx: " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1665Ujhhgtgfeyxiexzf) + " // " + c3056Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
            }
            c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(iM1665Ujhhgtgfeyxiexzf);
            if (z2) {
                c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("    value: " + m3367Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf));
            }
            m3377Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf);
        }
        if (z2) {
            c2608Ujhhgtgfeyxiexzf.m3889Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3376Ujhhgtgfeyxiexzf(C3755Ujhhgtgfeyxiexzf c3755Ujhhgtgfeyxiexzf, boolean z) {
        C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = (C2608Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        boolean z2 = z && c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg = c3755Ujhhgtgfeyxiexzf.f11830Ujhhgtgfeyxiexzf;
        int length = c3754feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        if (z2) {
            c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("  size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(length)));
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(length);
        for (int i = 0; i < length; i++) {
            AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = (AbstractC3638Ujhhgtgfeyxiexzf) c3754feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
            if (z2) {
                c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf("  [" + Integer.toHexString(i) + "] " + m3367Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf));
            }
            m3377Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf);
        }
        if (z2) {
            c2608Ujhhgtgfeyxiexzf.m3889Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void m3377Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = (C3268feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = (C2608Ujhhgtgfeyxiexzf) this.f6811Ujhhgtgfeyxiexzf;
        int iM3368Ujhhgtgfeyxiexzf = m3368Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf);
        if (iM3368Ujhhgtgfeyxiexzf != 0 && iM3368Ujhhgtgfeyxiexzf != 6 && iM3368Ujhhgtgfeyxiexzf != 2) {
            if (iM3368Ujhhgtgfeyxiexzf == 3) {
                AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, ((AbstractC3150Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).mo4665Ujhhgtgfeyxiexzf());
                return;
            }
            if (iM3368Ujhhgtgfeyxiexzf != 4) {
                if (iM3368Ujhhgtgfeyxiexzf == 16) {
                    AbstractC1243feyxiexzfUjhhgtg.m2743feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, ((long) ((C3141Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9756Ujhhgtgfeyxiexzf) << 32);
                    return;
                }
                if (iM3368Ujhhgtgfeyxiexzf == 17) {
                    AbstractC1243feyxiexzfUjhhgtg.m2743feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, ((C3138Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9757Ujhhgtgfeyxiexzf);
                    return;
                }
                switch (iM3368Ujhhgtgfeyxiexzf) {
                    case Opcodes.ILOAD /* 21 */:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10266Ujhhgtgfeyxiexzf.m1667Ujhhgtgfeyxiexzf(((C3156Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9768Ujhhgtgfeyxiexzf));
                        return;
                    case Opcodes.LLOAD /* 22 */:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, ((C0387Ujhhgtgfeyxiexzf) ((TreeMap) c3268feyxiexzfUjhhgtg.f10272Ujhhgtgfeyxiexzf.f2143Ujhhgtgfeyxiexzf).get((C3153Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf)).m1909Ujhhgtgfeyxiexzf());
                        return;
                    case Opcodes.FLOAD /* 23 */:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf.m1665Ujhhgtgfeyxiexzf((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf));
                        return;
                    case Opcodes.DLOAD /* 24 */:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf.m1666Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf));
                        return;
                    case Opcodes.ALOAD /* 25 */:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf.m4943Ujhhgtgfeyxiexzf((C3140Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf));
                        return;
                    case 26:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf.m1645Ujhhgtgfeyxiexzf((C3154Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf));
                        return;
                    case 27:
                        AbstractC1243feyxiexzfUjhhgtg.m2744feyxiexzfUjhhgtg(c2608Ujhhgtgfeyxiexzf, iM3368Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf.m4943Ujhhgtgfeyxiexzf(((C3139Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4656Ujhhgtgfeyxiexzf()));
                        return;
                    case 28:
                        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(iM3368Ujhhgtgfeyxiexzf);
                        m3376Ujhhgtgfeyxiexzf((C3755Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf, false);
                        return;
                    case 29:
                        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(iM3368Ujhhgtgfeyxiexzf);
                        m3375Ujhhgtgfeyxiexzf(((C3753feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf).f11829Ujhhgtgfeyxiexzf, false);
                        return;
                    case 30:
                        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(iM3368Ujhhgtgfeyxiexzf);
                        return;
                    case 31:
                        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf((((C3133Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9756Ujhhgtgfeyxiexzf << 5) | iM3368Ujhhgtgfeyxiexzf);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo4665Ujhhgtgfeyxiexzf = ((AbstractC3150Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).mo4665Ujhhgtgfeyxiexzf();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo4665Ujhhgtgfeyxiexzf >> 63) ^ jMo4665Ujhhgtgfeyxiexzf)) >> 3;
        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(((iNumberOfLeadingZeros - 1) << 5) | iM3368Ujhhgtgfeyxiexzf);
        while (iNumberOfLeadingZeros > 0) {
            c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf((byte) jMo4665Ujhhgtgfeyxiexzf);
            jMo4665Ujhhgtgfeyxiexzf >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    @Override // p000.InterfaceC1319feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public C2256feyxiexzfUjhhgtg mo2853Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        InterfaceC2304feyxiexzfUjhhgtg interfaceC2304feyxiexzfUjhhgtg = (InterfaceC2304feyxiexzfUjhhgtg) this.f6810Ujhhgtgfeyxiexzf;
        C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg = (C3490feyxiexzfUjhhgtg) this.f6811Ujhhgtgfeyxiexzf;
        C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg2 = new C3490feyxiexzfUjhhgtg();
        c3490feyxiexzfUjhhgtg2.f10834Ujhhgtgfeyxiexzf = c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf;
        c3490feyxiexzfUjhhgtg2.f10835Ujhhgtgfeyxiexzf = c3490feyxiexzfUjhhgtg.f10835Ujhhgtgfeyxiexzf;
        c3490feyxiexzfUjhhgtg2.f10836Ujhhgtgfeyxiexzf = c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf;
        c3490feyxiexzfUjhhgtg2.f10837Ujhhgtgfeyxiexzf = c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf;
        return interfaceC2304feyxiexzfUjhhgtg.mo3509Ujhhgtgfeyxiexzf(view, c2256feyxiexzfUjhhgtg, c3490feyxiexzfUjhhgtg2);
    }

    public C2073feyxiexzfUjhhgtg() {
        this.f6809Ujhhgtgfeyxiexzf = 3;
        this.f6810Ujhhgtgfeyxiexzf = new C1044feyxiexzfUjhhgtg(0);
        this.f6811Ujhhgtgfeyxiexzf = new C0267Ujhhgtgfeyxiexzf();
    }

    public C2073feyxiexzfUjhhgtg(C1477feyxiexzfUjhhgtg c1477feyxiexzfUjhhgtg, C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf) {
        this.f6809Ujhhgtgfeyxiexzf = 6;
        this.f6810Ujhhgtgfeyxiexzf = c1477feyxiexzfUjhhgtg;
        new LinkedHashSet();
        this.f6811Ujhhgtgfeyxiexzf = new LinkedHashMap();
    }

    public C2073feyxiexzfUjhhgtg(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        this.f6809Ujhhgtgfeyxiexzf = 1;
        if (c3268feyxiexzfUjhhgtg != null) {
            this.f6810Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg;
            this.f6811Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf;
            return;
        }
        throw new NullPointerException("file == null");
    }

    public C2073feyxiexzfUjhhgtg(C0827feyxiexzfUjhhgtg c0827feyxiexzfUjhhgtg) {
        this.f6809Ujhhgtgfeyxiexzf = 2;
        this.f6810Ujhhgtgfeyxiexzf = c0827feyxiexzfUjhhgtg;
        C1912Ujhhgtgfeyxiexzf c1912Ujhhgtgfeyxiexzf = new C1912Ujhhgtgfeyxiexzf();
        c1912Ujhhgtgfeyxiexzf.f6376Ujhhgtgfeyxiexzf = 0;
        this.f6811Ujhhgtgfeyxiexzf = c1912Ujhhgtgfeyxiexzf;
    }

    public C2073feyxiexzfUjhhgtg(WindowInsetsAnimation.Bounds bounds) {
        this.f6809Ujhhgtgfeyxiexzf = 5;
        this.f6810Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1957Ujhhgtgfeyxiexzf(bounds.getLowerBound());
        this.f6811Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1957Ujhhgtgfeyxiexzf(bounds.getUpperBound());
    }
}
