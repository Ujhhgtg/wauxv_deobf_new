package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1514 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f5340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f5341;

    public /* synthetic */ C1514(Object obj, int i, Object obj2) {
        this.f5339 = i;
        this.f5340 = obj;
        this.f5341 = obj2;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        int i = this.f5339;
        int i2 = 2;
        int i3 = 0;
        InterfaceC0842 interfaceC0842 = null;
        Unit unit = Unit.INSTANCE;
        Object obj2 = this.f5341;
        Object obj3 = this.f5340;
        switch (i) {
            case 0:
                ((C1515) obj3).f5342.removeCallbacks((RunnableC1324) obj2);
                break;
            case 1:
                C1046 c1046 = (C1046) obj3;
                int iIntValue = ((Integer) obj).intValue();
                c1046.m3797();
                C1357 c1357 = (C1357) ((List) ((C0542) obj2).f2252).get(iIntValue);
                String str = c1357.f4855;
                String str2 = c1357.f4856;
                String[] strArr = AbstractC1574.f5469;
                if (AbstractC2207.m4087(str, "activity")) {
                    Intent intent = new Intent();
                    intent.setClassName(c1046.getContext(), str2);
                    c1046.getContext().startActivity(intent);
                } else if (AbstractC2207.m4087(str, "wauxv")) {
                    C1362 c1362 = C1362.f4862;
                    Context context = c1046.getContext();
                    
                    int iHashCode = str2.hashCode();
                    if (iHashCode == 509187377) {
                        if (str2.equals("killProcess")) {
                            Process.killProcess(Process.myPid());
                        }
                    } else if (iHashCode == 818860563) {
                        if (str2.equals("clearUnreadCount")) {
                            C1002 c1002 = AbstractC1075.f3893;
                            AbstractC0968.m2486(ExecutorC0990.f3609, new C0303(2, interfaceC0842, 3));
                        }
                    } else if (iHashCode == 1789114534 && str2.equals("openSetting")) {
                        new C2675(context).m4686();
                    }
                }
                break;
            case 2:
                C1501 c1501 = new C1501((C1503) obj, (C1484) obj3, (C0106) obj2, 0);
                C0815 c0815 = new C0815();
                C0816 c0816 = new C0816(c0815);
                c1501.invoke(c0816);
                c0815.f3181 = c0816;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                break;
            case 3:
                Activity activity = (Activity) obj2;
                AbstractC2834.m4818(activity, (String) obj3);
                AbstractC2834.m4823(activity, 2, "复制成功");
                break;
            default:
                C3689.m5349((C3689) obj3);
                int i4 = 0;
                MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(((C1563) obj).m3268()).m3492();
                String[] strArr2 = AbstractC1574.f5469;
                c1973M3492.f6370 = "getContext";
                Context context2 = (Context) ((C1982) AbstractC2784.m4742(c1973M3492)).invoke(new Object[0]);
                TextView textView = new TextView(context2);
                textView.setTextSize(16.0f);
                textView.setText("正在载入...");
                boolean z = true;
                char c = 1;
                textView.setGravity(1);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                ProgressBar progressBar = new ProgressBar(context2, null, 16842872);
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
                C1002 c1003 = AbstractC1075.f3893;
                ExecutorC0990 executorC0990 = ExecutorC0990.f3609;
                C3609 c3609 = new C3609((C3634) obj2, textView, progressBar, alertDialogShow, (InterfaceC0842) null);
                InterfaceC0877 interfaceC0877M4992 = AbstractC3453.m4992(C1187.f4327, executorC0990, true);
                C1002 c1004 = AbstractC1075.f3893;
                if (interfaceC0877M4992 != c1004 && interfaceC0877M4992.mo942(C1133.f4202) == null) {
                    interfaceC0877M4992 = interfaceC0877M4992.mo941(c1004);
                }
                AbstractC0057 c1005 = new C1004(interfaceC0877M4992, true, 0);
                c1005.m938(1, c1005, c3609);
                break;
        }
        return unit;
    }
}
