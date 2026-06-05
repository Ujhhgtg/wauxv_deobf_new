package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2510feyxiexzfUjhhgtg implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8197Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC2512feyxiexzfUjhhgtg f8198Ujhhgtgfeyxiexzf;

    public C2510feyxiexzfUjhhgtg() {
        this.f8197Ujhhgtgfeyxiexzf = 0;
        this.f8198Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(3);
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final /* bridge */ /* synthetic */ boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8197Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC2951feyxiexzfUjhhgtg.m4331Ujhhgtgfeyxiexzf(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8197Ujhhgtgfeyxiexzf) {
            case 0:
                return m3789Ujhhgtgfeyxiexzf(AbstractC2951feyxiexzfUjhhgtg.m4313Ujhhgtgfeyxiexzf(obj), i, i2, c1471feyxiexzfUjhhgtg);
            default:
                return C2511feyxiexzfUjhhgtg.m3790Ujhhgtgfeyxiexzf(this.f8198Ujhhgtgfeyxiexzf, ((C1125feyxiexzfUjhhgtg) obj).m2597Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2511feyxiexzfUjhhgtg m3789Ujhhgtgfeyxiexzf(ImageDecoder.Source source, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C3125Ujhhgtgfeyxiexzf(i, i2, c1471feyxiexzfUjhhgtg));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2511feyxiexzfUjhhgtg((C2466feyxiexzfUjhhgtg) this.f8198Ujhhgtgfeyxiexzf, bitmapDecodeBitmap);
    }

    public C2510feyxiexzfUjhhgtg(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg) {
        this.f8197Ujhhgtgfeyxiexzf = 1;
        this.f8198Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg;
    }
}
