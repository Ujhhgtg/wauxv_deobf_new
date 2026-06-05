package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2514feyxiexzfUjhhgtg implements InterfaceC0887feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f8204Ujhhgtgfeyxiexzf = C1469feyxiexzfUjhhgtg.m2972Ujhhgtgfeyxiexzf(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f8205Ujhhgtgfeyxiexzf = new C1469feyxiexzfUjhhgtg("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C1469feyxiexzfUjhhgtg.f5103Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f8206Ujhhgtgfeyxiexzf;

    public C2514feyxiexzfUjhhgtg(C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f8206Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3330Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final boolean mo2018Ujhhgtgfeyxiexzf(Object obj, File file, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC0901feyxiexzfUjhhgtg) obj).get();
        C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg = f8205Ujhhgtgfeyxiexzf;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(f8204Ujhhgtgfeyxiexzf)).intValue();
        OutputStream c2593feyxiexzfUjhhgtg = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = this.f8206Ujhhgtgfeyxiexzf;
                    if (c0271Ujhhgtgfeyxiexzf != null) {
                        try {
                            c2593feyxiexzfUjhhgtg = new C2593feyxiexzfUjhhgtg(fileOutputStream, c0271Ujhhgtgfeyxiexzf);
                        } catch (IOException e) {
                            e = e;
                            c2593feyxiexzfUjhhgtg = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (c2593feyxiexzfUjhhgtg != null) {
                                try {
                                    c2593feyxiexzfUjhhgtg.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            c2593feyxiexzfUjhhgtg = fileOutputStream;
                            if (c2593feyxiexzfUjhhgtg != null) {
                                try {
                                    c2593feyxiexzfUjhhgtg.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        c2593feyxiexzfUjhhgtg = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, c2593feyxiexzfUjhhgtg);
                    c2593feyxiexzfUjhhgtg.close();
                    try {
                        c2593feyxiexzfUjhhgtg.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap) + " in " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos) + ", options format: " + c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000.InterfaceC0887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo2365Ujhhgtgfeyxiexzf(C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return 2;
    }
}
