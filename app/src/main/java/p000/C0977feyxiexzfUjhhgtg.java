package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能要点脸ᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0977feyxiexzfUjhhgtg extends AbstractC2846Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2839feyxiexzfUjhhgtg f3871Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2382Ujhhgtgfeyxiexzf f3872Ujhhgtgfeyxiexzf;

    public C0977feyxiexzfUjhhgtg(C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtg) {
        super(C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf);
        this.f3871Ujhhgtgfeyxiexzf = c2839feyxiexzfUjhhgtg;
        this.f3872Ujhhgtgfeyxiexzf = new C2382Ujhhgtgfeyxiexzf(C1157feyxiexzfUjhhgtg.f4353Ujhhgtgfeyxiexzf, 0);
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return this.f3872Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final Object mo1108Ujhhgtgfeyxiexzf() {
        return new ArrayList();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo1109Ujhhgtgfeyxiexzf(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final Iterator mo1110Ujhhgtgfeyxiexzf(Object obj) {
        return new C2930Ujhhgtgfeyxiexzf(1, (Object[]) obj);
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        return new ArrayList(Arrays.asList((Object[]) obj));
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final Object mo1114Ujhhgtgfeyxiexzf(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f3871Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf(), arrayList.size()));
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final void mo2245Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
