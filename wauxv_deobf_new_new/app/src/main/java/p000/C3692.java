package p000;

import android.os.Process;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3692 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f11496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11497;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3692(TextView textView, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f11497 = textView;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        return ((C3692) mo1343((InterfaceC0841) obj2, (InterfaceC0882) obj)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        return new C3692(this.f11497, interfaceC0841);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        String[] strArr = AbstractC1471.f5234;
        int i = this.f11496;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            this.f11497.setText("加载完成, 准备重启...");
            this.f11496 = 1;
            Object objM5331 = AbstractC3744.m5331(1000L, this);
            EnumC0883 enumC0883 = EnumC0883.f3332;
            if (objM5331 == enumC0883) {
                return enumC0883;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1470.m3372(obj);
        }
        Process.killProcess(Process.myPid());
        return C3554.UNIT;
    }
}
