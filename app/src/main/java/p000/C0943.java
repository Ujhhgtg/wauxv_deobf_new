package p000;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0943 extends AbstractC0027 {

    public C2674 f3446;

    public C0943 f3447;

    public C0662 f3448;

    public int f3449;

    public int f3450;

    public int f3451;

    public int f3452;

    public boolean f3453;

    public C0942 f3454;

    public int f3455;

    public int f3456;

    @Override // com.kongzue.dialogx.interfaces.AbstractC0027
    public final String mo751() {
        return C0943.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0027
    public final void mo760() {
        MaxRelativeLayout maxRelativeLayout;
        if (m753() != null) {
            AbstractC0027.m733(m753());
            this.f916 = false;
        }
        C0662 c0662 = this.f3448;
        if (c0662 != null && (maxRelativeLayout = (MaxRelativeLayout) c0662.f2531) != null) {
            maxRelativeLayout.removeAllViews();
        }
        this.f919 = 0L;
        View viewM749 = m749(m752(m759()) != 0 ? m752(m759()) : R.layout.layout_dialogx_custom);
        this.f3448 = new C0662(this, viewM749);
        if (viewM749 != null) {
            viewM749.setTag(this.f3447);
        }
        AbstractC0027.m746(viewM749);
    }
}
