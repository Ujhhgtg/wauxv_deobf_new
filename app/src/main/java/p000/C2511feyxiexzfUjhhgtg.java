package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2511feyxiexzfUjhhgtg implements InterfaceC0901feyxiexzfUjhhgtg, InterfaceC0649Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8199Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8200Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f8201Ujhhgtgfeyxiexzf;

    public C2511feyxiexzfUjhhgtg(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(bitmap, "Bitmap must not be null");
        this.f8200Ujhhgtgfeyxiexzf = bitmap;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, "BitmapPool must not be null");
        this.f8201Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C2511feyxiexzfUjhhgtg m3790Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C2511feyxiexzfUjhhgtg(interfaceC2512feyxiexzfUjhhgtg, bitmap);
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    public final Object get() {
        switch (this.f8199Ujhhgtgfeyxiexzf) {
            case 0:
                return (Bitmap) this.f8200Ujhhgtgfeyxiexzf;
            default:
                return new BitmapDrawable((Resources) this.f8200Ujhhgtgfeyxiexzf, (Bitmap) ((InterfaceC0901feyxiexzfUjhhgtg) this.f8201Ujhhgtgfeyxiexzf).get());
        }
    }

    @Override // p000.InterfaceC0649Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1912Ujhhgtgfeyxiexzf() {
        switch (this.f8199Ujhhgtgfeyxiexzf) {
            case 0:
                ((Bitmap) this.f8200Ujhhgtgfeyxiexzf).prepareToDraw();
                break;
            default:
                InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg = (InterfaceC0901feyxiexzfUjhhgtg) this.f8201Ujhhgtgfeyxiexzf;
                if (interfaceC0901feyxiexzfUjhhgtg instanceof InterfaceC0649Ujhhgtgfeyxiexzf) {
                    ((InterfaceC0649Ujhhgtgfeyxiexzf) interfaceC0901feyxiexzfUjhhgtg).mo1912Ujhhgtgfeyxiexzf();
                }
                break;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1444Ujhhgtgfeyxiexzf() {
        switch (this.f8199Ujhhgtgfeyxiexzf) {
            case 0:
                ((InterfaceC2512feyxiexzfUjhhgtg) this.f8201Ujhhgtgfeyxiexzf).mo1472Ujhhgtgfeyxiexzf((Bitmap) this.f8200Ujhhgtgfeyxiexzf);
                break;
            default:
                ((InterfaceC0901feyxiexzfUjhhgtg) this.f8201Ujhhgtgfeyxiexzf).mo1444Ujhhgtgfeyxiexzf();
                break;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1445Ujhhgtgfeyxiexzf() {
        switch (this.f8199Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf((Bitmap) this.f8200Ujhhgtgfeyxiexzf);
            default:
                return ((InterfaceC0901feyxiexzfUjhhgtg) this.f8201Ujhhgtgfeyxiexzf).mo1445Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Class mo1446Ujhhgtgfeyxiexzf() {
        switch (this.f8199Ujhhgtgfeyxiexzf) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public C2511feyxiexzfUjhhgtg(Resources resources, InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(resources, "Argument must not be null");
        this.f8200Ujhhgtgfeyxiexzf = resources;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, "Argument must not be null");
        this.f8201Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtg;
    }
}
