package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2921 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f9376 = AtomicIntegerFieldUpdater.newUpdater(C2921.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    public AbstractRunnableC1232[] f9377;

    public final void m4922(AbstractRunnableC1232 abstractRunnableC1232) {
        abstractRunnableC1232.m2867((C1233) this);
        AbstractRunnableC1232[] abstractRunnableC1232Arr = this.f9377;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9376;
        if (abstractRunnableC1232Arr == null) {
            abstractRunnableC1232Arr = new AbstractRunnableC1232[4];
            this.f9377 = abstractRunnableC1232Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1232Arr.length) {
            abstractRunnableC1232Arr = (AbstractRunnableC1232[]) Arrays.copyOf(abstractRunnableC1232Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f9377 = abstractRunnableC1232Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC1232Arr[i] = abstractRunnableC1232;
        abstractRunnableC1232.f4458 = i;
        while (i > 0) {
            Object[] objArr = this.f9377;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            m4924(i, i2);
            i = i2;
        }
    }

    public final AbstractRunnableC1232 m4923(int i) {
        Object[] objArr = this.f9377;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9376;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m4924(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.f9377;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m4924(i, i5);
                    i = i5;
                }
            } else {
                m4924(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f9377;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m4924(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC1232 abstractRunnableC1232 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC1232.m2867(null);
        abstractRunnableC1232.f4458 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC1232;
    }

    public final void m4924(int i, int i2) {
        AbstractRunnableC1232[] abstractRunnableC1232Arr = this.f9377;
        AbstractRunnableC1232 abstractRunnableC1232 = abstractRunnableC1232Arr[i2];
        AbstractRunnableC1232 abstractRunnableC1233 = abstractRunnableC1232Arr[i];
        abstractRunnableC1232Arr[i] = abstractRunnableC1232;
        abstractRunnableC1232Arr[i2] = abstractRunnableC1233;
        abstractRunnableC1232.f4458 = i;
        abstractRunnableC1233.f4458 = i2;
    }
}
