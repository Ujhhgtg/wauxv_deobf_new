package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1459feyxiexzfUjhhgtg extends C0866feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final long f5073Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f5074Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f5075Ujhhgtgfeyxiexzf;

    public C1459feyxiexzfUjhhgtg(C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg, C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg, long j, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        super(c0858feyxiexzfUjhhgtg, c0871feyxiexzfUjhhgtg, interfaceC1121feyxiexzfUjhhgtg);
        this.f5073Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.C0866feyxiexzfUjhhgtg, p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC2876feyxiexzfUjhhgtg mo2267Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (interfaceC1121feyxiexzfUjhhgtg.equals(this.f3364Ujhhgtgfeyxiexzf)) {
            return this;
        }
        C1328feyxiexzfUjhhgtg c1328feyxiexzfUjhhgtg = new C1328feyxiexzfUjhhgtg(this.f3362Ujhhgtgfeyxiexzf, this.f3363Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        if (interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf() != 1) {
            throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should contain only 1 element, but get " + interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf()).toString());
        }
        List listMo1122Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1122Ujhhgtgfeyxiexzf(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo1122Ujhhgtgfeyxiexzf) {
            if (obj instanceof InterfaceC0868feyxiexzfUjhhgtg) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC0868feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4247feyxiexzfUjhhgtg(arrayList)) != null) {
            return c1328feyxiexzfUjhhgtg;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C0866feyxiexzfUjhhgtg, p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final int mo1185Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (!this.f5074Ujhhgtgfeyxiexzf) {
            this.f5074Ujhhgtgfeyxiexzf = true;
            return 0;
        }
        if (this.f5075Ujhhgtgfeyxiexzf) {
            return -1;
        }
        this.f5075Ujhhgtgfeyxiexzf = true;
        return 1;
    }

    @Override // p000.C0866feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ */
    public final String mo2294Ujhhgtgfeyxiexzf(long j) {
        Object next;
        String strMo1117Ujhhgtgfeyxiexzf;
        if (j != 19501) {
            return super.mo2294Ujhhgtgfeyxiexzf(j);
        }
        int i = (int) (this.f5073Ujhhgtgfeyxiexzf & 2147483647L);
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = this.f3364Ujhhgtgfeyxiexzf;
        Iterator it = AbstractC0217Ujhhgtgfeyxiexzf.m1324Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) (AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf((InterfaceC1121feyxiexzfUjhhgtg) next, 0) & 2147483647L)) != i);
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg2 = (InterfaceC1121feyxiexzfUjhhgtg) next;
        if (interfaceC1121feyxiexzfUjhhgtg2 != null && (strMo1117Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg2.mo1117Ujhhgtgfeyxiexzf()) != null) {
            return strMo1117Ujhhgtgfeyxiexzf;
        }
        throw new C0670Ujhhgtgfeyxiexzf("Cannot find a subclass of " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // p000.C0866feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ */
    public final long mo1222feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        if (i == 0) {
            return 19501L;
        }
        return AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, 0);
    }
}
