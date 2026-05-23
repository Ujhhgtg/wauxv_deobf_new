package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC0743;
import p000.AbstractC0749;
import p000.AbstractC1459;
import p000.C0049;
import p000.C0171;
import p000.C0700;
import p000.C1332;
import p000.C1333;
import p000.C1975;
import p000.InterfaceC1425;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile long f975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f976 = new ReentrantReadWriteLock();

    public DexKitBridge(ClassLoader classLoader) {
        this.f975 = nativeInitDexKitByClassLoader(classLoader, true);
    }

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

    private static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeRelease(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f976;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f975;
            if (j == 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            this.f975 = 0L;
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
    public final C0700 m903(InterfaceC1425 interfaceC1425) {
        C1332 c1332 = new C1332(4);
        interfaceC1425.invoke(c1332);
        byte[] bArrM1518 = c1332.m1518();
        ReentrantReadWriteLock.ReadLock lock = this.f976.readLock();
        lock.lock();
        try {
            long j = this.f975;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = nativeFindClass(j, bArrM1518);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            C0049 c0049 = new C0049();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0049.m911(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0700 c0700 = new C0700();
            int iM910 = c0049.m910(4);
            int iM914 = iM910 != 0 ? c0049.m914(iM910) : 0;
            for (int i = 0; i < iM914; i++) {
                c0700.add(AbstractC0743.m2178(this, c0049.m915(i)));
            }
            if (c0700.size() > 1) {
                AbstractC0749.m2216(c0700, new C0171(5));
            }
            return c0700;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1975 m904(C1333 c1333) {
        byte[] bArrM1518 = c1333.m1518();
        ReentrantReadWriteLock.ReadLock lock = this.f976.readLock();
        lock.lock();
        try {
            long j = this.f975;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = nativeFindMethod(j, bArrM1518);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            C0049 c0049 = new C0049();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0049.m911(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C1975 c1975 = new C1975();
            int iM910 = c0049.m910(4);
            int iM914 = iM910 != 0 ? c0049.m914(iM910) : 0;
            for (int i = 0; i < iM914; i++) {
                C0049 c00410 = new C0049();
                int iM911 = c0049.m910(4);
                if (iM911 != 0) {
                    c00410.m911(c0049.m909((i * 4) + c0049.m913(iM911)), c0049.f980);
                } else {
                    c00410 = null;
                }
                c1975.add(AbstractC1459.m3183(this, c00410));
            }
            if (c1975.size() > 1) {
                AbstractC0749.m2216(c1975, new C0171(6));
            }
            return c1975;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0700 m905(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f976.readLock();
        lock.lock();
        try {
            long j = this.f975;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            C0049 c0049 = new C0049();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0049.m911(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0700 c0700 = new C0700();
            int iM910 = c0049.m910(4);
            int iM914 = iM910 != 0 ? c0049.m914(iM910) : 0;
            for (int i = 0; i < iM914; i++) {
                c0700.add(AbstractC0743.m2178(this, c0049.m915(i)));
            }
            return c0700;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
