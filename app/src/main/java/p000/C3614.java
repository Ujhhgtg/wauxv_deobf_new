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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤞᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3614 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f11305;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11306;

    public /* synthetic */ C3614(String str, int i, int i2) {
        this.f11304 = i2;
        this.f11305 = str;
        this.f11306 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        switch (this.f11304) {
            case 0:
                C3614 c3614 = new C3614(this.f11305, this.f11306, 1);
                C0815 c0815 = new C0815();
                C0816 c0816 = new C0816(c0815);
                c3614.invoke(c0816);
                c0815.f3181 = c0816;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                break;
            default:
                C0816 c0817 = (C0816) obj;
                String[] strArr = AbstractC1574.f5469;
                c0817.f3198 = "搜索好友/群聊";
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Cursor cursorM4041 = AbstractC2203.m4041(new EnumC0822[]{EnumC0822.f3214, EnumC0822.f3215});
                if (cursorM4041 != null) {
                    while (cursorM4041.moveToNext()) {
                        try {
                            if (cursorM4041.getString(cursorM4041.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM2177 = AbstractC0743.m2177(cursorM4041);
                                String roomId = groupInfoM2177.getRoomId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(groupInfoM2177.getName());
                                String remark = groupInfoM2177.getRemark();
                                String str = remark.length() > 0 ? remark : null;
                                if (str != null) {
                                    sb2.append('(' + str + ')');
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append('(');
                                sb3.append(groupInfoM2177.getGroupData().getMemberCount());
                                sb3.append(')');
                                sb2.append(sb3.toString());
                                C0801 c0801 = new C0801(roomId, sb2.toString(), groupInfoM2177.getRoomId(), false);
                                arrayList3.add(c0801);
                                arrayList2.add(c0801);
                            } else {
                                FriendInfo friendInfoM2176 = AbstractC0743.m2176(cursorM4041);
                                String wxid = friendInfoM2176.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM2176.getNickname();
                                if ((AbstractC2652.m4653(C2523.m4530(new C2523("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                                    sb4.append("已过滤此昵称...");
                                } else {
                                    String str2 = nickname.length() > 8 ? nickname : null;
                                    if (str2 != null) {
                                        String strSubstring = str2.substring(0, 8);
                                        "substring(...)";
                                        sb4.append(strSubstring);
                                        sb4.append("...");
                                        sb = sb4;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb4.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM2176.getRemark();
                                String str3 = remark2.length() > 0 ? remark2 : null;
                                if (str3 != null) {
                                    sb4.append('(' + str3 + ')');
                                }
                                C0801 c0802 = new C0801(wxid, sb4.toString(), friendInfoM2176.getWxid(), false);
                                arrayList3.add(c0802);
                                arrayList.add(c0802);
                            }
                            break;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1458.m3154(cursorM4041, th);
                                throw th2;
                            }
                        }
                    }
                    cursorM4041.close();
                }
                c0817.m2370(arrayList3);
                c0817.m2367("好友", arrayList);
                c0817.m2367("群聊", arrayList2);
                c0817.f3199 = R.drawable.ic_contact_send_24dp;
                String str4 = "转发";
                final String str5 = this.f11305;
                final int i = this.f11306;
                InterfaceC1429 interfaceC1429 = new InterfaceC1429() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤞᤝᛸᲇ
                    @Override // p000.InterfaceC1429
                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
                    public final Object mo1196(Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
                        List list = (List) obj2;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C1133.m2721(i, ((C0801) it.next()).f3160, str5);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        String[] strArr2 = AbstractC1574.f5469;
                        sb5.append("已转发至");
                        sb5.append(list.size());
                        sb5.append("个会话");
                        AbstractC2834.m4823(null, 3, sb5.toString());
                        return Boolean.FALSE;
                    }
                };
                c0817.f3202 = "转发";
                c0817.f3204 = interfaceC1429;
                break;
        }
        return Unit.INSTANCE;
    }
}
