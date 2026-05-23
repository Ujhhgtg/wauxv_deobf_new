package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᛸᲇᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1619 extends AbstractC1756 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1619 f5490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1619 f5491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5492;

    static {
        int i = 0;
        f5490 = new C1619(i, 0);
        f5491 = new C1619(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1619(int i, int i2) {
        super(i);
        this.f5492 = i2;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f5492) {
            case 0:
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new C1620();
                } catch (NoSuchFieldException unused) {
                    return C1620.f5493;
                }
            case 1:
                return new Handler(Looper.getMainLooper());
            default:
                return C3497.f10997;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619(EnumC1769 enumC1769, C0155 c0155) {
        super(0);
        this.f5492 = 2;
    }
}
