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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0530Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2493Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f2494Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f2495Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0530Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f2493Ujhhgtgfeyxiexzf = i;
        this.f2494Ujhhgtgfeyxiexzf = obj;
        this.f2495Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg;
        int i = this.f2493Ujhhgtgfeyxiexzf;
        int i2 = 2;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = null;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        Object obj2 = this.f2495Ujhhgtgfeyxiexzf;
        Object obj3 = this.f2494Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C0529Ujhhgtgfeyxiexzf) obj3).f2490Ujhhgtgfeyxiexzf.removeCallbacks((RunnableC3468feyxiexzfUjhhgtg) obj2);
                break;
            case 1:
                C3164feyxiexzfUjhhgtg c3164feyxiexzfUjhhgtg = (C3164feyxiexzfUjhhgtg) obj3;
                int iIntValue = ((Integer) obj).intValue();
                c3164feyxiexzfUjhhgtg.m1632Ujhhgtgfeyxiexzf();
                C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf = (C3485Ujhhgtgfeyxiexzf) ((List) ((C2629Ujhhgtgfeyxiexzf) obj2).f8461Ujhhgtgfeyxiexzf).get(iIntValue);
                String str = c3485Ujhhgtgfeyxiexzf.f10823Ujhhgtgfeyxiexzf;
                String str2 = c3485Ujhhgtgfeyxiexzf.f10824Ujhhgtgfeyxiexzf;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928787134678041994L, strArr))) {
                    Intent intent = new Intent();
                    intent.setClassName(c3164feyxiexzfUjhhgtg.getContext(), str2);
                    c3164feyxiexzfUjhhgtg.getContext().startActivity(intent);
                } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928787096023336330L, strArr))) {
                    C3613Ujhhgtgfeyxiexzf c3613Ujhhgtgfeyxiexzf = C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf;
                    Context context = c3164feyxiexzfUjhhgtg.getContext();
                    c3613Ujhhgtgfeyxiexzf.getClass();
                    int iHashCode = str2.hashCode();
                    if (iHashCode == 509187377) {
                        if (str2.equals(MagicFactory.get(4928800754019337610L, strArr))) {
                            Process.killProcess(Process.myPid());
                        }
                    } else if (iHashCode == 818860563) {
                        if (str2.equals(MagicFactory.get(4928800702479730058L, strArr))) {
                            C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                            C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2554feyxiexzfUjhhgtg(i2, interfaceC3704Ujhhgtgfeyxiexzf, 4));
                        }
                    } else if (iHashCode == 1789114534 && str2.equals(MagicFactory.get(4928800668119991690L, strArr))) {
                        new C1019feyxiexzfUjhhgtg(context).m2518Ujhhgtgfeyxiexzf();
                    }
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf2 = (C3485Ujhhgtgfeyxiexzf) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C3613Ujhhgtgfeyxiexzf c3613Ujhhgtgfeyxiexzf2 = C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf;
                Object obj4 = ((C0976feyxiexzfUjhhgtg) obj2).f3870Ujhhgtgfeyxiexzf;
                if (obj4 == null) {
                    MagicFactory.get(4928786997239088522L, strArr2);
                    c3476feyxiexzfUjhhgtg = null;
                } else {
                    c3476feyxiexzfUjhhgtg = (C3476feyxiexzfUjhhgtg) obj4;
                }
                c3613Ujhhgtgfeyxiexzf2.getClass();
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = MagicFactory.get(4928800934407964042L, strArr2);
                c0290Ujhhgtgfeyxiexzf.f1722Ujhhgtgfeyxiexzf = MagicFactory.get(4928800912933127562L, strArr2) + c3485Ujhhgtgfeyxiexzf2.f10820Ujhhgtgfeyxiexzf + MagicFactory.get(4928801024602277258L, strArr2);
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928801007422408074L, strArr2), new C2712feyxiexzfUjhhgtg(arrayList, c3476feyxiexzfUjhhgtg, c3485Ujhhgtgfeyxiexzf2, i2));
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                break;
            case 3:
                C3472Ujhhgtgfeyxiexzf c3472Ujhhgtgfeyxiexzf = new C3472Ujhhgtgfeyxiexzf((C0544Ujhhgtgfeyxiexzf) obj, (C0627Ujhhgtgfeyxiexzf) obj3, (InterfaceC3545feyxiexzfUjhhgtg) obj2, c == true ? 1 : 0);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf2 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c3472Ujhhgtgfeyxiexzf, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                break;
            case 4:
                Activity activity = (Activity) obj2;
                AbstractC1150feyxiexzfUjhhgtg.m2616Ujhhgtgfeyxiexzf(activity, (String) obj3);
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(activity, 2, MagicFactory.get(4928831596179490186L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                break;
            default:
                C2285feyxiexzfUjhhgtg.m3482Ujhhgtgfeyxiexzf((C2285feyxiexzfUjhhgtg) obj3);
                int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928236519870694794L, strArr3);
                Context context2 = (Context) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                TextView textView = new TextView(context2);
                textView.setTextSize(16.0f);
                textView.setText(MagicFactory.get(4928236610065008010L, strArr3));
                textView.setGravity(1);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                ProgressBar progressBar = new ProgressBar(context2, null, R.attr.progressBarStyleHorizontal);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(32, 32, 32, 32);
                progressBar.setLayoutParams(layoutParams);
                AlertDialog.Builder title = new AlertDialog.Builder(context2).setTitle(MagicFactory.get(4928236713144223114L, strArr3));
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setPadding(32, 32, 32, 32);
                linearLayout.addView(textView);
                linearLayout.addView(progressBar);
                AlertDialog alertDialogShow = title.setView(linearLayout).setCancelable(false).show();
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf3 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                ExecutorC3114Ujhhgtgfeyxiexzf executorC3114Ujhhgtgfeyxiexzf = ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf;
                C2223Ujhhgtgfeyxiexzf c2223Ujhhgtgfeyxiexzf = new C2223Ujhhgtgfeyxiexzf((C2248feyxiexzfUjhhgtg) obj2, textView, progressBar, alertDialogShow, (InterfaceC3704Ujhhgtgfeyxiexzf) null);
                InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5174Ujhhgtgfeyxiexzf(C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf, executorC3114Ujhhgtgfeyxiexzf, true);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf4 = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                if (interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf != c3126Ujhhgtgfeyxiexzf4 && interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf) == null) {
                    interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf.mo1764feyxiexzfUjhhgtg(c3126Ujhhgtgfeyxiexzf4);
                }
                AbstractC2927Ujhhgtgfeyxiexzf c3121Ujhhgtgfeyxiexzf = new C3121Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtgM5174Ujhhgtgfeyxiexzf, z, c2 == true ? 1 : 0);
                c3121Ujhhgtgfeyxiexzf.m4296feyxiexzfUjhhgtg(1, c3121Ujhhgtgfeyxiexzf, c2223Ujhhgtgfeyxiexzf);
                break;
        }
        return c1943Ujhhgtgfeyxiexzf;
    }
}
