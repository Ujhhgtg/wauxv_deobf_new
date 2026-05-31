package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC0744;
import p000.AbstractC2240;
import p000.C0056;
import p000.C0179;
import p000.C0696;
import p000.C1334;
import p000.C1335;
import p000.C1787;
import p000.C2006;
import p000.InterfaceC1433;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile long f1040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f1041 = new ReentrantReadWriteLock();

    public DexKitBridge(ClassLoader classLoader) {
        this.f1040 = nativeInitDexKitByClassLoader(classLoader, true);
    }

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

    private static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeRelease(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f1041;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f1040;
            if (j == 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            this.f1040 = 0L;
            nativeRelease(j);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0696 m1047(InterfaceC1433 interfaceC1433) {
        C1334 c1334 = new C1334();
        interfaceC1433.invoke(c1334);
        byte[] bArrM1624 = c1334.m1624();
        ReentrantReadWriteLock.ReadLock lock = this.f1041.readLock();
        lock.lock();
        try {
            long j = this.f1040;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = nativeFindClass(j, bArrM1624);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            C0056 c0056 = new C0056();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0056.m1055(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0696 c0696 = new C0696();
            int iM1054 = c0056.m1054(4);
            int iM1058 = iM1054 != 0 ? c0056.m1058(iM1054) : 0;
            for (int i = 0; i < iM1058; i++) {
                c0696.add(C1787.m3666(this, c0056.m1059(i)));
            }
            if (c0696.size() > 1) {
                AbstractC0744.m2315(c0696, new C0179(8));
            }
            return c0696;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2006 m1048(C1335 c1335) {
        byte[] bArrM1624 = c1335.m1624();
        ReentrantReadWriteLock.ReadLock lock = this.f1041.readLock();
        lock.lock();
        try {
            long j = this.f1040;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = nativeFindMethod(j, bArrM1624);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            C0056 c0056 = new C0056();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0056.m1055(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C2006 c2006 = new C2006();
            int iM1054 = c0056.m1054(4);
            int iM1058 = iM1054 != 0 ? c0056.m1058(iM1054) : 0;
            for (int i = 0; i < iM1058; i++) {
                C0056 c0057 = new C0056();
                int iM1055 = c0056.m1054(4);
                if (iM1055 != 0) {
                    c0057.m1055(c0056.m1053((i * 4) + c0056.m1057(iM1055)), c0056.f1045);
                } else {
                    c0057 = null;
                }
                c2006.add(AbstractC2240.m4248(this, c0057));
            }
            if (c2006.size() > 1) {
                AbstractC0744.m2315(c2006, new C0179(9));
            }
            return c2006;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0696 m1049(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f1041.readLock();
        lock.lock();
        try {
            long j = this.f1040;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            C0056 c0056 = new C0056();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0056.m1055(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0696 c0696 = new C0696();
            int iM1054 = c0056.m1054(4);
            int iM1058 = iM1054 != 0 ? c0056.m1058(iM1054) : 0;
            for (int i = 0; i < iM1058; i++) {
                c0696.add(C1787.m3666(this, c0056.m1059(i)));
            }
            return c0696;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
