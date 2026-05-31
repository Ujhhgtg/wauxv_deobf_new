package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤝᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2801 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8981;

    public /* synthetic */ C2801(int i) {
        this.f8981 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        String str;
        Object c2646;
        Object c2647;
        Object c2648;
        Object c2649;
        int i = this.f8981;
        Class<Activity> cls = Activity.class;
        int i2 = 5;
        int i3 = 12;
        int i4 = 17;
        Class<String> cls2 = String.class;
        boolean z = true;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2012M4773.m4017(clsM4232 != null ? clsM4232 : String.class);
                String[] strArr = AbstractC1471.f5234;
                c2012M4773.m4021("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                c1335.f4794 = c2012M4773;
                return c3554;
            case 1:
                ((C1023) obj).f3740 = new C2801(i2);
                return c3554;
            case 2:
                ((C1023) obj).f3740 = new C2801(3);
                return c3554;
            case 3:
                C1335 c1336 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.sns.ui.listener");
                C2012 c2012 = new C2012();
                c2012.m4021("delete comment fail!!! snsInfo is null", "send photo fail, mediaObj is null", "mediaObj is null, send failed!");
                c1336.f4794 = c2012;
                return c3554;
            case 4:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                ContextMenu contextMenu = (ContextMenu) (c2641 instanceof C2641 ? null : c2641);
                for (InterfaceC1613 interfaceC1613 : C2807.f8990) {
                    try {
                        for (C2804 c2804 : interfaceC1613.mo3504()) {
                            contextMenu.add(R.id.MenuItem_Group, c2804.f8984, 0, c2804.f8985);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr3 = AbstractC1471.f5234;
                        sb.append("onCreateMenuItems ");
                        sb.append(interfaceC1613 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1613).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 5:
                C1335 c1337 = (C1335) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.sns.ui.listener");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
                c1337.f4794 = c2013;
                return c3554;
            case 6:
                int i5 = 1;
                C1574 c1575 = (C1574) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                MenuItem menuItem = (MenuItem) (c2642 instanceof C2641 ? null : c2642);
                for (InterfaceC1613 interfaceC1614 : C2807.f8990) {
                    try {
                        int i6 = AbstractC1768.f5906;
                        C1300 c1300M3558 = AbstractC2727.m4713(c1575.m3448()).m3558();
                        c1300M3558.f4724 = AbstractC2574.m4549(cls);
                        Activity activity = (Activity) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127();
                        C1300 c1300M3559 = AbstractC2727.m4713(c1575.m3448()).m3558();
                        AbstractC0745.m2317(c1300M3559.f6478, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.FINAL}, i5));
                        c1300M3559.f4724 = AbstractC2574.m4549(cls2);
                        String str2 = (String) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127();
                        C2803.f8983.getClass();
                        Object objM4765 = C2803.m4765(str2);
                        C1300 c1300M35510 = AbstractC2727.m4713(c1575.m3448()).m3558();
                        c1300M35510.f4724 = "com.tencent.mm.protocal.protobuf.TimeLineObject";
                        Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3126();
                        for (C2804 c2805 : interfaceC1614.mo3504()) {
                            if (menuItem.getItemId() == c2805.f8984) {
                                c2805.f8986.mo2135(activity, objM4765, objM3126);
                            }
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1614 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1614).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                    i5 = 1;
                }
                return c3554;
            case 7:
                return AbstractC2844.m4783("'", (String) obj, '\'');
            case 8:
                ((C1023) obj).f3740 = new C2801(10);
                return c3554;
            case 9:
                Object objM3448 = ((C1574) obj).m3448();
                Activity activity2 = (Activity) (objM3448 instanceof Activity ? objM3448 : null);
                if (activity2 == null) {
                    Class<Activity> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4233 != null ? clsM4233 : Activity.class).getName()).toString());
                }
                C2815 c2815 = C2815.f9003;
                String[] strArr6 = AbstractC1471.f5234;
                String str3 = "过滤";
                C2810 c2810 = new C2810(activity2, 0);
                c2815.getClass();
                int i7 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(activity2).m3560();
                c2004M3560.f6475 = "addTextOptionMenu";
                c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Integer.TYPE), AbstractC2574.m4549(cls2), AbstractC2574.m4549(MenuItem.OnMenuItemClickListener.class)}, 3));
                c2004M3560.m3926();
                ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(Integer.valueOf(R.id.MenuItem_Sns_LabelFilter), str3, new MenuItemOnMenuItemClickListenerC2811(c2810, 0));
                return c3554;
            case 10:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1338);
                String[] strArr7 = AbstractC1471.f5234;
                C2012.m4012(c2012M4774, "com.tencent.mm.plugin.mvvmlist.MvvmList");
                Class<Void> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(Void.class));
                c2012M4774.m4018(clsM4234 != null ? clsM4234 : Void.class);
                c2012M4774.m4021("submitRefreshAll");
                c1338.f4794 = c2012M4774;
                return c3554;
            case 11:
                ((C1023) obj).f3740 = new C2801(i3);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1335) obj).m3155(new C2801(13));
                return c3554;
            case 13:
                String[] strArr8 = AbstractC1471.f5234;
                C2012 c2014 = (C2012) obj;
                Class<String> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                cls2 = clsM4235 != null ? clsM4235 : String.class;
                Class<Integer> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2014.m4017(cls2, clsM4236 != null ? clsM4236 : Integer.class);
                C2015 c2015 = new C2015();
                C2012 c2016 = new C2012();
                c2016.m4021("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c2015.m4042(c2016);
                C2012 c2017 = new C2012();
                c2017.m4021("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c2015.m4042(c2017);
                c2014.f6670 = c2015;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1023) obj).f3740 = new C2801(15);
                return c3554;
            case 15:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c1339);
                Class<String> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                if (clsM4237 == null) {
                    clsM4237 = cls2;
                }
                Class<String> clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2012M4775.m4017(clsM4237, clsM4238 != null ? clsM4238 : String.class);
                String[] strArr9 = AbstractC1471.f5234;
                c2012M4775.m4021("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback");
                c1339.f4794 = c2012M4775;
                return c3554;
            case 16:
                ((C1023) obj).f3739 = new C2801(i4);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1334 c1334 = (C1334) obj;
                c1334.m3154("com.tencent.mm.storage");
                c1334.m3153(new C2801(18));
                return c3554;
            case Opcodes.LDC /* 18 */:
                String[] strArr10 = AbstractC1471.f5234;
                ((C0700) obj).m2220("timeline", "album_friend", "album_self", "album_stranger", "profile_friend", "profile_stranger", "comment", "comment_detail", "other", "snssight", "fts", "storysight", "storyalbum");
                return c3554;
            case 19:
                String[] strArr11 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s");
                return c3554;
            case 20:
                String[] strArr12 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_sns_upload_app_info, null, false);
                int i8 = R.id.moduleDialogEdtSnsUploadAppInfoPhone;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsUploadAppInfoPhone);
                if (textInputEditText != null) {
                    i8 = R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders);
                    if (materialTextView != null) {
                        i8 = R.id.moduleDialogEdtSnsUploadAppInfoWindows;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsUploadAppInfoWindows);
                        if (textInputEditText2 != null) {
                            i8 = R.id.moduleDialogInputSnsUploadAppInfoPhone;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSnsUploadAppInfoPhone)) != null) {
                                i8 = R.id.moduleDialogInputSnsUploadAppInfoWindows;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSnsUploadAppInfoWindows)) != null) {
                                    C2048 c2048 = new C2048((LinearLayout) viewM4622, textInputEditText, materialTextView, textInputEditText2, 6);
                                    textInputEditText.setText(C2825.f9016.m2666());
                                    textInputEditText2.setText(C2826.f9017.m2666());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动填充以下字段:\n");
                                    for (Map.Entry entry : C2827.f9019.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        C2348 c2348 = (C2348) entry.getValue();
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) ("[" + str4 + "] "));
                                        spannableStringBuilder.setSpan(new C0627(c2048, c2348, 5), length, spannableStringBuilder.length() + (-1), 33);
                                        z = z;
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C2037 c2037 = new C2037();
                                    C2827.f9018.getClass();
                                    c2037.f6779 = C2827.f9021;
                                    c2037.f6781 = c2048.f6857;
                                    c2037.m4057("保存", new C2070(c2048, 16));
                                    c2037.m4056("重置", new C2096(i4));
                                    C2037.m4053(c2037, null, 3);
                                    c2037.m4055().m3985();
                                    return c3554;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3740 = new C2801(22);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1335) obj).m3155(new C2801(19));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C1574 c1576 = (C1574) obj;
                C3570 c3570 = C3570.f11167;
                Object objM3449 = c1576.m3448();
                String strM2666 = C2825.f9016.m2666();
                c3570.getClass();
                C3570.m5113(objM3449, strM2666);
                C3570.m5112(c1576.m3448(), C2826.f9017.m2666());
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr13 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.snsMediaStorage", "SnsCompressResolutionFor2G", "SnsCompressResolutionFor3G", "SnsCompressResolutionFor4G", "SnsCompressResolutionForWifi");
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr14 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_sns_upload_original_photo, null, false);
                int i9 = R.id.moduleDialogRbSnsUploadOriginalPhotoConvert;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRbSnsUploadOriginalPhotoConvert);
                if (materialRadioButton != null) {
                    i9 = R.id.moduleDialogRbSnsUploadOriginalPhotoCopy;
                    MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRbSnsUploadOriginalPhotoCopy);
                    if (materialRadioButton2 != null) {
                        i9 = R.id.moduleDialogRgSnsUploadOriginalPhotoMode;
                        RadioGroup radioGroup = (RadioGroup) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRgSnsUploadOriginalPhotoMode);
                        if (radioGroup != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM4623;
                            C1693 c1693 = new C1693(linearLayout, materialRadioButton, materialRadioButton2, radioGroup, 3);
                            int iM2662 = C2830.f9029.m2662();
                            if (iM2662 == EnumC2829.f9025.f9028) {
                                materialRadioButton.setChecked(true);
                            } else if (iM2662 == EnumC2829.f9026.f9028) {
                                materialRadioButton2.setChecked(true);
                            }
                            C2037 c2038 = new C2037();
                            C2831.f9030.getClass();
                            c2038.f6779 = C2831.f9032;
                            c2038.f6781 = linearLayout;
                            c2038.m4057("保存", new C2070(c1693, i4));
                            AbstractC2844.m4788(c2038, null, 3);
                            return c3554;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i9)));
            case 26:
                ((C1023) obj).f3740 = new C2801(29);
                return c3554;
            case 27:
                C1574 c1577 = (C1574) obj;
                if (C2830.f9029.m2662() == EnumC2829.f9025.f9028) {
                    c1577.getClass();
                    try {
                        c2643 = c1577.m3447()[0];
                        if (c2643 == null) {
                            c2643 = null;
                        }
                    } catch (Throwable th3) {
                        c2643 = new C2641(th3);
                    }
                    if (c2643 instanceof C2641) {
                        c2643 = null;
                    }
                    String str5 = (String) c2643;
                    String str6 = str5 == null ? "" : str5;
                    try {
                        c2644 = c1577.m3447()[1];
                        if (c2644 == null) {
                            c2644 = null;
                        }
                    } catch (Throwable th4) {
                        c2644 = new C2641(th4);
                    }
                    if (c2644 instanceof C2641) {
                        c2644 = null;
                    }
                    String str7 = (String) c2644;
                    String str8 = str7 == null ? "" : str7;
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
                    String str9 = (String) c2645;
                    str = str9 != null ? str9 : "";
                    C2819 c2819 = C2819.f9010;
                    String strConcat = str6.concat(str);
                    c2819.getClass();
                    Object objInvoke = AbstractC0972.m2610(C2818.f9009).invoke(null, str8, strConcat);
                    "null cannot be cast to non-null type kotlin.Boolean";
                    Boolean bool = (Boolean) objInvoke;
                    bool.getClass();
                    c1577.m3452(bool);
                }
                return c3554;
            case 28:
                C1574 c1578 = (C1574) obj;
                if (C2830.f9029.m2662() == EnumC2829.f9026.f9028) {
                    c1578.getClass();
                    try {
                        c2646 = c1578.m3447()[0];
                        if (c2646 == null) {
                            c2646 = null;
                        }
                    } catch (Throwable th6) {
                        c2646 = new C2641(th6);
                    }
                    if (c2646 instanceof C2641) {
                        c2646 = null;
                    }
                    String str10 = (String) c2646;
                    String str11 = str10 == null ? "" : str10;
                    try {
                        c2647 = c1578.m3447()[1];
                        if (c2647 == null) {
                            c2647 = null;
                        }
                    } catch (Throwable th7) {
                        c2647 = new C2641(th7);
                    }
                    if (c2647 instanceof C2641) {
                        c2647 = null;
                    }
                    String str12 = (String) c2647;
                    String str13 = str12 == null ? "" : str12;
                    try {
                        c2648 = c1578.m3447()[2];
                        if (c2648 == null) {
                            c2648 = null;
                        }
                    } catch (Throwable th8) {
                        c2648 = new C2641(th8);
                    }
                    if (c2648 instanceof C2641) {
                        c2648 = null;
                    }
                    String str14 = (String) c2648;
                    str = str14 != null ? str14 : "";
                    try {
                        c2649 = c1578.m3447()[3];
                        if (c2649 == null) {
                            c2649 = null;
                        }
                    } catch (Throwable th9) {
                        c2649 = new C2641(th9);
                    }
                    if (c2649 instanceof C2641) {
                        c2649 = null;
                    }
                    Boolean bool2 = (Boolean) c2649;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        File file = new File(str13);
                        C3587 c3587 = C3587.f11196;
                        String strConcat2 = str11.concat(str);
                        c3587.getClass();
                        Object objInvoke2 = AbstractC0972.m2610(C3586.f11195).invoke(null, strConcat2, Boolean.TRUE);
                        "null cannot be cast to non-null type kotlin.String";
                        AbstractC1330.m3145(file, new File((String) objInvoke2));
                    }
                }
                return c3554;
            default:
                ((C1335) obj).m3155(new C2801(24));
                return c3554;
        }
    }
}
