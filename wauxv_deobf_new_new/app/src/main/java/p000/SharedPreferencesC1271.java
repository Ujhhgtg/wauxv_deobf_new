package p000;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲁᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC1271 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4604 = new byte[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f4605 = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int f4606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f4607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f4608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f4609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0378 f4610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f4612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0231 f4615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f4621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public FileChannel f4625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public FileChannel f4626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public MappedByteBuffer f4627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public MappedByteBuffer f4628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f4629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f4630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final HashMap f4613 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public volatile boolean f4614 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f4618 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f4619 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ExecutorC1803 f4620 = new ExecutorC1803();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ArrayList f4622 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ArrayList f4623 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Handler f4624 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f4631 = true;

    static {
        int iIntValue;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            iIntValue = ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            iIntValue = Http2.INITIAL_MAX_FRAME_SIZE;
        }
        f4606 = iIntValue;
    }

    public SharedPreferencesC1271(String str, String str2, C2900[] c2900Arr, C0378 c0378, int i) {
        this.f4607 = str;
        this.f4608 = str2;
        this.f4610 = c0378;
        this.f4630 = i;
        HashMap map = new HashMap();
        if (c2900Arr != null) {
            for (C2900 c2900 : c2900Arr) {
                c2900.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC1272.m3097(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c2900);
                }
            }
        }
        map.put("StringSet", C2900.f9272);
        this.f4609 = map;
        synchronized (this.f4613) {
            AbstractC1272.m3099().execute(new RunnableC1269(this, 1));
            if (!this.f4614) {
                try {
                    this.f4613.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3075(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f4631 = true;
        m3077();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC1469.m3326(this);
            if (this.f4630 != 0) {
                AbstractC1469.m3331(this);
            }
            m3080(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f4631 = true;
        return m3077();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f4613.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f4613.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f4613.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC0823 abstractC0823 = (AbstractC0823) entry.getValue();
            switch (abstractC0823.mo2489()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C0824) abstractC0823).f3227);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C0827) abstractC0823).f3230);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C0826) abstractC0823).f3229);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C0828) abstractC0823).f3231);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C0825) abstractC0823).f3228);
                    break;
                case 6:
                    C0830 c0830 = (C0830) abstractC0823;
                    objValueOf = c0830.f3236 ? AbstractC1469.m3336(this, c0830, this.f4610) : c0830.f3233;
                    break;
                case 7:
                    C0822 c0822 = (C0822) abstractC0823;
                    objValueOf = c0822.f3236 ? AbstractC1469.m3332(this, c0822, this.f4610) : c0822.f3233;
                    break;
                case 8:
                    C0829 c0829 = (C0829) abstractC0823;
                    objValueOf = c0829.f3236 ? AbstractC1469.m3335(this, c0829, this.f4610) : ((C0829) abstractC0823).f3233;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (objValueOf != null) {
                map.put(str, objValueOf);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(String str, boolean z) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 != null) {
            z = abstractC0823.mo2490();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 != null) {
            f = abstractC0823.mo2491();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 != null) {
            i = abstractC0823.mo2492();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 != null) {
            j = abstractC0823.mo2493();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 == null) {
            return str2;
        }
        if (abstractC0823.mo2489() == 6) {
            C0830 c0830 = (C0830) abstractC0823;
            if (c0830.f3236) {
                String strM3336 = AbstractC1469.m3336(this, c0830, this.f4610);
                if (strM3336 != null && !strM3336.isEmpty()) {
                    c0830.f3233 = strM3336;
                    c0830.f3236 = false;
                    return strM3336;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC0823.mo2494();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m3078(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m3075(str);
            AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
            if (abstractC0823 != null && abstractC0823.mo2489() != 1) {
                remove(str);
                abstractC0823 = null;
            }
            C0824 c0824 = (C0824) abstractC0823;
            if (c0824 == null) {
                m3091(str, (byte) 1, f4605[1]);
                C0231 c0231 = this.f4615;
                int i = c0231.f1425;
                c0231.m1417(z ? (byte) 1 : (byte) 0);
                m3087();
                this.f4613.put(str, new C0824(i, z));
                m3079(str);
            } else if (c0824.f3227 != z) {
                c0824.f3227 = z;
                m3086(z ? (byte) 1 : (byte) 0, c0824.f3226);
                m3079(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m3075(str);
            AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
            if (abstractC0823 != null && abstractC0823.mo2489() != 3) {
                remove(str);
                abstractC0823 = null;
            }
            C0826 c0826 = (C0826) abstractC0823;
            if (c0826 == null) {
                m3091(str, (byte) 3, f4605[3]);
                C0231 c0231 = this.f4615;
                int i = c0231.f1425;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C0378 c0378 = this.f4610;
                if (c0378 != null) {
                    iFloatToRawIntBits ^= c0378.f1873;
                }
                c0231.m1419(iFloatToRawIntBits);
                m3087();
                this.f4613.put(str, new C0826(i, f));
                m3079(str);
            } else if (c0826.f3229 != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C0378 c0379 = this.f4610;
                if (c0379 != null) {
                    iFloatToRawIntBits2 ^= c0379.f1873;
                }
                long jM1410 = ((long) (this.f4615.m1410(c0826.f3226) ^ iFloatToRawIntBits2)) & 4294967295L;
                c0826.f3229 = f;
                m3088(iFloatToRawIntBits2, jM1410, c0826.f3226);
                m3079(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m3075(str);
            AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
            if (abstractC0823 != null && abstractC0823.mo2489() != 2) {
                remove(str);
                abstractC0823 = null;
            }
            C0827 c0827 = (C0827) abstractC0823;
            if (c0827 == null) {
                m3091(str, (byte) 2, f4605[2]);
                C0231 c0231 = this.f4615;
                int i2 = c0231.f1425;
                C0378 c0378 = this.f4610;
                c0231.m1419(c0378 != null ? c0378.f1873 ^ i : i);
                m3087();
                this.f4613.put(str, new C0827(i2, i));
                m3079(str);
            } else {
                int iM1410 = c0827.f3230;
                if (iM1410 != i) {
                    C0378 c0379 = this.f4610;
                    int i3 = c0379 != null ? c0379.f1873 ^ i : i;
                    if (c0379 != null) {
                        iM1410 = this.f4615.m1410(c0827.f3226);
                    }
                    c0827.f3230 = i;
                    m3088(i3, ((long) (iM1410 ^ i3)) & 4294967295L, c0827.f3226);
                    m3079(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putLong(String str, long j) {
        Throwable th;
        SharedPreferencesC1271 sharedPreferencesC1271;
        try {
            try {
                m3075(str);
                AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
                if (abstractC0823 != null) {
                    try {
                        if (abstractC0823.mo2489() != 4) {
                            remove(str);
                            abstractC0823 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C0828 c0828 = (C0828) abstractC0823;
                if (c0828 != null) {
                    long jM1411 = c0828.f3231;
                    if (jM1411 != j) {
                        C0378 c0378 = this.f4610;
                        long j2 = c0378 != null ? ((long) c0378.f1873) ^ j : j;
                        if (c0378 != null) {
                            jM1411 = this.f4615.m1411(c0828.f3226);
                        }
                        long j3 = jM1411 ^ j2;
                        c0828.f3231 = j;
                        sharedPreferencesC1271 = this;
                        sharedPreferencesC1271.m3089(j2, j3, c0828.f3226);
                        m3079(str);
                    }
                    return sharedPreferencesC1271;
                }
                m3091(str, (byte) 4, f4605[4]);
                C0231 c0231 = this.f4615;
                int i = c0231.f1425;
                C0378 c0379 = this.f4610;
                c0231.m1421(i, c0379 != null ? ((long) c0379.f1873) ^ j : j);
                c0231.f1425 += 8;
                m3087();
                this.f4613.put(str, new C0828(i, j));
                m3079(str);
                sharedPreferencesC1271 = this;
                return sharedPreferencesC1271;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putString(String str, String str2) {
        Throwable th;
        SharedPreferencesC1271 sharedPreferencesC1271;
        try {
            try {
                m3075(str);
                try {
                    if (str2 != null) {
                        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
                        if (abstractC0823 != null && abstractC0823.mo2489() != 6) {
                            remove(str);
                            abstractC0823 = null;
                        }
                        C0830 c0830 = (C0830) abstractC0823;
                        if (c0830 != null && !c0830.f3236 && str2.equals(c0830.f3233)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f4604 : str2.getBytes(StandardCharsets.UTF_8);
                        C0378 c0378 = this.f4610;
                        if (c0378 != null) {
                            bytes = c0378.m1699(bytes);
                        }
                        byte[] bArr = bytes;
                        if (bArr == null) {
                            Log.e("FastKV", this.f4608, new Exception("Encrypt failed"));
                            return this;
                        }
                        sharedPreferencesC1271 = this;
                        sharedPreferencesC1271.m3076(str, str2, bArr, c0830, (byte) 6);
                        m3079(str);
                        throw th;
                    }
                    remove(str);
                    sharedPreferencesC1271 = this;
                    return sharedPreferencesC1271;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putStringSet(String str, Set set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                m3083(str, set, C2900.f9272);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f4623.contains(onSharedPreferenceChangeListener)) {
            this.f4623.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
            if (abstractC0823 != null) {
                this.f4613.remove(str);
                byte bMo2489 = abstractC0823.mo2489();
                String str2 = null;
                if (bMo2489 <= 5) {
                    int iM1403 = C0231.m1403(str);
                    int i = abstractC0823.f3226;
                    m3084(bMo2489, i - (iM1403 + 2), i + f4605[bMo2489]);
                } else {
                    AbstractC0831 abstractC0831 = (AbstractC0831) abstractC0823;
                    m3084(bMo2489, abstractC0831.f3234, abstractC0831.f3226 + abstractC0831.f3235);
                    if (abstractC0831.f3236) {
                        str2 = (String) abstractC0831.f3233;
                    }
                }
                byte b = (byte) (bMo2489 | (-128));
                if (this.f4630 == 0) {
                    this.f4627.putLong(4, this.f4612);
                    this.f4627.put(this.f4629, b);
                    this.f4628.putLong(4, this.f4612);
                    this.f4628.put(this.f4629, b);
                } else {
                    this.f4615.m1421(4, this.f4612);
                }
                this.f4629 = 0;
                if (str2 != null) {
                    if (this.f4630 == 0) {
                        AbstractC1272.m3099().execute(new RunnableC1326(this, 0, str2));
                    } else {
                        this.f4618.add(str2);
                    }
                }
                if (this.f4621 >= 8192 || this.f4622.size() >= 100) {
                    AbstractC2235.m4199(this, 0);
                }
                if (this.f4630 != 0 && this.f4631) {
                    m3077();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f4607 + " name:" + this.f4608;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4623.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3076(String str, Object obj, byte[] bArr, AbstractC0831 abstractC0831, byte b) {
        AbstractC0831 c0822;
        if (abstractC0831 == null) {
            int iM3090 = m3090(str, bArr, b);
            if (iM3090 > 0) {
                int length = bArr.length;
                if (b == 6) {
                    c0822 = new C0830(this.f4616, iM3090, (String) obj, length, false);
                } else {
                    c0822 = b == 7 ? new C0822(this.f4616, iM3090, obj, length, false) : new C0829(this.f4616, iM3090, obj, length, false);
                }
                this.f4613.put(str, c0822);
                m3087();
                return;
            }
            return;
        }
        if (abstractC0831.f3236 || abstractC0831.f3235 != bArr.length) {
            int iM3091 = m3090(str, bArr, abstractC0831.mo2489());
            if (iM3091 > 0) {
                String str2 = abstractC0831.f3236 ? (String) abstractC0831.f3233 : null;
                m3084(abstractC0831.mo2489(), abstractC0831.f3234, abstractC0831.f3226 + abstractC0831.f3235);
                abstractC0831.f3234 = this.f4616;
                abstractC0831.f3226 = iM3091;
                abstractC0831.f3236 = false;
                abstractC0831.f3233 = obj;
                abstractC0831.f3235 = bArr.length;
                m3087();
                if (this.f4621 >= 8192 || this.f4622.size() >= 100) {
                    AbstractC2235.m4199(this, 0);
                }
                if (str2 != null) {
                    if (this.f4630 == 0) {
                        AbstractC1272.m3099().execute(new RunnableC1326(this, 0, str2));
                        return;
                    } else {
                        this.f4618.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i = abstractC0831.f3226;
        int length2 = bArr.length;
        this.f4612 ^= this.f4615.m1407(i, length2);
        C0231 c0231 = this.f4615;
        c0231.f1425 = i;
        c0231.m1418(bArr);
        long jM1407 = this.f4612 ^ this.f4615.m1407(i, length2);
        this.f4612 = jM1407;
        if (this.f4630 == 0) {
            this.f4627.putInt(0, -1);
            this.f4627.putLong(4, this.f4612);
            this.f4627.position(i);
            this.f4627.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f4627;
            int i2 = this.f4611 - 12;
            if (this.f4610 != null) {
                i2 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i2);
            this.f4628.putLong(4, this.f4612);
            this.f4628.position(i);
            this.f4628.put(bArr);
        } else {
            this.f4615.m1421(4, jM1407);
        }
        abstractC0831.f3233 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m3077() {
        int i = this.f4630;
        if (i == 1) {
            this.f4620.execute(new RunnableC1269(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC1469.m3356(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Object m3078(String str) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
        if (abstractC0823 != null && abstractC0823.mo2489() == 8) {
            C0829 c0829 = (C0829) abstractC0823;
            if (!c0829.f3236) {
                return c0829.f3233;
            }
            LinkedHashSet linkedHashSetM3335 = AbstractC1469.m3335(this, c0829, this.f4610);
            if (linkedHashSetM3335 == null) {
                remove(str);
                return null;
            }
            c0829.f3233 = linkedHashSetM3335;
            c0829.f3236 = false;
            return linkedHashSetM3335;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3079(String str) {
        if (this.f4630 != 0 && this.f4631) {
            m3077();
        }
        m3080(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized void m3080(String str) {
        if (this.f4623.isEmpty()) {
            return;
        }
        Iterator it = this.f4623.iterator();
        while (it.hasNext()) {
            this.f4624.post(new RunnableC1149(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 1));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3081(byte b, int i, int i2) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
        int i3 = i + 2 + i2;
        this.f4617 = i3;
        int length = ((byte[]) this.f4615.f1427).length;
        int i4 = this.f4611 + i3;
        if (i4 >= length) {
            int i5 = this.f4621;
            if (i5 <= i3 || i5 <= 8192) {
                int iM3334 = AbstractC1469.m3334(length, i4);
                byte[] bArr = new byte[iM3334];
                System.arraycopy((byte[]) this.f4615.f1427, 0, bArr, 0, this.f4611);
                this.f4615.f1427 = bArr;
                if (this.f4630 == 0) {
                    MappedByteBuffer mappedByteBufferM3342 = AbstractC1469.m3342(this.f4625, iM3334);
                    MappedByteBuffer mappedByteBufferM3343 = AbstractC1469.m3342(this.f4626, iM3334);
                    if (mappedByteBufferM3342 == null || mappedByteBufferM3343 == null) {
                        Log.e("FastKV", this.f4608, new Exception("map failed"));
                        int i6 = this.f4611 - 12;
                        if (this.f4610 != null) {
                            i6 |= 1073741824;
                        }
                        this.f4615.m1420(0, i6);
                        this.f4615.m1421(4, this.f4612);
                        AbstractC1469.m3352(this);
                    } else {
                        this.f4627 = mappedByteBufferM3342;
                        this.f4628 = mappedByteBufferM3343;
                    }
                }
            } else {
                AbstractC2235.m4199(this, i3);
            }
        }
        int i7 = this.f4611;
        this.f4616 = i7;
        this.f4611 = this.f4617 + i7;
        C0231 c0231 = this.f4615;
        c0231.f1425 = i7;
        c0231.m1417(b);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final synchronized void m3082(String str, byte[] bArr) {
        Throwable th;
        try {
            try {
                m3075(str);
                try {
                    if (bArr == null) {
                        remove(str);
                    } else {
                        AbstractC0823 abstractC0823 = (AbstractC0823) this.f4613.get(str);
                        if (abstractC0823 != null && abstractC0823.mo2489() != 7) {
                            remove(str);
                            abstractC0823 = null;
                        }
                        C0822 c0822 = (C0822) abstractC0823;
                        C0378 c0378 = this.f4610;
                        m3076(str, bArr, c0378 != null ? c0378.m1699(bArr) : bArr, c0822, (byte) 7);
                        m3079(str);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final synchronized void m3083(String str, Object obj, C2900 c2900) {
        Throwable th;
        byte[] bArrM4860;
        try {
            try {
                m3075(str);
                if (c2900 == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f4609.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0823 abstractC0823 = null;
                    try {
                        bArrM4860 = c2900.m4860(obj);
                    } catch (Exception e) {
                        Log.e("FastKV", this.f4608, e);
                        bArrM4860 = null;
                    }
                    if (bArrM4860 == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0823 abstractC0824 = (AbstractC0823) this.f4613.get(str);
                    if (abstractC0824 == null || abstractC0824.mo2489() == 8) {
                        abstractC0823 = abstractC0824;
                    } else {
                        remove(str);
                    }
                    C0829 c0829 = (C0829) abstractC0823;
                    int iM1403 = C0231.m1403("StringSet");
                    C0231 c0231 = new C0231(iM1403 + 1 + bArrM4860.length);
                    c0231.m1417((byte) iM1403);
                    c0231.m1422("StringSet");
                    c0231.m1418(bArrM4860);
                    byte[] bArrM1699 = (byte[]) c0231.f1427;
                    C0378 c0378 = this.f4610;
                    if (c0378 != null) {
                        bArrM1699 = c0378.m1699(bArrM1699);
                    }
                    byte[] bArr = bArrM1699;
                    if (bArr == null) {
                        return;
                    }
                    m3076(str, obj, bArr, c0829, (byte) 8);
                    m3079(str);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3084(byte b, int i, int i2) {
        this.f4621 = (i2 - i) + this.f4621;
        C2708 c2708 = new C2708();
        c2708.f8711 = i;
        c2708.f8712 = i2;
        this.f4622.add(c2708);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f4615.f1427;
        this.f4612 = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f4612;
        bArr[i] = b2;
        this.f4629 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3085(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f4612);
        int i = this.f4629;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f4615.f1427)[i]);
        }
        if (this.f4617 != 0) {
            mappedByteBuffer.position(this.f4616);
            mappedByteBuffer.put((byte[]) this.f4615.f1427, this.f4616, this.f4617);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3086(byte b, int i) {
        long jM3350 = this.f4612 ^ AbstractC1469.m3350(i, 1L);
        this.f4612 = jM3350;
        if (this.f4630 == 0) {
            this.f4627.putLong(4, jM3350);
            this.f4627.put(i, b);
            this.f4628.putLong(4, this.f4612);
            this.f4628.put(i, b);
        } else {
            this.f4615.m1421(4, jM3350);
        }
        ((byte[]) this.f4615.f1427)[i] = b;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3087() {
        this.f4612 ^= this.f4615.m1407(this.f4616, this.f4617);
        int i = this.f4611 - 12;
        if (this.f4610 != null) {
            i |= 1073741824;
        }
        if (this.f4630 == 0) {
            this.f4627.putInt(0, -1);
            m3085(this.f4627);
            this.f4627.putInt(0, i);
            this.f4628.putInt(0, i);
            m3085(this.f4628);
        } else {
            this.f4615.m1420(0, i);
            this.f4615.m1421(4, this.f4612);
        }
        this.f4629 = 0;
        this.f4617 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3088(int i, long j, int i2) {
        long jM3350 = AbstractC1469.m3350(i2, j) ^ this.f4612;
        this.f4612 = jM3350;
        if (this.f4630 == 0) {
            this.f4627.putLong(4, jM3350);
            this.f4627.putInt(i2, i);
            this.f4628.putLong(4, this.f4612);
            this.f4628.putInt(i2, i);
        } else {
            this.f4615.m1421(4, jM3350);
        }
        this.f4615.m1420(i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3089(long j, long j2, int i) {
        long jM3350 = AbstractC1469.m3350(i, j2) ^ this.f4612;
        this.f4612 = jM3350;
        if (this.f4630 == 0) {
            this.f4627.putLong(4, jM3350);
            this.f4627.putLong(i, j);
            this.f4628.putLong(4, this.f4612);
            this.f4628.putLong(i, j);
        } else {
            this.f4615.m1421(4, jM3350);
        }
        this.f4615.m1421(i, j);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int m3090(String str, byte[] bArr, byte b) {
        boolean z = bArr.length >= 65535;
        if (z) {
            if (b == 6) {
                b = 9;
            } else if (b == 7) {
                b = 10;
            } else if (b == 8) {
                b = 11;
            }
        }
        m3091(str, b, (z ? 4 : 2) + bArr.length);
        if (z) {
            this.f4615.m1419(bArr.length);
        } else {
            C0231 c0231 = this.f4615;
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0231.f1427;
            int i = c0231.f1425;
            int i2 = i + 1;
            c0231.f1425 = i2;
            bArr2[i] = (byte) length;
            c0231.f1425 = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C0231 c0232 = this.f4615;
        int i3 = c0232.f1425;
        c0232.m1418(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3091(String str, byte b, int i) {
        C0378 c0378 = this.f4610;
        if (c0378 != null) {
            byte[] bArrM1699 = c0378.m1699(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM1699.length;
            m3081(b, length, i);
            this.f4615.m1417((byte) length);
            C0231 c0231 = this.f4615;
            System.arraycopy(bArrM1699, 0, (byte[]) c0231.f1427, c0231.f1425, length);
            this.f4615.f1425 += length;
            return;
        }
        int iM1403 = C0231.m1403(str);
        m3081(b, iM1403, i);
        this.f4615.m1417((byte) iM1403);
        if (iM1403 != str.length()) {
            this.f4615.m1422(str);
            return;
        }
        C0231 c0232 = this.f4615;
        str.getBytes(0, iM1403, (byte[]) c0232.f1427, c0232.f1425);
        this.f4615.f1425 += iM1403;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
