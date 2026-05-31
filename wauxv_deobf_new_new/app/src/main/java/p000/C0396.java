package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0396 implements InterfaceC2630 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2334 f1940 = C2334.m4293(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2334 f1941 = new C2334("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2334.f7534);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1893 f1942;

    public C0396(C1893 c1893) {
        this.f1942 = c1893;
    }

    @Override // p000.InterfaceC1208
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo1615(Object obj, File file, C2336 c2336) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2624) obj).get();
        C2334 c2334 = f1941;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c2336.m4294(c2334);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC1879.f6242;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c2336.m4294(f1940)).intValue();
        OutputStream c0483 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C1893 c1893 = this.f1942;
                    if (c1893 != null) {
                        try {
                            c0483 = new C0483(fileOutputStream, c1893);
                        } catch (IOException e) {
                            e = e;
                            c0483 = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (c0483 != null) {
                                try {
                                    c0483.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            c0483 = fileOutputStream;
                            if (c0483 != null) {
                                try {
                                    c0483.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        c0483 = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, c0483);
                    c0483.close();
                    try {
                        c0483.close();
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
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC3580.m5118(bitmap) + " in " + AbstractC1879.m3798(jElapsedRealtimeNanos) + ", options format: " + c2336.m4294(c2334) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000.InterfaceC2630
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int mo1720(C2336 c2336) {
        return 2;
    }
}
