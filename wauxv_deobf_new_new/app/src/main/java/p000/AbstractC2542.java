package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲁᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2542 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2536 f8080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f8081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f8082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f8083;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f8084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f8085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4468(AbstractC2563 abstractC2563) {
        int i = abstractC2563.f8166;
        if (!abstractC2563.m4538() && (i & 4) == 0) {
            abstractC2563.m4532();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract boolean mo2689(AbstractC2563 abstractC2563, AbstractC2563 abstractC2564, C2173 c2173, C2173 c2174);

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007e, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4469(AbstractC2563 abstractC2563) {
        C2536 c2536 = this.f8080;
        if (c2536 != null) {
            RecyclerView recyclerView = c2536.f8076;
            boolean z = true;
            abstractC2563.m4546(true);
            View view = abstractC2563.f8157;
            if (abstractC2563.f8164 != null && abstractC2563.f8165 == null) {
                abstractC2563.f8164 = null;
            }
            abstractC2563.f8165 = null;
            if ((abstractC2563.f8166 & 16) != 0) {
                return;
            }
            C2553 c2553 = recyclerView.f358;
            recyclerView.m257();
            C0552 c0552 = recyclerView.f361;
            C0680 c0680 = (C0680) c0552.f2306;
            C2536 c2537 = (C2536) c0552.f2305;
            int i = c0552.f2304;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0552.f2304 = 2;
                    int iIndexOfChild = c2537.f8076.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c0552.m2096(view);
                    } else if (c0680.m2168(iIndexOfChild)) {
                        c0680.m2170(iIndexOfChild);
                        c0552.m2096(view);
                        c2537.m4461(iIndexOfChild);
                    } else {
                        c0552.f2304 = 0;
                    }
                    c0552.f2304 = 0;
                    if (z) {
                        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
                        c2553.m4522(abstractC2563M204);
                        c2553.m4519(abstractC2563M204);
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m259(!z);
                    if (z && abstractC2563.m4542()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    c0552.f2304 = 0;
                    throw th;
                }
            }
            if (((View) c0552.f2308) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z = false;
            if (z) {
                AbstractC2563 abstractC2563M205 = RecyclerView.m204(view);
                c2553.m4522(abstractC2563M205);
                c2553.m4519(abstractC2563M205);
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.m259(!z);
            if (z) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo2690(AbstractC2563 abstractC2563);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public abstract void mo2691();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract boolean mo2692();
}
