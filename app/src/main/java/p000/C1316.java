package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲈᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1316 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f4757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f4759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f4761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f4762;

    public C1316(int i) {
        this.f4756 = 1;
        this.f4757 = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4761 = new C1744(1);
        this.f4762 = new C1227(24);
    }

    public String toString() {
        String str;
        switch (this.f4756) {
            case 1:
                synchronized (((C1227) this.f4762)) {
                    try {
                        int i = this.f4759;
                        int i2 = this.f4760 + i;
                        str = "LruCache[maxSize=" + this.f4757 + ",hits=" + this.f4759 + ",misses=" + this.f4760 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
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
    public void m3026(View view) {
        C2804 c2804 = (C2804) view.getLayoutParams();
        c2804.f8943 = this;
        ArrayList arrayList = (ArrayList) this.f4761;
        arrayList.add(view);
        this.f4758 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f4757 = Integer.MIN_VALUE;
        }
        if (c2804.f7956.m4518() || c2804.f7956.m4521()) {
            this.f4759 = ((StaggeredGridLayoutManager) this.f4762).f434.mo2738(view) + this.f4759;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3027() {
        C2805 c2805M1889;
        ArrayList arrayList = (ArrayList) this.f4761;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C2804 c2804 = (C2804) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4762;
        this.f4758 = staggeredGridLayoutManager.f434.mo2737(view);
        if (c2804.f8944 && (c2805M1889 = staggeredGridLayoutManager.f444.m1889(c2804.f7956.m4512())) != null && c2805M1889.f8946 == 1) {
            int i = this.f4758;
            int i2 = this.f4760;
            int[] iArr = c2805M1889.f8947;
            this.f4758 = (iArr == null ? 0 : iArr[i2]) + i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3028() {
        C2805 c2805M1889;
        View view = (View) ((ArrayList) this.f4761).get(0);
        C2804 c2804 = (C2804) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4762;
        this.f4757 = staggeredGridLayoutManager.f434.mo2740(view);
        if (c2804.f8944 && (c2805M1889 = staggeredGridLayoutManager.f444.m1889(c2804.f7956.m4512())) != null && c2805M1889.f8946 == -1) {
            int i = this.f4757;
            int i2 = this.f4760;
            int[] iArr = c2805M1889.f8947;
            this.f4757 = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m3029() {
        ((ArrayList) this.f4761).clear();
        this.f4757 = Integer.MIN_VALUE;
        this.f4758 = Integer.MIN_VALUE;
        this.f4759 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int m3030() {
        ArrayList arrayList = (ArrayList) this.f4761;
        return ((StaggeredGridLayoutManager) this.f4762).f439 ? m3032(arrayList.size() - 1, -1) : m3032(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int m3031() {
        ArrayList arrayList = (ArrayList) this.f4761;
        return ((StaggeredGridLayoutManager) this.f4762).f439 ? m3032(0, arrayList.size()) : m3032(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int m3032(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4762;
        int iMo2746 = staggeredGridLayoutManager.f434.mo2746();
        int iMo2742 = staggeredGridLayoutManager.f434.mo2742();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f4761).get(i);
            int iMo2740 = staggeredGridLayoutManager.f434.mo2740(view);
            int iMo2737 = staggeredGridLayoutManager.f434.mo2737(view);
            boolean z = iMo2740 <= iMo2742;
            boolean z2 = iMo2737 >= iMo2746;
            if (z && z2 && (iMo2740 < iMo2746 || iMo2737 > iMo2742)) {
                return AbstractC2491.m4460(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object m3033(Object obj) {
        synchronized (((C1227) this.f4762)) {
            Object obj2 = ((LinkedHashMap) ((C1744) this.f4761).f5843).get(obj);
            if (obj2 != null) {
                this.f4759++;
                return obj2;
            }
            this.f4760++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int m3034(int i) {
        int i2 = this.f4758;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f4761).size() == 0) {
            return i;
        }
        m3027();
        return this.f4758;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public View m3035(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4762;
        ArrayList arrayList = (ArrayList) this.f4761;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f439 && AbstractC2491.m4460(view2) >= i) || ((!staggeredGridLayoutManager.f439 && AbstractC2491.m4460(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f439 && AbstractC2491.m4460(view3) <= i) || ((!staggeredGridLayoutManager.f439 && AbstractC2491.m4460(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int m3036(int i) {
        int i2 = this.f4757;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f4761).size() == 0) {
            return i;
        }
        m3028();
        return this.f4757;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m3037() {
        ArrayList arrayList = (ArrayList) this.f4761;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C2804 c2804 = (C2804) view.getLayoutParams();
        c2804.f8943 = null;
        if (c2804.f7956.m4518() || c2804.f7956.m4521()) {
            this.f4759 -= ((StaggeredGridLayoutManager) this.f4762).f434.mo2738(view);
        }
        if (size == 1) {
            this.f4757 = Integer.MIN_VALUE;
        }
        this.f4758 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m3038() {
        ArrayList arrayList = (ArrayList) this.f4761;
        View view = (View) arrayList.remove(0);
        C2804 c2804 = (C2804) view.getLayoutParams();
        c2804.f8943 = null;
        if (arrayList.size() == 0) {
            this.f4758 = Integer.MIN_VALUE;
        }
        if (c2804.f7956.m4518() || c2804.f7956.m4521()) {
            this.f4759 -= ((StaggeredGridLayoutManager) this.f4762).f434.mo2738(view);
        }
        this.f4757 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m3039(View view) {
        C2804 c2804 = (C2804) view.getLayoutParams();
        c2804.f8943 = this;
        ArrayList arrayList = (ArrayList) this.f4761;
        arrayList.add(0, view);
        this.f4757 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f4758 = Integer.MIN_VALUE;
        }
        if (c2804.f7956.m4518() || c2804.f7956.m4521()) {
            this.f4759 = ((StaggeredGridLayoutManager) this.f4762).f434.mo2738(view) + this.f4759;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Object m3040(Object obj, Object obj2) {
        Object objPut;
        synchronized (((C1227) this.f4762)) {
            this.f4758++;
            objPut = ((LinkedHashMap) ((C1744) this.f4761).f5843).put(obj, obj2);
            if (objPut != null) {
                this.f4758--;
            }
        }
        int i = this.f4757;
        while (true) {
            synchronized (((C1227) this.f4762)) {
                try {
                    if (this.f4758 < 0 || (((LinkedHashMap) ((C1744) this.f4761).f5843).isEmpty() && this.f4758 != 0)) {
                        break;
                    }
                    if (this.f4758 > i && !((LinkedHashMap) ((C1744) this.f4761).f5843).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((C1744) this.f4761).f5843).entrySet();
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
                        ((LinkedHashMap) ((C1744) this.f4761).f5843).remove(key);
                        this.f4758--;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public C1316(C2870 c2870, int i, String str, String str2, Object obj) {
        this.f4756 = 0;
        this.f4761 = null;
        this.f4762 = c2870;
        this.f4757 = i;
        this.f4758 = c2870.m4871(str);
        this.f4759 = c2870.m4871(str2);
        if (obj != null) {
            this.f4760 = c2870.m4867(obj).f9191;
        }
    }

    public C1316(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f4756 = 2;
        this.f4762 = staggeredGridLayoutManager;
        this.f4761 = new ArrayList();
        this.f4757 = Integer.MIN_VALUE;
        this.f4758 = Integer.MIN_VALUE;
        this.f4759 = 0;
        this.f4760 = i;
    }
}
