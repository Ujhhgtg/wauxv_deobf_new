package p000;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᛸᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2143 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f7077;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1285 f7078;

    public /* synthetic */ C2143(String str, C1285 c1285, int i) {
        this.f7076 = i;
        this.f7077 = str;
        this.f7078 = c1285;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        ArrayList arrayList;
        StringBuilder sb;
        char c;
        ArrayList arrayList2;
        C3554 c3554;
        StringBuilder sb2;
        int i = this.f7076;
        char c2 = '(';
        char c3 = ')';
        C3554 c3555 = C3554.UNIT;
        final C1285 c1285 = this.f7078;
        final String str = this.f7077;
        switch (i) {
            case 0:
                C2143 c2143 = new C2143(str, c1285, 1);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c2143, (InterfaceC0841) null));
                return c3555;
            case 1:
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索好友/群聊";
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Cursor cursorM4265 = AbstractC2240.m4265(new EnumC0821[]{EnumC0821.f3221, EnumC0821.f3222});
                if (cursorM4265 != null) {
                    while (cursorM4265.moveToNext()) {
                        try {
                            if (cursorM4265.getString(cursorM4265.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM4698 = AbstractC2727.m4698(cursorM4265);
                                String roomId = groupInfoM4698.getRoomId();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(groupInfoM4698.getName());
                                String remark = groupInfoM4698.getRemark();
                                if (remark.length() <= 0) {
                                    remark = null;
                                }
                                if (remark != null) {
                                    sb3.append(c2 + remark + ')');
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(c2);
                                sb4.append(groupInfoM4698.getGroupData().getMemberCount());
                                sb4.append(')');
                                sb3.append(sb4.toString());
                                C0800 c0800 = new C0800(roomId, sb3.toString(), groupInfoM4698.getRoomId(), false);
                                arrayList5.add(c0800);
                                arrayList4.add(c0800);
                                arrayList2 = arrayList5;
                                c = c2;
                            } else {
                                FriendInfo friendInfoM4697 = AbstractC2727.m4697(cursorM4265);
                                String wxid = friendInfoM4697.getWxid();
                                StringBuilder sb5 = new StringBuilder();
                                String nickname = friendInfoM4697.getNickname();
                                ArrayList arrayList6 = arrayList5;
                                if ((AbstractC2713.m4687(C2579.m4552(new C2579("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                                    sb5.append("已过滤此昵称...");
                                    arrayList3 = arrayList3;
                                } else {
                                    String str2 = nickname.length() > 8 ? nickname : null;
                                    if (str2 != null) {
                                        String strSubstring = str2.substring(0, 8);
                                        "substring(...)";
                                        sb5.append(strSubstring);
                                        sb5.append("...");
                                        sb = sb5;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb5.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM4697.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    c = '(';
                                    sb6.append('(');
                                    sb6.append(remark2);
                                    sb6.append(')');
                                    sb5.append(sb6.toString());
                                } else {
                                    c = '(';
                                }
                                C0800 c0801 = new C0800(wxid, sb5.toString(), friendInfoM4697.getWxid(), false);
                                arrayList2 = arrayList6;
                                arrayList2.add(c0801);
                                arrayList3 = arrayList3;
                                arrayList3.add(c0801);
                            }
                            c2 = c;
                            arrayList5 = arrayList2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3528.m5090(cursorM4265, th);
                                throw th2;
                            }
                        }
                    }
                    arrayList = arrayList5;
                    cursorM4265.close();
                } else {
                    arrayList = arrayList5;
                }
                c0815.m2486(arrayList);
                c0815.m2483("好友", arrayList3);
                c0815.m2483("群聊", arrayList4);
                c0815.f3206 = R.drawable.ic_contact_send_24dp;
                String str3 = "转发";
                final int i2 = 0;
                InterfaceC1437 interfaceC1437 = new InterfaceC1437() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᛸᲁᤝᲇ
                    @Override // p000.InterfaceC1437
                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
                    public final Object mo1342(Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        switch (i2) {
                            case 0:
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C2199.m4148(c1285.f4688, ((C0800) it.next()).f3167, str);
                                }
                                StringBuilder sb7 = new StringBuilder();
                                String[] strArr2 = AbstractC1471.f5234;
                                sb7.append("已转发至");
                                sb7.append(list.size());
                                sb7.append("个会话");
                                AbstractC2894.m4856(null, 3, sb7.toString());
                                break;
                            default:
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C2199.m4148(c1285.f4688, ((C0800) it2.next()).f3167, str);
                                }
                                StringBuilder sb8 = new StringBuilder();
                                String[] strArr3 = AbstractC1471.f5234;
                                sb8.append("已转发至");
                                sb8.append(list.size());
                                sb8.append("个会话");
                                AbstractC2894.m4856(null, 3, sb8.toString());
                                break;
                        }
                        return Boolean.FALSE;
                    }
                };
                c0815.f3209 = str3;
                c0815.f3211 = interfaceC1437;
                return c3555;
            case 2:
                C2143 c2144 = new C2143(str, c1285, 3);
                C1006 c1007 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c2144, (InterfaceC0841) null));
                return c3555;
            default:
                C0815 c0816 = (C0815) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c0816.f3205 = "搜索好友/群聊";
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                Cursor cursorM4266 = AbstractC2240.m4265(new EnumC0821[]{EnumC0821.f3221, EnumC0821.f3222});
                if (cursorM4266 != null) {
                    while (cursorM4266.moveToNext()) {
                        try {
                            C3554 c3556 = c3555;
                            if (cursorM4266.getString(cursorM4266.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM4699 = AbstractC2727.m4698(cursorM4266);
                                String roomId2 = groupInfoM4699.getRoomId();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(groupInfoM4699.getName());
                                String remark3 = groupInfoM4699.getRemark();
                                if (remark3.length() <= 0) {
                                    remark3 = null;
                                }
                                if (remark3 != null) {
                                    sb7.append('(' + remark3 + c3);
                                }
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append('(');
                                sb8.append(groupInfoM4699.getGroupData().getMemberCount());
                                sb8.append(c3);
                                sb7.append(sb8.toString());
                                C0800 c0802 = new C0800(roomId2, sb7.toString(), groupInfoM4699.getRoomId(), false);
                                arrayList9.add(c0802);
                                arrayList8.add(c0802);
                            } else {
                                FriendInfo friendInfoM4698 = AbstractC2727.m4697(cursorM4266);
                                String wxid2 = friendInfoM4698.getWxid();
                                StringBuilder sb9 = new StringBuilder();
                                String nickname2 = friendInfoM4698.getNickname();
                                if ((AbstractC2713.m4687(C2579.m4552(new C2579("\r\n|\r|\n"), nickname2)) > 3 ? nickname2 : null) != null) {
                                    sb9.append("已过滤此昵称...");
                                    wxid2 = wxid2;
                                } else {
                                    String str4 = nickname2.length() > 8 ? nickname2 : null;
                                    if (str4 != null) {
                                        String strSubstring2 = str4.substring(0, 8);
                                        "substring(...)";
                                        sb9.append(strSubstring2);
                                        sb9.append("...");
                                        sb2 = sb9;
                                    } else {
                                        sb2 = null;
                                    }
                                    if (sb2 == null) {
                                        sb9.append(nickname2);
                                    }
                                }
                                String remark4 = friendInfoM4698.getRemark();
                                if (remark4.length() <= 0) {
                                    remark4 = null;
                                }
                                if (remark4 != null) {
                                    sb9.append('(' + remark4 + ')');
                                }
                                C0800 c0803 = new C0800(wxid2, sb9.toString(), friendInfoM4698.getWxid(), false);
                                arrayList9.add(c0803);
                                arrayList7.add(c0803);
                            }
                            c3555 = c3556;
                            c3 = ')';
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC3528.m5090(cursorM4266, th3);
                                throw th4;
                            }
                        }
                    }
                    c3554 = c3555;
                    cursorM4266.close();
                } else {
                    c3554 = c3555;
                }
                c0816.m2486(arrayList9);
                c0816.m2483("好友", arrayList7);
                c0816.m2483("群聊", arrayList8);
                c0816.f3206 = R.drawable.ic_contact_send_24dp;
                String str5 = "转发";
                final int i3 = 1;
                InterfaceC1437 interfaceC1438 = new InterfaceC1437() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᛸᲁᤝᲇ
                    @Override // p000.InterfaceC1437
                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
                    public final Object mo1342(Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        switch (i3) {
                            case 0:
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C2199.m4148(c1285.f4688, ((C0800) it.next()).f3167, str);
                                }
                                StringBuilder sb10 = new StringBuilder();
                                String[] strArr3 = AbstractC1471.f5234;
                                sb10.append("已转发至");
                                sb10.append(list.size());
                                sb10.append("个会话");
                                AbstractC2894.m4856(null, 3, sb10.toString());
                                break;
                            default:
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C2199.m4148(c1285.f4688, ((C0800) it2.next()).f3167, str);
                                }
                                StringBuilder sb11 = new StringBuilder();
                                String[] strArr4 = AbstractC1471.f5234;
                                sb11.append("已转发至");
                                sb11.append(list.size());
                                sb11.append("个会话");
                                AbstractC2894.m4856(null, 3, sb11.toString());
                                break;
                        }
                        return Boolean.FALSE;
                    }
                };
                c0816.f3209 = str5;
                c0816.f3211 = interfaceC1438;
                return c3554;
        }
    }
}
