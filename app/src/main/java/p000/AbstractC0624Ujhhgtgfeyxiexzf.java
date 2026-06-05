package p000;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0624Ujhhgtgfeyxiexzf implements InterfaceC0288Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f2653Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f2654Ujhhgtgfeyxiexzf;

    public AbstractC0624Ujhhgtgfeyxiexzf(boolean z) {
        this.f2653Ujhhgtgfeyxiexzf = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int m1901Ujhhgtgfeyxiexzf(int i, int i2) {
        int iMo1900Ujhhgtgfeyxiexzf = mo1900Ujhhgtgfeyxiexzf(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iMo1900Ujhhgtgfeyxiexzf2 = mo1900Ujhhgtgfeyxiexzf(i5);
            i3 += iMo1900Ujhhgtgfeyxiexzf2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iMo1900Ujhhgtgfeyxiexzf2;
            }
        }
        return i3 + iMo1900Ujhhgtgfeyxiexzf > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public int mo1899Ujhhgtgfeyxiexzf(int i, int i2) {
        int iMo1900Ujhhgtgfeyxiexzf = mo1900Ujhhgtgfeyxiexzf(i);
        if (iMo1900Ujhhgtgfeyxiexzf == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iMo1900Ujhhgtgfeyxiexzf2 = mo1900Ujhhgtgfeyxiexzf(i4);
            i3 += iMo1900Ujhhgtgfeyxiexzf2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iMo1900Ujhhgtgfeyxiexzf2;
            }
        }
        if (iMo1900Ujhhgtgfeyxiexzf + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public abstract int mo1900Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m1902Ujhhgtgfeyxiexzf() {
        ((SparseIntArray) this.f2653Ujhhgtgfeyxiexzf).clear();
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        Context context = (Context) this.f2653Ujhhgtgfeyxiexzf;
        Class cls = (Class) this.f2654Ujhhgtgfeyxiexzf;
        return new C0778feyxiexzfUjhhgtg(context, c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(File.class, cls), c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, cls), cls);
    }

    public AbstractC0624Ujhhgtgfeyxiexzf(Context context, Class cls) {
        this.f2653Ujhhgtgfeyxiexzf = context;
        this.f2654Ujhhgtgfeyxiexzf = cls;
    }

    public AbstractC0624Ujhhgtgfeyxiexzf() {
        this.f2653Ujhhgtgfeyxiexzf = new SparseIntArray();
        this.f2654Ujhhgtgfeyxiexzf = new SparseIntArray();
    }
}
