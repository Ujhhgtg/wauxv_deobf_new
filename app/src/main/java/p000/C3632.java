package p000;

import android.os.Process;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3632 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f11347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11348;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3632(TextView textView, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f11348 = textView;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        return ((C3632) mo1197((InterfaceC0842) obj2, (InterfaceC0883) obj)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        return new C3632(this.f11348, interfaceC0842);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        String[] strArr = AbstractC1574.f5469;
        int i = this.f11347;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            this.f11348.setText("加载完成, 准备重启...");
            this.f11347 = 1;
            Object objM3215 = AbstractC1460.m3215(1000L, this);
            EnumC0884 enumC0884 = EnumC0884.f3325;
            if (objM3215 == enumC0884) {
                return enumC0884;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0743.m2188(obj);
        }
        Process.killProcess(Process.myPid());
        return Unit.INSTANCE;
    }
}
