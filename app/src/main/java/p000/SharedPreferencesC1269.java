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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC1269 implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4605 = new byte[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f4606 = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int f4607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f4608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f4609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f4610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0403 f4611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f4613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0221 f4616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f4622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public FileChannel f4626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public FileChannel f4627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public MappedByteBuffer f4628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public MappedByteBuffer f4629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f4630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f4631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final HashMap f4614 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public volatile boolean f4615 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f4619 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f4620 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ExecutorC1780 f4621 = new ExecutorC1780();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ArrayList f4623 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ArrayList f4624 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Handler f4625 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f4632 = true;

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
            iIntValue = 16384;
        }
        f4607 = iIntValue;
    }

    public SharedPreferencesC1269(String str, String str2, C2840[] c2840Arr, C0403 c0403, int i) {
        this.f4608 = str;
        this.f4609 = str2;
        this.f4611 = c0403;
        this.f4631 = i;
        HashMap map = new HashMap();
        if (c2840Arr != null) {
            for (C2840 c2840 : c2840Arr) {
                
                if (map.containsKey("StringSet")) {
                    AbstractC2202.m4003(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c2840);
                }
            }
        }
        map.put("StringSet", C2840.f9110);
        this.f4610 = map;
        synchronized (this.f4614) {
            AbstractC1270.m2982().execute(new RunnableC1267(this, 1));
            if (!this.f4615) {
                try {
                    this.f4614.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2956(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f4632 = true;
        m2958();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC2207.m4088(this);
            if (this.f4631 != 0) {
                AbstractC2207.m4092(this);
            }
            m2961(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f4632 = true;
        return m2958();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f4614.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f4614.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f4614.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC0824 abstractC0824 = (AbstractC0824) entry.getValue();
            switch (abstractC0824.mo2372()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C0825) abstractC0824).f3220);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C0828) abstractC0824).f3223);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C0827) abstractC0824).f3222);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C0829) abstractC0824).f3224);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C0826) abstractC0824).f3221);
                    break;
                case 6:
                    C0831 c0831 = (C0831) abstractC0824;
                    objValueOf = c0831.f3229 ? AbstractC2207.m4097(this, c0831, this.f4611) : c0831.f3226;
                    break;
                case 7:
                    C0823 c0823 = (C0823) abstractC0824;
                    objValueOf = c0823.f3229 ? AbstractC2207.m4094(this, c0823, this.f4611) : c0823.f3226;
                    break;
                case 8:
                    C0830 c0830 = (C0830) abstractC0824;
                    objValueOf = c0830.f3229 ? AbstractC2207.m4096(this, c0830, this.f4611) : ((C0830) abstractC0824).f3226;
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
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 != null) {
            z = abstractC0824.mo2373();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 != null) {
            f = abstractC0824.mo2374();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 != null) {
            i = abstractC0824.mo2375();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 != null) {
            j = abstractC0824.mo2376();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 == null) {
            return str2;
        }
        if (abstractC0824.mo2372() == 6) {
            C0831 c0831 = (C0831) abstractC0824;
            if (c0831.f3229) {
                String strM4097 = AbstractC2207.m4097(this, c0831, this.f4611);
                if (strM4097 != null && !strM4097.isEmpty()) {
                    c0831.f3226 = strM4097;
                    c0831.f3229 = false;
                    return strM4097;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC0824.mo2377();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m2959(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m2956(str);
            AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
            if (abstractC0824 != null && abstractC0824.mo2372() != 1) {
                remove(str);
                abstractC0824 = null;
            }
            C0825 c0825 = (C0825) abstractC0824;
            if (c0825 == null) {
                m2972(str, (byte) 1, f4606[1]);
                C0221 c0221 = this.f4616;
                int i = c0221.f1351;
                c0221.m1271(z ? (byte) 1 : (byte) 0);
                m2968();
                this.f4614.put(str, new C0825(i, z));
                m2960(str);
            } else if (c0825.f3220 != z) {
                c0825.f3220 = z;
                m2967(z ? (byte) 1 : (byte) 0, c0825.f3219);
                m2960(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m2956(str);
            AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
            if (abstractC0824 != null && abstractC0824.mo2372() != 3) {
                remove(str);
                abstractC0824 = null;
            }
            C0827 c0827 = (C0827) abstractC0824;
            if (c0827 == null) {
                m2972(str, (byte) 3, f4606[3]);
                C0221 c0221 = this.f4616;
                int i = c0221.f1351;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C0403 c0403 = this.f4611;
                if (c0403 != null) {
                    iFloatToRawIntBits ^= c0403.f1901;
                }
                c0221.m1273(iFloatToRawIntBits);
                m2968();
                this.f4614.put(str, new C0827(i, f));
                m2960(str);
            } else if (c0827.f3222 != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C0403 c0404 = this.f4611;
                if (c0404 != null) {
                    iFloatToRawIntBits2 ^= c0404.f1901;
                }
                long jM1264 = ((long) (this.f4616.m1264(c0827.f3219) ^ iFloatToRawIntBits2)) & 4294967295L;
                c0827.f3222 = f;
                m2969(iFloatToRawIntBits2, jM1264, c0827.f3219);
                m2960(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m2956(str);
            AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
            if (abstractC0824 != null && abstractC0824.mo2372() != 2) {
                remove(str);
                abstractC0824 = null;
            }
            C0828 c0828 = (C0828) abstractC0824;
            if (c0828 == null) {
                m2972(str, (byte) 2, f4606[2]);
                C0221 c0221 = this.f4616;
                int i2 = c0221.f1351;
                C0403 c0403 = this.f4611;
                c0221.m1273(c0403 != null ? c0403.f1901 ^ i : i);
                m2968();
                this.f4614.put(str, new C0828(i2, i));
                m2960(str);
            } else {
                int iM1264 = c0828.f3223;
                if (iM1264 != i) {
                    C0403 c0404 = this.f4611;
                    int i3 = c0404 != null ? c0404.f1901 ^ i : i;
                    if (c0404 != null) {
                        iM1264 = this.f4616.m1264(c0828.f3219);
                    }
                    c0828.f3223 = i;
                    m2969(i3, ((long) (iM1264 ^ i3)) & 4294967295L, c0828.f3219);
                    m2960(str);
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
        SharedPreferencesC1269 sharedPreferencesC1269;
        try {
            try {
                m2956(str);
                AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
                if (abstractC0824 != null) {
                    try {
                        if (abstractC0824.mo2372() != 4) {
                            remove(str);
                            abstractC0824 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C0829 c0829 = (C0829) abstractC0824;
                if (c0829 != null) {
                    long jM1265 = c0829.f3224;
                    if (jM1265 != j) {
                        C0403 c0403 = this.f4611;
                        long j2 = c0403 != null ? ((long) c0403.f1901) ^ j : j;
                        if (c0403 != null) {
                            jM1265 = this.f4616.m1265(c0829.f3219);
                        }
                        long j3 = jM1265 ^ j2;
                        c0829.f3224 = j;
                        sharedPreferencesC1269 = this;
                        sharedPreferencesC1269.m2970(j2, j3, c0829.f3219);
                        m2960(str);
                    }
                    return sharedPreferencesC1269;
                }
                m2972(str, (byte) 4, f4606[4]);
                C0221 c0221 = this.f4616;
                int i = c0221.f1351;
                C0403 c0404 = this.f4611;
                c0221.m1275(i, c0404 != null ? ((long) c0404.f1901) ^ j : j);
                c0221.f1351 += 8;
                m2968();
                this.f4614.put(str, new C0829(i, j));
                m2960(str);
                sharedPreferencesC1269 = this;
                return sharedPreferencesC1269;
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
        SharedPreferencesC1269 sharedPreferencesC1269;
        try {
            try {
                m2956(str);
                try {
                    if (str2 != null) {
                        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
                        if (abstractC0824 != null && abstractC0824.mo2372() != 6) {
                            remove(str);
                            abstractC0824 = null;
                        }
                        C0831 c0831 = (C0831) abstractC0824;
                        if (c0831 != null && !c0831.f3229 && str2.equals(c0831.f3226)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f4605 : str2.getBytes(StandardCharsets.UTF_8);
                        C0403 c0403 = this.f4611;
                        if (c0403 != null) {
                            bytes = c0403.m1593(bytes);
                        }
                        byte[] bArr = bytes;
                        if (bArr == null) {
                            Log.e("FastKV", this.f4609, new Exception("Encrypt failed"));
                            return this;
                        }
                        sharedPreferencesC1269 = this;
                        sharedPreferencesC1269.m2957(str, str2, bArr, c0831, (byte) 6);
                        m2960(str);
                        throw th;
                    }
                    remove(str);
                    sharedPreferencesC1269 = this;
                    return sharedPreferencesC1269;
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
                m2964(str, set, C2840.f9110);
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
        if (!this.f4624.contains(onSharedPreferenceChangeListener)) {
            this.f4624.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
            if (abstractC0824 != null) {
                this.f4614.remove(str);
                byte bMo2372 = abstractC0824.mo2372();
                String str2 = null;
                if (bMo2372 <= 5) {
                    int iM1257 = C0221.m1257(str);
                    int i = abstractC0824.f3219;
                    m2965(bMo2372, i - (iM1257 + 2), i + f4606[bMo2372]);
                } else {
                    AbstractC0832 abstractC0832 = (AbstractC0832) abstractC0824;
                    m2965(bMo2372, abstractC0832.f3227, abstractC0832.f3219 + abstractC0832.f3228);
                    if (abstractC0832.f3229) {
                        str2 = (String) abstractC0832.f3226;
                    }
                }
                byte b = (byte) (bMo2372 | (-128));
                if (this.f4631 == 0) {
                    this.f4628.putLong(4, this.f4613);
                    this.f4628.put(this.f4630, b);
                    this.f4629.putLong(4, this.f4613);
                    this.f4629.put(this.f4630, b);
                } else {
                    this.f4616.m1275(4, this.f4613);
                }
                this.f4630 = 0;
                if (str2 != null) {
                    if (this.f4631 == 0) {
                        AbstractC1270.m2982().execute(new RunnableC1324(this, 0, str2));
                    } else {
                        this.f4619.add(str2);
                    }
                }
                if (this.f4622 >= 8192 || this.f4623.size() >= 100) {
                    AbstractC0743.m2179(this, 0);
                }
                if (this.f4631 != 0 && this.f4632) {
                    m2958();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f4608 + " name:" + this.f4609;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4624.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2957(String str, Object obj, byte[] bArr, AbstractC0832 abstractC0832, byte b) {
        AbstractC0824 c0823;
        if (abstractC0832 == null) {
            int iM2971 = m2971(str, bArr, b);
            if (iM2971 > 0) {
                int length = bArr.length;
                if (b == 6) {
                    c0823 = new C0831(this.f4617, iM2971, (String) obj, length, false);
                } else {
                    c0823 = b == 7 ? new C0823(this.f4617, iM2971, obj, length, false) : new C0830(this.f4617, iM2971, obj, length, false);
                }
                this.f4614.put(str, c0823);
                m2968();
                return;
            }
            return;
        }
        if (abstractC0832.f3229 || abstractC0832.f3228 != bArr.length) {
            int iM2972 = m2971(str, bArr, abstractC0832.mo2372());
            if (iM2972 > 0) {
                String str2 = abstractC0832.f3229 ? (String) abstractC0832.f3226 : null;
                m2965(abstractC0832.mo2372(), abstractC0832.f3227, abstractC0832.f3219 + abstractC0832.f3228);
                abstractC0832.f3227 = this.f4617;
                abstractC0832.f3219 = iM2972;
                abstractC0832.f3229 = false;
                abstractC0832.f3226 = obj;
                abstractC0832.f3228 = bArr.length;
                m2968();
                if (this.f4622 >= 8192 || this.f4623.size() >= 100) {
                    AbstractC0743.m2179(this, 0);
                }
                if (str2 != null) {
                    if (this.f4631 == 0) {
                        AbstractC1270.m2982().execute(new RunnableC1324(this, 0, str2));
                        return;
                    } else {
                        this.f4619.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i = abstractC0832.f3219;
        int length2 = bArr.length;
        this.f4613 ^= this.f4616.m1261(i, length2);
        C0221 c0221 = this.f4616;
        c0221.f1351 = i;
        c0221.m1272(bArr);
        long jM1261 = this.f4613 ^ this.f4616.m1261(i, length2);
        this.f4613 = jM1261;
        if (this.f4631 == 0) {
            this.f4628.putInt(0, -1);
            this.f4628.putLong(4, this.f4613);
            this.f4628.position(i);
            this.f4628.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f4628;
            int i2 = this.f4612 - 12;
            if (this.f4611 != null) {
                i2 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i2);
            this.f4629.putLong(4, this.f4613);
            this.f4629.position(i);
            this.f4629.put(bArr);
        } else {
            this.f4616.m1275(4, jM1261);
        }
        abstractC0832.f3226 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m2958() {
        int i = this.f4631;
        if (i == 1) {
            this.f4621.execute(new RunnableC1267(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC2207.m4122(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Object m2959(String str) {
        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
        if (abstractC0824 != null && abstractC0824.mo2372() == 8) {
            C0830 c0830 = (C0830) abstractC0824;
            if (!c0830.f3229) {
                return c0830.f3226;
            }
            LinkedHashSet linkedHashSetM4096 = AbstractC2207.m4096(this, c0830, this.f4611);
            if (linkedHashSetM4096 == null) {
                remove(str);
                return null;
            }
            c0830.f3226 = linkedHashSetM4096;
            c0830.f3229 = false;
            return linkedHashSetM4096;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2960(String str) {
        if (this.f4631 != 0 && this.f4632) {
            m2958();
        }
        m2961(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized void m2961(String str) {
        if (this.f4624.isEmpty()) {
            return;
        }
        Iterator it = this.f4624.iterator();
        while (it.hasNext()) {
            this.f4625.post(new RunnableC1143(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 1));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2962(byte b, int i, int i2) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
        int i3 = i + 2 + i2;
        this.f4618 = i3;
        int length = ((byte[]) this.f4616.f1353).length;
        int i4 = this.f4612 + i3;
        if (i4 >= length) {
            int i5 = this.f4622;
            if (i5 <= i3 || i5 <= 8192) {
                int iM4095 = AbstractC2207.m4095(length, i4);
                byte[] bArr = new byte[iM4095];
                System.arraycopy((byte[]) this.f4616.f1353, 0, bArr, 0, this.f4612);
                this.f4616.f1353 = bArr;
                if (this.f4631 == 0) {
                    MappedByteBuffer mappedByteBufferM4106 = AbstractC2207.m4106(this.f4626, iM4095);
                    MappedByteBuffer mappedByteBufferM4107 = AbstractC2207.m4106(this.f4627, iM4095);
                    if (mappedByteBufferM4106 == null || mappedByteBufferM4107 == null) {
                        Log.e("FastKV", this.f4609, new Exception("map failed"));
                        int i6 = this.f4612 - 12;
                        if (this.f4611 != null) {
                            i6 |= 1073741824;
                        }
                        this.f4616.m1274(0, i6);
                        this.f4616.m1275(4, this.f4613);
                        AbstractC2207.m4119(this);
                    } else {
                        this.f4628 = mappedByteBufferM4106;
                        this.f4629 = mappedByteBufferM4107;
                    }
                }
            } else {
                AbstractC0743.m2179(this, i3);
            }
        }
        int i7 = this.f4612;
        this.f4617 = i7;
        this.f4612 = this.f4618 + i7;
        C0221 c0221 = this.f4616;
        c0221.f1351 = i7;
        c0221.m1271(b);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final synchronized void m2963(String str, byte[] bArr) {
        Throwable th;
        try {
            try {
                m2956(str);
                try {
                    if (bArr == null) {
                        remove(str);
                    } else {
                        AbstractC0824 abstractC0824 = (AbstractC0824) this.f4614.get(str);
                        if (abstractC0824 != null && abstractC0824.mo2372() != 7) {
                            remove(str);
                            abstractC0824 = null;
                        }
                        C0823 c0823 = (C0823) abstractC0824;
                        C0403 c0403 = this.f4611;
                        m2957(str, bArr, c0403 != null ? c0403.m1593(bArr) : bArr, c0823, (byte) 7);
                        m2960(str);
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
    public final synchronized void m2964(String str, Object obj, C2840 c2840) {
        Throwable th;
        byte[] bArrM4827;
        try {
            try {
                m2956(str);
                if (c2840 == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f4610.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0824 abstractC0824 = null;
                    try {
                        bArrM4827 = c2840.m4827(obj);
                    } catch (Exception e) {
                        Log.e("FastKV", this.f4609, e);
                        bArrM4827 = null;
                    }
                    if (bArrM4827 == null) {
                        remove(str);
                        return;
                    }
                    AbstractC0824 abstractC0825 = (AbstractC0824) this.f4614.get(str);
                    if (abstractC0825 == null || abstractC0825.mo2372() == 8) {
                        abstractC0824 = abstractC0825;
                    } else {
                        remove(str);
                    }
                    C0830 c0830 = (C0830) abstractC0824;
                    int iM1257 = C0221.m1257("StringSet");
                    C0221 c0221 = new C0221(iM1257 + 1 + bArrM4827.length);
                    c0221.m1271((byte) iM1257);
                    c0221.m1276("StringSet");
                    c0221.m1272(bArrM4827);
                    byte[] bArrM1593 = (byte[]) c0221.f1353;
                    C0403 c0403 = this.f4611;
                    if (c0403 != null) {
                        bArrM1593 = c0403.m1593(bArrM1593);
                    }
                    byte[] bArr = bArrM1593;
                    if (bArr == null) {
                        return;
                    }
                    m2957(str, obj, bArr, c0830, (byte) 8);
                    m2960(str);
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
    public final void m2965(byte b, int i, int i2) {
        this.f4622 = (i2 - i) + this.f4622;
        C2647 c2647 = new C2647();
        c2647.f8546 = i;
        c2647.f8547 = i2;
        this.f4623.add(c2647);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f4616.f1353;
        this.f4613 = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f4613;
        bArr[i] = b2;
        this.f4630 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2966(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f4613);
        int i = this.f4630;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f4616.f1353)[i]);
        }
        if (this.f4618 != 0) {
            mappedByteBuffer.position(this.f4617);
            mappedByteBuffer.put((byte[]) this.f4616.f1353, this.f4617, this.f4618);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2967(byte b, int i) {
        long jM4115 = this.f4613 ^ AbstractC2207.m4115(i, 1L);
        this.f4613 = jM4115;
        if (this.f4631 == 0) {
            this.f4628.putLong(4, jM4115);
            this.f4628.put(i, b);
            this.f4629.putLong(4, this.f4613);
            this.f4629.put(i, b);
        } else {
            this.f4616.m1275(4, jM4115);
        }
        ((byte[]) this.f4616.f1353)[i] = b;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2968() {
        this.f4613 ^= this.f4616.m1261(this.f4617, this.f4618);
        int i = this.f4612 - 12;
        if (this.f4611 != null) {
            i |= 1073741824;
        }
        if (this.f4631 == 0) {
            this.f4628.putInt(0, -1);
            m2966(this.f4628);
            this.f4628.putInt(0, i);
            this.f4629.putInt(0, i);
            m2966(this.f4629);
        } else {
            this.f4616.m1274(0, i);
            this.f4616.m1275(4, this.f4613);
        }
        this.f4630 = 0;
        this.f4618 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2969(int i, long j, int i2) {
        long jM4115 = AbstractC2207.m4115(i2, j) ^ this.f4613;
        this.f4613 = jM4115;
        if (this.f4631 == 0) {
            this.f4628.putLong(4, jM4115);
            this.f4628.putInt(i2, i);
            this.f4629.putLong(4, this.f4613);
            this.f4629.putInt(i2, i);
        } else {
            this.f4616.m1275(4, jM4115);
        }
        this.f4616.m1274(i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2970(long j, long j2, int i) {
        long jM4115 = AbstractC2207.m4115(i, j2) ^ this.f4613;
        this.f4613 = jM4115;
        if (this.f4631 == 0) {
            this.f4628.putLong(4, jM4115);
            this.f4628.putLong(i, j);
            this.f4629.putLong(4, this.f4613);
            this.f4629.putLong(i, j);
        } else {
            this.f4616.m1275(4, jM4115);
        }
        this.f4616.m1275(i, j);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int m2971(String str, byte[] bArr, byte b) {
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
        m2972(str, b, (z ? 4 : 2) + bArr.length);
        if (z) {
            this.f4616.m1273(bArr.length);
        } else {
            C0221 c0221 = this.f4616;
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c0221.f1353;
            int i = c0221.f1351;
            int i2 = i + 1;
            c0221.f1351 = i2;
            bArr2[i] = (byte) length;
            c0221.f1351 = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C0221 c0222 = this.f4616;
        int i3 = c0222.f1351;
        c0222.m1272(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m2972(String str, byte b, int i) {
        C0403 c0403 = this.f4611;
        if (c0403 != null) {
            byte[] bArrM1593 = c0403.m1593(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM1593.length;
            m2962(b, length, i);
            this.f4616.m1271((byte) length);
            C0221 c0221 = this.f4616;
            System.arraycopy(bArrM1593, 0, (byte[]) c0221.f1353, c0221.f1351, length);
            this.f4616.f1351 += length;
            return;
        }
        int iM1257 = C0221.m1257(str);
        m2962(b, iM1257, i);
        this.f4616.m1271((byte) iM1257);
        if (iM1257 != str.length()) {
            this.f4616.m1276(str);
            return;
        }
        C0221 c0222 = this.f4616;
        str.getBytes(0, iM1257, (byte[]) c0222.f1353, c0222.f1351);
        this.f4616.f1351 += iM1257;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
