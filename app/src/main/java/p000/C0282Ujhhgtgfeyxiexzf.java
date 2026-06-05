package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸能不能ᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0282Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1704Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0282Ujhhgtgfeyxiexzf.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f1705Ujhhgtgfeyxiexzf = AtomicLongFieldUpdater.newUpdater(C0282Ujhhgtgfeyxiexzf.class, "_state$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f1706Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f1707Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean f1708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f1709Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f1710Ujhhgtgfeyxiexzf;

    public C0282Ujhhgtgfeyxiexzf(int i, boolean z) {
        this.f1707Ujhhgtgfeyxiexzf = i;
        this.f1708Ujhhgtgfeyxiexzf = z;
        int i2 = i - 1;
        this.f1709Ujhhgtgfeyxiexzf = i2;
        this.f1710Ujhhgtgfeyxiexzf = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m1493Ujhhgtgfeyxiexzf(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1705Ujhhgtgfeyxiexzf;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (FieldInfo.BACKR_REFERENCE & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f1709Ujhhgtgfeyxiexzf;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f1708Ujhhgtgfeyxiexzf;
            AtomicReferenceArray atomicReferenceArray = this.f1710Ujhhgtgfeyxiexzf;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f1705Ujhhgtgfeyxiexzf.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C0282Ujhhgtgfeyxiexzf c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = this;
                    while ((atomicLongFieldUpdater.get(c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf) & FieldInfo.DISABLE_JSONB) != 0) {
                        c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.m1495Ujhhgtgfeyxiexzf();
                        AtomicReferenceArray atomicReferenceArray2 = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.f1710Ujhhgtgfeyxiexzf;
                        int i4 = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.f1709Ujhhgtgfeyxiexzf & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C0281Ujhhgtgfeyxiexzf) && ((C0281Ujhhgtgfeyxiexzf) obj2).f1703Ujhhgtgfeyxiexzf == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = null;
                        }
                        if (c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f1707Ujhhgtgfeyxiexzf;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m1494Ujhhgtgfeyxiexzf() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f1705Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0282Ujhhgtgfeyxiexzf m1495Ujhhgtgfeyxiexzf() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf;
        while (true) {
            atomicLongFieldUpdater = f1705Ujhhgtgfeyxiexzf;
            j = atomicLongFieldUpdater.get(this);
            if ((j & FieldInfo.DISABLE_JSONB) != 0) {
                c0282Ujhhgtgfeyxiexzf = this;
                break;
            }
            long j2 = FieldInfo.DISABLE_JSONB | j;
            c0282Ujhhgtgfeyxiexzf = this;
            if (atomicLongFieldUpdater.compareAndSet(c0282Ujhhgtgfeyxiexzf, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1704Ujhhgtgfeyxiexzf;
            C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf2 = (C0282Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(this);
            if (c0282Ujhhgtgfeyxiexzf2 != null) {
                return c0282Ujhhgtgfeyxiexzf2;
            }
            C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf3 = new C0282Ujhhgtgfeyxiexzf(c0282Ujhhgtgfeyxiexzf.f1707Ujhhgtgfeyxiexzf * 2, c0282Ujhhgtgfeyxiexzf.f1708Ujhhgtgfeyxiexzf);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c0282Ujhhgtgfeyxiexzf.f1709Ujhhgtgfeyxiexzf;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c0281Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.f1710Ujhhgtgfeyxiexzf.get(i4);
                if (c0281Ujhhgtgfeyxiexzf == null) {
                    c0281Ujhhgtgfeyxiexzf = new C0281Ujhhgtgfeyxiexzf(i);
                }
                c0282Ujhhgtgfeyxiexzf3.f1710Ujhhgtgfeyxiexzf.set(c0282Ujhhgtgfeyxiexzf3.f1709Ujhhgtgfeyxiexzf & i, c0281Ujhhgtgfeyxiexzf);
                i++;
            }
            atomicLongFieldUpdater.set(c0282Ujhhgtgfeyxiexzf3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0282Ujhhgtgfeyxiexzf3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object m1496Ujhhgtgfeyxiexzf() {
        C0282Ujhhgtgfeyxiexzf c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1705Ujhhgtgfeyxiexzf;
            long j = atomicLongFieldUpdater.get(c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf);
            if ((j & FieldInfo.DISABLE_JSONB) != 0) {
                return f1706Ujhhgtgfeyxiexzf;
            }
            int i = (int) (j & 1073741823);
            int i2 = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.f1709Ujhhgtgfeyxiexzf;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.f1710Ujhhgtgfeyxiexzf;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.f1708Ujhhgtgfeyxiexzf;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C0281Ujhhgtgfeyxiexzf)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f1705Ujhhgtgfeyxiexzf.compareAndSet(c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & FieldInfo.DISABLE_JSONB) != 0) {
                                c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf.m1495Ujhhgtgfeyxiexzf();
                            } else {
                                C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf = c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf;
                                if (f1705Ujhhgtgfeyxiexzf.compareAndSet(c0282Ujhhgtgfeyxiexzf, j3, (j3 & (-1073741824)) | j2)) {
                                    c0282Ujhhgtgfeyxiexzf.f1710Ujhhgtgfeyxiexzf.set(i4 & c0282Ujhhgtgfeyxiexzf.f1709Ujhhgtgfeyxiexzf, null);
                                    c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = null;
                                } else {
                                    c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf;
                                }
                            }
                            if (c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf == null) {
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
