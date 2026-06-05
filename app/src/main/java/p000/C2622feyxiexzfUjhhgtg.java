package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2622feyxiexzfUjhhgtg implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8450Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2510feyxiexzfUjhhgtg f8451Ujhhgtgfeyxiexzf;

    public C2622feyxiexzfUjhhgtg(int i) {
        this.f8450Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                this.f8451Ujhhgtgfeyxiexzf = new C2510feyxiexzfUjhhgtg();
                break;
            default:
                this.f8451Ujhhgtgfeyxiexzf = new C2510feyxiexzfUjhhgtg();
                break;
        }
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final /* bridge */ /* synthetic */ boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8450Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8450Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f8451Ujhhgtgfeyxiexzf.m3789Ujhhgtgfeyxiexzf(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c1471feyxiexzfUjhhgtg);
            default:
                return this.f8451Ujhhgtgfeyxiexzf.m3789Ujhhgtgfeyxiexzf(ImageDecoder.createSource(AbstractC2648Ujhhgtgfeyxiexzf.m3979Ujhhgtgfeyxiexzf((InputStream) obj)), i, i2, c1471feyxiexzfUjhhgtg);
        }
    }
}
