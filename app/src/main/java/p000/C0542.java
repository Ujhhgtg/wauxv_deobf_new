package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageDecoder;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0542 implements InterfaceC2574, InterfaceC1171, InterfaceC1963, InterfaceC0401, InterfaceC0954 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f2253;

    static {
        new C0403();
    }

    public /* synthetic */ C0542(int i, boolean z) {
        this.f2251 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0158 m1879(ImageDecoder.Source source, int i, int i2, C2303 c2303) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1001(i, i2, c2303));
        if (AbstractC0080.m992(drawableDecodeDrawable)) {
            return new C0158(0, AbstractC0080.m975(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // p000.InterfaceC1171
    public Object getResult() {
        return (C3504) this.f2252;
    }

    public String toString() {
        switch (this.f2251) {
            case 14 /* 14 */:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1504 c1504 = (C1504) this.f2252;
                C1504 c1505 = c1504.f5315;
                boolean z = false;
                while (!c1505.equals(c1504)) {
                    sb.append('{');
                    sb.append(c1505.f5313);
                    sb.append(':');
                    ArrayList arrayList = c1505.f5314;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c1505 = c1505.f5315;
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

    @Override // p000.InterfaceC1171
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean mo1880(CharSequence charSequence, int i, int i2, C3465 c3465) {
        if ((c3465.f10951 & 4) > 0) {
            return true;
        }
        if (((C3504) this.f2252) == null) {
            this.f2252 = new C3504(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        
        ((C3504) this.f2252).setSpan(new C3466(c3465), i, i2, 33);
        return true;
    }

    @Override // p000.InterfaceC1963
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public Drawable mo1502(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f2253;
        File file = new File(C1362.f4863, ((C1357) ((List) this.f2252).get(i)).f4854);
        if (!file.exists()) {
            return viewGroup.getContext().getDrawable(R.drawable.ic_float_button_menu_24dp);
        }
        return new BitmapDrawable(viewGroup.getContext().getResources(), BitmapFactory.decodeFile(file.getAbsolutePath()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1881(C2805 c2805) {
        if (((ArrayList) this.f2253) == null) {
            this.f2253 = new ArrayList();
        }
        int size = ((ArrayList) this.f2253).size();
        for (int i = 0; i < size; i++) {
            C2805 c2806 = (C2805) ((ArrayList) this.f2253).get(i);
            if (c2806.f8945 == c2805.f8945) {
                ((ArrayList) this.f2253).remove(i);
            }
            if (c2806.f8945 >= c2805.f8945) {
                ((ArrayList) this.f2253).add(i, c2805);
                return;
            }
        }
        ((ArrayList) this.f2253).add(c2805);
    }

    @Override // p000.InterfaceC0954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo1882(Exception exc) {
        C2787 c2787 = (C2787) this.f2253;
        C1995 c1995 = (C1995) this.f2252;
        C1995 c1996 = c2787.f8902;
        if (c1996 == null || c1996 != c1995) {
            return;
        }
        C2787 c2788 = (C2787) this.f2253;
        C1995 c1997 = (C1995) this.f2252;
        RunnableC0972 runnableC0972 = c2788.f8898;
        C0953 c0953 = c2788.f8903;
        InterfaceC0955 interfaceC0955 = c1997.f6657;
        runnableC0972.mo2449(c0953, exc, interfaceC0955, interfaceC0955.mo1857());
    }

    @Override // p000.InterfaceC1963
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public int mo1505() {
        return AbstractC3681.m5331(((ViewGroup) this.f2253).getContext()) ? Color.parseColor(C1358.f4858.m2542()) : Color.parseColor(C1359.f4859.m2542());
    }

    @Override // p000.InterfaceC1963
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo1506() {
        return ((List) this.f2252).size();
    }

    @Override // p000.InterfaceC0401
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1575(C0402 c0402) {
        if (((C2596) this.f2253).m4612(c0402)) {
            ((C1660) this.f2252).m3382(c0402.f1897);
        }
    }

    @Override // p000.InterfaceC0954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo1883(Object obj) {
        C2787 c2787 = (C2787) this.f2253;
        C1995 c1995 = (C1995) this.f2252;
        C1995 c1996 = c2787.f8902;
        if (c1996 == null || c1996 != c1995) {
            return;
        }
        C2787 c2788 = (C2787) this.f2253;
        C1995 c1997 = (C1995) this.f2252;
        C1063 c1063 = c2788.f8897.f3536;
        if (obj != null && c1063.m2616(c1997.f6657.mo1857())) {
            c2788.f8901 = obj;
            c2788.f8898.m2505(2);
        } else {
            RunnableC0972 runnableC0972 = c2788.f8898;
            InterfaceC1749 interfaceC1749 = c1997.f6655;
            InterfaceC0955 interfaceC0955 = c1997.f6657;
            runnableC0972.mo2448(interfaceC1749, obj, interfaceC0955, interfaceC0955.mo1857(), c2788.f8903);
        }
    }

    @Override // p000.InterfaceC1963
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public int mo1509() {
        return AbstractC3681.m5331(((ViewGroup) this.f2253).getContext()) ? Color.parseColor(C1360.f4860.m2542()) : Color.parseColor(C1361.f4861.m2542());
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo1510(Object obj, File file, C2303 c2303) {
        return ((C0421) this.f2253).mo1510(new C0425((InterfaceC0424) this.f2252, ((BitmapDrawable) ((InterfaceC2568) obj).get()).getBitmap()), file, c2303);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1884() {
        int[] iArr = (int[]) this.f2252;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2253 = null;
    }

    @Override // p000.InterfaceC2574
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo1614(C2303 c2303) {
        return 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m1885(int i) {
        int[] iArr = (int[]) this.f2252;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f2252 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2252 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2252;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1886(int i) {
        ArrayList arrayList = (ArrayList) this.f2253;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2805) ((ArrayList) this.f2253).get(size)).f8945 >= i) {
                    ((ArrayList) this.f2253).remove(size);
                }
            }
        }
        m1895(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Object m1887(InterfaceC2376 interfaceC2376) {
        HashMap map = (HashMap) this.f2253;
        C1504 c1504 = (C1504) map.get(interfaceC2376);
        if (c1504 == null) {
            c1504 = new C1504(interfaceC2376);
            map.put(interfaceC2376, c1504);
        } else {
            interfaceC2376.mo3636();
        }
        C1504 c1505 = c1504.f5316;
        c1505.f5315 = c1504.f5315;
        c1504.f5315.f5316 = c1505;
        C1504 c1506 = (C1504) this.f2252;
        c1504.f5316 = c1506;
        C1504 c1507 = c1506.f5315;
        c1504.f5315 = c1507;
        c1507.f5316 = c1504;
        c1504.f5316.f5315 = c1504;
        ArrayList arrayList = c1504.f5314;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1504.f5314.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C2805 m1888(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f2253;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2805 c2805 = (C2805) ((ArrayList) this.f2253).get(i4);
            int i5 = c2805.f8945;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || c2805.f8946 == i3 || c2805.f8948)) {
                return c2805;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C2805 m1889(int i) {
        ArrayList arrayList = (ArrayList) this.f2253;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2805 c2805 = (C2805) ((ArrayList) this.f2253).get(size);
            if (c2805.f8945 == i) {
                return c2805;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public KeyListener m1890(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        
        if (keyListener instanceof C1168) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return false ? keyListener : new C1168(keyListener);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public SharedPreferencesC1269 m1891() {
        return (SharedPreferencesC1269) ((C2873) this.f2253).getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public synchronized List m1892(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f2252).contains(str)) {
                ((ArrayList) this.f2252).add(str);
            }
            arrayList = (List) ((HashMap) this.f2253).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f2253).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public synchronized ArrayList m1893(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2252).iterator();
        while (it.hasNext()) {
            List<C2572> list = (List) ((HashMap) this.f2253).get((String) it.next());
            if (list != null) {
                for (C2572 c2572 : list) {
                    if ((c2572.f8164.isAssignableFrom(cls) && cls2.isAssignableFrom(c2572.f8165)) && !arrayList.contains(c2572.f8165)) {
                        arrayList.add(c2572.f8165);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public String m1894(InterfaceC1749 interfaceC1749) {
        String str;
        synchronized (((C1870) this.f2252)) {
            str = (String) ((C1870) this.f2252).m3649(interfaceC1749);
        }
        if (str == null) {
            C2621 c2621 = (C2621) ((C0243) this.f2253).mo1312();
            try {
                interfaceC1749.mo2001(c2621.f8507);
                byte[] bArrDigest = c2621.f8507.digest();
                char[] cArr = AbstractC3522.f11033;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = AbstractC3522.f11032;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((C0243) this.f2253).mo1311(c2621);
            } catch (Throwable th) {
                ((C0243) this.f2253).mo1311(c2621);
                throw th;
            }
        }
        synchronized (((C1870) this.f2252)) {
            ((C1870) this.f2252).m3652(interfaceC1749, str);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int m1895(int i) {
        int i2;
        int[] iArr = (int[]) this.f2252;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.f2253) != null) {
            C2805 c2805M1889 = m1889(i);
            if (c2805M1889 != null) {
                ((ArrayList) this.f2253).remove(c2805M1889);
            }
            int size = ((ArrayList) this.f2253).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((C2805) ((ArrayList) this.f2253).get(i3)).f8945 >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                C2805 c2805 = (C2805) ((ArrayList) this.f2253).get(i3);
                ((ArrayList) this.f2253).remove(i3);
                i2 = c2805.f8945;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            int[] iArr2 = (int[]) this.f2252;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.f2252).length;
        }
        int iMin = Math.min(i2 + 1, ((int[]) this.f2252).length);
        Arrays.fill((int[]) this.f2252, i, iMin, -1);
        return iMin;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m1896(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2252).getContext().obtainStyledAttributes(attributeSet, AbstractC2470.f7883, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1916(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public void m1897(int i, int i2) {
        int[] iArr = (int[]) this.f2252;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1885(i3);
        int[] iArr2 = (int[]) this.f2252;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f2252, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f2253;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2805 c2805 = (C2805) ((ArrayList) this.f2253).get(size);
            int i4 = c2805.f8945;
            if (i4 >= i) {
                c2805.f8945 = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1898(int i, int i2) {
        int[] iArr = (int[]) this.f2252;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1885(i3);
        int[] iArr2 = (int[]) this.f2252;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f2252;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2253;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2805 c2805 = (C2805) ((ArrayList) this.f2253).get(size);
            int i4 = c2805.f8945;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f2253).remove(size);
                } else {
                    c2805.f8945 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C1165 m1899(InputConnection inputConnection, EditorInfo editorInfo) {
        C0094 c0094 = (C0094) this.f2253;
        if (inputConnection == null) {
            
            inputConnection = null;
        } else {
            C0542 c0542 = (C0542) c0094.f1049;
            
            if (!(inputConnection instanceof C1165)) {
                inputConnection = new C1165((EditText) c0542.f2252, inputConnection, editorInfo);
            }
        }
        return (C1165) inputConnection;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void m1900(C1377 c1377) {
        ExecutorC2560 executorC2560 = (ExecutorC2560) this.f2253;
        C1744 c1744 = (C1744) this.f2252;
        int i = c1377.f4962;
        if (i == 0) {
            executorC2560.execute(new RunnableC0132(c1744, c1377.f4961, 1, false));
        } else {
            executorC2560.execute(new RunnableC0386(i, 1, c1744));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public C0165 m1901(int i) throws IOException {
        m1915(4);
        C0514 c0514 = (C0514) this.f2252;
        int unsignedShort = c0514.readUnsignedShort();
        int unsignedShort2 = c0514.readUnsignedShort();
        C2815 c2815 = (C2815) this.f2253;
        C0165 c0165 = new C0165(new C0918(C3448.m4961(((C0917) c2815.m4793(unsignedShort)).f3378)), i);
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            m1915(5);
            c0165.m1215(new C2119((C0917) c2815.m4793(c0514.readUnsignedShort()), m1910()));
        }
        c0165.f6944 = false;
        return c0165;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public C0177 m1902(int i) {
        C0514 c0514 = (C0514) this.f2252;
        try {
            int unsignedShort = c0514.readUnsignedShort();
            C0177 c0177 = new C0177();
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c0177.m1228(m1901(i));
            }
            c0177.f6944 = false;
            if (c0514.available() == 0) {
                return c0177;
            }
            throw new C2331("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public AbstractC0777 m1903() throws IOException {
        return ((C2815) this.f2253).m4793(((C0514) this.f2252).readUnsignedShort());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public void m1904(Context context, XmlResourceParser xmlResourceParser) {
        C0792 c0792 = new C0792();
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
                    C0787 c0787M2300 = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c0787M2300 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0787M2300.f2981.m2295(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c0787M2300 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0787M2300.f2980.m2296(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c0787M2300 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0787M2300.f2979.m2297(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c0787M2300 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c0787M2300.f2982.m2298(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c0787M2300 = C0792.m2300(context, Xml.asAttributeSet(xmlResourceParser));
                                        c0787M2300.f2981.f2985 = true;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c0787M2300 = C0792.m2300(context, Xml.asAttributeSet(xmlResourceParser));
                                        c0787M2300.f2981.f3039 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c0787M2300 == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C0780.m2282(context, xmlResourceParser, c0787M2300.f2983);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c0787M2300 = C0792.m2300(context, Xml.asAttributeSet(xmlResourceParser));
                                    }
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                ((SparseArray) this.f2253).put(identifier, c0792);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c0792.f3072.put(Integer.valueOf(c0787M2300.f2978), c0787M2300);
                                c0787M2300 = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.f2253).put(identifier, c0792);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int m1905(int i, InterfaceC0541 interfaceC0541) {
        int i2 = i;
        C2815 c2815 = (C2815) this.f2253;
        C0516 c0516 = (C0516) this.f2252;
        byte[] bArr = c0516.f2190;
        try {
            int iM1815 = c0516.m1815(i2);
            int i3 = AbstractC0537.f2240[iM1815];
            try {
                switch (iM1815) {
                    case 0:
                        interfaceC0541.mo1591(0, i2, C3448.f10874);
                        return 1;
                    case 1:
                        interfaceC0541.mo1580(18, i, 1, C0906.f3363, 0);
                        return 1;
                    case 2:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3349, -1);
                        return 1;
                    case 3:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3350, 0);
                        return 1;
                    case 4:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3351, 1);
                        return 1;
                    case 5:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3352, 2);
                        return 1;
                    case 6:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3353, 3);
                        return 1;
                    case 7:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3354, 4);
                        return 1;
                    case 8:
                        interfaceC0541.mo1580(18, i, 1, C0903.f3355, 5);
                        return 1;
                    case 9:
                        interfaceC0541.mo1580(18, i, 1, C0910.f3366, 0);
                        return 1;
                    case 10:
                        interfaceC0541.mo1580(18, i, 1, C0910.f3367, 0);
                        return 1;
                    case 11:
                        interfaceC0541.mo1580(18, i, 1, C0900.f3341, 0);
                        return 1;
                    case 12 /* 12 */:
                        interfaceC0541.mo1580(18, i, 1, C0900.f3342, 0);
                        return 1;
                    case 13:
                        interfaceC0541.mo1580(18, i, 1, C0900.f3343, 0);
                        return 1;
                    case 14 /* 14 */:
                        interfaceC0541.mo1580(18, i, 1, C0897.f3338, 0);
                        return 1;
                    case 15:
                        interfaceC0541.mo1580(18, i, 1, C0897.f3339, 0);
                        return 1;
                    case 16:
                        int i4 = i + 1;
                        c0516.m1810(i4, i + 2);
                        byte b = bArr[i4];
                        interfaceC0541.mo1580(18, i, 2, C0903.m2420(b), b);
                        return 2;
                    case 17 /* 17 */:
                        int iM1814 = c0516.m1814(i + 1);
                        interfaceC0541.mo1580(18, i, 3, C0903.m2420(iM1814), iM1814);
                        return 3;
                    case 18 /* 18 */:
                        AbstractC0777 abstractC0777M4793 = c2815.m4793(c0516.m1815(i + 1));
                        interfaceC0541.mo1580(18, i, 2, abstractC0777M4793, abstractC0777M4793 instanceof C0903 ? ((C0903) abstractC0777M4793).m2421() : 0);
                        return 2;
                    case 19:
                        AbstractC0777 abstractC0777M4794 = c2815.m4793(c0516.m1817(i + 1));
                        interfaceC0541.mo1580(18, i, 3, abstractC0777M4794, abstractC0777M4794 instanceof C0903 ? ((C0903) abstractC0777M4794).m2421() : 0);
                        return 3;
                    case 20:
                        interfaceC0541.mo1580(20, i, 3, c2815.m4793(c0516.m1817(i + 1)), 0);
                        return 3;
                    case 21 /* 21 */:
                        interfaceC0541.mo1578(21, i, 2, c0516.m1815(i + 1), C3448.f10871, 0);
                        return 2;
                    case 22 /* 22 */:
                        interfaceC0541.mo1578(21, i, 2, c0516.m1815(i + 1), C3448.f10872, 0);
                        return 2;
                    case 23 /* 23 */:
                        interfaceC0541.mo1578(21, i, 2, c0516.m1815(i + 1), C3448.f10870, 0);
                        return 2;
                    case 24 /* 24 */:
                        interfaceC0541.mo1578(21, i, 2, c0516.m1815(i + 1), C3448.f10869, 0);
                        return 2;
                    case 25 /* 25 */:
                        interfaceC0541.mo1578(21, i, 2, c0516.m1815(i + 1), C3448.f10882, 0);
                        return 2;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        interfaceC0541.mo1578(21, i, 1, iM1815 - 26, C3448.f10871, 0);
                        return 1;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        interfaceC0541.mo1578(21, i, 1, iM1815 - 30, C3448.f10872, 0);
                        return 1;
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        interfaceC0541.mo1578(21, i, 1, iM1815 - 34, C3448.f10870, 0);
                        return 1;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        interfaceC0541.mo1578(21, i, 1, iM1815 - 38, C3448.f10869, 0);
                        return 1;
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                        interfaceC0541.mo1578(21, i2, 1, iM1815 - 42, C3448.f10882, 0);
                        return 1;
                    case 46 /* 46 */:
                        interfaceC0541.mo1591(46, i2, C3448.f10871);
                        return 1;
                    case 47:
                        interfaceC0541.mo1591(46, i2, C3448.f10872);
                        return 1;
                    case 48:
                        interfaceC0541.mo1591(46, i2, C3448.f10870);
                        return 1;
                    case 49:
                        interfaceC0541.mo1591(46, i2, C3448.f10869);
                        return 1;
                    case 50 /* 50 */:
                        interfaceC0541.mo1591(46, i2, C3448.f10882);
                        return 1;
                    case 51 /* 51 */:
                        interfaceC0541.mo1591(46, i2, C3448.f10867);
                        return 1;
                    case 52:
                        interfaceC0541.mo1591(46, i2, C3448.f10868);
                        return 1;
                    case 53 /* 53 */:
                        interfaceC0541.mo1591(46, i2, C3448.f10873);
                        return 1;
                    case 54 /* 54 */:
                        interfaceC0541.mo1578(54, i, 2, c0516.m1815(i + 1), C3448.f10871, 0);
                        return 2;
                    case 55 /* 55 */:
                        interfaceC0541.mo1578(54, i, 2, c0516.m1815(i + 1), C3448.f10872, 0);
                        return 2;
                    case 56 /* 56 */:
                        interfaceC0541.mo1578(54, i, 2, c0516.m1815(i + 1), C3448.f10870, 0);
                        return 2;
                    case 57 /* 57 */:
                        interfaceC0541.mo1578(54, i, 2, c0516.m1815(i + 1), C3448.f10869, 0);
                        return 2;
                    case 58 /* 58 */:
                        interfaceC0541.mo1578(54, i, 2, c0516.m1815(i + 1), C3448.f10882, 0);
                        return 2;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        interfaceC0541.mo1578(54, i, 1, iM1815 - 59, C3448.f10871, 0);
                        return 1;
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                        interfaceC0541.mo1578(54, i, 1, iM1815 - 63, C3448.f10872, 0);
                        return 1;
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        interfaceC0541.mo1578(54, i, 1, iM1815 - 67, C3448.f10870, 0);
                        return 1;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        interfaceC0541.mo1578(54, i, 1, iM1815 - 71, C3448.f10869, 0);
                        return 1;
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        interfaceC0541.mo1578(54, i2, 1, iM1815 - 75, C3448.f10882, 0);
                        return 1;
                    case 79 /* 79 */:
                        interfaceC0541.mo1591(79, i2, C3448.f10871);
                        return 1;
                    case 80:
                        interfaceC0541.mo1591(79, i2, C3448.f10872);
                        return 1;
                    case 81:
                        interfaceC0541.mo1591(79, i2, C3448.f10870);
                        return 1;
                    case 82:
                        interfaceC0541.mo1591(79, i2, C3448.f10869);
                        return 1;
                    case 83 /* 83 */:
                        interfaceC0541.mo1591(79, i2, C3448.f10882);
                        return 1;
                    case 84 /* 84 */:
                        interfaceC0541.mo1591(79, i2, C3448.f10867);
                        return 1;
                    case 85 /* 85 */:
                        interfaceC0541.mo1591(79, i2, C3448.f10868);
                        return 1;
                    case 86:
                        interfaceC0541.mo1591(79, i2, C3448.f10873);
                        return 1;
                    case 87 /* 87 */:
                    case 88 /* 88 */:
                    case 89 /* 89 */:
                    case 90:
                    case 91:
                    case 92 /* 92 */:
                    case 93:
                    case 94:
                    case 95 /* 95 */:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10874);
                        return 1;
                    case 96 /* 96 */:
                    case 100:
                    case 104:
                    case 108 /* 108 */:
                    case 112:
                    case 116 /* 116 */:
                    case 120:
                    case 122:
                    case 124 /* 124 */:
                    case 126:
                    case 128:
                    case 130 /* 130 */:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10871);
                        return 1;
                    case 97 /* 97 */:
                    case 101:
                    case 105:
                    case 109 /* 109 */:
                    case 113:
                    case 117 /* 117 */:
                    case 121:
                    case 123 /* 123 */:
                    case 125 /* 125 */:
                    case 127:
                    case 129 /* 129 */:
                    case 131 /* 131 */:
                        interfaceC0541.mo1591(iM1815 - 1, i2, C3448.f10872);
                        return 1;
                    case 98:
                    case 102:
                    case 106:
                    case 110 /* 110 */:
                    case 114 /* 114 */:
                    case 118 /* 118 */:
                        interfaceC0541.mo1591(iM1815 - 2, i2, C3448.f10870);
                        return 1;
                    case 99:
                    case 103:
                    case 107:
                    case 111 /* 111 */:
                    case 115:
                    case 119 /* 119 */:
                        interfaceC0541.mo1591(iM1815 - 3, i2, C3448.f10869);
                        return 1;
                    case 132 /* 132 */:
                        int iM1816 = c0516.m1815(i2 + 1);
                        int i5 = i2 + 2;
                        c0516.m1810(i5, i2 + 3);
                        interfaceC0541.mo1578(132, i2, 3, iM1816, C3448.f10871, bArr[i5]);
                        return 3;
                    case 133 /* 133 */:
                    case 140 /* 140 */:
                    case 143 /* 143 */:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10872);
                        return 1;
                    case 134 /* 134 */:
                    case 137:
                    case 144:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10870);
                        return 1;
                    case 135 /* 135 */:
                    case 138:
                    case 141:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10869);
                        return 1;
                    case 136 /* 136 */:
                    case 139 /* 139 */:
                    case 142 /* 142 */:
                    case 145 /* 145 */:
                    case 146 /* 146 */:
                    case 147 /* 147 */:
                    case 148 /* 148 */:
                    case 149 /* 149 */:
                    case 150 /* 150 */:
                    case 151 /* 151 */:
                    case 152 /* 152 */:
                    case 190 /* 190 */:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10871);
                        return 1;
                    case 153 /* 153 */:
                    case 154 /* 154 */:
                    case 155 /* 155 */:
                    case 156 /* 156 */:
                    case 157 /* 157 */:
                    case 158 /* 158 */:
                    case 159 /* 159 */:
                    case 160 /* 160 */:
                    case 161 /* 161 */:
                    case 162 /* 162 */:
                    case 163 /* 163 */:
                    case 164 /* 164 */:
                    case 165 /* 165 */:
                    case 166 /* 166 */:
                    case 167 /* 167 */:
                    case 168 /* 168 */:
                    case 198 /* 198 */:
                    case 199 /* 199 */:
                        interfaceC0541.mo1590(iM1815, i2, 3, c0516.m1814(i2 + 1) + i2);
                        return 3;
                    case 169 /* 169 */:
                        interfaceC0541.mo1578(169, i2, 2, c0516.m1815(i2 + 1), C3448.f10876, 0);
                        return 2;
                    case 170 /* 170 */:
                        return m1909(i, interfaceC0541);
                    case 171 /* 171 */:
                        return m1906(i, interfaceC0541);
                    case 172 /* 172 */:
                        interfaceC0541.mo1591(172, i2, C3448.f10871);
                        return 1;
                    case 173 /* 173 */:
                        interfaceC0541.mo1591(172, i2, C3448.f10872);
                        return 1;
                    case 174 /* 174 */:
                        interfaceC0541.mo1591(172, i2, C3448.f10870);
                        return 1;
                    case 175 /* 175 */:
                        interfaceC0541.mo1591(172, i2, C3448.f10869);
                        return 1;
                    case 176 /* 176 */:
                        interfaceC0541.mo1591(172, i2, C3448.f10882);
                        return 1;
                    case 177 /* 177 */:
                    case 191 /* 191 */:
                    case 194 /* 194 */:
                    case 195 /* 195 */:
                        interfaceC0541.mo1591(iM1815, i2, C3448.f10874);
                        return 1;
                    case 178 /* 178 */:
                    case 179 /* 179 */:
                    case 180 /* 180 */:
                    case 181 /* 181 */:
                    case 182 /* 182 */:
                    case 183 /* 183 */:
                    case 184 /* 184 */:
                    case 187 /* 187 */:
                    case 189 /* 189 */:
                    case 192 /* 192 */:
                    case 193 /* 193 */:
                        interfaceC0541.mo1580(iM1815, i, 3, c2815.m4793(c0516.m1817(i + 1)), 0);
                        return 3;
                    case 185 /* 185 */:
                        interfaceC0541.mo1580(185, i, 5, c2815.m4793(c0516.m1817(i + 1)), c0516.m1815(i + 3) | (c0516.m1815(i + 4) << 8));
                        return 5;
                    case 186:
                        interfaceC0541.mo1580(186, i, 5, (C0905) c2815.m4793(c0516.m1817(i + 1)), 0);
                        return 5;
                    case 188 /* 188 */:
                        return m1907(i, interfaceC0541);
                    case 196:
                        return m1911(i, interfaceC0541);
                    case 197:
                        interfaceC0541.mo1580(197, i2, 4, c2815.m4793(c0516.m1817(i2 + 1)), c0516.m1815(i2 + 3));
                        return 4;
                    case 200:
                    case 201:
                        interfaceC0541.mo1590(iM1815 == 200 ? 167 : 168, i2, 5, c0516.m1812(i2 + 1) + i2);
                        return 5;
                    default:
                        interfaceC0541.mo1585(iM1815, i2);
                        return 1;
                }
            } catch (C2704 e) {
                e = e;
                i2 = i;
                e.m2885("...at bytecode offset ".concat(AbstractC1460.m3224(i2)));
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                i2 = i;
                C2704 c2704 = new C2704(null, e);
                c2704.m2885("...at bytecode offset ".concat(AbstractC1460.m3224(i2)));
                throw c2704;
            }
        } catch (C2704 e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int m1906(int i, InterfaceC0541 interfaceC0541) {
        C0516 c0516 = (C0516) this.f2252;
        int i2 = (i + 4) & (-4);
        int iM1815 = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM1815 = (iM1815 << 8) | c0516.m1815(i3);
        }
        int iM1812 = c0516.m1812(i2) + i;
        int iM1813 = c0516.m1812(i2 + 4);
        int i4 = i2 + 8;
        C1242 c1242 = new C1242(iM1813, 1);
        for (int i5 = 0; i5 < iM1813; i5++) {
            int iM1814 = c0516.m1812(i4);
            int iM1816 = c0516.m1812(i4 + 4) + i;
            i4 += 8;
            c1242.m3925();
            if (iM1816 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C1660) c1242.f4508).m3382(iM1814);
            ((C1660) c1242.f4509).m3382(iM1816);
        }
        c1242.m2902(iM1812);
        c1242.m2901();
        c1242.mo2894();
        int i6 = i4 - i;
        interfaceC0541.mo1586(i, i6, c1242, iM1815);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int m1907(int i, InterfaceC0541 interfaceC0541) {
        C0918 c0918;
        int i2;
        C0516 c0516 = (C0516) this.f2252;
        int iM1815 = c0516.m1815(i + 1);
        switch (iM1815) {
            case 4:
                c0918 = C0918.f3391;
                break;
            case 5:
                c0918 = C0918.f3393;
                break;
            case 6:
                c0918 = C0918.f3395;
                break;
            case 7:
                c0918 = C0918.f3394;
                break;
            case 8:
                c0918 = C0918.f3392;
                break;
            case 9:
                c0918 = C0918.f3398;
                break;
            case 10:
                c0918 = C0918.f3397;
                break;
            case 11:
                c0918 = C0918.f3396;
                break;
            default:
                throw new C2704("bad newarray code ".concat(AbstractC1460.m3222(iM1815)), null);
        }
        int iMo1587 = interfaceC0541.mo1587();
        C0540 c0540 = new C0540();
        int i3 = 0;
        if (iMo1587 >= 0) {
            m1905(iMo1587, c0540);
            if ((c0540.f2248 instanceof C0903) && c0540.f2249 + iMo1587 == i) {
                i2 = c0540.f2250;
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
                if (c0516.m1815(i4) == 89) {
                    m1905(i5, c0540);
                    int i6 = c0540.f2249;
                    if (i6 != 0 && (c0540.f2248 instanceof C0903) && c0540.f2250 == i3) {
                        int i7 = i5 + i6;
                        m1905(i7, c0540);
                        int i8 = c0540.f2249;
                        if (i8 != 0) {
                            AbstractC0777 abstractC0777 = c0540.f2248;
                            if (abstractC0777 instanceof AbstractC0909) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC0777);
                                int i10 = i9 + 1;
                                int iM1816 = c0516.m1815(i9);
                                switch (iM1815) {
                                    case 4:
                                    case 8:
                                        if (iM1816 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM1816 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM1816 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM1816 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM1816 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM1816 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM1816 == 80) {
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
        if (true) {
            interfaceC0541.mo1577(i, 2, c0918, null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC0541.mo1577(i, i11, c0918, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public C0179 m1908(int i) {
        C0514 c0514 = (C0514) this.f2252;
        try {
            int unsignedByte = c0514.readUnsignedByte();
            C0179 c0179 = new C0179(unsignedByte);
            for (int i2 = 0; i2 < unsignedByte; i2++) {
                int unsignedShort = c0514.readUnsignedShort();
                C0177 c0177 = new C0177();
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    c0177.m1228(m1901(i));
                }
                c0177.f6944 = false;
                c0177.m3926();
                c0179.m3063(i2, c0177);
            }
            c0179.f6944 = false;
            if (c0514.available() == 0) {
                return c0179;
            }
            throw new C2331("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int m1909(int i, InterfaceC0541 interfaceC0541) {
        C0516 c0516 = (C0516) this.f2252;
        int i2 = (i + 4) & (-4);
        int iM1815 = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM1815 = (iM1815 << 8) | c0516.m1815(i3);
        }
        int iM1812 = c0516.m1812(i2) + i;
        int iM1813 = c0516.m1812(i2 + 4);
        int iM1814 = c0516.m1812(i2 + 8);
        int i4 = (iM1814 - iM1813) + 1;
        int i5 = i2 + 12;
        if (iM1813 > iM1814) {
            throw new C2704("low / high inversion", null);
        }
        C1242 c1242 = new C1242(i4, 1);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM1816 = c0516.m1812(i5) + i;
            i5 += 4;
            int i7 = iM1813 + i6;
            c1242.m3925();
            if (iM1816 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C1660) c1242.f4508).m3382(i7);
            ((C1660) c1242.f4509).m3382(iM1816);
        }
        c1242.m2902(iM1812);
        c1242.m2901();
        c1242.mo2894();
        int i8 = i5 - i;
        interfaceC0541.mo1586(i, i8, c1242, iM1815);
        return i8;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public AbstractC0777 m1910() {
        C2815 c2815 = (C2815) this.f2253;
        C0514 c0514 = (C0514) this.f2252;
        int unsignedByte = c0514.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C0888(m1901(4));
        }
        if (unsignedByte == 70) {
            return (C0900) m1903();
        }
        if (unsignedByte == 83) {
            int i = ((C0903) m1903()).f3364;
            short s = (short) i;
            if (s == i) {
                return new C0916(s);
            }
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "bogus short value: "));
        }
        if (unsignedByte == 99) {
            String str = ((C0917) c2815.m4793(c0514.readUnsignedShort())).f3378;
            ConcurrentHashMap concurrentHashMap = C3448.f10865;
            try {
                return new C0918(str.equals("V") ? C3448.f10874 : C3448.m4961(str));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m1915(4);
            C0914 c0914 = new C0914((C0917) c2815.m4793(c0514.readUnsignedShort()), (C0917) c2815.m4793(c0514.readUnsignedShort()));
            C0898 c0898 = new C0898(new C0918(c0914.m2428()), c0914);
            c0898.f3340 = null;
            return c0898;
        }
        if (unsignedByte == 115) {
            return m1903();
        }
        if (unsignedByte == 73) {
            return (C0903) m1903();
        }
        if (unsignedByte == 74) {
            return (C0910) m1903();
        }
        if (unsignedByte == 90) {
            return C0892.m2411(((C0903) m1903()).f3364);
        }
        if (unsignedByte == 91) {
            m1915(2);
            int unsignedShort = c0514.readUnsignedShort();
            C0889 c0889 = new C0889(unsignedShort);
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c0889.m3063(i2, m1910());
            }
            c0889.f6944 = false;
            return new C0890(c0889);
        }
        switch (unsignedByte) {
            case 66:
                int i3 = ((C0903) m1903()).f3364;
                byte b = (byte) i3;
                if (b == i3) {
                    return new C0893(b);
                }
                throw new IllegalArgumentException(AbstractC1194.m2779(i3, "bogus byte value: "));
            case 67:
                int i4 = ((C0903) m1903()).f3364;
                char c = (char) i4;
                if (c == i4) {
                    return new C0896(c);
                }
                throw new IllegalArgumentException(AbstractC1194.m2779(i4, "bogus char value: "));
            case 68:
                return (C0897) m1903();
            default:
                throw new C2331("unknown annotation tag: ".concat(AbstractC1460.m3222(unsignedByte)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public int m1911(int i, InterfaceC0541 interfaceC0541) {
        C0516 c0516 = (C0516) this.f2252;
        int iM1815 = c0516.m1815(i + 1);
        int iM1817 = c0516.m1817(i + 2);
        if (iM1815 == 132) {
            interfaceC0541.mo1578(132, i, 6, iM1817, C3448.f10871, c0516.m1814(i + 4));
            return 6;
        }
        if (iM1815 == 169) {
            interfaceC0541.mo1578(169, i, 4, iM1817, C3448.f10876, 0);
            return 4;
        }
        switch (iM1815) {
            case 21 /* 21 */:
                interfaceC0541.mo1578(21, i, 4, iM1817, C3448.f10871, 0);
                return 4;
            case 22 /* 22 */:
                interfaceC0541.mo1578(21, i, 4, iM1817, C3448.f10872, 0);
                return 4;
            case 23 /* 23 */:
                interfaceC0541.mo1578(21, i, 4, iM1817, C3448.f10870, 0);
                return 4;
            case 24 /* 24 */:
                interfaceC0541.mo1578(21, i, 4, iM1817, C3448.f10869, 0);
                return 4;
            case 25 /* 25 */:
                interfaceC0541.mo1578(21, i, 4, iM1817, C3448.f10882, 0);
                return 4;
            default:
                switch (iM1815) {
                    case 54 /* 54 */:
                        interfaceC0541.mo1578(54, i, 4, iM1817, C3448.f10871, 0);
                        return 4;
                    case 55 /* 55 */:
                        interfaceC0541.mo1578(54, i, 4, iM1817, C3448.f10872, 0);
                        return 4;
                    case 56 /* 56 */:
                        interfaceC0541.mo1578(54, i, 4, iM1817, C3448.f10870, 0);
                        return 4;
                    case 57 /* 57 */:
                        interfaceC0541.mo1578(54, i, 4, iM1817, C3448.f10869, 0);
                        return 4;
                    case 58 /* 58 */:
                        interfaceC0541.mo1578(54, i, 4, iM1817, C3448.f10882, 0);
                        return 4;
                    default:
                        interfaceC0541.mo1585(196, i);
                        return 1;
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public void m1912(InterfaceC2376 interfaceC2376, Object obj) {
        HashMap map = (HashMap) this.f2253;
        C1504 c1504 = (C1504) map.get(interfaceC2376);
        if (c1504 == null) {
            c1504 = new C1504(interfaceC2376);
            c1504.f5316 = c1504;
            C1504 c1505 = (C1504) this.f2252;
            c1504.f5316 = c1505.f5316;
            c1504.f5315 = c1505;
            c1505.f5316 = c1504;
            c1504.f5316.f5315 = c1504;
            map.put(interfaceC2376, c1504);
        } else {
            interfaceC2376.mo3636();
        }
        if (c1504.f5314 == null) {
            c1504.f5314 = new ArrayList();
        }
        c1504.f5314.add(obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public void m1913(String str) {
        C1064 c1064;
        synchronized (this) {
            try {
                c1064 = (C1064) ((HashMap) this.f2252).get(str);
                AbstractC1460.m3210(c1064, "Argument must not be null");
                int i = c1064.f3853;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c1064.f3853);
                }
                int i2 = i - 1;
                c1064.f3853 = i2;
                if (i2 == 0) {
                    C1064 c1065 = (C1064) ((HashMap) this.f2252).remove(str);
                    if (!c1065.equals(c1064)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1064 + ", but actually removed: " + c1065 + ", safeKey: " + str);
                    }
                    C0530 c0530 = (C0530) this.f2253;
                    synchronized (c0530.f2223) {
                        try {
                            if (c0530.f2223.size() < 10) {
                                c0530.f2223.offer(c1065);
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
        c1064.f3852.unlock();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public Object m1914() {
        C1504 c1504 = (C1504) this.f2252;
        C1504 c1505 = c1504.f5316;
        while (true) {
            boolean zEquals = c1505.equals(c1504);
            Object obj = c1505.f5313;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c1505.f5314;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c1505.f5314.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1504 c1506 = c1505.f5316;
            c1506.f5315 = c1505.f5315;
            c1505.f5315.f5316 = c1506;
            ((HashMap) this.f2253).remove(obj);
            ((InterfaceC2376) obj).mo3636();
            c1505 = c1505.f5316;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public void m1915(int i) {
        if (((C0514) this.f2252).available() < i) {
            throw new C2331("truncated annotation attribute", null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public void m1916(boolean z) {
        C1181 c1181 = (C1181) ((C0542) ((C0094) this.f2253).f1049).f2253;
        if (c1181.f4323 != z) {
            if (c1181.f4322 != null) {
                C1142 c1142M2753 = C1142.m2753();
                C1180 c1180 = c1181.f4322;
                
                AbstractC2665.m4661(c1180, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c1142M2753.f4237;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c1142M2753.f4238.remove(c1180);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c1181.f4323 = z;
            if (z) {
                C1181.m2770(c1181.f4321, C1142.m2753().m2754());
            }
        }
    }

    public /* synthetic */ C0542(Object obj, int i, Object obj2) {
        this.f2251 = i;
        this.f2252 = obj;
        this.f2253 = obj2;
    }

    public /* synthetic */ C0542(Object obj, Object obj2, int i, boolean z) {
        this.f2251 = i;
        this.f2253 = obj;
        this.f2252 = obj2;
    }

    public C0542(int i) {
        this.f2251 = i;
        switch (i) {
            case 14 /* 14 */:
                this.f2252 = new C1504(null);
                this.f2253 = new HashMap();
                break;
            case 19:
                this.f2252 = new AtomicReference();
                this.f2253 = new C0264(0);
                break;
            case 24 /* 24 */:
                this.f2252 = new ArrayList();
                this.f2253 = new HashMap();
                break;
            case 27:
                this.f2252 = new C1870(1000L);
                this.f2253 = AbstractC3471.m5090(10, new C2102(12));
                break;
            default:
                this.f2252 = new HashMap();
                this.f2253 = new C0530(1);
                break;
        }
    }

    public C0542(Context context, String str) {
        this.f2251 = 17;
        this.f2252 = new C2873(new C0106(27, context));
        this.f2253 = new C2873(new C0299(this, 3, str));
    }

    public C0542(C0243 c0243) {
        this.f2251 = 18;
        C2103 c2103 = new C2103(c0243);
        this.f2253 = new C0963(5);
        this.f2252 = c2103;
    }

    public C0542(C1654 c1654) {
        this.f2251 = 20;
        this.f2252 = c1654;
        this.f2253 = new C2873(new C2042(4, this));
    }

    public C0542(C2103 c2103) {
        this.f2251 = 22;
        this.f2252 = c2103;
        this.f2253 = new C2873(new C2042(6, this));
    }

    public C0542(C0542 c0542) {
        this.f2251 = 21;
        this.f2252 = c0542;
        this.f2253 = new C2873(new C2042(5, this));
    }

    public C0542(EditText editText, int i) {
        this.f2251 = i;
        switch (i) {
            case 9:
                this.f2252 = editText;
                C1181 c1181 = new C1181(editText);
                this.f2253 = c1181;
                editText.addTextChangedListener(c1181);
                if (C1146.f4253 == null) {
                    synchronized (C1146.f4252) {
                        try {
                            if (C1146.f4253 == null) {
                                C1146 c1146 = new C1146();
                                try {
                                    C1146.f4254 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1146.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C1146.f4253 = c1146;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C1146.f4253);
                return;
            default:
                this.f2252 = editText;
                this.f2253 = new C0094(editText);
                return;
        }
    }

    public C0542(C0580 c0580, int i, int i2, int i3, int i4) {
        this.f2251 = 23;
        this.f2252 = new C2308(c0580, i, i3, i4);
        this.f2253 = new ArrayList(i2);
    }

    public C0542(C0516 c0516, C2815 c2815) {
        this.f2251 = 0;
        if (c2815 != null) {
            this.f2252 = c0516;
            this.f2253 = c2815;
            return;
        }
        throw new NullPointerException("pool == null");
    }

    public C0542(C1043 c1043, int i, int i2) {
        this.f2251 = 2;
        if (c1043 != null) {
            c1043.m2613();
            this.f2253 = c1043.f3798;
            this.f2252 = new C0514(new C0515(c1043.f3796.m1825(i, i2 + i)));
            return;
        }
        throw new NullPointerException("cf == null");
    }

    public C0542(C2596 c2596) {
        this.f2251 = 26;
        this.f2253 = c2596;
        this.f2252 = new HashMap();
    }

    public C0542(ArrayList arrayList, ArrayList arrayList2) {
        this.f2251 = 13;
        int size = arrayList.size();
        this.f2252 = new int[size];
        this.f2253 = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2252)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2253)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0542(int i, int i2) {
        this.f2251 = 13;
        this.f2252 = new int[]{i, i2};
        this.f2253 = new float[]{0.0f, 1.0f};
    }

    public C0542(int i, int i2, int i3) {
        this.f2251 = 13;
        this.f2252 = new int[]{i, i2, i3};
        this.f2253 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
