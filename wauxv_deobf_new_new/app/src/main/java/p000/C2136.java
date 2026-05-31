package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲇᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2136 implements InterfaceC2924, InterfaceC1662 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2135 f7057 = new C2135(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3555 f7058 = new C3555(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f7059;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object f7060;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f7061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f7062;

    public /* synthetic */ C2136(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f7060 = obj2;
        this.f7061 = obj3;
        this.f7062 = obj4;
        this.f7059 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static int m4085(Object obj) {
        Object c2641;
        boolean z = obj instanceof C0569;
        String str = z ? ((C0569) obj).f2355 : "placeholder";
        if (z) {
            obj = ((C0569) obj).f2356;
        }
        Bundle bundle = new Bundle();
        if (obj != null) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Object[]) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else {
                if (!(obj instanceof Serializable)) {
                    throw new IllegalStateException(("Key-Value type " + obj.getClass().getName() + " is not allowed").toString());
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            c2641 = Integer.valueOf(iDataSize);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        Integer num = (Integer) c2641;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final void m4086(C0570 c0570, int i, String str) {
        ArrayList arrayList = C3741.f11709;
        C0569 c0569 = c0570.f2361;
        String str2 = c0569.f2355;
        Object obj = c0569.f2356;
        C3741.m5317(6, "YukiHookDataChannel cannot send this data key of \"" + str2 + "\" type " + (obj != null ? obj.getClass() : null) + ", because it is too large (total " + (i / 1024.0f) + " KB, limit " + (C3749.f11736 / 1024.0f) + " KB) and cannot be segmented\n" + (!AbstractC2901.m4869(str) ? str.concat("\n") : "") + "If you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final void m4087(C0570 c0570, int i, String str) {
        m4086(c0570, i, "Failed to segment " + str + " type because the size of its first element has exceeded the maximum limit");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static C0570 m4088(C0569 c0569, String str, int i, int i2) {
        return new C0570(str, i > 0, i, i2, c0569);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m4090(C2136 c2136, String str, InterfaceC1433 interfaceC1433) {
        String name;
        Context context = (Context) c2136.f7059;
        C3749 c3749 = (C3749) c2136.f7062;
        ConcurrentHashMap concurrentHashMap = c3749.f11739;
        String strM4100 = c2136.m4100();
        if (C3749.f11733) {
            name = "X";
        } else {
            name = context != null ? context.getClass().getName() : "M";
        }
        concurrentHashMap.put(AbstractC2844.m4782(str, strM4100 + "_" + name + "_0"), new C2348(context, new C1513(c3749, c2136, str, interfaceC1433)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m4091(AbstractC0953 abstractC0953) {
        ((C2341) ((C0519) this.f7059).f2208).m4295(abstractC0953);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m4092(AbstractC0953 abstractC0953) {
        ((ArrayList) ((C0519) this.f7059).f2209).add(abstractC0953);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1685(C2982 c2982) {
        AbstractC0953 abstractC0953;
        C2848 c2848 = c2982.f5624;
        C1094 c1094M4630 = AbstractC2649.m4630(c2982);
        C2648 c2648 = c2982.f5623;
        AbstractC0775 abstractC0775 = c2982.f3351;
        int i = c2648.f8360;
        int i2 = c2648.f8356;
        if (i != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c2648.f8360);
        }
        m4091((C0729) this.f7061);
        if (c2648.f8361) {
            m4091(new C0901(c1094M4630, c2848, c2982.f5626, abstractC0775));
            return;
        }
        C2581 c2581M4101 = m4101();
        C2582 c2582M4631 = C2650.m4631(c2982, c2581M4101);
        boolean z = c1094M4630.f3941;
        int i3 = c1094M4630.f3937;
        if ((z || i2 == 43) != (c2581M4101 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c2982);
        }
        AbstractC0953 c0901 = (i2 != 41 || i3 == 35) ? new C0901(c1094M4630, c2848, c2582M4631, abstractC0775) : new C2768(c1094M4630, c2848, c2582M4631);
        C2341 c2341 = (C2341) ((C0519) this.f7059).f2208;
        int size = c2341.f7553.size() - 1;
        while (true) {
            abstractC0953 = null;
            if (size < 0) {
                break;
            }
            if (size < c2341.f7553.size() && size >= 0) {
                abstractC0953 = (AbstractC0953) c2341.f7553.get(size);
            }
            if (abstractC0953.f3483.f3937 != -1) {
                break;
            } else {
                size--;
            }
        }
        if (i3 == 32 && abstractC0953 != null) {
            C2582 c2582 = abstractC0953.f3485;
            int i4 = abstractC0953.f3483.f3937;
            if (i4 == 7 || i4 == 8 || i4 == 9) {
                C2582 c2583 = c0901.f3485;
                if (c2583.f4833.length > 0 && c2582.f4833.length > 1 && ((C2581) c2583.m3165(0)).f8205 == ((C2581) c2582.m3165(1)).f8205) {
                    m4091(new C2768(AbstractC1096.f3944, c2848, C2582.f8208));
                }
            }
        }
        m4091(c0901);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m4093(AbstractC2254 abstractC2254) {
        if (abstractC2254.f7337 != null) {
            m4098();
            ((C2852) this.f7061).m4802('\n');
        }
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1687(C2396 c2396) {
        AbstractC0953 c2768;
        C2648 c2648 = c2396.f5623;
        C2581 c2581 = c2396.f5625;
        int i = c2648.f8356;
        if (i == 54 || i == 56) {
            return;
        }
        C2848 c2848 = c2396.f5624;
        C1094 c1094M4630 = AbstractC2649.m4630(c2396);
        int i2 = c2648.f8360;
        if (i2 == 1 || i2 == 2) {
            c2768 = new C2768(c1094M4630, c2848, C2650.m4631(c2396, c2581));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c2768 = new C2768(c1094M4630, c2848, C2650.m4631(c2396, c2581));
            } else {
                c2768 = new C2955(c1094M4630, c2848, C2650.m4631(c2396, c2581), ((C0729[]) ((C2650) this.f7062).f8365.f1478)[((C0377) this.f7060).f1871.m3548(1)]);
            }
        }
        m4091(c2768);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo1688(C1331 c1331) {
        C2848 c2848 = c1331.f5624;
        AbstractC0775 abstractC0775 = c1331.f4782;
        ArrayList arrayList = c1331.f4781;
        if (c1331.f5623.f8360 != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        C0729 c0729 = new C0729(c2848, false);
        AbstractC0953 c0265 = new C0265(c2848, (C0729) this.f7061, arrayList, abstractC0775);
        AbstractC0953 c2955 = new C2955(AbstractC1096.f3974, c2848, C2650.m4631(c1331, c1331.f5625), c0729);
        m4091((C0729) this.f7061);
        m4091(c2955);
        m4092(new C2300(c2848));
        m4092(c0729);
        m4092(c0265);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1689(C2395 c2395) {
        C2848 c2848 = c2395.f5624;
        AbstractC0775 abstractC0775 = c2395.f3351;
        C2581 c2581 = c2395.f5625;
        C1094 c1094M4630 = AbstractC2649.m4630(c2395);
        C2648 c2648 = c2395.f5623;
        int i = c2648.f8356;
        if (c2648.f8360 != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (i != 3) {
            m4091(new C0901(c1094M4630, c2848, C2650.m4631(c2395, c2581), abstractC0775));
            return;
        }
        C2650 c2650 = (C2650) this.f7062;
        if (c2650.f8371) {
            return;
        }
        m4091(new C2768(c1094M4630, c2848, C2582.m4569(c2581, C2581.m4554((c2650.f8368 - c2650.f8370) + ((C0902) abstractC0775).f3371, c2581.f8206.getType(), null))));
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1690(C1689 c1689) {
        C2848 c2848 = c1689.f5624;
        C1094 c1094M4630 = AbstractC2649.m4630(c1689);
        C2648 c2648 = c1689.f5623;
        if (c2648.f8360 != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c2648.f8360);
        }
        if (!c2648.f8361) {
            throw new RuntimeException("Expected call-like operation");
        }
        m4091((C0729) this.f7061);
        m4091(new C2132(c1094M4630, c2848, c1689.f5626, new AbstractC0775[]{c1689.f5683, c1689.f5684}));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0942 m4094() {
        CharSequence charSequence = (CharSequence) this.f7061;
        C0942 c0942M2555 = C0942.m2555();
        Context context = (Context) this.f7059;
        c0942M2555.f987 = (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.96d);
        if (c0942M2555.f3455 != null) {
            AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        }
        c0942M2555.f3459 = AbstractC0747.m2326(context.getColor(R.color.md_theme_surface), 240);
        if (c0942M2555.f3455 != null) {
            AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        }
        c0942M2555.f3453 = new C2055(charSequence, this);
        if (c0942M2555.f3455 == null) {
            return c0942M2555;
        }
        AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        return c0942M2555;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public synchronized InterfaceC2027 m4095(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2134 c2134 : (ArrayList) this.f7059) {
                if (((HashSet) this.f7061).contains(c2134)) {
                    z = true;
                } else if (c2134.f7051.isAssignableFrom(cls) && c2134.f7052.isAssignableFrom(cls2)) {
                    ((HashSet) this.f7061).add(c2134);
                    arrayList.add(c2134.f7053.mo1261(this));
                    ((HashSet) this.f7061).remove(c2134);
                }
            }
            if (arrayList.size() > 1) {
                C2135 c2135 = (C2135) this.f7060;
                C0253 c0253 = (C0253) this.f7062;
                c2135.getClass();
                return new C0284(arrayList, 2, c0253);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC2027) arrayList.get(0);
            }
            if (z) {
                return f7058;
            }
            throw new C2584("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f7061).clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public synchronized ArrayList m4096(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2134 c2134 : (ArrayList) this.f7059) {
                if (!((HashSet) this.f7061).contains(c2134) && c2134.f7051.isAssignableFrom(cls)) {
                    ((HashSet) this.f7061).add(c2134);
                    arrayList.add(c2134.f7053.mo1261(this));
                    ((HashSet) this.f7061).remove(c2134);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.f7061).clear();
            throw th;
        }
        return arrayList;
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1694(C2928 c2928) {
        C2848 c2848 = c2928.f5624;
        C1676 c1676 = (C1676) c2928.f9360;
        C0377 c0377 = (C0377) this.f7060;
        C1676 c1677 = c0377.f1871;
        int i = c1676.f5648;
        int i2 = c1677.f5648;
        int i3 = c0377.f1872;
        if (i != i2 - 1 || i3 != c1677.m3548(i)) {
            throw new RuntimeException("shouldn't happen");
        }
        C0729[] c0729Arr = new C0729[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0729Arr[i4] = ((C0729[]) ((C2650) this.f7062).f8365.f1478)[c1677.m3548(i4)];
        }
        C0729 c0729 = new C0729(c2848, false);
        C0729 c07210 = new C0729(((C0729) this.f7061).f3484, true);
        C2926 c2926 = new C2926(c2848, c07210, c1676, c0729Arr);
        AbstractC0953 c2955 = new C2955(c2926.f9354 ? AbstractC1096.f3977 : AbstractC1096.f3978, c2848, C2650.m4631(c2928, c2928.f5625), c0729);
        m4091(c07210);
        m4091(c2955);
        m4092(new C2300(c2848));
        m4092(c0729);
        m4092(c2926);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1695(C2928 c2928) {
        C2848 c2848 = c2928.f5624;
        C1094 c1094M4630 = AbstractC2649.m4630(c2928);
        if (c2928.f5623.f8360 != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C2581 c2581M4101 = m4101();
        if (c1094M4630.f3941 == (c2581M4101 != null)) {
            m4091((C0729) this.f7061);
            m4091(new C2768(c1094M4630, c2848, C2650.m4631(c2928, c2581M4101)));
        } else {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c2928);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m4097(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2767) this.f7062).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m4097(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m4098() {
        C2852 c2852 = (C2852) this.f7061;
        StringBuilder sb = c2852.f9076;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        c2852.m4802('\n');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public synchronized ArrayList m4099(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2134 c2134 : (ArrayList) this.f7059) {
            if (!arrayList.contains(c2134.f7052) && c2134.f7051.isAssignableFrom(cls)) {
                arrayList.add(c2134.f7052);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public String m4100() {
        return AbstractC1095.m2794(((String) this.f7060).hashCode(), "_");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C2581 m4101() {
        int i = ((C0377) this.f7060).f1872;
        if (i < 0) {
            return null;
        }
        AbstractC1663 abstractC1663 = (AbstractC1663) ((C0379) ((C2650) this.f7062).f8364.f2879).m1703(i).f1870.m3165(0);
        if (abstractC1663.f5623.f8356 != 56) {
            return null;
        }
        return abstractC1663.f5625;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int m4102() {
        return ((C2852) this.f7061).f9076.length();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void m4103(C0570 c0570) {
        if (AbstractC2240.f7305) {
            String strM2855 = C1139.m2855();
            C0569 c0569 = c0570.f2361;
            String str = c0569.f2355;
            int iM4085 = m4085(c0569);
            if (iM4085 < 0) {
                ArrayList arrayList = C3741.f11709;
                C3741.m5317(6, "YukiHookDataChannel cannot calculate the byte size of the data key of \"" + str + "\" to be sent, so this data cannot be sent\nIf you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
                return;
            }
            if (c0570.f2358) {
                m4104(c0570);
                return;
            }
            int i = C3749.f11736;
            if (iM4085 < i) {
                m4104(c0570);
                return;
            }
            Object obj = c0569.f2356;
            int i2 = 0;
            if (obj instanceof List) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                    if (m4085(arrayList3) >= C3749.f11736 / C3749.f11737) {
                        arrayList2.add(arrayList3);
                        arrayList3 = new ArrayList();
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(arrayList3);
                }
                arrayList2.size();
                ArrayList arrayList4 = !arrayList2.isEmpty() ? arrayList2 : null;
                if (arrayList4 == null) {
                    m4087(c0570, iM4085, "List");
                    return;
                }
                for (Object obj2 : arrayList4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    m4104(m4088(new C0569((List) obj2, str), strM2855, arrayList2.size(), i2));
                    i2 = i3;
                }
                return;
            }
            if (obj instanceof Map) {
                ArrayList arrayList5 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    if (m4085(linkedHashMap) >= C3749.f11736 / C3749.f11737) {
                        arrayList5.add(linkedHashMap);
                        linkedHashMap = new LinkedHashMap();
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    arrayList5.add(linkedHashMap);
                }
                arrayList5.size();
                ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
                if (arrayList6 == null) {
                    m4087(c0570, iM4085, "Map");
                    return;
                }
                for (Object obj3 : arrayList6) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    m4104(m4088(new C0569((Map) obj3, str), strM2855, arrayList5.size(), i2));
                    i2 = i4;
                }
                return;
            }
            if (obj instanceof Set) {
                ArrayList arrayList7 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = ((Set) obj).iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                    if (m4085(linkedHashSet) >= C3749.f11736 / C3749.f11737) {
                        arrayList7.add(linkedHashSet);
                        linkedHashSet = new LinkedHashSet();
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    arrayList7.add(linkedHashSet);
                }
                arrayList7.size();
                ArrayList arrayList8 = !arrayList7.isEmpty() ? arrayList7 : null;
                if (arrayList8 == null) {
                    m4087(c0570, iM4085, "Set");
                    return;
                }
                for (Object obj4 : arrayList8) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    m4104(m4088(new C0569((Set) obj4, str), strM2855, arrayList7.size(), i2));
                    i2 = i5;
                }
                return;
            }
            if (!(obj instanceof String)) {
                if ((obj instanceof byte[]) || (obj instanceof char[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof Object[])) {
                    m4086(c0570, iM4085, "Primitive Array type like String[], int[] ... cannot be segmented, the suggestion is send those data using List type");
                    return;
                } else {
                    m4086(c0570, iM4085, "");
                    return;
                }
            }
            String str2 = (String) obj;
            int i6 = i / 2;
            ArrayList arrayList9 = new ArrayList();
            int length = str2.length();
            if (i6 <= 0) {
                throw new IllegalArgumentException(AbstractC1095.m2795(i6, "Step must be positive, was: ", "."));
            }
            int iM4891 = AbstractC2902.m4891(0, length, i6);
            if (iM4891 >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + i6;
                    if (i8 <= str2.length()) {
                        arrayList9.add(str2.substring(i7, i8));
                    } else {
                        arrayList9.add(str2.substring(i7, str2.length()));
                    }
                    if (i7 == iM4891) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            if (arrayList9.size() == 1) {
                m4104(c0570);
                return;
            }
            arrayList9.size();
            ArrayList arrayList10 = !arrayList9.isEmpty() ? arrayList9 : null;
            if (arrayList10 == null) {
                m4087(c0570, iM4085, "String");
                return;
            }
            for (Object obj5 : arrayList10) {
                int i9 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0740.m2312();
                    throw null;
                }
                m4104(m4088(new C0569((String) obj5, str), strM2855, arrayList9.size(), i2));
                i2 = i9;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public void m4104(C0570 c0570) {
        String str = (String) this.f7060;
        C0569 c0569 = c0570.f2361;
        Context contextM1483 = (Context) this.f7059;
        if (contextM1483 == null) {
            C0261.f1489.getClass();
            contextM1483 = C0261.m1483();
        }
        if (contextM1483 == null) {
            ArrayList arrayList = C3741.f11709;
            C3741.m5317(6, "Failed to sendBroadcast like \"" + c0569.f2355 + "\", because got null context in \"" + str + "\"", null);
            return;
        }
        Intent intent = new Intent();
        if (!AbstractC2901.m4869("")) {
            intent.setPackage("");
        }
        boolean z = C3749.f11733;
        intent.setAction(z ? C3749.m5352(null) : C3749.m5351(str));
        if (!AbstractC1469.m3322(str, "android")) {
            if (z) {
                str = C3755.f11765;
            }
            intent.setPackage(str);
        }
        intent.putExtra(c0569.f2355 + m4100(), c0570);
        contextM1483.sendBroadcast(intent, null, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m4105(AbstractC2254 abstractC2254, int i) {
        Class<?> cls = abstractC2254.getClass();
        C1927 c1927 = (C1927) this.f7059;
        C0410 c0410 = (C0410) ((C1477) c1927.f6348).f5263.get(cls);
        if (c0410 != null) {
            Object objM1743 = c0410.m1743(c1927, (C0967) this.f7060);
            C2852 c2852 = (C2852) this.f7061;
            StringBuilder sb = c2852.f9076;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            C2852.m4801(c2852, objM1743, i, length);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public void m4106(AbstractC2254 abstractC2254) {
        InterfaceC1929 interfaceC1929 = (InterfaceC1929) ((Map) this.f7062).get(abstractC2254.getClass());
        if (interfaceC1929 != null) {
            interfaceC1929.mo2502(this, abstractC2254);
        } else {
            m4107(abstractC2254);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void m4107(AbstractC2254 abstractC2254) {
        AbstractC2254 abstractC2255 = abstractC2254.f7334;
        while (abstractC2255 != null) {
            AbstractC2254 abstractC2256 = abstractC2255.f7337;
            abstractC2255.mo1741(this);
            abstractC2255 = abstractC2256;
        }
    }

    public C2136(Context context, InterfaceC1438 interfaceC1438) {
        this.f7059 = context;
        this.f7060 = interfaceC1438;
    }

    public C2136(int i) {
        switch (i) {
            case 3:
                this.f7060 = new C2432(10);
                this.f7062 = new C2767(0);
                this.f7059 = new ArrayList();
                this.f7061 = new HashSet();
                break;
            case 10:
                this.f7059 = new C0274(0);
                this.f7060 = new SparseArray();
                this.f7061 = new C1889();
                this.f7062 = new C0274(0);
                break;
            default:
                this.f7059 = new ReentrantReadWriteLock();
                this.f7061 = new HashMap();
                break;
        }
    }

    public C2136(C0253 c0253) {
        this.f7059 = new ArrayList();
        this.f7061 = new HashSet();
        this.f7062 = c0253;
        this.f7060 = f7057;
    }

    public C2136(Context context, C0519 c0519) {
        this.f7059 = context;
        this.f7060 = c0519;
        this.f7061 = "";
        this.f7062 = "";
    }

    public C2136(C1927 c1927, C0967 c0967, C2852 c2852, Map map, C0348 c0348) {
        this.f7059 = c1927;
        this.f7060 = c0967;
        this.f7061 = c2852;
        this.f7062 = map;
    }

    public C2136(Typeface typeface, C2000 c2000) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f7062 = typeface;
        this.f7059 = c2000;
        this.f7061 = new C2001(1024);
        int iM3849 = c2000.m3849(6);
        if (iM3849 != 0) {
            int i5 = iM3849 + c2000.f6312;
            i = ((ByteBuffer) c2000.f6315).getInt(((ByteBuffer) c2000.f6315).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f7060 = new char[i * 2];
        int iM38410 = c2000.m3849(6);
        if (iM38410 != 0) {
            int i6 = iM38410 + c2000.f6312;
            i2 = ((ByteBuffer) c2000.f6315).getInt(((ByteBuffer) c2000.f6315).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C3521 c3521 = new C3521(this, i7);
            C1999 c1999M5086 = c3521.m5086();
            int iM38411 = c1999M5086.m3849(4);
            Character.toChars(iM38411 != 0 ? ((ByteBuffer) c1999M5086.f6315).getInt(iM38411 + c1999M5086.f6312) : 0, (char[]) this.f7060, i7 * 2);
            C1999 c1999M5087 = c3521.m5086();
            int iM38412 = c1999M5087.m3849(16);
            if (iM38412 != 0) {
                int i8 = iM38412 + c1999M5087.f6312;
                i3 = ((ByteBuffer) c1999M5087.f6315).getInt(((ByteBuffer) c1999M5087.f6315).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            C1787.m3662("invalid metadata codepoint length", i3 > 0);
            C2001 c2001 = (C2001) this.f7061;
            C1999 c1999M5088 = c3521.m5086();
            int iM38413 = c1999M5088.m3849(16);
            if (iM38413 != 0) {
                int i9 = iM38413 + c1999M5088.f6312;
                i4 = ((ByteBuffer) c1999M5088.f6315).getInt(((ByteBuffer) c1999M5088.f6315).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c2001.m3992(c3521, 0, i4 - 1);
        }
    }

    public C2136(C3749 c3749, Context context, String str) {
        this.f7062 = c3749;
        this.f7059 = context;
        this.f7060 = str;
        this.f7061 = new ConcurrentHashMap();
    }

    public C2136(C2650 c2650, C0519 c0519) {
        this.f7062 = c2650;
        this.f7059 = c0519;
    }
}
