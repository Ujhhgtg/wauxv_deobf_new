package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2317 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7448;

    public /* synthetic */ ViewOnClickListenerC2317(int i) {
        this.f7448 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7448) {
            case 0:
                AbstractC2834.m4819(C2321.f7453);
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            case 1:
                String[] strArr = AbstractC1574.f5469;
                String str = "EmojiGroupInfo";
                String str2 = "productID = ?";
                String[] strArr2 = {"wa.panel.emoji.group"};
                int i = 0;
                
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2800.m4779()).m3492();
                c1973M3492.name = "delete";
                ((Number) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String[].class)}, 3, c1973M3492)).invoke("EmojiGroupInfo", "productID = ?", strArr2)).intValue();
                AbstractC2834.m4823(null, 3, "清除成功");
                break;
            case 2:
                C2873 c2873 = AbstractC2342.f7529;
                String[] strArr3 = AbstractC1574.f5469;
                AbstractC2834.m4819(AbstractC2342.m4330("Plugin"));
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            case 3:
                String[] strArr4 = AbstractC1574.f5469;
                AbstractC2834.m4819("1.2.7.r1356.3e63484(1356)");
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            case 4:
                AbstractC2834.m4819(AbstractC3691.f11600);
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            default:
                
                AbstractC2834.m4819(C1565.m3281());
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
        }
    }
}
