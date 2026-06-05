package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC1264feyxiexzfUjhhgtg;
import p000.AbstractC2861Ujhhgtgfeyxiexzf;
import p000.C0388Ujhhgtgfeyxiexzf;
import p000.C2419Ujhhgtgfeyxiexzf;
import p000.C2805Ujhhgtgfeyxiexzf;
import p000.C2919Ujhhgtgfeyxiexzf;
import p000.C3452feyxiexzfUjhhgtg;
import p000.C3456feyxiexzfUjhhgtg;
import p000.InterfaceC3549feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile long f1054Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f1055Ujhhgtgfeyxiexzf = new ReentrantReadWriteLock();

    public DexKitBridge(ClassLoader classLoader) {
        this.f1054Ujhhgtgfeyxiexzf = nativeInitDexKitByClassLoader(classLoader, true);
    }

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

    private static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeRelease(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f1055Ujhhgtgfeyxiexzf;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f1054Ujhhgtgfeyxiexzf;
            if (j == 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            this.f1054Ujhhgtgfeyxiexzf = 0L;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2805Ujhhgtgfeyxiexzf m1048Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = new C3456feyxiexzfUjhhgtg();
        interfaceC3549feyxiexzfUjhhgtg.invoke(c3456feyxiexzfUjhhgtg);
        byte[] bArrM3693Ujhhgtgfeyxiexzf = c3456feyxiexzfUjhhgtg.m3693Ujhhgtgfeyxiexzf();
        ReentrantReadWriteLock.ReadLock lock = this.f1055Ujhhgtgfeyxiexzf.readLock();
        lock.lock();
        try {
            long j = this.f1054Ujhhgtgfeyxiexzf;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = nativeFindClass(j, bArrM3693Ujhhgtgfeyxiexzf);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf = new C2919Ujhhgtgfeyxiexzf();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c2919Ujhhgtgfeyxiexzf.m4290Ujhhgtgfeyxiexzf(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C2805Ujhhgtgfeyxiexzf c2805Ujhhgtgfeyxiexzf = new C2805Ujhhgtgfeyxiexzf();
            int iM4289Ujhhgtgfeyxiexzf = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
            int iM4293Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf) : 0;
            for (int i = 0; i < iM4293Ujhhgtgfeyxiexzf; i++) {
                c2805Ujhhgtgfeyxiexzf.add(AbstractC1264feyxiexzfUjhhgtg.m2797Ujhhgtgfeyxiexzf(this, c2919Ujhhgtgfeyxiexzf.m4294Ujhhgtgfeyxiexzf(i)));
            }
            if (c2805Ujhhgtgfeyxiexzf.size() > 1) {
                AbstractC2861Ujhhgtgfeyxiexzf.m4265feyxiexzfUjhhgtg(c2805Ujhhgtgfeyxiexzf, new C2419Ujhhgtgfeyxiexzf(8));
            }
            return c2805Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0388Ujhhgtgfeyxiexzf m1049Ujhhgtgfeyxiexzf(C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg) {
        byte[] bArrM3693Ujhhgtgfeyxiexzf = c3452feyxiexzfUjhhgtg.m3693Ujhhgtgfeyxiexzf();
        ReentrantReadWriteLock.ReadLock lock = this.f1055Ujhhgtgfeyxiexzf.readLock();
        lock.lock();
        try {
            long j = this.f1054Ujhhgtgfeyxiexzf;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = nativeFindMethod(j, bArrM3693Ujhhgtgfeyxiexzf);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf = new C2919Ujhhgtgfeyxiexzf();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c2919Ujhhgtgfeyxiexzf.m4290Ujhhgtgfeyxiexzf(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0388Ujhhgtgfeyxiexzf c0388Ujhhgtgfeyxiexzf = new C0388Ujhhgtgfeyxiexzf();
            int iM4289Ujhhgtgfeyxiexzf = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
            int iM4293Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf) : 0;
            for (int i = 0; i < iM4293Ujhhgtgfeyxiexzf; i++) {
                C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf2 = new C2919Ujhhgtgfeyxiexzf();
                int iM4289Ujhhgtgfeyxiexzf2 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
                if (iM4289Ujhhgtgfeyxiexzf2 != 0) {
                    c2919Ujhhgtgfeyxiexzf2.m4290Ujhhgtgfeyxiexzf(c2919Ujhhgtgfeyxiexzf.m4288Ujhhgtgfeyxiexzf((i * 4) + c2919Ujhhgtgfeyxiexzf.m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf2)), c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf);
                } else {
                    c2919Ujhhgtgfeyxiexzf2 = null;
                }
                c0388Ujhhgtgfeyxiexzf.add(AbstractC0615Ujhhgtgfeyxiexzf.m1878Ujhhgtgfeyxiexzf(this, c2919Ujhhgtgfeyxiexzf2));
            }
            if (c0388Ujhhgtgfeyxiexzf.size() > 1) {
                AbstractC2861Ujhhgtgfeyxiexzf.m4265feyxiexzfUjhhgtg(c0388Ujhhgtgfeyxiexzf, new C2419Ujhhgtgfeyxiexzf(9));
            }
            return c0388Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2805Ujhhgtgfeyxiexzf m1050Ujhhgtgfeyxiexzf(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f1055Ujhhgtgfeyxiexzf.readLock();
        lock.lock();
        try {
            long j = this.f1054Ujhhgtgfeyxiexzf;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf = new C2919Ujhhgtgfeyxiexzf();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c2919Ujhhgtgfeyxiexzf.m4290Ujhhgtgfeyxiexzf(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C2805Ujhhgtgfeyxiexzf c2805Ujhhgtgfeyxiexzf = new C2805Ujhhgtgfeyxiexzf();
            int iM4289Ujhhgtgfeyxiexzf = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
            int iM4293Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf) : 0;
            for (int i = 0; i < iM4293Ujhhgtgfeyxiexzf; i++) {
                c2805Ujhhgtgfeyxiexzf.add(AbstractC1264feyxiexzfUjhhgtg.m2797Ujhhgtgfeyxiexzf(this, c2919Ujhhgtgfeyxiexzf.m4294Ujhhgtgfeyxiexzf(i)));
            }
            return c2805Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
