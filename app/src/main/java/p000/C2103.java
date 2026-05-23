package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲁᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2103 implements InterfaceC2864, InterfaceC1648 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2102 f6933 = new C2102(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3498 f6934 = new C3498(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f6935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object f6936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f6937;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f6938;

    public /* synthetic */ C2103(LinearLayout linearLayout, TextView textView, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, View view) {
        this.f6935 = textView;
        this.f6936 = materialRadioButton;
        this.f6937 = materialRadioButton2;
        this.f6938 = view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static int m3902(Object obj) {
        Object c2585;
        boolean z = obj instanceof C0588;
        String str = z ? ((C0588) obj).f2389 : "placeholder";
        if (z) {
            obj = ((C0588) obj).f2390;
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
            c2585 = Integer.valueOf(iDataSize);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        Integer num = (Integer) c2585;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final void m3903(C0589 c0589, int i, String str) {
        ArrayList arrayList = C3678.f11549;
        C0588 c0588 = c0589.f2395;
        String str2 = c0588.f2389;
        Object obj = c0588.f2390;
        C3678.m5308(6, "YukiHookDataChannel cannot send this data key of \"" + str2 + "\" type " + (obj != null ? obj.getClass() : null) + ", because it is too large (total " + (i / 1024.0f) + " KB, limit " + (C3686.f11579 / 1024.0f) + " KB) and cannot be segmented\n" + (!AbstractC2841.m4836(str) ? str.concat("\n") : "") + "If you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final void m3904(C0589 c0589, int i, String str) {
        m3903(c0589, i, "Failed to segment " + str + " type because the size of its first element has exceeded the maximum limit");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static C0589 m3905(C0588 c0588, String str, int i, int i2) {
        return new C0589(str, i > 0, i, i2, c0588);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static void m3907(C2103 c2103, String str, InterfaceC1425 interfaceC1425) {
        String name;
        Context context = (Context) c2103.f6935;
        C3686 c3686 = (C3686) c2103.f6938;
        ConcurrentHashMap concurrentHashMap = c3686.f11582;
        String strM3916 = c2103.m3916();
        if (C3686.f11576) {
            name = "X";
        } else {
            name = context != null ? context.getClass().getName() : "M";
        }
        concurrentHashMap.put(AbstractC2784.m4748(str, strM3916 + "_" + name + "_0"), new C2315(context, new C1502(c3686, c2103, str, interfaceC1425)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m3908(AbstractC0950 abstractC0950) {
        ((C2308) ((C0542) this.f6935).f2252).m4166(abstractC0950);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3909(AbstractC0950 abstractC0950) {
        ((ArrayList) ((C0542) this.f6935).f2253).add(abstractC0950);
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1579(C2923 c2923) {
        AbstractC0950 abstractC0950;
        C2788 c2788 = c2923.f5589;
        C1089 c1089M4600 = AbstractC2591.m4600(c2923);
        C2590 c2590 = c2923.f5588;
        AbstractC0777 abstractC0777 = c2923.f3344;
        int i = c2590.f8208;
        int i2 = c2590.f8204;
        if (i != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c2590.f8208);
        }
        m3908((C0734) this.f6937);
        if (c2590.f8209) {
            m3908(new C0902(c1089M4600, c2788, c2923.f5591, abstractC0777));
            return;
        }
        C2525 c2525M3917 = m3917();
        C2526 c2526M4601 = C2592.m4601(c2923, c2525M3917);
        boolean z = c1089M4600.f3930;
        int i3 = c1089M4600.f3926;
        if ((z || i2 == 43) != (c2525M3917 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c2923);
        }
        AbstractC0950 c0902 = (i2 != 41 || i3 == 35) ? new C0902(c1089M4600, c2788, c2526M4601, abstractC0777) : new C2706(c1089M4600, c2788, c2526M4601);
        C2308 c2308 = (C2308) ((C0542) this.f6935).f2252;
        int size = c2308.f7431.size() - 1;
        while (true) {
            abstractC0950 = null;
            if (size < 0) {
                break;
            }
            if (size < c2308.f7431.size() && size >= 0) {
                abstractC0950 = (AbstractC0950) c2308.f7431.get(size);
            }
            if (abstractC0950.f3468.f3926 != -1) {
                break;
            } else {
                size--;
            }
        }
        if (i3 == 32 && abstractC0950 != null) {
            C2526 c2526 = abstractC0950.f3470;
            int i4 = abstractC0950.f3468.f3926;
            if (i4 == 7 || i4 == 8 || i4 == 9) {
                C2526 c2527 = c0902.f3470;
                if (c2527.f4836.length > 0 && c2526.f4836.length > 1 && ((C2525) c2527.m3062(0)).f8055 == ((C2525) c2526.m3062(1)).f8055) {
                    m3908(new C2706(AbstractC1090.f3933, c2788, C2526.f8058));
                }
            }
        }
        m3908(c0902);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m3910(AbstractC2224 abstractC2224) {
        if (abstractC2224.f7222 != null) {
            m3914();
            ((C2792) this.f6937).m4769('\n');
        }
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public void mo1581(C2351 c2351) {
        AbstractC0950 c2706;
        C2590 c2590 = c2351.f5588;
        C2525 c2525 = c2351.f5590;
        int i = c2590.f8204;
        if (i == 54 || i == 56) {
            return;
        }
        C2788 c2788 = c2351.f5589;
        C1089 c1089M4600 = AbstractC2591.m4600(c2351);
        int i2 = c2590.f8208;
        if (i2 == 1 || i2 == 2) {
            c2706 = new C2706(c1089M4600, c2788, C2592.m4601(c2351, c2525));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c2706 = new C2706(c1089M4600, c2788, C2592.m4601(c2351, c2525));
            } else {
                c2706 = new C2896(c1089M4600, c2788, C2592.m4601(c2351, c2525), ((C0734[]) ((C2592) this.f6938).f8213.f1404)[((C0402) this.f6936).f1899.m3384(1)]);
            }
        }
        m3908(c2706);
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo1582(C1329 c1329) {
        C2788 c2788 = c1329.f5589;
        AbstractC0777 abstractC0777 = c1329.f4782;
        ArrayList arrayList = c1329.f4781;
        if (c1329.f5588.f8208 != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        C0734 c0734 = new C0734(c2788, false);
        AbstractC0950 c0255 = new C0255(c2788, (C0734) this.f6937, arrayList, abstractC0777);
        AbstractC0950 c2896 = new C2896(AbstractC1090.f3963, c2788, C2592.m4601(c1329, c1329.f5590), c0734);
        m3908((C0734) this.f6937);
        m3908(c2896);
        m3909(new C2268(c2788));
        m3909(c0734);
        m3909(c0255);
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1583(C2350 c2350) {
        C2788 c2788 = c2350.f5589;
        AbstractC0777 abstractC0777 = c2350.f3344;
        C2525 c2525 = c2350.f5590;
        C1089 c1089M4600 = AbstractC2591.m4600(c2350);
        C2590 c2590 = c2350.f5588;
        int i = c2590.f8204;
        if (c2590.f8208 != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (i != 3) {
            m3908(new C0902(c1089M4600, c2788, C2592.m4601(c2350, c2525), abstractC0777));
            return;
        }
        C2592 c2592 = (C2592) this.f6938;
        if (c2592.f8219) {
            return;
        }
        m3908(new C2706(c1089M4600, c2788, C2526.m4547(c2525, C2525.m4532((c2592.f8216 - c2592.f8218) + ((C0903) abstractC0777).f3364, c2525.f8056.getType(), null))));
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo1584(C1674 c1674) {
        C2788 c2788 = c1674.f5589;
        C1089 c1089M4600 = AbstractC2591.m4600(c1674);
        C2590 c2590 = c1674.f5588;
        if (c2590.f8208 != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c2590.f8208);
        }
        if (!c2590.f8209) {
            throw new RuntimeException("Expected call-like operation");
        }
        m3908((C0734) this.f6937);
        m3908(new C2099(c1089M4600, c2788, c1674.f5591, new AbstractC0777[]{c1674.f5656, c1674.f5657}));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public synchronized InterfaceC1996 m3911(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2101 c2101 : (ArrayList) this.f6935) {
                if (((HashSet) this.f6937).contains(c2101)) {
                    z = true;
                } else if (c2101.f6927.isAssignableFrom(cls) && c2101.f6928.isAssignableFrom(cls2)) {
                    ((HashSet) this.f6937).add(c2101);
                    arrayList.add(c2101.f6929.mo1115(this));
                    ((HashSet) this.f6937).remove(c2101);
                }
            }
            if (arrayList.size() > 1) {
                C2102 c2102 = (C2102) this.f6936;
                C0243 c0243 = (C0243) this.f6938;
                c2102.getClass();
                return new C0274(arrayList, 2, c0243);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC1996) arrayList.get(0);
            }
            if (z) {
                return f6934;
            }
            throw new C2528("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f6937).clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public synchronized ArrayList m3912(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2101 c2101 : (ArrayList) this.f6935) {
                if (!((HashSet) this.f6937).contains(c2101) && c2101.f6927.isAssignableFrom(cls)) {
                    ((HashSet) this.f6937).add(c2101);
                    arrayList.add(c2101.f6929.mo1115(this));
                    ((HashSet) this.f6937).remove(c2101);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.f6937).clear();
            throw th;
        }
        return arrayList;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public void mo1588(C2868 c2868) {
        C2788 c2788 = c2868.f5589;
        C1660 c1660 = (C1660) c2868.f9190;
        C0402 c0402 = (C0402) this.f6936;
        C1660 c1661 = c0402.f1899;
        int i = c1660.f5610;
        int i2 = c1661.f5610;
        int i3 = c0402.f1900;
        if (i != i2 - 1 || i3 != c1661.m3384(i)) {
            throw new RuntimeException("shouldn't happen");
        }
        C0734[] c0734Arr = new C0734[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0734Arr[i4] = ((C0734[]) ((C2592) this.f6938).f8213.f1404)[c1661.m3384(i4)];
        }
        C0734 c0734 = new C0734(c2788, false);
        C0734 c0735 = new C0734(((C0734) this.f6937).f3469, true);
        C2866 c2866 = new C2866(c2788, c0735, c1660, c0734Arr);
        AbstractC0950 c2896 = new C2896(c2866.f9184 ? AbstractC1090.f3966 : AbstractC1090.f3967, c2788, C2592.m4601(c2868, c2868.f5590), c0734);
        m3908(c0735);
        m3908(c2896);
        m3909(new C2268(c2788));
        m3909(c0734);
        m3909(c2866);
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public void mo1589(C2868 c2868) {
        C2788 c2788 = c2868.f5589;
        C1089 c1089M4600 = AbstractC2591.m4600(c2868);
        if (c2868.f5588.f8208 != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C2525 c2525M3917 = m3917();
        if (c1089M4600.f3930 == (c2525M3917 != null)) {
            m3908((C0734) this.f6937);
            m3908(new C2706(c1089M4600, c2788, C2592.m4601(c2868, c2525M3917)));
        } else {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c2868);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m3913(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2705) this.f6938).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m3913(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m3914() {
        C2792 c2792 = (C2792) this.f6937;
        StringBuilder sb = c2792.f8914;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        c2792.m4769('\n');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public synchronized ArrayList m3915(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2101 c2101 : (ArrayList) this.f6935) {
            if (!arrayList.contains(c2101.f6928) && c2101.f6927.isAssignableFrom(cls)) {
                arrayList.add(c2101.f6928);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public String m3916() {
        return AbstractC1194.m2779(((String) this.f6936).hashCode(), "_");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C2525 m3917() {
        int i = ((C0402) this.f6936).f1900;
        if (i < 0) {
            return null;
        }
        AbstractC1649 abstractC1649 = (AbstractC1649) ((C0404) ((C2592) this.f6938).f8212.f2530).m1597(i).f1898.m3062(0);
        if (abstractC1649.f5588.f8204 != 56) {
            return null;
        }
        return abstractC1649.f5590;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int m3918() {
        return ((C2792) this.f6937).f8914.length();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void m3919(C0589 c0589) {
        if (AbstractC2205.f7173) {
            String strM2705 = C1133.m2705();
            C0588 c0588 = c0589.f2395;
            String str = c0588.f2389;
            int iM3902 = m3902(c0588);
            if (iM3902 < 0) {
                ArrayList arrayList = C3678.f11549;
                C3678.m5308(6, "YukiHookDataChannel cannot calculate the byte size of the data key of \"" + str + "\" to be sent, so this data cannot be sent\nIf you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
                return;
            }
            if (c0589.f2392) {
                m3920(c0589);
                return;
            }
            int i = C3686.f11579;
            if (iM3902 < i) {
                m3920(c0589);
                return;
            }
            Object obj = c0588.f2390;
            int i2 = 0;
            if (obj instanceof List) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                    if (m3902(arrayList3) >= C3686.f11579 / C3686.f11580) {
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
                    m3904(c0589, iM3902, "List");
                    return;
                }
                for (Object obj2 : arrayList4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0745.m2213();
                        throw null;
                    }
                    m3920(m3905(new C0588((List) obj2, str), strM2705, arrayList2.size(), i2));
                    i2 = i3;
                }
                return;
            }
            if (obj instanceof Map) {
                ArrayList arrayList5 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    if (m3902(linkedHashMap) >= C3686.f11579 / C3686.f11580) {
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
                    m3904(c0589, iM3902, "Map");
                    return;
                }
                for (Object obj3 : arrayList6) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0745.m2213();
                        throw null;
                    }
                    m3920(m3905(new C0588((Map) obj3, str), strM2705, arrayList5.size(), i2));
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
                    if (m3902(linkedHashSet) >= C3686.f11579 / C3686.f11580) {
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
                    m3904(c0589, iM3902, "Set");
                    return;
                }
                for (Object obj4 : arrayList8) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0745.m2213();
                        throw null;
                    }
                    m3920(m3905(new C0588((Set) obj4, str), strM2705, arrayList7.size(), i2));
                    i2 = i5;
                }
                return;
            }
            if (!(obj instanceof String)) {
                if ((obj instanceof byte[]) || (obj instanceof char[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof Object[])) {
                    m3903(c0589, iM3902, "Primitive Array type like String[], int[] ... cannot be segmented, the suggestion is send those data using List type");
                    return;
                } else {
                    m3903(c0589, iM3902, "");
                    return;
                }
            }
            String str2 = (String) obj;
            int i6 = i / 2;
            ArrayList arrayList9 = new ArrayList();
            int length = str2.length();
            if (i6 <= 0) {
                throw new IllegalArgumentException(AbstractC1194.m2780(i6, "Step must be positive, was: ", "."));
            }
            int iM3971 = AbstractC2201.m3971(0, length, i6);
            if (iM3971 >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + i6;
                    if (i8 <= str2.length()) {
                        arrayList9.add(str2.substring(i7, i8));
                    } else {
                        arrayList9.add(str2.substring(i7, str2.length()));
                    }
                    if (i7 == iM3971) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            if (arrayList9.size() == 1) {
                m3920(c0589);
                return;
            }
            arrayList9.size();
            ArrayList arrayList10 = !arrayList9.isEmpty() ? arrayList9 : null;
            if (arrayList10 == null) {
                m3904(c0589, iM3902, "String");
                return;
            }
            for (Object obj5 : arrayList10) {
                int i9 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0745.m2213();
                    throw null;
                }
                m3920(m3905(new C0588((String) obj5, str), strM2705, arrayList9.size(), i2));
                i2 = i9;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public void m3920(C0589 c0589) {
        String str = (String) this.f6936;
        C0588 c0588 = c0589.f2395;
        Context contextM1337 = (Context) this.f6935;
        if (contextM1337 == null) {
            C0251.f1415.getClass();
            contextM1337 = C0251.m1337();
        }
        if (contextM1337 == null) {
            ArrayList arrayList = C3678.f11549;
            C3678.m5308(6, "Failed to sendBroadcast like \"" + c0588.f2389 + "\", because got null context in \"" + str + "\"", null);
            return;
        }
        Intent intent = new Intent();
        if (!AbstractC2841.m4836("")) {
            intent.setPackage("");
        }
        boolean z = C3686.f11576;
        intent.setAction(z ? C3686.m5344(null) : C3686.m5343(str));
        if (!AbstractC2207.m4087(str, "android")) {
            if (z) {
                str = C3692.f11608;
            }
            intent.setPackage(str);
        }
        intent.putExtra(c0588.f2389 + m3916(), c0589);
        contextM1337.sendBroadcast(intent, null, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public void m3921(AbstractC2224 abstractC2224, int i) {
        Class<?> cls = abstractC2224.getClass();
        C1676 c1676 = (C1676) this.f6935;
        C0435 c0435 = (C0435) ((C1466) c1676.f5660).f5231.get(cls);
        if (c0435 != null) {
            Object objM1637 = c0435.m1637(c1676, (C0963) this.f6936);
            C2792 c2792 = (C2792) this.f6937;
            StringBuilder sb = c2792.f8914;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            C2792.m4768(c2792, objM1637, i, length);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m3922(AbstractC2224 abstractC2224) {
        InterfaceC1902 interfaceC1902 = (InterfaceC1902) ((Map) this.f6938).get(abstractC2224.getClass());
        if (interfaceC1902 != null) {
            interfaceC1902.mo2385(this, abstractC2224);
        } else {
            m3923(abstractC2224);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public void m3923(AbstractC2224 abstractC2224) {
        AbstractC2224 abstractC2225 = abstractC2224.f7219;
        while (abstractC2225 != null) {
            AbstractC2224 abstractC2226 = abstractC2225.f7222;
            abstractC2225.mo1635(this);
            abstractC2225 = abstractC2226;
        }
    }

    public /* synthetic */ C2103(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6936 = obj2;
        this.f6937 = obj3;
        this.f6938 = obj4;
        this.f6935 = obj;
    }

    public /* synthetic */ C2103(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6935 = obj;
        this.f6936 = obj2;
        this.f6937 = obj3;
        this.f6938 = obj4;
    }

    public C2103(int i) {
        switch (i) {
            case 3:
                this.f6936 = new C2379(10);
                this.f6938 = new C2705(0);
                this.f6935 = new ArrayList();
                this.f6937 = new HashSet();
                break;
            case 15:
                this.f6935 = new C0264(0);
                this.f6936 = new SparseArray();
                this.f6937 = new C1863();
                this.f6938 = new C0264(0);
                break;
            default:
                this.f6935 = new ReentrantReadWriteLock();
                this.f6937 = new HashMap();
                break;
        }
    }

    public C2103(C0243 c0243) {
        this.f6935 = new ArrayList();
        this.f6937 = new HashSet();
        this.f6938 = c0243;
        this.f6936 = f6933;
    }

    public C2103(LinearLayout linearLayout, MaterialCheckBox materialCheckBox, TextInputEditText textInputEditText, MaterialTextView materialTextView, TextInputEditText textInputEditText2) {
        this.f6935 = linearLayout;
        this.f6936 = materialCheckBox;
        this.f6937 = textInputEditText;
        this.f6938 = textInputEditText2;
    }

    public C2103(Context context, C0542 c0542) {
        this.f6935 = context;
        this.f6936 = c0542;
        this.f6937 = "";
        this.f6938 = "";
    }

    public C2103(Typeface typeface, C1969 c1969) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f6938 = typeface;
        this.f6935 = c1969;
        this.f6937 = new C1970(1024);
        int iM3671 = c1969.m3671(6);
        if (iM3671 != 0) {
            int i5 = iM3671 + c1969.f6238;
            i = ((ByteBuffer) c1969.f6241).getInt(((ByteBuffer) c1969.f6241).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f6936 = new char[i * 2];
        int iM3672 = c1969.m3671(6);
        if (iM3672 != 0) {
            int i6 = iM3672 + c1969.f6238;
            i2 = ((ByteBuffer) c1969.f6241).getInt(((ByteBuffer) c1969.f6241).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C3465 c3465 = new C3465(this, i7);
            C1968 c1968M5061 = c3465.m5061();
            int iM3673 = c1968M5061.m3671(4);
            Character.toChars(iM3673 != 0 ? ((ByteBuffer) c1968M5061.f6241).getInt(iM3673 + c1968M5061.f6238) : 0, (char[]) this.f6936, i7 * 2);
            C1968 c1968M5062 = c3465.m5061();
            int iM3674 = c1968M5062.m3671(16);
            if (iM3674 != 0) {
                int i8 = iM3674 + c1968M5062.f6238;
                i3 = ((ByteBuffer) c1968M5062.f6241).getInt(((ByteBuffer) c1968M5062.f6241).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC2665.m4658("invalid metadata codepoint length", i3 > 0);
            C1970 c1970 = (C1970) this.f6937;
            C1968 c1968M5063 = c3465.m5061();
            int iM3675 = c1968M5063.m3671(16);
            if (iM3675 != 0) {
                int i9 = iM3675 + c1968M5063.f6238;
                i4 = ((ByteBuffer) c1968M5063.f6241).getInt(((ByteBuffer) c1968M5063.f6241).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c1970.m3798(c3465, 0, i4 - 1);
        }
    }

    public C2103(C3686 c3686, Context context, String str) {
        this.f6938 = c3686;
        this.f6935 = context;
        this.f6936 = str;
        this.f6937 = new ConcurrentHashMap();
    }

    public C2103(C2592 c2592, C0542 c0542) {
        this.f6938 = c2592;
        this.f6935 = c0542;
    }
}
