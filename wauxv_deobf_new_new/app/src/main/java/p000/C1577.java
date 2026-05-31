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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1577 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f5482;

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        int i = this.f5482;
        C1576.f5470.getClass();
        String str = C1576.m3456().getApplicationInfo().sourceDir;
        String strM3463 = AbstractC1578.m3463(i);
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                boolean z = zipFile.getEntry(strM3463) != null;
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
        String[] strArr = AbstractC1471.f5234;
        int i = this.f5482;
        HashMap map = AbstractC1578.f5483;
        byte[] byteArray = null;
        if (i > 0) {
            WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
            if (weakReference == null || (bArr = (byte[]) weakReference.get()) == null) {
                C1576.f5470.getClass();
                String str = C1576.m3456().getApplicationInfo().sourceDir;
                String strM3463 = AbstractC1578.m3463(i);
                try {
                    ZipFile zipFile = new ZipFile(str);
                    try {
                        ZipEntry entry = zipFile.getEntry(strM3463);
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
            this.f5482++;
        }
        return byteArray;
    }
}
