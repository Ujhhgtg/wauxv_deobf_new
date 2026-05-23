package p000;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1180 extends AbstractC1140 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4319 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final WeakReference f4320;

    public C1180(EditText editText) {
        this.f4320 = new WeakReference(editText);
    }

    @Override // p000.AbstractC1140
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo2751() {
        switch (this.f4319) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f4320.get();
                if (switchCompat != null) {
                    switchCompat.m29();
                }
                break;
        }
    }

    @Override // p000.AbstractC1140
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2752() throws Throwable {
        switch (this.f4319) {
            case 0:
                C1181.m2770((EditText) this.f4320.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f4320.get();
                if (switchCompat != null) {
                    switchCompat.m29();
                }
                break;
        }
    }

    public C1180(SwitchCompat switchCompat) {
        this.f4320 = new WeakReference(switchCompat);
    }
}
