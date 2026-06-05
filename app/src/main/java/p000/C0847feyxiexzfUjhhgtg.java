package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0847feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f3336Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f3337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f3338Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final long f3339Ujhhgtgfeyxiexzf;

    public C0847feyxiexzfUjhhgtg(int i, int i2, long j, long j2) {
        this.f3336Ujhhgtgfeyxiexzf = i;
        this.f3337Ujhhgtgfeyxiexzf = i2;
        this.f3338Ujhhgtgfeyxiexzf = j;
        this.f3339Ujhhgtgfeyxiexzf = j2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0847feyxiexzfUjhhgtg m2256Ujhhgtgfeyxiexzf(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0847feyxiexzfUjhhgtg c0847feyxiexzfUjhhgtg = new C0847feyxiexzfUjhhgtg(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0847feyxiexzfUjhhgtg;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0847feyxiexzfUjhhgtg)) {
            C0847feyxiexzfUjhhgtg c0847feyxiexzfUjhhgtg = (C0847feyxiexzfUjhhgtg) obj;
            if (this.f3337Ujhhgtgfeyxiexzf == c0847feyxiexzfUjhhgtg.f3337Ujhhgtgfeyxiexzf && this.f3338Ujhhgtgfeyxiexzf == c0847feyxiexzfUjhhgtg.f3338Ujhhgtgfeyxiexzf && this.f3336Ujhhgtgfeyxiexzf == c0847feyxiexzfUjhhgtg.f3336Ujhhgtgfeyxiexzf && this.f3339Ujhhgtgfeyxiexzf == c0847feyxiexzfUjhhgtg.f3339Ujhhgtgfeyxiexzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3337Ujhhgtgfeyxiexzf), Long.valueOf(this.f3338Ujhhgtgfeyxiexzf), Integer.valueOf(this.f3336Ujhhgtgfeyxiexzf), Long.valueOf(this.f3339Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2257Ujhhgtgfeyxiexzf(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3336Ujhhgtgfeyxiexzf);
            dataOutputStream.writeInt(this.f3337Ujhhgtgfeyxiexzf);
            dataOutputStream.writeLong(this.f3338Ujhhgtgfeyxiexzf);
            dataOutputStream.writeLong(this.f3339Ujhhgtgfeyxiexzf);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
