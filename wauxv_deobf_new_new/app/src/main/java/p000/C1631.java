package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᛸᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1631 extends AbstractC1778 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1631 f5523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1631 f5524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5525;

    static {
        int i = 0;
        f5523 = new C1631(i, 0);
        f5524 = new C1631(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1631(int i, int i2) {
        super(i);
        this.f5525 = i2;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f5525) {
            case 0:
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new C1632();
                } catch (NoSuchFieldException unused) {
                    return C1632.f5526;
                }
            case 1:
                return new Handler(Looper.getMainLooper());
            default:
                return C3554.UNIT;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631(EnumC1792 enumC1792, C0163 c0163) {
        super(0);
        this.f5525 = 2;
    }
}
