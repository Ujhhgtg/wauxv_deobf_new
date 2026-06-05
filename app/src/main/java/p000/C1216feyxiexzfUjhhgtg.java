package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1216feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4524Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Activity f4525Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1216feyxiexzfUjhhgtg(Activity activity, int i) {
        this.f4524Ujhhgtgfeyxiexzf = i;
        this.f4525Ujhhgtgfeyxiexzf = activity;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = this.f4524Ujhhgtgfeyxiexzf;
        int i2 = 1;
        Activity activity = this.f4525Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(10);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String str = "default";
                String str2 = "默认";
                C1198feyxiexzfUjhhgtg c1198feyxiexzfUjhhgtg = new C1198feyxiexzfUjhhgtg();
                c1198feyxiexzfUjhhgtg.f4494Ujhhgtgfeyxiexzf = "";
                "";
                c1198feyxiexzfUjhhgtg.f4494Ujhhgtgfeyxiexzf = str;
                c1198feyxiexzfUjhhgtg.f4495Ujhhgtgfeyxiexzf = str2;
                c0094Ujhhgtgfeyxiexzf.add(c1198feyxiexzfUjhhgtg);
                C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                List listM5361feyxiexzfUjhhgtg = C3673feyxiexzfUjhhgtg.m5361feyxiexzfUjhhgtg();
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM5361feyxiexzfUjhhgtg, 10));
                for (Object obj2 : listM5361feyxiexzfUjhhgtg) {
                    C1198feyxiexzfUjhhgtg c1198feyxiexzfUjhhgtg2 = new C1198feyxiexzfUjhhgtg();
                    c1198feyxiexzfUjhhgtg2.f4494Ujhhgtgfeyxiexzf = "";
                    c1198feyxiexzfUjhhgtg2.f4495Ujhhgtgfeyxiexzf = "";
                    int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_labelID";
                    c1198feyxiexzfUjhhgtg2.f4494Ujhhgtgfeyxiexzf = String.valueOf(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf());
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_labelName";
                    c1198feyxiexzfUjhhgtg2.f4495Ujhhgtgfeyxiexzf = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
                    arrayList.add(c1198feyxiexzfUjhhgtg2);
                }
                c0094Ujhhgtgfeyxiexzf.addAll(arrayList);
                final C0094Ujhhgtgfeyxiexzf c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf);
                C1194feyxiexzfUjhhgtg c1194feyxiexzfUjhhgtg = C1194feyxiexzfUjhhgtg.f4487Ujhhgtgfeyxiexzf;
                final C1216feyxiexzfUjhhgtg c1216feyxiexzfUjhhgtg = new C1216feyxiexzfUjhhgtg(activity, i2);
                c1194feyxiexzfUjhhgtg.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf, 10));
                ListIterator listIterator = c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf.listIterator(0);
                while (true) {
                    C0112Ujhhgtgfeyxiexzf c0112Ujhhgtgfeyxiexzf = (C0112Ujhhgtgfeyxiexzf) listIterator;
                    if (c0112Ujhhgtgfeyxiexzf.hasNext()) {
                        C1198feyxiexzfUjhhgtg c1198feyxiexzfUjhhgtg3 = (C1198feyxiexzfUjhhgtg) c0112Ujhhgtgfeyxiexzf.next();
                        String str3 = c1198feyxiexzfUjhhgtg3.f4494Ujhhgtgfeyxiexzf;
                        String string = c1198feyxiexzfUjhhgtg3.f4495Ujhhgtgfeyxiexzf;
                        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str3, "default")) {
                            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(string);
                            sbM2707Ujhhgtgfeyxiexzf.append(" [");
                            C3673feyxiexzfUjhhgtg c3673feyxiexzfUjhhgtg = C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf;
                            String str4 = c1198feyxiexzfUjhhgtg3.f4494Ujhhgtgfeyxiexzf;
                            c3673feyxiexzfUjhhgtg.getClass();
                            sbM2707Ujhhgtgfeyxiexzf.append(C3673feyxiexzfUjhhgtg.m5362feyxiexzfUjhhgtg(str4).size());
                            sbM2707Ujhhgtgfeyxiexzf.append(']');
                            string = sbM2707Ujhhgtgfeyxiexzf.toString();
                        }
                        arrayList2.add(string);
                    } else {
                        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                        ArrayList arrayList3 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf, 10));
                        ListIterator listIterator2 = c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf.listIterator(0);
                        while (true) {
                            C0112Ujhhgtgfeyxiexzf c0112Ujhhgtgfeyxiexzf2 = (C0112Ujhhgtgfeyxiexzf) listIterator2;
                            if (!c0112Ujhhgtgfeyxiexzf2.hasNext()) {
                                final boolean[] zArrM4249feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4249feyxiexzfUjhhgtg(arrayList3);
                                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                                builder.setTitle("请选择过滤标签");
                                builder.setMultiChoiceItems(strArr2, zArrM4249feyxiexzfUjhhgtg, new DialogInterface.OnMultiChoiceClickListener() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛲᛱUjhhgtgᛱᛳ
                                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                                        zArrM4249feyxiexzfUjhhgtg[i4] = z;
                                    }
                                });
                                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛲᛳᛱUjhhgtgᛱ
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4) throws IllegalAccessException, InvocationTargetException {
                                        ArrayList arrayList4 = new ArrayList();
                                        int i5 = 0;
                                        ListIterator listIterator3 = c0094UjhhgtgfeyxiexzfM2746Ujhhgtgfeyxiexzf.listIterator(0);
                                        while (true) {
                                            C0112Ujhhgtgfeyxiexzf c0112Ujhhgtgfeyxiexzf3 = (C0112Ujhhgtgfeyxiexzf) listIterator3;
                                            if (!c0112Ujhhgtgfeyxiexzf3.hasNext()) {
                                                ArrayList arrayList5 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList4, 10));
                                                Iterator it = arrayList4.iterator();
                                                while (it.hasNext()) {
                                                    arrayList5.add(((C1198feyxiexzfUjhhgtg) it.next()).f4494Ujhhgtgfeyxiexzf);
                                                }
                                                Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList5);
                                                C1195feyxiexzfUjhhgtg.f4491Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(setM4256Ujhhgtgfeyxiexzf);
                                                c1216feyxiexzfUjhhgtg.invoke(setM4256Ujhhgtgfeyxiexzf);
                                                return;
                                            }
                                            Object next = c0112Ujhhgtgfeyxiexzf3.next();
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                                                throw null;
                                            }
                                            if (zArrM4249feyxiexzfUjhhgtg[i5]) {
                                                arrayList4.add(next);
                                            }
                                            i5 = i6;
                                        }
                                    }
                                });
                                builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                                builder.show();
                                return Boolean.TRUE;
                            }
                            arrayList3.add(Boolean.valueOf(C1195feyxiexzfUjhhgtg.f4491Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().contains(((C1198feyxiexzfUjhhgtg) c0112Ujhhgtgfeyxiexzf2.next()).f4494Ujhhgtgfeyxiexzf)));
                        }
                    }
                }
                break;
            default:
                C1200feyxiexzfUjhhgtg.f4497Ujhhgtgfeyxiexzf.getClass();
                C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C1201feyxiexzfUjhhgtg.f4498Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C1200feyxiexzfUjhhgtg.m2683feyxiexzfUjhhgtg()));
                int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(viewGroup).m2024Ujhhgtgfeyxiexzf();
                Class cls = Integer.TYPE;
                ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls)}, 3, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1649Ujhhgtgfeyxiexzf(0, 0, 0);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(viewGroup).m2024Ujhhgtgfeyxiexzf();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getAdapter";
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1649Ujhhgtgfeyxiexzf(new Object[0])).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.plugin.mvvmlist.MvvmList";
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4938Ujhhgtgfeyxiexzf();
                Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1199feyxiexzfUjhhgtg.f4496Ujhhgtgfeyxiexzf);
                if (methodM3154feyxiexzfUjhhgtg.getParameterCount() == 4) {
                    methodM3154feyxiexzfUjhhgtg.invoke(null, objM4938Ujhhgtgfeyxiexzf, null, 1, null);
                } else {
                    methodM3154feyxiexzfUjhhgtg.invoke(objM4938Ujhhgtgfeyxiexzf, null);
                }
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
