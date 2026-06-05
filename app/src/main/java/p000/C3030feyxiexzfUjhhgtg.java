package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3030feyxiexzfUjhhgtg implements InterfaceC0901feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9396Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f9397Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3030feyxiexzfUjhhgtg(int i, Object obj) {
        this.f9396Ujhhgtgfeyxiexzf = i;
        this.f9397Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    public final Object get() {
        switch (this.f9396Ujhhgtgfeyxiexzf) {
            case 0:
                return (AnimatedImageDrawable) this.f9397Ujhhgtgfeyxiexzf;
            case 1:
                return (byte[]) this.f9397Ujhhgtgfeyxiexzf;
            case 2:
                return (File) this.f9397Ujhhgtgfeyxiexzf;
            default:
                return (Bitmap) this.f9397Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1444Ujhhgtgfeyxiexzf() {
        switch (this.f9396Ujhhgtgfeyxiexzf) {
            case 0:
                ((AnimatedImageDrawable) this.f9397Ujhhgtgfeyxiexzf).stop();
                ((AnimatedImageDrawable) this.f9397Ujhhgtgfeyxiexzf).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1445Ujhhgtgfeyxiexzf() {
        switch (this.f9396Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC1860Ujhhgtgfeyxiexzf.m3195Ujhhgtgfeyxiexzf(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f9397Ujhhgtgfeyxiexzf).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f9397Ujhhgtgfeyxiexzf).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f9397Ujhhgtgfeyxiexzf).length;
            case 2:
                return 1;
            default:
                return AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf((Bitmap) this.f9397Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Class mo1446Ujhhgtgfeyxiexzf() {
        switch (this.f9396Ujhhgtgfeyxiexzf) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f9397Ujhhgtgfeyxiexzf).getClass();
            default:
                return Bitmap.class;
        }
    }

    public C3030feyxiexzfUjhhgtg(byte[] bArr) {
        this.f9396Ujhhgtgfeyxiexzf = 1;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(bArr, "Argument must not be null");
        this.f9397Ujhhgtgfeyxiexzf = bArr;
    }

    public C3030feyxiexzfUjhhgtg(File file) {
        this.f9396Ujhhgtgfeyxiexzf = 2;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(file, "Argument must not be null");
        this.f9397Ujhhgtgfeyxiexzf = file;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m4506Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    private final void m4507Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    private final void m4508Ujhhgtgfeyxiexzf() {
    }
}
