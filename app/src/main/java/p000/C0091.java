package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0091 implements InterfaceC0962 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C0091 f1042;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1043;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1044;

    public /* synthetic */ C0091(int i, Object obj) {
        this.f1043 = i;
        this.f1044 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C0091 m1085(int i, int i2, int i3, int i4, boolean z) {
        return new C0091(0, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public String toString() {
        String str;
        switch (this.f1043) {
            case 2:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.f1044 != null) {
                    str = "value=" + this.f1044;
                } else {
                    str = "value not initialized yet";
                }
                return AbstractC1194.m2786(sb, str, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Object m1086(InterfaceC1742 interfaceC1742) {
        Object obj = this.f1044;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(AbstractC2784.m4752(new StringBuilder("Property "), ((AbstractC0552) interfaceC1742).f2270, " should be initialized before get."));
    }

    @Override // p000.InterfaceC0962
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo611() {
        return this.f1044;
    }

    public C0091(int i) {
        this.f1043 = i;
        switch (i) {
            case 3:
                this.f1044 = new Object();
                new Handler(Looper.getMainLooper(), new C1452(1, this));
                break;
        }
    }

    @Override // p000.InterfaceC0962
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo610() {
    }
}
