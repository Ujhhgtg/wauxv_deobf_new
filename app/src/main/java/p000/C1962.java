package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1962 extends AbstractC0027 {

    public C2006 f6497;

    public C0942 f6499;

    public C0466 f6500;

    public CharSequence f6501;

    public String f6502;

    public CharSequence f6503;

    public CharSequence f6504;

    public CharSequence f6505;

    public String f6506;

    public InterfaceC0377 f6508;

    public C2005 f6509;

    public C2005 f6510;

    public C1961 f6511;

    public final boolean f6496 = true;

    public final C1962 f6498 = this;

    public final float f6507 = AbstractC1034.f3780;

    @Override // com.kongzue.dialogx.interfaces.AbstractC0027
    public String mo751() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0027
    public void mo760() {
        if (m753() != null) {
            AbstractC0027.m733(m753());
            this.f916 = false;
        }
        RelativeLayout relativeLayout = this.f6511.f6487;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f6511.f6486;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        int iM752 = m752(m759()) != 0 ? m752(m759()) : this.f917.mo3726(m759());
        if (iM752 == 0) {
            iM752 = m759() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        this.f919 = 0L;
        View viewM749 = m749(iM752);
        this.f6511 = new C1961(this, viewM749);
        if (viewM749 != null) {
            viewM749.setTag(this.f6498);
        }
        AbstractC0027.m746(viewM749);
    }

    public final void m3789() {
        AbstractC0027.m745(new RunnableC1958(this, 1));
    }

    public boolean mo3368() {
        return this.f915;
    }

    public C1962 mo3369(C0466 c0466) {
        this.f912 = c0466;
        if (this.f916) {
            c0466.m1692(this);
        }
        return this;
    }

    public final void m3790() {
        if (this.f6511 == null) {
            return;
        }
        AbstractC0027.m745(new RunnableC1958(this, 0));
    }

    public final void m3791() {
        m748();
        if (m753() != null) {
            AbstractC0027.m746(m753());
            return;
        }
        int iM752 = m752(m759()) != 0 ? m752(m759()) : this.f917.mo3726(m759());
        if (iM752 == 0) {
            iM752 = m759() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        View viewM749 = m749(iM752);
        this.f6511 = new C1961(this, viewM749);
        if (viewM749 != null) {
            viewM749.setTag(this.f6498);
        }
        AbstractC0027.m746(viewM749);
    }
}
