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
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᛸᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2042 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6825;

    public /* synthetic */ C2042(int i, Object obj) {
        this.f6824 = i;
        this.f6825 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:275:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x017d A[SYNTHETIC] */
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
    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i;
        ?? r11;
        Bundle bundle;
        C2888 c2888;
        CharSequence charSequence;
        String string;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        switch (this.f6824) {
            case 0:
                C2015 c2015 = (C2015) this.f6825;
                C2045.f6828.m2548(String.valueOf(c2015.f6724.getText()));
                C2046.f6829.m2548(String.valueOf(c2015.f6725.getText()));
                C2049.f6832.m2548(String.valueOf(c2015.f6728.getText()));
                C2050.f6833.m2548(String.valueOf(c2015.f6729.getText()));
                C2043.f6826.m2548(String.valueOf(c2015.f6722.getText()));
                C2044.f6827.m2548(String.valueOf(c2015.f6723.getText()));
                C2047.f6830.m2548(String.valueOf(c2015.f6726.getText()));
                C2048.f6831.m2548(String.valueOf(c2015.f6727.getText()));
                return C3497.f10997;
            case 1:
                C2022 c2022 = (C2022) this.f6825;
                C2054.f6841.m2548(String.valueOf(c2022.f6775.getText()));
                C2055.f6842.m2548(String.valueOf(c2022.f6776.getText()));
                return C3497.f10997;
            case 2:
                C2021 c2021 = (C2021) this.f6825;
                C2066.f6862.m2548(String.valueOf(((TextInputEditText) c2021.f6766).getText()));
                C2067.f6863.m2548(String.valueOf(((TextInputEditText) c2021.f6767).getText()));
                C2062.f6858.m2548(String.valueOf(((TextInputEditText) c2021.f6762).getText()));
                C2063.f6859.m2548(String.valueOf(((TextInputEditText) c2021.f6763).getText()));
                C2071.f6867.m2548(String.valueOf(((TextInputEditText) c2021.f6769).getText()));
                C2072.f6868.m2548(String.valueOf(((TextInputEditText) c2021.f6770).getText()));
                C2065 c2065 = C2065.f6861;
                Integer numM4853 = AbstractC2848.m4853(String.valueOf(((TextInputEditText) c2021.f6765).getText()));
                c2065.m2545(numM4853 != null ? numM4853.intValue() : 64);
                C2068 c2068 = C2068.f6864;
                Integer numM4854 = AbstractC2848.m4853(String.valueOf(((TextInputEditText) c2021.f6768).getText()));
                c2068.m2545(numM4854 != null ? numM4854.intValue() : 64);
                C2064 c2064 = C2064.f6860;
                Integer numM4855 = AbstractC2848.m4853(String.valueOf(((TextInputEditText) c2021.f6764).getText()));
                c2064.m2545(numM4855 != null ? numM4855.intValue() : 10);
                C2069.f6865.m2543(((MaterialCheckBox) c2021.f6772).isChecked());
                C2070.f6866.m2543(((MaterialCheckBox) c2021.f6773).isChecked());
                return C3497.f10997;
            case 3:
                C2020 c2020 = (C2020) this.f6825;
                C2093.f6904.m2548(String.valueOf(c2020.f6759.getText()));
                C2095.f6906.m2548(String.valueOf(c2020.f6761.getText()));
                C2092.f6903.m2548(String.valueOf(c2020.f6758.getText()));
                C2094.f6905.m2548(String.valueOf(c2020.f6760.getText()));
                return C3497.f10997;
            case 4:
                C1654 c1654 = (C1654) ((C0542) this.f6825).f2252;
                String str = c1654.f5599;
                int i4 = 3;
                int iM4759 = AbstractC2784.m4759(3);
                if (iM4759 == 0) {
                    i4 = 1;
                } else if (iM4759 == 1) {
                    i4 = 2;
                } else if (iM4759 != 2) {
                    if (iM4759 != 3) {
                        throw new C0761();
                    }
                    i4 = 4;
                }
                C2234 c2234 = new C2234(str, i4);
                String str2 = c1654.f5600;
                if (AbstractC2841.m4836(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    c2234.f7233 = str2;
                }
                String str3 = AbstractC2841.m4836("") ? null : "";
                if (str3 != null) {
                    c2234.f7235 = str3;
                }
                return c2234;
            case 5:
                return new C2239((Context) ((C2103) ((C0542) ((C0542) this.f6825).f2252).f2252).f6935);
            case 6:
                C2103 c2103 = (C2103) ((C0542) this.f6825).f2252;
                Context context = (Context) c2103.f6935;
                String str4 = ((C1654) ((C0542) c2103.f6936).f2252).f5599;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Notification notification = new Notification();
                notification.when = System.currentTimeMillis();
                notification.audioStreamType = -1;
                ArrayList arrayList6 = new ArrayList();
                String str5 = (String) c2103.f6937;
                if (AbstractC2841.m4836(str5)) {
                    str5 = null;
                }
                CharSequence charSequenceM4062 = str5 != null ? AbstractC2205.m4062(str5) : null;
                String str6 = (String) c2103.f6938;
                if (AbstractC2841.m4836(str6)) {
                    str6 = null;
                }
                CharSequence charSequenceM4063 = str6 != null ? AbstractC2205.m4062(str6) : null;
                CharSequence charSequence2 = !AbstractC2841.m4836("") ? "" : null;
                CharSequence charSequenceM4064 = charSequence2 != null ? AbstractC2205.m4062(charSequence2) : null;
                CharSequence charSequence3 = !AbstractC2841.m4836("") ? "" : null;
                CharSequence charSequenceM4065 = charSequence3 != null ? AbstractC2205.m4062(charSequence3) : null;
                CharSequence charSequence4 = !AbstractC2841.m4836("") ? "" : null;
                CharSequence charSequenceM4066 = charSequence4 != null ? AbstractC2205.m4062(charSequence4) : null;
                String str7 = !AbstractC2841.m4836("") ? "" : null;
                String str8 = str7 != null ? str7 : null;
                String str9 = !AbstractC2841.m4836("") ? "" : null;
                String str10 = str9 != null ? str9 : null;
                CharSequence charSequence5 = !AbstractC2841.m4836("") ? "" : null;
                if (charSequence5 != null) {
                    notification.tickerText = AbstractC2205.m4062(charSequence5);
                }
                String str11 = !AbstractC2841.m4836("") ? "" : null;
                if (str11 == null) {
                    str11 = null;
                }
                String str12 = AbstractC2841.m4836("") ? null : "";
                if (str12 == null) {
                    str12 = null;
                }
                AbstractC0156.m1202(23);
                AbstractC0156.m1202(23);
                notification.icon = R.drawable.ic_simple_notification;
                if (((Number) AbstractC0156.f1167.getValue()).intValue() < 26) {
                    notification.defaults = -1;
                    notification.flags |= 1;
                    int iM47510 = AbstractC2784.m4759(3);
                    if (iM47510 == 0) {
                        i = -2;
                    } else if (iM47510 == 1) {
                        i = -1;
                    } else if (iM47510 == 2) {
                        i = 0;
                    } else {
                        if (iM47510 != 3) {
                            throw new C0761();
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
                CharSequence charSequence6 = charSequenceM4066;
                builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequenceM4062).setContentText(charSequenceM4063).setContentInfo(charSequenceM4064).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
                builder.setLargeIcon((Icon) null);
                builder.setSubText(charSequenceM4065).setUsesChronometer(false).setPriority(i);
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw AbstractC1194.m2777(it);
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
                        throw AbstractC1194.m2777(it2);
                    }
                    C0269 c0269 = new C0269(arrayList6.size() + arrayList7.size());
                    c0269.addAll(arrayList7);
                    c0269.addAll(arrayList6);
                    arrayList6 = new ArrayList(c0269);
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
                        throw AbstractC1194.m2777(it4);
                    }
                }
                if (i6 >= 29) {
                    AbstractC1645.m3372(builder);
                    AbstractC1645.m3373(builder);
                }
                if (i6 >= 36) {
                    AbstractC0089.m1083(builder);
                }
                return builder.build();
            case 7:
                String strValueOf = String.valueOf(((C2012) this.f6825).f6709.getText());
                String[] strArr = AbstractC1574.f5469;
                if (strValueOf.endsWith("@chatroom")) {
                    Activity activityM4033 = AbstractC2203.m4033();
                    Intent intent = new Intent();
                    intent.setClassName(activityM4033, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
                    intent.putExtra("RoomInfo_Id", strValueOf);
                    activityM4033.startActivity(intent);
                } else {
                    Activity activityM4034 = AbstractC2203.m4033();
                    Intent intent2 = new Intent();
                    intent2.setClassName(activityM4034, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                    intent2.putExtra("Contact_User", strValueOf);
                    activityM4034.startActivity(intent2);
                }
                return C3497.f10997;
            case 8:
                C2013 c2013 = (C2013) this.f6825;
                C2348.f7540.m2543(c2013.f6712.isChecked());
                C2347.f7539.m2543(c2013.f6711.isChecked());
                C2346.f7538.m2543(c2013.f6710.isChecked());
                return C3497.f10997;
            case 9:
                C2018 c2018 = (C2018) this.f6825;
                C2458.f7803.m2548(String.valueOf(c2018.f6746.getText()));
                C2457.f7802.m2548(String.valueOf(c2018.f6745.getText()));
                return C3497.f10997;
            case 10:
                C2602.f8466.m2544(((C2023) this.f6825).f6777.getValue());
                return C3497.f10997;
            case 11:
                C2022 c2023 = (C2022) this.f6825;
                C2630.f8519.m2548(String.valueOf(c2023.f6775.getText()));
                C2631.f8520.m2548(String.valueOf(c2023.f6776.getText()));
                return C3497.f10997;
            case Opcodes.FCONST_1 /* 12 */:
                C2656 c2656 = (C2656) this.f6825;
                return Integer.valueOf(AbstractC1458.m3161(c2656, c2656.f8569));
            case 13:
                C2675 c2675 = (C2675) this.f6825;
                String[] strArr2 = AbstractC1574.f5469;
                ModuleTabLayout moduleTabLayout = c2675.f8610;
                if (moduleTabLayout == null) {
                    MagicFactory.get(-463401201433268L, strArr2);
                    moduleTabLayout = null;
                }
                C1664 c1664M4044 = AbstractC2203.m4044(0, moduleTabLayout.getTabCount());
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = c1664M4044.iterator();
                while (true) {
                    C1662 c1662 = (C1662) it5;
                    if (!c1662.f5617) {
                        return arrayList8;
                    }
                    int iNextInt = c1662.nextInt();
                    ModuleTabLayout moduleTabLayout2 = c2675.f8610;
                    if (moduleTabLayout2 == null) {
                        MagicFactory.get(-463444151106228L, strArr2);
                        moduleTabLayout2 = null;
                    }
                    if (iNextInt >= 0) {
                        if (iNextInt < moduleTabLayout2.getTabCount()) {
                            c2888 = (C2888) moduleTabLayout2.f9267.get(iNextInt);
                        }
                        charSequence = c2888.f9245;
                        if (charSequence != null) {
                            string = charSequence.toString();
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            string = MagicFactory.get(-463487100779188L, strArr2);
                        }
                        List listM4684 = c2675.m4684(iNextInt);
                        arrayList = new ArrayList(AbstractC0746.m2214(listM4684, 10));
                        i2 = 0;
                        for (Object obj : listM4684) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                AbstractC0745.m2213();
                                throw null;
                            }
                            arrayList.add(new C2669((AbstractC0399) obj, iNextInt, string, i2));
                            i2 = i3;
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!(((C2669) obj2).f8593 instanceof C0395)) {
                                arrayList2.add(obj2);
                            }
                        }
                        AbstractC0750.m2217(arrayList8, arrayList2);
                    } else {
                        moduleTabLayout2.getClass();
                    }
                    c2888 = null;
                    charSequence = c2888.f9245;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = MagicFactory.get(-463487100779188L, strArr2);
                    }
                    List listM4685 = c2675.m4684(iNextInt);
                    arrayList = new ArrayList(AbstractC0746.m2214(listM4685, 10));
                    i2 = 0;
                    while (r9.hasNext()) {
                        i3 = i2 + 1;
                        if (i2 >= 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        arrayList.add(new C2669((AbstractC0399) obj, iNextInt, string, i2));
                        i2 = i3;
                    }
                    arrayList2 = new ArrayList();
                    while (r8.hasNext()) {
                        if (!(((C2669) obj2).f8593 instanceof C0395)) {
                            arrayList2.add(obj2);
                        }
                    }
                    AbstractC0750.m2217(arrayList8, arrayList2);
                }
                break;
            case Opcodes.DCONST_0 /* 14 */:
                C2103 c2104 = (C2103) this.f6825;
                C2739.f8812.m2548(String.valueOf(((TextInputEditText) c2104.f6937).getText()));
                C2740.f8813.m2548(String.valueOf(((TextInputEditText) c2104.f6938).getText()));
                C2738.f8811.m2543(((MaterialCheckBox) c2104.f6936).isChecked());
                return C3497.f10997;
            case 15:
                C2022 c2024 = (C2022) this.f6825;
                C2766.f8855.m2548(String.valueOf(c2024.f6775.getText()));
                C2767.f8856.m2548(String.valueOf(c2024.f6776.getText()));
                return C3497.f10997;
            case 16:
                C0243 c0243 = (C0243) this.f6825;
                int checkedRadioButtonId = ((RadioGroup) c0243.f1406).getCheckedRadioButtonId();
                if (checkedRadioButtonId == ((MaterialRadioButton) c0243.f1404).getId()) {
                    C2771.f8868.m2545(EnumC2770.f8864.f8867);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c0243.f1405).getId()) {
                    C2771.f8868.m2545(EnumC2770.f8865.f8867);
                }
                return C3497.f10997;
            case Opcodes.SIPUSH /* 17 */:
                C2012 c2012 = (C2012) this.f6825;
                C2796 c2796 = C2796.f8922;
                Long lM4854 = AbstractC2848.m4854(String.valueOf(c2012.f6709.getText()));
                c2796.m2546(lM4854 != null ? lM4854.longValue() : 88888L);
                return C3497.f10997;
            case Opcodes.LDC /* 18 */:
                ((C3560) this.f6825).invoke();
                return C3497.f10997;
            default:
                C3620.f11318.m2545((int) ((C2023) this.f6825).f6777.getValue());
                return C3497.f10997;
        }
    }
}
