package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3247feyxiexzfUjhhgtg implements InterfaceC1765feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1765feyxiexzfUjhhgtg f10189Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f10190Ujhhgtgfeyxiexzf;

    public C3247feyxiexzfUjhhgtg(InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg, boolean z) {
        this.f10189Ujhhgtgfeyxiexzf = interfaceC1765feyxiexzfUjhhgtg;
        this.f10190Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C3247feyxiexzfUjhhgtg) {
            return this.f10189Ujhhgtgfeyxiexzf.equals(((C3247feyxiexzfUjhhgtg) obj).f10189Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return this.f10189Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.InterfaceC1765feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo3060Ujhhgtgfeyxiexzf(Context context, InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, int i, int i2) {
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg = Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f603Ujhhgtgfeyxiexzf;
        Drawable drawable = (Drawable) interfaceC0901feyxiexzfUjhhgtg.get();
        C2511feyxiexzfUjhhgtg c2511feyxiexzfUjhhgtgM2822Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2822Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, drawable, i, i2);
        if (c2511feyxiexzfUjhhgtgM2822Ujhhgtgfeyxiexzf != null) {
            InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf = this.f10189Ujhhgtgfeyxiexzf.mo3060Ujhhgtgfeyxiexzf(context, c2511feyxiexzfUjhhgtgM2822Ujhhgtgfeyxiexzf, i, i2);
            if (!interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.equals(c2511feyxiexzfUjhhgtgM2822Ujhhgtgfeyxiexzf)) {
                return new C2511feyxiexzfUjhhgtg(context.getResources(), interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf);
            }
            interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.mo1444Ujhhgtgfeyxiexzf();
            return interfaceC0901feyxiexzfUjhhgtg;
        }
        if (!this.f10190Ujhhgtgfeyxiexzf) {
            return interfaceC0901feyxiexzfUjhhgtg;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        this.f10189Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
    }
}
