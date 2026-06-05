package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱᛲᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1458feyxiexzfUjhhgtg extends C0875feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f5072Ujhhgtgfeyxiexzf;

    public C1458feyxiexzfUjhhgtg(C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg, C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        super(c0858feyxiexzfUjhhgtg, c0709Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        this.f5072Ujhhgtgfeyxiexzf = c0709Ujhhgtgfeyxiexzf;
        if (interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf() instanceof AbstractC1437feyxiexzfUjhhgtg) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should be using generic polymorphic serializer, but got " + interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf() + '.').toString());
    }

    @Override // p000.C0875feyxiexzfUjhhgtg, p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC2875feyxiexzfUjhhgtg mo2323Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (interfaceC1121feyxiexzfUjhhgtg.equals(this.f3403Ujhhgtgfeyxiexzf)) {
            return this;
        }
        C1329feyxiexzfUjhhgtg c1329feyxiexzfUjhhgtg = new C1329feyxiexzfUjhhgtg(this.f3401Ujhhgtgfeyxiexzf, this.f5072Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
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
            return c1329feyxiexzfUjhhgtg;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C0875feyxiexzfUjhhgtg, p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final InterfaceC3329Ujhhgtgfeyxiexzf mo2331Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        int i = this.f8572Ujhhgtgfeyxiexzf;
        if (i < 0) {
            throw new C0670Ujhhgtgfeyxiexzf("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f8573Ujhhgtgfeyxiexzf;
        this.f8572Ujhhgtgfeyxiexzf = i - 1;
        m4027feyxiexzfUjhhgtg((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, 0) & 2147483647L))));
        return this;
    }

    @Override // p000.C0875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ */
    public final void mo2354Ujhhgtgfeyxiexzf(long j, String str) {
        if (j != 19501) {
            super.mo2354Ujhhgtgfeyxiexzf(j, str);
        }
    }

    @Override // p000.C0875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ */
    public final long mo1272Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i);
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Unsupported index: ", " in a oneOf type ");
        sbM4804Ujhhgtgfeyxiexzf.append(interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf());
        sbM4804Ujhhgtgfeyxiexzf.append(", which should be using generic polymorphic serializer");
        throw new C0670Ujhhgtgfeyxiexzf(sbM4804Ujhhgtgfeyxiexzf.toString());
    }
}
