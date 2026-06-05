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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3189feyxiexzfUjhhgtg implements Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final File f9847Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final File f9848Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final File f9849Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final File f9850Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final long f9852Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public BufferedWriter f9855Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f9857Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public long f9854Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final LinkedHashMap f9856Ujhhgtgfeyxiexzf = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public long f9858Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ThreadPoolExecutor f9859Ujhhgtgfeyxiexzf = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3188feyxiexzfUjhhgtg());

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final CallableC3192feyxiexzfUjhhgtg f9860Ujhhgtgfeyxiexzf = new CallableC3192feyxiexzfUjhhgtg(this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f9851Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f9853Ujhhgtgfeyxiexzf = 1;

    public C3189feyxiexzfUjhhgtg(File file, long j) {
        this.f9847Ujhhgtgfeyxiexzf = file;
        this.f9848Ujhhgtgfeyxiexzf = new File(file, "journal");
        this.f9849Ujhhgtgfeyxiexzf = new File(file, "journal.tmp");
        this.f9850Ujhhgtgfeyxiexzf = new File(file, "journal.bkp");
        this.f9852Ujhhgtgfeyxiexzf = j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4682Ujhhgtgfeyxiexzf(C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg, C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg, boolean z) {
        synchronized (c3189feyxiexzfUjhhgtg) {
            C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtg.f9844Ujhhgtgfeyxiexzf;
            if (c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf != c3187feyxiexzfUjhhgtg) {
                throw new IllegalStateException();
            }
            if (z && !c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf) {
                for (int i = 0; i < c3189feyxiexzfUjhhgtg.f9853Ujhhgtgfeyxiexzf; i++) {
                    if (!((boolean[]) c3187feyxiexzfUjhhgtg.f9845Ujhhgtgfeyxiexzf)[i]) {
                        c3187feyxiexzfUjhhgtg.m4680Ujhhgtgfeyxiexzf();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c3190feyxiexzfUjhhgtg.f9864Ujhhgtgfeyxiexzf[i].exists()) {
                        c3187feyxiexzfUjhhgtg.m4680Ujhhgtgfeyxiexzf();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c3189feyxiexzfUjhhgtg.f9853Ujhhgtgfeyxiexzf; i2++) {
                File file = c3190feyxiexzfUjhhgtg.f9864Ujhhgtgfeyxiexzf[i2];
                if (!z) {
                    m4684Ujhhgtgfeyxiexzf(file);
                } else if (file.exists()) {
                    File file2 = c3190feyxiexzfUjhhgtg.f9863Ujhhgtgfeyxiexzf[i2];
                    file.renameTo(file2);
                    long j = c3190feyxiexzfUjhhgtg.f9862Ujhhgtgfeyxiexzf[i2];
                    long length = file2.length();
                    c3190feyxiexzfUjhhgtg.f9862Ujhhgtgfeyxiexzf[i2] = length;
                    c3189feyxiexzfUjhhgtg.f9854Ujhhgtgfeyxiexzf = (c3189feyxiexzfUjhhgtg.f9854Ujhhgtgfeyxiexzf - j) + length;
                }
            }
            c3189feyxiexzfUjhhgtg.f9857Ujhhgtgfeyxiexzf++;
            c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf = null;
            if (c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf || z) {
                c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf = true;
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append((CharSequence) "CLEAN");
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append(' ');
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append((CharSequence) c3190feyxiexzfUjhhgtg.f9861Ujhhgtgfeyxiexzf);
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append((CharSequence) c3190feyxiexzfUjhhgtg.m4696Ujhhgtgfeyxiexzf());
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append('\n');
                if (z) {
                    c3189feyxiexzfUjhhgtg.f9858Ujhhgtgfeyxiexzf++;
                }
            } else {
                c3189feyxiexzfUjhhgtg.f9856Ujhhgtgfeyxiexzf.remove(c3190feyxiexzfUjhhgtg.f9861Ujhhgtgfeyxiexzf);
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append((CharSequence) "REMOVE");
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append(' ');
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append((CharSequence) c3190feyxiexzfUjhhgtg.f9861Ujhhgtgfeyxiexzf);
                c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf.append('\n');
            }
            m4685Ujhhgtgfeyxiexzf(c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf);
            if (c3189feyxiexzfUjhhgtg.f9854Ujhhgtgfeyxiexzf > c3189feyxiexzfUjhhgtg.f9852Ujhhgtgfeyxiexzf || c3189feyxiexzfUjhhgtg.m4690Ujhhgtgfeyxiexzf()) {
                c3189feyxiexzfUjhhgtg.f9859Ujhhgtgfeyxiexzf.submit(c3189feyxiexzfUjhhgtg.f9860Ujhhgtgfeyxiexzf);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m4683Ujhhgtgfeyxiexzf(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static void m4684Ujhhgtgfeyxiexzf(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static void m4685Ujhhgtgfeyxiexzf(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3189feyxiexzfUjhhgtg m4686feyxiexzfUjhhgtg(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m4687feyxiexzfUjhhgtg(file2, file3, false);
            }
        }
        C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg = new C3189feyxiexzfUjhhgtg(file, j);
        if (c3189feyxiexzfUjhhgtg.f9848Ujhhgtgfeyxiexzf.exists()) {
            try {
                c3189feyxiexzfUjhhgtg.m4692feyxiexzfUjhhgtg();
                c3189feyxiexzfUjhhgtg.m4691feyxiexzfUjhhgtg();
                return c3189feyxiexzfUjhhgtg;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c3189feyxiexzfUjhhgtg.close();
                AbstractC1861Ujhhgtgfeyxiexzf.m3201Ujhhgtgfeyxiexzf(c3189feyxiexzfUjhhgtg.f9847Ujhhgtgfeyxiexzf);
            }
        }
        file.mkdirs();
        C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg2 = new C3189feyxiexzfUjhhgtg(file, j);
        c3189feyxiexzfUjhhgtg2.m4694feyxiexzfUjhhgtg();
        return c3189feyxiexzfUjhhgtg2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m4687feyxiexzfUjhhgtg(File file, File file2, boolean z) throws IOException {
        if (z) {
            m4684Ujhhgtgfeyxiexzf(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f9855Ujhhgtgfeyxiexzf == null) {
                return;
            }
            Iterator it = new ArrayList(this.f9856Ujhhgtgfeyxiexzf.values()).iterator();
            while (it.hasNext()) {
                C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg = ((C3190feyxiexzfUjhhgtg) it.next()).f9866Ujhhgtgfeyxiexzf;
                if (c3187feyxiexzfUjhhgtg != null) {
                    c3187feyxiexzfUjhhgtg.m4680Ujhhgtgfeyxiexzf();
                }
            }
            m4695feyxiexzfUjhhgtg();
            m4683Ujhhgtgfeyxiexzf(this.f9855Ujhhgtgfeyxiexzf);
            this.f9855Ujhhgtgfeyxiexzf = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C3187feyxiexzfUjhhgtg m4688Ujhhgtgfeyxiexzf(String str) {
        synchronized (this) {
            try {
                if (this.f9855Ujhhgtgfeyxiexzf == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) this.f9856Ujhhgtgfeyxiexzf.get(str);
                if (c3190feyxiexzfUjhhgtg == null) {
                    c3190feyxiexzfUjhhgtg = new C3190feyxiexzfUjhhgtg(this, str);
                    this.f9856Ujhhgtgfeyxiexzf.put(str, c3190feyxiexzfUjhhgtg);
                } else if (c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf != null) {
                    return null;
                }
                C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg = new C3187feyxiexzfUjhhgtg(this, c3190feyxiexzfUjhhgtg);
                c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf = c3187feyxiexzfUjhhgtg;
                this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) "DIRTY");
                this.f9855Ujhhgtgfeyxiexzf.append(' ');
                this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) str);
                this.f9855Ujhhgtgfeyxiexzf.append('\n');
                m4685Ujhhgtgfeyxiexzf(this.f9855Ujhhgtgfeyxiexzf);
                return c3187feyxiexzfUjhhgtg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final synchronized C2965Ujhhgtgfeyxiexzf m4689Ujhhgtgfeyxiexzf(String str) {
        if (this.f9855Ujhhgtgfeyxiexzf == null) {
            throw new IllegalStateException("cache is closed");
        }
        C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) this.f9856Ujhhgtgfeyxiexzf.get(str);
        if (c3190feyxiexzfUjhhgtg == null) {
            return null;
        }
        if (!c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf) {
            return null;
        }
        for (File file : c3190feyxiexzfUjhhgtg.f9863Ujhhgtgfeyxiexzf) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f9857Ujhhgtgfeyxiexzf++;
        this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) "READ");
        this.f9855Ujhhgtgfeyxiexzf.append(' ');
        this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) str);
        this.f9855Ujhhgtgfeyxiexzf.append('\n');
        if (m4690Ujhhgtgfeyxiexzf()) {
            this.f9859Ujhhgtgfeyxiexzf.submit(this.f9860Ujhhgtgfeyxiexzf);
        }
        return new C2965Ujhhgtgfeyxiexzf(17, c3190feyxiexzfUjhhgtg.f9863Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m4690Ujhhgtgfeyxiexzf() {
        int i = this.f9857Ujhhgtgfeyxiexzf;
        return i >= 2000 && i >= this.f9856Ujhhgtgfeyxiexzf.size();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4691feyxiexzfUjhhgtg() throws IOException {
        m4684Ujhhgtgfeyxiexzf(this.f9849Ujhhgtgfeyxiexzf);
        Iterator it = this.f9856Ujhhgtgfeyxiexzf.values().iterator();
        while (it.hasNext()) {
            C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) it.next();
            C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg = c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf;
            int i = this.f9853Ujhhgtgfeyxiexzf;
            int i2 = 0;
            if (c3187feyxiexzfUjhhgtg == null) {
                while (i2 < i) {
                    this.f9854Ujhhgtgfeyxiexzf += c3190feyxiexzfUjhhgtg.f9862Ujhhgtgfeyxiexzf[i2];
                    i2++;
                }
            } else {
                c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf = null;
                while (i2 < i) {
                    m4684Ujhhgtgfeyxiexzf(c3190feyxiexzfUjhhgtg.f9863Ujhhgtgfeyxiexzf[i2]);
                    m4684Ujhhgtgfeyxiexzf(c3190feyxiexzfUjhhgtg.f9864Ujhhgtgfeyxiexzf[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4692feyxiexzfUjhhgtg() {
        File file = this.f9848Ujhhgtgfeyxiexzf;
        C1148feyxiexzfUjhhgtg c1148feyxiexzfUjhhgtg = new C1148feyxiexzfUjhhgtg(new FileInputStream(file), AbstractC1861Ujhhgtgfeyxiexzf.f6242Ujhhgtgfeyxiexzf);
        try {
            String strM2614Ujhhgtgfeyxiexzf = c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf();
            String strM2614Ujhhgtgfeyxiexzf2 = c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf();
            String strM2614Ujhhgtgfeyxiexzf3 = c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf();
            String strM2614Ujhhgtgfeyxiexzf4 = c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf();
            String strM2614Ujhhgtgfeyxiexzf5 = c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf();
            if (!"libcore.io.DiskLruCache".equals(strM2614Ujhhgtgfeyxiexzf) || !SdkVersion.MINI_VERSION.equals(strM2614Ujhhgtgfeyxiexzf2) || !Integer.toString(this.f9851Ujhhgtgfeyxiexzf).equals(strM2614Ujhhgtgfeyxiexzf3) || !Integer.toString(this.f9853Ujhhgtgfeyxiexzf).equals(strM2614Ujhhgtgfeyxiexzf4) || !"".equals(strM2614Ujhhgtgfeyxiexzf5)) {
                throw new IOException("unexpected journal header: [" + strM2614Ujhhgtgfeyxiexzf + ", " + strM2614Ujhhgtgfeyxiexzf2 + ", " + strM2614Ujhhgtgfeyxiexzf4 + ", " + strM2614Ujhhgtgfeyxiexzf5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m4693feyxiexzfUjhhgtg(c1148feyxiexzfUjhhgtg.m2614Ujhhgtgfeyxiexzf());
                    i++;
                } catch (EOFException unused) {
                    this.f9857Ujhhgtgfeyxiexzf = i - this.f9856Ujhhgtgfeyxiexzf.size();
                    if (c1148feyxiexzfUjhhgtg.f4343Ujhhgtgfeyxiexzf == -1) {
                        m4694feyxiexzfUjhhgtg();
                    } else {
                        this.f9855Ujhhgtgfeyxiexzf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC1861Ujhhgtgfeyxiexzf.f6242Ujhhgtgfeyxiexzf));
                    }
                    try {
                        c1148feyxiexzfUjhhgtg.close();
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
                c1148feyxiexzfUjhhgtg.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4693feyxiexzfUjhhgtg(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f9856Ujhhgtgfeyxiexzf;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) linkedHashMap.get(strSubstring);
        if (c3190feyxiexzfUjhhgtg == null) {
            c3190feyxiexzfUjhhgtg = new C3190feyxiexzfUjhhgtg(this, strSubstring);
            linkedHashMap.put(strSubstring, c3190feyxiexzfUjhhgtg);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf = new C3187feyxiexzfUjhhgtg(this, c3190feyxiexzfUjhhgtg);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c3190feyxiexzfUjhhgtg.f9865Ujhhgtgfeyxiexzf = true;
        c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf = null;
        if (strArrSplit.length != c3190feyxiexzfUjhhgtg.f9867Ujhhgtgfeyxiexzf.f9853Ujhhgtgfeyxiexzf) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c3190feyxiexzfUjhhgtg.f9862Ujhhgtgfeyxiexzf[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final synchronized void m4694feyxiexzfUjhhgtg() {
        try {
            BufferedWriter bufferedWriter = this.f9855Ujhhgtgfeyxiexzf;
            if (bufferedWriter != null) {
                m4683Ujhhgtgfeyxiexzf(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9849Ujhhgtgfeyxiexzf), AbstractC1861Ujhhgtgfeyxiexzf.f6242Ujhhgtgfeyxiexzf));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(SdkVersion.MINI_VERSION);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9851Ujhhgtgfeyxiexzf));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9853Ujhhgtgfeyxiexzf));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg : this.f9856Ujhhgtgfeyxiexzf.values()) {
                    if (c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf != null) {
                        bufferedWriter2.write("DIRTY " + c3190feyxiexzfUjhhgtg.f9861Ujhhgtgfeyxiexzf + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c3190feyxiexzfUjhhgtg.f9861Ujhhgtgfeyxiexzf + c3190feyxiexzfUjhhgtg.m4696Ujhhgtgfeyxiexzf() + '\n');
                    }
                }
                m4683Ujhhgtgfeyxiexzf(bufferedWriter2);
                if (this.f9848Ujhhgtgfeyxiexzf.exists()) {
                    m4687feyxiexzfUjhhgtg(this.f9848Ujhhgtgfeyxiexzf, this.f9850Ujhhgtgfeyxiexzf, true);
                }
                m4687feyxiexzfUjhhgtg(this.f9849Ujhhgtgfeyxiexzf, this.f9848Ujhhgtgfeyxiexzf, false);
                this.f9850Ujhhgtgfeyxiexzf.delete();
                this.f9855Ujhhgtgfeyxiexzf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9848Ujhhgtgfeyxiexzf, true), AbstractC1861Ujhhgtgfeyxiexzf.f6242Ujhhgtgfeyxiexzf));
            } catch (Throwable th) {
                m4683Ujhhgtgfeyxiexzf(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m4695feyxiexzfUjhhgtg() {
        while (this.f9854Ujhhgtgfeyxiexzf > this.f9852Ujhhgtgfeyxiexzf) {
            String str = (String) ((Map.Entry) this.f9856Ujhhgtgfeyxiexzf.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f9855Ujhhgtgfeyxiexzf == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C3190feyxiexzfUjhhgtg c3190feyxiexzfUjhhgtg = (C3190feyxiexzfUjhhgtg) this.f9856Ujhhgtgfeyxiexzf.get(str);
                    if (c3190feyxiexzfUjhhgtg != null && c3190feyxiexzfUjhhgtg.f9866Ujhhgtgfeyxiexzf == null) {
                        for (int i = 0; i < this.f9853Ujhhgtgfeyxiexzf; i++) {
                            File file = c3190feyxiexzfUjhhgtg.f9863Ujhhgtgfeyxiexzf[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f9854Ujhhgtgfeyxiexzf;
                            long[] jArr = c3190feyxiexzfUjhhgtg.f9862Ujhhgtgfeyxiexzf;
                            this.f9854Ujhhgtgfeyxiexzf = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f9857Ujhhgtgfeyxiexzf++;
                        this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) "REMOVE");
                        this.f9855Ujhhgtgfeyxiexzf.append(' ');
                        this.f9855Ujhhgtgfeyxiexzf.append((CharSequence) str);
                        this.f9855Ujhhgtgfeyxiexzf.append('\n');
                        this.f9856Ujhhgtgfeyxiexzf.remove(str);
                        if (m4690Ujhhgtgfeyxiexzf()) {
                            this.f9859Ujhhgtgfeyxiexzf.submit(this.f9860Ujhhgtgfeyxiexzf);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
