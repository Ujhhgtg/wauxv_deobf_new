package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛳ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3582feyxiexzfUjhhgtg implements InterfaceC1984Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f11152Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f11153Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public InterfaceC0994feyxiexzfUjhhgtg f11154Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Handler f11155Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f11156Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final long f11157Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Bitmap f11158Ujhhgtgfeyxiexzf;

    public C3582feyxiexzfUjhhgtg(Handler handler, int i, long j) {
        if (!AbstractC1860Ujhhgtgfeyxiexzf.m3200Ujhhgtgfeyxiexzf(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f11152Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f11153Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f11155Ujhhgtgfeyxiexzf = handler;
        this.f11156Ujhhgtgfeyxiexzf = i;
        this.f11157Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo3332Ujhhgtgfeyxiexzf(C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg) throws Throwable {
        c1046feyxiexzfUjhhgtg.m2547Ujhhgtgfeyxiexzf(this.f11152Ujhhgtgfeyxiexzf, this.f11153Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3333Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        this.f11154Ujhhgtgfeyxiexzf = interfaceC0994feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo3334Ujhhgtgfeyxiexzf(Object obj) {
        this.f11158Ujhhgtgfeyxiexzf = (Bitmap) obj;
        Handler handler = this.f11155Ujhhgtgfeyxiexzf;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f11157Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final InterfaceC0994feyxiexzfUjhhgtg mo3337Ujhhgtgfeyxiexzf() {
        return this.f11154Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo3338Ujhhgtgfeyxiexzf(Drawable drawable) {
        this.f11158Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1052Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo1053Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1054Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo3331Ujhhgtgfeyxiexzf(C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3335Ujhhgtgfeyxiexzf(Drawable drawable) {
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo3336Ujhhgtgfeyxiexzf(Drawable drawable) {
    }
}
