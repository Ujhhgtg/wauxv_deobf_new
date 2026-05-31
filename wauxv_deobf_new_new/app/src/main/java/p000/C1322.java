package p000;

import android.content.Context;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲈᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1322 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4769;

    public /* synthetic */ C1322(int i) {
        this.f4769 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        C1359 c1359;
        int i = this.f4769;
        int i2 = 22;
        int i3 = 27;
        int i4 = 3;
        int i5 = 2;
        int i6 = 10;
        int i7 = 0;
        int i8 = 1;
        C1359 c13510 = null;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1334) obj).m3153(new C1164(i3));
                return c3554;
            case 1:
                C1335 c1335 = (C1335) obj;
                c1335.getClass();
                C2012 c2012 = new C2012();
                C2012.m4013(c2012);
                Class<String> cls = String.class;
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4232 == null) {
                    clsM4232 = cls;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2012, clsM4232, cls);
                c2012.m4017(clsM4774 != null ? clsM4774 : String.class);
                c1335.f4794 = c2012;
                return c3554;
            case 2:
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
                String str = (String) (c2641 instanceof C2641 ? null : c2641);
                if (str == null) {
                    str = "";
                }
                if (str.equals("attachment")) {
                    c1574.m3452(C1324.f4771.m2666());
                }
                return c3554;
            case 3:
                ((C1023) obj).f3740 = new C1322(5);
                return c3554;
            case 4:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1322(7);
                c1023.f3740 = new C1322(8);
                return c3554;
            case 5:
                C1335 c1336 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.finder.feed");
                C2012 c2013 = new C2012();
                c2013.m4021("feed", "menu", "sheet", "holder", "KEY_FINDER_SELF_FLAG");
                c1336.f4794 = c2013;
                return c3554;
            case 6:
                C1574 c1575 = (C1574) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                Object obj2 = c2642 instanceof C2641 ? null : c2642;
                try {
                    c2643 = c1575.m3447()[1];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                MenuItem menuItem = (MenuItem) (c2643 instanceof C2641 ? null : c2643);
                int i9 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                c1300M3558.f4724 = "com.tencent.mm.plugin.finder.storage.FinderItem";
                Object objM3126 = ((C1316) AbstractC2844.m4775(c1300M3558)).m3126();
                C2004 c2004M3560 = AbstractC2727.m4713(objM3126).m3560();
                c2004M3560.f6475 = "getMediaType";
                int iIntValue = ((Number) ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0])).intValue();
                C2004 c2004M3561 = AbstractC2727.m4713(objM3126).m3560();
                c2004M3561.f6475 = "getMediaList";
                List list = (List) ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4026(new Object[0]);
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                for (Object obj3 : list) {
                    int i10 = AbstractC1768.f5906;
                    C2004 c2004M3562 = AbstractC2727.m4713(obj3).m3560();
                    c2004M3562.f6475 = "toJSON";
                    arrayList.add((JSONObject) ((C2013) AbstractC2844.m4776(c2004M3562)).m4026(new Object[0]));
                }
                for (InterfaceC1598 interfaceC1598 : C1339.f4802) {
                    try {
                        for (C1336 c1337 : ((C3673) interfaceC1598).m5225()) {
                            if (menuItem.getItemId() == c1337.f4795) {
                                c1337.f4798.mo1342(Integer.valueOf(iIntValue), arrayList);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList2 = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCreateMenuItems ");
                        sb.append(interfaceC1598 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1598).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 7:
                C1334 c1334 = (C1334) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.plugin.finder.feed");
                C0700 c0700 = new C0700();
                c0700.m2220("Finder.FinderLoaderFeedUIContract.Presenter", "getMoreMenuItemSelectedListener feed ");
                c1334.f4791 = c0700;
                return c3554;
            case 8:
                ((C1335) obj).m3155(new C1322(i6));
                return c3554;
            case 9:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2644 = c1576.m3447()[1];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                ContextMenu contextMenu = (ContextMenu) (c2644 instanceof C2641 ? null : c2644);
                int i11 = AbstractC1768.f5906;
                C1300 c1300M3559 = AbstractC2727.m4713(contextMenu).m3558();
                c1300M3559.f4724 = AbstractC2574.m4549(Context.class);
                AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127());
                C2933 c2933 = new C2933(new C1287(contextMenu, i5));
                for (InterfaceC1598 interfaceC1599 : C1339.f4802) {
                    try {
                        for (C1336 c1338 : ((C3673) interfaceC1599).m5225()) {
                            C2013 c2013M4024 = ((C2013) c2933.getValue()).m4024();
                            c2013M4024.m3542(contextMenu);
                            c2013M4024.m4025(Integer.valueOf(c1338.f4795), c1338.f4796, Integer.valueOf(c1338.f4797));
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr4 = AbstractC1471.f5234;
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1599 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1599).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case 10:
                ((C2012) obj).m4021("getMoreMenuItemSelectedListener feed ");
                return c3554;
            case 11:
                ((C1023) obj).f3740 = new C1322(14);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C1322(13);
                return c3554;
            case 13:
                C1335 c1339 = (C1335) obj;
                c1339.m3156("com.tencent.mm.plugin.finder.feed");
                c1339.m3155(new C1322(18));
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1335 c13310 = (C1335) obj;
                c13310.m3156("com.tencent.mm.plugin.finder.feed");
                c13310.m3155(new C1322(17));
                return c3554;
            case 15:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                try {
                    c2645 = c1577.m3447()[0];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                ContextMenu contextMenu2 = (ContextMenu) (c2645 instanceof C2641 ? null : c2645);
                int i12 = AbstractC1768.f5906;
                C1300 c1300M35510 = AbstractC2727.m4713(contextMenu2).m3558();
                c1300M35510.f4724 = AbstractC2574.m4549(Context.class);
                AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3127());
                C2933 c2934 = new C2933(new C1287(contextMenu2, i4));
                for (InterfaceC1599 interfaceC15910 : C1343.f4810) {
                    try {
                        for (C1340 c1340 : ((C3671) interfaceC15910).m5224()) {
                            C2013 c2013M4025 = ((C2013) c2934.getValue()).m4024();
                            c2013M4025.m3542(contextMenu2);
                            c2013M4025.m4025(Integer.valueOf(c1340.f4803), c1340.f4804, Integer.valueOf(c1340.f4805));
                        }
                    } catch (Exception e3) {
                        ArrayList arrayList4 = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        String[] strArr5 = AbstractC1471.f5234;
                        sb3.append("onCreateMenuItems ");
                        sb3.append(interfaceC15910 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC15910).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e3, 12);
                    }
                }
                return c3554;
            case 16:
                C1574 c1578 = (C1574) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1578.getClass();
                try {
                    c2646 = c1578.m3447()[0];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                MenuItem menuItem2 = (MenuItem) (c2646 instanceof C2641 ? null : c2646);
                int i13 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1578);
                c1300M4772.f4724 = "com.tencent.mm.plugin.finder.model.BaseFinderFeed";
                C1300 c1300M35511 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3126()).m3558();
                c1300M35511.f4724 = "com.tencent.mm.plugin.finder.storage.FinderItem";
                Object objM3127 = ((C1316) AbstractC2844.m4775(c1300M35511)).m3126();
                C2004 c2004M3563 = AbstractC2727.m4713(objM3127).m3560();
                c2004M3563.f6475 = "getMediaType";
                int iIntValue2 = ((Number) ((C2013) AbstractC0739.m2290(c2004M3563.m3993())).m4026(new Object[0])).intValue();
                C2004 c2004M3564 = AbstractC2727.m4713(objM3127).m3560();
                c2004M3564.f6475 = "getMediaList";
                List list2 = (List) ((C2013) AbstractC0739.m2290(c2004M3564.m3993())).m4026(new Object[0]);
                ArrayList arrayList5 = new ArrayList(AbstractC0741.m2313(list2, 10));
                for (Object obj4 : list2) {
                    int i14 = AbstractC1768.f5906;
                    C2004 c2004M3565 = AbstractC2727.m4713(obj4).m3560();
                    c2004M3565.f6475 = "toJSON";
                    arrayList5.add((JSONObject) ((C2013) AbstractC2844.m4776(c2004M3565)).m4026(new Object[0]));
                }
                for (InterfaceC1599 interfaceC15911 : C1343.f4810) {
                    try {
                        for (C1340 c1341 : ((C3671) interfaceC15911).m5224()) {
                            if (menuItem2.getItemId() == c1341.f4803) {
                                c1341.f4806.mo1342(Integer.valueOf(iIntValue2), arrayList5);
                            }
                        }
                    } catch (Exception e4) {
                        ArrayList arrayList6 = C3741.f11709;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onCreateMenuItems ");
                        sb4.append(interfaceC15911 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC15911).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb4, " Failed", e4, 12);
                    }
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C2012 c2014 = (C2012) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c2014.m4020("onCreateMMMenu");
                c2014.m4021("pos is error ");
                return c3554;
            case Opcodes.LDC /* 18 */:
                C2012 c2015 = (C2012) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c2015.m4020("onMMMenuItemSelected");
                c2015.m4021("[getMoreMenuItemSelectedListener] feed ");
                return c3554;
            case 19:
                C1730 c1730 = (C1730) obj;
                c1730.f5853 = true;
                c1730.f5852 = true;
                return c3554;
            case 20:
                String[] strArr9 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_float_action_button, null, false);
                int i15 = R.id.moduleDialogEdtFloatActionButtonFabDarkColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtFloatActionButtonFabDarkColor);
                if (textInputEditText != null) {
                    i15 = R.id.moduleDialogEdtFloatActionButtonFabLightColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtFloatActionButtonFabLightColor);
                    if (textInputEditText2 != null) {
                        i15 = R.id.moduleDialogEdtFloatActionButtonIconDarkColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtFloatActionButtonIconDarkColor);
                        if (textInputEditText3 != null) {
                            i15 = R.id.moduleDialogEdtFloatActionButtonIconLightColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtFloatActionButtonIconLightColor);
                            if (textInputEditText4 != null) {
                                i15 = R.id.moduleDialogInputFloatActionButtonFabDarkColor;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputFloatActionButtonFabDarkColor)) != null) {
                                    i15 = R.id.moduleDialogInputFloatActionButtonFabLightColor;
                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputFloatActionButtonFabLightColor)) != null) {
                                        i15 = R.id.moduleDialogInputFloatActionButtonIconDarkColor;
                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputFloatActionButtonIconDarkColor)) != null) {
                                            i15 = R.id.moduleDialogInputFloatActionButtonIconLightColor;
                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputFloatActionButtonIconLightColor)) != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                C2049 c2049 = new C2049(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, 0);
                                                textInputEditText2.setText(C1365.f4881.m2666());
                                                textInputEditText4.setText(C1367.f4883.m2666());
                                                textInputEditText.setText(C1364.f4880.m2666());
                                                textInputEditText3.setText(C1366.f4882.m2666());
                                                C2037 c2037 = new C2037();
                                                C1369.f4885.getClass();
                                                c2037.f6779 = C1369.f4890;
                                                c2037.f6781 = linearLayout;
                                                c2037.m4057("保存", new C0114(c2049, i2));
                                                c2037.m4056("重置", new C1356(i8));
                                                C2037.m4053(c2037, null, 3);
                                                c2037.m4055().m3985();
                                                return c3554;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i15)));
            case Opcodes.ILOAD /* 21 */:
                C2136 c2136 = new C2136(((View) obj).getContext(), C1368.f4884);
                C1369.f4885.getClass();
                c2136.f7061 = C1369.f4890;
                c2136.f7062 = new C1322(i2);
                c2136.m4094().m2556();
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C2050 c2050 = (C2050) obj;
                String[] strArr10 = AbstractC1471.f5234;
                C1369.f4885.getClass();
                ArrayList arrayList7 = new ArrayList(AbstractC0739.m2300(C1369.m3184(), new C0179(i6)));
                C2571 c2571 = new C2571();
                c2571.f8191 = new C1359(arrayList7, new C1355(c2050, arrayList7, c2571, i7), new C1526(arrayList7, i5, c2571));
                RecyclerView recyclerView = c2050.f6868;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                Object obj5 = c2571.f8191;
                if (obj5 == null) {
                    "adapter";
                    c1359 = null;
                } else {
                    c1359 = (C1359) obj5;
                }
                recyclerView.setAdapter(c1359);
                recyclerView.setItemAnimator(null);
                Object obj6 = c2571.f8191;
                if (obj6 == null) {
                    "adapter";
                } else {
                    c13510 = (C1359) obj6;
                }
                new C1700(new C1360(c13510, arrayList7)).m3579(c2050.f6868);
                c2050.f6867.setOnClickListener(new ViewOnClickListenerC0592(c2050, arrayList7, c2571));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C1322(25);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3740 = new C1322(26);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                ((C1335) obj).m3155(new C1322(i3));
                return c3554;
            case 26:
                C1335 c13311 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c13311);
                C1402.f5044.getClass();
                c2012M4773.m4014(AbstractC0972.m2610(C1400.f5042).getDeclaringClass());
                String[] strArr11 = AbstractC1471.f5234;
                c2012M4773.m4021("MicroMsg.ForceNotifyStorage", "[setting] ");
                c13311.f4794 = c2012M4773;
                return c3554;
            case 27:
                String[] strArr12 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.ForceNotifyStorage", "[isNeedNotify] forcePushId:%s %s");
                return c3554;
            case 28:
                String[] strArr13 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_format_msg_time, null, false);
                int i16 = R.id.moduleDialogEdtFormatMsgTimeTimeFormat;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtFormatMsgTimeTimeFormat);
                if (textInputEditText5 != null) {
                    i16 = R.id.moduleDialogInputFormatMsgTimeTimeFormat;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputFormatMsgTimeTimeFormat)) != null) {
                        i16 = R.id.moduleDialogRbFormatMsgTimeModeDefault;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRbFormatMsgTimeModeDefault);
                        if (materialRadioButton != null) {
                            i16 = R.id.moduleDialogRbFormatMsgTimeModeGone;
                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRbFormatMsgTimeModeGone);
                            if (materialRadioButton2 != null) {
                                i16 = R.id.moduleDialogRbFormatMsgTimeModeVisible;
                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRbFormatMsgTimeModeVisible);
                                if (materialRadioButton3 != null) {
                                    i16 = R.id.moduleDialogRgFormatMsgTimeMode;
                                    if (((RadioGroup) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRgFormatMsgTimeMode)) != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                                        C1691 c1691 = new C1691(linearLayout2, textInputEditText5, materialRadioButton, materialRadioButton2, materialRadioButton3, 3);
                                        int iM2662 = C1407.f5084.m2662();
                                        if (iM2662 == EnumC1406.f5079.f5083) {
                                            materialRadioButton2.setChecked(true);
                                        } else if (iM2662 == EnumC1406.f5080.f5083) {
                                            materialRadioButton.setChecked(true);
                                        } else if (iM2662 == EnumC1406.f5081.f5083) {
                                            materialRadioButton3.setChecked(true);
                                        }
                                        textInputEditText5.setText(C1408.f5085.m2666());
                                        C2037 c2038 = new C2037();
                                        C1409.f5086.getClass();
                                        c2038.f6779 = C1409.f5088;
                                        c2038.f6781 = linearLayout2;
                                        c2038.m4057("保存", new C0114(c1691, 23));
                                        c2038.m4056("重置", new C1356(i5));
                                        C2037.m4053(c2038, null, 3);
                                        c2038.m4055().m3985();
                                        return c3554;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i16)));
            default:
                C1730 c1731 = (C1730) obj;
                c1731.f5853 = true;
                c1731.f5852 = true;
                return c3554;
        }
    }
}
