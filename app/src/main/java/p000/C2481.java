package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2481 implements InterfaceC1041 {

    public final /* synthetic */ RecyclerView f7925;

    public /* synthetic */ C2481(RecyclerView recyclerView) {
        this.f7925 = recyclerView;
    }

    public void m4433(C0145 c0145) {
        int i = c0145.f1144;
        RecyclerView recyclerView = this.f7925;
        if (i == 1) {
            recyclerView.f369.mo120(c0145.f1145, c0145.f1147);
            return;
        }
        if (i == 2) {
            recyclerView.f369.mo123(c0145.f1145, c0145.f1147);
        } else if (i == 4) {
            recyclerView.f369.mo124(c0145.f1145, c0145.f1147);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f369.mo122(c0145.f1145, c0145.f1147);
        }
    }

    @Override // p000.InterfaceC1041
    public boolean mo2607(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7925;
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
        return recyclerView.m229(i, i2, 0, 2147483647);
    }

    public AbstractC2508 m4434(int i) {
        RecyclerView recyclerView = this.f7925;
        int iM1997 = recyclerView.f361.m1997();
        AbstractC2508 abstractC2508 = null;
        for (int i2 = 0; i2 < iM1997; i2++) {
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(recyclerView.f361.m1996(i2));
            if (abstractC2508M204 != null && !abstractC2508M204.m4518() && abstractC2508M204.f8008 == i) {
                if (!((ArrayList) recyclerView.f361.f2345).contains(abstractC2508M204.f8006)) {
                    abstractC2508 = abstractC2508M204;
                    break;
                }
                abstractC2508 = abstractC2508M204;
            }
        }
        if (abstractC2508 != null) {
            if (!((ArrayList) recyclerView.f361.f2345).contains(abstractC2508.f8006)) {
                return abstractC2508;
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void m4435(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7925;
        int iM1997 = recyclerView.f361.m1997();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM1997; i6++) {
            View viewM1996 = recyclerView.f361.m1996(i6);
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(viewM1996);
            if (abstractC2508M204 != null && !abstractC2508M204.m4525() && (i4 = abstractC2508M204.f8008) >= i && i4 < i5) {
                abstractC2508M204.m4509(2);
                if (obj == null) {
                    abstractC2508M204.m4509(1024);
                } else if ((1024 & abstractC2508M204.f8015) == 0) {
                    if (abstractC2508M204.f8016 == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC2508M204.f8016 = arrayList;
                        abstractC2508M204.f8017 = Collections.unmodifiableList(arrayList);
                    }
                    abstractC2508M204.f8016.add(obj);
                }
                ((C2492) viewM1996.getLayoutParams()).f7958 = true;
            }
        }
        C2498 c2498 = recyclerView.f358;
        ArrayList arrayList2 = c2498.f7969;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList2.get(size);
            if (abstractC2508 != null && (i3 = abstractC2508.f8008) >= i && i3 < i5) {
                abstractC2508.m4509(2);
                c2498.m4496(size);
            }
        }
        recyclerView.f415 = true;
    }

    @Override // p000.InterfaceC1041
    public float mo2608() {
        float f;
        RecyclerView recyclerView = this.f7925;
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

    public void m4436(int i, int i2) {
        RecyclerView recyclerView = this.f7925;
        int iM1997 = recyclerView.f361.m1997();
        for (int i3 = 0; i3 < iM1997; i3++) {
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(recyclerView.f361.m1996(i3));
            if (abstractC2508M204 != null && !abstractC2508M204.m4525() && abstractC2508M204.f8008 >= i) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC2508M204 + " now at position " + (abstractC2508M204.f8008 + i2));
                }
                abstractC2508M204.m4522(i2, false);
                recyclerView.f411.f7989 = true;
            }
        }
        ArrayList arrayList = recyclerView.f358.f7969;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(i4);
            if (abstractC2508 != null && abstractC2508.f8008 >= i) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC2508 + " now at position " + (abstractC2508.f8008 + i2));
                }
                abstractC2508.m4522(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f414 = true;
    }

    public void m4437(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f7925;
        int iM1997 = recyclerView.f361.m1997();
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
        for (int i11 = 0; i11 < iM1997; i11++) {
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(recyclerView.f361.m1996(i11));
            if (abstractC2508M204 != null && (i10 = abstractC2508M204.f8008) >= i4 && i10 <= i3) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC2508M204);
                }
                if (abstractC2508M204.f8008 == i) {
                    abstractC2508M204.m4522(i2 - i, false);
                } else {
                    abstractC2508M204.m4522(i5, false);
                }
                recyclerView.f411.f7989 = true;
            }
        }
        ArrayList arrayList = recyclerView.f358.f7969;
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
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(i12);
            if (abstractC2508 != null && (i9 = abstractC2508.f8008) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    abstractC2508.m4522(i2 - i, false);
                } else {
                    abstractC2508.m4522(i8, false);
                }
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC2508);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.f414 = true;
    }

    @Override // p000.InterfaceC1041
    public void mo2609() {
        this.f7925.m261();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public void m4438(AbstractC2508 abstractC2508, C2139 c2139, C2139 c21310) {
        boolean zM2569;
        RecyclerView recyclerView = this.f7925;
        
        abstractC2508.m4524(false);
        C0997 c0997 = (C0997) recyclerView.f394;
        if (c2139 != null) {
            
            int i = c2139.f7076;
            int i2 = c21310.f7076;
            if (i == i2 && c2139.f7077 == c21310.f7077) {
                c0997.m2573(abstractC2508);
                abstractC2508.f8006.setAlpha(0.0f);
                c0997.f3644.add(abstractC2508);
                zM2569 = true;
            } else {
                zM2569 = c0997.m2569(abstractC2508, i, c2139.f7077, i2, c21310.f7077);
            }
        } else {
            c0997.m2573(abstractC2508);
            abstractC2508.f8006.setAlpha(0.0f);
            c0997.f3644.add(abstractC2508);
            zM2569 = true;
        }
        if (zM2569) {
            recyclerView.m242();
        }
    }

    public void m4439(AbstractC2508 abstractC2508, C2139 c2139, C2139 c21310) {
        boolean zM2569;
        RecyclerView recyclerView = this.f7925;
        recyclerView.f358.m4501(abstractC2508);
        recyclerView.m205(abstractC2508);
        abstractC2508.m4524(false);
        C0997 c0997 = (C0997) recyclerView.f394;
        
        int i = c2139.f7076;
        int i2 = c2139.f7077;
        View view = abstractC2508.f8006;
        int left = c21310 == null ? view.getLeft() : c21310.f7076;
        int top = c21310 == null ? view.getTop() : c21310.f7077;
        if (abstractC2508.m4518() || (i == left && i2 == top)) {
            c0997.m2573(abstractC2508);
            c0997.f3643.add(abstractC2508);
            zM2569 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2569 = c0997.m2569(abstractC2508, i, i2, left, top);
        }
        if (zM2569) {
            recyclerView.m242();
        }
    }

    public void m4440(int i) {
        RecyclerView recyclerView = this.f7925;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m212(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
