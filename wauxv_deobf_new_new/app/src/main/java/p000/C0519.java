package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.hd.wauxv.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᤞᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0519 implements InterfaceC2630, InterfaceC1173, InterfaceC1994, InterfaceC0376, InterfaceC0957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f2208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2209;

    static {
        new C0378();
    }

    public /* synthetic */ C0519(int i, boolean z) {
        this.f2207 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0166 m1973(ImageDecoder.Source source, int i, int i2, C2336 c2336) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1005(i, i2, c2336));
        if (AbstractC0088.m1137(drawableDecodeDrawable)) {
            return new C0166(AbstractC0088.m1120(drawableDecodeDrawable), 0);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // p000.InterfaceC1173
    public Object getResult() {
        return (C3561) this.f2208;
    }

    public String toString() {
        switch (this.f2207) {
            case 15:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1516 c1516 = (C1516) this.f2208;
                C1516 c1517 = c1516.f5346;
                boolean z = false;
                while (!c1517.equals(c1516)) {
                    sb.append('{');
                    sb.append(c1517.f5344);
                    sb.append(':');
                    ArrayList arrayList = c1517.f5345;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c1517 = c1517.f5346;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean mo1974(CharSequence charSequence, int i, int i2, C3521 c3521) {
        if ((c3521.f11107 & 4) > 0) {
            return true;
        }
        if (((C3561) this.f2208) == null) {
            this.f2208 = new C3561(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0348) this.f2209).getClass();
        ((C3561) this.f2208).setSpan(new C3522(c3521), i, i2, 33);
        return true;
    }

    @Override // p000.InterfaceC1994
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public Drawable mo1607(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f2209;
        C1369.f4885.getClass();
        String str = (String) C1369.f4886.getValue();
        List list = (List) this.f2208;
        File file = new File(str, ((C1363) list.get(i)).f4876);
        Bitmap bitmapDecodeFile = (AbstractC2901.m4869(((C1363) list.get(i)).f4876) || !file.isFile()) ? null : BitmapFactory.decodeFile(file.getAbsolutePath());
        return bitmapDecodeFile != null ? new BitmapDrawable(viewGroup.getContext().getResources(), bitmapDecodeFile) : viewGroup.getContext().getDrawable(R.drawable.ic_float_button_menu_24dp);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1975(C2864 c2864) {
        if (((ArrayList) this.f2209) == null) {
            this.f2209 = new ArrayList();
        }
        int size = ((ArrayList) this.f2209).size();
        for (int i = 0; i < size; i++) {
            C2864 c2865 = (C2864) ((ArrayList) this.f2209).get(i);
            if (c2865.f9106 == c2864.f9106) {
                ((ArrayList) this.f2209).remove(i);
            }
            if (c2865.f9106 >= c2864.f9106) {
                ((ArrayList) this.f2209).add(i, c2864);
                return;
            }
        }
        ((ArrayList) this.f2209).add(c2864);
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo1976(Exception exc) {
        C2847 c2847 = (C2847) this.f2209;
        C2026 c2026 = (C2026) this.f2208;
        C2026 c2027 = c2847.f9064;
        if (c2027 == null || c2027 != c2026) {
            return;
        }
        C2847 c2848 = (C2847) this.f2209;
        C2026 c2028 = (C2026) this.f2208;
        RunnableC0976 runnableC0976 = c2848.f9060;
        C0956 c0956 = c2848.f9065;
        InterfaceC0958 interfaceC0958 = c2028.f6762;
        runnableC0976.mo2568(c0956, exc, interfaceC0958, interfaceC0958.mo1951());
    }

    @Override // p000.InterfaceC1994
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public int mo1610() {
        return Color.parseColor((AbstractC2234.m4176(((ViewGroup) this.f2209).getContext()) ? C1364.f4880 : C1365.f4881).m2666());
    }

    @Override // p000.InterfaceC1994
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo1611() {
        return ((List) this.f2208).size();
    }

    @Override // p000.InterfaceC0376
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1681(C0377 c0377) {
        if (((C2654) this.f2209).m4642(c0377)) {
            ((C1676) this.f2208).m3546(c0377.f1869);
        }
    }

    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo1977(Object obj) {
        C2847 c2847 = (C2847) this.f2209;
        C2026 c2026 = (C2026) this.f2208;
        C2026 c2027 = c2847.f9064;
        if (c2027 == null || c2027 != c2026) {
            return;
        }
        C2847 c2848 = (C2847) this.f2209;
        C2026 c2028 = (C2026) this.f2208;
        C1068 c1068 = c2848.f9059.f3552;
        if (obj != null && c1068.m2742(c2028.f6762.mo1951())) {
            c2848.f9063 = obj;
            c2848.f9060.m2629(2);
        } else {
            RunnableC0976 runnableC0976 = c2848.f9060;
            InterfaceC1772 interfaceC1772 = c2028.f6760;
            InterfaceC0958 interfaceC0958 = c2028.f6762;
            runnableC0976.mo2567(interfaceC1772, obj, interfaceC0958, interfaceC0958.mo1951(), c2848.f9065);
        }
    }

    @Override // p000.InterfaceC1994
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public int mo1614() {
        return Color.parseColor((AbstractC2234.m4176(((ViewGroup) this.f2209).getContext()) ? C1366.f4882 : C1367.f4883).m2666());
    }

    @Override // p000.InterfaceC1208
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo1615(Object obj, File file, C2336 c2336) {
        return ((C0396) this.f2209).mo1615(new C0400((InterfaceC0399) this.f2208, ((BitmapDrawable) ((InterfaceC2624) obj).get()).getBitmap()), file, c2336);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1978() {
        int[] iArr = (int[]) this.f2208;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2209 = null;
    }

    @Override // p000.InterfaceC2630
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo1720(C2336 c2336) {
        return 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m1979(int i) {
        int[] iArr = (int[]) this.f2208;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f2208 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2208 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2208;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1980(int i) {
        ArrayList arrayList = (ArrayList) this.f2209;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2864) ((ArrayList) this.f2209).get(size)).f9106 >= i) {
                    ((ArrayList) this.f2209).remove(size);
                }
            }
        }
        m1989(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Object m1981(InterfaceC2429 interfaceC2429) {
        HashMap map = (HashMap) this.f2209;
        C1516 c1516 = (C1516) map.get(interfaceC2429);
        if (c1516 == null) {
            c1516 = new C1516(interfaceC2429);
            map.put(interfaceC2429, c1516);
        } else {
            interfaceC2429.mo3814();
        }
        C1516 c1517 = c1516.f5347;
        c1517.f5346 = c1516.f5346;
        c1516.f5346.f5347 = c1517;
        C1516 c1518 = (C1516) this.f2208;
        c1516.f5347 = c1518;
        C1516 c1519 = c1518.f5346;
        c1516.f5346 = c1519;
        c1519.f5347 = c1516;
        c1516.f5347.f5346 = c1516;
        ArrayList arrayList = c1516.f5345;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1516.f5345.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C2864 m1982(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f2209;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2864 c2864 = (C2864) ((ArrayList) this.f2209).get(i4);
            int i5 = c2864.f9106;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || c2864.f9107 == i3 || c2864.f9109)) {
                return c2864;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C2864 m1983(int i) {
        ArrayList arrayList = (ArrayList) this.f2209;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2864 c2864 = (C2864) ((ArrayList) this.f2209).get(size);
            if (c2864.f9106 == i) {
                return c2864;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public KeyListener m1984(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0519) ((C0102) this.f2209).f1117).getClass();
        if (keyListener instanceof C1170) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C1170(keyListener);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public SharedPreferencesC1271 m1985() {
        return (SharedPreferencesC1271) ((C2933) this.f2209).getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public synchronized List m1986(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f2208).contains(str)) {
                ((ArrayList) this.f2208).add(str);
            }
            arrayList = (List) ((HashMap) this.f2209).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f2209).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public synchronized ArrayList m1987(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2208).iterator();
        while (it.hasNext()) {
            List<C2628> list = (List) ((HashMap) this.f2209).get((String) it.next());
            if (list != null) {
                for (C2628 c2628 : list) {
                    if ((c2628.f8317.isAssignableFrom(cls) && cls2.isAssignableFrom(c2628.f8318)) && !arrayList.contains(c2628.f8318)) {
                        arrayList.add(c2628.f8318);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public String m1988(InterfaceC1772 interfaceC1772) {
        String str;
        synchronized (((C1896) this.f2208)) {
            str = (String) ((C1896) this.f2208).m3827(interfaceC1772);
        }
        if (str == null) {
            C2682 c2682 = (C2682) ((C0253) this.f2209).mo1458();
            try {
                interfaceC1772.mo2098(c2682.f8672);
                byte[] bArrDigest = c2682.f8672.digest();
                char[] cArr = AbstractC3580.f11186;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = AbstractC3580.f11185;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & ek.m];
                    }
                    str = new String(cArr);
                }
                ((C0253) this.f2209).mo1457(c2682);
            } catch (Throwable th) {
                ((C0253) this.f2209).mo1457(c2682);
                throw th;
            }
        }
        synchronized (((C1896) this.f2208)) {
            ((C1896) this.f2208).m3830(interfaceC1772, str);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int m1989(int i) {
        int i2;
        int[] iArr = (int[]) this.f2208;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.f2209) != null) {
            C2864 c2864M1983 = m1983(i);
            if (c2864M1983 != null) {
                ((ArrayList) this.f2209).remove(c2864M1983);
            }
            int size = ((ArrayList) this.f2209).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((C2864) ((ArrayList) this.f2209).get(i3)).f9106 >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                C2864 c2864 = (C2864) ((ArrayList) this.f2209).get(i3);
                ((ArrayList) this.f2209).remove(i3);
                i2 = c2864.f9106;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            int[] iArr2 = (int[]) this.f2208;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.f2208).length;
        }
        int iMin = Math.min(i2 + 1, ((int[]) this.f2208).length);
        Arrays.fill((int[]) this.f2208, i, iMin, -1);
        return iMin;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m1990(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2208).getContext().obtainStyledAttributes(attributeSet, AbstractC2523.f8032, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2010(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public void m1991(int i, int i2) {
        int[] iArr = (int[]) this.f2208;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1979(i3);
        int[] iArr2 = (int[]) this.f2208;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f2208, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f2209;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2864 c2864 = (C2864) ((ArrayList) this.f2209).get(size);
            int i4 = c2864.f9106;
            if (i4 >= i) {
                c2864.f9106 = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1992(int i, int i2) {
        int[] iArr = (int[]) this.f2208;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1979(i3);
        int[] iArr2 = (int[]) this.f2208;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f2208;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2209;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2864 c2864 = (C2864) ((ArrayList) this.f2209).get(size);
            int i4 = c2864.f9106;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f2209).remove(size);
                } else {
                    c2864.f9106 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C1167 m1993(InputConnection inputConnection, EditorInfo editorInfo) {
        C0102 c0102 = (C0102) this.f2209;
        if (inputConnection == null) {
            c0102.getClass();
            inputConnection = null;
        } else {
            C0519 c0519 = (C0519) c0102.f1117;
            c0519.getClass();
            if (!(inputConnection instanceof C1167)) {
                inputConnection = new C1167((EditText) c0519.f2208, inputConnection, editorInfo);
            }
        }
        return (C1167) inputConnection;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void m1994(C1385 c1385) {
        ExecutorC2616 executorC2616 = (ExecutorC2616) this.f2209;
        C1681 c1681 = (C1681) this.f2208;
        int i = c1385.f4991;
        if (i == 0) {
            executorC2616.execute(new RunnableC0140(c1681, c1385.f4990, 1, false));
        } else {
            executorC2616.execute(new RunnableC0361(i, 1, c1681));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public C0173 m1995(int i) throws IOException {
        m2009(4);
        C0491 c0491 = (C0491) this.f2208;
        int unsignedShort = c0491.readUnsignedShort();
        int unsignedShort2 = c0491.readUnsignedShort();
        C2875 c2875 = (C2875) this.f2209;
        C0173 c0173 = new C0173(new C0917(C3505.m5023(((C0916) c2875.m4826(unsignedShort)).f3385)), i);
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            m2009(5);
            c0173.m1361(new C2152((C0916) c2875.m4826(c0491.readUnsignedShort()), m2004()));
        }
        c0173.f7068 = false;
        return c0173;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public C0185 m1996(int i) {
        C0491 c0491 = (C0491) this.f2208;
        try {
            int unsignedShort = c0491.readUnsignedShort();
            C0185 c0185 = new C0185();
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c0185.m1374(m1995(i));
            }
            c0185.f7068 = false;
            if (c0491.available() == 0) {
                return c0185;
            }
            throw new C2371("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public AbstractC0775 m1997() throws IOException {
        return ((C2875) this.f2209).m4826(((C0491) this.f2208).readUnsignedShort());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public void m1998(Context context, XmlResourceParser xmlResourceParser) {
        C0791 c0791 = new C0791();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C0786 c0786M2415 = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c0786M2415 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0786M2415.f2988.m2410(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c0786M2415 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0786M2415.f2987.m2411(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c0786M2415 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0786M2415.f2986.m2412(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c0786M2415 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0786M2415.f2989.m2413(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c0786M2415 = C0791.m2415(context, Xml.asAttributeSet(xmlResourceParser));
                                        c0786M2415.f2988.f2992 = true;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c0786M2415 = C0791.m2415(context, Xml.asAttributeSet(xmlResourceParser));
                                        c0786M2415.f2988.f3046 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c0786M2415 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C0779.m2397(context, xmlResourceParser, c0786M2415.f2990);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c0786M2415 = C0791.m2415(context, Xml.asAttributeSet(xmlResourceParser));
                                    }
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                ((SparseArray) this.f2209).put(identifier, c0791);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c0791.f3079.put(Integer.valueOf(c0786M2415.f2985), c0786M2415);
                                c0786M2415 = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.f2209).put(identifier, c0791);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int m1999(int i, InterfaceC0518 interfaceC0518) {
        int i2 = i;
        C2875 c2875 = (C2875) this.f2209;
        C0493 c0493 = (C0493) this.f2208;
        byte[] bArr = c0493.f2146;
        try {
            int iM1909 = c0493.m1909(i2);
            int i3 = AbstractC0514.f2196[iM1909];
            try {
                switch (iM1909) {
                    case 0:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11034);
                        return 1;
                    case 1:
                        interfaceC0518.mo1686(18, i, 1, C0905.f3370, 0);
                        return 1;
                    case 2:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3356, -1);
                        return 1;
                    case 3:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3357, 0);
                        return 1;
                    case 4:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3358, 1);
                        return 1;
                    case 5:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3359, 2);
                        return 1;
                    case 6:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3360, 3);
                        return 1;
                    case 7:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3361, 4);
                        return 1;
                    case 8:
                        interfaceC0518.mo1686(18, i, 1, C0902.f3362, 5);
                        return 1;
                    case 9:
                        interfaceC0518.mo1686(18, i, 1, C0909.f3373, 0);
                        return 1;
                    case 10:
                        interfaceC0518.mo1686(18, i, 1, C0909.f3374, 0);
                        return 1;
                    case 11:
                        interfaceC0518.mo1686(18, i, 1, C0899.f3348, 0);
                        return 1;
                    case Opcodes.FCONST_1 /* 12 */:
                        interfaceC0518.mo1686(18, i, 1, C0899.f3349, 0);
                        return 1;
                    case 13:
                        interfaceC0518.mo1686(18, i, 1, C0899.f3350, 0);
                        return 1;
                    case Opcodes.DCONST_0 /* 14 */:
                        interfaceC0518.mo1686(18, i, 1, C0896.f3345, 0);
                        return 1;
                    case 15:
                        interfaceC0518.mo1686(18, i, 1, C0896.f3346, 0);
                        return 1;
                    case 16:
                        int i4 = i + 1;
                        c0493.m1904(i4, i + 2);
                        byte b = bArr[i4];
                        interfaceC0518.mo1686(18, i, 2, C0902.m2537(b), b);
                        return 2;
                    case Opcodes.SIPUSH /* 17 */:
                        int iM1908 = c0493.m1908(i + 1);
                        interfaceC0518.mo1686(18, i, 3, C0902.m2537(iM1908), iM1908);
                        return 3;
                    case Opcodes.LDC /* 18 */:
                        AbstractC0775 abstractC0775M4826 = c2875.m4826(c0493.m1909(i + 1));
                        interfaceC0518.mo1686(18, i, 2, abstractC0775M4826, abstractC0775M4826 instanceof C0902 ? ((C0902) abstractC0775M4826).m2538() : 0);
                        return 2;
                    case 19:
                        AbstractC0775 abstractC0775M4827 = c2875.m4826(c0493.m1911(i + 1));
                        interfaceC0518.mo1686(18, i, 3, abstractC0775M4827, abstractC0775M4827 instanceof C0902 ? ((C0902) abstractC0775M4827).m2538() : 0);
                        return 3;
                    case 20:
                        interfaceC0518.mo1686(20, i, 3, c2875.m4826(c0493.m1911(i + 1)), 0);
                        return 3;
                    case Opcodes.ILOAD /* 21 */:
                        interfaceC0518.mo1684(21, i, 2, c0493.m1909(i + 1), C3505.f11031, 0);
                        return 2;
                    case Opcodes.LLOAD /* 22 */:
                        interfaceC0518.mo1684(21, i, 2, c0493.m1909(i + 1), C3505.f11032, 0);
                        return 2;
                    case Opcodes.FLOAD /* 23 */:
                        interfaceC0518.mo1684(21, i, 2, c0493.m1909(i + 1), C3505.f11030, 0);
                        return 2;
                    case Opcodes.DLOAD /* 24 */:
                        interfaceC0518.mo1684(21, i, 2, c0493.m1909(i + 1), C3505.f11029, 0);
                        return 2;
                    case Opcodes.ALOAD /* 25 */:
                        interfaceC0518.mo1684(21, i, 2, c0493.m1909(i + 1), C3505.f11042, 0);
                        return 2;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        interfaceC0518.mo1684(21, i, 1, iM1909 - 26, C3505.f11031, 0);
                        return 1;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        interfaceC0518.mo1684(21, i, 1, iM1909 - 30, C3505.f11032, 0);
                        return 1;
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        interfaceC0518.mo1684(21, i, 1, iM1909 - 34, C3505.f11030, 0);
                        return 1;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        interfaceC0518.mo1684(21, i, 1, iM1909 - 38, C3505.f11029, 0);
                        return 1;
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                        interfaceC0518.mo1684(21, i2, 1, iM1909 - 42, C3505.f11042, 0);
                        return 1;
                    case Opcodes.IALOAD /* 46 */:
                        interfaceC0518.mo1697(46, i2, C3505.f11031);
                        return 1;
                    case 47:
                        interfaceC0518.mo1697(46, i2, C3505.f11032);
                        return 1;
                    case 48:
                        interfaceC0518.mo1697(46, i2, C3505.f11030);
                        return 1;
                    case 49:
                        interfaceC0518.mo1697(46, i2, C3505.f11029);
                        return 1;
                    case Opcodes.AALOAD /* 50 */:
                        interfaceC0518.mo1697(46, i2, C3505.f11042);
                        return 1;
                    case Opcodes.BALOAD /* 51 */:
                        interfaceC0518.mo1697(46, i2, C3505.f11027);
                        return 1;
                    case 52:
                        interfaceC0518.mo1697(46, i2, C3505.f11028);
                        return 1;
                    case Opcodes.SALOAD /* 53 */:
                        interfaceC0518.mo1697(46, i2, C3505.f11033);
                        return 1;
                    case Opcodes.ISTORE /* 54 */:
                        interfaceC0518.mo1684(54, i, 2, c0493.m1909(i + 1), C3505.f11031, 0);
                        return 2;
                    case Opcodes.LSTORE /* 55 */:
                        interfaceC0518.mo1684(54, i, 2, c0493.m1909(i + 1), C3505.f11032, 0);
                        return 2;
                    case Opcodes.FSTORE /* 56 */:
                        interfaceC0518.mo1684(54, i, 2, c0493.m1909(i + 1), C3505.f11030, 0);
                        return 2;
                    case Opcodes.DSTORE /* 57 */:
                        interfaceC0518.mo1684(54, i, 2, c0493.m1909(i + 1), C3505.f11029, 0);
                        return 2;
                    case Opcodes.ASTORE /* 58 */:
                        interfaceC0518.mo1684(54, i, 2, c0493.m1909(i + 1), C3505.f11042, 0);
                        return 2;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        interfaceC0518.mo1684(54, i, 1, iM1909 - 59, C3505.f11031, 0);
                        return 1;
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                        interfaceC0518.mo1684(54, i, 1, iM1909 - 63, C3505.f11032, 0);
                        return 1;
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        interfaceC0518.mo1684(54, i, 1, iM1909 - 67, C3505.f11030, 0);
                        return 1;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        interfaceC0518.mo1684(54, i, 1, iM1909 - 71, C3505.f11029, 0);
                        return 1;
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        interfaceC0518.mo1684(54, i2, 1, iM1909 - 75, C3505.f11042, 0);
                        return 1;
                    case Opcodes.IASTORE /* 79 */:
                        interfaceC0518.mo1697(79, i2, C3505.f11031);
                        return 1;
                    case 80:
                        interfaceC0518.mo1697(79, i2, C3505.f11032);
                        return 1;
                    case 81:
                        interfaceC0518.mo1697(79, i2, C3505.f11030);
                        return 1;
                    case 82:
                        interfaceC0518.mo1697(79, i2, C3505.f11029);
                        return 1;
                    case Opcodes.AASTORE /* 83 */:
                        interfaceC0518.mo1697(79, i2, C3505.f11042);
                        return 1;
                    case Opcodes.BASTORE /* 84 */:
                        interfaceC0518.mo1697(79, i2, C3505.f11027);
                        return 1;
                    case Opcodes.CASTORE /* 85 */:
                        interfaceC0518.mo1697(79, i2, C3505.f11028);
                        return 1;
                    case 86:
                        interfaceC0518.mo1697(79, i2, C3505.f11033);
                        return 1;
                    case Opcodes.POP /* 87 */:
                    case Opcodes.POP2 /* 88 */:
                    case Opcodes.DUP /* 89 */:
                    case 90:
                    case 91:
                    case Opcodes.DUP2 /* 92 */:
                    case 93:
                    case 94:
                    case Opcodes.SWAP /* 95 */:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11034);
                        return 1;
                    case Opcodes.IADD /* 96 */:
                    case 100:
                    case 104:
                    case Opcodes.IDIV /* 108 */:
                    case 112:
                    case Opcodes.INEG /* 116 */:
                    case 120:
                    case 122:
                    case Opcodes.IUSHR /* 124 */:
                    case 126:
                    case 128:
                    case Opcodes.IXOR /* 130 */:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11031);
                        return 1;
                    case Opcodes.LADD /* 97 */:
                    case 101:
                    case 105:
                    case Opcodes.LDIV /* 109 */:
                    case 113:
                    case Opcodes.LNEG /* 117 */:
                    case 121:
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.LUSHR /* 125 */:
                    case 127:
                    case Opcodes.LOR /* 129 */:
                    case Opcodes.LXOR /* 131 */:
                        interfaceC0518.mo1697(iM1909 - 1, i2, C3505.f11032);
                        return 1;
                    case 98:
                    case 102:
                    case 106:
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    case Opcodes.FNEG /* 118 */:
                        interfaceC0518.mo1697(iM1909 - 2, i2, C3505.f11030);
                        return 1;
                    case 99:
                    case 103:
                    case 107:
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    case 115:
                    case Opcodes.DNEG /* 119 */:
                        interfaceC0518.mo1697(iM1909 - 3, i2, C3505.f11029);
                        return 1;
                    case Opcodes.IINC /* 132 */:
                        int iM19010 = c0493.m1909(i2 + 1);
                        int i5 = i2 + 2;
                        c0493.m1904(i5, i2 + 3);
                        interfaceC0518.mo1684(iM1909, i2, 3, iM19010, C3505.f11031, bArr[i5]);
                        return 3;
                    case Opcodes.I2L /* 133 */:
                    case Opcodes.F2L /* 140 */:
                    case Opcodes.D2L /* 143 */:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11032);
                        return 1;
                    case Opcodes.I2F /* 134 */:
                    case 137:
                    case 144:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11030);
                        return 1;
                    case Opcodes.I2D /* 135 */:
                    case 138:
                    case 141:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11029);
                        return 1;
                    case Opcodes.L2I /* 136 */:
                    case Opcodes.F2I /* 139 */:
                    case Opcodes.D2I /* 142 */:
                    case Opcodes.I2B /* 145 */:
                    case Opcodes.I2C /* 146 */:
                    case Opcodes.I2S /* 147 */:
                    case Opcodes.LCMP /* 148 */:
                    case Opcodes.FCMPL /* 149 */:
                    case Opcodes.FCMPG /* 150 */:
                    case Opcodes.DCMPL /* 151 */:
                    case Opcodes.DCMPG /* 152 */:
                    case Opcodes.ARRAYLENGTH /* 190 */:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11031);
                        return 1;
                    case Opcodes.IFEQ /* 153 */:
                    case Opcodes.IFNE /* 154 */:
                    case Opcodes.IFLT /* 155 */:
                    case Opcodes.IFGE /* 156 */:
                    case Opcodes.IFGT /* 157 */:
                    case Opcodes.IFLE /* 158 */:
                    case Opcodes.IF_ICMPEQ /* 159 */:
                    case Opcodes.IF_ICMPNE /* 160 */:
                    case Opcodes.IF_ICMPLT /* 161 */:
                    case Opcodes.IF_ICMPGE /* 162 */:
                    case Opcodes.IF_ICMPGT /* 163 */:
                    case Opcodes.IF_ICMPLE /* 164 */:
                    case Opcodes.IF_ACMPEQ /* 165 */:
                    case Opcodes.IF_ACMPNE /* 166 */:
                    case Opcodes.GOTO /* 167 */:
                    case Opcodes.JSR /* 168 */:
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        interfaceC0518.mo1696(iM1909, i2, 3, c0493.m1908(i2 + 1) + i2);
                        return 3;
                    case Opcodes.RET /* 169 */:
                        interfaceC0518.mo1684(iM1909, i2, 2, c0493.m1909(i2 + 1), C3505.f11036, 0);
                        return 2;
                    case Opcodes.TABLESWITCH /* 170 */:
                        return m2003(i, interfaceC0518);
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return m2000(i, interfaceC0518);
                    case Opcodes.IRETURN /* 172 */:
                        interfaceC0518.mo1697(Opcodes.IRETURN, i2, C3505.f11031);
                        return 1;
                    case Opcodes.LRETURN /* 173 */:
                        interfaceC0518.mo1697(Opcodes.IRETURN, i2, C3505.f11032);
                        return 1;
                    case Opcodes.FRETURN /* 174 */:
                        interfaceC0518.mo1697(Opcodes.IRETURN, i2, C3505.f11030);
                        return 1;
                    case Opcodes.DRETURN /* 175 */:
                        interfaceC0518.mo1697(Opcodes.IRETURN, i2, C3505.f11029);
                        return 1;
                    case Opcodes.ARETURN /* 176 */:
                        interfaceC0518.mo1697(Opcodes.IRETURN, i2, C3505.f11042);
                        return 1;
                    case Opcodes.RETURN /* 177 */:
                    case Opcodes.ATHROW /* 191 */:
                    case Opcodes.MONITORENTER /* 194 */:
                    case Opcodes.MONITOREXIT /* 195 */:
                        interfaceC0518.mo1697(iM1909, i2, C3505.f11034);
                        return 1;
                    case Opcodes.GETSTATIC /* 178 */:
                    case Opcodes.PUTSTATIC /* 179 */:
                    case Opcodes.GETFIELD /* 180 */:
                    case Opcodes.PUTFIELD /* 181 */:
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.NEW /* 187 */:
                    case Opcodes.ANEWARRAY /* 189 */:
                    case Opcodes.CHECKCAST /* 192 */:
                    case Opcodes.INSTANCEOF /* 193 */:
                        interfaceC0518.mo1686(iM1909, i, 3, c2875.m4826(c0493.m1911(i + 1)), 0);
                        return 3;
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        interfaceC0518.mo1686(iM1909, i, 5, c2875.m4826(c0493.m1911(i + 1)), c0493.m1909(i + 3) | (c0493.m1909(i + 4) << 8));
                        return 5;
                    case 186:
                        interfaceC0518.mo1686(iM1909, i, 5, (C0904) c2875.m4826(c0493.m1911(i + 1)), 0);
                        return 5;
                    case Opcodes.NEWARRAY /* 188 */:
                        return m2001(i, interfaceC0518);
                    case 196:
                        return m2005(i, interfaceC0518);
                    case 197:
                        interfaceC0518.mo1686(iM1909, i2, 4, c2875.m4826(c0493.m1911(i2 + 1)), c0493.m1909(i2 + 3));
                        return 4;
                    case 200:
                    case 201:
                        interfaceC0518.mo1696(iM1909 == 200 ? Opcodes.GOTO : Opcodes.JSR, i2, 5, c0493.m1906(i2 + 1) + i2);
                        return 5;
                    default:
                        interfaceC0518.mo1691(iM1909, i2);
                        return 1;
                }
            } catch (C2766 e) {
                e = e;
                i2 = i;
                e.m3004("...at bytecode offset ".concat(AbstractC2902.m4907(i2)));
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                i2 = i;
                C2766 c2766 = new C2766(null, e);
                c2766.m3004("...at bytecode offset ".concat(AbstractC2902.m4907(i2)));
                throw c2766;
            }
        } catch (C2766 e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int m2000(int i, InterfaceC0518 interfaceC0518) {
        C0493 c0493 = (C0493) this.f2208;
        int i2 = (i + 4) & (-4);
        int iM1909 = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM1909 = (iM1909 << 8) | c0493.m1909(i3);
        }
        int iM1906 = c0493.m1906(i2) + i;
        int iM1907 = c0493.m1906(i2 + 4);
        int i4 = i2 + 8;
        C1244 c1244 = new C1244(iM1907, 1);
        for (int i5 = 0; i5 < iM1907; i5++) {
            int iM1908 = c0493.m1906(i4);
            int iM19010 = c0493.m1906(i4 + 4) + i;
            i4 += 8;
            c1244.m4109();
            if (iM19010 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C1676) c1244.f4507).m3546(iM1908);
            ((C1676) c1244.f4508).m3546(iM19010);
        }
        c1244.m3021(iM1906);
        c1244.m3020();
        c1244.mo3013();
        int i6 = i4 - i;
        interfaceC0518.mo1692(i, i6, c1244, iM1909);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int m2001(int i, InterfaceC0518 interfaceC0518) {
        C0917 c0917;
        int i2;
        C0493 c0493 = (C0493) this.f2208;
        int iM1909 = c0493.m1909(i + 1);
        switch (iM1909) {
            case 4:
                c0917 = C0917.f3398;
                break;
            case 5:
                c0917 = C0917.f3400;
                break;
            case 6:
                c0917 = C0917.f3402;
                break;
            case 7:
                c0917 = C0917.f3401;
                break;
            case 8:
                c0917 = C0917.f3399;
                break;
            case 9:
                c0917 = C0917.f3405;
                break;
            case 10:
                c0917 = C0917.f3404;
                break;
            case 11:
                c0917 = C0917.f3403;
                break;
            default:
                throw new C2766("bad newarray code ".concat(AbstractC2902.m4905(iM1909)), null);
        }
        int iMo1693 = interfaceC0518.mo1693();
        C0517 c0517 = new C0517();
        int i3 = 0;
        if (iMo1693 >= 0) {
            m1999(iMo1693, c0517);
            if ((c0517.f2204 instanceof C0902) && c0517.f2205 + iMo1693 == i) {
                i2 = c0517.f2206;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i4 = i + 2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            while (true) {
                int i5 = i4 + 1;
                if (c0493.m1909(i4) == 89) {
                    m1999(i5, c0517);
                    int i6 = c0517.f2205;
                    if (i6 != 0 && (c0517.f2204 instanceof C0902) && c0517.f2206 == i3) {
                        int i7 = i5 + i6;
                        m1999(i7, c0517);
                        int i8 = c0517.f2205;
                        if (i8 != 0) {
                            AbstractC0775 abstractC0775 = c0517.f2204;
                            if (abstractC0775 instanceof AbstractC0908) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC0775);
                                int i10 = i9 + 1;
                                int iM19010 = c0493.m1909(i9);
                                switch (iM1909) {
                                    case 4:
                                    case 8:
                                        if (iM19010 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM19010 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM19010 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM19010 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM19010 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM19010 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM19010 == 80) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 < 2 || i3 != i2) {
            interfaceC0518.mo1683(i, 2, c0917, null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC0518.mo1683(i, i11, c0917, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public C0187 m2002(int i) {
        C0491 c0491 = (C0491) this.f2208;
        try {
            int unsignedByte = c0491.readUnsignedByte();
            C0187 c0187 = new C0187(unsignedByte);
            for (int i2 = 0; i2 < unsignedByte; i2++) {
                int unsignedShort = c0491.readUnsignedShort();
                C0185 c0185 = new C0185();
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    c0185.m1374(m1995(i));
                }
                c0185.f7068 = false;
                c0185.m4110();
                c0187.m3166(i2, c0185);
            }
            c0187.f7068 = false;
            if (c0491.available() == 0) {
                return c0187;
            }
            throw new C2371("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int m2003(int i, InterfaceC0518 interfaceC0518) {
        C0493 c0493 = (C0493) this.f2208;
        int i2 = (i + 4) & (-4);
        int iM1909 = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM1909 = (iM1909 << 8) | c0493.m1909(i3);
        }
        int iM1906 = c0493.m1906(i2) + i;
        int iM1907 = c0493.m1906(i2 + 4);
        int iM1908 = c0493.m1906(i2 + 8);
        int i4 = (iM1908 - iM1907) + 1;
        int i5 = i2 + 12;
        if (iM1907 > iM1908) {
            throw new C2766("low / high inversion", null);
        }
        C1244 c1244 = new C1244(i4, 1);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM19010 = c0493.m1906(i5) + i;
            i5 += 4;
            int i7 = iM1907 + i6;
            c1244.m4109();
            if (iM19010 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C1676) c1244.f4507).m3546(i7);
            ((C1676) c1244.f4508).m3546(iM19010);
        }
        c1244.m3021(iM1906);
        c1244.m3020();
        c1244.mo3013();
        int i8 = i5 - i;
        interfaceC0518.mo1692(i, i8, c1244, iM1909);
        return i8;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public AbstractC0775 m2004() {
        C2875 c2875 = (C2875) this.f2209;
        C0491 c0491 = (C0491) this.f2208;
        int unsignedByte = c0491.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C0887(m1995(4));
        }
        if (unsignedByte == 70) {
            return (C0899) m1997();
        }
        if (unsignedByte == 83) {
            int i = ((C0902) m1997()).f3371;
            short s = (short) i;
            if (s == i) {
                return new C0915(s);
            }
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "bogus short value: "));
        }
        if (unsignedByte == 99) {
            String str = ((C0916) c2875.m4826(c0491.readUnsignedShort())).f3385;
            ConcurrentHashMap concurrentHashMap = C3505.f11025;
            try {
                return new C0917(str.equals("V") ? C3505.f11034 : C3505.m5023(str));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m2009(4);
            C0913 c0913 = new C0913((C0916) c2875.m4826(c0491.readUnsignedShort()), (C0916) c2875.m4826(c0491.readUnsignedShort()));
            C0897 c0897 = new C0897(new C0917(c0913.m2545()), c0913);
            c0897.f3347 = null;
            return c0897;
        }
        if (unsignedByte == 115) {
            return m1997();
        }
        if (unsignedByte == 73) {
            return (C0902) m1997();
        }
        if (unsignedByte == 74) {
            return (C0909) m1997();
        }
        if (unsignedByte == 90) {
            return C0891.m2528(((C0902) m1997()).f3371);
        }
        if (unsignedByte == 91) {
            m2009(2);
            int unsignedShort = c0491.readUnsignedShort();
            C0888 c0888 = new C0888(unsignedShort);
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c0888.m3166(i2, m2004());
            }
            c0888.f7068 = false;
            return new C0889(c0888);
        }
        switch (unsignedByte) {
            case 66:
                int i3 = ((C0902) m1997()).f3371;
                byte b = (byte) i3;
                if (b == i3) {
                    return new C0892(b);
                }
                throw new IllegalArgumentException(AbstractC1095.m2794(i3, "bogus byte value: "));
            case 67:
                int i4 = ((C0902) m1997()).f3371;
                char c = (char) i4;
                if (c == i4) {
                    return new C0895(c);
                }
                throw new IllegalArgumentException(AbstractC1095.m2794(i4, "bogus char value: "));
            case 68:
                return (C0896) m1997();
            default:
                throw new C2371("unknown annotation tag: ".concat(AbstractC2902.m4905(unsignedByte)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public int m2005(int i, InterfaceC0518 interfaceC0518) {
        C0493 c0493 = (C0493) this.f2208;
        int iM1909 = c0493.m1909(i + 1);
        int iM1911 = c0493.m1911(i + 2);
        if (iM1909 == 132) {
            interfaceC0518.mo1684(iM1909, i, 6, iM1911, C3505.f11031, c0493.m1908(i + 4));
            return 6;
        }
        if (iM1909 == 169) {
            interfaceC0518.mo1684(iM1909, i, 4, iM1911, C3505.f11036, 0);
            return 4;
        }
        switch (iM1909) {
            case Opcodes.ILOAD /* 21 */:
                interfaceC0518.mo1684(21, i, 4, iM1911, C3505.f11031, 0);
                return 4;
            case Opcodes.LLOAD /* 22 */:
                interfaceC0518.mo1684(21, i, 4, iM1911, C3505.f11032, 0);
                return 4;
            case Opcodes.FLOAD /* 23 */:
                interfaceC0518.mo1684(21, i, 4, iM1911, C3505.f11030, 0);
                return 4;
            case Opcodes.DLOAD /* 24 */:
                interfaceC0518.mo1684(21, i, 4, iM1911, C3505.f11029, 0);
                return 4;
            case Opcodes.ALOAD /* 25 */:
                interfaceC0518.mo1684(21, i, 4, iM1911, C3505.f11042, 0);
                return 4;
            default:
                switch (iM1909) {
                    case Opcodes.ISTORE /* 54 */:
                        interfaceC0518.mo1684(54, i, 4, iM1911, C3505.f11031, 0);
                        return 4;
                    case Opcodes.LSTORE /* 55 */:
                        interfaceC0518.mo1684(54, i, 4, iM1911, C3505.f11032, 0);
                        return 4;
                    case Opcodes.FSTORE /* 56 */:
                        interfaceC0518.mo1684(54, i, 4, iM1911, C3505.f11030, 0);
                        return 4;
                    case Opcodes.DSTORE /* 57 */:
                        interfaceC0518.mo1684(54, i, 4, iM1911, C3505.f11029, 0);
                        return 4;
                    case Opcodes.ASTORE /* 58 */:
                        interfaceC0518.mo1684(54, i, 4, iM1911, C3505.f11042, 0);
                        return 4;
                    default:
                        interfaceC0518.mo1691(196, i);
                        return 1;
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public void m2006(InterfaceC2429 interfaceC2429, Object obj) {
        HashMap map = (HashMap) this.f2209;
        C1516 c1516 = (C1516) map.get(interfaceC2429);
        if (c1516 == null) {
            c1516 = new C1516(interfaceC2429);
            c1516.f5347 = c1516;
            C1516 c1517 = (C1516) this.f2208;
            c1516.f5347 = c1517.f5347;
            c1516.f5346 = c1517;
            c1517.f5347 = c1516;
            c1516.f5347.f5346 = c1516;
            map.put(interfaceC2429, c1516);
        } else {
            interfaceC2429.mo3814();
        }
        if (c1516.f5345 == null) {
            c1516.f5345 = new ArrayList();
        }
        c1516.f5345.add(obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public void m2007(String str) {
        C1069 c1069;
        synchronized (this) {
            try {
                c1069 = (C1069) ((HashMap) this.f2208).get(str);
                AbstractC2727.m4693(c1069, "Argument must not be null");
                int i = c1069.f3864;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c1069.f3864);
                }
                int i2 = i - 1;
                c1069.f3864 = i2;
                if (i2 == 0) {
                    C1069 c10610 = (C1069) ((HashMap) this.f2208).remove(str);
                    if (!c10610.equals(c1069)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1069 + ", but actually removed: " + c10610 + ", safeKey: " + str);
                    }
                    C0507 c0507 = (C0507) this.f2209;
                    synchronized (c0507.f2179) {
                        try {
                            if (c0507.f2179.size() < 10) {
                                c0507.f2179.offer(c10610);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c1069.f3863.unlock();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public Object m2008() {
        C1516 c1516 = (C1516) this.f2208;
        C1516 c1517 = c1516.f5347;
        while (true) {
            boolean zEquals = c1517.equals(c1516);
            Object obj = c1517.f5344;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c1517.f5345;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c1517.f5345.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1516 c1518 = c1517.f5347;
            c1518.f5346 = c1517.f5346;
            c1517.f5346.f5347 = c1518;
            ((HashMap) this.f2209).remove(obj);
            ((InterfaceC2429) obj).mo3814();
            c1517 = c1517.f5347;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public void m2009(int i) {
        if (((C0491) this.f2208).available() < i) {
            throw new C2371("truncated annotation attribute", null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public void m2010(boolean z) {
        C1183 c1183 = (C1183) ((C0519) ((C0102) this.f2209).f1117).f2209;
        if (c1183.f4320 != z) {
            if (c1183.f4319 != null) {
                C1148 c1148M2897 = C1148.m2897();
                C1182 c1182 = c1183.f4319;
                c1148M2897.getClass();
                C1787.m3664(c1182, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c1148M2897.f4249;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c1148M2897.f4250.remove(c1182);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c1183.f4320 = z;
            if (z) {
                C1183.m2914(c1183.f4318, C1148.m2897().m2898());
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public void m2011(int i, int i2, int i3, int i4) {
        AbstractC0539 abstractC0539 = (AbstractC0539) this.f2209;
        abstractC0539.f2254.set(i, i2, i3, i4);
        Rect rect = abstractC0539.f2253;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public /* synthetic */ C0519(Object obj, int i, Object obj2) {
        this.f2207 = i;
        this.f2208 = obj;
        this.f2209 = obj2;
    }

    public /* synthetic */ C0519(Object obj, Object obj2, int i, boolean z) {
        this.f2207 = i;
        this.f2209 = obj;
        this.f2208 = obj2;
    }

    public C0519(int i) {
        this.f2207 = i;
        switch (i) {
            case 15:
                this.f2208 = new C1516(null);
                this.f2209 = new HashMap();
                break;
            case 19:
                this.f2208 = new AtomicReference();
                this.f2209 = new C0274(0);
                break;
            case Opcodes.DLOAD /* 24 */:
                this.f2208 = new ArrayList();
                this.f2209 = new HashMap();
                break;
            case 27:
                this.f2208 = new C1896(1000L);
                this.f2209 = AbstractC2902.m4902(10, new C2135(12));
                break;
            default:
                this.f2208 = new HashMap();
                this.f2209 = new C0507(1);
                break;
        }
    }

    public C0519(Context context, String str) {
        this.f2207 = 17;
        this.f2208 = new C2933(new C0114(context, 28));
        this.f2209 = new C2933(new C0310(this, 4, str));
    }

    public C0519(C0253 c0253) {
        this.f2207 = 18;
        C2136 c2136 = new C2136(c0253);
        this.f2209 = new C0967(5);
        this.f2208 = c2136;
    }

    public C0519(C1669 c1669) {
        this.f2207 = 20;
        this.f2208 = c1669;
        this.f2209 = new C2933(new C2070(this, 5));
    }

    public C0519(C2136 c2136) {
        this.f2207 = 22;
        this.f2208 = c2136;
        this.f2209 = new C2933(new C2070(this, 7));
    }

    public C0519(C0519 c0519) {
        this.f2207 = 21;
        this.f2208 = c0519;
        this.f2209 = new C2933(new C2070(this, 6));
    }

    public C0519(EditText editText, int i) {
        this.f2207 = i;
        switch (i) {
            case 10:
                this.f2208 = editText;
                C1183 c1183 = new C1183(editText);
                this.f2209 = c1183;
                editText.addTextChangedListener(c1183);
                if (C1152.f4265 == null) {
                    synchronized (C1152.f4264) {
                        try {
                            if (C1152.f4265 == null) {
                                C1152 c1152 = new C1152();
                                try {
                                    C1152.f4266 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1152.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C1152.f4265 = c1152;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C1152.f4265);
                return;
            default:
                this.f2208 = editText;
                this.f2209 = new C0102(editText);
                return;
        }
    }

    public C0519(C0561 c0561, int i, int i2, int i3, int i4) {
        this.f2207 = 23;
        this.f2208 = new C2341(c0561, i, i3, i4);
        this.f2209 = new ArrayList(i2);
    }

    public C0519(C0493 c0493, C2875 c2875) {
        this.f2207 = 0;
        if (c2875 != null) {
            this.f2208 = c0493;
            this.f2209 = c2875;
            return;
        }
        throw new NullPointerException("pool == null");
    }

    public C0519(C1046 c1046, int i, int i2) {
        this.f2207 = 2;
        if (c1046 != null) {
            c1046.m2737();
            this.f2209 = c1046.f3805;
            this.f2208 = new C0491(new C0492(c1046.f3803.m1919(i, i2 + i)));
            return;
        }
        throw new NullPointerException("cf == null");
    }

    public C0519(C2654 c2654) {
        this.f2207 = 26;
        this.f2209 = c2654;
        this.f2208 = new HashMap();
    }

    public C0519(ArrayList arrayList, ArrayList arrayList2) {
        this.f2207 = 14;
        int size = arrayList.size();
        this.f2208 = new int[size];
        this.f2209 = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2208)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2209)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0519(int i, int i2) {
        this.f2207 = 14;
        this.f2208 = new int[]{i, i2};
        this.f2209 = new float[]{0.0f, 1.0f};
    }

    public C0519(int i, int i2, int i3) {
        this.f2207 = 14;
        this.f2208 = new int[]{i, i2, i3};
        this.f2209 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0519(AbstractC0539 abstractC0539) {
        this.f2207 = 7;
        this.f2209 = abstractC0539;
    }
}
