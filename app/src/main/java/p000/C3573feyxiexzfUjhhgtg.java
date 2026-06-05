package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3573feyxiexzfUjhhgtg implements InterfaceC1765feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1765feyxiexzfUjhhgtg f11106Ujhhgtgfeyxiexzf;

    public C3573feyxiexzfUjhhgtg(InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC1765feyxiexzfUjhhgtg, "Argument must not be null");
        this.f11106Ujhhgtgfeyxiexzf = interfaceC1765feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C3573feyxiexzfUjhhgtg) {
            return this.f11106Ujhhgtgfeyxiexzf.equals(((C3573feyxiexzfUjhhgtg) obj).f11106Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return this.f11106Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.InterfaceC1765feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo3060Ujhhgtgfeyxiexzf(Context context, InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, int i, int i2) {
        C3571feyxiexzfUjhhgtg c3571feyxiexzfUjhhgtg = (C3571feyxiexzfUjhhgtg) interfaceC0901feyxiexzfUjhhgtg.get();
        InterfaceC0901feyxiexzfUjhhgtg c2511feyxiexzfUjhhgtg = new C2511feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f603Ujhhgtgfeyxiexzf, ((C3580feyxiexzfUjhhgtg) c3571feyxiexzfUjhhgtg.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11136Ujhhgtgfeyxiexzf);
        InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg = this.f11106Ujhhgtgfeyxiexzf;
        InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf = interfaceC1765feyxiexzfUjhhgtg.mo3060Ujhhgtgfeyxiexzf(context, c2511feyxiexzfUjhhgtg, i, i2);
        if (!c2511feyxiexzfUjhhgtg.equals(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf)) {
            c2511feyxiexzfUjhhgtg.mo1444Ujhhgtgfeyxiexzf();
        }
        ((C3580feyxiexzfUjhhgtg) c3571feyxiexzfUjhhgtg.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).m5115Ujhhgtgfeyxiexzf(interfaceC1765feyxiexzfUjhhgtg, (Bitmap) interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.get());
        return interfaceC0901feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        this.f11106Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
    }
}
