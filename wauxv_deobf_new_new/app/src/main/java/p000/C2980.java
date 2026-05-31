package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2980 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9543 = AtomicIntegerFieldUpdater.newUpdater(C2980.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractRunnableC1234[] f9544;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4984(AbstractRunnableC1234 abstractRunnableC1234) {
        abstractRunnableC1234.m2989((C1235) this);
        AbstractRunnableC1234[] abstractRunnableC1234Arr = this.f9544;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9543;
        if (abstractRunnableC1234Arr == null) {
            abstractRunnableC1234Arr = new AbstractRunnableC1234[4];
            this.f9544 = abstractRunnableC1234Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1234Arr.length) {
            abstractRunnableC1234Arr = (AbstractRunnableC1234[]) Arrays.copyOf(abstractRunnableC1234Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f9544 = abstractRunnableC1234Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC1234Arr[i] = abstractRunnableC1234;
        abstractRunnableC1234.f4456 = i;
        while (i > 0) {
            Object[] objArr = this.f9544;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            m4986(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractRunnableC1234 m4985(int i) {
        Object[] objArr = this.f9544;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9543;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m4986(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.f9544;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m4986(i, i5);
                    i = i5;
                }
            } else {
                m4986(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f9544;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m4986(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC1234 abstractRunnableC1234 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC1234.m2989(null);
        abstractRunnableC1234.f4456 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC1234;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4986(int i, int i2) {
        AbstractRunnableC1234[] abstractRunnableC1234Arr = this.f9544;
        AbstractRunnableC1234 abstractRunnableC1234 = abstractRunnableC1234Arr[i2];
        AbstractRunnableC1234 abstractRunnableC1235 = abstractRunnableC1234Arr[i];
        abstractRunnableC1234Arr[i] = abstractRunnableC1234;
        abstractRunnableC1234Arr[i2] = abstractRunnableC1235;
        abstractRunnableC1234.f4456 = i;
        abstractRunnableC1235.f4456 = i2;
    }
}
