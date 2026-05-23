package p000;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1800 implements View.OnClickListener {

    public final /* synthetic */ int f6010;

    public final /* synthetic */ int f6011;

    public final /* synthetic */ FrameLayout f6012;

    public /* synthetic */ ViewOnClickListenerC1800(FrameLayout frameLayout, int i, int i2) {
        this.f6010 = i2;
        this.f6012 = frameLayout;
        this.f6011 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6010) {
            case 0:
                ((C1803) this.f6012).setSelectedTabIndex(this.f6011);
                break;
            default:
                InterfaceC1425 interfaceC1425 = ((AbstractC1966) this.f6012).f6527;
                if (interfaceC1425 != null) {
                    interfaceC1425.invoke(Integer.valueOf(this.f6011));
                }
                break;
        }
    }
}
