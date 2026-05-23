package p000;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1959 implements View.OnClickListener {

    public final /* synthetic */ int f6476;

    public final /* synthetic */ C1961 f6477;

    public /* synthetic */ ViewOnClickListenerC1959(C1961 c1961, int i) {
        this.f6476 = i;
        this.f6477 = c1961;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6476;
        C1961 c1961 = this.f6477;
        switch (i) {
            case 0:
                C1962 c1962 = c1961.f6495;
                
                EditText editText = c1961.f6488;
                if (editText != null) {
                    c1962.m757(editText, false);
                }
                
                if (view != null) {
                    AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                    view.performHapticFeedback(3);
                }
                InterfaceC0377 interfaceC0377 = c1962.f6508;
                if (interfaceC0377 == null) {
                    c1961.m3786(view);
                } else if (interfaceC0377 instanceof C2297) {
                    String string = editText != null ? editText.getText().toString() : "";
                    C2297 c2297 = (C2297) c1962.f6508;
                    C1962 c1963 = c1962.f6498;
                    
                    C2297.m4163(c1963, string);
                    c1961.m3786(view);
                } else if (interfaceC0377 instanceof C2005) {
                    ((C2005) interfaceC0377).m3865(c1962.f6498);
                    c1961.m3786(view);
                }
                break;
            case 1:
                C1962 c1964 = c1961.f6495;
                
                EditText editText2 = c1961.f6488;
                if (editText2 != null) {
                    c1964.m757(editText2, false);
                }
                
                if (view != null) {
                    AbstractC2205 abstractC2206 = AbstractC1034.f3778;
                    view.performHapticFeedback(3);
                }
                C2005 c2005 = c1964.f6509;
                if (c2005 == null) {
                    c1961.m3786(view);
                } else {
                    c2005.m3865(c1964.f6498);
                    c1961.m3786(view);
                }
                break;
            case 2:
                C1962 c1965 = c1961.f6495;
                
                EditText editText3 = c1961.f6488;
                if (editText3 != null) {
                    c1965.m757(editText3, false);
                }
                
                if (view != null) {
                    AbstractC2205 abstractC2207 = AbstractC1034.f3778;
                    view.performHapticFeedback(3);
                }
                C2005 c2006 = c1965.f6510;
                if (c2006 == null) {
                    c1961.m3786(view);
                } else {
                    c2006.m3865(c1965.f6498);
                    c1961.m3786(view);
                }
                break;
            default:
                
                c1961.m3786(view);
                break;
        }
    }
}
