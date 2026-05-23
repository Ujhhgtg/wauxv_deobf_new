package p000;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᛸᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2498 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f7967;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f7968;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f7969;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final List f7970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2497 f7973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7974;

    public C2498(RecyclerView recyclerView) {
        this.f7974 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7967 = arrayList;
        this.f7968 = null;
        this.f7969 = new ArrayList();
        this.f7970 = Collections.unmodifiableList(arrayList);
        this.f7971 = 2;
        this.f7972 = 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4490(AbstractC2508 abstractC2508, boolean z) {
        RecyclerView.m201(abstractC2508);
        View view = abstractC2508.f8006;
        RecyclerView recyclerView = this.f7974;
        C2510 c2510 = recyclerView.f418;
        if (c2510 != null) {
            C2509 c2509 = c2510.f8028;
            AbstractC3578.m5177(view, c2509 != null ? (C0078) c2509.f8026.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f370;
            if (arrayList.size() > 0) {
                
                throw new ClassCastException();
            }
            if (recyclerView.f411 != null) {
                recyclerView.f362.m4808(abstractC2508);
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC2508);
            }
        }
        abstractC2508.f8024 = null;
        abstractC2508.f8023 = null;
        C2497 c2497M4492 = m4492();
        
        int i = abstractC2508.f8011;
        ArrayList arrayList2 = c2497M4492.m4489(i).f7960;
        if (((C2496) c2497M4492.f7964.get(i)).f7961 <= arrayList2.size()) {
            AbstractC1459.m3175(view);
        } else {
            if (RecyclerView.f347 && arrayList2.contains(abstractC2508)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC2508.m4523();
            arrayList2.add(abstractC2508);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4491(int i) {
        RecyclerView recyclerView = this.f7974;
        if (i >= 0 && i < recyclerView.f411.m4505()) {
            return !recyclerView.f411.f7990 ? i : recyclerView.f360.m1170(i, 0);
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "invalid position ", ". State item count is ");
        sbM2787.append(recyclerView.f411.m4505());
        sbM2787.append(recyclerView.m223());
        throw new IndexOutOfBoundsException(sbM2787.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2497 m4492() {
        if (this.f7973 == null) {
            C2497 c2497 = new C2497();
            c2497.f7964 = new SparseArray();
            c2497.f7965 = 0;
            c2497.f7966 = Collections.newSetFromMap(new IdentityHashMap());
            this.f7973 = c2497;
            m4493();
        }
        return this.f7973;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4493() {
        RecyclerView recyclerView;
        AbstractC2482 abstractC2482;
        C2497 c2497 = this.f7973;
        if (c2497 == null || (abstractC2482 = (recyclerView = this.f7974).f368) == null || !recyclerView.f374) {
            return;
        }
        c2497.f7966.add(abstractC2482);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4494(AbstractC2482 abstractC2482, boolean z) {
        C2497 c2497 = this.f7973;
        if (c2497 != null) {
            SparseArray sparseArray = c2497.f7964;
            Set set = c2497.f7966;
            set.remove(abstractC2482);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2496) sparseArray.get(sparseArray.keyAt(i))).f7960;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC1459.m3175(((AbstractC2508) arrayList.get(i2)).f8006);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4495() {
        ArrayList arrayList = this.f7969;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4496(size);
        }
        arrayList.clear();
        if (true) {
            C1439 c1439 = this.f7974.f410;
            int[] iArr = c1439.f5097;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1439.f5098 = 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4496(int i) {
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f7969;
        AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(i);
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC2508);
        }
        m4490(abstractC2508, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4497(View view) {
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        boolean zM4520 = abstractC2508M204.m4520();
        RecyclerView recyclerView = this.f7974;
        if (zM4520) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2508M204.m4519()) {
            abstractC2508M204.f8019.m4501(abstractC2508M204);
        } else if (abstractC2508M204.m4526()) {
            abstractC2508M204.f8015 &= -33;
        }
        m4498(abstractC2508M204);
        if (recyclerView.f394 == null || abstractC2508M204.m4517()) {
            return;
        }
        recyclerView.f394.mo2566(abstractC2508M204);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[LOOP:2: B:51:0x00a6->B:55:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b4 A[EDGE_INSN: B:84:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b4 A[EDGE_INSN: B:85:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae, LOOP_LABEL: LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4498(AbstractC2508 abstractC2508) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7974;
        C1439 c1439 = recyclerView.f410;
        boolean zM4519 = abstractC2508.m4519();
        View view = abstractC2508.f8006;
        boolean z3 = false;
        boolean z4 = true;
        if (zM4519 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC2508.m4519());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m223());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC2508.m4520()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC2508);
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb2));
        }
        if (abstractC2508.m4525()) {
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC2508.f8015 & 16) == 0) {
            Field field = AbstractC3578.f11184;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z5 = RecyclerView.f347;
        ArrayList arrayList = this.f7969;
        if (z5 && arrayList.contains(abstractC2508)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC2508);
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, sb3));
        }
        if (abstractC2508.m4517()) {
            if (this.f7972 <= 0 || (abstractC2508.f8015 & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f7972 && true) {
                    m4496(0);
                    size--;
                }
                if (true && size > 0) {
                    int i5 = abstractC2508.f8008;
                    if (c1439.f5097 != null) {
                        int i6 = c1439.f5098 * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((AbstractC2508) arrayList.get(i)).f8008;
                                    if (true) {
                                        break;
                                    }
                                    i3 = c1439.f5098 * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (c1439.f5097[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (c1439.f5097[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((AbstractC2508) arrayList.get(i)).f8008;
                            if (c1439.f5097 != null) {
                                break;
                                break;
                            }
                            i3 = c1439.f5098 * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (c1439.f5097[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC2508);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                m4490(abstractC2508, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m223());
            }
            z4 = false;
        }
        recyclerView.f362.m4808(abstractC2508);
        if (z3 || z4 || !z) {
            return;
        }
        AbstractC1459.m3175(view);
        abstractC2508.f8024 = null;
        abstractC2508.f8023 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4499(View view) {
        AbstractC2487 abstractC2487;
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        int i = abstractC2508M204.f8015 & 12;
        RecyclerView recyclerView = this.f7974;
        if (i == 0 && abstractC2508M204.m4521() && (abstractC2487 = recyclerView.f394) != null) {
            C0997 c0997 = (C0997) abstractC2487;
            if (abstractC2508M204.m4513().isEmpty() && c0997.f3642 && !abstractC2508M204.m4516()) {
                if (this.f7968 == null) {
                    this.f7968 = new ArrayList();
                }
                abstractC2508M204.f8019 = this;
                abstractC2508M204.f8020 = true;
                this.f7968.add(abstractC2508M204);
                return;
            }
        }
        if (abstractC2508M204.m4516() && !abstractC2508M204.m4518() && !recyclerView.f368.f7927) {
            throw new IllegalArgumentException(AbstractC2784.m4747(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC2508M204.f8019 = this;
        abstractC2508M204.f8020 = false;
        this.f7967.add(abstractC2508M204);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0373 A[EDGE_INSN: B:191:0x0373->B:192:0x0374 BREAK  A[LOOP:4: B:186:0x035b->B:190:0x0370]] */
    /* JADX WARN: Code duplicated, block: B:279:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:282:0x0502  */
    /* JADX WARN: Code duplicated, block: B:285:0x050c  */
    /* JADX WARN: Code duplicated, block: B:286:0x050f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0512  */
    /* JADX WARN: Code duplicated, block: B:290:0x0518  */
    /* JADX WARN: Code duplicated, block: B:293:0x052c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0545  */
    /* JADX WARN: Code duplicated, block: B:312:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:314:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:317:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:320:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:324:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:330:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:332:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:334:0x0602  */
    /* JADX WARN: Code duplicated, block: B:338:0x060a  */
    /* JADX WARN: Code duplicated, block: B:340:0x060e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0614  */
    /* JADX WARN: Code duplicated, block: B:343:0x0616  */
    /* JADX WARN: Code duplicated, block: B:345:0x061a  */
    /* JADX WARN: Code duplicated, block: B:346:0x061f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0632  */
    /* JADX WARN: Code duplicated, block: B:354:0x0637  */
    /* JADX WARN: Code duplicated, block: B:358:0x0640  */
    /* JADX WARN: Code duplicated, block: B:359:0x064a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:36:0x007c BREAK  A[LOOP:0: B:14:0x0023->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:361:0x0650  */
    /* JADX WARN: Code duplicated, block: B:362:0x065a  */
    /* JADX WARN: Code duplicated, block: B:365:0x0660 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x0664  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC2508 m4500(int i, long j) {
        boolean z;
        AbstractC2508 abstractC2508Mo2042;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        AbstractC2482 abstractC2482;
        boolean z5;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        C2510 c2510;
        C2509 c2509;
        View.AccessibilityDelegate accessibilityDelegateM5168;
        C0078 c0078;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C2492 c2492;
        boolean z8;
        RecyclerView recyclerViewM203;
        AbstractC2508 abstractC2508;
        AbstractC2508 abstractC2509;
        ArrayList arrayList2;
        View view;
        boolean z9;
        int size;
        int iM1170;
        RecyclerView recyclerView = this.f7974;
        C2504 c2504 = recyclerView.f411;
        if (i < 0 || i >= c2504.m4505()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + c2504.m4505() + recyclerView.m223());
        }
        if (c2504.f7990) {
            ArrayList arrayList3 = this.f7968;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (recyclerView.f368.f7927 && (iM1170 = recyclerView.f360.m1170(i, 0)) > 0 && iM1170 < recyclerView.f368.mo2040()) {
                            long jMo2352 = recyclerView.f368.mo2352(iM1170);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    abstractC2508Mo2042 = null;
                                    break;
                                }
                                AbstractC2508 abstractC25010 = (AbstractC2508) this.f7968.get(i3);
                                if (!abstractC25010.m4526() && abstractC25010.f8010 == jMo2352) {
                                    abstractC25010.m4509(32);
                                    abstractC2508Mo2042 = abstractC25010;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            abstractC2508Mo2042 = null;
                            break;
                        }
                    } else {
                        abstractC2508Mo2042 = (AbstractC2508) this.f7968.get(i2);
                        if (!abstractC2508Mo2042.m4526() && abstractC2508Mo2042.m4512() == i) {
                            abstractC2508Mo2042.m4509(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                abstractC2508Mo2042 = null;
                break;
            }
            z = abstractC2508Mo2042 != null;
        } else {
            z = false;
            abstractC2508Mo2042 = null;
        }
        ArrayList arrayList4 = this.f7967;
        ArrayList arrayList5 = this.f7969;
        if (abstractC2508Mo2042 == null) {
            int size2 = arrayList4.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ArrayList arrayList6 = (ArrayList) recyclerView.f361.f2345;
                    int size3 = arrayList6.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            z2 = true;
                            view = null;
                            break;
                        }
                        view = (View) arrayList6.get(i5);
                        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
                        z2 = true;
                        if (abstractC2508M204.m4512() == i && !abstractC2508M204.m4516() && !abstractC2508M204.m4518()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = arrayList5.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                abstractC2508Mo2042 = null;
                                break;
                            }
                            AbstractC2508 abstractC25011 = (AbstractC2508) arrayList5.get(i6);
                            if (!abstractC25011.m4516() && abstractC25011.m4512() == i && !abstractC25011.m4514()) {
                                arrayList5.remove(i6);
                                if (RecyclerView.f348) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC25011);
                                }
                                abstractC2508Mo2042 = abstractC25011;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        AbstractC2508 abstractC2508M205 = RecyclerView.m204(view);
                        C0575 c0575 = recyclerView.f361;
                        C0689 c0689 = (C0689) c0575.f2344;
                        int iIndexOfChild = ((C2481) c0575.f2343).f7925.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!c0689.m2073(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c0689.m2070(iIndexOfChild);
                        c0575.m1999(view);
                        C0575 c0576 = recyclerView.f361;
                        C0689 c06810 = (C0689) c0576.f2344;
                        int iIndexOfChild2 = ((C2481) c0576.f2343).f7925.indexOfChild(view);
                        int iM2071 = (iIndexOfChild2 == -1 || c06810.m2073(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c06810.m2071(iIndexOfChild2);
                        if (iM2071 == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(abstractC2508M205);
                            throw new IllegalStateException(AbstractC2784.m4747(recyclerView, sb));
                        }
                        recyclerView.f361.m1986(iM2071);
                        m4499(view);
                        abstractC2508M205.m4509(8224);
                        abstractC2508Mo2042 = abstractC2508M205;
                        break;
                    }
                } else {
                    AbstractC2508 abstractC25012 = (AbstractC2508) arrayList4.get(i4);
                    if (!abstractC25012.m4526() && abstractC25012.m4512() == i && !abstractC25012.m4516() && (c2504.f7990 || !abstractC25012.m4518())) {
                        abstractC25012.m4509(32);
                        abstractC2508Mo2042 = abstractC25012;
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            if (true) {
                if (!abstractC2508Mo2042.m4518()) {
                    int i7 = abstractC2508Mo2042.f8008;
                    if (i7 < 0 || i7 >= recyclerView.f368.mo2040()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(abstractC2508Mo2042);
                        throw new IndexOutOfBoundsException(AbstractC2784.m4747(recyclerView, sb2));
                    }
                    if (c2504.f7990 || recyclerView.f368.mo2353(abstractC2508Mo2042.f8008) == abstractC2508Mo2042.f8011) {
                        AbstractC2482 abstractC2483 = recyclerView.f368;
                        if (!abstractC2483.f7927 || abstractC2508Mo2042.f8010 == abstractC2483.mo2352(abstractC2508Mo2042.f8008)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    if (RecyclerView.f347 && !c2504.f7990) {
                        throw new IllegalStateException(AbstractC2784.m4747(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z9 = c2504.f7990;
                }
                if (z9) {
                    z = true;
                } else {
                    abstractC2508Mo2042.m4509(4);
                    if (abstractC2508Mo2042.m4519()) {
                        recyclerView.removeDetachedView(abstractC2508Mo2042.f8006, false);
                        abstractC2508Mo2042.f8019.m4501(abstractC2508Mo2042);
                    } else if (abstractC2508Mo2042.m4526()) {
                        abstractC2508Mo2042.f8015 &= -33;
                    }
                    m4498(abstractC2508Mo2042);
                    abstractC2508Mo2042 = null;
                }
            }
        } else {
            z2 = true;
        }
        if (abstractC2508Mo2042 == null) {
            int iM1171 = recyclerView.f360.m1170(i, 0);
            if (iM1171 >= 0) {
                j2 = 3;
                if (iM1171 < recyclerView.f368.mo2040()) {
                    int iMo2353 = recyclerView.f368.mo2353(iM1171);
                    AbstractC2482 abstractC2484 = recyclerView.f368;
                    j3 = 4;
                    if (abstractC2484.f7927) {
                        long jMo2353 = abstractC2484.mo2352(iM1171);
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        abstractC2509 = (AbstractC2508) arrayList5.get(size6);
                                        if (abstractC2509.f8010 != jMo2353 || abstractC2509.m4514()) {
                                            size6--;
                                        } else if (iMo2353 == abstractC2509.f8011) {
                                            arrayList5.remove(size6);
                                        } else {
                                            m4496(size6);
                                        }
                                    }
                                    abstractC2508Mo2042 = null;
                                    break;
                                }
                            }
                            abstractC2509 = (AbstractC2508) arrayList4.get(size5);
                            ArrayList arrayList7 = arrayList4;
                            long j5 = abstractC2509.f8010;
                            View view2 = abstractC2509.f8006;
                            if (j5 != jMo2353 || abstractC2509.m4526()) {
                                arrayList2 = arrayList7;
                            } else if (iMo2353 == abstractC2509.f8011) {
                                abstractC2509.m4509(32);
                                if (abstractC2509.m4518() && !c2504.f7990) {
                                    abstractC2509.f8015 = (abstractC2509.f8015 & (-15)) | 2;
                                }
                            } else {
                                arrayList2 = arrayList7;
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                AbstractC2508 abstractC2508M206 = RecyclerView.m204(view2);
                                abstractC2508M206.f8019 = null;
                                abstractC2508M206.f8020 = false;
                                abstractC2508M206.f8015 &= -33;
                                m4498(abstractC2508M206);
                            }
                            size5--;
                            arrayList4 = arrayList2;
                            abstractC2508Mo2042 = abstractC2509;
                            break;
                        }
                        if (true) {
                            abstractC2508Mo2042.f8008 = iM1171;
                            z = true;
                        }
                    }
                    if (abstractC2508Mo2042 == null) {
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        C2496 c2496 = (C2496) m4492().f7964.get(iMo2353);
                        if (c2496 == null) {
                            abstractC2508 = null;
                            break;
                        }
                        ArrayList arrayList8 = c2496.f7960;
                        if (!arrayList8.isEmpty()) {
                            int size7 = arrayList8.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    abstractC2508 = null;
                                    break;
                                }
                                if (!((AbstractC2508) arrayList8.get(size7)).m4514()) {
                                    abstractC2508 = (AbstractC2508) arrayList8.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            abstractC2508 = null;
                            break;
                        }
                        if (abstractC2508 != null) {
                            abstractC2508.m4523();
                            boolean z10 = RecyclerView.f347;
                        }
                        abstractC2508Mo2042 = abstractC2508;
                    }
                    if (abstractC2508Mo2042 == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != 9223372036854775807L) {
                            long j6 = this.f7973.m4489(iMo2353).f7962;
                            if (!((j6 == 0 || j6 + nanoTime2 < j) ? true : false)) {
                                return null;
                            }
                        }
                        AbstractC2482 abstractC2485 = recyclerView.f368;
                        
                        try {
                            if (AbstractC3422.m4939()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo2353)));
                            }
                            abstractC2508Mo2042 = abstractC2485.mo2042(recyclerView, iMo2353);
                            View view3 = abstractC2508Mo2042.f8006;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC2508Mo2042.f8011 = iMo2353;
                            Trace.endSection();
                            if (true && (recyclerViewM203 = RecyclerView.m203(view3)) != null) {
                                abstractC2508Mo2042.f8007 = new WeakReference(recyclerViewM203);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            C2496 c2496M4489 = this.f7973.m4489(iMo2353);
                            long j7 = c2496M4489.f7962;
                            if (j7 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j7 / 4) * 3);
                            }
                            c2496M4489.f7962 = nanoTime3;
                            if (RecyclerView.f348) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM1171 + ").state:" + c2504.m4505() + recyclerView.m223());
        }
        j2 = 3;
        j3 = 4;
        View view4 = abstractC2508Mo2042.f8006;
        if (true && !c2504.f7990) {
            int i8 = abstractC2508Mo2042.f8015;
            if ((i8 & 8192) != 0 ? true : false) {
                abstractC2508Mo2042.f8015 = i8 & (-8193);
                if (c2504.f7993) {
                    AbstractC2487.m4446(abstractC2508Mo2042);
                    AbstractC2487 abstractC2487 = recyclerView.f394;
                    abstractC2508Mo2042.m4513();
                    
                    C2139 c2139 = new C2139();
                    c2139.m3952(abstractC2508Mo2042);
                    recyclerView.m245(abstractC2508Mo2042, c2139);
                }
            }
        }
        if (!c2504.f7990 || !abstractC2508Mo2042.m4515()) {
            if (abstractC2508Mo2042.m4515()) {
                if (((abstractC2508Mo2042.f8015 & 2) != 0 ? true : false) || abstractC2508Mo2042.m4516()) {
                }
                layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 == null) {
                    c2492 = (C2492) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c2492);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    c2492 = (C2492) layoutParams2;
                } else {
                    c2492 = (C2492) recyclerView.generateLayoutParams(layoutParams2);
                    view4.setLayoutParams(c2492);
                }
                c2492.f7956 = abstractC2508Mo2042;
                if (true) {
                    z8 = false;
                } else {
                    z8 = z7;
                }
                c2492.f7959 = false;
                return abstractC2508Mo2042;
            }
            if (RecyclerView.f347 && abstractC2508Mo2042.m4518()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(abstractC2508Mo2042);
                throw new IllegalStateException(AbstractC2784.m4747(recyclerView, sb3));
            }
            z3 = false;
            int iM1172 = recyclerView.f360.m1170(i, 0);
            abstractC2508Mo2042.f8024 = null;
            abstractC2508Mo2042.f8023 = recyclerView;
            int i9 = abstractC2508Mo2042.f8011;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j != 9223372036854775807L) {
                long j8 = this.f7973.m4489(i9).f7963;
                if (j8 == 0 || j8 + nanoTime4 < j) {
                    if (abstractC2508Mo2042.m4520()) {
                        recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    abstractC2482 = recyclerView.f368;
                    
                    if (abstractC2508Mo2042.f8024 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC2508Mo2042.f8008 = iM1172;
                        if (abstractC2482.f7927) {
                            abstractC2508Mo2042.f8010 = abstractC2482.mo2352(iM1172);
                        }
                        abstractC2508Mo2042.f8015 = (abstractC2508Mo2042.f8015 & (-520)) | 1;
                        if (AbstractC3422.m4939()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2508Mo2042.f8011)));
                        }
                    }
                    abstractC2508Mo2042.f8024 = abstractC2482;
                    if (RecyclerView.f347) {
                        if (view4.getParent() != null && view4.isAttachedToWindow() != abstractC2508Mo2042.m4520()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC2508Mo2042.m4520() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC2508Mo2042);
                        }
                        if (view4.getParent() == null && view4.isAttachedToWindow()) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC2508Mo2042);
                        }
                    }
                    abstractC2482.mo2355(abstractC2508Mo2042, iM1172, abstractC2508Mo2042.m4513());
                    if (z5) {
                        arrayList = abstractC2508Mo2042.f8016;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC2508Mo2042.f8015 &= -1025;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams instanceof C2492) {
                            ((C2492) layoutParams).f7958 = true;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view4);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C2496 c2496M44810 = this.f7973.m4489(abstractC2508Mo2042.f8011);
                    j4 = c2496M44810.f7963;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / 4L) + ((j4 / 4L) * 3L);
                    }
                    c2496M44810.f7963 = nanoTime;
                    accessibilityManager = recyclerView.f383;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        z7 = true;
                        if (view4.getImportantForAccessibility() == 0) {
                            view4.setImportantForAccessibility(1);
                        }
                        c2510 = recyclerView.f418;
                        if (c2510 != null) {
                            c2509 = c2510.f8028;
                            if (c2509 != null) {
                                accessibilityDelegateM5168 = AbstractC3578.m5168(view4);
                                if (accessibilityDelegateM5168 == null) {
                                    c0078 = null;
                                } else if (accessibilityDelegateM5168 instanceof C0077) {
                                    c0078 = ((C0077) accessibilityDelegateM5168).f1022;
                                } else {
                                    c0078 = new C0078(accessibilityDelegateM5168);
                                }
                                if (c0078 != null && c0078 != c2509) {
                                    c2509.f8026.put(view4, c0078);
                                }
                            }
                            AbstractC3578.m5177(view4, c2509);
                        }
                    } else {
                        z7 = true;
                    }
                    if (c2504.f7990) {
                        abstractC2508Mo2042.f8012 = i;
                    }
                    z3 = true;
                } else {
                    z7 = true;
                }
            } else {
                if (abstractC2508Mo2042.m4520()) {
                    recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                    z4 = true;
                } else {
                    z4 = false;
                }
                abstractC2482 = recyclerView.f368;
                
                if (abstractC2508Mo2042.f8024 == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC2508Mo2042.f8008 = iM1172;
                    if (abstractC2482.f7927) {
                        abstractC2508Mo2042.f8010 = abstractC2482.mo2352(iM1172);
                    }
                    abstractC2508Mo2042.f8015 = (abstractC2508Mo2042.f8015 & (-520)) | 1;
                    if (AbstractC3422.m4939()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2508Mo2042.f8011)));
                    }
                }
                abstractC2508Mo2042.f8024 = abstractC2482;
                if (RecyclerView.f347) {
                    if (view4.getParent() != null) {
                    }
                    if (view4.getParent() == null) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC2508Mo2042);
                    }
                }
                abstractC2482.mo2355(abstractC2508Mo2042, iM1172, abstractC2508Mo2042.m4513());
                if (z5) {
                    arrayList = abstractC2508Mo2042.f8016;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC2508Mo2042.f8015 &= -1025;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams instanceof C2492) {
                        ((C2492) layoutParams).f7958 = true;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view4);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                C2496 c2496M44811 = this.f7973.m4489(abstractC2508Mo2042.f8011);
                j4 = c2496M44811.f7963;
                if (j4 != 0) {
                    nanoTime = (nanoTime / 4L) + ((j4 / 4L) * 3L);
                }
                c2496M44811.f7963 = nanoTime;
                accessibilityManager = recyclerView.f383;
                if (accessibilityManager == null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (false) {
                    z7 = true;
                    if (view4.getImportantForAccessibility() == 0) {
                        view4.setImportantForAccessibility(1);
                    }
                    c2510 = recyclerView.f418;
                    if (c2510 != null) {
                        c2509 = c2510.f8028;
                        if (c2509 != null) {
                            accessibilityDelegateM5168 = AbstractC3578.m5168(view4);
                            if (accessibilityDelegateM5168 == null) {
                                c0078 = null;
                            } else if (accessibilityDelegateM5168 instanceof C0077) {
                                c0078 = ((C0077) accessibilityDelegateM5168).f1022;
                            } else {
                                c0078 = new C0078(accessibilityDelegateM5168);
                            }
                            if (c0078 != null) {
                                c2509.f8026.put(view4, c0078);
                            }
                        }
                        AbstractC3578.m5177(view4, c2509);
                    }
                } else {
                    z7 = true;
                }
                if (c2504.f7990) {
                    abstractC2508Mo2042.f8012 = i;
                }
                z3 = true;
            }
            layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                c2492 = (C2492) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c2492);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c2492 = (C2492) recyclerView.generateLayoutParams(layoutParams2);
                view4.setLayoutParams(c2492);
            } else {
                c2492 = (C2492) layoutParams2;
            }
            c2492.f7956 = abstractC2508Mo2042;
            if (true) {
                z8 = false;
            } else {
                z8 = false;
            }
            c2492.f7959 = false;
            return abstractC2508Mo2042;
        }
        abstractC2508Mo2042.f8012 = i;
        z7 = true;
        z3 = false;
        layoutParams2 = view4.getLayoutParams();
        if (layoutParams2 == null) {
            c2492 = (C2492) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(c2492);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            c2492 = (C2492) recyclerView.generateLayoutParams(layoutParams2);
            view4.setLayoutParams(c2492);
        } else {
            c2492 = (C2492) layoutParams2;
        }
        c2492.f7956 = abstractC2508Mo2042;
        if (true) {
            z8 = false;
        } else {
            z8 = false;
        }
        c2492.f7959 = false;
        return abstractC2508Mo2042;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4501(AbstractC2508 abstractC2508) {
        if (abstractC2508.f8020) {
            this.f7968.remove(abstractC2508);
        } else {
            this.f7967.remove(abstractC2508);
        }
        abstractC2508.f8019 = null;
        abstractC2508.f8020 = false;
        abstractC2508.f8015 &= -33;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4502() {
        AbstractC2491 abstractC2491 = this.f7974.f369;
        this.f7972 = this.f7971 + (abstractC2491 != null ? abstractC2491.f7950 : 0);
        ArrayList arrayList = this.f7969;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7972; size--) {
            m4496(size);
        }
    }
}
