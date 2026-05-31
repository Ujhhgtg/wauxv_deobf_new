package p000;

import android.app.Activity;
import android.content.Intent;
import java.util.Collection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1963 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6484 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f6485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f6487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f6488;

    public /* synthetic */ C1963(Activity activity, String str, String str2, String str3) {
        this.f6486 = activity;
        this.f6485 = str;
        this.f6487 = str2;
        this.f6488 = str3;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        int i = this.f6484;
        Object obj2 = this.f6488;
        Object obj3 = this.f6487;
        String str = this.f6485;
        Object obj4 = this.f6486;
        switch (i) {
            case 0:
                InterfaceC1437 interfaceC1437 = (InterfaceC1437) obj3;
                C1958 c1958 = (C1958) obj2;
                if ((obj4 instanceof Collection) && ((Collection) obj4).isEmpty()) {
                    obj4 = null;
                }
                boolean z = true;
                if (obj4 != null) {
                    boolean zBooleanValue = ((Boolean) interfaceC1437.mo1342(obj4, obj)).booleanValue();
                    String strM5125 = C3588.m5125(obj4);
                    String strM4918 = strM5125 != null ? AbstractC2909.m4918(strM5125.toString(), " (Kotlin reflection is not available)", "") : null;
                    String strM4919 = obj != null ? AbstractC2909.m4918(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                    if (c1958.f6473 != 3) {
                        C2933 c2933 = C1770.f5907;
                        String str2 = "[FILTER] [" + (zBooleanValue ? "HIT" : "MISS") + "] " + str + ": " + strM4918 + " [RESOLVED] " + strM4919;
                        if (AbstractC2844.m4792(C1770.f5910) <= AbstractC2844.m4792(1)) {
                            C1770.f5909.mo2970(str2);
                        }
                    }
                    z = zBooleanValue;
                }
                return Boolean.valueOf(z);
            default:
                Activity activity = (Activity) obj4;
                Intent intent = new Intent();
                String[] strArr = AbstractC1471.f5234;
                intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent.putExtra("Ksnsupload_type", 14);
                intent.putExtra("KSightPath", str);
                intent.putExtra("KSightThumbPath", (String) obj3);
                intent.putExtra("Kdescription", (String) obj2);
                activity.startActivity(intent);
                return C3554.UNIT;
        }
    }

    public /* synthetic */ C1963(Object obj, InterfaceC1437 interfaceC1437, C1958 c1958, String str) {
        this.f6486 = obj;
        this.f6487 = interfaceC1437;
        this.f6488 = c1958;
        this.f6485 = str;
    }
}
