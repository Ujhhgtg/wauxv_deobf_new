package p000;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᛸᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1182 extends AbstractC1146 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4316 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final WeakReference f4317;

    public C1182(EditText editText) {
        this.f4317 = new WeakReference(editText);
    }

    @Override // p000.AbstractC1146
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo2895() {
        switch (this.f4316) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f4317.get();
                if (switchCompat != null) {
                    switchCompat.m29();
                }
                break;
        }
    }

    @Override // p000.AbstractC1146
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2896() throws Throwable {
        switch (this.f4316) {
            case 0:
                C1183.m2914((EditText) this.f4317.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f4317.get();
                if (switchCompat != null) {
                    switchCompat.m29();
                }
                break;
        }
    }

    public C1182(SwitchCompat switchCompat) {
        this.f4317 = new WeakReference(switchCompat);
    }
}
