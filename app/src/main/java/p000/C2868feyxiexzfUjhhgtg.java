package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲ要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2868feyxiexzfUjhhgtg extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f9129Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2363Ujhhgtgfeyxiexzf f9130Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C2790feyxiexzfUjhhgtg f9131Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f9132Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f9133Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3090Ujhhgtgfeyxiexzf f9134Ujhhgtgfeyxiexzf;

    public C2868feyxiexzfUjhhgtg(C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf, C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf, boolean z, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg) {
        super(4, -1);
        if (c2363Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC1790feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f9129Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
        this.f9130Ujhhgtgfeyxiexzf = c2363Ujhhgtgfeyxiexzf;
        this.f9132Ujhhgtgfeyxiexzf = z;
        this.f9133Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
        this.f9131Ujhhgtgfeyxiexzf = null;
        this.f9134Ujhhgtgfeyxiexzf = null;
    }

    public final String toString() {
        return "CodeItem{" + this.f9129Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + "}";
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10273Ujhhgtgfeyxiexzf;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f9130Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.getClass();
        C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg = (C1476feyxiexzfUjhhgtg) c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf;
        if (c1476feyxiexzfUjhhgtg.f5123Ujhhgtgfeyxiexzf || c1476feyxiexzfUjhhgtg.f5124Ujhhgtgfeyxiexzf) {
            C3090Ujhhgtgfeyxiexzf c3090Ujhhgtgfeyxiexzf = new C3090Ujhhgtgfeyxiexzf(c2363Ujhhgtgfeyxiexzf, this.f9132Ujhhgtgfeyxiexzf, this.f9129Ujhhgtgfeyxiexzf);
            this.f9134Ujhhgtgfeyxiexzf = c3090Ujhhgtgfeyxiexzf;
            c0295Ujhhgtgfeyxiexzf.m1509Ujhhgtgfeyxiexzf(c3090Ujhhgtgfeyxiexzf);
        }
        C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg = (C2492feyxiexzfUjhhgtg) ((C3639Ujhhgtgfeyxiexzf) ((C2366Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7702Ujhhgtgfeyxiexzf).f7714Ujhhgtgfeyxiexzf).f11369Ujhhgtgfeyxiexzf;
        int length = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        for (int i = 0; i < length; i++) {
            if (((C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).f8153Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf().mo1937Ujhhgtgfeyxiexzf().size() != 0) {
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7702Ujhhgtgfeyxiexzf;
                c2366Ujhhgtgfeyxiexzf.getClass();
                HashSet hashSet = new HashSet(20);
                C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg2 = (C2492feyxiexzfUjhhgtg) ((C3639Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).f11369Ujhhgtgfeyxiexzf;
                int length2 = c2492feyxiexzfUjhhgtg2.f10801Ujhhgtgfeyxiexzf.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf = ((C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg2.m4969Ujhhgtgfeyxiexzf(i2)).f8153Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf().mo1937Ujhhgtgfeyxiexzf();
                    int size = interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hashSet.add(interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf.getType(i3));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c0395Ujhhgtgfeyxiexzf.m1673Ujhhgtgfeyxiexzf((C1784feyxiexzfUjhhgtg) it.next());
                }
                this.f9131Ujhhgtgfeyxiexzf = new C2790feyxiexzfUjhhgtg(c2363Ujhhgtgfeyxiexzf);
                break;
            }
        }
        C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg2 = (C1476feyxiexzfUjhhgtg) c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf;
        c1476feyxiexzfUjhhgtg2.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf : c1476feyxiexzfUjhhgtg2.f5122Ujhhgtgfeyxiexzf) {
            if (abstractC3068Ujhhgtgfeyxiexzf instanceof C3143Ujhhgtgfeyxiexzf) {
                hashSet2.add(((C3143Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf).f9737Ujhhgtgfeyxiexzf);
            } else if (abstractC3068Ujhhgtgfeyxiexzf instanceof C0514Ujhhgtgfeyxiexzf) {
                C0514Ujhhgtgfeyxiexzf c0514Ujhhgtgfeyxiexzf = (C0514Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf;
                int i4 = 0;
                while (true) {
                    AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr = c0514Ujhhgtgfeyxiexzf.f2456Ujhhgtgfeyxiexzf;
                    if (i4 < abstractC3638UjhhgtgfeyxiexzfArr.length) {
                        hashSet2.add(abstractC3638UjhhgtgfeyxiexzfArr[i4]);
                        i4++;
                    }
                }
            } else {
                if (abstractC3068Ujhhgtgfeyxiexzf instanceof AbstractC0236Ujhhgtgfeyxiexzf) {
                    throw null;
                }
                boolean z = abstractC3068Ujhhgtgfeyxiexzf instanceof AbstractC0235Ujhhgtgfeyxiexzf;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c3268feyxiexzfUjhhgtg.m4774Ujhhgtgfeyxiexzf((AbstractC3638Ujhhgtgfeyxiexzf) it2.next());
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2900Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        int iM4449feyxiexzfUjhhgtg;
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = c0295Ujhhgtgfeyxiexzf.f4172Ujhhgtgfeyxiexzf;
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(7, c3268feyxiexzfUjhhgtg);
        C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f9130Ujhhgtgfeyxiexzf;
        Iterator it = ((C1476feyxiexzfUjhhgtg) c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf).f5122Ujhhgtgfeyxiexzf.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f9131Ujhhgtgfeyxiexzf;
                if (c2790feyxiexzfUjhhgtg != null) {
                    c2790feyxiexzfUjhhgtg.m4082Ujhhgtgfeyxiexzf();
                    C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
                    int length2 = ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).f10801Ujhhgtgfeyxiexzf.length;
                    c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = new TreeMap();
                    for (int i2 = 0; i2 < length2; i2++) {
                        ((TreeMap) c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf).put(((C2791Ujhhgtgfeyxiexzf) ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).m4969Ujhhgtgfeyxiexzf(i2)).f8840Ujhhgtgfeyxiexzf, null);
                    }
                    if (((TreeMap) c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf).size() > 65535) {
                        throw new UnsupportedOperationException("too many catch handlers");
                    }
                    C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = new C2608Ujhhgtgfeyxiexzf();
                    c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(((TreeMap) c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf).size());
                    for (Map.Entry entry : ((TreeMap) c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf).entrySet()) {
                        C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf = (C2789Ujhhgtgfeyxiexzf) entry.getKey();
                        Object[] objArr = c2789Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf;
                        int length3 = objArr.length;
                        int length4 = objArr.length;
                        boolean zEquals = length4 == 0 ? false : ((C2788feyxiexzfUjhhgtg) c2789Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(length4 - 1)).f8829Ujhhgtgfeyxiexzf.equals(C3057Ujhhgtgfeyxiexzf.f9453Ujhhgtgfeyxiexzf);
                        entry.setValue(Integer.valueOf(c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf));
                        if (zEquals) {
                            c2608Ujhhgtgfeyxiexzf.m3896Ujhhgtgfeyxiexzf(-(length3 - 1));
                            length3--;
                        } else {
                            c2608Ujhhgtgfeyxiexzf.m3896Ujhhgtgfeyxiexzf(length3);
                        }
                        for (int i3 = 0; i3 < length3; i3++) {
                            C2788feyxiexzfUjhhgtg c2788feyxiexzfUjhhgtg = (C2788feyxiexzfUjhhgtg) c2789Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i3);
                            c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(c0395Ujhhgtgfeyxiexzf.m1666Ujhhgtgfeyxiexzf(c2788feyxiexzfUjhhgtg.f8829Ujhhgtgfeyxiexzf));
                            c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(c2788feyxiexzfUjhhgtg.f8830Ujhhgtgfeyxiexzf);
                        }
                        if (zEquals) {
                            c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(((C2788feyxiexzfUjhhgtg) c2789Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(length3)).f8830Ujhhgtgfeyxiexzf);
                        }
                    }
                    c2790feyxiexzfUjhhgtg.f8836Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3891Ujhhgtgfeyxiexzf();
                    C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg2 = this.f9131Ujhhgtgfeyxiexzf;
                    c2790feyxiexzfUjhhgtg2.m4082Ujhhgtgfeyxiexzf();
                    length = (((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf).f10801Ujhhgtgfeyxiexzf.length * 8) + ((byte[]) c2790feyxiexzfUjhhgtg2.f8836Ujhhgtgfeyxiexzf).length;
                }
                c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
                int iM4541Ujhhgtgfeyxiexzf = ((C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf).m4541Ujhhgtgfeyxiexzf();
                if ((iM4541Ujhhgtgfeyxiexzf & 1) != 0) {
                    iM4541Ujhhgtgfeyxiexzf++;
                }
                m2861Ujhhgtgfeyxiexzf((iM4541Ujhhgtgfeyxiexzf * 2) + 16 + length);
                return;
            }
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) it.next();
            if (abstractC3068Ujhhgtgfeyxiexzf instanceof C3143Ujhhgtgfeyxiexzf) {
                C3143Ujhhgtgfeyxiexzf c3143Ujhhgtgfeyxiexzf = (C3143Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf;
                AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c3143Ujhhgtgfeyxiexzf.f9737Ujhhgtgfeyxiexzf;
                int iM4449feyxiexzfUjhhgtg2 = c2965Ujhhgtgfeyxiexzf.m4449feyxiexzfUjhhgtg(abstractC3638Ujhhgtgfeyxiexzf);
                if (iM4449feyxiexzfUjhhgtg2 >= 0) {
                    c3143Ujhhgtgfeyxiexzf.m4659Ujhhgtgfeyxiexzf(iM4449feyxiexzfUjhhgtg2);
                }
                if ((abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3152Ujhhgtgfeyxiexzf) && (iM4449feyxiexzfUjhhgtg = c2965Ujhhgtgfeyxiexzf.m4449feyxiexzfUjhhgtg(((AbstractC3152Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9760Ujhhgtgfeyxiexzf)) >= 0) {
                    c3143Ujhhgtgfeyxiexzf.m4658Ujhhgtgfeyxiexzf(iM4449feyxiexzfUjhhgtg);
                }
            } else if (abstractC3068Ujhhgtgfeyxiexzf instanceof C0514Ujhhgtgfeyxiexzf) {
                C0514Ujhhgtgfeyxiexzf c0514Ujhhgtgfeyxiexzf = (C0514Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf;
                while (true) {
                    AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr = c0514Ujhhgtgfeyxiexzf.f2456Ujhhgtgfeyxiexzf;
                    if (length >= abstractC3638UjhhgtgfeyxiexzfArr.length) {
                        break;
                    }
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638UjhhgtgfeyxiexzfArr[length];
                    int iM4449feyxiexzfUjhhgtg3 = c2965Ujhhgtgfeyxiexzf.m4449feyxiexzfUjhhgtg(abstractC3638Ujhhgtgfeyxiexzf2);
                    if (iM4449feyxiexzfUjhhgtg3 < 0) {
                        throw new IllegalArgumentException("index < 0");
                    }
                    int[] iArr = c0514Ujhhgtgfeyxiexzf.f2457Ujhhgtgfeyxiexzf;
                    if (iArr[length] != -1) {
                        throw new IllegalStateException("index already set");
                    }
                    iArr[length] = iM4449feyxiexzfUjhhgtg3;
                    if (abstractC3638Ujhhgtgfeyxiexzf2 instanceof AbstractC3152Ujhhgtgfeyxiexzf) {
                        int iM4449feyxiexzfUjhhgtg4 = c2965Ujhhgtgfeyxiexzf.m4449feyxiexzfUjhhgtg(((AbstractC3152Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf2).f9760Ujhhgtgfeyxiexzf);
                        if (iM4449feyxiexzfUjhhgtg4 < 0) {
                            throw new IllegalArgumentException("index < 0");
                        }
                        if (c0514Ujhhgtgfeyxiexzf.f2458Ujhhgtgfeyxiexzf != -1) {
                            throw new IllegalStateException("class index already set");
                        }
                        c0514Ujhhgtgfeyxiexzf.f2458Ujhhgtgfeyxiexzf = iM4449feyxiexzfUjhhgtg4;
                    }
                    length++;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        boolean z;
        int length;
        C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf;
        String string;
        int iM2653Ujhhgtgfeyxiexzf;
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f9130Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
        int i = ((C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf).f9496Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
        C3067Ujhhgtgfeyxiexzf c3067Ujhhgtgfeyxiexzf = (C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf;
        int length2 = c3067Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf2 = this.f9129Ujhhgtgfeyxiexzf;
                C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = c3154Ujhhgtgfeyxiexzf2.f11831Ujhhgtgfeyxiexzf;
                if (!this.f9132Ujhhgtgfeyxiexzf) {
                    if (c3154Ujhhgtgfeyxiexzf2.f11832Ujhhgtgfeyxiexzf == null) {
                        c3154Ujhhgtgfeyxiexzf2.f11832Ujhhgtgfeyxiexzf = c0870feyxiexzfUjhhgtg.m2303Ujhhgtgfeyxiexzf(c3154Ujhhgtgfeyxiexzf2.f9760Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf);
                    }
                    c0870feyxiexzfUjhhgtg = c3154Ujhhgtgfeyxiexzf2.f11832Ujhhgtgfeyxiexzf;
                }
                int iM2653Ujhhgtgfeyxiexzf2 = c0870feyxiexzfUjhhgtg.f3382Ujhhgtgfeyxiexzf.m2653Ujhhgtgfeyxiexzf();
                c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
                int iM4541Ujhhgtgfeyxiexzf = ((C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf).m4541Ujhhgtgfeyxiexzf();
                z = (iM4541Ujhhgtgfeyxiexzf & 1) != 0;
                C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f9131Ujhhgtgfeyxiexzf;
                if (c2790feyxiexzfUjhhgtg == null) {
                    length = 0;
                } else {
                    c2790feyxiexzfUjhhgtg.m4082Ujhhgtgfeyxiexzf();
                    length = ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).f10801Ujhhgtgfeyxiexzf.length;
                }
                C3090Ujhhgtgfeyxiexzf c3090Ujhhgtgfeyxiexzf = this.f9134Ujhhgtgfeyxiexzf;
                int iM2857Ujhhgtgfeyxiexzf = c3090Ujhhgtgfeyxiexzf == null ? 0 : c3090Ujhhgtgfeyxiexzf.m2857Ujhhgtgfeyxiexzf();
                if (zM3888Ujhhgtgfeyxiexzf) {
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + ' ' + c3154Ujhhgtgfeyxiexzf2.mo1392Ujhhgtgfeyxiexzf());
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  registers_size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)));
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  ins_size:       ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM2653Ujhhgtgfeyxiexzf2)));
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  outs_size:      ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i3)));
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  tries_size:     ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(length)));
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  debug_off:      ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf)));
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  insns_size:     ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM4541Ujhhgtgfeyxiexzf)));
                    InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = this.f9133Ujhhgtgfeyxiexzf;
                    if (interfaceC1790feyxiexzfUjhhgtg.size() != 0) {
                        StringBuilder sb = new StringBuilder("  throws ");
                        int size = interfaceC1790feyxiexzfUjhhgtg.size();
                        if (size == 0) {
                            string = "<empty>";
                            c3154Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf2;
                        } else {
                            StringBuilder sb2 = new StringBuilder(100);
                            int i4 = 0;
                            while (i4 < size) {
                                C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf3 = c3154Ujhhgtgfeyxiexzf2;
                                if (i4 != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(interfaceC1790feyxiexzfUjhhgtg.getType(i4).mo1392Ujhhgtgfeyxiexzf());
                                i4++;
                                c3154Ujhhgtgfeyxiexzf2 = c3154Ujhhgtgfeyxiexzf3;
                            }
                            c3154Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf2;
                            string = sb2.toString();
                        }
                        sb.append(string);
                        c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, sb.toString());
                    } else {
                        zM3888Ujhhgtgfeyxiexzf = zM3888Ujhhgtgfeyxiexzf;
                        c3154Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf2;
                    }
                } else {
                    zM3888Ujhhgtgfeyxiexzf = zM3888Ujhhgtgfeyxiexzf;
                    c3154Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf2;
                }
                c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(i);
                c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(iM2653Ujhhgtgfeyxiexzf2);
                c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(i3);
                c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(length);
                c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
                c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM4541Ujhhgtgfeyxiexzf);
                c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
                try {
                    ((C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf).m4542Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf);
                    if (this.f9131Ujhhgtgfeyxiexzf != null) {
                        if (z) {
                            if (zM3888Ujhhgtgfeyxiexzf) {
                                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  padding: 0");
                            }
                            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(0);
                        }
                        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg2 = this.f9131Ujhhgtgfeyxiexzf;
                        c2790feyxiexzfUjhhgtg2.m4082Ujhhgtgfeyxiexzf();
                        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
                            c2790feyxiexzfUjhhgtg2.m4082Ujhhgtgfeyxiexzf();
                            int length3 = ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf).f10801Ujhhgtgfeyxiexzf.length;
                            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "  tries:");
                            for (int i5 = 0; i5 < length3; i5++) {
                                C2791Ujhhgtgfeyxiexzf c2791Ujhhgtgfeyxiexzf = (C2791Ujhhgtgfeyxiexzf) ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf).m4969Ujhhgtgfeyxiexzf(i5);
                                C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf = c2791Ujhhgtgfeyxiexzf.f8840Ujhhgtgfeyxiexzf;
                                StringBuilder sb3 = new StringBuilder("    try ");
                                int i6 = c2791Ujhhgtgfeyxiexzf.f8838Ujhhgtgfeyxiexzf;
                                sb3.append(i6 == ((char) i6) ? AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i6) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i6));
                                sb3.append("..");
                                int i7 = c2791Ujhhgtgfeyxiexzf.f8839Ujhhgtgfeyxiexzf;
                                sb3.append(i7 == ((char) i7) ? AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i7) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i7));
                                String string2 = sb3.toString();
                                String strM4071Ujhhgtgfeyxiexzf = c2789Ujhhgtgfeyxiexzf.m4071Ujhhgtgfeyxiexzf("    ", "");
                                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(6, string2);
                                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, strM4071Ujhhgtgfeyxiexzf);
                            }
                            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "  handlers:");
                            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(c2790feyxiexzfUjhhgtg2.f8833Ujhhgtgfeyxiexzf, "    size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(((TreeMap) c2790feyxiexzfUjhhgtg2.f8837Ujhhgtgfeyxiexzf).size())));
                            C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf2 = null;
                            int i8 = 0;
                            for (Map.Entry entry : ((TreeMap) c2790feyxiexzfUjhhgtg2.f8837Ujhhgtgfeyxiexzf).entrySet()) {
                                C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf3 = (C2789Ujhhgtgfeyxiexzf) entry.getKey();
                                int iIntValue = ((Integer) entry.getValue()).intValue();
                                if (c2789Ujhhgtgfeyxiexzf2 != null) {
                                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(iIntValue - i8, c2789Ujhhgtgfeyxiexzf2.m4071Ujhhgtgfeyxiexzf("    ", AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i8).concat(": ")));
                                }
                                i8 = iIntValue;
                                c2789Ujhhgtgfeyxiexzf2 = c2789Ujhhgtgfeyxiexzf3;
                            }
                            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(((byte[]) c2790feyxiexzfUjhhgtg2.f8836Ujhhgtgfeyxiexzf).length - i8, c2789Ujhhgtgfeyxiexzf2.m4071Ujhhgtgfeyxiexzf("    ", AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i8).concat(": ")));
                        }
                        int length4 = ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf).f10801Ujhhgtgfeyxiexzf.length;
                        for (int i9 = 0; i9 < length4; i9++) {
                            C2791Ujhhgtgfeyxiexzf c2791Ujhhgtgfeyxiexzf2 = (C2791Ujhhgtgfeyxiexzf) ((C2792Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf).m4969Ujhhgtgfeyxiexzf(i9);
                            int i10 = c2791Ujhhgtgfeyxiexzf2.f8838Ujhhgtgfeyxiexzf;
                            int i11 = c2791Ujhhgtgfeyxiexzf2.f8839Ujhhgtgfeyxiexzf;
                            int i12 = i11 - i10;
                            if (i12 >= 65536) {
                                throw new UnsupportedOperationException("bogus exception range: " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i10) + ".." + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i11));
                            }
                            c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(i10);
                            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(i12);
                            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(((Integer) ((TreeMap) c2790feyxiexzfUjhhgtg2.f8837Ujhhgtgfeyxiexzf).get(c2791Ujhhgtgfeyxiexzf2.f8840Ujhhgtgfeyxiexzf)).intValue());
                        }
                        c2608Ujhhgtgfeyxiexzf.m3892Ujhhgtgfeyxiexzf((byte[]) c2790feyxiexzfUjhhgtg2.f8836Ujhhgtgfeyxiexzf);
                    }
                    if (!zM3888Ujhhgtgfeyxiexzf || this.f9134Ujhhgtgfeyxiexzf == null) {
                        return;
                    }
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "  debug info");
                    this.f9134Ujhhgtgfeyxiexzf.m4589Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, "    ", c2608Ujhhgtgfeyxiexzf, false);
                    return;
                } catch (RuntimeException e) {
                    throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while writing instructions for " + c3154Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf(), e);
                }
            }
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) c3067Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i2);
            if (abstractC3068Ujhhgtgfeyxiexzf instanceof C3143Ujhhgtgfeyxiexzf) {
                AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = ((C3143Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf).f9737Ujhhgtgfeyxiexzf;
                if (abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3756feyxiexzfUjhhgtg) {
                    AbstractC3756feyxiexzfUjhhgtg abstractC3756feyxiexzfUjhhgtg = (AbstractC3756feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf;
                    z = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10100Ujhhgtgfeyxiexzf == 113;
                    C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg2 = abstractC3756feyxiexzfUjhhgtg.f11831Ujhhgtgfeyxiexzf;
                    if (!z) {
                        if (abstractC3756feyxiexzfUjhhgtg.f11832Ujhhgtgfeyxiexzf == null) {
                            abstractC3756feyxiexzfUjhhgtg.f11832Ujhhgtgfeyxiexzf = c0870feyxiexzfUjhhgtg2.m2303Ujhhgtgfeyxiexzf(abstractC3756feyxiexzfUjhhgtg.f9760Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf);
                        }
                        c0870feyxiexzfUjhhgtg2 = abstractC3756feyxiexzfUjhhgtg.f11832Ujhhgtgfeyxiexzf;
                    }
                    iM2653Ujhhgtgfeyxiexzf = c0870feyxiexzfUjhhgtg2.f3382Ujhhgtgfeyxiexzf.m2653Ujhhgtgfeyxiexzf();
                } else {
                    iM2653Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf instanceof C3136Ujhhgtgfeyxiexzf ? ((C3136Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9727Ujhhgtgfeyxiexzf.f9751Ujhhgtgfeyxiexzf.f3382Ujhhgtgfeyxiexzf.m2653Ujhhgtgfeyxiexzf() : 0;
                }
            } else {
                if (!(abstractC3068Ujhhgtgfeyxiexzf instanceof C0514Ujhhgtgfeyxiexzf)) {
                    continue;
                } else {
                    if (abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10100Ujhhgtgfeyxiexzf != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM2653Ujhhgtgfeyxiexzf = 1 + ((C3156Ujhhgtgfeyxiexzf) ((C0514Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf).f2456Ujhhgtgfeyxiexzf[1]).f9768Ujhhgtgfeyxiexzf.f3382Ujhhgtgfeyxiexzf.m2653Ujhhgtgfeyxiexzf();
                }
                i2++;
            }
            if (iM2653Ujhhgtgfeyxiexzf > i3) {
                i3 = iM2653Ujhhgtgfeyxiexzf;
            }
            i2++;
        }
    }
}
