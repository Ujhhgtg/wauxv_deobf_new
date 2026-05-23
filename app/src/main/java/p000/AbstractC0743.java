package p000;

import android.database.Cursor;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import bsh.AbstractC0009;
import bsh.Primitive;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.appbar.MaterialToolbar;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.r;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import me.hd.wauxv.data.bean.db.ChatRoomInfo;
import me.hd.wauxv.data.bean.db.RContactInfo;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupData;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.core.p001native.AudioNative;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᤝᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int[] f2836 = {48, 58, 65, 91, 97, Opcodes.LSHR, Opcodes.LOR, bc.e, 384, 592, 688, 768, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, 2048, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, r.a.k, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, 56320, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, 131072, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final char[] f2837 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f2838 = {1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0171 f2839 = new C0171(13);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static long f2840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Method f2841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int m2171(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2172(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long m2173(long j, EnumC1122 enumC1122) {
        long j2;
        int iOrdinal = enumC1122.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + enumC1122).toString());
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static ChatRoomInfo m2174(Cursor cursor) {
        String[] strArr = AbstractC1574.f5469;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static RContactInfo m2175(Cursor cursor) {
        String[] strArr = AbstractC1574.f5469;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static FriendInfo m2176(Cursor cursor) {
        RContactInfo rContactInfoM2175 = m2175(cursor);
        return new FriendInfo(rContactInfoM2175.getUsername(), rContactInfoM2175.getAlias(), rContactInfoM2175.getConRemark(), rContactInfoM2175.getNickname(), rContactInfoM2175.getType(), rContactInfoM2175.getSourceExtInfo(), rContactInfoM2175.getCreateTime());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static GroupInfo m2177(Cursor cursor) throws IOException {
        GroupData groupData;
        RContactInfo rContactInfoM2175 = m2175(cursor);
        String username = rContactInfoM2175.getUsername();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("select * from chatroom where chatroomname = '");
        sb.append(username);
        sb.append('\'');
        Cursor cursorM2715 = C1133.m2715(sb.toString());
        cursorM2715.moveToFirst();
        try {
            int count = cursorM2715.getCount();
            Map linkedHashMap = C1190.f4330;
            List listM2206 = C1189.f4329;
            if (count == 0) {
                groupData = new GroupData("", listM2206, listM2206, 0, linkedHashMap, "", "", "", "", 0L);
            } else {
                ChatRoomInfo chatRoomInfoM2174 = m2174(cursorM2715);
                List listM2207 = AbstractC0744.m2206(AbstractC2841.m4843(chatRoomInfoM2174.getMemberlist(), new String[]{";"}));
                String displayname = chatRoomInfoM2174.getDisplayname();
                if (displayname != null) {
                    listM2206 = AbstractC0744.m2206(AbstractC2841.m4843(displayname, new String[]{"、"}));
                }
                List list = listM2206;
                if (chatRoomInfoM2174.getMemberCount() > 0) {
                    ArrayList<C2315> arrayListM2210 = AbstractC0744.m2210(listM2207, list);
                    int iM3693 = AbstractC1898.m3693(AbstractC0746.m2214(arrayListM2210, 10));
                    if (iM3693 < 16) {
                        iM3693 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM3693);
                    for (C2315 c2315 : arrayListM2210) {
                        linkedHashMap.put(c2315.f7445, c2315.f7446);
                    }
                }
                Map map = linkedHashMap;
                String chatroomname = chatRoomInfoM2174.getChatroomname();
                int memberCount = chatRoomInfoM2174.getMemberCount();
                String selfDisplayName = chatRoomInfoM2174.getSelfDisplayName();
                if (selfDisplayName == null) {
                    Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11023.f11027);
                    "null cannot be cast to non-null type kotlin.String";
                    selfDisplayName = (String) objM2263;
                }
                String str = selfDisplayName;
                String roomowner = chatRoomInfoM2174.getRoomowner();
                if (roomowner == null) {
                    roomowner = "未知";
                }
                String str2 = roomowner;
                String chatroomnotice = chatRoomInfoM2174.getChatroomnotice();
                if (chatroomnotice == null) {
                    chatroomnotice = "暂无群公告";
                }
                String str3 = chatroomnotice;
                String chatroomnoticeEditor = chatRoomInfoM2174.getChatroomnoticeEditor();
                if (chatroomnoticeEditor == null) {
                    chatroomnoticeEditor = "未知";
                }
                groupData = new GroupData(chatroomname, listM2207, list, memberCount, map, str, str2, str3, chatroomnoticeEditor, chatRoomInfoM2174.getChatroomnoticePublishTime());
            }
            cursorM2715.close();
            return new GroupInfo(rContactInfoM2175.getUsername(), rContactInfoM2175.getConRemark(), rContactInfoM2175.getNickname(), groupData);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(cursorM2715, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C0698 m2178(DexKitBridge dexKitBridge, C0049 c0049) {
        int iM910 = c0049.m910(4);
        int i = iM910 != 0 ? c0049.f980.getInt(iM910 + c0049.f979) : 0;
        int iM911 = c0049.m910(6);
        int i2 = iM911 != 0 ? c0049.f980.getInt(iM911 + c0049.f979) : 0;
        int iM912 = c0049.m910(8);
        if (iM912 != 0) {
            c0049.m912(iM912 + c0049.f979);
        }
        int iM913 = c0049.m910(10);
        int i3 = iM913 != 0 ? c0049.f980.getInt(iM913 + c0049.f979) : 0;
        int iM914 = c0049.m910(12);
        String strM912 = iM914 != 0 ? c0049.m912(iM914 + c0049.f979) : null;
        if (strM912 == null) {
            strM912 = "";
        }
        String str = strM912;
        int iM915 = c0049.m910(14);
        int i4 = iM915 != 0 ? c0049.f980.getInt(iM915 + c0049.f979) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM916 = c0049.m910(16);
        int iM917 = iM916 != 0 ? c0049.m914(iM916) : 0;
        for (int i5 = 0; i5 < iM917; i5++) {
            int iM918 = c0049.m910(16);
            arrayList.add(Integer.valueOf(iM918 != 0 ? c0049.f980.getInt((i5 * 4) + c0049.m913(iM918)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM919 = c0049.m910(18);
        int iM9110 = iM919 != 0 ? c0049.m914(iM919) : 0;
        for (int i6 = 0; i6 < iM9110; i6++) {
            int iM9111 = c0049.m910(18);
            arrayList2.add(Integer.valueOf(iM9111 != 0 ? c0049.f980.getInt((i6 * 4) + c0049.m913(iM9111)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM9112 = c0049.m910(20);
        int iM9113 = iM9112 != 0 ? c0049.m914(iM9112) : 0;
        for (int i7 = 0; i7 < iM9113; i7++) {
            int iM9114 = c0049.m910(20);
            arrayList3.add(Integer.valueOf(iM9114 != 0 ? c0049.f980.getInt((i7 * 4) + c0049.m913(iM9114)) : 0));
        }
        return new C0698(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0167  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m2179(SharedPreferencesC1269 sharedPreferencesC1269, int i) {
        int i2;
        MappedByteBuffer mappedByteBufferM4106;
        ArrayList arrayList = sharedPreferencesC1269.f4623;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            C2647 c2647 = (C2647) arrayList.get(0);
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 1; i4 < size; i4++) {
                C2647 c2648 = (C2647) arrayList.get(i4);
                if (c2648.f8546 == c2647.f8547) {
                    c2647.f8547 = c2648.f8547;
                } else {
                    i3++;
                    if (i3 != i4) {
                        arrayList.set(i3, c2648);
                    }
                    c2647 = c2648;
                }
            }
            int i5 = i3 + 1;
            if (size > i5) {
                arrayList.subList(i5, size).clear();
            }
        }
        C2647 c2649 = (C2647) arrayList.get(0);
        int i6 = c2649.f8546;
        int i7 = sharedPreferencesC1269.f4612;
        int i8 = i7 - sharedPreferencesC1269.f4622;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z = i9 < i11 + i10;
        if (!z) {
            sharedPreferencesC1269.f4613 ^= sharedPreferencesC1269.f4616.m1261(i6, i11);
        }
        int size2 = arrayList.size();
        int i12 = size2 - 1;
        int i13 = sharedPreferencesC1269.f4612 - ((C2647) arrayList.get(i12)).f8547;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c2649.f8546;
        int i16 = c2649.f8547;
        int i17 = 1;
        while (i17 < size2) {
            ArrayList arrayList2 = arrayList;
            C2647 c26410 = (C2647) arrayList.get(i17);
            int i18 = i17;
            int i19 = c26410.f8546 - i16;
            int i20 = size2;
            byte[] bArr = (byte[]) sharedPreferencesC1269.f4616.f1353;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c26410.f8547;
            i17 = i18 + 1;
            arrayList = arrayList2;
            size2 = i20;
        }
        ArrayList arrayList3 = arrayList;
        if (i13 > 0) {
            byte[] bArr2 = (byte[]) sharedPreferencesC1269.f4616.f1353;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        sharedPreferencesC1269.f4622 = 0;
        arrayList3.clear();
        if (z) {
            sharedPreferencesC1269.f4613 = sharedPreferencesC1269.f4616.m1261(12, i9);
        } else {
            sharedPreferencesC1269.f4613 ^= sharedPreferencesC1269.f4616.m1261(i6, i10);
        }
        sharedPreferencesC1269.f4612 = i8;
        if (sharedPreferencesC1269.f4611 != null) {
            i9 |= 1073741824;
        }
        if (sharedPreferencesC1269.f4631 == 0) {
            sharedPreferencesC1269.f4628.putInt(0, -1);
            sharedPreferencesC1269.f4628.putLong(4, sharedPreferencesC1269.f4613);
            sharedPreferencesC1269.f4628.position(i6);
            sharedPreferencesC1269.f4628.put((byte[]) sharedPreferencesC1269.f4616.f1353, i6, i10);
            sharedPreferencesC1269.f4628.putInt(0, i9);
            sharedPreferencesC1269.f4629.putInt(0, i9);
            sharedPreferencesC1269.f4629.putLong(4, sharedPreferencesC1269.f4613);
            sharedPreferencesC1269.f4629.position(i6);
            sharedPreferencesC1269.f4629.put((byte[]) sharedPreferencesC1269.f4616.f1353, i6, i10);
        } else {
            sharedPreferencesC1269.f4616.m1274(0, i9);
            sharedPreferencesC1269.f4616.m1275(4, sharedPreferencesC1269.f4613);
        }
        int i22 = sharedPreferencesC1269.f4612 + i;
        if (((byte[]) sharedPreferencesC1269.f4616.f1353).length - i22 > 32768) {
            int i23 = SharedPreferencesC1269.f4607;
            int iM4095 = AbstractC2207.m4095(i23, i22 + i23);
            byte[] bArr3 = (byte[]) sharedPreferencesC1269.f4616.f1353;
            if (iM4095 >= bArr3.length) {
                i2 = 0;
            } else {
                byte[] bArr4 = new byte[iM4095];
                i2 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, sharedPreferencesC1269.f4612);
                sharedPreferencesC1269.f4616.f1353 = bArr4;
                if (sharedPreferencesC1269.f4631 == 0) {
                    FileChannel fileChannel = sharedPreferencesC1269.f4626;
                    long j = iM4095;
                    MappedByteBuffer mappedByteBufferM4107 = null;
                    try {
                        fileChannel.truncate(j);
                        mappedByteBufferM4106 = AbstractC2207.m4106(fileChannel, iM4095);
                    } catch (IOException unused) {
                        mappedByteBufferM4106 = null;
                    }
                    FileChannel fileChannel2 = sharedPreferencesC1269.f4627;
                    try {
                        fileChannel2.truncate(j);
                        mappedByteBufferM4107 = AbstractC2207.m4106(fileChannel2, iM4095);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM4106 == null || mappedByteBufferM4107 == null) {
                        Log.e("FastKV", sharedPreferencesC1269.f4609, new Exception("map failed"));
                        AbstractC2207.m4119(sharedPreferencesC1269);
                    } else {
                        sharedPreferencesC1269.f4628 = mappedByteBufferM4106;
                        sharedPreferencesC1269.f4629 = mappedByteBufferM4107;
                    }
                }
                AbstractC2202.m4009(sharedPreferencesC1269, "truncate finish");
            }
        } else {
            i2 = 0;
        }
        for (AbstractC0824 abstractC0824 : sharedPreferencesC1269.f4614.values()) {
            int i24 = abstractC0824.f3219;
            if (i24 > i6) {
                int i25 = i14 - 1;
                int i26 = i2;
                while (i26 <= i25) {
                    int i27 = (i26 + i25) >>> 1;
                    int i28 = iArr[i27];
                    if (i28 >= i24) {
                        if (i28 <= i24) {
                            i25 = i27;
                            break;
                        }
                        i25 = i27 - 1;
                    } else {
                        i26 = i27 + 1;
                    }
                }
                int i29 = iArr2[i25];
                abstractC0824.f3219 -= i29;
                if (abstractC0824.mo2372() >= 6) {
                    ((AbstractC0832) abstractC0824).f3227 -= i29;
                }
            }
        }
        AbstractC2202.m4009(sharedPreferencesC1269, "gc finish");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C0707 m2180(Annotation annotation) {
        return AbstractC2519.m4527(annotation.annotationType());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static Iterator m2181(Object obj) {
        Stream streamConcat;
        C3532[] c3532ArrM396;
        if (obj == null) {
            return new C0741();
        }
        if (obj instanceof Primitive) {
            return m2181(Primitive.unwrap(obj));
        }
        if (obj.getClass().isArray()) {
            return new C0742(obj);
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Enumeration) {
            return Collections.list((Enumeration) obj).iterator();
        }
        if (obj instanceof CharSequence) {
            return new C0742(((CharSequence) obj).toString().toCharArray());
        }
        int i = 0;
        if (obj instanceof Number) {
            final int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 0) {
                return new C0741();
            }
            return iIntValue > 0 ? IntStream.rangeClosed(0, iIntValue).iterator() : IntStream.rangeClosed(iIntValue, 0).map(new IntUnaryOperator() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲇᤞᲀᤝ
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i2) {
                    return iIntValue - i2;
                }
            }).iterator();
        }
        if (obj instanceof Character) {
            char cCharValue = ((Character) obj).charValue();
            int i2 = 33;
            int i3 = 0;
            while (i < 281) {
                int i4 = f2836[i];
                if (i2 > cCharValue) {
                    break;
                }
                i++;
                i3 = i2;
                i2 = i4;
            }
            return IntStream.rangeClosed(i3, cCharValue).boxed().map(new C0268(11)).map(new C0268(12)).iterator();
        }
        if (obj instanceof String) {
            return new C0742(((String) obj).toCharArray());
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        if (obj instanceof C0704) {
            cls = ((C0704) obj).f2682;
        }
        if (AbstractC0009.m401(cls)) {
            Stream streamOf = Stream.of(AbstractC2202.m3998(cls));
            if (AbstractC0009.m401(cls)) {
                c3532ArrM396 = cls.isInterface() ? AbstractC0009.m396(AbstractC0009.m394(cls)) : AbstractC0009.m396(AbstractC0009.m395(AbstractC0009.m390(cls)));
            } else {
                c3532ArrM396 = new C3532[0];
            }
            streamConcat = Stream.concat(Stream.concat(streamOf, Stream.concat(Stream.of((Object[]) c3532ArrM396).map(new C0268(6)).map(new C0268(7)), Stream.of((Object[]) AbstractC0009.m384(cls)).map(new C0268(8)).map(new C0268(7)))), Stream.of("}"));
        } else {
            streamConcat = Stream.concat(Stream.concat(Stream.of(AbstractC2202.m3998(cls)), Stream.concat(Stream.of((Object[]) cls.getFields()).map(new C0268(9)).map(new C0268(7)), Stream.of((Object[]) cls.getMethods()).map(new C0268(10)).map(new C0268(7)))), Stream.of("}"));
        }
        return streamConcat.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Class m2182(InterfaceC1736 interfaceC1736) {
        Class clsMo2114 = ((InterfaceC0696) interfaceC1736).mo2114();
        if (clsMo2114.isPrimitive()) {
            String name = clsMo2114.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo2114;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final Class m2183(C0707 c0707) {
        Class clsMo2114 = c0707.mo2114();
        if (clsMo2114.isPrimitive()) {
            return clsMo2114;
        }
        String name = clsMo2114.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static ArrayList m2184(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final int m2185(C0269 c0269, Object obj, int i) {
        int i2 = c0269.f1472;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM3205 = AbstractC1460.m3205(i2, i, c0269.f1470);
            if (iM3205 < 0 || AbstractC2207.m4087(obj, c0269.f1471[iM3205])) {
                return iM3205;
            }
            int i3 = iM3205 + 1;
            while (i3 < i2 && c0269.f1470[i3] == i) {
                if (AbstractC2207.m4087(obj, c0269.f1471[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM3205 - 1; i4 >= 0 && c0269.f1470[i4] == i; i4--) {
                if (AbstractC2207.m4087(obj, c0269.f1471[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static File m2186(String str) throws IOException {
        File file = new File(str);
        String[] strArr = AbstractC1574.f5469;
        AbstractC1459.m3177(file, "mp3ToSilk");
        File fileM3189 = AbstractC1459.m3189("pcm");
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = fileM3189.getAbsolutePath();
        AudioNative audioNative = AudioNative.f969;
        audioNative.mp3ToPcmInit();
        int iMp3ToPcmConvert = audioNative.mp3ToPcmConvert(absolutePath, absolutePath2);
        audioNative.mp3ToPcmClose();
        File fileM31810 = AbstractC1459.m3189("silk");
        audioNative.pcmToSilkConvert(fileM3189.getAbsolutePath(), fileM31810.getAbsolutePath(), true, false, iMp3ToPcmConvert, 24000, 20, 0, 0, 0, 2, 24000);
        fileM3189.delete();
        return fileM31810;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m2187(String str, String str2, Object obj) {
        C0247.f1410.getClass();
        int i = AbstractC1745.f5844;
        C1973 c1973M3492 = AbstractC0968.m2483(AbstractC1574.m3315(C0246.f1409).getDeclaringClass()).m3492();
        c1973M3492.m3800(EnumC1999.STATIC);
        Class cls = Integer.TYPE;
        c1973M3492.f6543 = AbstractC2519.m4527(cls);
        String[] strArr = AbstractC1574.f5469;
        ((C1982) AbstractC2784.m4743(new Object[]{"com.tencent.mm.opensdk.modelmsg.WXMediaMessage", AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(cls), AbstractC2519.m4527(String.class)}, 6, c1973M3492)).m3831(obj, str2, "", str, 2, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final void m2188(Object obj) throws Throwable {
        if (obj instanceof C2585) {
            throw ((C2585) obj).f8191;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public abstract int mo1683(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract int mo1684(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public int mo1685(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public int mo1686() {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public abstract void mo1687(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public abstract void mo1688(View view, int i, int i2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract void mo1689(View view, float f, float f2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public abstract boolean mo1690(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void mo2189(View view, int i) {
    }
}
