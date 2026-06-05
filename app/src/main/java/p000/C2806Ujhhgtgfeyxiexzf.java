package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱᛲᛳ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2806Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f8920Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final ArrayList f8921Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final HashMap f8922Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f8923Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ArrayList f8924Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f8925Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C3755Ujhhgtgfeyxiexzf f8926Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public byte[] f8927Ujhhgtgfeyxiexzf;

    public C2806Ujhhgtgfeyxiexzf(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf) {
        super(1, -1);
        if (c3057Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f8920Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
        this.f8921Ujhhgtgfeyxiexzf = new ArrayList(20);
        this.f8922Ujhhgtgfeyxiexzf = new HashMap(40);
        this.f8923Ujhhgtgfeyxiexzf = new ArrayList(20);
        this.f8924Ujhhgtgfeyxiexzf = new ArrayList(20);
        this.f8925Ujhhgtgfeyxiexzf = new ArrayList(20);
        this.f8926Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m4125Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "  " + str + ":");
        }
        int iMo4850Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < size; i++) {
            iMo4850Ujhhgtgfeyxiexzf = ((AbstractC3347Ujhhgtgfeyxiexzf) arrayList.get(i)).mo4850Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf, iMo4850Ujhhgtgfeyxiexzf, i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static void m4126Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, String str, int i) {
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(i);
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        ArrayList<C3346feyxiexzfUjhhgtg> arrayList = this.f8921Ujhhgtgfeyxiexzf;
        if (!arrayList.isEmpty()) {
            m4128Ujhhgtgfeyxiexzf();
            for (C3346feyxiexzfUjhhgtg c3346feyxiexzfUjhhgtg : arrayList) {
                c3346feyxiexzfUjhhgtg.getClass();
                c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf.m4944Ujhhgtgfeyxiexzf(c3346feyxiexzfUjhhgtg.f10457Ujhhgtgfeyxiexzf);
            }
        }
        ArrayList<C3346feyxiexzfUjhhgtg> arrayList2 = this.f8923Ujhhgtgfeyxiexzf;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (C3346feyxiexzfUjhhgtg c3346feyxiexzfUjhhgtg2 : arrayList2) {
                c3346feyxiexzfUjhhgtg2.getClass();
                c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf.m4944Ujhhgtgfeyxiexzf(c3346feyxiexzfUjhhgtg2.f10457Ujhhgtgfeyxiexzf);
            }
        }
        ArrayList<C3348feyxiexzfUjhhgtg> arrayList3 = this.f8924Ujhhgtgfeyxiexzf;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (C3348feyxiexzfUjhhgtg c3348feyxiexzfUjhhgtg : arrayList3) {
                c3348feyxiexzfUjhhgtg.getClass();
                C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf;
                C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10260Ujhhgtgfeyxiexzf;
                c0392Ujhhgtgfeyxiexzf.m1646Ujhhgtgfeyxiexzf(c3348feyxiexzfUjhhgtg.f10459Ujhhgtgfeyxiexzf);
                C2868feyxiexzfUjhhgtg c2868feyxiexzfUjhhgtg = c3348feyxiexzfUjhhgtg.f10460Ujhhgtgfeyxiexzf;
                if (c2868feyxiexzfUjhhgtg != null) {
                    c0295Ujhhgtgfeyxiexzf.m1509Ujhhgtgfeyxiexzf(c2868feyxiexzfUjhhgtg);
                }
            }
        }
        ArrayList<C3348feyxiexzfUjhhgtg> arrayList4 = this.f8925Ujhhgtgfeyxiexzf;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (C3348feyxiexzfUjhhgtg c3348feyxiexzfUjhhgtg2 : arrayList4) {
            c3348feyxiexzfUjhhgtg2.getClass();
            C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf;
            C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10260Ujhhgtgfeyxiexzf;
            c0392Ujhhgtgfeyxiexzf2.m1646Ujhhgtgfeyxiexzf(c3348feyxiexzfUjhhgtg2.f10459Ujhhgtgfeyxiexzf);
            C2868feyxiexzfUjhhgtg c2868feyxiexzfUjhhgtg2 = c3348feyxiexzfUjhhgtg2.f10460Ujhhgtgfeyxiexzf;
            if (c2868feyxiexzfUjhhgtg2 != null) {
                c0295Ujhhgtgfeyxiexzf2.m1509Ujhhgtgfeyxiexzf(c2868feyxiexzfUjhhgtg2);
            }
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2899Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = new C2608Ujhhgtgfeyxiexzf();
        m4127Ujhhgtgfeyxiexzf(c0295Ujhhgtgfeyxiexzf.f4172Ujhhgtgfeyxiexzf, c2608Ujhhgtgfeyxiexzf);
        byte[] bArrM3891Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3891Ujhhgtgfeyxiexzf();
        this.f8927Ujhhgtgfeyxiexzf = bArrM3891Ujhhgtgfeyxiexzf;
        m2861Ujhhgtgfeyxiexzf(bArrM3891Ujhhgtgfeyxiexzf.length);
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            m4127Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf);
        } else {
            c2608Ujhhgtgfeyxiexzf.m3892Ujhhgtgfeyxiexzf(this.f8927Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4127Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        if (zM3888Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + " class data for " + this.f8920Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        ArrayList arrayList = this.f8921Ujhhgtgfeyxiexzf;
        m4126Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f8923Ujhhgtgfeyxiexzf;
        m4126Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f8924Ujhhgtgfeyxiexzf;
        m4126Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f8925Ujhhgtgfeyxiexzf;
        m4126Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf, "virtual_methods", arrayList4.size());
        m4125Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf, "static_fields", arrayList);
        m4125Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf, "instance_fields", arrayList2);
        m4125Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf, "direct_methods", arrayList3);
        m4125Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf, "virtual_methods", arrayList4);
        if (zM3888Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3889Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C3755Ujhhgtgfeyxiexzf m4128Ujhhgtgfeyxiexzf() {
        HashMap map;
        C3755Ujhhgtgfeyxiexzf c3755Ujhhgtgfeyxiexzf;
        if (this.f8926Ujhhgtgfeyxiexzf == null) {
            ArrayList arrayList = this.f8921Ujhhgtgfeyxiexzf;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f8922Ujhhgtgfeyxiexzf;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = (AbstractC3638Ujhhgtgfeyxiexzf) map.get((C3346feyxiexzfUjhhgtg) arrayList.get(size - 1));
                    if (abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3150Ujhhgtgfeyxiexzf) {
                        if (((AbstractC3150Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).mo4665Ujhhgtgfeyxiexzf() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC3638Ujhhgtgfeyxiexzf != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c3755Ujhhgtgfeyxiexzf = null;
                } else {
                    C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg = new C3754feyxiexzfUjhhgtg(size);
                    for (int i = 0; i < size; i++) {
                        C3346feyxiexzfUjhhgtg c3346feyxiexzfUjhhgtg = (C3346feyxiexzfUjhhgtg) arrayList.get(i);
                        Object objM2815feyxiexzfUjhhgtg = (AbstractC3638Ujhhgtgfeyxiexzf) map.get(c3346feyxiexzfUjhhgtg);
                        if (objM2815feyxiexzfUjhhgtg == null) {
                            objM2815feyxiexzfUjhhgtg = AbstractC1264feyxiexzfUjhhgtg.m2815feyxiexzfUjhhgtg(c3346feyxiexzfUjhhgtg.f10457Ujhhgtgfeyxiexzf.f9761Ujhhgtgfeyxiexzf.m4668Ujhhgtgfeyxiexzf());
                        }
                        c3754feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i, objM2815feyxiexzfUjhhgtg);
                    }
                    c3754feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
                    c3755Ujhhgtgfeyxiexzf = new C3755Ujhhgtgfeyxiexzf(c3754feyxiexzfUjhhgtg);
                }
                this.f8926Ujhhgtgfeyxiexzf = c3755Ujhhgtgfeyxiexzf;
            }
        }
        return this.f8926Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m4129Ujhhgtgfeyxiexzf() {
        return this.f8921Ujhhgtgfeyxiexzf.isEmpty() && this.f8923Ujhhgtgfeyxiexzf.isEmpty() && this.f8924Ujhhgtgfeyxiexzf.isEmpty() && this.f8925Ujhhgtgfeyxiexzf.isEmpty();
    }
}
