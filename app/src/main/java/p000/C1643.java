package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1643 extends C1962 {
    @Override // p000.C1962, com.kongzue.dialogx.interfaces.AbstractC0027
    public final String mo751() {
        return C1643.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // p000.C1962, com.kongzue.dialogx.interfaces.AbstractC0027
    public final void mo760() {
        EditText editText;
        if (m753() != null) {
            AbstractC0027.m733(m753());
            this.f916 = false;
        }
        RelativeLayout relativeLayout = this.f6511.f6487;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM752 = m752(m759()) != 0 ? m752(m759()) : this.f917.mo3726(m759());
        if (iM752 == 0) {
            iM752 = m759() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        C1961 c1961 = this.f6511;
        String string = (c1961 == null || (editText = c1961.f6488) == null) ? this.f6506 : editText.getText().toString();
        this.f919 = 0L;
        View viewM749 = m749(iM752);
        this.f6511 = new C1961(this, viewM749);
        if (viewM749 != null) {
            viewM749.setTag(this.f6498);
        }
        AbstractC0027.m746(viewM749);
        this.f6506 = string;
        m3790();
    }

    @Override // p000.C1962
    public final boolean mo3368() {
        return this.f915;
    }

    @Override // p000.C1962
    public final C1962 mo3369(C0466 c0466) {
        this.f912 = c0466;
        if (this.f916) {
            c0466.m1692(this);
        }
        return this;
    }
}
