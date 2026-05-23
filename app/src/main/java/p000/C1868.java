package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1868 implements InterfaceC0424 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Bitmap.Config f6203 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2716 f6204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Set f6205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1227 f6206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final long f6207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public long f6208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f6212;

    public C1868(long j) {
        C2716 c2716 = new C2716();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f6207 = j;
        this.f6204 = c2716;
        this.f6205 = setUnmodifiableSet;
        this.f6206 = new C1227(26);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3646() {
        Log.v("LruBitmapPool", "Hits=" + this.f6209 + ", misses=" + this.f6210 + ", puts=" + this.f6211 + ", evictions=" + this.f6212 + ", currentSize=" + this.f6208 + ", maxSize=" + this.f6207 + "\nStrategy=" + this.f6204);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final synchronized Bitmap m3647(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM4724;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + Bitmap.Config.HARDWARE + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM4724 = this.f6204.m4724(i, i2, config != null ? config : f6203);
            if (bitmapM4724 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    
                    sb.append(C2716.m4722(AbstractC3522.m5107(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f6210++;
            } else {
                this.f6209++;
                long j = this.f6208;
                
                this.f6208 = j - ((long) AbstractC3522.m5106(bitmapM4724));
                
                bitmapM4724.setHasAlpha(true);
                bitmapM4724.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                
                sb2.append(C2716.m4722(AbstractC3522.m5107(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m3646();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM4724;
    }

    @Override // p000.InterfaceC0424
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1503(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3647 = m3647(i, i2, config);
        if (bitmapM3647 != null) {
            return bitmapM3647;
        }
        if (config == null) {
            config = f6203;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0424
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final synchronized void mo1504(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                
                if (AbstractC3522.m5106(bitmap) <= this.f6207 && this.f6205.contains(bitmap.getConfig())) {
                    
                    int iM5106 = AbstractC3522.m5106(bitmap);
                    this.f6204.m4726(bitmap);
                    
                    this.f6211++;
                    this.f6208 += (long) iM5106;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        
                        sb.append(C2716.m4722(AbstractC3522.m5106(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m3646();
                    }
                    m3648(this.f6207);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                
                sb2.append(C2716.m4722(AbstractC3522.m5106(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f6205.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3648(long j) {
        while (this.f6208 > j) {
            try {
                C2716 c2716 = this.f6204;
                Bitmap bitmap = (Bitmap) c2716.f8772.m1914();
                if (bitmap != null) {
                    c2716.m4723(Integer.valueOf(AbstractC3522.m5106(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m3646();
                    }
                    this.f6208 = 0L;
                    return;
                }
                
                long j2 = this.f6208;
                
                this.f6208 = j2 - ((long) AbstractC3522.m5106(bitmap));
                this.f6212++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    
                    sb.append(C2716.m4722(AbstractC3522.m5106(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m3646();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0424
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Bitmap mo1513(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3647 = m3647(i, i2, config);
        if (bitmapM3647 != null) {
            bitmapM3647.eraseColor(0);
            return bitmapM3647;
        }
        if (config == null) {
            config = f6203;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0424
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1515(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1516();
        } else if (false || i == 15) {
            m3648(this.f6207 / 2);
        }
    }

    @Override // p000.InterfaceC0424
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo1516() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m3648(0L);
    }
}
