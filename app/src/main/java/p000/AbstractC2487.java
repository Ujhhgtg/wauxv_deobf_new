package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2487 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2481 f7929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f7930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f7931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f7932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f7933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f7934;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4446(AbstractC2508 abstractC2508) {
        int i = abstractC2508.f8015;
        if (!abstractC2508.m4516() && (i & 4) == 0) {
            abstractC2508.m4510();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract boolean mo2565(AbstractC2508 abstractC2508, AbstractC2508 abstractC2509, C2139 c2139, C2139 c21310);

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007e, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4447(AbstractC2508 abstractC2508) {
        C2481 c2481 = this.f7929;
        if (c2481 != null) {
            RecyclerView recyclerView = c2481.f7925;
            boolean z = true;
            abstractC2508.m4524(true);
            View view = abstractC2508.f8006;
            if (abstractC2508.f8013 != null && abstractC2508.f8014 == null) {
                abstractC2508.f8013 = null;
            }
            abstractC2508.f8014 = null;
            if ((abstractC2508.f8015 & 16) != 0) {
                return;
            }
            C2498 c2498 = recyclerView.f358;
            recyclerView.m257();
            C0575 c0575 = recyclerView.f361;
            C0689 c0689 = (C0689) c0575.f2344;
            C2481 c2482 = (C2481) c0575.f2343;
            int i = c0575.f2342;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0575.f2342 = 2;
                    int iIndexOfChild = c2482.f7925.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c0575.m1999(view);
                    } else if (c0689.m2073(iIndexOfChild)) {
                        c0689.m2075(iIndexOfChild);
                        c0575.m1999(view);
                        c2482.m4440(iIndexOfChild);
                    } else {
                        c0575.f2342 = 0;
                    }
                    c0575.f2342 = 0;
                    if (true) {
                        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
                        c2498.m4501(abstractC2508M204);
                        c2498.m4498(abstractC2508M204);
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m259(false);
                    if (true && abstractC2508.m4520()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    c0575.f2342 = 0;
                    throw th;
                }
            }
            if (((View) c0575.f2346) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z = false;
            if (false) {
                AbstractC2508 abstractC2508M205 = RecyclerView.m204(view);
                c2498.m4501(abstractC2508M205);
                c2498.m4498(abstractC2508M205);
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.m259(true);
            if (false) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo2566(AbstractC2508 abstractC2508);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public abstract void mo2567();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract boolean mo2568();
}
