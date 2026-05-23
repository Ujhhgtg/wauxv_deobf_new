package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0421 implements InterfaceC2574 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2301 f1968 = C2301.m4164(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2301 f1969 = new C2301("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2301.f7412);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1867 f1970;

    public C0421(C1867 c1867) {
        this.f1970 = c1867;
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo1510(Object obj, File file, C2303 c2303) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC2568) obj).get();
        C2301 c2301 = f1969;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c2303.m4165(c2301);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC1853.f6168;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c2303.m4165(f1968)).intValue();
        OutputStream c0506 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C1867 c1867 = this.f1970;
                    if (c1867 != null) {
                        try {
                            c0506 = new C0506(fileOutputStream, c1867);
                        } catch (IOException e) {
                            e = e;
                            c0506 = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (c0506 != null) {
                                try {
                                    c0506.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            c0506 = fileOutputStream;
                            if (c0506 != null) {
                                try {
                                    c0506.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        c0506 = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, c0506);
                    c0506.close();
                    try {
                        c0506.close();
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
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC3522.m5106(bitmap) + " in " + AbstractC1853.m3620(jElapsedRealtimeNanos) + ", options format: " + c2303.m4165(c2301) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000.InterfaceC2574
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int mo1614(C2303 c2303) {
        return 2;
    }
}
