package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.bc;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2790feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8832Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8833Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f8834Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f8835Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f8836Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f8837Ujhhgtgfeyxiexzf;

    public C2790feyxiexzfUjhhgtg(C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg) {
        this.f8832Ujhhgtgfeyxiexzf = 1;
        this.f8833Ujhhgtgfeyxiexzf = 0;
        this.f8834Ujhhgtgfeyxiexzf = c0787feyxiexzfUjhhgtg;
        this.f8835Ujhhgtgfeyxiexzf = new C2816Ujhhgtgfeyxiexzf();
        this.f8836Ujhhgtgfeyxiexzf = new ArrayList();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m4072Ujhhgtgfeyxiexzf(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static boolean m4073Ujhhgtgfeyxiexzf(AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) {
        return abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf == null || abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11027Ujhhgtgfeyxiexzf;
    }

    public String toString() {
        switch (this.f8832Ujhhgtgfeyxiexzf) {
            case 1:
                return ((C2816Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).toString() + ", hidden list:" + ((ArrayList) this.f8836Ujhhgtgfeyxiexzf).size();
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m4074Ujhhgtgfeyxiexzf(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4085Ujhhgtgfeyxiexzf(i);
        ((C2816Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4148Ujhhgtgfeyxiexzf(childCount, z);
        if (z) {
            m4088Ujhhgtgfeyxiexzf(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = recyclerView.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg != null && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
            abstractC0795feyxiexzfUjhhgtg.mo2143Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
        }
        ArrayList arrayList = recyclerView.f385feyxiexzfUjhhgtg;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0708Ujhhgtgfeyxiexzf) recyclerView.f385feyxiexzfUjhhgtg.get(size)).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m4075Ujhhgtgfeyxiexzf(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4085Ujhhgtgfeyxiexzf(i);
        ((C2816Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4148Ujhhgtgfeyxiexzf(childCount, z);
        if (z) {
            m4088Ujhhgtgfeyxiexzf(view);
        }
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
            if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb));
            }
            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                Log.d("RecyclerView", "reAttach " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            }
            abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -257;
        } else if (RecyclerView.f348feyxiexzfUjhhgtg) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m4076Ujhhgtgfeyxiexzf(int i) {
        int iM4085Ujhhgtgfeyxiexzf = m4085Ujhhgtgfeyxiexzf(i);
        ((C2816Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4149Ujhhgtgfeyxiexzf(iM4085Ujhhgtgfeyxiexzf);
        RecyclerView recyclerView = ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf;
        View childAt = recyclerView.getChildAt(iM4085Ujhhgtgfeyxiexzf);
        if (childAt != null) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(childAt);
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
                if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb));
                }
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(bc.e);
            }
        } else if (RecyclerView.f348feyxiexzfUjhhgtg) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM4085Ujhhgtgfeyxiexzf);
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM4085Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m4077Ujhhgtgfeyxiexzf(boolean z) {
        for (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf : ((C3325Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4815Ujhhgtgfeyxiexzf()) {
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null && z) {
                abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11026Ujhhgtgfeyxiexzf.m4077Ujhhgtgfeyxiexzf(true);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean m4078Ujhhgtgfeyxiexzf() {
        if (this.f8833Ujhhgtgfeyxiexzf < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf : ((C3325Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4815Ujhhgtgfeyxiexzf()) {
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null && m4073Ujhhgtgfeyxiexzf(abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) && abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11026Ujhhgtgfeyxiexzf.m4078Ujhhgtgfeyxiexzf()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf);
                z = true;
            }
        }
        if (((ArrayList) this.f8836Ujhhgtgfeyxiexzf) != null) {
            for (int i = 0; i < ((ArrayList) this.f8836Ujhhgtgfeyxiexzf).size(); i++) {
                AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2 = (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) ((ArrayList) this.f8836Ujhhgtgfeyxiexzf).get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2)) {
                    abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2.getClass();
                }
            }
        }
        this.f8836Ujhhgtgfeyxiexzf = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void m4079Ujhhgtgfeyxiexzf(boolean z) {
        for (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf : ((C3325Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4815Ujhhgtgfeyxiexzf()) {
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null && z) {
                abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11026Ujhhgtgfeyxiexzf.m4079Ujhhgtgfeyxiexzf(true);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean m4080Ujhhgtgfeyxiexzf() {
        if (this.f8833Ujhhgtgfeyxiexzf < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf : ((C3325Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4815Ujhhgtgfeyxiexzf()) {
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null && abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11026Ujhhgtgfeyxiexzf.m4080Ujhhgtgfeyxiexzf()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean m4081Ujhhgtgfeyxiexzf() {
        boolean z = false;
        if (this.f8833Ujhhgtgfeyxiexzf < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf : ((C3325Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf).m4815Ujhhgtgfeyxiexzf()) {
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null && m4073Ujhhgtgfeyxiexzf(abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) && abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11026Ujhhgtgfeyxiexzf.m4081Ujhhgtgfeyxiexzf()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m4082Ujhhgtgfeyxiexzf() {
        if (((C2792Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf) == null) {
            C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = (C2363Ujhhgtgfeyxiexzf) this.f8834Ujhhgtgfeyxiexzf;
            c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
            this.f8835Ujhhgtgfeyxiexzf = (C2792Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7703Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View m4083Ujhhgtgfeyxiexzf(int i) {
        return ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.getChildAt(m4085Ujhhgtgfeyxiexzf(i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int m4084Ujhhgtgfeyxiexzf() {
        return ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.getChildCount() - ((ArrayList) this.f8836Ujhhgtgfeyxiexzf).size();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int m4085Ujhhgtgfeyxiexzf(int i) {
        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = (C2816Ujhhgtgfeyxiexzf) this.f8835Ujhhgtgfeyxiexzf;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM4145Ujhhgtgfeyxiexzf = i - (i2 - c2816Ujhhgtgfeyxiexzf.m4145Ujhhgtgfeyxiexzf(i2));
            if (iM4145Ujhhgtgfeyxiexzf == 0) {
                while (c2816Ujhhgtgfeyxiexzf.m4147Ujhhgtgfeyxiexzf(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4145Ujhhgtgfeyxiexzf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public View m4086Ujhhgtgfeyxiexzf(int i) {
        return ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.getChildAt(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int m4087Ujhhgtgfeyxiexzf() {
        return ((C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.getChildCount();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m4088Ujhhgtgfeyxiexzf(View view) {
        ((ArrayList) this.f8836Ujhhgtgfeyxiexzf).add(view);
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
            View view2 = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
            int i = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf;
            if (i != -1) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf = i;
            } else {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf = view2.getImportantForAccessibility();
            }
            if (!recyclerView.m235feyxiexzfUjhhgtg()) {
                view2.setImportantForAccessibility(4);
            } else {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf = 4;
                recyclerView.f425Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m4089Ujhhgtgfeyxiexzf(View view) {
        if (((ArrayList) this.f8836Ujhhgtgfeyxiexzf).remove(view)) {
            C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) this.f8834Ujhhgtgfeyxiexzf;
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
                RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
                int i = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf;
                if (recyclerView.m235feyxiexzfUjhhgtg()) {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf = i;
                    recyclerView.f425Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                } else {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setImportantForAccessibility(i);
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf = 0;
            }
        }
    }

    public C2790feyxiexzfUjhhgtg(C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf) {
        this.f8832Ujhhgtgfeyxiexzf = 0;
        this.f8834Ujhhgtgfeyxiexzf = c2363Ujhhgtgfeyxiexzf;
        this.f8835Ujhhgtgfeyxiexzf = null;
        this.f8836Ujhhgtgfeyxiexzf = null;
        this.f8833Ujhhgtgfeyxiexzf = 0;
        this.f8837Ujhhgtgfeyxiexzf = null;
    }

    public C2790feyxiexzfUjhhgtg() {
        this.f8832Ujhhgtgfeyxiexzf = 2;
        this.f8834Ujhhgtgfeyxiexzf = new ArrayList();
        this.f8835Ujhhgtgfeyxiexzf = new C3325Ujhhgtgfeyxiexzf(1);
        new ArrayList();
        final int i = 0;
        new C3178feyxiexzfUjhhgtg(false);
        this.f8837Ujhhgtgfeyxiexzf = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new ArrayList();
        new C3339feyxiexzfUjhhgtg(this);
        new CopyOnWriteArrayList();
        new InterfaceC3661feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱ能不能

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
            public final /* synthetic */ C2790feyxiexzfUjhhgtg f11022Ujhhgtgfeyxiexzf;

            {
                this.f11022Ujhhgtgfeyxiexzf = this;
            }

            @Override // p000.InterfaceC3661feyxiexzfUjhhgtg
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f11022Ujhhgtgfeyxiexzf.m4077Ujhhgtgfeyxiexzf(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f11022Ujhhgtgfeyxiexzf.m4079Ujhhgtgfeyxiexzf(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        new InterfaceC3661feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱ能不能

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
            public final /* synthetic */ C2790feyxiexzfUjhhgtg f11022Ujhhgtgfeyxiexzf;

            {
                this.f11022Ujhhgtgfeyxiexzf = this;
            }

            @Override // p000.InterfaceC3661feyxiexzfUjhhgtg
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f11022Ujhhgtgfeyxiexzf.m4077Ujhhgtgfeyxiexzf(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f11022Ujhhgtgfeyxiexzf.m4079Ujhhgtgfeyxiexzf(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 0;
        new InterfaceC3661feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛳ
            @Override // p000.InterfaceC3661feyxiexzfUjhhgtg
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                }
            }
        };
        final int i4 = 1;
        new InterfaceC3661feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛳ
            @Override // p000.InterfaceC3661feyxiexzfUjhhgtg
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                }
            }
        };
        this.f8833Ujhhgtgfeyxiexzf = -1;
        new ArrayDeque();
        new RunnableC3012feyxiexzfUjhhgtg(9, this);
    }
}
