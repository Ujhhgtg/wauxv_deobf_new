package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2621Ujhhgtgfeyxiexzf implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8448Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3220feyxiexzfUjhhgtg f8449Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2621Ujhhgtgfeyxiexzf(C3220feyxiexzfUjhhgtg c3220feyxiexzfUjhhgtg, int i) {
        this.f8448Ujhhgtgfeyxiexzf = i;
        this.f8449Ujhhgtgfeyxiexzf = c3220feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8448Ujhhgtgfeyxiexzf) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8448Ujhhgtgfeyxiexzf) {
            case 0:
                C3220feyxiexzfUjhhgtg c3220feyxiexzfUjhhgtg = this.f8449Ujhhgtgfeyxiexzf;
                return c3220feyxiexzfUjhhgtg.m4719Ujhhgtgfeyxiexzf(new C2366Ujhhgtgfeyxiexzf((ByteBuffer) obj, c3220feyxiexzfUjhhgtg.f10121Ujhhgtgfeyxiexzf, c3220feyxiexzfUjhhgtg.f10120Ujhhgtgfeyxiexzf, 14), i, i2, c1471feyxiexzfUjhhgtg, C3220feyxiexzfUjhhgtg.f10116Ujhhgtgfeyxiexzf);
            default:
                C3220feyxiexzfUjhhgtg c3220feyxiexzfUjhhgtg2 = this.f8449Ujhhgtgfeyxiexzf;
                return c3220feyxiexzfUjhhgtg2.m4719Ujhhgtgfeyxiexzf(new C2366Ujhhgtgfeyxiexzf((ParcelFileDescriptor) obj, c3220feyxiexzfUjhhgtg2.f10121Ujhhgtgfeyxiexzf, c3220feyxiexzfUjhhgtg2.f10120Ujhhgtgfeyxiexzf), i, i2, c1471feyxiexzfUjhhgtg, C3220feyxiexzfUjhhgtg.f10116Ujhhgtgfeyxiexzf);
        }
    }
}
