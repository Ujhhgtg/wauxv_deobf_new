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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0575 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f2344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f2346;

    public C0575(C2481 c2481) {
        this.f2341 = 1;
        this.f2342 = 0;
        this.f2343 = c2481;
        this.f2344 = new C0689();
        this.f2345 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean m1982(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static boolean m1983(AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406) {
        return abstractComponentCallbacksC1406 == null || abstractComponentCallbacksC1406.f5069;
    }

    public String toString() {
        switch (this.f2341) {
            case 1:
                return ((C0689) this.f2344).toString() + ", hidden list:" + ((ArrayList) this.f2345).size();
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
    public void m1984(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C2481) this.f2343).f7925;
        int childCount = i < 0 ? recyclerView.getChildCount() : m1995(i);
        ((C0689) this.f2344).m2074(childCount, z);
        if (z) {
            m1998(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        AbstractC2482 abstractC2482 = recyclerView.f368;
        if (abstractC2482 != null && abstractC2508M204 != null) {
            abstractC2482.mo2357(abstractC2508M204);
        }
        ArrayList arrayList = recyclerView.f384;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1985(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C2481) this.f2343).f7925;
        int childCount = i < 0 ? recyclerView.getChildCount() : m1995(i);
        ((C0689) this.f2344).m2074(childCount, z);
        if (z) {
            m1998(view);
        }
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        if (abstractC2508M204 != null) {
            if (!abstractC2508M204.m4520() && !abstractC2508M204.m4525()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC2508M204);
                throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb));
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "reAttach " + abstractC2508M204);
            }
            abstractC2508M204.f8015 &= -257;
        } else if (RecyclerView.f347) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1986(int i) {
        int iM1995 = m1995(i);
        ((C0689) this.f2344).m2075(iM1995);
        RecyclerView recyclerView = ((C2481) this.f2343).f7925;
        View childAt = recyclerView.getChildAt(iM1995);
        if (childAt != null) {
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(childAt);
            if (abstractC2508M204 != null) {
                if (abstractC2508M204.m4520() && !abstractC2508M204.m4525()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC2508M204);
                    throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb));
                }
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC2508M204);
                }
                abstractC2508M204.m4509(256);
            }
        } else if (RecyclerView.f347) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM1995);
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM1995);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m1987(boolean z) {
        for (AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 : ((C1209) this.f2344).m2811()) {
            if (abstractComponentCallbacksC1406 != null && z) {
                abstractComponentCallbacksC1406.f5068.m1987(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean m1988() {
        if (this.f2342 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 : ((C1209) this.f2344).m2811()) {
            if (abstractComponentCallbacksC1406 != null && m1983(abstractComponentCallbacksC1406) && abstractComponentCallbacksC1406.f5068.m1988()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC1406);
                z = true;
            }
        }
        if (((ArrayList) this.f2345) != null) {
            for (int i = 0; i < ((ArrayList) this.f2345).size(); i++) {
                AbstractComponentCallbacksC1406 abstractComponentCallbacksC1407 = (AbstractComponentCallbacksC1406) ((ArrayList) this.f2345).get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1407)) {
                    
                }
            }
        }
        this.f2345 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m1989(boolean z) {
        for (AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 : ((C1209) this.f2344).m2811()) {
            if (abstractComponentCallbacksC1406 != null && z) {
                abstractComponentCallbacksC1406.f5068.m1989(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean m1990() {
        if (this.f2342 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 : ((C1209) this.f2344).m2811()) {
            if (abstractComponentCallbacksC1406 != null && abstractComponentCallbacksC1406.f5068.m1990()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean m1991() {
        boolean z = false;
        if (this.f2342 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 : ((C1209) this.f2344).m2811()) {
            if (abstractComponentCallbacksC1406 != null && m1983(abstractComponentCallbacksC1406) && abstractComponentCallbacksC1406.f5068.m1991()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m1992() {
        if (((C0577) this.f2344) == null) {
            C0215 c0215 = (C0215) this.f2343;
            c0215.m1247();
            this.f2344 = (C0577) c0215.f1332;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public View m1993(int i) {
        return ((C2481) this.f2343).f7925.getChildAt(m1995(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int m1994() {
        return ((C2481) this.f2343).f7925.getChildCount() - ((ArrayList) this.f2345).size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int m1995(int i) {
        C0689 c0689 = (C0689) this.f2344;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2481) this.f2343).f7925.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM2071 = i - (i2 - c0689.m2071(i2));
            if (iM2071 == 0) {
                while (c0689.m2073(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM2071;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public View m1996(int i) {
        return ((C2481) this.f2343).f7925.getChildAt(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int m1997() {
        return ((C2481) this.f2343).f7925.getChildCount();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1998(View view) {
        ((ArrayList) this.f2345).add(view);
        C2481 c2481 = (C2481) this.f2343;
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        if (abstractC2508M204 != null) {
            View view2 = abstractC2508M204.f8006;
            RecyclerView recyclerView = c2481.f7925;
            int i = abstractC2508M204.f8022;
            if (i != -1) {
                abstractC2508M204.f8021 = i;
            } else {
                abstractC2508M204.f8021 = view2.getImportantForAccessibility();
            }
            if (!recyclerView.m235()) {
                view2.setImportantForAccessibility(4);
            } else {
                abstractC2508M204.f8022 = 4;
                recyclerView.f424.add(abstractC2508M204);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m1999(View view) {
        if (((ArrayList) this.f2345).remove(view)) {
            C2481 c2481 = (C2481) this.f2343;
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
            if (abstractC2508M204 != null) {
                RecyclerView recyclerView = c2481.f7925;
                int i = abstractC2508M204.f8021;
                if (recyclerView.m235()) {
                    abstractC2508M204.f8022 = i;
                    recyclerView.f424.add(abstractC2508M204);
                } else {
                    abstractC2508M204.f8006.setImportantForAccessibility(i);
                }
                abstractC2508M204.f8021 = 0;
            }
        }
    }

    public C0575(C0215 c0215) {
        this.f2341 = 0;
        this.f2343 = c0215;
        this.f2344 = null;
        this.f2345 = null;
        this.f2342 = 0;
        this.f2346 = null;
    }

    public C0575() {
        this.f2341 = 2;
        this.f2343 = new ArrayList();
        this.f2344 = new C1209(1);
        new ArrayList();
        final int i = 0;
        new C1035(false);
        this.f2346 = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new ArrayList();
        new C1227(this);
        new CopyOnWriteArrayList();
        new InterfaceC0799(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᛸᲀ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0575 f5077;

            {
                this.f5077 = this;
            }

            @Override // p000.InterfaceC0799
            public final void accept(Object obj) {
                switch (0) {
                    case 0:
                        this.f5077.m1987(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f5077.m1989(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        new InterfaceC0799(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᛸᲀ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0575 f5077;

            {
                this.f5077 = this;
            }

            @Override // p000.InterfaceC0799
            public final void accept(Object obj) {
                switch (1) {
                    case 0:
                        this.f5077.m1987(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f5077.m1989(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 0;
        new InterfaceC0799(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᲀᛸ
            @Override // p000.InterfaceC0799
            public final void accept(Object obj) {
                switch (0) {
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
        new InterfaceC0799(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲇᲀᛸ
            @Override // p000.InterfaceC0799
            public final void accept(Object obj) {
                switch (1) {
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
        this.f2342 = -1;
        new ArrayDeque();
        new RunnableC0141(9, this);
    }
}
