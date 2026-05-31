package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲁᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1526 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f5371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f5372;

    public /* synthetic */ C1526(Object obj, int i, Object obj2) {
        this.f5370 = i;
        this.f5371 = obj;
        this.f5372 = obj2;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        C1359 c1359;
        int i = this.f5370;
        int i2 = 2;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        InterfaceC0841 interfaceC0841 = null;
        C3554 c3554 = C3554.UNIT;
        Object obj2 = this.f5372;
        Object obj3 = this.f5371;
        switch (i) {
            case 0:
                ((C1527) obj3).f5373.removeCallbacks((RunnableC1326) obj2);
                break;
            case 1:
                C1049 c1049 = (C1049) obj3;
                int iIntValue = ((Integer) obj).intValue();
                c1049.m3991();
                C1363 c1363 = (C1363) ((List) ((C0519) obj2).f2208).get(iIntValue);
                String str = c1363.f4877;
                String str2 = c1363.f4878;
                String[] strArr = AbstractC1471.f5234;
                if (AbstractC1469.m3322(str, "activity")) {
                    Intent intent = new Intent();
                    intent.setClassName(c1049.getContext(), str2);
                    c1049.getContext().startActivity(intent);
                } else if (AbstractC1469.m3322(str, "wauxv")) {
                    C1369 c1369 = C1369.f4885;
                    Context context = c1049.getContext();
                    c1369.getClass();
                    int iHashCode = str2.hashCode();
                    if (iHashCode == 509187377) {
                        if (str2.equals("killProcess")) {
                            Process.killProcess(Process.myPid());
                        }
                    } else if (iHashCode == 818860563) {
                        if (str2.equals("clearUnreadCount")) {
                            C1006 c1006 = AbstractC1080.f3904;
                            AbstractC1471.m3404(ExecutorC0994.f3625, new C0314(i2, interfaceC0841, 4));
                        }
                    } else if (iHashCode == 1789114534 && str2.equals("openSetting")) {
                        new C2735(context).m4720();
                    }
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                C1363 c1364 = (C1363) obj;
                String[] strArr2 = AbstractC1471.f5234;
                C1369 c13610 = C1369.f4885;
                Object obj4 = ((C2571) obj2).f8191;
                if (obj4 == null) {
                    "adapter";
                    c1359 = null;
                } else {
                    c1359 = (C1359) obj4;
                }
                c13610.getClass();
                C2037 c2037 = new C2037();
                c2037.f6779 = "删除菜单";
                c2037.f6780 = "确定删除“" + c1364.f4874 + "”吗？";
                c2037.m4057("删除", new C0596(arrayList, c1359, c1364, i2));
                AbstractC2844.m4788(c2037, null, 3);
                break;
            case 3:
                C1355 c1355 = new C1355((C1515) obj, (C1496) obj3, (InterfaceC1422) obj2, c == true ? 1 : 0);
                C1006 c1007 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c1355, (InterfaceC0841) null));
                break;
            case 4:
                Activity activity = (Activity) obj2;
                AbstractC2894.m4851(activity, (String) obj3);
                AbstractC2894.m4856(activity, 2, "复制成功");
                break;
            default:
                C3752.m5357((C3752) obj3);
                int i3 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(((C1574) obj).m3448()).m3560();
                String[] strArr3 = AbstractC1471.f5234;
                c2004M3560.f6475 = "getContext";
                Context context2 = (Context) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                TextView textView = new TextView(context2);
                textView.setTextSize(16.0f);
                textView.setText("正在载入...");
                textView.setGravity(1);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                ProgressBar progressBar = new ProgressBar(context2, null, R.attr.progressBarStyleHorizontal);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(32, 32, 32, 32);
                progressBar.setLayoutParams(layoutParams);
                AlertDialog.Builder title = new AlertDialog.Builder(context2).setTitle("WAuxiliary");
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setPadding(32, 32, 32, 32);
                linearLayout.addView(textView);
                linearLayout.addView(progressBar);
                AlertDialog alertDialogShow = title.setView(linearLayout).setCancelable(false).show();
                C1006 c1008 = AbstractC1080.f3904;
                ExecutorC0994 executorC0994 = ExecutorC0994.f3625;
                C3669 c3669 = new C3669((C3694) obj2, textView, progressBar, alertDialogShow, (InterfaceC0841) null);
                InterfaceC0876 interfaceC0876M4165 = AbstractC2234.m4165(C1189.f4324, executorC0994, true);
                C1006 c1009 = AbstractC1080.f3904;
                if (interfaceC0876M4165 != c1009 && interfaceC0876M4165.mo1086(C1139.f4214) == null) {
                    interfaceC0876M4165 = interfaceC0876M4165.mo1085(c1009);
                }
                AbstractC0064 c10010 = new C1008(interfaceC0876M4165, z, c2 == true ? 1 : 0);
                c10010.m1082(1, c10010, c3669);
                break;
        }
        return c3554;
    }
}
