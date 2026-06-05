package p000;

import android.content.Context;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1907feyxiexzfUjhhgtg implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2486feyxiexzfUjhhgtg f6368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C1906Ujhhgtgfeyxiexzf f6370Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1907feyxiexzfUjhhgtg(C2486feyxiexzfUjhhgtg c2486feyxiexzfUjhhgtg, boolean z, C1906Ujhhgtgfeyxiexzf c1906Ujhhgtgfeyxiexzf) {
        this.f6368Ujhhgtgfeyxiexzf = c2486feyxiexzfUjhhgtg;
        this.f6369Ujhhgtgfeyxiexzf = z;
        this.f6370Ujhhgtgfeyxiexzf = c1906Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        AbstractC2059Ujhhgtgfeyxiexzf abstractC2059Ujhhgtgfeyxiexzf = this.f6368Ujhhgtgfeyxiexzf.f8121Ujhhgtgfeyxiexzf;
        String str = abstractC2059Ujhhgtgfeyxiexzf.f6767Ujhhgtgfeyxiexzf;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException(MagicFactory.get(4928284614914475402L, strArr).toString());
        }
        SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515UjhhgtgfeyxiexzfM3941Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf();
        boolean z = this.f6369Ujhhgtgfeyxiexzf;
        sharedPreferencesC3515UjhhgtgfeyxiexzfM3941Ujhhgtgfeyxiexzf.putBoolean(str, z);
        if (z && !abstractC2059Ujhhgtgfeyxiexzf.f2585Ujhhgtgfeyxiexzf) {
            abstractC2059Ujhhgtgfeyxiexzf.mo1843feyxiexzfUjhhgtg();
        }
        if (abstractC2059Ujhhgtgfeyxiexzf.mo1482feyxiexzfUjhhgtg()) {
            Context context = ((C0702Ujhhgtgfeyxiexzf) this.f6370Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf).f2880Ujhhgtgfeyxiexzf.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(MagicFactory.get(4928462920481768842L, strArr));
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            sb.append((String) C0580Ujhhgtgfeyxiexzf.f2607Ujhhgtgfeyxiexzf.m4430Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.f2601Ujhhgtgfeyxiexzf[5]));
            sb.append(MagicFactory.get(4928462903301899658L, strArr));
            AbstractC1245feyxiexzfUjhhgtg.m2758Ujhhgtgfeyxiexzf(context, 6, sb.toString());
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
