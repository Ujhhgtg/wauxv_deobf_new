package p000;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2184 extends AbstractC1778 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2184(Object obj, int i) {
        super(0);
        this.f7225 = i;
        this.f7226 = obj;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f7225) {
            case 0:
                return Long.valueOf(((C2186) this.f7226).f7228.contentLength());
            case 1:
                InterfaceC3647 interfaceC3647 = (InterfaceC3647) this.f7226;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C3646(AbstractC2574.m4549(C2686.class).mo2209()));
                C3646[] c3646Arr = (C3646[]) arrayList.toArray(new C3646[0]);
                AbstractC1470 abstractC1470Mo3226 = interfaceC3647.mo3226();
                if (interfaceC3647 instanceof InterfaceC1532) {
                    ((InterfaceC1532) interfaceC3647).mo3225();
                    throw null;
                }
                C0886 c0886 = C0886.f3334;
                abstractC1470Mo3226.getClass();
                throw null;
            default:
                Toast toast = AbstractC1272.f4646;
                if (toast != null) {
                    toast.cancel();
                }
                Context context = AbstractC2174.f7202;
                if (context == null) {
                    context = null;
                }
                Toast toastMakeText = Toast.makeText(context, (String) this.f7226, 0);
                AbstractC1272.f4646 = toastMakeText;
                if (toastMakeText != null) {
                    toastMakeText.show();
                }
                return C3554.UNIT;
        }
    }
}
