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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC3515Ujhhgtgfeyxiexzf implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f10933feyxiexzfUjhhgtg = new byte[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f10934feyxiexzfUjhhgtg = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int f10935feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f10936Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f10937Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f10938Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2496feyxiexzfUjhhgtg f10939Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10940Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public long f10941Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C2344Ujhhgtgfeyxiexzf f10944Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10945Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10946Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f10950Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public FileChannel f10954Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public FileChannel f10955Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public MappedByteBuffer f10956Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MappedByteBuffer f10957Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f10958Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10959Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final HashMap f10942Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public volatile boolean f10943Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f10947Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f10948Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final ExecutorC0079Ujhhgtgfeyxiexzf f10949Ujhhgtgfeyxiexzf = new ExecutorC0079Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f10951Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final ArrayList f10952Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Handler f10953Ujhhgtgfeyxiexzf = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f10960feyxiexzfUjhhgtg = true;

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
        f10935feyxiexzfUjhhgtg = iIntValue;
    }

    public SharedPreferencesC3515Ujhhgtgfeyxiexzf(String str, String str2, C1156feyxiexzfUjhhgtg[] c1156feyxiexzfUjhhgtgArr, C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg, int i) {
        this.f10936Ujhhgtgfeyxiexzf = str;
        this.f10937Ujhhgtgfeyxiexzf = str2;
        this.f10939Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg;
        this.f10959Ujhhgtgfeyxiexzf = i;
        HashMap map = new HashMap();
        if (c1156feyxiexzfUjhhgtgArr != null) {
            for (C1156feyxiexzfUjhhgtg c1156feyxiexzfUjhhgtg : c1156feyxiexzfUjhhgtgArr) {
                c1156feyxiexzfUjhhgtg.getClass();
                if (map.containsKey("StringSet")) {
                    AbstractC1252feyxiexzfUjhhgtg.m2784Ujhhgtgfeyxiexzf(this, "duplicate encoder tag:StringSet");
                } else {
                    map.put("StringSet", c1156feyxiexzfUjhhgtg);
                }
            }
        }
        map.put("StringSet", C1156feyxiexzfUjhhgtg.f4351Ujhhgtgfeyxiexzf);
        this.f10938Ujhhgtgfeyxiexzf = map;
        synchronized (this.f10942Ujhhgtgfeyxiexzf) {
            AbstractC3516feyxiexzfUjhhgtg.m5058Ujhhgtgfeyxiexzf().execute(new RunnableC3513feyxiexzfUjhhgtg(this, 1));
            if (!this.f10943Ujhhgtgfeyxiexzf) {
                try {
                    this.f10942Ujhhgtgfeyxiexzf.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m5030Ujhhgtgfeyxiexzf(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        this.f10960feyxiexzfUjhhgtg = true;
        m5032Ujhhgtgfeyxiexzf();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            AbstractC2855feyxiexzfUjhhgtg.m4196Ujhhgtgfeyxiexzf(this);
            if (this.f10959Ujhhgtgfeyxiexzf != 0) {
                AbstractC2855feyxiexzfUjhhgtg.m4205feyxiexzfUjhhgtg(this);
            }
            m5035Ujhhgtgfeyxiexzf(null);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        this.f10960feyxiexzfUjhhgtg = true;
        return m5032Ujhhgtgfeyxiexzf();
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.f10942Ujhhgtgfeyxiexzf.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        Object objValueOf;
        int size = this.f10942Ujhhgtgfeyxiexzf.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry entry : this.f10942Ujhhgtgfeyxiexzf.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) entry.getValue();
            switch (abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf()) {
                case 1:
                    objValueOf = Boolean.valueOf(((C3687Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf).f11717Ujhhgtgfeyxiexzf);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((C3690Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf).f11720Ujhhgtgfeyxiexzf);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((C3689Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf).f11719Ujhhgtgfeyxiexzf);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((C3691feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf).f11721Ujhhgtgfeyxiexzf);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((C3688Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf).f11718Ujhhgtgfeyxiexzf);
                    break;
                case 6:
                    C3693feyxiexzfUjhhgtg c3693feyxiexzfUjhhgtg = (C3693feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                    objValueOf = c3693feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf ? AbstractC2855feyxiexzfUjhhgtg.m4214Ujhhgtgfeyxiexzf(this, c3693feyxiexzfUjhhgtg, this.f10939Ujhhgtgfeyxiexzf) : c3693feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf;
                    break;
                case 7:
                    C3685Ujhhgtgfeyxiexzf c3685Ujhhgtgfeyxiexzf = (C3685Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf;
                    objValueOf = c3685Ujhhgtgfeyxiexzf.f11726Ujhhgtgfeyxiexzf ? AbstractC2855feyxiexzfUjhhgtg.m4207feyxiexzfUjhhgtg(this, c3685Ujhhgtgfeyxiexzf, this.f10939Ujhhgtgfeyxiexzf) : c3685Ujhhgtgfeyxiexzf.f11723Ujhhgtgfeyxiexzf;
                    break;
                case 8:
                    C3692feyxiexzfUjhhgtg c3692feyxiexzfUjhhgtg = (C3692feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                    objValueOf = c3692feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf ? AbstractC2855feyxiexzfUjhhgtg.m4213Ujhhgtgfeyxiexzf(this, c3692feyxiexzfUjhhgtg, this.f10939Ujhhgtgfeyxiexzf) : ((C3692feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf).f11723Ujhhgtgfeyxiexzf;
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
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf != null) {
            z = abstractC3686Ujhhgtgfeyxiexzf.mo5375Ujhhgtgfeyxiexzf();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(String str, float f) {
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf != null) {
            f = abstractC3686Ujhhgtgfeyxiexzf.mo5376Ujhhgtgfeyxiexzf();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(String str, int i) {
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf != null) {
            i = abstractC3686Ujhhgtgfeyxiexzf.mo5377Ujhhgtgfeyxiexzf();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(String str, long j) {
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf != null) {
            j = abstractC3686Ujhhgtgfeyxiexzf.mo5378Ujhhgtgfeyxiexzf();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final synchronized String getString(String str, String str2) {
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf == null) {
            return str2;
        }
        if (abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() == 6) {
            C3693feyxiexzfUjhhgtg c3693feyxiexzfUjhhgtg = (C3693feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
            if (c3693feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf) {
                String strM4214Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4214Ujhhgtgfeyxiexzf(this, c3693feyxiexzfUjhhgtg, this.f10939Ujhhgtgfeyxiexzf);
                if (strM4214Ujhhgtgfeyxiexzf != null && !strM4214Ujhhgtgfeyxiexzf.isEmpty()) {
                    c3693feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf = strM4214Ujhhgtgfeyxiexzf;
                    c3693feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf = false;
                    return strM4214Ujhhgtgfeyxiexzf;
                }
                remove(str);
                return str2;
            }
        }
        return abstractC3686Ujhhgtgfeyxiexzf.mo5379Ujhhgtgfeyxiexzf();
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set set2;
        synchronized (this) {
            set2 = (Set) m5033Ujhhgtgfeyxiexzf(str);
        }
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        try {
            m5030Ujhhgtgfeyxiexzf(str);
            AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
            if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 1) {
                remove(str);
                abstractC3686Ujhhgtgfeyxiexzf = null;
            }
            C3687Ujhhgtgfeyxiexzf c3687Ujhhgtgfeyxiexzf = (C3687Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf;
            if (c3687Ujhhgtgfeyxiexzf == null) {
                m5046Ujhhgtgfeyxiexzf(str, (byte) 1, f10934feyxiexzfUjhhgtg[1]);
                C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
                int i = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                c2344Ujhhgtgfeyxiexzf.m3547Ujhhgtgfeyxiexzf(z ? (byte) 1 : (byte) 0);
                m5042Ujhhgtgfeyxiexzf();
                this.f10942Ujhhgtgfeyxiexzf.put(str, new C3687Ujhhgtgfeyxiexzf(i, z));
                m5034Ujhhgtgfeyxiexzf(str);
            } else if (c3687Ujhhgtgfeyxiexzf.f11717Ujhhgtgfeyxiexzf != z) {
                c3687Ujhhgtgfeyxiexzf.f11717Ujhhgtgfeyxiexzf = z;
                m5041Ujhhgtgfeyxiexzf(z ? (byte) 1 : (byte) 0, c3687Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf);
                m5034Ujhhgtgfeyxiexzf(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            m5030Ujhhgtgfeyxiexzf(str);
            AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
            if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 3) {
                remove(str);
                abstractC3686Ujhhgtgfeyxiexzf = null;
            }
            C3689Ujhhgtgfeyxiexzf c3689Ujhhgtgfeyxiexzf = (C3689Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf;
            if (c3689Ujhhgtgfeyxiexzf == null) {
                m5046Ujhhgtgfeyxiexzf(str, (byte) 3, f10934feyxiexzfUjhhgtg[3]);
                C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
                int i = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                int iFloatToRawIntBits = Float.floatToRawIntBits(f);
                C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                if (c2496feyxiexzfUjhhgtg != null) {
                    iFloatToRawIntBits ^= c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
                }
                c2344Ujhhgtgfeyxiexzf.m3549Ujhhgtgfeyxiexzf(iFloatToRawIntBits);
                m5042Ujhhgtgfeyxiexzf();
                this.f10942Ujhhgtgfeyxiexzf.put(str, new C3689Ujhhgtgfeyxiexzf(i, f));
                m5034Ujhhgtgfeyxiexzf(str);
            } else if (c3689Ujhhgtgfeyxiexzf.f11719Ujhhgtgfeyxiexzf != f) {
                int iFloatToRawIntBits2 = Float.floatToRawIntBits(f);
                C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg2 = this.f10939Ujhhgtgfeyxiexzf;
                if (c2496feyxiexzfUjhhgtg2 != null) {
                    iFloatToRawIntBits2 ^= c2496feyxiexzfUjhhgtg2.f8156Ujhhgtgfeyxiexzf;
                }
                long jM3540Ujhhgtgfeyxiexzf = ((long) (this.f10944Ujhhgtgfeyxiexzf.m3540Ujhhgtgfeyxiexzf(c3689Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf) ^ iFloatToRawIntBits2)) & 4294967295L;
                c3689Ujhhgtgfeyxiexzf.f11719Ujhhgtgfeyxiexzf = f;
                m5043Ujhhgtgfeyxiexzf(iFloatToRawIntBits2, jM3540Ujhhgtgfeyxiexzf, c3689Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf);
                m5034Ujhhgtgfeyxiexzf(str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor putInt(String str, int i) {
        try {
            m5030Ujhhgtgfeyxiexzf(str);
            AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
            if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 2) {
                remove(str);
                abstractC3686Ujhhgtgfeyxiexzf = null;
            }
            C3690Ujhhgtgfeyxiexzf c3690Ujhhgtgfeyxiexzf = (C3690Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf;
            if (c3690Ujhhgtgfeyxiexzf == null) {
                m5046Ujhhgtgfeyxiexzf(str, (byte) 2, f10934feyxiexzfUjhhgtg[2]);
                C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
                int i2 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                c2344Ujhhgtgfeyxiexzf.m3549Ujhhgtgfeyxiexzf(c2496feyxiexzfUjhhgtg != null ? c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf ^ i : i);
                m5042Ujhhgtgfeyxiexzf();
                this.f10942Ujhhgtgfeyxiexzf.put(str, new C3690Ujhhgtgfeyxiexzf(i2, i));
                m5034Ujhhgtgfeyxiexzf(str);
            } else {
                int iM3540Ujhhgtgfeyxiexzf = c3690Ujhhgtgfeyxiexzf.f11720Ujhhgtgfeyxiexzf;
                if (iM3540Ujhhgtgfeyxiexzf != i) {
                    C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg2 = this.f10939Ujhhgtgfeyxiexzf;
                    int i3 = c2496feyxiexzfUjhhgtg2 != null ? c2496feyxiexzfUjhhgtg2.f8156Ujhhgtgfeyxiexzf ^ i : i;
                    if (c2496feyxiexzfUjhhgtg2 != null) {
                        iM3540Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf.m3540Ujhhgtgfeyxiexzf(c3690Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf);
                    }
                    c3690Ujhhgtgfeyxiexzf.f11720Ujhhgtgfeyxiexzf = i;
                    m5043Ujhhgtgfeyxiexzf(i3, ((long) (iM3540Ujhhgtgfeyxiexzf ^ i3)) & 4294967295L, c3690Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf);
                    m5034Ujhhgtgfeyxiexzf(str);
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
        SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf;
        try {
            try {
                m5030Ujhhgtgfeyxiexzf(str);
                AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
                if (abstractC3686Ujhhgtgfeyxiexzf != null) {
                    try {
                        if (abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 4) {
                            remove(str);
                            abstractC3686Ujhhgtgfeyxiexzf = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C3691feyxiexzfUjhhgtg c3691feyxiexzfUjhhgtg = (C3691feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                if (c3691feyxiexzfUjhhgtg != null) {
                    long jM3541Ujhhgtgfeyxiexzf = c3691feyxiexzfUjhhgtg.f11721Ujhhgtgfeyxiexzf;
                    if (jM3541Ujhhgtgfeyxiexzf != j) {
                        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                        long j2 = c2496feyxiexzfUjhhgtg != null ? ((long) c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf) ^ j : j;
                        if (c2496feyxiexzfUjhhgtg != null) {
                            jM3541Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf.m3541Ujhhgtgfeyxiexzf(c3691feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf);
                        }
                        long j3 = jM3541Ujhhgtgfeyxiexzf ^ j2;
                        c3691feyxiexzfUjhhgtg.f11721Ujhhgtgfeyxiexzf = j;
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf = this;
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf.m5044Ujhhgtgfeyxiexzf(j2, j3, c3691feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf);
                        m5034Ujhhgtgfeyxiexzf(str);
                    }
                    return sharedPreferencesC3515Ujhhgtgfeyxiexzf;
                }
                m5046Ujhhgtgfeyxiexzf(str, (byte) 4, f10934feyxiexzfUjhhgtg[4]);
                C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
                int i = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg2 = this.f10939Ujhhgtgfeyxiexzf;
                c2344Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(i, c2496feyxiexzfUjhhgtg2 != null ? ((long) c2496feyxiexzfUjhhgtg2.f8156Ujhhgtgfeyxiexzf) ^ j : j);
                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += 8;
                m5042Ujhhgtgfeyxiexzf();
                this.f10942Ujhhgtgfeyxiexzf.put(str, new C3691feyxiexzfUjhhgtg(i, j));
                m5034Ujhhgtgfeyxiexzf(str);
                sharedPreferencesC3515Ujhhgtgfeyxiexzf = this;
                return sharedPreferencesC3515Ujhhgtgfeyxiexzf;
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
        SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf;
        try {
            try {
                m5030Ujhhgtgfeyxiexzf(str);
                try {
                    if (str2 != null) {
                        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
                        if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 6) {
                            remove(str);
                            abstractC3686Ujhhgtgfeyxiexzf = null;
                        }
                        C3693feyxiexzfUjhhgtg c3693feyxiexzfUjhhgtg = (C3693feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                        if (c3693feyxiexzfUjhhgtg != null && !c3693feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf && str2.equals(c3693feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf)) {
                            return this;
                        }
                        byte[] bytes = str2.isEmpty() ? f10933feyxiexzfUjhhgtg : str2.getBytes(StandardCharsets.UTF_8);
                        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                        if (c2496feyxiexzfUjhhgtg != null) {
                            bytes = c2496feyxiexzfUjhhgtg.m3777Ujhhgtgfeyxiexzf(bytes);
                        }
                        byte[] bArr = bytes;
                        if (bArr == null) {
                            Log.e("FastKV", this.f10937Ujhhgtgfeyxiexzf, new Exception("Encrypt failed"));
                            return this;
                        }
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf = this;
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf.m5031Ujhhgtgfeyxiexzf(str, str2, bArr, c3693feyxiexzfUjhhgtg, (byte) 6);
                        m5034Ujhhgtgfeyxiexzf(str);
                        throw th;
                    }
                    remove(str);
                    sharedPreferencesC3515Ujhhgtgfeyxiexzf = this;
                    return sharedPreferencesC3515Ujhhgtgfeyxiexzf;
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
                m5038Ujhhgtgfeyxiexzf(str, set, C1156feyxiexzfUjhhgtg.f4351Ujhhgtgfeyxiexzf);
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
        if (!this.f10952Ujhhgtgfeyxiexzf.contains(onSharedPreferenceChangeListener)) {
            this.f10952Ujhhgtgfeyxiexzf.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
            if (abstractC3686Ujhhgtgfeyxiexzf != null) {
                this.f10942Ujhhgtgfeyxiexzf.remove(str);
                byte bMo5374Ujhhgtgfeyxiexzf = abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf();
                String str2 = null;
                if (bMo5374Ujhhgtgfeyxiexzf <= 5) {
                    int iM3535Ujhhgtgfeyxiexzf = C2344Ujhhgtgfeyxiexzf.m3535Ujhhgtgfeyxiexzf(str);
                    int i = abstractC3686Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf;
                    m5039Ujhhgtgfeyxiexzf(bMo5374Ujhhgtgfeyxiexzf, i - (iM3535Ujhhgtgfeyxiexzf + 2), i + f10934feyxiexzfUjhhgtg[bMo5374Ujhhgtgfeyxiexzf]);
                } else {
                    AbstractC3694feyxiexzfUjhhgtg abstractC3694feyxiexzfUjhhgtg = (AbstractC3694feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                    m5039Ujhhgtgfeyxiexzf(bMo5374Ujhhgtgfeyxiexzf, abstractC3694feyxiexzfUjhhgtg.f11724Ujhhgtgfeyxiexzf, abstractC3694feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf + abstractC3694feyxiexzfUjhhgtg.f11725Ujhhgtgfeyxiexzf);
                    if (abstractC3694feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf) {
                        str2 = (String) abstractC3694feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf;
                    }
                }
                byte b = (byte) (bMo5374Ujhhgtgfeyxiexzf | (-128));
                if (this.f10959Ujhhgtgfeyxiexzf == 0) {
                    this.f10956Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
                    this.f10956Ujhhgtgfeyxiexzf.put(this.f10958Ujhhgtgfeyxiexzf, b);
                    this.f10957Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
                    this.f10957Ujhhgtgfeyxiexzf.put(this.f10958Ujhhgtgfeyxiexzf, b);
                } else {
                    this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, this.f10941Ujhhgtgfeyxiexzf);
                }
                this.f10958Ujhhgtgfeyxiexzf = 0;
                if (str2 != null) {
                    if (this.f10959Ujhhgtgfeyxiexzf == 0) {
                        AbstractC3516feyxiexzfUjhhgtg.m5058Ujhhgtgfeyxiexzf().execute(new RunnableC3468feyxiexzfUjhhgtg(this, 0, str2));
                    } else {
                        this.f10947Ujhhgtgfeyxiexzf.add(str2);
                    }
                }
                if (this.f10950Ujhhgtgfeyxiexzf >= 8192 || this.f10951Ujhhgtgfeyxiexzf.size() >= 100) {
                    AbstractC3593Ujhhgtgfeyxiexzf.m5154Ujhhgtgfeyxiexzf(this, 0);
                }
                if (this.f10959Ujhhgtgfeyxiexzf != 0 && this.f10960feyxiexzfUjhhgtg) {
                    m5032Ujhhgtgfeyxiexzf();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "FastKV: path:" + this.f10936Ujhhgtgfeyxiexzf + " name:" + this.f10937Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10952Ujhhgtgfeyxiexzf.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5031Ujhhgtgfeyxiexzf(String str, Object obj, byte[] bArr, AbstractC3694feyxiexzfUjhhgtg abstractC3694feyxiexzfUjhhgtg, byte b) {
        Object c3685Ujhhgtgfeyxiexzf;
        if (abstractC3694feyxiexzfUjhhgtg == null) {
            int iM5045Ujhhgtgfeyxiexzf = m5045Ujhhgtgfeyxiexzf(str, bArr, b);
            if (iM5045Ujhhgtgfeyxiexzf > 0) {
                int length = bArr.length;
                if (b == 6) {
                    c3685Ujhhgtgfeyxiexzf = new C3693feyxiexzfUjhhgtg(this.f10945Ujhhgtgfeyxiexzf, iM5045Ujhhgtgfeyxiexzf, (String) obj, length, false);
                } else {
                    c3685Ujhhgtgfeyxiexzf = b == 7 ? new C3685Ujhhgtgfeyxiexzf(this.f10945Ujhhgtgfeyxiexzf, iM5045Ujhhgtgfeyxiexzf, obj, length, false) : new C3692feyxiexzfUjhhgtg(this.f10945Ujhhgtgfeyxiexzf, iM5045Ujhhgtgfeyxiexzf, obj, length, false);
                }
                this.f10942Ujhhgtgfeyxiexzf.put(str, c3685Ujhhgtgfeyxiexzf);
                m5042Ujhhgtgfeyxiexzf();
                return;
            }
            return;
        }
        if (abstractC3694feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf || abstractC3694feyxiexzfUjhhgtg.f11725Ujhhgtgfeyxiexzf != bArr.length) {
            int iM5045Ujhhgtgfeyxiexzf2 = m5045Ujhhgtgfeyxiexzf(str, bArr, abstractC3694feyxiexzfUjhhgtg.mo5374Ujhhgtgfeyxiexzf());
            if (iM5045Ujhhgtgfeyxiexzf2 > 0) {
                String str2 = abstractC3694feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf ? (String) abstractC3694feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf : null;
                m5039Ujhhgtgfeyxiexzf(abstractC3694feyxiexzfUjhhgtg.mo5374Ujhhgtgfeyxiexzf(), abstractC3694feyxiexzfUjhhgtg.f11724Ujhhgtgfeyxiexzf, abstractC3694feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf + abstractC3694feyxiexzfUjhhgtg.f11725Ujhhgtgfeyxiexzf);
                abstractC3694feyxiexzfUjhhgtg.f11724Ujhhgtgfeyxiexzf = this.f10945Ujhhgtgfeyxiexzf;
                abstractC3694feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf = iM5045Ujhhgtgfeyxiexzf2;
                abstractC3694feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf = false;
                abstractC3694feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf = obj;
                abstractC3694feyxiexzfUjhhgtg.f11725Ujhhgtgfeyxiexzf = bArr.length;
                m5042Ujhhgtgfeyxiexzf();
                if (this.f10950Ujhhgtgfeyxiexzf >= 8192 || this.f10951Ujhhgtgfeyxiexzf.size() >= 100) {
                    AbstractC3593Ujhhgtgfeyxiexzf.m5154Ujhhgtgfeyxiexzf(this, 0);
                }
                if (str2 != null) {
                    if (this.f10959Ujhhgtgfeyxiexzf == 0) {
                        AbstractC3516feyxiexzfUjhhgtg.m5058Ujhhgtgfeyxiexzf().execute(new RunnableC3468feyxiexzfUjhhgtg(this, 0, str2));
                        return;
                    } else {
                        this.f10947Ujhhgtgfeyxiexzf.add(str2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i = abstractC3694feyxiexzfUjhhgtg.f11716Ujhhgtgfeyxiexzf;
        int length2 = bArr.length;
        this.f10941Ujhhgtgfeyxiexzf ^= this.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(i, length2);
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i;
        c2344Ujhhgtgfeyxiexzf.m3548Ujhhgtgfeyxiexzf(bArr);
        long jM3538Ujhhgtgfeyxiexzf = this.f10941Ujhhgtgfeyxiexzf ^ this.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(i, length2);
        this.f10941Ujhhgtgfeyxiexzf = jM3538Ujhhgtgfeyxiexzf;
        if (this.f10959Ujhhgtgfeyxiexzf == 0) {
            this.f10956Ujhhgtgfeyxiexzf.putInt(0, -1);
            this.f10956Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
            this.f10956Ujhhgtgfeyxiexzf.position(i);
            this.f10956Ujhhgtgfeyxiexzf.put(bArr);
            MappedByteBuffer mappedByteBuffer = this.f10956Ujhhgtgfeyxiexzf;
            int i2 = this.f10940Ujhhgtgfeyxiexzf - 12;
            if (this.f10939Ujhhgtgfeyxiexzf != null) {
                i2 |= 1073741824;
            }
            mappedByteBuffer.putInt(0, i2);
            this.f10957Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
            this.f10957Ujhhgtgfeyxiexzf.position(i);
            this.f10957Ujhhgtgfeyxiexzf.put(bArr);
        } else {
            this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, jM3538Ujhhgtgfeyxiexzf);
        }
        abstractC3694feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m5032Ujhhgtgfeyxiexzf() {
        int i = this.f10959Ujhhgtgfeyxiexzf;
        if (i == 1) {
            this.f10949Ujhhgtgfeyxiexzf.execute(new RunnableC3513feyxiexzfUjhhgtg(this, 0));
            return true;
        }
        if (i == 2) {
            return AbstractC2855feyxiexzfUjhhgtg.m4233Ujhhgtgfeyxiexzf(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final synchronized Object m5033Ujhhgtgfeyxiexzf(String str) {
        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
        if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() == 8) {
            C3692feyxiexzfUjhhgtg c3692feyxiexzfUjhhgtg = (C3692feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
            if (!c3692feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf) {
                return c3692feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf;
            }
            LinkedHashSet linkedHashSetM4213Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4213Ujhhgtgfeyxiexzf(this, c3692feyxiexzfUjhhgtg, this.f10939Ujhhgtgfeyxiexzf);
            if (linkedHashSetM4213Ujhhgtgfeyxiexzf == null) {
                remove(str);
                return null;
            }
            c3692feyxiexzfUjhhgtg.f11723Ujhhgtgfeyxiexzf = linkedHashSetM4213Ujhhgtgfeyxiexzf;
            c3692feyxiexzfUjhhgtg.f11726Ujhhgtgfeyxiexzf = false;
            return linkedHashSetM4213Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m5034Ujhhgtgfeyxiexzf(String str) {
        if (this.f10959Ujhhgtgfeyxiexzf != 0 && this.f10960feyxiexzfUjhhgtg) {
            m5032Ujhhgtgfeyxiexzf();
        }
        m5035Ujhhgtgfeyxiexzf(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized void m5035Ujhhgtgfeyxiexzf(String str) {
        if (this.f10952Ujhhgtgfeyxiexzf.isEmpty()) {
            return;
        }
        Iterator it = this.f10952Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            this.f10953Ujhhgtgfeyxiexzf.post(new RunnableC3392Ujhhgtgfeyxiexzf(this, (SharedPreferences.OnSharedPreferenceChangeListener) it.next(), str, 1));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m5036Ujhhgtgfeyxiexzf(byte b, int i, int i2) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
        int i3 = i + 2 + i2;
        this.f10946Ujhhgtgfeyxiexzf = i3;
        int length = ((byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf).length;
        int i4 = this.f10940Ujhhgtgfeyxiexzf + i3;
        if (i4 >= length) {
            int i5 = this.f10950Ujhhgtgfeyxiexzf;
            if (i5 <= i3 || i5 <= 8192) {
                int iM4212Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4212Ujhhgtgfeyxiexzf(length, i4);
                byte[] bArr = new byte[iM4212Ujhhgtgfeyxiexzf];
                System.arraycopy((byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, 0, bArr, 0, this.f10940Ujhhgtgfeyxiexzf);
                this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf = bArr;
                if (this.f10959Ujhhgtgfeyxiexzf == 0) {
                    MappedByteBuffer mappedByteBufferM4224Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4224Ujhhgtgfeyxiexzf(this.f10954Ujhhgtgfeyxiexzf, iM4212Ujhhgtgfeyxiexzf);
                    MappedByteBuffer mappedByteBufferM4224Ujhhgtgfeyxiexzf2 = AbstractC2855feyxiexzfUjhhgtg.m4224Ujhhgtgfeyxiexzf(this.f10955Ujhhgtgfeyxiexzf, iM4212Ujhhgtgfeyxiexzf);
                    if (mappedByteBufferM4224Ujhhgtgfeyxiexzf == null || mappedByteBufferM4224Ujhhgtgfeyxiexzf2 == null) {
                        Log.e("FastKV", this.f10937Ujhhgtgfeyxiexzf, new Exception("map failed"));
                        int i6 = this.f10940Ujhhgtgfeyxiexzf - 12;
                        if (this.f10939Ujhhgtgfeyxiexzf != null) {
                            i6 |= 1073741824;
                        }
                        this.f10944Ujhhgtgfeyxiexzf.m3550Ujhhgtgfeyxiexzf(0, i6);
                        this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, this.f10941Ujhhgtgfeyxiexzf);
                        AbstractC2855feyxiexzfUjhhgtg.m4229Ujhhgtgfeyxiexzf(this);
                    } else {
                        this.f10956Ujhhgtgfeyxiexzf = mappedByteBufferM4224Ujhhgtgfeyxiexzf;
                        this.f10957Ujhhgtgfeyxiexzf = mappedByteBufferM4224Ujhhgtgfeyxiexzf2;
                    }
                }
            } else {
                AbstractC3593Ujhhgtgfeyxiexzf.m5154Ujhhgtgfeyxiexzf(this, i3);
            }
        }
        int i7 = this.f10940Ujhhgtgfeyxiexzf;
        this.f10945Ujhhgtgfeyxiexzf = i7;
        this.f10940Ujhhgtgfeyxiexzf = this.f10946Ujhhgtgfeyxiexzf + i7;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i7;
        c2344Ujhhgtgfeyxiexzf.m3547Ujhhgtgfeyxiexzf(b);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final synchronized void m5037Ujhhgtgfeyxiexzf(String str, byte[] bArr) {
        Throwable th;
        try {
            try {
                m5030Ujhhgtgfeyxiexzf(str);
                try {
                    if (bArr == null) {
                        remove(str);
                    } else {
                        AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
                        if (abstractC3686Ujhhgtgfeyxiexzf != null && abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() != 7) {
                            remove(str);
                            abstractC3686Ujhhgtgfeyxiexzf = null;
                        }
                        C3685Ujhhgtgfeyxiexzf c3685Ujhhgtgfeyxiexzf = (C3685Ujhhgtgfeyxiexzf) abstractC3686Ujhhgtgfeyxiexzf;
                        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                        m5031Ujhhgtgfeyxiexzf(str, bArr, c2496feyxiexzfUjhhgtg != null ? c2496feyxiexzfUjhhgtg.m3777Ujhhgtgfeyxiexzf(bArr) : bArr, c3685Ujhhgtgfeyxiexzf, (byte) 7);
                        m5034Ujhhgtgfeyxiexzf(str);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final synchronized void m5038Ujhhgtgfeyxiexzf(String str, Object obj, C1156feyxiexzfUjhhgtg c1156feyxiexzfUjhhgtg) {
        Throwable th;
        byte[] bArrM2649Ujhhgtgfeyxiexzf;
        try {
            try {
                m5030Ujhhgtgfeyxiexzf(str);
                if (c1156feyxiexzfUjhhgtg == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                if (!this.f10938Ujhhgtgfeyxiexzf.containsKey("StringSet")) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (obj == null) {
                        remove(str);
                        return;
                    }
                    AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf = null;
                    try {
                        bArrM2649Ujhhgtgfeyxiexzf = c1156feyxiexzfUjhhgtg.m2649Ujhhgtgfeyxiexzf(obj);
                    } catch (Exception e) {
                        Log.e("FastKV", this.f10937Ujhhgtgfeyxiexzf, e);
                        bArrM2649Ujhhgtgfeyxiexzf = null;
                    }
                    if (bArrM2649Ujhhgtgfeyxiexzf == null) {
                        remove(str);
                        return;
                    }
                    AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf2 = (AbstractC3686Ujhhgtgfeyxiexzf) this.f10942Ujhhgtgfeyxiexzf.get(str);
                    if (abstractC3686Ujhhgtgfeyxiexzf2 == null || abstractC3686Ujhhgtgfeyxiexzf2.mo5374Ujhhgtgfeyxiexzf() == 8) {
                        abstractC3686Ujhhgtgfeyxiexzf = abstractC3686Ujhhgtgfeyxiexzf2;
                    } else {
                        remove(str);
                    }
                    C3692feyxiexzfUjhhgtg c3692feyxiexzfUjhhgtg = (C3692feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf;
                    int iM3535Ujhhgtgfeyxiexzf = C2344Ujhhgtgfeyxiexzf.m3535Ujhhgtgfeyxiexzf("StringSet");
                    C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(iM3535Ujhhgtgfeyxiexzf + 1 + bArrM2649Ujhhgtgfeyxiexzf.length);
                    c2344Ujhhgtgfeyxiexzf.m3547Ujhhgtgfeyxiexzf((byte) iM3535Ujhhgtgfeyxiexzf);
                    c2344Ujhhgtgfeyxiexzf.m3552Ujhhgtgfeyxiexzf("StringSet");
                    c2344Ujhhgtgfeyxiexzf.m3548Ujhhgtgfeyxiexzf(bArrM2649Ujhhgtgfeyxiexzf);
                    byte[] bArrM3777Ujhhgtgfeyxiexzf = (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
                    C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
                    if (c2496feyxiexzfUjhhgtg != null) {
                        bArrM3777Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg.m3777Ujhhgtgfeyxiexzf(bArrM3777Ujhhgtgfeyxiexzf);
                    }
                    byte[] bArr = bArrM3777Ujhhgtgfeyxiexzf;
                    if (bArr == null) {
                        return;
                    }
                    m5031Ujhhgtgfeyxiexzf(str, obj, bArr, c3692feyxiexzfUjhhgtg, (byte) 8);
                    m5034Ujhhgtgfeyxiexzf(str);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5039Ujhhgtgfeyxiexzf(byte b, int i, int i2) {
        this.f10950Ujhhgtgfeyxiexzf = (i2 - i) + this.f10950Ujhhgtgfeyxiexzf;
        C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg = new C1089feyxiexzfUjhhgtg();
        c1089feyxiexzfUjhhgtg.f4169Ujhhgtgfeyxiexzf = i;
        c1089feyxiexzfUjhhgtg.f4170Ujhhgtgfeyxiexzf = i2;
        this.f10951Ujhhgtgfeyxiexzf.add(c1089feyxiexzfUjhhgtg);
        byte b2 = (byte) (b | (-128));
        byte[] bArr = (byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
        this.f10941Ujhhgtgfeyxiexzf = ((((long) (bArr[i] ^ b2)) & 255) << ((i & 7) << 3)) ^ this.f10941Ujhhgtgfeyxiexzf;
        bArr[i] = b2;
        this.f10958Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5040Ujhhgtgfeyxiexzf(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
        int i = this.f10958Ujhhgtgfeyxiexzf;
        if (i != 0) {
            mappedByteBuffer.put(i, ((byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf)[i]);
        }
        if (this.f10946Ujhhgtgfeyxiexzf != 0) {
            mappedByteBuffer.position(this.f10945Ujhhgtgfeyxiexzf);
            mappedByteBuffer.put((byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, this.f10945Ujhhgtgfeyxiexzf, this.f10946Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5041Ujhhgtgfeyxiexzf(byte b, int i) {
        long jM4228Ujhhgtgfeyxiexzf = this.f10941Ujhhgtgfeyxiexzf ^ AbstractC2855feyxiexzfUjhhgtg.m4228Ujhhgtgfeyxiexzf(i, 1L);
        this.f10941Ujhhgtgfeyxiexzf = jM4228Ujhhgtgfeyxiexzf;
        if (this.f10959Ujhhgtgfeyxiexzf == 0) {
            this.f10956Ujhhgtgfeyxiexzf.putLong(4, jM4228Ujhhgtgfeyxiexzf);
            this.f10956Ujhhgtgfeyxiexzf.put(i, b);
            this.f10957Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
            this.f10957Ujhhgtgfeyxiexzf.put(i, b);
        } else {
            this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, jM4228Ujhhgtgfeyxiexzf);
        }
        ((byte[]) this.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf)[i] = b;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m5042Ujhhgtgfeyxiexzf() {
        this.f10941Ujhhgtgfeyxiexzf ^= this.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(this.f10945Ujhhgtgfeyxiexzf, this.f10946Ujhhgtgfeyxiexzf);
        int i = this.f10940Ujhhgtgfeyxiexzf - 12;
        if (this.f10939Ujhhgtgfeyxiexzf != null) {
            i |= 1073741824;
        }
        if (this.f10959Ujhhgtgfeyxiexzf == 0) {
            this.f10956Ujhhgtgfeyxiexzf.putInt(0, -1);
            m5040Ujhhgtgfeyxiexzf(this.f10956Ujhhgtgfeyxiexzf);
            this.f10956Ujhhgtgfeyxiexzf.putInt(0, i);
            this.f10957Ujhhgtgfeyxiexzf.putInt(0, i);
            m5040Ujhhgtgfeyxiexzf(this.f10957Ujhhgtgfeyxiexzf);
        } else {
            this.f10944Ujhhgtgfeyxiexzf.m3550Ujhhgtgfeyxiexzf(0, i);
            this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, this.f10941Ujhhgtgfeyxiexzf);
        }
        this.f10958Ujhhgtgfeyxiexzf = 0;
        this.f10946Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m5043Ujhhgtgfeyxiexzf(int i, long j, int i2) {
        long jM4228Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4228Ujhhgtgfeyxiexzf(i2, j) ^ this.f10941Ujhhgtgfeyxiexzf;
        this.f10941Ujhhgtgfeyxiexzf = jM4228Ujhhgtgfeyxiexzf;
        if (this.f10959Ujhhgtgfeyxiexzf == 0) {
            this.f10956Ujhhgtgfeyxiexzf.putLong(4, jM4228Ujhhgtgfeyxiexzf);
            this.f10956Ujhhgtgfeyxiexzf.putInt(i2, i);
            this.f10957Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
            this.f10957Ujhhgtgfeyxiexzf.putInt(i2, i);
        } else {
            this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, jM4228Ujhhgtgfeyxiexzf);
        }
        this.f10944Ujhhgtgfeyxiexzf.m3550Ujhhgtgfeyxiexzf(i2, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m5044Ujhhgtgfeyxiexzf(long j, long j2, int i) {
        long jM4228Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4228Ujhhgtgfeyxiexzf(i, j2) ^ this.f10941Ujhhgtgfeyxiexzf;
        this.f10941Ujhhgtgfeyxiexzf = jM4228Ujhhgtgfeyxiexzf;
        if (this.f10959Ujhhgtgfeyxiexzf == 0) {
            this.f10956Ujhhgtgfeyxiexzf.putLong(4, jM4228Ujhhgtgfeyxiexzf);
            this.f10956Ujhhgtgfeyxiexzf.putLong(i, j);
            this.f10957Ujhhgtgfeyxiexzf.putLong(4, this.f10941Ujhhgtgfeyxiexzf);
            this.f10957Ujhhgtgfeyxiexzf.putLong(i, j);
        } else {
            this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, jM4228Ujhhgtgfeyxiexzf);
        }
        this.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(i, j);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m5045Ujhhgtgfeyxiexzf(String str, byte[] bArr, byte b) {
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
        m5046Ujhhgtgfeyxiexzf(str, b, (z ? 4 : 2) + bArr.length);
        if (z) {
            this.f10944Ujhhgtgfeyxiexzf.m3549Ujhhgtgfeyxiexzf(bArr.length);
        } else {
            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
            short length = (short) bArr.length;
            byte[] bArr2 = (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            int i = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
            int i2 = i + 1;
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i2;
            bArr2[i] = (byte) length;
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i + 2;
            bArr2[i2] = (byte) (length >> 8);
        }
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf2 = this.f10944Ujhhgtgfeyxiexzf;
        int i3 = c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf2.m3548Ujhhgtgfeyxiexzf(bArr);
        return i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m5046Ujhhgtgfeyxiexzf(String str, byte b, int i) {
        C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = this.f10939Ujhhgtgfeyxiexzf;
        if (c2496feyxiexzfUjhhgtg != null) {
            byte[] bArrM3777Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg.m3777Ujhhgtgfeyxiexzf(str.getBytes(StandardCharsets.UTF_8));
            int length = bArrM3777Ujhhgtgfeyxiexzf.length;
            m5036Ujhhgtgfeyxiexzf(b, length, i);
            this.f10944Ujhhgtgfeyxiexzf.m3547Ujhhgtgfeyxiexzf((byte) length);
            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f10944Ujhhgtgfeyxiexzf;
            System.arraycopy(bArrM3777Ujhhgtgfeyxiexzf, 0, (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf, length);
            this.f10944Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += length;
            return;
        }
        int iM3535Ujhhgtgfeyxiexzf = C2344Ujhhgtgfeyxiexzf.m3535Ujhhgtgfeyxiexzf(str);
        m5036Ujhhgtgfeyxiexzf(b, iM3535Ujhhgtgfeyxiexzf, i);
        this.f10944Ujhhgtgfeyxiexzf.m3547Ujhhgtgfeyxiexzf((byte) iM3535Ujhhgtgfeyxiexzf);
        if (iM3535Ujhhgtgfeyxiexzf != str.length()) {
            this.f10944Ujhhgtgfeyxiexzf.m3552Ujhhgtgfeyxiexzf(str);
            return;
        }
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf2 = this.f10944Ujhhgtgfeyxiexzf;
        str.getBytes(0, iM3535Ujhhgtgfeyxiexzf, (byte[]) c2344Ujhhgtgfeyxiexzf2.f7650Ujhhgtgfeyxiexzf, c2344Ujhhgtgfeyxiexzf2.f7648Ujhhgtgfeyxiexzf);
        this.f10944Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf += iM3535Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
