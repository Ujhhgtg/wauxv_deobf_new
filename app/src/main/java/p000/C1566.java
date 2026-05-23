package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1566 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5452;

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        int i = this.f5452;
        C1565.f5440.getClass();
        String str = C1565.m3276().getApplicationInfo().sourceDir;
        String strM3283 = AbstractC1567.m3283(i);
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                boolean z = zipFile.getEntry(strM3283) != null;
                zipFile.close();
                return z;
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            "t == null";
            throw e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr;
        String[] strArr = AbstractC1574.f5469;
        int i = this.f5452;
        HashMap map = AbstractC1567.f5453;
        byte[] byteArray = null;
        if (i > 0) {
            WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
            if (weakReference == null || (bArr = (byte[]) weakReference.get()) == null) {
                C1565.f5440.getClass();
                String str = C1565.m3276().getApplicationInfo().sourceDir;
                String strM3283 = AbstractC1567.m3283(i);
                try {
                    ZipFile zipFile = new ZipFile(str);
                    try {
                        ZipEntry entry = zipFile.getEntry(strM3283);
                        if (entry != null) {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            "is == null";
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                try {
                                    int i2 = inputStream.read(bArr2);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i2);
                                } catch (Throwable th) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                                try {
                                    zipFile.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th;
                            }
                            inputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        }
                        zipFile.close();
                        if (byteArray != null) {
                            map.put(Integer.valueOf(i), new WeakReference(byteArray));
                        }
                    } catch (Throwable th4) {
                        zipFile.close();
                        throw th4;
                    }
                } catch (IOException e) {
                    "t == null";
                    throw e;
                }
            } else {
                byteArray = bArr;
            }
        }
        if (byteArray != null) {
            this.f5452++;
        }
        return byteArray;
    }
}
