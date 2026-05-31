package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1877 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6229 = AtomicReferenceFieldUpdater.newUpdater(C1877.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f6230 = AtomicLongFieldUpdater.newUpdater(C1877.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1174 f6231 = new C1174("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f6232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f6233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f6235;

    public C1877(int i, boolean z) {
        this.f6232 = i;
        this.f6233 = z;
        int i2 = i - 1;
        this.f6234 = i2;
        this.f6235 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m3793(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6230;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (FieldInfo.BACKR_REFERENCE & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f6234;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f6233;
            AtomicReferenceArray atomicReferenceArray = this.f6235;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f6230.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C1877 c1877M3795 = this;
                    while ((atomicLongFieldUpdater.get(c1877M3795) & FieldInfo.DISABLE_JSONB) != 0) {
                        c1877M3795 = c1877M3795.m3795();
                        AtomicReferenceArray atomicReferenceArray2 = c1877M3795.f6235;
                        int i4 = c1877M3795.f6234 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C1876) && ((C1876) obj2).f6228 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c1877M3795 = null;
                        }
                        if (c1877M3795 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f6232;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m3794() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f6230;
            j = atomicLongFieldUpdater.get(this);
            if ((j & FieldInfo.BACKR_REFERENCE) != 0) {
                return true;
            }
            if ((FieldInfo.DISABLE_JSONB & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, FieldInfo.BACKR_REFERENCE | j));
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1877 m3795() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C1877 c1877;
        while (true) {
            atomicLongFieldUpdater = f6230;
            j = atomicLongFieldUpdater.get(this);
            if ((j & FieldInfo.DISABLE_JSONB) != 0) {
                c1877 = this;
                break;
            }
            long j2 = FieldInfo.DISABLE_JSONB | j;
            c1877 = this;
            if (atomicLongFieldUpdater.compareAndSet(c1877, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6229;
            C1877 c1878 = (C1877) atomicReferenceFieldUpdater.get(this);
            if (c1878 != null) {
                return c1878;
            }
            C1877 c1879 = new C1877(c1877.f6232 * 2, c1877.f6233);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c1877.f6234;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c1876 = c1877.f6235.get(i4);
                if (c1876 == null) {
                    c1876 = new C1876(i);
                }
                c1879.f6235.set(c1879.f6234 & i, c1876);
                i++;
            }
            atomicLongFieldUpdater.set(c1879, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1879) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3796() {
        C1877 c1877M3795 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6230;
            long j = atomicLongFieldUpdater.get(c1877M3795);
            if ((j & FieldInfo.DISABLE_JSONB) != 0) {
                return f6231;
            }
            int i = (int) (j & 1073741823);
            int i2 = c1877M3795.f6234;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = c1877M3795.f6235;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = c1877M3795.f6233;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C1876)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f6230.compareAndSet(c1877M3795, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    c1877M3795 = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(c1877M3795);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & FieldInfo.DISABLE_JSONB) != 0) {
                                c1877M3795 = c1877M3795.m3795();
                            } else {
                                C1877 c1877 = c1877M3795;
                                if (f6230.compareAndSet(c1877, j3, (j3 & (-1073741824)) | j2)) {
                                    c1877.f6235.set(i4 & c1877.f6234, null);
                                    c1877M3795 = null;
                                } else {
                                    c1877M3795 = c1877;
                                }
                            }
                            if (c1877M3795 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
