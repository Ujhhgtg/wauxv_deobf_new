package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛴᛲᛱUjhhgtgᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1441feyxiexzfUjhhgtg implements InterfaceC1445feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object[] f5044Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f5045Ujhhgtgfeyxiexzf;

    public C1441feyxiexzfUjhhgtg(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5044Ujhhgtgfeyxiexzf = new Object[i];
    }

    @Override // p000.InterfaceC1445feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public boolean mo2932Ujhhgtgfeyxiexzf(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.f5045Ujhhgtgfeyxiexzf;
        int i2 = 0;
        while (true) {
            objArr = this.f5044Ujhhgtgfeyxiexzf;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f5045Ujhhgtgfeyxiexzf;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f5045Ujhhgtgfeyxiexzf = i3 + 1;
        return true;
    }

    @Override // p000.InterfaceC1445feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public Object mo2933Ujhhgtgfeyxiexzf() {
        int i = this.f5045Ujhhgtgfeyxiexzf;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5044Ujhhgtgfeyxiexzf;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5045Ujhhgtgfeyxiexzf = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m2934Ujhhgtgfeyxiexzf(C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf) {
        int i = this.f5045Ujhhgtgfeyxiexzf;
        Object[] objArr = this.f5044Ujhhgtgfeyxiexzf;
        if (i < objArr.length) {
            objArr[i] = c2394Ujhhgtgfeyxiexzf;
            this.f5045Ujhhgtgfeyxiexzf = i + 1;
        }
    }

    public C1441feyxiexzfUjhhgtg() {
        this.f5044Ujhhgtgfeyxiexzf = new Object[bc.e];
    }
}
