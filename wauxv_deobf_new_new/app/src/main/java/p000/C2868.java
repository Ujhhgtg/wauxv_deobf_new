package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2868 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9159;

    public /* synthetic */ C2868(int i) {
        this.f9159 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Intent intent;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        int i = this.f9159;
        int i2 = 6;
        boolean z = true;
        z = true;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                String str = (String) obj;
                String[] strArr = AbstractC1471.f5234;
                if (!AbstractC1469.m3322(str, "startActivity") && !AbstractC1469.m3322(str, "startActivityForResult")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                C1574 c1574 = (C1574) obj;
                String[] strArr2 = AbstractC1471.f5234;
                if (c1574.m3447()[0] instanceof Intent) {
                    try {
                        c2641 = c1574.m3447()[0];
                        if (c2641 == null) {
                            c2641 = null;
                        }
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    intent = (Intent) (c2641 instanceof C2641 ? null : c2641);
                } else {
                    try {
                        c2642 = c1574.m3447()[1];
                        if (c2642 == null) {
                            c2642 = null;
                        }
                    } catch (Throwable th2) {
                        c2642 = new C2641(th2);
                    }
                    intent = (Intent) (c2642 instanceof C2641 ? null : c2642);
                }
                for (InterfaceC1615 interfaceC1615 : C2869.f9161) {
                    try {
                        interfaceC1615.mo1553(c1574, intent);
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onStartActivityIntent ");
                        sb.append(interfaceC1615 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1615).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 2:
                ((C1023) obj).f3739 = new C2868(i2);
                return c3554;
            case 3:
                ((C1023) obj).f3739 = new C2868(8);
                return c3554;
            case 4:
                ((C1023) obj).f3739 = new C2868(7);
                return c3554;
            case 5:
                ((C1023) obj).f3739 = new C2868(9);
                return c3554;
            case 6:
                C1334 c1334 = (C1334) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.storage");
                C0700 c0700 = new C0700();
                c0700.m2220("PRAGMA table_info( contact_ext )");
                c1334.f4791 = c0700;
                return c3554;
            case 7:
                C1334 c1335 = (C1334) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1335.m3154("com.tencent.mm.storage");
                C0700 c0701 = new C0700();
                c0701.m2220("PRAGMA table_info( rconversation)");
                c1335.f4791 = c0701;
                return c3554;
            case 8:
                C1334 c1336 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1336.m3154("com.tencent.mm.storage");
                C0700 c0702 = new C0700();
                c0702.m2220("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d");
                c1336.f4791 = c0702;
                return c3554;
            case 9:
                C1334 c1337 = (C1334) obj;
                c1337.m3154("com.tencent.mm.plugin.messenger.foundation");
                C0700 c0703 = new C0700();
                C1318 c1318 = new C1318();
                c1318.m3144(AbstractC0972.m2608(C2880.f9228));
                c1318.m3144(AbstractC0972.m2608(C2882.f9230));
                c1318.m3144(AbstractC0972.m2608(C2881.f9229));
                c0703.f2680 = c1318;
                c1337.f4791 = c0703;
                return c3554;
            case 10:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 11:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case Opcodes.FCONST_1 /* 12 */:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 13:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2868(14);
                c1023.f3740 = new C2868(15);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1334) obj).m3153(new C2868(17));
                return c3554;
            case 15:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1338);
                Class<Object> cls = Object.class;
                Class<Object> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4232 == null) {
                    clsM4232 = cls;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2012M4773, clsM4232, String.class);
                Class cls2 = clsM4774 != null ? clsM4774 : String.class;
                Class<Object> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2012M4773.m4017(cls2, clsM4233 != null ? clsM4233 : Object.class);
                c1338.f4794 = c2012M4773;
                return c3554;
            case 16:
                C1574 c1575 = (C1574) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1575.getClass();
                try {
                    c2643 = c1575.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                String str2 = (String) (c2643 instanceof C2641 ? null : c2643);
                try {
                    Object obj2 = c1575.m3447()[1];
                    break;
                } catch (Throwable unused) {
                }
                for (InterfaceC1616 interfaceC1616 : C2932.f9380) {
                    try {
                        interfaceC1616.mo2154(c1575, str2);
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onGetSyncConfig ");
                        sb2.append(interfaceC1616 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1616).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr7 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match");
                return c3554;
            case Opcodes.LDC /* 18 */:
                View view = (View) obj;
                String[] strArr8 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622(view, R.layout.module_dialog_system_browser, null, false);
                int i3 = R.id.moduleDialogBtnSystemBrowserAdd;
                MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogBtnSystemBrowserAdd);
                if (materialButton != null) {
                    i3 = R.id.moduleDialogEdtSystemBrowserHost;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSystemBrowserHost);
                    if (textInputEditText != null) {
                        i3 = R.id.moduleDialogInputSystemBrowserHost;
                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSystemBrowserHost)) != null) {
                            i3 = R.id.moduleDialogRbSystemBrowserBlack;
                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRbSystemBrowserBlack);
                            if (materialRadioButton != null) {
                                i3 = R.id.moduleDialogRbSystemBrowserWhite;
                                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRbSystemBrowserWhite);
                                if (materialRadioButton2 != null) {
                                    i3 = R.id.moduleDialogRgSystemBrowserMode;
                                    RadioGroup radioGroup = (RadioGroup) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRgSystemBrowserMode);
                                    if (radioGroup != null) {
                                        i3 = R.id.moduleDialogRvSystemBrowserList;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC1272.m3098(viewM4622, R.id.moduleDialogRvSystemBrowserList);
                                        if (recyclerView != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewM4622;
                                            final C1693 c1693 = new C1693(linearLayout, materialButton, textInputEditText, materialRadioButton, materialRadioButton2, radioGroup, recyclerView);
                                            C2939 c2939 = C2939.f9395;
                                            int iM2662 = c2939.m2662();
                                            EnumC2935 enumC2935 = EnumC2935.f9387;
                                            if (iM2662 == enumC2935.f9390) {
                                                materialRadioButton2.setChecked(true);
                                            } else if (iM2662 == EnumC2935.f9388.f9390) {
                                                materialRadioButton.setChecked(true);
                                            }
                                            int iM2663 = c2939.m2662();
                                            final ArrayList arrayList3 = iM2663 == enumC2935.f9390 ? new ArrayList(C2940.f9396.m2665()) : iM2663 == EnumC2935.f9388.f9390 ? new ArrayList(C2938.f9394.m2665()) : new ArrayList();
                                            final C0713 c0713 = new C0713();
                                            c0713.f2720 = arrayList3;
                                            c0713.f2721 = new C2885(arrayList3, z ? 1 : 0, c0713);
                                            view.getContext();
                                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                            recyclerView.setAdapter(c0713);
                                            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᲁᤞᛸᤝ
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                                                    C1693 c1694 = c1693;
                                                    int id = ((MaterialRadioButton) c1694.f5698).getId();
                                                    ArrayList arrayList4 = arrayList3;
                                                    if (i4 == id) {
                                                        arrayList4.clear();
                                                        arrayList4.addAll(new ArrayList(C2940.f9396.m2665()));
                                                    } else if (i4 == ((MaterialRadioButton) c1694.f5696).getId()) {
                                                        arrayList4.clear();
                                                        arrayList4.addAll(new ArrayList(C2938.f9394.m2665()));
                                                    }
                                                    c0713.m4462();
                                                }
                                            });
                                            materialButton.setOnClickListener(new ViewOnClickListenerC0592(c1693, arrayList3, c0713));
                                            C2037 c2037 = new C2037();
                                            C2941.f9397.getClass();
                                            c2037.f6779 = C2941.f9401;
                                            c2037.f6781 = linearLayout;
                                            c2037.m4057("保存", new C0310(c1693, 7, arrayList3));
                                            AbstractC2844.m4788(c2037, null, 3);
                                            return c3554;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i3)));
            case 19:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2644 = c1576.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                String str3 = (String) (c2644 instanceof C2641 ? null : c2644);
                C2952.f9478 = str3 != null ? str3 : "";
                return c3554;
            case 20:
                ((C1023) obj).f3739 = new C2868(22);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                return Boolean.valueOf(((Class) obj).getName().startsWith("com.tencent.mm.ui.chatting.viewitems"));
            case Opcodes.LLOAD /* 22 */:
                C1334 c1339 = (C1334) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1339.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0704 = new C0700();
                c0704.m2220("MicroMsg.TransformComponent", "[onChattingPause]");
                c1339.f4791 = c0704;
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C2868(24);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1335 c13310 = (C1335) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c13310.m3156("com.tencent.mm.sdk.platformtools");
                C2012 c2012 = new C2012();
                if (AbstractC0972.m2596(EnumC3737.f11680) || AbstractC0972.m2597(EnumC3734.f11645)) {
                    c2012.m4021("MicroMsg.BitmapUtil", "saveBitmapToImage failed: %s");
                } else {
                    c2012.m4019("com.tencent.mm.sdk.platformtools.BitmapUtil");
                    c2012.m4020("saveBitmapToImage");
                }
                c13310.f4794 = c2012;
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                int i4 = 2;
                try {
                    c2645 = c1577.m3447()[2];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                if (c2645 instanceof C2641) {
                    c2645 = null;
                }
                if (c2645 == Bitmap.CompressFormat.JPEG) {
                    try {
                        c2646 = c1577.m3447()[3];
                        if (c2646 == null) {
                            c2646 = null;
                        }
                    } catch (Throwable th6) {
                        c2646 = new C2641(th6);
                    }
                    String str4 = (String) (c2646 instanceof C2641 ? null : c2646);
                    String str5 = str4 != null ? str4 : "";
                    String[] strArr11 = AbstractC1471.f5234;
                    if (AbstractC2901.m4861(str5, "avatar", false) || AbstractC2901.m4861(str5, "user_hd_", false)) {
                        new C0383(i4, i2, c1577).m1714(Bitmap.CompressFormat.PNG);
                    }
                }
                return c3554;
            case 26:
                obj.getClass();
                throw new ClassCastException();
            case 27:
                ((C1023) obj).f3740 = new C3563(i2);
                return c3554;
            case 28:
                C1335 c13311 = (C1335) obj;
                String[] strArr12 = AbstractC1471.f5234;
                c13311.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2013 = new C2012();
                c2013.m4021("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c13311.f4794 = c2013;
                return c3554;
            default:
                C1335 c13312 = (C1335) obj;
                String[] strArr13 = AbstractC1471.f5234;
                c13312.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2014 = new C2012();
                c2014.m4021("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c13312.f4794 = c2014;
                return c3554;
        }
    }
}
