package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1317 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f4756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f4758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f4760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f4761;

    public C1317(int i) {
        this.f4755 = 1;
        this.f4756 = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4760 = new C1681(2);
        this.f4761 = new C1224(24);
    }

    public String toString() {
        String str;
        switch (this.f4755) {
            case 1:
                synchronized (((C1224) this.f4761)) {
                    try {
                        int i = this.f4758;
                        int i2 = this.f4759 + i;
                        str = "LruCache[maxSize=" + this.f4756 + ",hits=" + this.f4758 + ",misses=" + this.f4759 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m3129(View view) {
        C2863 c2863 = (C2863) view.getLayoutParams();
        c2863.f9104 = this;
        ArrayList arrayList = (ArrayList) this.f4760;
        arrayList.add(view);
        this.f4757 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f4756 = Integer.MIN_VALUE;
        }
        if (c2863.f8107.m4540() || c2863.f8107.m4543()) {
            this.f4758 = ((StaggeredGridLayoutManager) this.f4761).f434.mo2882(view) + this.f4758;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3130() {
        C2864 c2864M1983;
        ArrayList arrayList = (ArrayList) this.f4760;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C2863 c2863 = (C2863) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4761;
        this.f4757 = staggeredGridLayoutManager.f434.mo2881(view);
        if (c2863.f9105 && (c2864M1983 = staggeredGridLayoutManager.f444.m1983(c2863.f8107.m4534())) != null && c2864M1983.f9107 == 1) {
            int i = this.f4757;
            int i2 = this.f4759;
            int[] iArr = c2864M1983.f9108;
            this.f4757 = (iArr == null ? 0 : iArr[i2]) + i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3131() {
        C2864 c2864M1983;
        View view = (View) ((ArrayList) this.f4760).get(0);
        C2863 c2863 = (C2863) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4761;
        this.f4756 = staggeredGridLayoutManager.f434.mo2884(view);
        if (c2863.f9105 && (c2864M1983 = staggeredGridLayoutManager.f444.m1983(c2863.f8107.m4534())) != null && c2864M1983.f9107 == -1) {
            int i = this.f4756;
            int i2 = this.f4759;
            int[] iArr = c2864M1983.f9108;
            this.f4756 = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m3132() {
        ((ArrayList) this.f4760).clear();
        this.f4756 = Integer.MIN_VALUE;
        this.f4757 = Integer.MIN_VALUE;
        this.f4758 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int m3133() {
        ArrayList arrayList = (ArrayList) this.f4760;
        return ((StaggeredGridLayoutManager) this.f4761).f439 ? m3135(arrayList.size() - 1, -1) : m3135(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int m3134() {
        ArrayList arrayList = (ArrayList) this.f4760;
        return ((StaggeredGridLayoutManager) this.f4761).f439 ? m3135(0, arrayList.size()) : m3135(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int m3135(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4761;
        int iMo2890 = staggeredGridLayoutManager.f434.mo2890();
        int iMo2886 = staggeredGridLayoutManager.f434.mo2886();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f4760).get(i);
            int iMo2884 = staggeredGridLayoutManager.f434.mo2884(view);
            int iMo2881 = staggeredGridLayoutManager.f434.mo2881(view);
            boolean z = iMo2884 <= iMo2886;
            boolean z2 = iMo2881 >= iMo2890;
            if (z && z2 && (iMo2884 < iMo2890 || iMo2881 > iMo2886)) {
                return AbstractC2546.m4482(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object m3136(Object obj) {
        synchronized (((C1224) this.f4761)) {
            Object obj2 = ((LinkedHashMap) ((C1681) this.f4760).f5660).get(obj);
            if (obj2 != null) {
                this.f4758++;
                return obj2;
            }
            this.f4759++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int m3137(int i) {
        int i2 = this.f4757;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f4760).size() == 0) {
            return i;
        }
        m3130();
        return this.f4757;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public View m3138(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4761;
        ArrayList arrayList = (ArrayList) this.f4760;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f439 && AbstractC2546.m4482(view2) >= i) || ((!staggeredGridLayoutManager.f439 && AbstractC2546.m4482(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f439 && AbstractC2546.m4482(view3) <= i) || ((!staggeredGridLayoutManager.f439 && AbstractC2546.m4482(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int m3139(int i) {
        int i2 = this.f4756;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f4760).size() == 0) {
            return i;
        }
        m3131();
        return this.f4756;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m3140() {
        ArrayList arrayList = (ArrayList) this.f4760;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C2863 c2863 = (C2863) view.getLayoutParams();
        c2863.f9104 = null;
        if (c2863.f8107.m4540() || c2863.f8107.m4543()) {
            this.f4758 -= ((StaggeredGridLayoutManager) this.f4761).f434.mo2882(view);
        }
        if (size == 1) {
            this.f4756 = Integer.MIN_VALUE;
        }
        this.f4757 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m3141() {
        ArrayList arrayList = (ArrayList) this.f4760;
        View view = (View) arrayList.remove(0);
        C2863 c2863 = (C2863) view.getLayoutParams();
        c2863.f9104 = null;
        if (arrayList.size() == 0) {
            this.f4757 = Integer.MIN_VALUE;
        }
        if (c2863.f8107.m4540() || c2863.f8107.m4543()) {
            this.f4758 -= ((StaggeredGridLayoutManager) this.f4761).f434.mo2882(view);
        }
        this.f4756 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m3142(View view) {
        C2863 c2863 = (C2863) view.getLayoutParams();
        c2863.f9104 = this;
        ArrayList arrayList = (ArrayList) this.f4760;
        arrayList.add(0, view);
        this.f4756 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f4757 = Integer.MIN_VALUE;
        }
        if (c2863.f8107.m4540() || c2863.f8107.m4543()) {
            this.f4758 = ((StaggeredGridLayoutManager) this.f4761).f434.mo2882(view) + this.f4758;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Object m3143(Object obj, Object obj2) {
        Object objPut;
        synchronized (((C1224) this.f4761)) {
            this.f4757++;
            objPut = ((LinkedHashMap) ((C1681) this.f4760).f5660).put(obj, obj2);
            if (objPut != null) {
                this.f4757--;
            }
        }
        int i = this.f4756;
        while (true) {
            synchronized (((C1224) this.f4761)) {
                try {
                    if (this.f4757 < 0 || (((LinkedHashMap) ((C1681) this.f4760).f5660).isEmpty() && this.f4757 != 0)) {
                        break;
                    }
                    if (this.f4757 > i && !((LinkedHashMap) ((C1681) this.f4760).f5660).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((C1681) this.f4760).f5660).entrySet();
                        Object next = null;
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        entry.getValue();
                        ((LinkedHashMap) ((C1681) this.f4760).f5660).remove(key);
                        this.f4757--;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public C1317(C2930 c2930, int i, String str, String str2, Object obj) {
        this.f4755 = 0;
        this.f4760 = null;
        this.f4761 = c2930;
        this.f4756 = i;
        this.f4757 = c2930.m4932(str);
        this.f4758 = c2930.m4932(str2);
        if (obj != null) {
            this.f4759 = c2930.m4928(obj).f9361;
        }
    }

    public C1317(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f4755 = 2;
        this.f4761 = staggeredGridLayoutManager;
        this.f4760 = new ArrayList();
        this.f4756 = Integer.MIN_VALUE;
        this.f4757 = Integer.MIN_VALUE;
        this.f4758 = 0;
        this.f4759 = i;
    }
}
