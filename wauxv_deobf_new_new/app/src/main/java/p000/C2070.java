package p000;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᛸᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2070 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f6936;

    public /* synthetic */ C2070(Object obj, int i) {
        this.f6935 = i;
        this.f6936 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:277:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0164 A[LOOP:1: B:49:0x0156->B:53:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.net.Uri, java.lang.CharSequence[], long[]] */
    /* JADX WARN: Type inference failed for: r11v14 */
    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i;
        ?? r11;
        Bundle bundle;
        C2947 c2947;
        CharSequence charSequence;
        String string;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        switch (this.f6935) {
            case 0:
                C2049 c2049 = (C2049) this.f6936;
                C2072.f6938.m2672(String.valueOf(c2049.f6863.getText()));
                C2074.f6940.m2672(String.valueOf(c2049.f6865.getText()));
                C2071.f6937.m2672(String.valueOf(c2049.f6862.getText()));
                C2073.f6939.m2672(String.valueOf(c2049.f6864.getText()));
                return C3554.UNIT;
            case 1:
                C2044 c2044 = (C2044) this.f6936;
                C2078.f6952.m2672(String.valueOf(c2044.f6828.getText()));
                C2079.f6953.m2672(String.valueOf(c2044.f6829.getText()));
                C2082.f6956.m2672(String.valueOf(((TextInputEditText) c2044.f6832).getText()));
                C2083.f6957.m2672(String.valueOf(((TextInputEditText) c2044.f6833).getText()));
                C2076.f6950.m2672(String.valueOf(c2044.f6826.getText()));
                C2077.f6951.m2672(String.valueOf(c2044.f6827.getText()));
                C2080.f6954.m2672(String.valueOf(((TextInputEditText) c2044.f6830).getText()));
                C2081.f6955.m2672(String.valueOf(((TextInputEditText) c2044.f6831).getText()));
                return C3554.UNIT;
            case 2:
                C2048 c2048 = (C2048) this.f6936;
                C2087.f6965.m2672(String.valueOf(c2048.f6858.getText()));
                C2088.f6966.m2672(String.valueOf(c2048.f6859.getText()));
                return C3554.UNIT;
            case 3:
                C2052 c2052 = (C2052) this.f6936;
                C2101.f6989.m2672(String.valueOf(c2052.f6889.getText()));
                C2102.f6990.m2672(String.valueOf(c2052.f6890.getText()));
                C2097.f6985.m2672(String.valueOf(c2052.f6885.getText()));
                C2098.f6986.m2672(String.valueOf(c2052.f6886.getText()));
                C2106.f6994.m2672(String.valueOf(c2052.f6892.getText()));
                C2107.f6995.m2672(String.valueOf(c2052.f6893.getText()));
                C2100 c2100 = C2100.f6988;
                Integer numM4914 = AbstractC2908.m4914(String.valueOf(c2052.f6888.getText()));
                c2100.m2669(numM4914 != null ? numM4914.intValue() : 64);
                C2103 c2103 = C2103.f6991;
                Integer numM4915 = AbstractC2908.m4914(String.valueOf(c2052.f6891.getText()));
                c2103.m2669(numM4915 != null ? numM4915.intValue() : 64);
                C2099 c2099 = C2099.f6987;
                Integer numM4916 = AbstractC2908.m4914(String.valueOf(c2052.f6887.getText()));
                c2099.m2669(numM4916 != null ? numM4916.intValue() : 10);
                C2104.f6992.m2667(c2052.f6883.isChecked());
                C2105.f6993.m2667(c2052.f6884.isChecked());
                return C3554.UNIT;
            case 4:
                C2049 c20410 = (C2049) this.f6936;
                C2126.f7028.m2672(String.valueOf(c20410.f6863.getText()));
                C2128.f7030.m2672(String.valueOf(c20410.f6865.getText()));
                C2125.f7027.m2672(String.valueOf(c20410.f6862.getText()));
                C2127.f7029.m2672(String.valueOf(c20410.f6864.getText()));
                return C3554.UNIT;
            case 5:
                C1669 c1669 = (C1669) ((C0519) this.f6936).f2208;
                String str = c1669.f5635;
                int i4 = 3;
                int iM4792 = AbstractC2844.m4792(3);
                if (iM4792 == 0) {
                    i4 = 1;
                } else if (iM4792 == 1) {
                    i4 = 2;
                } else if (iM4792 != 2) {
                    if (iM4792 != 3) {
                        throw new C0758();
                    }
                    i4 = 4;
                }
                C2265 c2265 = new C2265(str, i4);
                String str2 = c1669.f5636;
                if (AbstractC2901.m4869(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    c2265.f7353 = str2;
                }
                String str3 = AbstractC2901.m4869("") ? null : "";
                if (str3 != null) {
                    c2265.f7355 = str3;
                }
                return c2265;
            case 6:
                return new C2270((Context) ((C2136) ((C0519) ((C0519) this.f6936).f2208).f2208).f7059);
            case 7:
                C2136 c2136 = (C2136) ((C0519) this.f6936).f2208;
                Context context = (Context) c2136.f7059;
                String str4 = ((C1669) ((C0519) c2136.f7060).f2208).f5635;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Notification notification = new Notification();
                notification.when = System.currentTimeMillis();
                notification.audioStreamType = -1;
                ArrayList arrayList6 = new ArrayList();
                String str5 = (String) c2136.f7061;
                if (AbstractC2901.m4869(str5)) {
                    str5 = null;
                }
                CharSequence charSequenceM3101 = str5 != null ? AbstractC1272.m3101(str5) : null;
                String str6 = (String) c2136.f7062;
                if (AbstractC2901.m4869(str6)) {
                    str6 = null;
                }
                CharSequence charSequenceM3102 = str6 != null ? AbstractC1272.m3101(str6) : null;
                CharSequence charSequence2 = !AbstractC2901.m4869("") ? "" : null;
                CharSequence charSequenceM3103 = charSequence2 != null ? AbstractC1272.m3101(charSequence2) : null;
                CharSequence charSequence3 = !AbstractC2901.m4869("") ? "" : null;
                CharSequence charSequenceM3104 = charSequence3 != null ? AbstractC1272.m3101(charSequence3) : null;
                CharSequence charSequence4 = !AbstractC2901.m4869("") ? "" : null;
                CharSequence charSequenceM3105 = charSequence4 != null ? AbstractC1272.m3101(charSequence4) : null;
                String str7 = !AbstractC2901.m4869("") ? "" : null;
                String str8 = str7 != null ? str7 : null;
                String str9 = !AbstractC2901.m4869("") ? "" : null;
                String str10 = str9 != null ? str9 : null;
                CharSequence charSequence5 = !AbstractC2901.m4869("") ? "" : null;
                if (charSequence5 != null) {
                    notification.tickerText = AbstractC1272.m3101(charSequence5);
                }
                String str11 = !AbstractC2901.m4869("") ? "" : null;
                if (str11 == null) {
                    str11 = null;
                }
                String str12 = AbstractC2901.m4869("") ? null : "";
                if (str12 == null) {
                    str12 = null;
                }
                AbstractC0164.m1348(23);
                AbstractC0164.m1348(23);
                notification.icon = R.drawable.ic_simple_notification;
                if (((Number) AbstractC0164.f1235.getValue()).intValue() < 26) {
                    notification.defaults = -1;
                    notification.flags |= 1;
                    int iM4793 = AbstractC2844.m4792(3);
                    if (iM4793 == 0) {
                        i = -2;
                    } else if (iM4793 == 1) {
                        i = -1;
                    } else if (iM4793 == 2) {
                        i = 0;
                    } else {
                        if (iM4793 != 3) {
                            throw new C0758();
                        }
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                Bundle bundle2 = new Bundle();
                int i5 = Build.VERSION.SDK_INT;
                Notification.Builder builder = new Notification.Builder(context, str4);
                String str13 = str12;
                CharSequence charSequence6 = charSequenceM3105;
                builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequenceM3101).setContentText(charSequenceM3102).setContentInfo(charSequenceM3103).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
                builder.setLargeIcon((Icon) null);
                builder.setSubText(charSequenceM3104).setUsesChronometer(false).setPriority(i);
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw AbstractC1095.m2792(it);
                }
                builder.setShowWhen(true);
                builder.setLocalOnly(false);
                builder.setGroup(str8);
                builder.setSortKey(str11);
                builder.setGroupSummary(false);
                builder.setCategory(str10);
                builder.setColor(0);
                builder.setVisibility(0);
                builder.setPublicVersion(null);
                builder.setSound(notification.sound, notification.audioAttributes);
                if (i5 < 28) {
                    ArrayList arrayList7 = new ArrayList(arrayList4.size());
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        throw AbstractC1095.m2792(it2);
                    }
                    C0279 c0279 = new C0279(arrayList6.size() + arrayList7.size());
                    c0279.addAll(arrayList7);
                    c0279.addAll(arrayList6);
                    arrayList6 = new ArrayList(c0279);
                }
                if (!arrayList6.isEmpty()) {
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        builder.addPerson((String) it3.next());
                    }
                }
                if (arrayList5.size() > 0) {
                    Bundle bundle3 = new Bundle();
                    Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
                    if (bundle4 == null) {
                        bundle4 = new Bundle();
                    }
                    Bundle bundle5 = new Bundle(bundle4);
                    Bundle bundle6 = new Bundle();
                    if (arrayList5.size() > 0) {
                        Integer.toString(0);
                        if (arrayList5.get(0) != null) {
                            throw new ClassCastException();
                        }
                        new Bundle();
                        throw null;
                    }
                    bundle4.putBundle("invisible_actions", bundle6);
                    bundle5.putBundle("invisible_actions", bundle6);
                    bundle3.putBundle("android.car.EXTENSIONS", bundle4);
                    bundle2.putBundle("android.car.EXTENSIONS", bundle5);
                    bundle = bundle3;
                    r11 = 0;
                } else {
                    r11 = 0;
                    bundle = null;
                }
                int i6 = Build.VERSION.SDK_INT;
                builder.setExtras(bundle);
                builder.setRemoteInputHistory(r11);
                builder.setBadgeIconType(0);
                builder.setSettingsText(charSequence6);
                builder.setShortcutId(str13);
                builder.setTimeoutAfter(0L);
                builder.setGroupAlertBehavior(0);
                if (!TextUtils.isEmpty(str4)) {
                    builder.setSound(r11).setDefaults(0).setLights(0, 0, 0).setVibrate(r11);
                }
                if (i6 >= 28) {
                    Iterator it4 = arrayList4.iterator();
                    if (it4.hasNext()) {
                        throw AbstractC1095.m2792(it4);
                    }
                }
                if (i6 >= 29) {
                    AbstractC1659.m3536(builder);
                    AbstractC1659.m3537(builder);
                }
                if (i6 >= 36) {
                    AbstractC0097.m1228(builder);
                }
                return builder.build();
            case 8:
                String strValueOf = String.valueOf(((C2041) this.f6936).f6811.getText());
                String[] strArr = AbstractC1471.f5234;
                if (strValueOf.endsWith("@chatroom")) {
                    Activity activityM3476 = AbstractC1586.m3476();
                    Intent intent = new Intent();
                    intent.setClassName(activityM3476, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
                    intent.putExtra("RoomInfo_Id", strValueOf);
                    activityM3476.startActivity(intent);
                } else {
                    Activity activityM3477 = AbstractC1586.m3476();
                    Intent intent2 = new Intent();
                    intent2.setClassName(activityM3477, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                    intent2.putExtra("Contact_User", strValueOf);
                    activityM3477.startActivity(intent2);
                }
                return C3554.UNIT;
            case 9:
                C2042 c2042 = (C2042) this.f6936;
                C2393.f7670.m2667(c2042.f6816.isChecked());
                C2392.f7669.m2667(c2042.f6815.isChecked());
                C2391.f7668.m2667(c2042.f6814.isChecked());
                return C3554.UNIT;
            case 10:
                C2048 c20411 = (C2048) this.f6936;
                C2510.f7947.m2672(String.valueOf(c20411.f6859.getText()));
                C2509.f7946.m2672(String.valueOf(c20411.f6858.getText()));
                return C3554.UNIT;
            case 11:
                C2661.f8619.m2668(((C2054) this.f6936).f6898.getValue());
                return C3554.UNIT;
            case Opcodes.FCONST_1 /* 12 */:
                C2048 c20412 = (C2048) this.f6936;
                C2691.f8684.m2672(String.valueOf(c20412.f6858.getText()));
                C2692.f8685.m2672(String.valueOf(c20412.f6859.getText()));
                return C3554.UNIT;
            case 13:
                C2717 c2717 = (C2717) this.f6936;
                return Integer.valueOf(AbstractC2235.m4203(c2717, c2717.f8734));
            case Opcodes.DCONST_0 /* 14 */:
                C2735 c2735 = (C2735) this.f6936;
                String[] strArr2 = AbstractC1471.f5234;
                ModuleTabLayout moduleTabLayout = c2735.f8768;
                if (moduleTabLayout == null) {
                    "tabLayout";
                    moduleTabLayout = null;
                }
                C1679 c1679M5348 = AbstractC3744.m5348(0, moduleTabLayout.getTabCount());
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = c1679M5348.iterator();
                while (true) {
                    C1678 c1678 = (C1678) it5;
                    if (!c1678.f5655) {
                        return arrayList8;
                    }
                    int iNextInt = c1678.nextInt();
                    ModuleTabLayout moduleTabLayout2 = c2735.f8768;
                    if (moduleTabLayout2 == null) {
                        "tabLayout";
                        moduleTabLayout2 = null;
                    }
                    if (iNextInt >= 0) {
                        if (iNextInt < moduleTabLayout2.getTabCount()) {
                            c2947 = (C2947) moduleTabLayout2.f9434.get(iNextInt);
                        }
                        charSequence = c2947.f9412;
                        if (charSequence != null) {
                            string = charSequence.toString();
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            string = "";
                        }
                        List listM4718 = c2735.m4718(iNextInt);
                        arrayList = new ArrayList(AbstractC0741.m2313(listM4718, 10));
                        i2 = 0;
                        for (Object obj : listM4718) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                AbstractC0740.m2312();
                                throw null;
                            }
                            arrayList.add(new C2730((AbstractC0374) obj, iNextInt, string, i2));
                            i2 = i3;
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!(((C2730) obj2).f8752 instanceof C0370)) {
                                arrayList2.add(obj2);
                            }
                        }
                        AbstractC0745.m2316(arrayList8, arrayList2);
                    } else {
                        moduleTabLayout2.getClass();
                    }
                    c2947 = null;
                    charSequence = c2947.f9412;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    List listM4719 = c2735.m4718(iNextInt);
                    arrayList = new ArrayList(AbstractC0741.m2313(listM4719, 10));
                    i2 = 0;
                    while (r9.hasNext()) {
                        i3 = i2 + 1;
                        if (i2 >= 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        arrayList.add(new C2730((AbstractC0374) obj, iNextInt, string, i2));
                        i2 = i3;
                    }
                    arrayList2 = new ArrayList();
                    while (r8.hasNext()) {
                        if (!(((C2730) obj2).f8752 instanceof C0370)) {
                            arrayList2.add(obj2);
                        }
                    }
                    AbstractC0745.m2316(arrayList8, arrayList2);
                }
                break;
            case 15:
                C1693 c1693 = (C1693) this.f6936;
                C2798.f8973.m2672(String.valueOf(((TextInputEditText) c1693.f5696).getText()));
                C2799.f8974.m2672(String.valueOf(((TextInputEditText) c1693.f5698).getText()));
                C2797.f8972.m2667(((MaterialCheckBox) c1693.f5697).isChecked());
                return C3554.UNIT;
            case 16:
                C2048 c20413 = (C2048) this.f6936;
                C2825.f9016.m2672(String.valueOf(c20413.f6858.getText()));
                C2826.f9017.m2672(String.valueOf(c20413.f6859.getText()));
                return C3554.UNIT;
            case Opcodes.SIPUSH /* 17 */:
                C1693 c1694 = (C1693) this.f6936;
                int checkedRadioButtonId = ((RadioGroup) c1694.f5698).getCheckedRadioButtonId();
                if (checkedRadioButtonId == ((MaterialRadioButton) c1694.f5697).getId()) {
                    C2830.f9029.m2669(EnumC2829.f9025.f9028);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c1694.f5696).getId()) {
                    C2830.f9029.m2669(EnumC2829.f9026.f9028);
                }
                return C3554.UNIT;
            case Opcodes.LDC /* 18 */:
                C2041 c2041 = (C2041) this.f6936;
                C2856 c2856 = C2856.f9084;
                Long lM4915 = AbstractC2908.m4915(String.valueOf(c2041.f6811.getText()));
                c2856.m2670(lM4915 != null ? lM4915.longValue() : 88888L);
                return C3554.UNIT;
            case 19:
                ((C3619) this.f6936).invoke();
                return C3554.UNIT;
            default:
                C3679.f11466.m2669((int) ((C2054) this.f6936).f6898.getValue());
                return C3554.UNIT;
        }
    }
}
