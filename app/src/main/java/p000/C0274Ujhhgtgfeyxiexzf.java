package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛴᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0274Ujhhgtgfeyxiexzf implements InterfaceC2512feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Bitmap.Config f1674Ujhhgtgfeyxiexzf = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1034feyxiexzfUjhhgtg f1675Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Set f1676Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3339feyxiexzfUjhhgtg f1677Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final long f1678Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public long f1679Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f1680Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1681Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1682Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f1683Ujhhgtgfeyxiexzf;

    public C0274Ujhhgtgfeyxiexzf(long j) {
        C1034feyxiexzfUjhhgtg c1034feyxiexzfUjhhgtg = new C1034feyxiexzfUjhhgtg();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1678Ujhhgtgfeyxiexzf = j;
        this.f1675Ujhhgtgfeyxiexzf = c1034feyxiexzfUjhhgtg;
        this.f1676Ujhhgtgfeyxiexzf = setUnmodifiableSet;
        this.f1677Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(26);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1469Ujhhgtgfeyxiexzf() {
        Log.v("LruBitmapPool", "Hits=" + this.f1680Ujhhgtgfeyxiexzf + ", misses=" + this.f1681Ujhhgtgfeyxiexzf + ", puts=" + this.f1682Ujhhgtgfeyxiexzf + ", evictions=" + this.f1683Ujhhgtgfeyxiexzf + ", currentSize=" + this.f1679Ujhhgtgfeyxiexzf + ", maxSize=" + this.f1678Ujhhgtgfeyxiexzf + "\nStrategy=" + this.f1675Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final synchronized Bitmap m1470Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2528Ujhhgtgfeyxiexzf;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM2528Ujhhgtgfeyxiexzf = this.f1675Ujhhgtgfeyxiexzf.m2528Ujhhgtgfeyxiexzf(i, i2, config != null ? config : f1674Ujhhgtgfeyxiexzf);
            if (bitmapM2528Ujhhgtgfeyxiexzf == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f1675Ujhhgtgfeyxiexzf.getClass();
                    sb.append(C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3195Ujhhgtgfeyxiexzf(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f1681Ujhhgtgfeyxiexzf++;
            } else {
                this.f1680Ujhhgtgfeyxiexzf++;
                long j = this.f1679Ujhhgtgfeyxiexzf;
                this.f1675Ujhhgtgfeyxiexzf.getClass();
                this.f1679Ujhhgtgfeyxiexzf = j - ((long) AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmapM2528Ujhhgtgfeyxiexzf));
                this.f1677Ujhhgtgfeyxiexzf.getClass();
                bitmapM2528Ujhhgtgfeyxiexzf.setHasAlpha(true);
                bitmapM2528Ujhhgtgfeyxiexzf.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f1675Ujhhgtgfeyxiexzf.getClass();
                sb2.append(C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3195Ujhhgtgfeyxiexzf(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m1469Ujhhgtgfeyxiexzf();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM2528Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Bitmap mo1471Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM1470Ujhhgtgfeyxiexzf = m1470Ujhhgtgfeyxiexzf(i, i2, config);
        if (bitmapM1470Ujhhgtgfeyxiexzf != null) {
            return bitmapM1470Ujhhgtgfeyxiexzf;
        }
        if (config == null) {
            config = f1674Ujhhgtgfeyxiexzf;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final synchronized void mo1472Ujhhgtgfeyxiexzf(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f1675Ujhhgtgfeyxiexzf.getClass();
                if (AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap) <= this.f1678Ujhhgtgfeyxiexzf && this.f1676Ujhhgtgfeyxiexzf.contains(bitmap.getConfig())) {
                    this.f1675Ujhhgtgfeyxiexzf.getClass();
                    int iM3194Ujhhgtgfeyxiexzf = AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap);
                    this.f1675Ujhhgtgfeyxiexzf.m2530Ujhhgtgfeyxiexzf(bitmap);
                    this.f1677Ujhhgtgfeyxiexzf.getClass();
                    this.f1682Ujhhgtgfeyxiexzf++;
                    this.f1679Ujhhgtgfeyxiexzf += (long) iM3194Ujhhgtgfeyxiexzf;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f1675Ujhhgtgfeyxiexzf.getClass();
                        sb.append(C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m1469Ujhhgtgfeyxiexzf();
                    }
                    m1473Ujhhgtgfeyxiexzf(this.f1678Ujhhgtgfeyxiexzf);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f1675Ujhhgtgfeyxiexzf.getClass();
                sb2.append(C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f1676Ujhhgtgfeyxiexzf.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final synchronized void m1473Ujhhgtgfeyxiexzf(long j) {
        while (this.f1679Ujhhgtgfeyxiexzf > j) {
            try {
                C1034feyxiexzfUjhhgtg c1034feyxiexzfUjhhgtg = this.f1675Ujhhgtgfeyxiexzf;
                Bitmap bitmap = (Bitmap) c1034feyxiexzfUjhhgtg.f4045Ujhhgtgfeyxiexzf.m3964feyxiexzfUjhhgtg();
                if (bitmap != null) {
                    c1034feyxiexzfUjhhgtg.m2527Ujhhgtgfeyxiexzf(Integer.valueOf(AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m1469Ujhhgtgfeyxiexzf();
                    }
                    this.f1679Ujhhgtgfeyxiexzf = 0L;
                    return;
                }
                this.f1677Ujhhgtgfeyxiexzf.getClass();
                long j2 = this.f1679Ujhhgtgfeyxiexzf;
                this.f1675Ujhhgtgfeyxiexzf.getClass();
                this.f1679Ujhhgtgfeyxiexzf = j2 - ((long) AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap));
                this.f1683Ujhhgtgfeyxiexzf++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f1675Ujhhgtgfeyxiexzf.getClass();
                    sb.append(C1034feyxiexzfUjhhgtg.m2526Ujhhgtgfeyxiexzf(AbstractC1860Ujhhgtgfeyxiexzf.m3194Ujhhgtgfeyxiexzf(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m1469Ujhhgtgfeyxiexzf();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Bitmap mo1474Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM1470Ujhhgtgfeyxiexzf = m1470Ujhhgtgfeyxiexzf(i, i2, config);
        if (bitmapM1470Ujhhgtgfeyxiexzf != null) {
            bitmapM1470Ujhhgtgfeyxiexzf.eraseColor(0);
            return bitmapM1470Ujhhgtgfeyxiexzf;
        }
        if (config == null) {
            config = f1674Ujhhgtgfeyxiexzf;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1475Ujhhgtgfeyxiexzf(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1476Ujhhgtgfeyxiexzf();
        } else if (i >= 20 || i == 15) {
            m1473Ujhhgtgfeyxiexzf(this.f1678Ujhhgtgfeyxiexzf / 2);
        }
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo1476Ujhhgtgfeyxiexzf() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m1473Ujhhgtgfeyxiexzf(0L);
    }
}
