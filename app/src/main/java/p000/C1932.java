package p000;

import android.app.Activity;
import android.content.Intent;
import java.util.Collection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1932 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6379 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f6380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f6381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f6382;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6383;

    public /* synthetic */ C1932(Activity activity, String str, String str2, String str3) {
        this.f6381 = activity;
        this.f6380 = str;
        this.f6382 = str2;
        this.f6383 = str3;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        int i = 1;
        Object obj2 = this.f6383;
        Object obj3 = this.f6382;
        String str = this.f6380;
        Object obj4 = this.f6381;
        switch (1) {
            case 0:
                InterfaceC1429 interfaceC1429 = (InterfaceC1429) obj3;
                C1927 c1927 = (C1927) obj2;
                if ((obj4 instanceof Collection) && ((Collection) obj4).isEmpty()) {
                    obj4 = null;
                }
                boolean z = true;
                if (obj4 != null) {
                    boolean zBooleanValue = ((Boolean) interfaceC1429.mo1196(obj4, obj)).booleanValue();
                    String strM5113 = C3529.m5113(obj4);
                    String strM4857 = strM5113 != null ? AbstractC2849.m4857(strM5113.toString(), " (Kotlin reflection is not available)", "") : null;
                    String strM4858 = obj != null ? AbstractC2849.m4857(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                    if (c1927.f6368 != 3) {
                        C2873 c2873 = C1747.f5845;
                        String str2 = "[FILTER] [" + (zBooleanValue ? "HIT" : "MISS") + "] " + str + ": " + strM4857 + " [RESOLVED] " + strM4858;
                        if (AbstractC2784.m4759(C1747.f5848) <= AbstractC2784.m4759(1)) {
                            C1747.f5847.mo2861(str2);
                        }
                    }
                    z = zBooleanValue;
                }
                return Boolean.valueOf(z);
            default:
                Activity activity = (Activity) obj4;
                Intent intent = new Intent();
                String[] strArr = AbstractC1574.f5469;
                intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent.putExtra("Ksnsupload_type", 14);
                intent.putExtra("KSightPath", str);
                intent.putExtra("KSightThumbPath", (String) obj3);
                intent.putExtra("Kdescription", (String) obj2);
                activity.startActivity(intent);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1932(Object obj, InterfaceC1429 interfaceC1429, C1927 c1927, String str) {
        this.f6381 = obj;
        this.f6382 = interfaceC1429;
        this.f6383 = c1927;
        this.f6380 = str;
    }
}
