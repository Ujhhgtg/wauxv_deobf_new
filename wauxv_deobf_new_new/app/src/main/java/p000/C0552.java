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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0552 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2303;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2305;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f2306;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2307;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f2308;

    public C0552(C2536 c2536) {
        this.f2303 = 1;
        this.f2304 = 0;
        this.f2305 = c2536;
        this.f2306 = new C0680();
        this.f2307 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean m2079(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static boolean m2080(AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414) {
        return abstractComponentCallbacksC1414 == null || abstractComponentCallbacksC1414.f5098;
    }

    public String toString() {
        switch (this.f2303) {
            case 1:
                return ((C0680) this.f2306).toString() + ", hidden list:" + ((ArrayList) this.f2307).size();
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m2081(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C2536) this.f2305).f8076;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2092(i);
        ((C0680) this.f2306).m2169(childCount, z);
        if (z) {
            m2095(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        AbstractC2537 abstractC2537 = recyclerView.f368;
        if (abstractC2537 != null && abstractC2563M204 != null) {
            abstractC2537.mo2473(abstractC2563M204);
        }
        ArrayList arrayList = recyclerView.f384;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1700) recyclerView.f384.get(size)).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m2082(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C2536) this.f2305).f8076;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2092(i);
        ((C0680) this.f2306).m2169(childCount, z);
        if (z) {
            m2095(view);
        }
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        if (abstractC2563M204 != null) {
            if (!abstractC2563M204.m4542() && !abstractC2563M204.m4547()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC2563M204);
                throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb));
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "reAttach " + abstractC2563M204);
            }
            abstractC2563M204.f8166 &= -257;
        } else if (RecyclerView.f347) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m2083(int i) {
        int iM2092 = m2092(i);
        ((C0680) this.f2306).m2170(iM2092);
        RecyclerView recyclerView = ((C2536) this.f2305).f8076;
        View childAt = recyclerView.getChildAt(iM2092);
        if (childAt != null) {
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(childAt);
            if (abstractC2563M204 != null) {
                if (abstractC2563M204.m4542() && !abstractC2563M204.m4547()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC2563M204);
                    throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb));
                }
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC2563M204);
                }
                abstractC2563M204.m4531(bc.e);
            }
        } else if (RecyclerView.f347) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM2092);
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM2092);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m2084(boolean z) {
        for (AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 : ((C1210) this.f2306).m2933()) {
            if (abstractComponentCallbacksC1414 != null && z) {
                abstractComponentCallbacksC1414.f5097.m2084(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean m2085() {
        if (this.f2304 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 : ((C1210) this.f2306).m2933()) {
            if (abstractComponentCallbacksC1414 != null && m2080(abstractComponentCallbacksC1414) && abstractComponentCallbacksC1414.f5097.m2085()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC1414);
                z = true;
            }
        }
        if (((ArrayList) this.f2307) != null) {
            for (int i = 0; i < ((ArrayList) this.f2307).size(); i++) {
                AbstractComponentCallbacksC1414 abstractComponentCallbacksC1415 = (AbstractComponentCallbacksC1414) ((ArrayList) this.f2307).get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1415)) {
                    abstractComponentCallbacksC1415.getClass();
                }
            }
        }
        this.f2307 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m2086(boolean z) {
        for (AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 : ((C1210) this.f2306).m2933()) {
            if (abstractComponentCallbacksC1414 != null && z) {
                abstractComponentCallbacksC1414.f5097.m2086(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean m2087() {
        if (this.f2304 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 : ((C1210) this.f2306).m2933()) {
            if (abstractComponentCallbacksC1414 != null && abstractComponentCallbacksC1414.f5097.m2087()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean m2088() {
        boolean z = false;
        if (this.f2304 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 : ((C1210) this.f2306).m2933()) {
            if (abstractComponentCallbacksC1414 != null && m2080(abstractComponentCallbacksC1414) && abstractComponentCallbacksC1414.f5097.m2088()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m2089() {
        if (((C0554) this.f2306) == null) {
            C0225 c0225 = (C0225) this.f2305;
            c0225.m1393();
            this.f2306 = (C0554) c0225.f1406;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public View m2090(int i) {
        return ((C2536) this.f2305).f8076.getChildAt(m2092(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int m2091() {
        return ((C2536) this.f2305).f8076.getChildCount() - ((ArrayList) this.f2307).size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int m2092(int i) {
        C0680 c0680 = (C0680) this.f2306;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2536) this.f2305).f8076.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM2166 = i - (i2 - c0680.m2166(i2));
            if (iM2166 == 0) {
                while (c0680.m2168(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM2166;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public View m2093(int i) {
        return ((C2536) this.f2305).f8076.getChildAt(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int m2094() {
        return ((C2536) this.f2305).f8076.getChildCount();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m2095(View view) {
        ((ArrayList) this.f2307).add(view);
        C2536 c2536 = (C2536) this.f2305;
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        if (abstractC2563M204 != null) {
            View view2 = abstractC2563M204.f8157;
            RecyclerView recyclerView = c2536.f8076;
            int i = abstractC2563M204.f8173;
            if (i != -1) {
                abstractC2563M204.f8172 = i;
            } else {
                abstractC2563M204.f8172 = view2.getImportantForAccessibility();
            }
            if (!recyclerView.m235()) {
                view2.setImportantForAccessibility(4);
            } else {
                abstractC2563M204.f8173 = 4;
                recyclerView.f424.add(abstractC2563M204);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m2096(View view) {
        if (((ArrayList) this.f2307).remove(view)) {
            C2536 c2536 = (C2536) this.f2305;
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
            if (abstractC2563M204 != null) {
                RecyclerView recyclerView = c2536.f8076;
                int i = abstractC2563M204.f8172;
                if (recyclerView.m235()) {
                    abstractC2563M204.f8173 = i;
                    recyclerView.f424.add(abstractC2563M204);
                } else {
                    abstractC2563M204.f8157.setImportantForAccessibility(i);
                }
                abstractC2563M204.f8172 = 0;
            }
        }
    }

    public C0552(C0225 c0225) {
        this.f2303 = 0;
        this.f2305 = c0225;
        this.f2306 = null;
        this.f2307 = null;
        this.f2304 = 0;
        this.f2308 = null;
    }

    public C0552() {
        this.f2303 = 2;
        this.f2305 = new ArrayList();
        this.f2306 = new C1210(1);
        new ArrayList();
        final int i = 0;
        new C1038(false);
        this.f2308 = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new ArrayList();
        new C1224(this);
        new CopyOnWriteArrayList();
        new InterfaceC0798(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᲀᛸ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0552 f5106;

            {
                this.f5106 = this;
            }

            @Override // p000.InterfaceC0798
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f5106.m2084(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f5106.m2086(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        new InterfaceC0798(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᲀᛸ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0552 f5106;

            {
                this.f5106 = this;
            }

            @Override // p000.InterfaceC0798
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f5106.m2084(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f5106.m2086(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 0;
        new InterfaceC0798(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲇᛸᲀᲁ
            @Override // p000.InterfaceC0798
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
        new InterfaceC0798(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲇᛸᲀᲁ
            @Override // p000.InterfaceC0798
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
        this.f2304 = -1;
        new ArrayDeque();
        new RunnableC0149(this, 9);
    }
}
