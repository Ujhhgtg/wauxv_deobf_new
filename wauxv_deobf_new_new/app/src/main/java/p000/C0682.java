package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᤝᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0682 extends AbstractC0738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f2576;

    public /* synthetic */ C0682(Object obj, int i) {
        this.f2575 = i;
        this.f2576 = obj;
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2031(int i) {
        switch (this.f2575) {
            case 0:
                break;
            default:
                C2966 c2966 = (C2966) this.f2576;
                c2966.f9520 = true;
                InterfaceC2965 interfaceC2965 = (InterfaceC2965) c2966.f9521.get();
                if (interfaceC2965 != null) {
                    interfaceC2965.mo1580();
                }
                break;
        }
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo2032(Typeface typeface, boolean z) {
        switch (this.f2575) {
            case 0:
                Chip chip = (Chip) this.f2576;
                C0686 c0686 = chip.f744;
                chip.setText(c0686.f2639 ? c0686.f2589 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C2966 c2966 = (C2966) this.f2576;
                    c2966.f9520 = true;
                    InterfaceC2965 interfaceC2965 = (InterfaceC2965) c2966.f9521.get();
                    if (interfaceC2965 != null) {
                        interfaceC2965.mo1580();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    private final void m2173(int i) {
    }
}
