package p000;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2464feyxiexzfUjhhgtg implements InterfaceC0288Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f7994Ujhhgtgfeyxiexzf;

    public AbstractC2464feyxiexzfUjhhgtg(int i) {
        switch (i) {
            case 1:
                this.f7994Ujhhgtgfeyxiexzf = new LinkedHashMap();
                break;
            default:
                char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
                this.f7994Ujhhgtgfeyxiexzf = new ArrayDeque(20);
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3694Ujhhgtgfeyxiexzf(InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtg) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7994Ujhhgtgfeyxiexzf;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC1436feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        return new C2616feyxiexzfUjhhgtg(2, (C3339feyxiexzfUjhhgtg) this.f7994Ujhhgtgfeyxiexzf);
    }

    public AbstractC2464feyxiexzfUjhhgtg(C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg) {
        this.f7994Ujhhgtgfeyxiexzf = c3339feyxiexzfUjhhgtg;
    }
}
