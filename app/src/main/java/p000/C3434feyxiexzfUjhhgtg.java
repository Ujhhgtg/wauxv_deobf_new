package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3434feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10701Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f10702Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f10703Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f10706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object f10707Ujhhgtgfeyxiexzf;

    public C3434feyxiexzfUjhhgtg(int i) {
        this.f10701Ujhhgtgfeyxiexzf = 1;
        this.f10702Ujhhgtgfeyxiexzf = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10706Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(2);
        this.f10707Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(24);
    }

    public String toString() {
        String str;
        switch (this.f10701Ujhhgtgfeyxiexzf) {
            case 1:
                synchronized (((C3339feyxiexzfUjhhgtg) this.f10707Ujhhgtgfeyxiexzf)) {
                    try {
                        int i = this.f10704Ujhhgtgfeyxiexzf;
                        int i2 = this.f10705Ujhhgtgfeyxiexzf + i;
                        str = "LruCache[maxSize=" + this.f10702Ujhhgtgfeyxiexzf + ",hits=" + this.f10704Ujhhgtgfeyxiexzf + ",misses=" + this.f10705Ujhhgtgfeyxiexzf + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m4923Ujhhgtgfeyxiexzf(View view) {
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf = this;
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        arrayList.add(view);
        this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        }
        if (c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
            this.f10704Ujhhgtgfeyxiexzf = ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + this.f10704Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m4924Ujhhgtgfeyxiexzf() {
        C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf;
        this.f10703Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view);
        if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf && (c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f445feyxiexzfUjhhgtg.m3939Ujhhgtgfeyxiexzf(c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf())) != null && c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf.f4327Ujhhgtgfeyxiexzf == 1) {
            int i = this.f10703Ujhhgtgfeyxiexzf;
            int i2 = this.f10705Ujhhgtgfeyxiexzf;
            int[] iArr = c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf.f4328Ujhhgtgfeyxiexzf;
            this.f10703Ujhhgtgfeyxiexzf = (iArr == null ? 0 : iArr[i2]) + i;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m4925Ujhhgtgfeyxiexzf() {
        C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf;
        View view = (View) ((ArrayList) this.f10706Ujhhgtgfeyxiexzf).get(0);
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf;
        this.f10702Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view);
        if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf && (c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f445feyxiexzfUjhhgtg.m3939Ujhhgtgfeyxiexzf(c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf())) != null && c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf.f4327Ujhhgtgfeyxiexzf == -1) {
            int i = this.f10702Ujhhgtgfeyxiexzf;
            int i2 = this.f10705Ujhhgtgfeyxiexzf;
            int[] iArr = c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf.f4328Ujhhgtgfeyxiexzf;
            this.f10702Ujhhgtgfeyxiexzf = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m4926Ujhhgtgfeyxiexzf() {
        ((ArrayList) this.f10706Ujhhgtgfeyxiexzf).clear();
        this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f10704Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int m4927Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        return ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f440Ujhhgtgfeyxiexzf ? m4929Ujhhgtgfeyxiexzf(arrayList.size() - 1, -1) : m4929Ujhhgtgfeyxiexzf(0, arrayList.size());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int m4928Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        return ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f440Ujhhgtgfeyxiexzf ? m4929Ujhhgtgfeyxiexzf(0, arrayList.size()) : m4929Ujhhgtgfeyxiexzf(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int m4929Ujhhgtgfeyxiexzf(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf;
        int iMo2983Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        int iMo2979Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f10706Ujhhgtgfeyxiexzf).get(i);
            int iMo2977Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view);
            int iMo2974Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view);
            boolean z = iMo2977Ujhhgtgfeyxiexzf <= iMo2979Ujhhgtgfeyxiexzf;
            boolean z2 = iMo2974Ujhhgtgfeyxiexzf >= iMo2983Ujhhgtgfeyxiexzf;
            if (z && z2 && (iMo2977Ujhhgtgfeyxiexzf < iMo2983Ujhhgtgfeyxiexzf || iMo2974Ujhhgtgfeyxiexzf > iMo2979Ujhhgtgfeyxiexzf)) {
                return AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Object m4930Ujhhgtgfeyxiexzf(Object obj) {
        synchronized (((C3339feyxiexzfUjhhgtg) this.f10707Ujhhgtgfeyxiexzf)) {
            Object obj2 = ((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).get(obj);
            if (obj2 != null) {
                this.f10704Ujhhgtgfeyxiexzf++;
                return obj2;
            }
            this.f10705Ujhhgtgfeyxiexzf++;
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int m4931Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f10703Ujhhgtgfeyxiexzf;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f10706Ujhhgtgfeyxiexzf).size() == 0) {
            return i;
        }
        m4924Ujhhgtgfeyxiexzf();
        return this.f10703Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View m4932Ujhhgtgfeyxiexzf(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f440Ujhhgtgfeyxiexzf && AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view2) >= i) || ((!staggeredGridLayoutManager.f440Ujhhgtgfeyxiexzf && AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f440Ujhhgtgfeyxiexzf && AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view3) <= i) || ((!staggeredGridLayoutManager.f440Ujhhgtgfeyxiexzf && AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int m4933Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f10702Ujhhgtgfeyxiexzf;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f10706Ujhhgtgfeyxiexzf).size() == 0) {
            return i;
        }
        m4925Ujhhgtgfeyxiexzf();
        return this.f10702Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4934Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf = null;
        if (c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
            this.f10704Ujhhgtgfeyxiexzf -= ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
        }
        if (size == 1) {
            this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        }
        this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void m4935Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        View view = (View) arrayList.remove(0);
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf = null;
        if (arrayList.size() == 0) {
            this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        }
        if (c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
            this.f10704Ujhhgtgfeyxiexzf -= ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
        }
        this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public void m4936Ujhhgtgfeyxiexzf(View view) {
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf = this;
        ArrayList arrayList = (ArrayList) this.f10706Ujhhgtgfeyxiexzf;
        arrayList.add(0, view);
        this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        }
        if (c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
            this.f10704Ujhhgtgfeyxiexzf = ((StaggeredGridLayoutManager) this.f10707Ujhhgtgfeyxiexzf).f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + this.f10704Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Object m4937Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        Object objPut;
        synchronized (((C3339feyxiexzfUjhhgtg) this.f10707Ujhhgtgfeyxiexzf)) {
            this.f10703Ujhhgtgfeyxiexzf++;
            objPut = ((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).put(obj, obj2);
            if (objPut != null) {
                this.f10703Ujhhgtgfeyxiexzf--;
            }
        }
        int i = this.f10702Ujhhgtgfeyxiexzf;
        while (true) {
            synchronized (((C3339feyxiexzfUjhhgtg) this.f10707Ujhhgtgfeyxiexzf)) {
                try {
                    if (this.f10703Ujhhgtgfeyxiexzf < 0 || (((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).isEmpty() && this.f10703Ujhhgtgfeyxiexzf != 0)) {
                        break;
                    }
                    if (this.f10703Ujhhgtgfeyxiexzf > i && !((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).entrySet();
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
                        ((LinkedHashMap) ((C0709Ujhhgtgfeyxiexzf) this.f10706Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).remove(key);
                        this.f10703Ujhhgtgfeyxiexzf--;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public C3434feyxiexzfUjhhgtg(C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf, int i, String str, String str2, Object obj) {
        this.f10701Ujhhgtgfeyxiexzf = 0;
        this.f10706Ujhhgtgfeyxiexzf = null;
        this.f10707Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf;
        this.f10702Ujhhgtgfeyxiexzf = i;
        this.f10703Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3359Ujhhgtgfeyxiexzf(str);
        this.f10704Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3359Ujhhgtgfeyxiexzf(str2);
        if (obj != null) {
            this.f10705Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3355Ujhhgtgfeyxiexzf(obj).f6773Ujhhgtgfeyxiexzf;
        }
    }

    public C3434feyxiexzfUjhhgtg(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f10701Ujhhgtgfeyxiexzf = 2;
        this.f10707Ujhhgtgfeyxiexzf = staggeredGridLayoutManager;
        this.f10706Ujhhgtgfeyxiexzf = new ArrayList();
        this.f10702Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f10703Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        this.f10704Ujhhgtgfeyxiexzf = 0;
        this.f10705Ujhhgtgfeyxiexzf = i;
    }
}
