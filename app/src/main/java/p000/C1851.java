package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᤝᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1851 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6155 = AtomicReferenceFieldUpdater.newUpdater(C1851.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f6156 = AtomicLongFieldUpdater.newUpdater(C1851.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1172 f6157 = new C1172("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f6158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f6159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f6161;

    public C1851(int i, boolean z) {
        this.f6158 = i;
        this.f6159 = z;
        int i2 = i - 1;
        this.f6160 = i2;
        this.f6161 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m3615(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6156;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f6160;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f6159;
            AtomicReferenceArray atomicReferenceArray = this.f6161;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f6156.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C1851 c1851M3617 = this;
                    while ((atomicLongFieldUpdater.get(c1851M3617) & 1152921504606846976L) != 0) {
                        c1851M3617 = c1851M3617.m3617();
                        AtomicReferenceArray atomicReferenceArray2 = c1851M3617.f6161;
                        int i4 = c1851M3617.f6160 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C1850) && ((C1850) obj2).f6154 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c1851M3617 = null;
                        }
                        if (c1851M3617 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f6158;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m3616() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f6156;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1851 m3617() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C1851 c1851;
        while (true) {
            atomicLongFieldUpdater = f6156;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c1851 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c1851 = this;
            if (atomicLongFieldUpdater.compareAndSet(c1851, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6155;
            C1851 c1852 = (C1851) atomicReferenceFieldUpdater.get(this);
            if (c1852 != null) {
                return c1852;
            }
            C1851 c1853 = new C1851(c1851.f6158 * 2, c1851.f6159);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c1851.f6160;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c1850 = c1851.f6161.get(i4);
                if (c1850 == null) {
                    c1850 = new C1850(i);
                }
                c1853.f6161.set(c1853.f6160 & i, c1850);
                i++;
            }
            atomicLongFieldUpdater.set(c1853, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1853) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3618() {
        C1851 c1851M3617 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6156;
            long j = atomicLongFieldUpdater.get(c1851M3617);
            if ((j & 1152921504606846976L) != 0) {
                return f6157;
            }
            int i = (int) (j & 1073741823);
            int i2 = c1851M3617.f6160;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = c1851M3617.f6161;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = c1851M3617.f6159;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C1850)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f6156.compareAndSet(c1851M3617, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    c1851M3617 = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(c1851M3617);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c1851M3617 = c1851M3617.m3617();
                            } else {
                                C1851 c1851 = c1851M3617;
                                if (f6156.compareAndSet(c1851, j3, (j3 & (-1073741824)) | j2)) {
                                    c1851.f6161.set(i4 & c1851.f6160, null);
                                    c1851M3617 = null;
                                } else {
                                    c1851M3617 = c1851;
                                }
                            }
                            if (c1851M3617 == null) {
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
