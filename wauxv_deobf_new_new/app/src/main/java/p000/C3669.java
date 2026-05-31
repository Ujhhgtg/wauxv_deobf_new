package p000;

import android.app.AlertDialog;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲁᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3669 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f11425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f11426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f11427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f11428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f11429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3669(C3694 c3694, TextView textView, ProgressBar progressBar, AlertDialog alertDialog, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f11424 = 2;
        this.f11426 = c3694;
        this.f11427 = textView;
        this.f11428 = progressBar;
        this.f11429 = alertDialog;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f11424) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C3669) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f11424) {
            case 0:
                C3669 c3669 = new C3669((String) this.f11427, (String) this.f11428, (JSONObject) this.f11429, interfaceC0841, 0);
                c3669.f11426 = obj;
                return c3669;
            case 1:
                C3669 c36610 = new C3669((String) this.f11427, (String) this.f11428, (JSONObject) this.f11429, interfaceC0841, 1);
                c36610.f11426 = obj;
                return c36610;
            default:
                return new C3669((C3694) this.f11426, (TextView) this.f11427, (ProgressBar) this.f11428, (AlertDialog) this.f11429, interfaceC0841);
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Exception {
        int i = this.f11424;
        C3554 c3554 = C3554.UNIT;
        InterfaceC0841 interfaceC0841 = null;
        Object obj2 = this.f11429;
        Object obj3 = this.f11428;
        Object obj4 = this.f11427;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f11426;
                int i2 = this.f11425;
                if (i2 == 0) {
                    AbstractC1470.m3372(obj);
                    AbstractC2894.m4856(null, 3, "开始下载视频");
                    String str = C3667.f11416.m2666() + '/' + ((String) obj4) + '-' + ((String) obj3) + ".mp4";
                    String string = ((JSONObject) obj2).getString("pcdn_url");
                    C2593 c2593 = new C2593(str, 4);
                    C1006 c1006 = AbstractC1080.f3904;
                    C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(string, c2593, interfaceC0841, 5)));
                    this.f11426 = null;
                    this.f11425 = 1;
                    obj = c2180.m4138(this);
                    if (obj == enumC0883) {
                        return enumC0883;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                AbstractC2894.m4856(null, 3, "下载视频完成");
                return c3554;
            case 1:
                String[] strArr2 = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0883 = (InterfaceC0882) this.f11426;
                int i3 = this.f11425;
                if (i3 == 0) {
                    AbstractC1470.m3372(obj);
                    AbstractC2894.m4856(null, 3, "开始下载视频");
                    String str2 = C3672.f11446.m2666() + '/' + ((String) obj4) + '-' + ((String) obj3) + ".mp4";
                    String string2 = ((JSONObject) obj2).getString("pcdn_url");
                    C2593 c2594 = new C2593(str2, 7);
                    C1006 c1007 = AbstractC1080.f3904;
                    C2180 c2181 = new C2180(AbstractC1470.m3361(interfaceC0883, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(string2, c2594, interfaceC0841, 8)));
                    this.f11426 = null;
                    this.f11425 = 1;
                    obj = c2181.m4138(this);
                    if (obj == enumC0883) {
                        return enumC0883;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                AbstractC2894.m4856(null, 3, "下载视频完成");
                return c3554;
            default:
                int i4 = this.f11425;
                int i5 = 2;
                if (i4 == 0) {
                    AbstractC1470.m3372(obj);
                    this.f11425 = 1;
                    if (((C3694) this.f11426).mo2135((TextView) obj4, (ProgressBar) obj3, this) != enumC0883) {
                    }
                    return enumC0883;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                    return c3554;
                }
                AbstractC1470.m3372(obj);
                C1006 c1008 = AbstractC1080.f3904;
                C1527 c1527 = AbstractC1908.f6303;
                C0712 c0712 = new C0712((AlertDialog) obj2, interfaceC0841, i5);
                this.f11425 = 2;
                if (AbstractC1470.m3374(c1527, c0712, this) != enumC0883) {
                    return c3554;
                }
                return enumC0883;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3669(String str, String str2, JSONObject jSONObject, InterfaceC0841 interfaceC0841, int i) {
        super(2, interfaceC0841);
        this.f11424 = i;
        this.f11427 = str;
        this.f11428 = str2;
        this.f11429 = jSONObject;
    }
}
