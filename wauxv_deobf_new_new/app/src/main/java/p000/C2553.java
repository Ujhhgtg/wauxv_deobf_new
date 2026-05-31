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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᛸᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2553 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f8118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f8119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f8120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final List f8121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f8122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2552 f8124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8125;

    public C2553(RecyclerView recyclerView) {
        this.f8125 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f8118 = arrayList;
        this.f8119 = null;
        this.f8120 = new ArrayList();
        this.f8121 = Collections.unmodifiableList(arrayList);
        this.f8122 = 2;
        this.f8123 = 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4511(AbstractC2563 abstractC2563, boolean z) {
        RecyclerView.m201(abstractC2563);
        View view = abstractC2563.f8157;
        RecyclerView recyclerView = this.f8125;
        C2565 c2565 = recyclerView.f418;
        if (c2565 != null) {
            C2564 c2564 = c2565.f8179;
            AbstractC3638.m5183(view, c2564 != null ? (C0086) c2564.f8177.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f370;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f411 != null) {
                recyclerView.f362.m4841(abstractC2563);
            }
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC2563);
            }
        }
        abstractC2563.f8175 = null;
        abstractC2563.f8174 = null;
        C2552 c2552M4513 = m4513();
        c2552M4513.getClass();
        int i = abstractC2563.f8162;
        ArrayList arrayList2 = c2552M4513.m4510(i).f8111;
        if (((C2551) c2552M4513.f8115.get(i)).f8112 <= arrayList2.size()) {
            AbstractC2236.m4224(view);
        } else {
            if (RecyclerView.f347 && arrayList2.contains(abstractC2563)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC2563.m4545();
            arrayList2.add(abstractC2563);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4512(int i) {
        RecyclerView recyclerView = this.f8125;
        if (i >= 0 && i < recyclerView.f411.m4527()) {
            return !recyclerView.f411.f8141 ? i : recyclerView.f360.m1316(i, 0);
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "invalid position ", ". State item count is ");
        sbM2802.append(recyclerView.f411.m4527());
        sbM2802.append(recyclerView.m223());
        throw new IndexOutOfBoundsException(sbM2802.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2552 m4513() {
        if (this.f8124 == null) {
            C2552 c2552 = new C2552();
            c2552.f8115 = new SparseArray();
            c2552.f8116 = 0;
            c2552.f8117 = Collections.newSetFromMap(new IdentityHashMap());
            this.f8124 = c2552;
            m4514();
        }
        return this.f8124;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4514() {
        RecyclerView recyclerView;
        AbstractC2537 abstractC2537;
        C2552 c2552 = this.f8124;
        if (c2552 == null || (abstractC2537 = (recyclerView = this.f8125).f368) == null || !recyclerView.f374) {
            return;
        }
        c2552.f8117.add(abstractC2537);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4515(AbstractC2537 abstractC2537, boolean z) {
        C2552 c2552 = this.f8124;
        if (c2552 != null) {
            SparseArray sparseArray = c2552.f8115;
            Set set = c2552.f8117;
            set.remove(abstractC2537);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2551) sparseArray.get(sparseArray.keyAt(i))).f8111;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC2236.m4224(((AbstractC2563) arrayList.get(i2)).f8157);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4516() {
        ArrayList arrayList = this.f8120;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4517(size);
        }
        arrayList.clear();
        if (RecyclerView.f352) {
            C1447 c1447 = this.f8125.f410;
            int[] iArr = c1447.f5126;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1447.f5127 = 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4517(int i) {
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f8120;
        AbstractC2563 abstractC2563 = (AbstractC2563) arrayList.get(i);
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC2563);
        }
        m4511(abstractC2563, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4518(View view) {
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        boolean zM4542 = abstractC2563M204.m4542();
        RecyclerView recyclerView = this.f8125;
        if (zM4542) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2563M204.m4541()) {
            abstractC2563M204.f8170.m4522(abstractC2563M204);
        } else if (abstractC2563M204.m4548()) {
            abstractC2563M204.f8166 &= -33;
        }
        m4519(abstractC2563M204);
        if (recyclerView.f394 == null || abstractC2563M204.m4539()) {
            return;
        }
        recyclerView.f394.mo2690(abstractC2563M204);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[LOOP:2: B:51:0x00a6->B:55:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b4 A[EDGE_INSN: B:84:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b4 A[EDGE_INSN: B:85:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae, LOOP_LABEL: LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4519(AbstractC2563 abstractC2563) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f8125;
        C1447 c1447 = recyclerView.f410;
        boolean zM4541 = abstractC2563.m4541();
        View view = abstractC2563.f8157;
        boolean z3 = false;
        boolean z4 = true;
        if (zM4541 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC2563.m4541());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m223());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC2563.m4542()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC2563);
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb2));
        }
        if (abstractC2563.m4547()) {
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC2563.f8166 & 16) == 0) {
            Field field = AbstractC3638.f11333;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z5 = RecyclerView.f347;
        ArrayList arrayList = this.f8120;
        if (z5 && arrayList.contains(abstractC2563)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC2563);
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, sb3));
        }
        if (abstractC2563.m4539()) {
            if (this.f8123 <= 0 || (abstractC2563.f8166 & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f8123 && size > 0) {
                    m4517(0);
                    size--;
                }
                if (RecyclerView.f352 && size > 0) {
                    int i5 = abstractC2563.f8159;
                    if (c1447.f5126 != null) {
                        int i6 = c1447.f5127 * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((AbstractC2563) arrayList.get(i)).f8159;
                                    if (c1447.f5126 != null) {
                                        break;
                                    }
                                    i3 = c1447.f5127 * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (c1447.f5126[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (c1447.f5126[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((AbstractC2563) arrayList.get(i)).f8159;
                            if (c1447.f5126 != null) {
                                break;
                                break;
                            }
                            i3 = c1447.f5127 * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (c1447.f5126[i4] == i2) {
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
                arrayList.add(size, abstractC2563);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                m4511(abstractC2563, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m223());
            }
            z4 = false;
        }
        recyclerView.f362.m4841(abstractC2563);
        if (z3 || z4 || !z) {
            return;
        }
        AbstractC2236.m4224(view);
        abstractC2563.f8175 = null;
        abstractC2563.f8174 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4520(View view) {
        AbstractC2542 abstractC2542;
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        int i = abstractC2563M204.f8166 & 12;
        RecyclerView recyclerView = this.f8125;
        if (i == 0 && abstractC2563M204.m4543() && (abstractC2542 = recyclerView.f394) != null) {
            C1001 c1001 = (C1001) abstractC2542;
            if (abstractC2563M204.m4535().isEmpty() && c1001.f3658 && !abstractC2563M204.m4538()) {
                if (this.f8119 == null) {
                    this.f8119 = new ArrayList();
                }
                abstractC2563M204.f8170 = this;
                abstractC2563M204.f8171 = true;
                this.f8119.add(abstractC2563M204);
                return;
            }
        }
        if (abstractC2563M204.m4538() && !abstractC2563M204.m4540() && !recyclerView.f368.f8078) {
            throw new IllegalArgumentException(AbstractC2844.m4781(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC2563M204.f8170 = this;
        abstractC2563M204.f8171 = false;
        this.f8118.add(abstractC2563M204);
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
    public final AbstractC2563 m4521(int i, long j) {
        boolean z;
        AbstractC2563 abstractC2563Mo2126;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        AbstractC2537 abstractC2537;
        boolean z5;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        C2565 c2565;
        C2564 c2564;
        View.AccessibilityDelegate accessibilityDelegateM5174;
        C0086 c0086;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C2547 c2547;
        boolean z8;
        RecyclerView recyclerViewM203;
        AbstractC2563 abstractC2563;
        AbstractC2563 abstractC2564;
        ArrayList arrayList2;
        View view;
        boolean z9;
        int size;
        int iM1316;
        RecyclerView recyclerView = this.f8125;
        C2559 c2559 = recyclerView.f411;
        if (i < 0 || i >= c2559.m4527()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + c2559.m4527() + recyclerView.m223());
        }
        if (c2559.f8141) {
            ArrayList arrayList3 = this.f8119;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (recyclerView.f368.f8078 && (iM1316 = recyclerView.f360.m1316(i, 0)) > 0 && iM1316 < recyclerView.f368.mo2124()) {
                            long jMo2468 = recyclerView.f368.mo2468(iM1316);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    abstractC2563Mo2126 = null;
                                    break;
                                }
                                AbstractC2563 abstractC2565 = (AbstractC2563) this.f8119.get(i3);
                                if (!abstractC2565.m4548() && abstractC2565.f8161 == jMo2468) {
                                    abstractC2565.m4531(32);
                                    abstractC2563Mo2126 = abstractC2565;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            abstractC2563Mo2126 = null;
                            break;
                        }
                    } else {
                        abstractC2563Mo2126 = (AbstractC2563) this.f8119.get(i2);
                        if (!abstractC2563Mo2126.m4548() && abstractC2563Mo2126.m4534() == i) {
                            abstractC2563Mo2126.m4531(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                abstractC2563Mo2126 = null;
                break;
            }
            z = abstractC2563Mo2126 != null;
        } else {
            z = false;
            abstractC2563Mo2126 = null;
        }
        ArrayList arrayList4 = this.f8118;
        ArrayList arrayList5 = this.f8120;
        if (abstractC2563Mo2126 == null) {
            int size2 = arrayList4.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ArrayList arrayList6 = (ArrayList) recyclerView.f361.f2307;
                    int size3 = arrayList6.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            z2 = true;
                            view = null;
                            break;
                        }
                        view = (View) arrayList6.get(i5);
                        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
                        z2 = true;
                        if (abstractC2563M204.m4534() == i && !abstractC2563M204.m4538() && !abstractC2563M204.m4540()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = arrayList5.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                abstractC2563Mo2126 = null;
                                break;
                            }
                            AbstractC2563 abstractC2566 = (AbstractC2563) arrayList5.get(i6);
                            if (!abstractC2566.m4538() && abstractC2566.m4534() == i && !abstractC2566.m4536()) {
                                arrayList5.remove(i6);
                                if (RecyclerView.f348) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC2566);
                                }
                                abstractC2563Mo2126 = abstractC2566;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        AbstractC2563 abstractC2563M205 = RecyclerView.m204(view);
                        C0552 c0552 = recyclerView.f361;
                        C0680 c0680 = (C0680) c0552.f2306;
                        int iIndexOfChild = ((C2536) c0552.f2305).f8076.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!c0680.m2168(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c0680.m2165(iIndexOfChild);
                        c0552.m2096(view);
                        C0552 c0553 = recyclerView.f361;
                        C0680 c0681 = (C0680) c0553.f2306;
                        int iIndexOfChild2 = ((C2536) c0553.f2305).f8076.indexOfChild(view);
                        int iM2166 = (iIndexOfChild2 == -1 || c0681.m2168(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c0681.m2166(iIndexOfChild2);
                        if (iM2166 == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(abstractC2563M205);
                            throw new IllegalStateException(AbstractC2844.m4781(recyclerView, sb));
                        }
                        recyclerView.f361.m2083(iM2166);
                        m4520(view);
                        abstractC2563M205.m4531(8224);
                        abstractC2563Mo2126 = abstractC2563M205;
                        break;
                    }
                } else {
                    AbstractC2563 abstractC2567 = (AbstractC2563) arrayList4.get(i4);
                    if (!abstractC2567.m4548() && abstractC2567.m4534() == i && !abstractC2567.m4538() && (c2559.f8141 || !abstractC2567.m4540())) {
                        abstractC2567.m4531(32);
                        abstractC2563Mo2126 = abstractC2567;
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            if (abstractC2563Mo2126 != null) {
                if (!abstractC2563Mo2126.m4540()) {
                    int i7 = abstractC2563Mo2126.f8159;
                    if (i7 < 0 || i7 >= recyclerView.f368.mo2124()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(abstractC2563Mo2126);
                        throw new IndexOutOfBoundsException(AbstractC2844.m4781(recyclerView, sb2));
                    }
                    if (c2559.f8141 || recyclerView.f368.mo2469(abstractC2563Mo2126.f8159) == abstractC2563Mo2126.f8162) {
                        AbstractC2537 abstractC2538 = recyclerView.f368;
                        if (!abstractC2538.f8078 || abstractC2563Mo2126.f8161 == abstractC2538.mo2468(abstractC2563Mo2126.f8159)) {
                            z9 = z2;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    if (RecyclerView.f347 && !c2559.f8141) {
                        throw new IllegalStateException(AbstractC2844.m4781(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z9 = c2559.f8141;
                }
                if (z9) {
                    z = z2;
                } else {
                    abstractC2563Mo2126.m4531(4);
                    if (abstractC2563Mo2126.m4541()) {
                        recyclerView.removeDetachedView(abstractC2563Mo2126.f8157, false);
                        abstractC2563Mo2126.f8170.m4522(abstractC2563Mo2126);
                    } else if (abstractC2563Mo2126.m4548()) {
                        abstractC2563Mo2126.f8166 &= -33;
                    }
                    m4519(abstractC2563Mo2126);
                    abstractC2563Mo2126 = null;
                }
            }
        } else {
            z2 = true;
        }
        if (abstractC2563Mo2126 == null) {
            int iM1317 = recyclerView.f360.m1316(i, 0);
            if (iM1317 >= 0) {
                j2 = 3;
                if (iM1317 < recyclerView.f368.mo2124()) {
                    int iMo2469 = recyclerView.f368.mo2469(iM1317);
                    AbstractC2537 abstractC2539 = recyclerView.f368;
                    j3 = 4;
                    if (abstractC2539.f8078) {
                        long jMo2469 = abstractC2539.mo2468(iM1317);
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        abstractC2564 = (AbstractC2563) arrayList5.get(size6);
                                        if (abstractC2564.f8161 != jMo2469 || abstractC2564.m4536()) {
                                            size6--;
                                        } else if (iMo2469 == abstractC2564.f8162) {
                                            arrayList5.remove(size6);
                                        } else {
                                            m4517(size6);
                                        }
                                    }
                                    abstractC2563Mo2126 = null;
                                    break;
                                }
                            }
                            abstractC2564 = (AbstractC2563) arrayList4.get(size5);
                            ArrayList arrayList7 = arrayList4;
                            long j5 = abstractC2564.f8161;
                            View view2 = abstractC2564.f8157;
                            if (j5 != jMo2469 || abstractC2564.m4548()) {
                                arrayList2 = arrayList7;
                            } else if (iMo2469 == abstractC2564.f8162) {
                                abstractC2564.m4531(32);
                                if (abstractC2564.m4540() && !c2559.f8141) {
                                    abstractC2564.f8166 = (abstractC2564.f8166 & (-15)) | 2;
                                }
                            } else {
                                arrayList2 = arrayList7;
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                AbstractC2563 abstractC2563M206 = RecyclerView.m204(view2);
                                abstractC2563M206.f8170 = null;
                                abstractC2563M206.f8171 = false;
                                abstractC2563M206.f8166 &= -33;
                                m4519(abstractC2563M206);
                            }
                            size5--;
                            arrayList4 = arrayList2;
                            abstractC2563Mo2126 = abstractC2564;
                            break;
                        }
                        if (abstractC2563Mo2126 != null) {
                            abstractC2563Mo2126.f8159 = iM1317;
                            z = z2;
                        }
                    }
                    if (abstractC2563Mo2126 == null) {
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        C2551 c2551 = (C2551) m4513().f8115.get(iMo2469);
                        if (c2551 == null) {
                            abstractC2563 = null;
                            break;
                        }
                        ArrayList arrayList8 = c2551.f8111;
                        if (!arrayList8.isEmpty()) {
                            int size7 = arrayList8.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    abstractC2563 = null;
                                    break;
                                }
                                if (!((AbstractC2563) arrayList8.get(size7)).m4536()) {
                                    abstractC2563 = (AbstractC2563) arrayList8.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            abstractC2563 = null;
                            break;
                        }
                        if (abstractC2563 != null) {
                            abstractC2563.m4545();
                            boolean z10 = RecyclerView.f347;
                        }
                        abstractC2563Mo2126 = abstractC2563;
                    }
                    if (abstractC2563Mo2126 == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j6 = this.f8124.m4510(iMo2469).f8113;
                            if (!((j6 == 0 || j6 + nanoTime2 < j) ? z2 : false)) {
                                return null;
                            }
                        }
                        AbstractC2537 abstractC25310 = recyclerView.f368;
                        abstractC25310.getClass();
                        try {
                            if (AbstractC3480.m5001()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo2469)));
                            }
                            abstractC2563Mo2126 = abstractC25310.mo2126(recyclerView, iMo2469);
                            View view3 = abstractC2563Mo2126.f8157;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC2563Mo2126.f8162 = iMo2469;
                            Trace.endSection();
                            if (RecyclerView.f352 && (recyclerViewM203 = RecyclerView.m203(view3)) != null) {
                                abstractC2563Mo2126.f8158 = new WeakReference(recyclerViewM203);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            C2551 c2551M4510 = this.f8124.m4510(iMo2469);
                            long j7 = c2551M4510.f8113;
                            if (j7 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j7 / 4) * 3);
                            }
                            c2551M4510.f8113 = nanoTime3;
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
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM1317 + ").state:" + c2559.m4527() + recyclerView.m223());
        }
        j2 = 3;
        j3 = 4;
        View view4 = abstractC2563Mo2126.f8157;
        if (z && !c2559.f8141) {
            int i8 = abstractC2563Mo2126.f8166;
            if ((i8 & 8192) != 0 ? z2 : false) {
                abstractC2563Mo2126.f8166 = i8 & (-8193);
                if (c2559.f8144) {
                    AbstractC2542.m4468(abstractC2563Mo2126);
                    AbstractC2542 abstractC2542 = recyclerView.f394;
                    abstractC2563Mo2126.m4535();
                    abstractC2542.getClass();
                    C2173 c2173 = new C2173();
                    c2173.m4136(abstractC2563Mo2126);
                    recyclerView.m245(abstractC2563Mo2126, c2173);
                }
            }
        }
        if (!c2559.f8141 || !abstractC2563Mo2126.m4537()) {
            if (abstractC2563Mo2126.m4537()) {
                if (((abstractC2563Mo2126.f8166 & 2) != 0 ? z2 : false) || abstractC2563Mo2126.m4538()) {
                }
                layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 == null) {
                    c2547 = (C2547) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c2547);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    c2547 = (C2547) layoutParams2;
                } else {
                    c2547 = (C2547) recyclerView.generateLayoutParams(layoutParams2);
                    view4.setLayoutParams(c2547);
                }
                c2547.f8107 = abstractC2563Mo2126;
                if (z || !z3) {
                    z8 = false;
                } else {
                    z8 = z7;
                }
                c2547.f8110 = z8;
                return abstractC2563Mo2126;
            }
            if (RecyclerView.f347 && abstractC2563Mo2126.m4540()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(abstractC2563Mo2126);
                throw new IllegalStateException(AbstractC2844.m4781(recyclerView, sb3));
            }
            z3 = false;
            int iM1318 = recyclerView.f360.m1316(i, 0);
            abstractC2563Mo2126.f8175 = null;
            abstractC2563Mo2126.f8174 = recyclerView;
            int i9 = abstractC2563Mo2126.f8162;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j8 = this.f8124.m4510(i9).f8114;
                if (j8 == 0 || j8 + nanoTime4 < j) {
                    if (abstractC2563Mo2126.m4542()) {
                        recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    abstractC2537 = recyclerView.f368;
                    abstractC2537.getClass();
                    if (abstractC2563Mo2126.f8175 == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC2563Mo2126.f8159 = iM1318;
                        if (abstractC2537.f8078) {
                            abstractC2563Mo2126.f8161 = abstractC2537.mo2468(iM1318);
                        }
                        abstractC2563Mo2126.f8166 = (abstractC2563Mo2126.f8166 & (-520)) | 1;
                        if (AbstractC3480.m5001()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2563Mo2126.f8162)));
                        }
                    }
                    abstractC2563Mo2126.f8175 = abstractC2537;
                    if (RecyclerView.f347) {
                        if (view4.getParent() != null && view4.isAttachedToWindow() != abstractC2563Mo2126.m4542()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC2563Mo2126.m4542() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC2563Mo2126);
                        }
                        if (view4.getParent() == null && view4.isAttachedToWindow()) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC2563Mo2126);
                        }
                    }
                    abstractC2537.mo2471(abstractC2563Mo2126, iM1318, abstractC2563Mo2126.m4535());
                    if (z5) {
                        arrayList = abstractC2563Mo2126.f8167;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC2563Mo2126.f8166 &= -1025;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams instanceof C2547) {
                            ((C2547) layoutParams).f8109 = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view4);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C2551 c2551M4511 = this.f8124.m4510(abstractC2563Mo2126.f8162);
                    j4 = c2551M4511.f8114;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    c2551M4511.f8114 = nanoTime;
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
                        c2565 = recyclerView.f418;
                        if (c2565 != null) {
                            c2564 = c2565.f8179;
                            if (c2564 != null) {
                                accessibilityDelegateM5174 = AbstractC3638.m5174(view4);
                                if (accessibilityDelegateM5174 == null) {
                                    c0086 = null;
                                } else if (accessibilityDelegateM5174 instanceof C0085) {
                                    c0086 = ((C0085) accessibilityDelegateM5174).f1090;
                                } else {
                                    c0086 = new C0086(accessibilityDelegateM5174);
                                }
                                if (c0086 != null && c0086 != c2564) {
                                    c2564.f8177.put(view4, c0086);
                                }
                            }
                            AbstractC3638.m5183(view4, c2564);
                        }
                    } else {
                        z7 = true;
                    }
                    if (c2559.f8141) {
                        abstractC2563Mo2126.f8163 = i;
                    }
                    z3 = z7;
                } else {
                    z7 = z2;
                }
            } else {
                if (abstractC2563Mo2126.m4542()) {
                    recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                abstractC2537 = recyclerView.f368;
                abstractC2537.getClass();
                if (abstractC2563Mo2126.f8175 == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC2563Mo2126.f8159 = iM1318;
                    if (abstractC2537.f8078) {
                        abstractC2563Mo2126.f8161 = abstractC2537.mo2468(iM1318);
                    }
                    abstractC2563Mo2126.f8166 = (abstractC2563Mo2126.f8166 & (-520)) | 1;
                    if (AbstractC3480.m5001()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2563Mo2126.f8162)));
                    }
                }
                abstractC2563Mo2126.f8175 = abstractC2537;
                if (RecyclerView.f347) {
                    if (view4.getParent() != null) {
                    }
                    if (view4.getParent() == null) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC2563Mo2126);
                    }
                }
                abstractC2537.mo2471(abstractC2563Mo2126, iM1318, abstractC2563Mo2126.m4535());
                if (z5) {
                    arrayList = abstractC2563Mo2126.f8167;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC2563Mo2126.f8166 &= -1025;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams instanceof C2547) {
                        ((C2547) layoutParams).f8109 = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view4);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                C2551 c2551M4512 = this.f8124.m4510(abstractC2563Mo2126.f8162);
                j4 = c2551M4512.f8114;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                c2551M4512.f8114 = nanoTime;
                accessibilityManager = recyclerView.f383;
                if (accessibilityManager == null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    z7 = true;
                    if (view4.getImportantForAccessibility() == 0) {
                        view4.setImportantForAccessibility(1);
                    }
                    c2565 = recyclerView.f418;
                    if (c2565 != null) {
                        c2564 = c2565.f8179;
                        if (c2564 != null) {
                            accessibilityDelegateM5174 = AbstractC3638.m5174(view4);
                            if (accessibilityDelegateM5174 == null) {
                                c0086 = null;
                            } else if (accessibilityDelegateM5174 instanceof C0085) {
                                c0086 = ((C0085) accessibilityDelegateM5174).f1090;
                            } else {
                                c0086 = new C0086(accessibilityDelegateM5174);
                            }
                            if (c0086 != null) {
                                c2564.f8177.put(view4, c0086);
                            }
                        }
                        AbstractC3638.m5183(view4, c2564);
                    }
                } else {
                    z7 = true;
                }
                if (c2559.f8141) {
                    abstractC2563Mo2126.f8163 = i;
                }
                z3 = z7;
            }
            layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                c2547 = (C2547) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c2547);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c2547 = (C2547) recyclerView.generateLayoutParams(layoutParams2);
                view4.setLayoutParams(c2547);
            } else {
                c2547 = (C2547) layoutParams2;
            }
            c2547.f8107 = abstractC2563Mo2126;
            if (z) {
                z8 = false;
            } else {
                z8 = false;
            }
            c2547.f8110 = z8;
            return abstractC2563Mo2126;
        }
        abstractC2563Mo2126.f8163 = i;
        z7 = z2;
        z3 = false;
        layoutParams2 = view4.getLayoutParams();
        if (layoutParams2 == null) {
            c2547 = (C2547) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(c2547);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            c2547 = (C2547) recyclerView.generateLayoutParams(layoutParams2);
            view4.setLayoutParams(c2547);
        } else {
            c2547 = (C2547) layoutParams2;
        }
        c2547.f8107 = abstractC2563Mo2126;
        if (z) {
            z8 = false;
        } else {
            z8 = false;
        }
        c2547.f8110 = z8;
        return abstractC2563Mo2126;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4522(AbstractC2563 abstractC2563) {
        if (abstractC2563.f8171) {
            this.f8119.remove(abstractC2563);
        } else {
            this.f8118.remove(abstractC2563);
        }
        abstractC2563.f8170 = null;
        abstractC2563.f8171 = false;
        abstractC2563.f8166 &= -33;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4523() {
        AbstractC2546 abstractC2546 = this.f8125.f369;
        this.f8123 = this.f8122 + (abstractC2546 != null ? abstractC2546.f8101 : 0);
        ArrayList arrayList = this.f8120;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f8123; size--) {
            m4517(size);
        }
    }
}
