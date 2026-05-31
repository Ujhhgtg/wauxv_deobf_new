package p000;

import de.robv.android.xposed.XC_MethodHook;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2408 extends XC_MethodHook {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7717;

    public /* synthetic */ C2408(Consumer consumer, int i) {
        this.f7716 = i;
        this.f7717 = consumer;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f7716) {
            case 0:
                ((Consumer) this.f7717).accept(methodHookParam);
                break;
            case 1:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 2:
                if (methodHookParam != null) {
                    ((AbstractC1698) this.f7717).mo1478(C1139.m2854(methodHookParam));
                    break;
                }
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f7716) {
            case 1:
                ((Consumer) this.f7717).accept(methodHookParam);
                break;
            case 2:
                if (methodHookParam != null) {
                    AbstractC1698 abstractC1698 = (AbstractC1698) this.f7717;
                    C1927 c1927M2854 = C1139.m2854(methodHookParam);
                    if (!(abstractC1698 instanceof C0258)) {
                        abstractC1698.mo1479(c1927M2854);
                    } else {
                        ((C1572) c1927M2854.f6347).mo1342(((C0258) abstractC1698).m1481(c1927M2854), Boolean.TRUE);
                    }
                    break;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2408(AbstractC1698 abstractC1698, int i) {
        super(i);
        this.f7716 = 2;
        this.f7717 = abstractC1698;
    }
}
