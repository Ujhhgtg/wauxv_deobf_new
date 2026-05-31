package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0099 implements InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C0099 f1110;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1112;

    public /* synthetic */ C0099(Object obj, int i) {
        this.f1111 = i;
        this.f1112 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C0099 m1230(int i, int i2, int i3) {
        return new C0099(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3), 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0099 m1231(int i, int i2, int i3, int i4, boolean z) {
        return new C0099(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 1);
    }

    public String toString() {
        String str;
        switch (this.f1111) {
            case 3:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.f1112 != null) {
                    str = "value=" + this.f1112;
                } else {
                    str = "value not initialized yet";
                }
                return AbstractC1095.m2801(sb, str, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Object m1232(InterfaceC1766 interfaceC1766) {
        Object obj = this.f1112;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(AbstractC2844.m4786(new StringBuilder("Property "), ((AbstractC0529) interfaceC1766).f2226, " should be initialized before get."));
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo754() {
        return this.f1112;
    }

    public C0099(int i) {
        this.f1111 = i;
        switch (i) {
            case 4:
                this.f1112 = new Object();
                new Handler(Looper.getMainLooper(), new C1460(this, 1));
                break;
        }
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo753() {
    }
}
