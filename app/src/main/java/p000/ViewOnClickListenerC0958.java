package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0958 implements View.OnClickListener {

    public final /* synthetic */ int f3483;

    public final /* synthetic */ InterfaceC1425 f3484;

    public /* synthetic */ ViewOnClickListenerC0958(InterfaceC1425 interfaceC1425, int i) {
        this.f3483 = i;
        this.f3484 = interfaceC1425;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3483) {
            case 0:
                this.f3484.invoke(view);
                break;
            default:
                this.f3484.invoke(view);
                break;
        }
    }
}
