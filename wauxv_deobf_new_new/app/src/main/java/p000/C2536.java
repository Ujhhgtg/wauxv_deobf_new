package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᤝᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2536 implements InterfaceC1044 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8076;

    public /* synthetic */ C2536(RecyclerView recyclerView) {
        this.f8076 = recyclerView;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m4454(C0153 c0153) {
        int i = c0153.f1212;
        RecyclerView recyclerView = this.f8076;
        if (i == 1) {
            recyclerView.f369.mo120(c0153.f1213, c0153.f1215);
            return;
        }
        if (i == 2) {
            recyclerView.f369.mo123(c0153.f1213, c0153.f1215);
        } else if (i == 4) {
            recyclerView.f369.mo124(c0153.f1213, c0153.f1215);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f369.mo122(c0153.f1213, c0153.f1215);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC2563 m4455(int i) {
        RecyclerView recyclerView = this.f8076;
        int iM2094 = recyclerView.f361.m2094();
        AbstractC2563 abstractC2563 = null;
        for (int i2 = 0; i2 < iM2094; i2++) {
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(recyclerView.f361.m2093(i2));
            if (abstractC2563M204 != null && !abstractC2563M204.m4540() && abstractC2563M204.f8159 == i) {
                if (!((ArrayList) recyclerView.f361.f2307).contains(abstractC2563M204.f8157)) {
                    abstractC2563 = abstractC2563M204;
                    break;
                }
                abstractC2563 = abstractC2563M204;
            }
        }
        if (abstractC2563 != null) {
            if (!((ArrayList) recyclerView.f361.f2307).contains(abstractC2563.f8157)) {
                return abstractC2563;
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m4456(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f8076;
        int iM2094 = recyclerView.f361.m2094();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2094; i6++) {
            View viewM2093 = recyclerView.f361.m2093(i6);
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(viewM2093);
            if (abstractC2563M204 != null && !abstractC2563M204.m4547() && (i4 = abstractC2563M204.f8159) >= i && i4 < i5) {
                abstractC2563M204.m4531(2);
                if (obj == null) {
                    abstractC2563M204.m4531(1024);
                } else if ((1024 & abstractC2563M204.f8166) == 0) {
                    if (abstractC2563M204.f8167 == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC2563M204.f8167 = arrayList;
                        abstractC2563M204.f8168 = Collections.unmodifiableList(arrayList);
                    }
                    abstractC2563M204.f8167.add(obj);
                }
                ((C2547) viewM2093.getLayoutParams()).f8109 = true;
            }
        }
        C2553 c2553 = recyclerView.f358;
        ArrayList arrayList2 = c2553.f8120;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC2563 abstractC2563 = (AbstractC2563) arrayList2.get(size);
            if (abstractC2563 != null && (i3 = abstractC2563.f8159) >= i && i3 < i5) {
                abstractC2563.m4531(2);
                c2553.m4517(size);
            }
        }
        recyclerView.f415 = true;
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public boolean mo2731(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f8076;
        if (recyclerView.f369.mo153()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.f369.mo152()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.m261();
        return recyclerView.m229(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public float mo2732() {
        float f;
        RecyclerView recyclerView = this.f8076;
        if (recyclerView.f369.mo153()) {
            f = recyclerView.f406;
        } else {
            if (!recyclerView.f369.mo152()) {
                return 0.0f;
            }
            f = recyclerView.f405;
        }
        return -f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m4457(int i, int i2) {
        RecyclerView recyclerView = this.f8076;
        int iM2094 = recyclerView.f361.m2094();
        for (int i3 = 0; i3 < iM2094; i3++) {
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(recyclerView.f361.m2093(i3));
            if (abstractC2563M204 != null && !abstractC2563M204.m4547() && abstractC2563M204.f8159 >= i) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC2563M204 + " now at position " + (abstractC2563M204.f8159 + i2));
                }
                abstractC2563M204.m4544(i2, false);
                recyclerView.f411.f8140 = true;
            }
        }
        ArrayList arrayList = recyclerView.f358.f8120;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2563 abstractC2563 = (AbstractC2563) arrayList.get(i4);
            if (abstractC2563 != null && abstractC2563.f8159 >= i) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC2563 + " now at position " + (abstractC2563.f8159 + i2));
                }
                abstractC2563.m4544(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f414 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void m4458(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f8076;
        int iM2094 = recyclerView.f361.m2094();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iM2094; i11++) {
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(recyclerView.f361.m2093(i11));
            if (abstractC2563M204 != null && (i10 = abstractC2563M204.f8159) >= i4 && i10 <= i3) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC2563M204);
                }
                if (abstractC2563M204.f8159 == i) {
                    abstractC2563M204.m4544(i2 - i, false);
                } else {
                    abstractC2563M204.m4544(i5, false);
                }
                recyclerView.f411.f8140 = true;
            }
        }
        ArrayList arrayList = recyclerView.f358.f8120;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            AbstractC2563 abstractC2563 = (AbstractC2563) arrayList.get(i12);
            if (abstractC2563 != null && (i9 = abstractC2563.f8159) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    abstractC2563.m4544(i2 - i, z);
                } else {
                    abstractC2563.m4544(i8, z);
                }
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC2563);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.f414 = true;
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo2733() {
        this.f8076.m261();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m4459(AbstractC2563 abstractC2563, C2173 c2173, C2173 c2174) {
        boolean zM2693;
        RecyclerView recyclerView = this.f8076;
        recyclerView.getClass();
        abstractC2563.m4546(false);
        C1001 c1001 = (C1001) recyclerView.f394;
        if (c2173 != null) {
            c1001.getClass();
            int i = c2173.f7200;
            int i2 = c2174.f7200;
            if (i == i2 && c2173.f7201 == c2174.f7201) {
                c1001.m2697(abstractC2563);
                abstractC2563.f8157.setAlpha(0.0f);
                c1001.f3660.add(abstractC2563);
                zM2693 = true;
            } else {
                zM2693 = c1001.m2693(abstractC2563, i, c2173.f7201, i2, c2174.f7201);
            }
        } else {
            c1001.m2697(abstractC2563);
            abstractC2563.f8157.setAlpha(0.0f);
            c1001.f3660.add(abstractC2563);
            zM2693 = true;
        }
        if (zM2693) {
            recyclerView.m242();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m4460(AbstractC2563 abstractC2563, C2173 c2173, C2173 c2174) {
        boolean zM2693;
        RecyclerView recyclerView = this.f8076;
        recyclerView.f358.m4522(abstractC2563);
        recyclerView.m205(abstractC2563);
        abstractC2563.m4546(false);
        C1001 c1001 = (C1001) recyclerView.f394;
        c1001.getClass();
        int i = c2173.f7200;
        int i2 = c2173.f7201;
        View view = abstractC2563.f8157;
        int left = c2174 == null ? view.getLeft() : c2174.f7200;
        int top = c2174 == null ? view.getTop() : c2174.f7201;
        if (abstractC2563.m4540() || (i == left && i2 == top)) {
            c1001.m2697(abstractC2563);
            c1001.f3659.add(abstractC2563);
            zM2693 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2693 = c1001.m2693(abstractC2563, i, i2, left, top);
        }
        if (zM2693) {
            recyclerView.m242();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m4461(int i) {
        RecyclerView recyclerView = this.f8076;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m212(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
