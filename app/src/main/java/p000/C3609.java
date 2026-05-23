package p000;

import android.app.AlertDialog;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤝᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3609 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f11275;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f11276;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public /* synthetic */ Object f11277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f11278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f11279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f11280;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609(C3634 c3634, TextView textView, ProgressBar progressBar, AlertDialog alertDialog, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f11275 = 2;
        this.f11277 = c3634;
        this.f11278 = textView;
        this.f11279 = progressBar;
        this.f11280 = alertDialog;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f11275) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C3609) mo1197(interfaceC0842, interfaceC0883)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f11275) {
            case 0:
                C3609 c3609 = new C3609((String) this.f11278, (String) this.f11279, (JSONObject) this.f11280, interfaceC0842, 0);
                c3609.f11277 = obj;
                return c3609;
            case 1:
                C3609 c36010 = new C3609((String) this.f11278, (String) this.f11279, (JSONObject) this.f11280, interfaceC0842, 1);
                c36010.f11277 = obj;
                return c36010;
            default:
                return new C3609((C3634) this.f11277, (TextView) this.f11278, (ProgressBar) this.f11279, (AlertDialog) this.f11280, interfaceC0842);
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Exception {
        int i = this.f11275;
        Unit unit = Unit.INSTANCE;
        InterfaceC0842 interfaceC0842 = null;
        Object obj2 = this.f11280;
        Object obj3 = this.f11279;
        Object obj4 = this.f11278;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f11277;
                int i2 = this.f11276;
                if (i2 == 0) {
                    AbstractC0743.m2188(obj);
                    AbstractC2834.m4823(null, 3, "开始下载视频");
                    String str = C3607.f11267.m2542() + '/' + ((String) obj4) + '-' + ((String) obj3) + ".mp4";
                    String string = ((JSONObject) obj2).getString("pcdn_url");
                    C2536 c2536 = new C2536(str, 4);
                    C1002 c1002 = AbstractC1075.f3893;
                    C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(string, c2536, interfaceC0842, 5)));
                    this.f11277 = null;
                    this.f11276 = 1;
                    obj = c2146.m3954(this);
                    if (obj == enumC0884) {
                        return enumC0884;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                }
                AbstractC2834.m4823(null, 3, "下载视频完成");
                return unit;
            case 1:
                String[] strArr2 = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0884 = (InterfaceC0883) this.f11277;
                int i3 = this.f11276;
                if (i3 == 0) {
                    AbstractC0743.m2188(obj);
                    AbstractC2834.m4823(null, 3, "开始下载视频");
                    String str2 = C3612.f11297.m2542() + '/' + ((String) obj4) + '-' + ((String) obj3) + ".mp4";
                    String string2 = ((JSONObject) obj2).getString("pcdn_url");
                    C2536 c2537 = new C2536(str2, 7);
                    C1002 c1003 = AbstractC1075.f3893;
                    C2146 c2147 = new C2146(AbstractC2203.m4025(interfaceC0884, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(string2, c2537, interfaceC0842, 8)));
                    this.f11277 = null;
                    this.f11276 = 1;
                    obj = c2147.m3954(this);
                    if (obj == enumC0884) {
                        return enumC0884;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                }
                AbstractC2834.m4823(null, 3, "下载视频完成");
                return unit;
            default:
                int i4 = this.f11276;
                if (i4 == 0) {
                    AbstractC0743.m2188(obj);
                    this.f11276 = 1;
                    if (((C3634) this.f11277).mo3133((TextView) obj4, (ProgressBar) obj3, this) != enumC0884) {
                    }
                    return enumC0884;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                    return unit;
                }
                AbstractC0743.m2188(obj);
                C1002 c1004 = AbstractC1075.f3893;
                C1515 c1515 = AbstractC1881.f6228;
                C0717 c0717 = new C0717((AlertDialog) obj2, null, 1);
                this.f11276 = 2;
                if (AbstractC2203.m4045(c1515, c0717, this) != enumC0884) {
                    return unit;
                }
                return enumC0884;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3609(String str, String str2, JSONObject jSONObject, InterfaceC0842 interfaceC0842, int i) {
        super(2, interfaceC0842);
        this.f11275 = i;
        this.f11278 = str;
        this.f11279 = str2;
        this.f11280 = jSONObject;
    }
}
