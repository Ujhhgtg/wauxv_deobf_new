package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1991feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6560Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C1991feyxiexzfUjhhgtg.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractRunnableC3349Ujhhgtgfeyxiexzf[] f6561Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3344Ujhhgtgfeyxiexzf(AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf) {
        abstractRunnableC3349Ujhhgtgfeyxiexzf.m4852Ujhhgtgfeyxiexzf((C3352Ujhhgtgfeyxiexzf) this);
        AbstractRunnableC3349Ujhhgtgfeyxiexzf[] abstractRunnableC3349UjhhgtgfeyxiexzfArr = this.f6561Ujhhgtgfeyxiexzf;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6560Ujhhgtgfeyxiexzf;
        if (abstractRunnableC3349UjhhgtgfeyxiexzfArr == null) {
            abstractRunnableC3349UjhhgtgfeyxiexzfArr = new AbstractRunnableC3349Ujhhgtgfeyxiexzf[4];
            this.f6561Ujhhgtgfeyxiexzf = abstractRunnableC3349UjhhgtgfeyxiexzfArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC3349UjhhgtgfeyxiexzfArr.length) {
            abstractRunnableC3349UjhhgtgfeyxiexzfArr = (AbstractRunnableC3349Ujhhgtgfeyxiexzf[]) Arrays.copyOf(abstractRunnableC3349UjhhgtgfeyxiexzfArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f6561Ujhhgtgfeyxiexzf = abstractRunnableC3349UjhhgtgfeyxiexzfArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC3349UjhhgtgfeyxiexzfArr[i] = abstractRunnableC3349Ujhhgtgfeyxiexzf;
        abstractRunnableC3349Ujhhgtgfeyxiexzf.f10462Ujhhgtgfeyxiexzf = i;
        while (i > 0) {
            Object[] objArr = this.f6561Ujhhgtgfeyxiexzf;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            m3346Ujhhgtgfeyxiexzf(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractRunnableC3349Ujhhgtgfeyxiexzf m3345Ujhhgtgfeyxiexzf(int i) {
        Object[] objArr = this.f6561Ujhhgtgfeyxiexzf;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6560Ujhhgtgfeyxiexzf;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m3346Ujhhgtgfeyxiexzf(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.f6561Ujhhgtgfeyxiexzf;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m3346Ujhhgtgfeyxiexzf(i, i5);
                    i = i5;
                }
            } else {
                m3346Ujhhgtgfeyxiexzf(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f6561Ujhhgtgfeyxiexzf;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m3346Ujhhgtgfeyxiexzf(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC3349Ujhhgtgfeyxiexzf.m4852Ujhhgtgfeyxiexzf(null);
        abstractRunnableC3349Ujhhgtgfeyxiexzf.f10462Ujhhgtgfeyxiexzf = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC3349Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3346Ujhhgtgfeyxiexzf(int i, int i2) {
        AbstractRunnableC3349Ujhhgtgfeyxiexzf[] abstractRunnableC3349UjhhgtgfeyxiexzfArr = this.f6561Ujhhgtgfeyxiexzf;
        AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf = abstractRunnableC3349UjhhgtgfeyxiexzfArr[i2];
        AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf2 = abstractRunnableC3349UjhhgtgfeyxiexzfArr[i];
        abstractRunnableC3349UjhhgtgfeyxiexzfArr[i] = abstractRunnableC3349Ujhhgtgfeyxiexzf;
        abstractRunnableC3349UjhhgtgfeyxiexzfArr[i2] = abstractRunnableC3349Ujhhgtgfeyxiexzf2;
        abstractRunnableC3349Ujhhgtgfeyxiexzf.f10462Ujhhgtgfeyxiexzf = i;
        abstractRunnableC3349Ujhhgtgfeyxiexzf2.f10462Ujhhgtgfeyxiexzf = i2;
    }
}
