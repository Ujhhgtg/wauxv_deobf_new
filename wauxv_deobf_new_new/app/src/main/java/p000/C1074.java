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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1074 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final File f3877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final File f3878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final File f3879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final File f3880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final long f3882;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public BufferedWriter f3885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f3887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public long f3884 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final LinkedHashMap f3886 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public long f3888 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final ThreadPoolExecutor f3889 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1071());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final CallableC1070 f3890 = new CallableC1070(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f3881 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f3883 = 1;

    public C1074(File file, long j) {
        this.f3877 = file;
        this.f3878 = new File(file, "journal");
        this.f3879 = new File(file, "journal.tmp");
        this.f3880 = new File(file, "journal.bkp");
        this.f3882 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2746(C1074 c1074, C1072 c1072, boolean z) {
        synchronized (c1074) {
            C1073 c1073 = (C1073) c1072.f3867;
            if (c1073.f3875 != c1072) {
                throw new IllegalStateException();
            }
            if (z && !c1073.f3874) {
                for (int i = 0; i < c1074.f3883; i++) {
                    if (!((boolean[]) c1072.f3868)[i]) {
                        c1072.m2743();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c1073.f3873[i].exists()) {
                        c1072.m2743();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c1074.f3883; i2++) {
                File file = c1073.f3873[i2];
                if (!z) {
                    m2748(file);
                } else if (file.exists()) {
                    File file2 = c1073.f3872[i2];
                    file.renameTo(file2);
                    long j = c1073.f3871[i2];
                    long length = file2.length();
                    c1073.f3871[i2] = length;
                    c1074.f3884 = (c1074.f3884 - j) + length;
                }
            }
            c1074.f3887++;
            c1073.f3875 = null;
            if (c1073.f3874 || z) {
                c1073.f3874 = true;
                c1074.f3885.append((CharSequence) "CLEAN");
                c1074.f3885.append(' ');
                c1074.f3885.append((CharSequence) c1073.f3870);
                c1074.f3885.append((CharSequence) c1073.m2745());
                c1074.f3885.append('\n');
                if (z) {
                    c1074.f3888++;
                }
            } else {
                c1074.f3886.remove(c1073.f3870);
                c1074.f3885.append((CharSequence) "REMOVE");
                c1074.f3885.append(' ');
                c1074.f3885.append((CharSequence) c1073.f3870);
                c1074.f3885.append('\n');
            }
            m2749(c1074.f3885);
            if (c1074.f3884 > c1074.f3882 || c1074.m2754()) {
                c1074.f3889.submit(c1074.f3890);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m2747(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static void m2748(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static void m2749(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static C1074 m2750(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2751(file2, file3, false);
            }
        }
        C1074 c1074 = new C1074(file, j);
        if (c1074.f3878.exists()) {
            try {
                c1074.m2756();
                c1074.m2755();
                return c1074;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c1074.close();
                AbstractC3579.m5115(c1074.f3877);
            }
        }
        file.mkdirs();
        C1074 c1075 = new C1074(file, j);
        c1075.m2758();
        return c1075;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m2751(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2748(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3885 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f3886.values()).iterator();
            while (it.hasNext()) {
                C1072 c1072 = ((C1073) it.next()).f3875;
                if (c1072 != null) {
                    c1072.m2743();
                }
            }
            m2759();
            m2747(this.f3885);
            this.f3885 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C1072 m2752(String str) {
        synchronized (this) {
            try {
                if (this.f3885 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C1073 c1073 = (C1073) this.f3886.get(str);
                if (c1073 == null) {
                    c1073 = new C1073(this, str);
                    this.f3886.put(str, c1073);
                } else if (c1073.f3875 != null) {
                    return null;
                }
                C1072 c1072 = new C1072(this, c1073);
                c1073.f3875 = c1072;
                this.f3885.append((CharSequence) "DIRTY");
                this.f3885.append(' ');
                this.f3885.append((CharSequence) str);
                this.f3885.append('\n');
                m2749(this.f3885);
                return c1072;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final synchronized C0102 m2753(String str) {
        if (this.f3885 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C1073 c1073 = (C1073) this.f3886.get(str);
        if (c1073 == null) {
            return null;
        }
        if (!c1073.f3874) {
            return null;
        }
        for (File file : c1073.f3872) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f3887++;
        this.f3885.append((CharSequence) "READ");
        this.f3885.append(' ');
        this.f3885.append((CharSequence) str);
        this.f3885.append('\n');
        if (m2754()) {
            this.f3889.submit(this.f3890);
        }
        return new C0102(c1073.f3872, 17);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean m2754() {
        int i = this.f3887;
        return i >= 2000 && i >= this.f3886.size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void m2755() throws IOException {
        m2748(this.f3879);
        Iterator it = this.f3886.values().iterator();
        while (it.hasNext()) {
            C1073 c1073 = (C1073) it.next();
            C1072 c1072 = c1073.f3875;
            int i = this.f3883;
            int i2 = 0;
            if (c1072 == null) {
                while (i2 < i) {
                    this.f3884 += c1073.f3871[i2];
                    i2++;
                }
            } else {
                c1073.f3875 = null;
                while (i2 < i) {
                    m2748(c1073.f3872[i2]);
                    m2748(c1073.f3873[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m2756() {
        File file = this.f3878;
        C2892 c2892 = new C2892(new FileInputStream(file), AbstractC3579.f11184);
        try {
            String strM4849 = c2892.m4849();
            String strM48410 = c2892.m4849();
            String strM48411 = c2892.m4849();
            String strM48412 = c2892.m4849();
            String strM48413 = c2892.m4849();
            if (!"libcore.io.DiskLruCache".equals(strM4849) || !SdkVersion.MINI_VERSION.equals(strM48410) || !Integer.toString(this.f3881).equals(strM48411) || !Integer.toString(this.f3883).equals(strM48412) || !"".equals(strM48413)) {
                throw new IOException("unexpected journal header: [" + strM4849 + ", " + strM48410 + ", " + strM48412 + ", " + strM48413 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2757(c2892.m4849());
                    i++;
                } catch (EOFException unused) {
                    this.f3887 = i - this.f3886.size();
                    if (c2892.f9259 == -1) {
                        m2758();
                    } else {
                        this.f3885 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC3579.f11184));
                    }
                    try {
                        c2892.close();
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
                c2892.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m2757(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f3886;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C1073 c1073 = (C1073) linkedHashMap.get(strSubstring);
        if (c1073 == null) {
            c1073 = new C1073(this, strSubstring);
            linkedHashMap.put(strSubstring, c1073);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c1073.f3875 = new C1072(this, c1073);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c1073.f3874 = true;
        c1073.f3875 = null;
        if (strArrSplit.length != c1073.f3876.f3883) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c1073.f3871[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final synchronized void m2758() {
        try {
            BufferedWriter bufferedWriter = this.f3885;
            if (bufferedWriter != null) {
                m2747(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3879), AbstractC3579.f11184));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(SdkVersion.MINI_VERSION);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3881));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3883));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C1073 c1073 : this.f3886.values()) {
                    if (c1073.f3875 != null) {
                        bufferedWriter2.write("DIRTY " + c1073.f3870 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c1073.f3870 + c1073.m2745() + '\n');
                    }
                }
                m2747(bufferedWriter2);
                if (this.f3878.exists()) {
                    m2751(this.f3878, this.f3880, true);
                }
                m2751(this.f3879, this.f3878, false);
                this.f3880.delete();
                this.f3885 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3878, true), AbstractC3579.f11184));
            } catch (Throwable th) {
                m2747(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m2759() {
        while (this.f3884 > this.f3882) {
            String str = (String) ((Map.Entry) this.f3886.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f3885 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C1073 c1073 = (C1073) this.f3886.get(str);
                    if (c1073 != null && c1073.f3875 == null) {
                        for (int i = 0; i < this.f3883; i++) {
                            File file = c1073.f3872[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f3884;
                            long[] jArr = c1073.f3871;
                            this.f3884 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f3887++;
                        this.f3885.append((CharSequence) "REMOVE");
                        this.f3885.append(' ');
                        this.f3885.append((CharSequence) str);
                        this.f3885.append('\n');
                        this.f3886.remove(str);
                        if (m2754()) {
                            this.f3889.submit(this.f3890);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
