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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛲᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0579Ujhhgtgfeyxiexzf implements Iterator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f2599Ujhhgtgfeyxiexzf;

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        int i = this.f2599Ujhhgtgfeyxiexzf;
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        String str = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getApplicationInfo().sourceDir;
        String strM1863Ujhhgtgfeyxiexzf = AbstractC0587Ujhhgtgfeyxiexzf.m1863Ujhhgtgfeyxiexzf(i);
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                boolean z = zipFile.getEntry(strM1863Ujhhgtgfeyxiexzf) != null;
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
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int i = this.f2599Ujhhgtgfeyxiexzf;
        HashMap map = AbstractC0587Ujhhgtgfeyxiexzf.f2623Ujhhgtgfeyxiexzf;
        byte[] byteArray = null;
        if (i > 0) {
            WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
            if (weakReference == null || (bArr = (byte[]) weakReference.get()) == null) {
                C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                String str = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getApplicationInfo().sourceDir;
                String strM1863Ujhhgtgfeyxiexzf = AbstractC0587Ujhhgtgfeyxiexzf.m1863Ujhhgtgfeyxiexzf(i);
                try {
                    ZipFile zipFile = new ZipFile(str);
                    try {
                        ZipEntry entry = zipFile.getEntry(strM1863Ujhhgtgfeyxiexzf);
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
            this.f2599Ujhhgtgfeyxiexzf++;
        }
        return byteArray;
    }
}
