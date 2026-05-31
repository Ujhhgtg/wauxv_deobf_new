package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲇᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1894 implements InterfaceC0399 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Bitmap.Config f6277 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2777 f6278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Set f6279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1224 f6280;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final long f6281;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public long f6282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6286;

    public C1894(long j) {
        C2777 c2777 = new C2777();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f6281 = j;
        this.f6278 = c2777;
        this.f6279 = setUnmodifiableSet;
        this.f6280 = new C1224(26);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3824() {
        Log.v("LruBitmapPool", "Hits=" + this.f6283 + ", misses=" + this.f6284 + ", puts=" + this.f6285 + ", evictions=" + this.f6286 + ", currentSize=" + this.f6282 + ", maxSize=" + this.f6281 + "\nStrategy=" + this.f6278);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final synchronized Bitmap m3825(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM4758;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM4758 = this.f6278.m4758(i, i2, config != null ? config : f6277);
            if (bitmapM4758 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f6278.getClass();
                    sb.append(C2777.m4756(AbstractC3580.m5119(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f6284++;
            } else {
                this.f6283++;
                long j = this.f6282;
                this.f6278.getClass();
                this.f6282 = j - ((long) AbstractC3580.m5118(bitmapM4758));
                this.f6280.getClass();
                bitmapM4758.setHasAlpha(true);
                bitmapM4758.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f6278.getClass();
                sb2.append(C2777.m4756(AbstractC3580.m5119(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m3824();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM4758;
    }

    @Override // p000.InterfaceC0399
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1608(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3825 = m3825(i, i2, config);
        if (bitmapM3825 != null) {
            return bitmapM3825;
        }
        if (config == null) {
            config = f6277;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0399
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final synchronized void mo1609(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f6278.getClass();
                if (AbstractC3580.m5118(bitmap) <= this.f6281 && this.f6279.contains(bitmap.getConfig())) {
                    this.f6278.getClass();
                    int iM5118 = AbstractC3580.m5118(bitmap);
                    this.f6278.m4760(bitmap);
                    this.f6280.getClass();
                    this.f6285++;
                    this.f6282 += (long) iM5118;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f6278.getClass();
                        sb.append(C2777.m4756(AbstractC3580.m5118(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m3824();
                    }
                    m3826(this.f6281);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f6278.getClass();
                sb2.append(C2777.m4756(AbstractC3580.m5118(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f6279.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3826(long j) {
        while (this.f6282 > j) {
            try {
                C2777 c2777 = this.f6278;
                Bitmap bitmap = (Bitmap) c2777.f8935.m2008();
                if (bitmap != null) {
                    c2777.m4757(Integer.valueOf(AbstractC3580.m5118(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m3824();
                    }
                    this.f6282 = 0L;
                    return;
                }
                this.f6280.getClass();
                long j2 = this.f6282;
                this.f6278.getClass();
                this.f6282 = j2 - ((long) AbstractC3580.m5118(bitmap));
                this.f6286++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f6278.getClass();
                    sb.append(C2777.m4756(AbstractC3580.m5118(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m3824();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0399
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Bitmap mo1618(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3825 = m3825(i, i2, config);
        if (bitmapM3825 != null) {
            bitmapM3825.eraseColor(0);
            return bitmapM3825;
        }
        if (config == null) {
            config = f6277;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0399
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1620(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1621();
        } else if (i >= 20 || i == 15) {
            m3826(this.f6281 / 2);
        }
    }

    @Override // p000.InterfaceC0399
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo1621() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m3826(0L);
    }
}
