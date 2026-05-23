package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0691 extends AbstractC2209 {

    public final /* synthetic */ int f2577;

    public final /* synthetic */ Object f2578;

    public /* synthetic */ C0691(int i, Object obj) {
        this.f2577 = i;
        this.f2578 = obj;
    }

    @Override // p000.AbstractC2209
    public final void mo1936(int i) {
        switch (this.f2577) {
            case 0:
                break;
            default:
                C2907 c2907 = (C2907) this.f2578;
                c2907.f9353 = true;
                InterfaceC2906 interfaceC2906 = (InterfaceC2906) c2907.f9354.get();
                if (interfaceC2906 != null) {
                    interfaceC2906.mo1475();
                }
                break;
        }
    }

    @Override // p000.AbstractC2209
    public final void mo1937(Typeface typeface, boolean z) {
        switch (this.f2577) {
            case 0:
                Chip chip = (Chip) this.f2578;
                C0695 c0695 = chip.f685;
                chip.setText(c0695.f2641 ? c0695.f2591 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C2907 c2907 = (C2907) this.f2578;
                    c2907.f9353 = true;
                    InterfaceC2906 interfaceC2906 = (InterfaceC2906) c2907.f9354.get();
                    if (interfaceC2906 != null) {
                        interfaceC2906.mo1475();
                    }
                    break;
                }
                break;
        }
    }

    private final void m2078(int i) {
    }
}
