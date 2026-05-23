package p000;

import android.os.StrictMode;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1069 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final File f3866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final File f3867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final File f3868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final File f3869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final long f3871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public BufferedWriter f3874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f3876;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public long f3873 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final LinkedHashMap f3875 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public long f3877 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ThreadPoolExecutor f3878 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1066());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final CallableC1065 f3879 = new CallableC1065(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f3870 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f3872 = 1;

    public C1069(File file, long j) {
        this.f3866 = file;
        this.f3867 = new File(file, "journal");
        this.f3868 = new File(file, "journal.tmp");
        this.f3869 = new File(file, "journal.bkp");
        this.f3871 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2620(C1069 c1069, C1067 c1067, boolean z) {
        synchronized (c1069) {
            C1068 c1068 = (C1068) c1067.f3856;
            if (c1068.f3864 != c1067) {
                throw new IllegalStateException();
            }
            if (z && !c1068.f3863) {
                for (int i = 0; i < 1; i++) {
                    if (!((boolean[]) c1067.f3857)[0]) {
                        c1067.m2617();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                    if (!c1068.f3862[0].exists()) {
                        c1067.m2617();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < 1; i2++) {
                File file = c1068.f3862[0];
                if (!z) {
                    m2622(file);
                } else if (file.exists()) {
                    File file2 = c1068.f3861[0];
                    file.renameTo(file2);
                    long j = c1068.f3860[0];
                    long length = file2.length();
                    c1068.f3860[0] = length;
                    c1069.f3873 = (c1069.f3873 - j) + length;
                }
            }
            c1069.f3876++;
            c1068.f3864 = null;
            if (c1068.f3863 || z) {
                c1068.f3863 = true;
                c1069.f3874.append((CharSequence) "CLEAN");
                c1069.f3874.append(' ');
                c1069.f3874.append((CharSequence) c1068.f3859);
                c1069.f3874.append((CharSequence) c1068.m2619());
                c1069.f3874.append('\n');
                if (z) {
                    c1069.f3877++;
                }
            } else {
                c1069.f3875.remove(c1068.f3859);
                c1069.f3874.append((CharSequence) "REMOVE");
                c1069.f3874.append(' ');
                c1069.f3874.append((CharSequence) c1068.f3859);
                c1069.f3874.append('\n');
            }
            m2623(c1069.f3874);
            if (c1069.f3873 > c1069.f3871 || c1069.m2628()) {
                c1069.f3878.submit(c1069.f3879);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m2621(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static void m2622(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static void m2623(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static C1069 m2624(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2625(file2, file3, false);
            }
        }
        C1069 c1069 = new C1069(file, j);
        if (c1069.f3867.exists()) {
            try {
                c1069.m2630();
                c1069.m2629();
                return c1069;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c1069.close();
                AbstractC3521.m5103(c1069.f3866);
            }
        }
        file.mkdirs();
        C1069 c10610 = new C1069(file, j);
        c10610.m2632();
        return c10610;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m2625(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2622(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3874 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f3875.values()).iterator();
            while (it.hasNext()) {
                C1067 c1067 = ((C1068) it.next()).f3864;
                if (c1067 != null) {
                    c1067.m2617();
                }
            }
            m2633();
            m2621(this.f3874);
            this.f3874 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C1067 m2626(String str) {
        synchronized (this) {
            try {
                if (this.f3874 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C1068 c1068 = (C1068) this.f3875.get(str);
                if (c1068 == null) {
                    c1068 = new C1068(this, str);
                    this.f3875.put(str, c1068);
                } else if (c1068.f3864 != null) {
                    return null;
                }
                C1067 c1067 = new C1067(this, c1068);
                c1068.f3864 = c1067;
                this.f3874.append((CharSequence) "DIRTY");
                this.f3874.append(' ');
                this.f3874.append((CharSequence) str);
                this.f3874.append('\n');
                m2623(this.f3874);
                return c1067;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final synchronized C0094 m2627(String str) {
        if (this.f3874 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C1068 c1068 = (C1068) this.f3875.get(str);
        if (c1068 == null) {
            return null;
        }
        if (!c1068.f3863) {
            return null;
        }
        for (File file : c1068.f3861) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f3876++;
        this.f3874.append((CharSequence) "READ");
        this.f3874.append(' ');
        this.f3874.append((CharSequence) str);
        this.f3874.append('\n');
        if (m2628()) {
            this.f3878.submit(this.f3879);
        }
        return new C0094(16, c1068.f3861);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean m2628() {
        int i = this.f3876;
        return i >= 2000 && i >= this.f3875.size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void m2629() throws IOException {
        m2622(this.f3868);
        Iterator it = this.f3875.values().iterator();
        while (it.hasNext()) {
            C1068 c1068 = (C1068) it.next();
            C1067 c1067 = c1068.f3864;
            int i = 1;
            int i2 = 0;
            if (c1067 == null) {
                while (i2 < 1) {
                    this.f3873 += c1068.f3860[i2];
                    0++;
                }
            } else {
                c1068.f3864 = null;
                while (i2 < 1) {
                    m2622(c1068.f3861[i2]);
                    m2622(c1068.f3862[0]);
                    0++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m2630() {
        File file = this.f3867;
        C2832 c2832 = new C2832(new FileInputStream(file), AbstractC3521.f11031);
        try {
            String strM4816 = c2832.m4816();
            String strM4817 = c2832.m4816();
            String strM4818 = c2832.m4816();
            String strM4819 = c2832.m4816();
            String strM48110 = c2832.m4816();
            if (!"libcore.io.DiskLruCache".equals(strM4816) || !"1".equals(strM4817) || !Integer.toString(1).equals(strM4818) || !Integer.toString(1).equals(strM4819) || !"".equals(strM48110)) {
                throw new IOException("unexpected journal header: [" + strM4816 + ", " + strM4817 + ", " + strM4819 + ", " + strM48110 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2631(c2832.m4816());
                    i++;
                } catch (EOFException unused) {
                    this.f3876 = i - this.f3875.size();
                    if (c2832.f9097 == -1) {
                        m2632();
                    } else {
                        this.f3874 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC3521.f11031));
                    }
                    try {
                        c2832.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c2832.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m2631(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f3875;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C1068 c1068 = (C1068) linkedHashMap.get(strSubstring);
        if (c1068 == null) {
            c1068 = new C1068(this, strSubstring);
            linkedHashMap.put(strSubstring, c1068);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c1068.f3864 = new C1067(this, c1068);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c1068.f3863 = true;
        c1068.f3864 = null;
        if (strArrSplit.length != 1) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < 1; i2++) {
            try {
                c1068.f3860[0] = Long.parseLong(strArrSplit[0]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final synchronized void m2632() {
        try {
            BufferedWriter bufferedWriter = this.f3874;
            if (bufferedWriter != null) {
                m2621(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3868), AbstractC3521.f11031));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(1));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(1));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C1068 c1068 : this.f3875.values()) {
                    if (c1068.f3864 != null) {
                        bufferedWriter2.write("DIRTY " + c1068.f3859 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c1068.f3859 + c1068.m2619() + '\n');
                    }
                }
                m2621(bufferedWriter2);
                if (this.f3867.exists()) {
                    m2625(this.f3867, this.f3869, true);
                }
                m2625(this.f3868, this.f3867, false);
                this.f3869.delete();
                this.f3874 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3867, true), AbstractC3521.f11031));
            } catch (Throwable th) {
                m2621(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m2633() {
        while (this.f3873 > this.f3871) {
            String str = (String) ((Map.Entry) this.f3875.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f3874 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C1068 c1068 = (C1068) this.f3875.get(str);
                    if (c1068 != null && c1068.f3864 == null) {
                        for (int i = 0; i < 1; i++) {
                            File file = c1068.f3861[0];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f3873;
                            long[] jArr = c1068.f3860;
                            this.f3873 = j - jArr[0];
                            jArr[0] = 0;
                        }
                        this.f3876++;
                        this.f3874.append((CharSequence) "REMOVE");
                        this.f3874.append(' ');
                        this.f3874.append((CharSequence) str);
                        this.f3874.append('\n');
                        this.f3875.remove(str);
                        if (m2628()) {
                            this.f3878.submit(this.f3879);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
