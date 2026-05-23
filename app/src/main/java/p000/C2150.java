package p000;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2150 extends AbstractC1756 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7102;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2150(int i, Object obj) {
        super(0);
        this.f7101 = i;
        this.f7102 = obj;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f7101) {
            case 0:
                return Long.valueOf(((C2152) this.f7102).f7104.contentLength());
            case 1:
                InterfaceC3587 interfaceC3587 = (InterfaceC3587) this.f7102;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C3586(AbstractC2519.classToKClass(C2625.class).mo2114()));
                C3586[] c3586Arr = (C3586[]) arrayList.toArray(new C3586[0]);
                AbstractC1458 abstractC1458Mo3118 = interfaceC3587.mo3118();
                if (interfaceC3587 instanceof InterfaceC1520) {
                    ((InterfaceC1520) interfaceC3587).mo3117();
                    throw null;
                }
                C0887 c0887 = C0887.f3327;
                
                throw null;
            default:
                Toast toast = AbstractC3471.f10964;
                if (toast != null) {
                    toast.cancel();
                }
                Context context = AbstractC2140.f7078;
                if (context == null) {
                    context = null;
                }
                Toast toastMakeText = Toast.makeText(context, (String) this.f7102, 0);
                AbstractC3471.f10964 = toastMakeText;
                if (toastMakeText != null) {
                    toastMakeText.show();
                }
                return Unit.INSTANCE;
        }
    }
}
