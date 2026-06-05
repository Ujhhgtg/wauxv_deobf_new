package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0164Ujhhgtgfeyxiexzf extends AbstractC0171Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1349Ujhhgtgfeyxiexzf;

    public C0164Ujhhgtgfeyxiexzf(C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf, int i) {
        this.f1349Ujhhgtgfeyxiexzf = i;
        this.f1358Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
        this.f1356Ujhhgtgfeyxiexzf = -1;
        this.f1357Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.f1372Ujhhgtgfeyxiexzf;
        m1229Ujhhgtgfeyxiexzf();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1349Ujhhgtgfeyxiexzf) {
            case 0:
                m1225Ujhhgtgfeyxiexzf();
                int i = this.f1355Ujhhgtgfeyxiexzf;
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = (C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf;
                if (i >= c0174Ujhhgtgfeyxiexzf.f1370Ujhhgtgfeyxiexzf) {
                    throw new NoSuchElementException();
                }
                this.f1355Ujhhgtgfeyxiexzf = i + 1;
                this.f1356Ujhhgtgfeyxiexzf = i;
                C0172Ujhhgtgfeyxiexzf c0172Ujhhgtgfeyxiexzf = new C0172Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf, i);
                m1229Ujhhgtgfeyxiexzf();
                return c0172Ujhhgtgfeyxiexzf;
            case 1:
                m1225Ujhhgtgfeyxiexzf();
                int i2 = this.f1355Ujhhgtgfeyxiexzf;
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf2 = (C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf;
                if (i2 >= c0174Ujhhgtgfeyxiexzf2.f1370Ujhhgtgfeyxiexzf) {
                    throw new NoSuchElementException();
                }
                this.f1355Ujhhgtgfeyxiexzf = i2 + 1;
                this.f1356Ujhhgtgfeyxiexzf = i2;
                Object obj = c0174Ujhhgtgfeyxiexzf2.f1365Ujhhgtgfeyxiexzf[i2];
                m1229Ujhhgtgfeyxiexzf();
                return obj;
            default:
                m1225Ujhhgtgfeyxiexzf();
                int i3 = this.f1355Ujhhgtgfeyxiexzf;
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf3 = (C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf;
                if (i3 >= c0174Ujhhgtgfeyxiexzf3.f1370Ujhhgtgfeyxiexzf) {
                    throw new NoSuchElementException();
                }
                this.f1355Ujhhgtgfeyxiexzf = i3 + 1;
                this.f1356Ujhhgtgfeyxiexzf = i3;
                Object obj2 = c0174Ujhhgtgfeyxiexzf3.f1366Ujhhgtgfeyxiexzf[i3];
                m1229Ujhhgtgfeyxiexzf();
                return obj2;
        }
    }
}
