package p000;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1990 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1992 f6582;

    public /* synthetic */ ViewOnClickListenerC1990(C1992 c1992, int i) {
        this.f6581 = i;
        this.f6582 = c1992;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6581;
        C1992 c1992 = this.f6582;
        switch (i) {
            case 0:
                C1993 c1993 = c1992.f6600;
                c1993.getClass();
                EditText editText = c1992.f6593;
                if (editText != null) {
                    c1993.m901(editText, false);
                }
                c1993.getClass();
                if (view != null) {
                    AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                    view.performHapticFeedback(3);
                }
                InterfaceC0352 interfaceC0352 = c1993.f6613;
                if (interfaceC0352 == null) {
                    c1992.m3980(view);
                } else if (interfaceC0352 instanceof C2330) {
                    String string = editText != null ? editText.getText().toString() : "";
                    C2330 c2330 = (C2330) c1993.f6613;
                    C1993 c1994 = c1993.f6603;
                    c2330.getClass();
                    C2330.m4292(c1994, string);
                    c1992.m3980(view);
                } else if (interfaceC0352 instanceof C2035) {
                    ((C2035) interfaceC0352).m4052(c1993.f6603);
                    c1992.m3980(view);
                }
                break;
            case 1:
                C1993 c1995 = c1992.f6600;
                c1995.getClass();
                EditText editText2 = c1992.f6593;
                if (editText2 != null) {
                    c1995.m901(editText2, false);
                }
                c1995.getClass();
                if (view != null) {
                    AbstractC1469 abstractC14610 = AbstractC1037.f3785;
                    view.performHapticFeedback(3);
                }
                C2035 c2035 = c1995.f6614;
                if (c2035 == null) {
                    c1992.m3980(view);
                } else {
                    c2035.m4052(c1995.f6603);
                    c1992.m3980(view);
                }
                break;
            case 2:
                C1993 c1996 = c1992.f6600;
                c1996.getClass();
                EditText editText3 = c1992.f6593;
                if (editText3 != null) {
                    c1996.m901(editText3, false);
                }
                c1996.getClass();
                if (view != null) {
                    AbstractC1469 abstractC14611 = AbstractC1037.f3785;
                    view.performHapticFeedback(3);
                }
                C2035 c2036 = c1996.f6615;
                if (c2036 == null) {
                    c1992.m3980(view);
                } else {
                    c2036.m4052(c1996.f6603);
                    c1992.m3980(view);
                }
                break;
            default:
                c1992.f6600.getClass();
                c1992.m3980(view);
                break;
        }
    }
}
