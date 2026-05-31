package p000;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.hd.wauxv.data.bean.db.ChatRoomInfo;
import me.hd.wauxv.data.bean.db.RContactInfo;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupData;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2727 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String[] f8747 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2135 f8748 = new C2135(14);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4691(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4692(Object obj) {
        m4693(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4693(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m4694(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM2802 = AbstractC1095.m2802(i, "radix ", " was not in valid range ");
            sbM2802.append(new C1679(2, 36, 1));
            throw new IllegalArgumentException(sbM2802.toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static ChatRoomInfo m4695(Cursor cursor) {
        String[] strArr = AbstractC1471.f5234;
        String string = cursor.getString(cursor.getColumnIndex("chatroomname"));
        long j = cursor.getLong(cursor.getColumnIndex("addtime"));
        long j2 = cursor.getLong(cursor.getColumnIndex("modifytime"));
        long j3 = cursor.getLong(cursor.getColumnIndex("chatroomnoticePublishTime"));
        String string2 = cursor.getString(cursor.getColumnIndex("memberlist"));
        String string3 = cursor.getString(cursor.getColumnIndex("displayname"));
        String string4 = cursor.getString(cursor.getColumnIndex("chatroomnick"));
        String string5 = cursor.getString(cursor.getColumnIndex("roomowner"));
        String string6 = cursor.getString(cursor.getColumnIndex("selfDisplayName"));
        String string7 = cursor.getString(cursor.getColumnIndex("chatroomnotice"));
        String string8 = cursor.getString(cursor.getColumnIndex("xmlChatroomnotice"));
        String string9 = cursor.getString(cursor.getColumnIndex("chatroomnoticeEditor"));
        String string10 = cursor.getString(cursor.getColumnIndex("associateOpenIMRoomName"));
        String string11 = cursor.getString(cursor.getColumnIndex("saveByteVersion"));
        String string12 = cursor.getString(cursor.getColumnIndex("handleByteVersion"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("roomdata"));
        byte[] blob2 = cursor.getBlob(cursor.getColumnIndex("roomInfoDetailResByte"));
        byte[] blob3 = cursor.getBlob(cursor.getColumnIndex("localChatRoomWatchMembers"));
        int i = cursor.getInt(cursor.getColumnIndex("roomflag"));
        int i2 = cursor.getInt(cursor.getColumnIndex("isShowname"));
        int i3 = cursor.getInt(cursor.getColumnIndex("style"));
        int i4 = cursor.getInt(cursor.getColumnIndex("chatroomdataflag"));
        int i5 = cursor.getInt(cursor.getColumnIndex("chatroomVersion"));
        int i6 = cursor.getInt(cursor.getColumnIndex("chatroomNoticeNew"));
        int i7 = cursor.getInt(cursor.getColumnIndex("chatroomStatus"));
        int i8 = cursor.getInt(cursor.getColumnIndex("memberCount"));
        int i9 = cursor.getInt(cursor.getColumnIndex("openIMRoomMigrateStatus"));
        int i10 = cursor.getInt(cursor.getColumnIndex("oldChatroomVersion"));
        int i11 = cursor.getInt(cursor.getColumnIndex("spamStatus"));
        return new ChatRoomInfo(string, Long.valueOf(j), Long.valueOf(j2), j3, cursor.getLong(cursor.getColumnIndex("chatroomfamilystatusmodifytime")), string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, blob, blob2, blob3, i, i2, i3, i4, i7, i9, i11, i5, i6, cursor.getLong(cursor.getColumnIndex("chatroomLocalVersion")), i8, i10, cursor.getLong(cursor.getColumnIndex("compactFlag")));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static RContactInfo m4696(Cursor cursor) {
        String[] strArr = AbstractC1471.f5234;
        String string = cursor.getString(cursor.getColumnIndex("username"));
        String string2 = cursor.getString(cursor.getColumnIndex("alias"));
        String string3 = cursor.getString(cursor.getColumnIndex("conRemark"));
        String string4 = cursor.getString(cursor.getColumnIndex("domainList"));
        String string5 = cursor.getString(cursor.getColumnIndex("nickname"));
        String string6 = cursor.getString(cursor.getColumnIndex("pyInitial"));
        String string7 = cursor.getString(cursor.getColumnIndex("quanPin"));
        int i = cursor.getInt(cursor.getColumnIndex("showHead"));
        int i2 = cursor.getInt(cursor.getColumnIndex("type"));
        long j = cursor.getLong(cursor.getColumnIndex("uiType"));
        int i3 = cursor.getInt(cursor.getColumnIndex("weiboFlag"));
        String string8 = cursor.getString(cursor.getColumnIndex("weiboNickname"));
        String string9 = cursor.getString(cursor.getColumnIndex("conRemarkPYFull"));
        String string10 = cursor.getString(cursor.getColumnIndex("conRemarkPYShort"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("lvbuff"));
        int i4 = cursor.getInt(cursor.getColumnIndex("verifyFlag"));
        String string11 = cursor.getString(cursor.getColumnIndex("encryptUsername"));
        int i5 = cursor.getInt(cursor.getColumnIndex("chatroomFlag"));
        int i6 = cursor.getInt(cursor.getColumnIndex("deleteFlag"));
        String string12 = cursor.getString(cursor.getColumnIndex("contactLabelIds"));
        String string13 = cursor.getString(cursor.getColumnIndex("descWordingId"));
        String string14 = cursor.getString(cursor.getColumnIndex("openImAppid"));
        String string15 = cursor.getString(cursor.getColumnIndex("sourceExtInfo"));
        String string16 = cursor.getString(cursor.getColumnIndex("ticket"));
        long j2 = cursor.getLong(cursor.getColumnIndex("usernameFlag"));
        byte[] blob2 = cursor.getBlob(cursor.getColumnIndex("contactExtra"));
        int columnIndex = cursor.getColumnIndex("createTime");
        return new RContactInfo(string, string2, string3, string4, string5, string6, string7, i, i2, j, i3, string8, string9, string10, blob, i4, string11, i5, i6, string12, string13, string14, string15, string16, j2, blob2, columnIndex != -1 ? cursor.getLong(columnIndex) : 0L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static FriendInfo m4697(Cursor cursor) {
        RContactInfo rContactInfoM4696 = m4696(cursor);
        return new FriendInfo(rContactInfoM4696.getUsername(), rContactInfoM4696.getAlias(), rContactInfoM4696.getConRemark(), rContactInfoM4696.getNickname(), rContactInfoM4696.getType(), rContactInfoM4696.getSourceExtInfo(), rContactInfoM4696.getCreateTime());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static GroupInfo m4698(Cursor cursor) throws IOException {
        GroupData groupData;
        RContactInfo rContactInfoM4696 = m4696(cursor);
        String username = rContactInfoM4696.getUsername();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("select * from chatroom where chatroomname = '");
        sb.append(username);
        sb.append('\'');
        Cursor cursorM2863 = C1139.m2863(sb.toString());
        cursorM2863.moveToFirst();
        try {
            int count = cursorM2863.getCount();
            Map linkedHashMap = C1192.f4327;
            List listM2305 = C1191.f4326;
            if (count == 0) {
                groupData = new GroupData("", listM2305, listM2305, 0, linkedHashMap, "", "", "", "", 0L);
            } else {
                ChatRoomInfo chatRoomInfoM4695 = m4695(cursorM2863);
                List listM2306 = AbstractC0739.m2305(AbstractC2901.m4876(chatRoomInfoM4695.getMemberlist(), new String[]{";"}));
                String displayname = chatRoomInfoM4695.getDisplayname();
                if (displayname != null) {
                    listM2305 = AbstractC0739.m2305(AbstractC2901.m4876(displayname, new String[]{"、"}));
                }
                List list = listM2305;
                if (chatRoomInfoM4695.getMemberCount() > 0) {
                    ArrayList<C2348> arrayListM2309 = AbstractC0739.m2309(listM2306, list);
                    int iM3872 = AbstractC1924.m3872(AbstractC0741.m2313(arrayListM2309, 10));
                    if (iM3872 < 16) {
                        iM3872 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM3872);
                    for (C2348 c2348 : arrayListM2309) {
                        linkedHashMap.put(c2348.f7567, c2348.f7568);
                    }
                }
                Map map = linkedHashMap;
                String chatroomname = chatRoomInfoM4695.getChatroomname();
                int memberCount = chatRoomInfoM4695.getMemberCount();
                String selfDisplayName = chatRoomInfoM4695.getSelfDisplayName();
                if (selfDisplayName == null) {
                    Object objM2364 = C0770.m2364(C0770.f2874, EnumC3575.f11176.f11180);
                    "null cannot be cast to non-null type kotlin.String";
                    selfDisplayName = (String) objM2364;
                }
                String str = selfDisplayName;
                String roomowner = chatRoomInfoM4695.getRoomowner();
                if (roomowner == null) {
                    roomowner = "未知";
                }
                String str2 = roomowner;
                String chatroomnotice = chatRoomInfoM4695.getChatroomnotice();
                if (chatroomnotice == null) {
                    chatroomnotice = "暂无群公告";
                }
                String str3 = chatroomnotice;
                String chatroomnoticeEditor = chatRoomInfoM4695.getChatroomnoticeEditor();
                if (chatroomnoticeEditor == null) {
                    chatroomnoticeEditor = "未知";
                }
                groupData = new GroupData(chatroomname, listM2306, list, memberCount, map, str, str2, str3, chatroomnoticeEditor, chatRoomInfoM4695.getChatroomnoticePublishTime());
            }
            cursorM2863.close();
            return new GroupInfo(rContactInfoM4696.getUsername(), rContactInfoM4696.getConRemark(), rContactInfoM4696.getNickname(), groupData);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(cursorM2863, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final boolean m4699(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C3699 m4700(C0792 c0792, int i, ArrayList arrayList, C3699 c3699) {
        int i2;
        int i3 = i == 0 ? c0792.f3139 : c0792.f3140;
        if (i3 != -1 && (c3699 == null || i3 != c3699.f11531)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C3699 c36910 = (C3699) arrayList.get(i4);
                if (c36910.f11531 == i3) {
                    if (c3699 != null) {
                        c3699.m5232(i, c36910);
                        arrayList.remove(c3699);
                    }
                    c3699 = c36910;
                    break;
                }
            }
        } else if (i3 != -1) {
            return c3699;
        }
        if (c3699 == null) {
            if (c0792 instanceof AbstractC1544) {
                AbstractC1544 abstractC1544 = (AbstractC1544) c0792;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC1544.f5399) {
                        i2 = -1;
                        break;
                    }
                    C0792 c0793 = abstractC1544.f5398[i5];
                    if ((i == 0 && (i2 = c0793.f3139) != -1) || (i == 1 && (i2 = c0793.f3140) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C3699 c36911 = (C3699) arrayList.get(i6);
                        if (c36911.f11531 == i2) {
                            c3699 = c36911;
                            break;
                        }
                    }
                }
            }
            if (c3699 == null) {
                c3699 = new C3699();
                c3699.f11530 = new ArrayList();
                c3699.f11533 = null;
                c3699.f11534 = -1;
                int i7 = C3699.f11529;
                C3699.f11529 = i7 + 1;
                c3699.f11531 = i7;
                c3699.f11532 = i;
            }
            arrayList.add(c3699);
        }
        int i8 = c3699.f11531;
        ArrayList arrayList2 = c3699.f11530;
        if (arrayList2.contains(c0792)) {
            return c3699;
        }
        arrayList2.add(c0792);
        if (c0792 instanceof C1518) {
            C1518 c1518 = (C1518) c0792;
            c1518.f5351.m2387(c1518.f5352 == 0 ? 1 : 0, c3699, arrayList);
        }
        if (i == 0) {
            c0792.f3139 = i8;
            c0792.f3108.m2387(i, c3699, arrayList);
            c0792.f3110.m2387(i, c3699, arrayList);
        } else {
            c0792.f3140 = i8;
            c0792.f3109.m2387(i, c3699, arrayList);
            c0792.f3112.m2387(i, c3699, arrayList);
            c0792.f3111.m2387(i, c3699, arrayList);
        }
        c0792.f3115.m2387(i, c3699, arrayList);
        return c3699;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static float m4701(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1138.m2852(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static String m4702() {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("mm");
        String str = "system_config_prefs";
        String str2 = "default_uin";
        C1576.f5470.getClass();
        SharedPreferences sharedPreferences = C1576.m3456().getSharedPreferences(str, 0);
        C0702 c0702M4549 = AbstractC2574.m4549(Integer.class);
        String string = null;
        if (c0702M4549.equals(AbstractC2574.m4549(String.class))) {
            Object string2 = sharedPreferences.getString(str2, null);
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            numValueOf = (Integer) string2;
        } else if (c0702M4549.equals(AbstractC2574.m4549(Integer.TYPE))) {
            numValueOf = Integer.valueOf(sharedPreferences.getInt(str2, 0));
        } else if (c0702M4549.equals(AbstractC2574.m4549(Boolean.TYPE))) {
            numValueOf = (Integer) Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
        } else if (c0702M4549.equals(AbstractC2574.m4549(Float.TYPE))) {
            numValueOf = (Integer) Float.valueOf(sharedPreferences.getFloat(str2, 0.0f));
        } else {
            if (!c0702M4549.equals(AbstractC2574.m4549(Long.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            numValueOf = (Integer) Long.valueOf(sharedPreferences.getLong(str2, 0L));
        }
        sb.append(numValueOf.intValue());
        byte[] bytes = sb.toString().getBytes(AbstractC0580.UTF_8);
        "getBytes(...)";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.getDefault());
                "toUpperCase(...)";
                if (upperCase.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(upperCase);
            }
            string = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        "toLowerCase(...)";
        StringBuilder sb2 = new StringBuilder();
        C1576.f5470.getClass();
        sb2.append(C1576.m3456().getDataDir().getAbsolutePath());
        sb2.append("/MicroMsg/");
        sb2.append(lowerCase);
        sb2.append('/');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean m4703(InterfaceC3507 interfaceC3507, InterfaceC3507 interfaceC3508) {
        C3505 type = interfaceC3507.getType();
        C3505 type2 = interfaceC3508.getType();
        if (type.equals(type2)) {
            return true;
        }
        int i = type.f11065;
        int i2 = type2.f11065;
        if (i == 10) {
            type = C3505.f11042;
            i = 9;
        }
        if (i2 == 10) {
            type2 = C3505.f11042;
            i2 = 9;
        }
        if (i != 9 || i2 != 9) {
            return type.m5035() && type2.m5035();
        }
        C3505 c3505 = C3505.f11035;
        if (type == c3505) {
            return false;
        }
        if (type2 == c3505 || type == C3505.f11042) {
            return true;
        }
        if (!type.m5032()) {
            return !type2.m5032() || type == C3505.f11043 || type == C3505.f11038;
        }
        if (!type2.m5032()) {
            return false;
        }
        do {
            type = type.m5030();
            type2 = type2.m5030();
            if (!type.m5032()) {
                break;
            }
        } while (type2.m5032());
        return m4703(type, type2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean m4704(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C2320 m4705(C2320 c2320, C2320 c2321) {
        InterfaceC3507[] interfaceC3507Arr = c2320.f7501;
        if (c2320 != c2321) {
            int length = interfaceC3507Arr.length;
            if (c2321.f7501.length != length) {
                throw new C2766("mismatched maxLocals values", null);
            }
            C2320 c2322 = null;
            for (int i = 0; i < length; i++) {
                InterfaceC3507 interfaceC3507 = interfaceC3507Arr[i];
                InterfaceC3507 interfaceC3507M4707 = m4707(interfaceC3507, c2321.f7501[i]);
                if (interfaceC3507M4707 != interfaceC3507) {
                    if (c2322 == null) {
                        c2322 = new C2320(interfaceC3507Arr.length);
                        System.arraycopy(interfaceC3507Arr, 0, c2322.f7501, 0, interfaceC3507Arr.length);
                    }
                    if (interfaceC3507M4707 == null) {
                        c2322.m4109();
                        c2322.f7501[i] = null;
                    } else {
                        c2322.mo3772(i, interfaceC3507M4707);
                    }
                }
            }
            if (c2322 != null) {
                c2322.f7068 = false;
                return c2322;
            }
        }
        return c2320;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static C1244 m4706(C1244 c1244, C1244 c1245) {
        if (c1244 == c1245) {
            return c1244;
        }
        int i = c1244.f4506;
        if (c1245.f4506 != i) {
            throw new C2766("mismatched stack depths", null);
        }
        C1244 c1244M3016 = null;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC3507 interfaceC3507M3017 = c1244.m3017(i2);
            InterfaceC3507 interfaceC3507M3018 = c1245.m3017(i2);
            InterfaceC3507 interfaceC3507M4707 = m4707(interfaceC3507M3017, interfaceC3507M3018);
            if (interfaceC3507M4707 != interfaceC3507M3017) {
                if (c1244M3016 == null) {
                    c1244M3016 = c1244.m3016();
                }
                if (interfaceC3507M4707 == null) {
                    throw new C2766("incompatible: " + interfaceC3507M3017 + ", " + interfaceC3507M3018, null);
                }
                try {
                    c1244M3016.m3015(i2, interfaceC3507M4707);
                } catch (C2766 e) {
                    e.m3004("...while merging stack[" + AbstractC2902.m4906(i2) + "]");
                    throw e;
                }
                e.m3004("...while merging stack[" + AbstractC2902.m4906(i2) + "]");
                throw e;
            }
        }
        if (c1244M3016 == null) {
            return c1244;
        }
        c1244M3016.f7068 = false;
        return c1244M3016;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static InterfaceC3507 m4707(InterfaceC3507 interfaceC3507, InterfaceC3507 interfaceC3508) {
        if (interfaceC3507 == null || interfaceC3507.equals(interfaceC3508)) {
            return interfaceC3507;
        }
        if (interfaceC3508 == null) {
            return null;
        }
        C3505 type = interfaceC3507.getType();
        C3505 type2 = interfaceC3508.getType();
        if (type == type2) {
            return type;
        }
        if (!type.m5036() || !type2.m5036()) {
            if (type.m5035() && type2.m5035()) {
                return C3505.f11031;
            }
            return null;
        }
        C3505 c3505 = C3505.f11035;
        if (type == c3505) {
            return type2;
        }
        if (type2 == c3505) {
            return type;
        }
        if (!type.m5032() || !type2.m5032()) {
            return C3505.f11042;
        }
        InterfaceC3507 interfaceC3507M4707 = m4707(type.m5030(), type2.m5030());
        return interfaceC3507M4707 == null ? C3505.f11042 : ((C3505) interfaceC3507M4707).m5027();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static Set m4708(Set set, Set set2) {
        if (set2.isEmpty()) {
            return AbstractC0739.m2308(set);
        }
        if (!(set2 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(set2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!set2.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m4709(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static float m4710(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1138.m2853(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static C1681 m4711(InterfaceC1760 interfaceC1760) {
        return new C1681(C1224.m2968(15, ((InterfaceC0692) interfaceC1760).mo2209(), null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static C1681 m4712(Class cls) {
        return new C1681(C1224.m2968(15, cls, null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C1681 m4713(Object obj) {
        if (obj instanceof InterfaceC1760) {
            return new C1681(C1224.m2968(14, ((InterfaceC0692) ((InterfaceC1760) obj)).mo2209(), obj));
        }
        return obj instanceof Class ? new C1681(C1224.m2968(14, (Class) obj, obj)) : new C1681(C1224.m2968(14, obj.getClass(), obj));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final C3534 m4714(String str) {
        int i;
        m4694(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC1469.m3327(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C3534(i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final C3539 m4715(String str) {
        m4694(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC1469.m3327(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return new C3539(j2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4716(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
