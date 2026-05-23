package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2489 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2491 f7936;

    public /* synthetic */ C2489(AbstractC2491 abstractC2491, int i) {
        this.f7935 = i;
        this.f7936 = abstractC2491;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4448(View view) {
        int iM4458;
        int i;
        switch (this.f7935) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                iM4458 = AbstractC2491.m4458(view);
                i = ((ViewGroup.MarginLayoutParams) c2492).rightMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                iM4458 = AbstractC2491.m4454(view);
                i = ((ViewGroup.MarginLayoutParams) c2493).bottomMargin;
                break;
        }
        return iM4458 + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4449(View view) {
        int iM4455;
        int i;
        switch (this.f7935) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                iM4455 = AbstractC2491.m4455(view);
                i = ((ViewGroup.MarginLayoutParams) c2492).leftMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                iM4455 = AbstractC2491.m4459(view);
                i = ((ViewGroup.MarginLayoutParams) c2493).topMargin;
                break;
        }
        return iM4455 - i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m4450() {
        int i;
        int iM4471;
        switch (this.f7935) {
            case 0:
                AbstractC2491 abstractC2491 = this.f7936;
                i = abstractC2491.f7954;
                iM4471 = abstractC2491.m4471();
                break;
            default:
                AbstractC2491 abstractC2492 = this.f7936;
                i = abstractC2492.f7955;
                iM4471 = abstractC2492.m4469();
                break;
        }
        return i - iM4471;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m4451() {
        switch (this.f7935) {
            case 0:
                return this.f7936.m4470();
            default:
                return this.f7936.m4472();
        }
    }
}
