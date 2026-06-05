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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸ᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0831feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ArrayList f3292Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ArrayList f3293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f3294Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final List f3295Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3296Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f3297Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C0828feyxiexzfUjhhgtg f3298Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f3299Ujhhgtgfeyxiexzf;

    public C0831feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f3299Ujhhgtgfeyxiexzf = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3292Ujhhgtgfeyxiexzf = arrayList;
        this.f3293Ujhhgtgfeyxiexzf = null;
        this.f3294Ujhhgtgfeyxiexzf = new ArrayList();
        this.f3295Ujhhgtgfeyxiexzf = Collections.unmodifiableList(arrayList);
        this.f3296Ujhhgtgfeyxiexzf = 2;
        this.f3297Ujhhgtgfeyxiexzf = 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2229Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, boolean z) {
        RecyclerView.m201Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg = recyclerView.f419Ujhhgtgfeyxiexzf;
        if (c0816feyxiexzfUjhhgtg != null) {
            C0820feyxiexzfUjhhgtg c0820feyxiexzfUjhhgtg = c0816feyxiexzfUjhhgtg.f3229Ujhhgtgfeyxiexzf;
            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(view, c0820feyxiexzfUjhhgtg != null ? (C2949feyxiexzfUjhhgtg) c0820feyxiexzfUjhhgtg.f3239Ujhhgtgfeyxiexzf.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f371Ujhhgtgfeyxiexzf;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f412feyxiexzfUjhhgtg != null) {
                recyclerView.f363Ujhhgtgfeyxiexzf.m3374Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
            }
            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC0821feyxiexzfUjhhgtg);
            }
        }
        abstractC0821feyxiexzfUjhhgtg.f3259Ujhhgtgfeyxiexzf = null;
        abstractC0821feyxiexzfUjhhgtg.f3258Ujhhgtgfeyxiexzf = null;
        C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf = m2231Ujhhgtgfeyxiexzf();
        c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.getClass();
        int i = abstractC0821feyxiexzfUjhhgtg.f3246Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(i).f3288Ujhhgtgfeyxiexzf;
        if (((C0829feyxiexzfUjhhgtg) c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.f3285Ujhhgtgfeyxiexzf.get(i)).f3289Ujhhgtgfeyxiexzf <= arrayList2.size()) {
            AbstractC3612feyxiexzfUjhhgtg.m5233Ujhhgtgfeyxiexzf(view);
        } else {
            if (RecyclerView.f348feyxiexzfUjhhgtg && arrayList2.contains(abstractC0821feyxiexzfUjhhgtg)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC0821feyxiexzfUjhhgtg.m2184Ujhhgtgfeyxiexzf();
            arrayList2.add(abstractC0821feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m2230Ujhhgtgfeyxiexzf(int i) {
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        if (i >= 0 && i < recyclerView.f412feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
            return !recyclerView.f412feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf ? i : recyclerView.f361Ujhhgtgfeyxiexzf.m4480Ujhhgtgfeyxiexzf(i, 0);
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "invalid position ", ". State item count is ");
        sbM4804Ujhhgtgfeyxiexzf.append(recyclerView.f412feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf());
        sbM4804Ujhhgtgfeyxiexzf.append(recyclerView.m223feyxiexzfUjhhgtg());
        throw new IndexOutOfBoundsException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0828feyxiexzfUjhhgtg m2231Ujhhgtgfeyxiexzf() {
        if (this.f3298Ujhhgtgfeyxiexzf == null) {
            C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtg = new C0828feyxiexzfUjhhgtg();
            c0828feyxiexzfUjhhgtg.f3285Ujhhgtgfeyxiexzf = new SparseArray();
            c0828feyxiexzfUjhhgtg.f3286Ujhhgtgfeyxiexzf = 0;
            c0828feyxiexzfUjhhgtg.f3287Ujhhgtgfeyxiexzf = Collections.newSetFromMap(new IdentityHashMap());
            this.f3298Ujhhgtgfeyxiexzf = c0828feyxiexzfUjhhgtg;
            m2232Ujhhgtgfeyxiexzf();
        }
        return this.f3298Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2232Ujhhgtgfeyxiexzf() {
        RecyclerView recyclerView;
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg;
        C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtg = this.f3298Ujhhgtgfeyxiexzf;
        if (c0828feyxiexzfUjhhgtg == null || (abstractC0795feyxiexzfUjhhgtg = (recyclerView = this.f3299Ujhhgtgfeyxiexzf).f369Ujhhgtgfeyxiexzf) == null || !recyclerView.f375Ujhhgtgfeyxiexzf) {
            return;
        }
        c0828feyxiexzfUjhhgtg.f3287Ujhhgtgfeyxiexzf.add(abstractC0795feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m2233Ujhhgtgfeyxiexzf(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg, boolean z) {
        C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtg = this.f3298Ujhhgtgfeyxiexzf;
        if (c0828feyxiexzfUjhhgtg != null) {
            SparseArray sparseArray = c0828feyxiexzfUjhhgtg.f3285Ujhhgtgfeyxiexzf;
            Set set = c0828feyxiexzfUjhhgtg.f3287Ujhhgtgfeyxiexzf;
            set.remove(abstractC0795feyxiexzfUjhhgtg);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C0829feyxiexzfUjhhgtg) sparseArray.get(sparseArray.keyAt(i))).f3288Ujhhgtgfeyxiexzf;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC3612feyxiexzfUjhhgtg.m5233Ujhhgtgfeyxiexzf(((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i2)).f3241Ujhhgtgfeyxiexzf);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m2234Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f3294Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2235Ujhhgtgfeyxiexzf(size);
        }
        arrayList.clear();
        if (RecyclerView.f353feyxiexzfUjhhgtg) {
            C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf = this.f3299Ujhhgtgfeyxiexzf.f411feyxiexzfUjhhgtg;
            int[] iArr = c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf = 0;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m2235Ujhhgtgfeyxiexzf(int i) {
        if (RecyclerView.f349feyxiexzfUjhhgtg) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f3294Ujhhgtgfeyxiexzf;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i);
        if (RecyclerView.f349feyxiexzfUjhhgtg) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC0821feyxiexzfUjhhgtg);
        }
        m2229Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m2236Ujhhgtgfeyxiexzf(View view) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        boolean zM2181Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf();
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        if (zM2181Ujhhgtgfeyxiexzf) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2180Ujhhgtgfeyxiexzf()) {
            abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3254Ujhhgtgfeyxiexzf.m2240Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
        } else if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2187Ujhhgtgfeyxiexzf()) {
            abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -33;
        }
        m2237Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
        if (recyclerView.f395feyxiexzfUjhhgtg == null || abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2178Ujhhgtgfeyxiexzf()) {
            return;
        }
        recyclerView.f395feyxiexzfUjhhgtg.mo2127Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[LOOP:2: B:51:0x00a6->B:55:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b4 A[EDGE_INSN: B:84:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b4 A[EDGE_INSN: B:85:0x00b4->B:56:0x00b4 BREAK  A[LOOP:1: B:47:0x0093->B:54:0x00ae, LOOP_LABEL: LOOP:1: B:47:0x0093->B:54:0x00ae], SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2237Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf = recyclerView.f411feyxiexzfUjhhgtg;
        boolean zM2180Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.m2180Ujhhgtgfeyxiexzf();
        View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
        boolean z3 = false;
        boolean z4 = true;
        if (zM2180Ujhhgtgfeyxiexzf || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0821feyxiexzfUjhhgtg.m2180Ujhhgtgfeyxiexzf());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m223feyxiexzfUjhhgtg());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0821feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC0821feyxiexzfUjhhgtg);
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb2));
        }
        if (abstractC0821feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC0821feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf & 16) == 0) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z5 = RecyclerView.f348feyxiexzfUjhhgtg;
        ArrayList arrayList = this.f3294Ujhhgtgfeyxiexzf;
        if (z5 && arrayList.contains(abstractC0821feyxiexzfUjhhgtg)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC0821feyxiexzfUjhhgtg);
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb3));
        }
        if (abstractC0821feyxiexzfUjhhgtg.m2178Ujhhgtgfeyxiexzf()) {
            if (this.f3297Ujhhgtgfeyxiexzf <= 0 || (abstractC0821feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f3297Ujhhgtgfeyxiexzf && size > 0) {
                    m2235Ujhhgtgfeyxiexzf(0);
                    size--;
                }
                if (RecyclerView.f353feyxiexzfUjhhgtg && size > 0) {
                    int i5 = abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf;
                    if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf != null) {
                        int i6 = c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i)).f3243Ujhhgtgfeyxiexzf;
                                    if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf != null) {
                                        break;
                                    }
                                    i3 = c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i)).f3243Ujhhgtgfeyxiexzf;
                            if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf != null) {
                                break;
                                break;
                            }
                            i3 = c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf[i4] == i2) {
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
                arrayList.add(size, abstractC0821feyxiexzfUjhhgtg);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                m2229Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m223feyxiexzfUjhhgtg());
            }
            z4 = false;
        }
        recyclerView.f363Ujhhgtgfeyxiexzf.m3374Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        if (z3 || z4 || !z) {
            return;
        }
        AbstractC3612feyxiexzfUjhhgtg.m5233Ujhhgtgfeyxiexzf(view);
        abstractC0821feyxiexzfUjhhgtg.f3259Ujhhgtgfeyxiexzf = null;
        abstractC0821feyxiexzfUjhhgtg.f3258Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2238Ujhhgtgfeyxiexzf(View view) {
        AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        int i = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf & 12;
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        if (i == 0 && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2182Ujhhgtgfeyxiexzf() && (abstractC0793feyxiexzfUjhhgtg = recyclerView.f395feyxiexzfUjhhgtg) != null) {
            C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = (C3116Ujhhgtgfeyxiexzf) abstractC0793feyxiexzfUjhhgtg;
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2174Ujhhgtgfeyxiexzf().isEmpty() && c3116Ujhhgtgfeyxiexzf.f9682Ujhhgtgfeyxiexzf && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf()) {
                if (this.f3293Ujhhgtgfeyxiexzf == null) {
                    this.f3293Ujhhgtgfeyxiexzf = new ArrayList();
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3254Ujhhgtgfeyxiexzf = this;
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3255Ujhhgtgfeyxiexzf = true;
                this.f3293Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                return;
            }
        }
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() && !recyclerView.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3254Ujhhgtgfeyxiexzf = this;
        abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3255Ujhhgtgfeyxiexzf = false;
        this.f3292Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final AbstractC0821feyxiexzfUjhhgtg m2239Ujhhgtgfeyxiexzf(int i, long j) {
        boolean z;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg;
        boolean z5;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg;
        C0820feyxiexzfUjhhgtg c0820feyxiexzfUjhhgtg;
        View.AccessibilityDelegate accessibilityDelegateM3256Ujhhgtgfeyxiexzf;
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg;
        boolean z8;
        RecyclerView recyclerViewM203feyxiexzfUjhhgtg;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2;
        ArrayList arrayList2;
        View view;
        boolean z9;
        int size;
        int iM4480Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3299Ujhhgtgfeyxiexzf;
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = recyclerView.f412feyxiexzfUjhhgtg;
        if (i < 0 || i >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() + recyclerView.m223feyxiexzfUjhhgtg());
        }
        if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            ArrayList arrayList3 = this.f3293Ujhhgtgfeyxiexzf;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (recyclerView.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf && (iM4480Ujhhgtgfeyxiexzf = recyclerView.f361Ujhhgtgfeyxiexzf.m4480Ujhhgtgfeyxiexzf(i, 0)) > 0 && iM4480Ujhhgtgfeyxiexzf < recyclerView.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf()) {
                            long jMo2135Ujhhgtgfeyxiexzf = recyclerView.f369Ujhhgtgfeyxiexzf.mo2135Ujhhgtgfeyxiexzf(iM4480Ujhhgtgfeyxiexzf);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                                    break;
                                }
                                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg3 = (AbstractC0821feyxiexzfUjhhgtg) this.f3293Ujhhgtgfeyxiexzf.get(i3);
                                if (!abstractC0821feyxiexzfUjhhgtg3.m2187Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtg3.f3245Ujhhgtgfeyxiexzf == jMo2135Ujhhgtgfeyxiexzf) {
                                    abstractC0821feyxiexzfUjhhgtg3.m2170Ujhhgtgfeyxiexzf(32);
                                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg3;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                            break;
                        }
                    } else {
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = (AbstractC0821feyxiexzfUjhhgtg) this.f3293Ujhhgtgfeyxiexzf.get(i2);
                        if (!abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2187Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf() == i) {
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2170Ujhhgtgfeyxiexzf(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                break;
            }
            z = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf != null;
        } else {
            z = false;
            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
        }
        ArrayList arrayList4 = this.f3292Ujhhgtgfeyxiexzf;
        ArrayList arrayList5 = this.f3294Ujhhgtgfeyxiexzf;
        if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf == null) {
            int size2 = arrayList4.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ArrayList arrayList6 = (ArrayList) recyclerView.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf;
                    int size3 = arrayList6.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            z2 = true;
                            view = null;
                            break;
                        }
                        view = (View) arrayList6.get(i5);
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
                        z2 = true;
                        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2173Ujhhgtgfeyxiexzf() == i && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = arrayList5.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                                break;
                            }
                            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg4 = (AbstractC0821feyxiexzfUjhhgtg) arrayList5.get(i6);
                            if (!abstractC0821feyxiexzfUjhhgtg4.m2177Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtg4.m2173Ujhhgtgfeyxiexzf() == i && !abstractC0821feyxiexzfUjhhgtg4.m2175Ujhhgtgfeyxiexzf()) {
                                arrayList5.remove(i6);
                                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC0821feyxiexzfUjhhgtg4);
                                }
                                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg4;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 = RecyclerView.m204feyxiexzfUjhhgtg(view);
                        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = recyclerView.f362Ujhhgtgfeyxiexzf;
                        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = (C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf;
                        int iIndexOfChild = ((C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!c2816Ujhhgtgfeyxiexzf.m4147Ujhhgtgfeyxiexzf(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c2816Ujhhgtgfeyxiexzf.m4144Ujhhgtgfeyxiexzf(iIndexOfChild);
                        c2790feyxiexzfUjhhgtg.m4089Ujhhgtgfeyxiexzf(view);
                        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg2 = recyclerView.f362Ujhhgtgfeyxiexzf;
                        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf2 = (C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg2.f8835Ujhhgtgfeyxiexzf;
                        int iIndexOfChild2 = ((C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg2.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.indexOfChild(view);
                        int iM4145Ujhhgtgfeyxiexzf = (iIndexOfChild2 == -1 || c2816Ujhhgtgfeyxiexzf2.m4147Ujhhgtgfeyxiexzf(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c2816Ujhhgtgfeyxiexzf2.m4145Ujhhgtgfeyxiexzf(iIndexOfChild2);
                        if (iM4145Ujhhgtgfeyxiexzf == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
                            throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb));
                        }
                        recyclerView.f362Ujhhgtgfeyxiexzf.m4076Ujhhgtgfeyxiexzf(iM4145Ujhhgtgfeyxiexzf);
                        m2238Ujhhgtgfeyxiexzf(view);
                        abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.m2170Ujhhgtgfeyxiexzf(8224);
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2;
                        break;
                    }
                } else {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg5 = (AbstractC0821feyxiexzfUjhhgtg) arrayList4.get(i4);
                    if (!abstractC0821feyxiexzfUjhhgtg5.m2187Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtg5.m2173Ujhhgtgfeyxiexzf() == i && !abstractC0821feyxiexzfUjhhgtg5.m2177Ujhhgtgfeyxiexzf() && (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || !abstractC0821feyxiexzfUjhhgtg5.m2179Ujhhgtgfeyxiexzf())) {
                        abstractC0821feyxiexzfUjhhgtg5.m2170Ujhhgtgfeyxiexzf(32);
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg5;
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf != null) {
                if (!abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf()) {
                    int i7 = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf;
                    if (i7 < 0 || i7 >= recyclerView.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                        throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb2));
                    }
                    if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || recyclerView.f369Ujhhgtgfeyxiexzf.mo2136Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf) == abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf) {
                        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg2 = recyclerView.f369Ujhhgtgfeyxiexzf;
                        if (!abstractC0795feyxiexzfUjhhgtg2.f3112Ujhhgtgfeyxiexzf || abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3245Ujhhgtgfeyxiexzf == abstractC0795feyxiexzfUjhhgtg2.mo2135Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf)) {
                            z9 = z2;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    if (RecyclerView.f348feyxiexzfUjhhgtg && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z9 = c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf;
                }
                if (z9) {
                    z = z2;
                } else {
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2170Ujhhgtgfeyxiexzf(4);
                    if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2180Ujhhgtgfeyxiexzf()) {
                        recyclerView.removeDetachedView(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf, false);
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3254Ujhhgtgfeyxiexzf.m2240Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                    } else if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2187Ujhhgtgfeyxiexzf()) {
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf &= -33;
                    }
                    m2237Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                }
            }
        } else {
            z2 = true;
        }
        if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf == null) {
            int iM4480Ujhhgtgfeyxiexzf2 = recyclerView.f361Ujhhgtgfeyxiexzf.m4480Ujhhgtgfeyxiexzf(i, 0);
            if (iM4480Ujhhgtgfeyxiexzf2 >= 0) {
                j2 = 3;
                if (iM4480Ujhhgtgfeyxiexzf2 < recyclerView.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf()) {
                    int iMo2136Ujhhgtgfeyxiexzf = recyclerView.f369Ujhhgtgfeyxiexzf.mo2136Ujhhgtgfeyxiexzf(iM4480Ujhhgtgfeyxiexzf2);
                    AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg3 = recyclerView.f369Ujhhgtgfeyxiexzf;
                    j3 = 4;
                    if (abstractC0795feyxiexzfUjhhgtg3.f3112Ujhhgtgfeyxiexzf) {
                        long jMo2135Ujhhgtgfeyxiexzf2 = abstractC0795feyxiexzfUjhhgtg3.mo2135Ujhhgtgfeyxiexzf(iM4480Ujhhgtgfeyxiexzf2);
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        abstractC0821feyxiexzfUjhhgtg2 = (AbstractC0821feyxiexzfUjhhgtg) arrayList5.get(size6);
                                        if (abstractC0821feyxiexzfUjhhgtg2.f3245Ujhhgtgfeyxiexzf != jMo2135Ujhhgtgfeyxiexzf2 || abstractC0821feyxiexzfUjhhgtg2.m2175Ujhhgtgfeyxiexzf()) {
                                            size6--;
                                        } else if (iMo2136Ujhhgtgfeyxiexzf == abstractC0821feyxiexzfUjhhgtg2.f3246Ujhhgtgfeyxiexzf) {
                                            arrayList5.remove(size6);
                                        } else {
                                            m2235Ujhhgtgfeyxiexzf(size6);
                                        }
                                    }
                                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = null;
                                    break;
                                }
                            }
                            abstractC0821feyxiexzfUjhhgtg2 = (AbstractC0821feyxiexzfUjhhgtg) arrayList4.get(size5);
                            ArrayList arrayList7 = arrayList4;
                            long j5 = abstractC0821feyxiexzfUjhhgtg2.f3245Ujhhgtgfeyxiexzf;
                            View view2 = abstractC0821feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                            if (j5 != jMo2135Ujhhgtgfeyxiexzf2 || abstractC0821feyxiexzfUjhhgtg2.m2187Ujhhgtgfeyxiexzf()) {
                                arrayList2 = arrayList7;
                            } else if (iMo2136Ujhhgtgfeyxiexzf == abstractC0821feyxiexzfUjhhgtg2.f3246Ujhhgtgfeyxiexzf) {
                                abstractC0821feyxiexzfUjhhgtg2.m2170Ujhhgtgfeyxiexzf(32);
                                if (abstractC0821feyxiexzfUjhhgtg2.m2179Ujhhgtgfeyxiexzf() && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                                    abstractC0821feyxiexzfUjhhgtg2.f3250Ujhhgtgfeyxiexzf = (abstractC0821feyxiexzfUjhhgtg2.f3250Ujhhgtgfeyxiexzf & (-15)) | 2;
                                }
                            } else {
                                arrayList2 = arrayList7;
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 = RecyclerView.m204feyxiexzfUjhhgtg(view2);
                                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3254Ujhhgtgfeyxiexzf = null;
                                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3255Ujhhgtgfeyxiexzf = false;
                                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3250Ujhhgtgfeyxiexzf &= -33;
                                m2237Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3);
                            }
                            size5--;
                            arrayList4 = arrayList2;
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg2;
                            break;
                        }
                        if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf != null) {
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf = iM4480Ujhhgtgfeyxiexzf2;
                            z = z2;
                        }
                    }
                    if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf == null) {
                        if (RecyclerView.f349feyxiexzfUjhhgtg) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        C0829feyxiexzfUjhhgtg c0829feyxiexzfUjhhgtg = (C0829feyxiexzfUjhhgtg) m2231Ujhhgtgfeyxiexzf().f3285Ujhhgtgfeyxiexzf.get(iMo2136Ujhhgtgfeyxiexzf);
                        if (c0829feyxiexzfUjhhgtg == null) {
                            abstractC0821feyxiexzfUjhhgtg = null;
                            break;
                        }
                        ArrayList arrayList8 = c0829feyxiexzfUjhhgtg.f3288Ujhhgtgfeyxiexzf;
                        if (!arrayList8.isEmpty()) {
                            int size7 = arrayList8.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    abstractC0821feyxiexzfUjhhgtg = null;
                                    break;
                                }
                                if (!((AbstractC0821feyxiexzfUjhhgtg) arrayList8.get(size7)).m2175Ujhhgtgfeyxiexzf()) {
                                    abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList8.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            abstractC0821feyxiexzfUjhhgtg = null;
                            break;
                        }
                        if (abstractC0821feyxiexzfUjhhgtg != null) {
                            abstractC0821feyxiexzfUjhhgtg.m2184Ujhhgtgfeyxiexzf();
                            boolean z10 = RecyclerView.f348feyxiexzfUjhhgtg;
                        }
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg;
                    }
                    if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j6 = this.f3298Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(iMo2136Ujhhgtgfeyxiexzf).f3290Ujhhgtgfeyxiexzf;
                            if (!((j6 == 0 || j6 + nanoTime2 < j) ? z2 : false)) {
                                return null;
                            }
                        }
                        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg4 = recyclerView.f369Ujhhgtgfeyxiexzf;
                        abstractC0795feyxiexzfUjhhgtg4.getClass();
                        try {
                            if (AbstractC1761feyxiexzfUjhhgtg.m3055Ujhhgtgfeyxiexzf()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo2136Ujhhgtgfeyxiexzf)));
                            }
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg4.mo2141Ujhhgtgfeyxiexzf(recyclerView, iMo2136Ujhhgtgfeyxiexzf);
                            View view3 = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf = iMo2136Ujhhgtgfeyxiexzf;
                            Trace.endSection();
                            if (RecyclerView.f353feyxiexzfUjhhgtg && (recyclerViewM203feyxiexzfUjhhgtg = RecyclerView.m203feyxiexzfUjhhgtg(view3)) != null) {
                                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3242Ujhhgtgfeyxiexzf = new WeakReference(recyclerViewM203feyxiexzfUjhhgtg);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            C0829feyxiexzfUjhhgtg c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf = this.f3298Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(iMo2136Ujhhgtgfeyxiexzf);
                            long j7 = c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf.f3290Ujhhgtgfeyxiexzf;
                            if (j7 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j7 / 4) * 3);
                            }
                            c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf.f3290Ujhhgtgfeyxiexzf = nanoTime3;
                            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM4480Ujhhgtgfeyxiexzf2 + ").state:" + c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() + recyclerView.m223feyxiexzfUjhhgtg());
        }
        j2 = 3;
        j3 = 4;
        View view4 = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
        if (z && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            int i8 = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf;
            if ((i8 & 8192) != 0 ? z2 : false) {
                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf = i8 & (-8193);
                if (c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf) {
                    AbstractC0793feyxiexzfUjhhgtg.m2124Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                    AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = recyclerView.f395feyxiexzfUjhhgtg;
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2174Ujhhgtgfeyxiexzf();
                    abstractC0793feyxiexzfUjhhgtg.getClass();
                    C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = new C0431Ujhhgtgfeyxiexzf();
                    c0431Ujhhgtgfeyxiexzf.m1756Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                    recyclerView.m245Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf, c0431Ujhhgtgfeyxiexzf);
                }
            }
        }
        if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || !abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2176Ujhhgtgfeyxiexzf()) {
            if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2176Ujhhgtgfeyxiexzf()) {
                if (((abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf & 2) != 0 ? z2 : false) || abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2177Ujhhgtgfeyxiexzf()) {
                }
                layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 == null) {
                    c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) layoutParams2;
                } else {
                    c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateLayoutParams(layoutParams2);
                    view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
                }
                c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
                if (z || !z3) {
                    z8 = false;
                } else {
                    z8 = z7;
                }
                c0825feyxiexzfUjhhgtg.f3282Ujhhgtgfeyxiexzf = z8;
                return abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
            }
            if (RecyclerView.f348feyxiexzfUjhhgtg && abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(recyclerView, sb3));
            }
            z3 = false;
            int iM4480Ujhhgtgfeyxiexzf3 = recyclerView.f361Ujhhgtgfeyxiexzf.m4480Ujhhgtgfeyxiexzf(i, 0);
            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3259Ujhhgtgfeyxiexzf = null;
            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3258Ujhhgtgfeyxiexzf = recyclerView;
            int i9 = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j8 = this.f3298Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(i9).f3291Ujhhgtgfeyxiexzf;
                if (j8 == 0 || j8 + nanoTime4 < j) {
                    if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2181Ujhhgtgfeyxiexzf()) {
                        recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    abstractC0795feyxiexzfUjhhgtg = recyclerView.f369Ujhhgtgfeyxiexzf;
                    abstractC0795feyxiexzfUjhhgtg.getClass();
                    if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3259Ujhhgtgfeyxiexzf == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf = iM4480Ujhhgtgfeyxiexzf3;
                        if (abstractC0795feyxiexzfUjhhgtg.f3112Ujhhgtgfeyxiexzf) {
                            abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3245Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg.mo2135Ujhhgtgfeyxiexzf(iM4480Ujhhgtgfeyxiexzf3);
                        }
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf = (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf & (-520)) | 1;
                        if (AbstractC1761feyxiexzfUjhhgtg.m3055Ujhhgtgfeyxiexzf()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf)));
                        }
                    }
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3259Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg;
                    if (RecyclerView.f348feyxiexzfUjhhgtg) {
                        if (view4.getParent() != null && view4.isAttachedToWindow() != abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2181Ujhhgtgfeyxiexzf()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2181Ujhhgtgfeyxiexzf() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                        }
                        if (view4.getParent() == null && view4.isAttachedToWindow()) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                        }
                    }
                    abstractC0795feyxiexzfUjhhgtg.mo2140Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf, iM4480Ujhhgtgfeyxiexzf3, abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2174Ujhhgtgfeyxiexzf());
                    if (z5) {
                        arrayList = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3251Ujhhgtgfeyxiexzf;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf &= -1025;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams instanceof C0825feyxiexzfUjhhgtg) {
                            ((C0825feyxiexzfUjhhgtg) layoutParams).f3281Ujhhgtgfeyxiexzf = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view4);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C0829feyxiexzfUjhhgtg c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf2 = this.f3298Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf);
                    j4 = c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf2.f3291Ujhhgtgfeyxiexzf;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf2.f3291Ujhhgtgfeyxiexzf = nanoTime;
                    accessibilityManager = recyclerView.f384feyxiexzfUjhhgtg;
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
                        c0816feyxiexzfUjhhgtg = recyclerView.f419Ujhhgtgfeyxiexzf;
                        if (c0816feyxiexzfUjhhgtg != null) {
                            c0820feyxiexzfUjhhgtg = c0816feyxiexzfUjhhgtg.f3229Ujhhgtgfeyxiexzf;
                            if (c0820feyxiexzfUjhhgtg != null) {
                                accessibilityDelegateM3256Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3256Ujhhgtgfeyxiexzf(view4);
                                if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf == null) {
                                    c2949feyxiexzfUjhhgtg = null;
                                } else if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf instanceof C2948feyxiexzfUjhhgtg) {
                                    c2949feyxiexzfUjhhgtg = ((C2948feyxiexzfUjhhgtg) accessibilityDelegateM3256Ujhhgtgfeyxiexzf).f9249Ujhhgtgfeyxiexzf;
                                } else {
                                    c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg(accessibilityDelegateM3256Ujhhgtgfeyxiexzf);
                                }
                                if (c2949feyxiexzfUjhhgtg != null && c2949feyxiexzfUjhhgtg != c0820feyxiexzfUjhhgtg) {
                                    c0820feyxiexzfUjhhgtg.f3239Ujhhgtgfeyxiexzf.put(view4, c2949feyxiexzfUjhhgtg);
                                }
                            }
                            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(view4, c0820feyxiexzfUjhhgtg);
                        }
                    } else {
                        z7 = true;
                    }
                    if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3247Ujhhgtgfeyxiexzf = i;
                    }
                    z3 = z7;
                } else {
                    z7 = z2;
                }
            } else {
                if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2181Ujhhgtgfeyxiexzf()) {
                    recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                abstractC0795feyxiexzfUjhhgtg = recyclerView.f369Ujhhgtgfeyxiexzf;
                abstractC0795feyxiexzfUjhhgtg.getClass();
                if (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3259Ujhhgtgfeyxiexzf == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3243Ujhhgtgfeyxiexzf = iM4480Ujhhgtgfeyxiexzf3;
                    if (abstractC0795feyxiexzfUjhhgtg.f3112Ujhhgtgfeyxiexzf) {
                        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3245Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg.mo2135Ujhhgtgfeyxiexzf(iM4480Ujhhgtgfeyxiexzf3);
                    }
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf = (abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf & (-520)) | 1;
                    if (AbstractC1761feyxiexzfUjhhgtg.m3055Ujhhgtgfeyxiexzf()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf)));
                    }
                }
                abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3259Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg;
                if (RecyclerView.f348feyxiexzfUjhhgtg) {
                    if (view4.getParent() != null) {
                    }
                    if (view4.getParent() == null) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf);
                    }
                }
                abstractC0795feyxiexzfUjhhgtg.mo2140Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf, iM4480Ujhhgtgfeyxiexzf3, abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.m2174Ujhhgtgfeyxiexzf());
                if (z5) {
                    arrayList = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3251Ujhhgtgfeyxiexzf;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3250Ujhhgtgfeyxiexzf &= -1025;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams instanceof C0825feyxiexzfUjhhgtg) {
                        ((C0825feyxiexzfUjhhgtg) layoutParams).f3281Ujhhgtgfeyxiexzf = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view4);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                C0829feyxiexzfUjhhgtg c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf3 = this.f3298Ujhhgtgfeyxiexzf.m2228Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3246Ujhhgtgfeyxiexzf);
                j4 = c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf3.f3291Ujhhgtgfeyxiexzf;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                c0829feyxiexzfUjhhgtgM2228Ujhhgtgfeyxiexzf3.f3291Ujhhgtgfeyxiexzf = nanoTime;
                accessibilityManager = recyclerView.f384feyxiexzfUjhhgtg;
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
                    c0816feyxiexzfUjhhgtg = recyclerView.f419Ujhhgtgfeyxiexzf;
                    if (c0816feyxiexzfUjhhgtg != null) {
                        c0820feyxiexzfUjhhgtg = c0816feyxiexzfUjhhgtg.f3229Ujhhgtgfeyxiexzf;
                        if (c0820feyxiexzfUjhhgtg != null) {
                            accessibilityDelegateM3256Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3256Ujhhgtgfeyxiexzf(view4);
                            if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf == null) {
                                c2949feyxiexzfUjhhgtg = null;
                            } else if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf instanceof C2948feyxiexzfUjhhgtg) {
                                c2949feyxiexzfUjhhgtg = ((C2948feyxiexzfUjhhgtg) accessibilityDelegateM3256Ujhhgtgfeyxiexzf).f9249Ujhhgtgfeyxiexzf;
                            } else {
                                c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg(accessibilityDelegateM3256Ujhhgtgfeyxiexzf);
                            }
                            if (c2949feyxiexzfUjhhgtg != null) {
                                c0820feyxiexzfUjhhgtg.f3239Ujhhgtgfeyxiexzf.put(view4, c2949feyxiexzfUjhhgtg);
                            }
                        }
                        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(view4, c0820feyxiexzfUjhhgtg);
                    }
                } else {
                    z7 = true;
                }
                if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                    abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3247Ujhhgtgfeyxiexzf = i;
                }
                z3 = z7;
            }
            layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateLayoutParams(layoutParams2);
                view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
            } else {
                c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) layoutParams2;
            }
            c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
            if (z) {
                z8 = false;
            } else {
                z8 = false;
            }
            c0825feyxiexzfUjhhgtg.f3282Ujhhgtgfeyxiexzf = z8;
            return abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
        }
        abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf.f3247Ujhhgtgfeyxiexzf = i;
        z7 = z2;
        z3 = false;
        layoutParams2 = view4.getLayoutParams();
        if (layoutParams2 == null) {
            c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) recyclerView.generateLayoutParams(layoutParams2);
            view4.setLayoutParams(c0825feyxiexzfUjhhgtg);
        } else {
            c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) layoutParams2;
        }
        c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
        if (z) {
            z8 = false;
        } else {
            z8 = false;
        }
        c0825feyxiexzfUjhhgtg.f3282Ujhhgtgfeyxiexzf = z8;
        return abstractC0821feyxiexzfUjhhgtgMo2141Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2240Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        if (abstractC0821feyxiexzfUjhhgtg.f3255Ujhhgtgfeyxiexzf) {
            this.f3293Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg);
        } else {
            this.f3292Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg);
        }
        abstractC0821feyxiexzfUjhhgtg.f3254Ujhhgtgfeyxiexzf = null;
        abstractC0821feyxiexzfUjhhgtg.f3255Ujhhgtgfeyxiexzf = false;
        abstractC0821feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -33;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m2241Ujhhgtgfeyxiexzf() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f3299Ujhhgtgfeyxiexzf.f370Ujhhgtgfeyxiexzf;
        this.f3297Ujhhgtgfeyxiexzf = this.f3296Ujhhgtgfeyxiexzf + (abstractC0822feyxiexzfUjhhgtg != null ? abstractC0822feyxiexzfUjhhgtg.f3269Ujhhgtgfeyxiexzf : 0);
        ArrayList arrayList = this.f3294Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3297Ujhhgtgfeyxiexzf; size--) {
            m2235Ujhhgtgfeyxiexzf(size);
        }
    }
}
