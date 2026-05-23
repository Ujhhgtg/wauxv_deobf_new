package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2734 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8807;

    public /* synthetic */ C2734(int i) {
        this.f8807 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2585;
        Object c2586;
        int i = this.f8807;
        int i2 = 8;
        Class<Activity> cls = Activity.class;
        int i3 = 26;
        Class<String> cls2 = String.class;
        int i4 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                ((C1981) obj).m3827("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
                return c3497;
            case 1:
                String[] strArr2 = AbstractC1574.f5469;
                ((C1981) obj).m3827("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
                return c3497;
            case 2:
                String[] strArr3 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_sns_info, null, false);
                int i5 = R.id.moduleDialogCbSnsInfoHideGroupIcon;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbSnsInfoHideGroupIcon);
                if (materialCheckBox != null) {
                    i5 = R.id.moduleDialogEdtSnsInfoTextFormat;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtSnsInfoTextFormat);
                    if (textInputEditText != null) {
                        i5 = R.id.moduleDialogEdtSnsInfoTextPlaceholders;
                        MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtSnsInfoTextPlaceholders);
                        if (materialTextView != null) {
                            i5 = R.id.moduleDialogEdtSnsInfoTimeFormat;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtSnsInfoTimeFormat);
                            if (textInputEditText2 != null) {
                                i5 = R.id.moduleDialogInputSnsInfoTextFormat;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputSnsInfoTextFormat)) != null) {
                                    i5 = R.id.moduleDialogInputSnsInfoTimeFormat;
                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputSnsInfoTimeFormat)) != null) {
                                        C2103 c2103 = new C2103((LinearLayout) viewM4676, materialCheckBox, textInputEditText, materialTextView, textInputEditText2);
                                        textInputEditText.setText(C2739.f8812.m2542());
                                        textInputEditText2.setText(C2740.f8813.m2542());
                                        materialCheckBox.setChecked(C2738.f8811.m2536());
                                        materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                        String[] strArr4 = C2741.f8815;
                                        int length = strArr4.length;
                                        while (i4 < length) {
                                            String str = strArr4[i4];
                                            int length2 = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) (str + ' '));
                                            spannableStringBuilder.setSpan(new C0634(4, str, c2103), length2, spannableStringBuilder.length() + (-1), 33);
                                            i4++;
                                        }
                                        materialTextView.setText(spannableStringBuilder);
                                        C2007 c2007 = new C2007();
                                        C2741.f8814.getClass();
                                        c2007.f6678 = C2741.f8817;
                                        c2007.f6680 = (LinearLayout) c2103.f6935;
                                        int i6 = 14;
                                        c2007.m3870("保存", new C2042(i6, c2103));
                                        c2007.m3869("重置", new C2083(i6));
                                        C2007.m3866(c2007, null, 3);
                                        c2007.m3868().m3791();
                                        return c3497;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i5)));
            case 3:
                ((C1020) obj).f3733 = new C2659(29);
                return c3497;
            case 4:
                ((C1020) obj).f3733 = new C2659(27);
                return c3497;
            case 5:
                ((C1020) obj).f3733 = new C2659(i3);
                return c3497;
            case 6:
                int i7 = AbstractC1745.f5844;
                C1744 c1744M2484 = AbstractC0968.m2484(((C1563) obj).m3268());
                C1299 c1299M3490 = c1744M2484.m3490();
                C2735 c2735 = C2735.f8808;
                c1299M3490.f4725 = AbstractC1574.m3315(c2735).getDeclaringClass();
                Object objInvoke = AbstractC1574.m3315(c2735).invoke(((C1315) AbstractC2784.m4741(c1299M3490)).m3023(), null);
                C1973 c1973M3492 = c1744M2484.m3492();
                String[] strArr5 = AbstractC1574.f5469;
                c1973M3492.f6370 = "getPublishTimeText";
                TextView textView = (TextView) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                C2741.f8814.getClass();
                textView.setText(AbstractC2849.m4857(C2741.m4730(objInvoke), "${originalText}", textView.getText().toString()));
                C1973 c1973M3493 = c1744M2484.m3492();
                c1973M3493.f6370 = "getGroupImageStub";
                View view = (View) ((C1982) AbstractC2784.m4742(c1973M3493)).m3832(new Object[0]);
                if (view != null && (view instanceof ImageView)) {
                    ((ImageView) view).setVisibility(C2738.f8811.m2536() ? 8 : 0);
                }
                return c3497;
            case 7:
                ((C1020) obj).f3733 = new C2734(i2);
                return c3497;
            case 8:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                c1981M4739.m3823(clsM2183 != null ? clsM2183 : String.class);
                String[] strArr6 = AbstractC1574.f5469;
                c1981M4739.m3827("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                c1333.f4794 = c1981M4739;
                return c3497;
            case 9:
                ((C1020) obj).f3733 = new C2734(13);
                return c3497;
            case 10:
                ((C1020) obj).f3733 = new C2734(11);
                return c3497;
            case 11:
                C1333 c1334 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.sns.ui.listener");
                C1981 c1981 = new C1981(4);
                c1981.m3827("delete comment fail!!! snsInfo is null", "send photo fail, mediaObj is null", "mediaObj is null, send failed!");
                c1334.f4794 = c1981;
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                C1563 c1563 = (C1563) obj;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                ContextMenu contextMenu = (ContextMenu) (c2585 instanceof C2585 ? null : c2585);
                for (InterfaceC1600 interfaceC1600 : C2747.f8828) {
                    try {
                        for (C2744 c2744 : interfaceC1600.mo3340()) {
                            contextMenu.add(R.id.MenuItem_Group, c2744.f8822, 0, c2744.f8823);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr8 = AbstractC1574.f5469;
                        sb.append("onCreateMenuItems ");
                        sb.append(interfaceC1600 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1600).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return c3497;
            case 13:
                C1333 c1335 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.sns.ui.listener");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
                c1335.f4794 = c1982;
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                int i8 = 1;
                C1563 c1564 = (C1563) obj;
                String[] strArr10 = AbstractC1574.f5469;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                MenuItem menuItem = (MenuItem) (c2586 instanceof C2585 ? null : c2586);
                for (InterfaceC1600 interfaceC1601 : C2747.f8828) {
                    try {
                        int i9 = AbstractC1745.f5844;
                        C1299 c1299M3491 = AbstractC0968.m2484(c1564.m3268()).m3490();
                        c1299M3491.f4725 = AbstractC2519.m4527(cls);
                        Activity activity = (Activity) ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3024();
                        C1299 c1299M3492 = AbstractC0968.m2484(c1564.m3268()).m3490();
                        AbstractC0750.m2218(c1299M3492.f6373, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.FINAL}, i8));
                        c1299M3492.f4725 = AbstractC2519.m4527(cls2);
                        String str2 = (String) ((C1315) AbstractC0744.m2191(c1299M3492.m3014())).m3024();
                        C2743.f8821.getClass();
                        Object objM4731 = C2743.m4731(str2);
                        C1299 c1299M3493 = AbstractC0968.m2484(c1564.m3268()).m3490();
                        c1299M3493.f4725 = "com.tencent.mm.protocal.protobuf.TimeLineObject";
                        Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M3493.m3014())).m3023();
                        for (C2744 c2745 : interfaceC1601.mo3340()) {
                            if (menuItem.getItemId() == c2745.f8822) {
                                c2745.f8824.mo3133(activity, objM4731, objM3023);
                            }
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1601 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1601).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb2, " Failed", e2, 12);
                    }
                    i8 = 1;
                }
                return c3497;
            case 15:
                return AbstractC2784.m4749("'", (String) obj, '\'');
            case 16:
                ((C1020) obj).f3733 = new C2734(18);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                Object objM3268 = ((C1563) obj).m3268();
                Activity activity2 = (Activity) (objM3268 instanceof Activity ? objM3268 : null);
                if (activity2 == null) {
                    Class<Activity> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2184 != null ? clsM2184 : Activity.class).getName()).toString());
                }
                C2755 c2755 = C2755.f8841;
                String[] strArr11 = AbstractC1574.f5469;
                String str3 = "过滤";
                C2750 c2750 = new C2750(activity2, 0);
                c2755.getClass();
                int i10 = AbstractC1745.f5844;
                C1973 c1973M3494 = AbstractC0968.m2484(activity2).m3492();
                c1973M3494.f6370 = "addTextOptionMenu";
                c1973M3494.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(Integer.TYPE), AbstractC2519.m4527(cls2), AbstractC2519.m4527(MenuItem.OnMenuItemClickListener.class)}, 3));
                c1973M3494.m3732();
                ((C1982) AbstractC0744.m2191(c1973M3494.m3799())).m3831(Integer.valueOf(R.id.MenuItem_Sns_LabelFilter), str3, new MenuItemOnMenuItemClickListenerC2751(0, c2750));
                return c3497;
            case Opcodes.LDC /* 18 */:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1336);
                String[] strArr12 = AbstractC1574.f5469;
                C1981.m3818(c1981M47310, "com.tencent.mm.plugin.mvvmlist.MvvmList");
                Class<Void> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(Void.class));
                c1981M47310.m3824(clsM2185 != null ? clsM2185 : Void.class);
                c1981M47310.m3827("submitRefreshAll");
                c1336.f4794 = c1981M47310;
                return c3497;
            case 19:
                ((C1020) obj).f3733 = new C2734(20);
                return c3497;
            case 20:
                ((C1333) obj).m3052(new C2734(21));
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr13 = AbstractC1574.f5469;
                C1981 c1983 = (C1981) obj;
                Class<String> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                cls2 = clsM2186 != null ? clsM2186 : String.class;
                Class<Integer> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(Integer.class));
                c1983.m3823(cls2, clsM2187 != null ? clsM2187 : Integer.class);
                C1984 c1984 = new C1984(4);
                C1981 c1985 = new C1981(4);
                c1985.m3827("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1984.m3848(c1985);
                C1981 c1986 = new C1981(4);
                c1986.m3827("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1984.m3848(c1986);
                c1983.f6565 = c1984;
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1020) obj).f3733 = new C2734(23);
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                C1333 c1337 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1337);
                Class<String> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                if (clsM2188 == null) {
                    clsM2188 = cls2;
                }
                Class<String> clsM2189 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                c1981M47311.m3823(clsM2188, clsM2189 != null ? clsM2189 : String.class);
                String[] strArr14 = AbstractC1574.f5469;
                c1981M47311.m3827("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback");
                c1337.f4794 = c1981M47311;
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1020) obj).f3732 = new C2734(25);
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1332 c1332 = (C1332) obj;
                c1332.m3051("com.tencent.mm.storage");
                c1332.m3050(new C2734(i3));
                return c3497;
            case 26:
                String[] strArr15 = AbstractC1574.f5469;
                ((C0705) obj).m2127("timeline", "album_friend", "album_self", "album_stranger", "profile_friend", "profile_stranger", "comment", "comment_detail", "other", "snssight", "fts", "storysight", "storyalbum");
                return c3497;
            case 27:
                String[] strArr16 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s");
                return c3497;
            case 28:
                String[] strArr17 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_sns_upload_app_info, null, false);
                int i11 = R.id.moduleDialogEdtSnsUploadAppInfoPhone;
                TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSnsUploadAppInfoPhone);
                if (textInputEditText3 != null) {
                    i11 = R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders;
                    MaterialTextView materialTextView2 = (MaterialTextView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders);
                    if (materialTextView2 != null) {
                        i11 = R.id.moduleDialogEdtSnsUploadAppInfoWindows;
                        TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSnsUploadAppInfoWindows);
                        if (textInputEditText4 != null) {
                            i11 = R.id.moduleDialogInputSnsUploadAppInfoPhone;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputSnsUploadAppInfoPhone)) != null) {
                                i11 = R.id.moduleDialogInputSnsUploadAppInfoWindows;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputSnsUploadAppInfoWindows)) != null) {
                                    C2022 c2022 = new C2022((LinearLayout) viewM4677, textInputEditText3, materialTextView2, textInputEditText4);
                                    textInputEditText3.setText(C2766.f8855.m2542());
                                    textInputEditText4.setText(C2767.f8856.m2542());
                                    materialTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("点击占位符自动填充以下字段:\n");
                                    for (Map.Entry entry : C2768.f8858.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        C2315 c2315 = (C2315) entry.getValue();
                                        int length3 = spannableStringBuilder2.length();
                                        spannableStringBuilder2.append((CharSequence) ("[" + str4 + "] "));
                                        spannableStringBuilder2.setSpan(new C0634(5, c2315, c2022), length3, spannableStringBuilder2.length() + (-1), 33);
                                    }
                                    materialTextView2.setText(spannableStringBuilder2);
                                    C2007 c2008 = new C2007();
                                    C2768.f8857.getClass();
                                    c2008.f6678 = C2768.f8860;
                                    c2008.f6680 = c2022.f6774;
                                    int i12 = 15;
                                    c2008.m3870("保存", new C2042(i12, c2022));
                                    c2008.m3869("重置", new C2083(i12));
                                    C2007.m3866(c2008, null, 3);
                                    c2008.m3868().m3791();
                                    return c3497;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i11)));
            default:
                ((C1020) obj).f3733 = new C2764(i4);
                return c3497;
        }
    }
}
