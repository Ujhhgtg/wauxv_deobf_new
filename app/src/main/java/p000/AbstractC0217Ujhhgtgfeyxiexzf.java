package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import me.hd.wauxv.data.bean.db.ChatRoomInfo;
import me.hd.wauxv.data.bean.db.RContactInfo;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupData;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0217Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2493feyxiexzfUjhhgtg f1490Ujhhgtgfeyxiexzf = new C2493feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f1491Ujhhgtgfeyxiexzf = {112, 114, 111, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final byte[] f1492Ujhhgtgfeyxiexzf = {112, 114, JSONB.Constants.BC_STR_ASCII_FIX_36, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String f1493Ujhhgtgfeyxiexzf = "";

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0871feyxiexzfUjhhgtg m1307Ujhhgtgfeyxiexzf(C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg, long j) {
        return new C0871feyxiexzfUjhhgtg(j == 19500 ? c0871feyxiexzfUjhhgtg.m2308Ujhhgtgfeyxiexzf() : c0871feyxiexzfUjhhgtg.m2307Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean m1308Ujhhgtgfeyxiexzf(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf) {
        int[] iArr = c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
        int i = iArr[0];
        int i2 = iArr[1];
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.f11609feyxiexzfUjhhgtg;
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2 != null ? (C3656Ujhhgtgfeyxiexzf) c3655Ujhhgtgfeyxiexzf2 : null;
        if (c3656Ujhhgtgfeyxiexzf != null) {
            int i3 = c3656Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf[0];
        }
        if (c3656Ujhhgtgfeyxiexzf != null) {
            int i4 = c3656Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf[1];
        }
        boolean z = i == 1 || i == 2 || (i == 3 && c3655Ujhhgtgfeyxiexzf.f11581Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg == 0.0f && c3655Ujhhgtgfeyxiexzf.m5332Ujhhgtgfeyxiexzf(0)) || c3655Ujhhgtgfeyxiexzf.mo1815Ujhhgtgfeyxiexzf();
        boolean z2 = i2 == 1 || i2 == 2 || (i2 == 3 && c3655Ujhhgtgfeyxiexzf.f11582Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg == 0.0f && c3655Ujhhgtgfeyxiexzf.m5332Ujhhgtgfeyxiexzf(1)) || c3655Ujhhgtgfeyxiexzf.mo1816Ujhhgtgfeyxiexzf();
        return (c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m1309Ujhhgtgfeyxiexzf(int i, int i2, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (i > 0) {
            return;
        }
        throw new C0670Ujhhgtgfeyxiexzf(i + " is not allowed in ProtoNumber for property '" + interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf(i2) + "' of '" + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m1310Ujhhgtgfeyxiexzf(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "radix ", " was not in valid range ");
            sbM4804Ujhhgtgfeyxiexzf.append(new C0682Ujhhgtgfeyxiexzf(2, 36, 1));
            throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C0393Ujhhgtgfeyxiexzf m1311Ujhhgtgfeyxiexzf(String str) {
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = null;
        String str2 = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv" instanceof C0919feyxiexzfUjhhgtg ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv";
        if (str2 == null) {
            str2 = "";
        }
        Class clsM4170Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4170Ujhhgtgfeyxiexzf(str2, null, 3);
        if (clsM4170Ujhhgtgfeyxiexzf != null) {
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(clsM4170Ujhhgtgfeyxiexzf);
            c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = str;
            c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
        }
        if (c0393Ujhhgtgfeyxiexzf == null) {
            C2290feyxiexzfUjhhgtg.m3498Ujhhgtgfeyxiexzf("Failed to initialize YukiXposedModuleStatus");
        }
        return c0393Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m1312Ujhhgtgfeyxiexzf(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static ChatRoomInfo m1313Ujhhgtgfeyxiexzf(Cursor cursor) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static RContactInfo m1314Ujhhgtgfeyxiexzf(Cursor cursor) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static FriendInfo m1315Ujhhgtgfeyxiexzf(Cursor cursor) {
        RContactInfo rContactInfoM1314Ujhhgtgfeyxiexzf = m1314Ujhhgtgfeyxiexzf(cursor);
        return new FriendInfo(rContactInfoM1314Ujhhgtgfeyxiexzf.getUsername(), rContactInfoM1314Ujhhgtgfeyxiexzf.getAlias(), rContactInfoM1314Ujhhgtgfeyxiexzf.getConRemark(), rContactInfoM1314Ujhhgtgfeyxiexzf.getNickname(), rContactInfoM1314Ujhhgtgfeyxiexzf.getType(), rContactInfoM1314Ujhhgtgfeyxiexzf.getSourceExtInfo(), rContactInfoM1314Ujhhgtgfeyxiexzf.getCreateTime());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static GroupInfo m1316Ujhhgtgfeyxiexzf(Cursor cursor) throws IOException {
        GroupData groupData;
        RContactInfo rContactInfoM1314Ujhhgtgfeyxiexzf = m1314Ujhhgtgfeyxiexzf(cursor);
        String username = rContactInfoM1314Ujhhgtgfeyxiexzf.getUsername();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("select * from chatroom where chatroomname = '");
        sb.append(username);
        sb.append('\'');
        Cursor cursorM4894Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4894Ujhhgtgfeyxiexzf(sb.toString());
        cursorM4894Ujhhgtgfeyxiexzf.moveToFirst();
        try {
            int count = cursorM4894Ujhhgtgfeyxiexzf.getCount();
            Map linkedHashMap = C3308feyxiexzfUjhhgtg.f10345Ujhhgtgfeyxiexzf;
            List listM4253feyxiexzfUjhhgtg = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
            if (count == 0) {
                groupData = new GroupData("", listM4253feyxiexzfUjhhgtg, listM4253feyxiexzfUjhhgtg, 0, linkedHashMap, "", "", "", "", 0L);
            } else {
                ChatRoomInfo chatRoomInfoM1313Ujhhgtgfeyxiexzf = m1313Ujhhgtgfeyxiexzf(cursorM4894Ujhhgtgfeyxiexzf);
                List listM4253feyxiexzfUjhhgtg2 = AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(chatRoomInfoM1313Ujhhgtgfeyxiexzf.getMemberlist(), new String[]{";"}));
                String displayname = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getDisplayname();
                if (displayname != null) {
                    listM4253feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(displayname, new String[]{"、"}));
                }
                List list = listM4253feyxiexzfUjhhgtg;
                if (chatRoomInfoM1313Ujhhgtgfeyxiexzf.getMemberCount() > 0) {
                    ArrayList<C1381feyxiexzfUjhhgtg> arrayListM4257Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4257Ujhhgtgfeyxiexzf(listM4253feyxiexzfUjhhgtg2, list);
                    int iM1280Ujhhgtgfeyxiexzf = AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM4257Ujhhgtgfeyxiexzf, 10));
                    if (iM1280Ujhhgtgfeyxiexzf < 16) {
                        iM1280Ujhhgtgfeyxiexzf = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM1280Ujhhgtgfeyxiexzf);
                    for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : arrayListM4257Ujhhgtgfeyxiexzf) {
                        linkedHashMap.put(c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
                    }
                }
                Map map = linkedHashMap;
                String chatroomname = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getChatroomname();
                int memberCount = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getMemberCount();
                String selfDisplayName = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getSelfDisplayName();
                if (selfDisplayName == null) {
                    Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6229Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
                    "null cannot be cast to non-null type kotlin.String";
                    selfDisplayName = (String) objM4271feyxiexzfUjhhgtg;
                }
                String str = selfDisplayName;
                String roomowner = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getRoomowner();
                if (roomowner == null) {
                    roomowner = "未知";
                }
                String str2 = roomowner;
                String chatroomnotice = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getChatroomnotice();
                if (chatroomnotice == null) {
                    chatroomnotice = "暂无群公告";
                }
                String str3 = chatroomnotice;
                String chatroomnoticeEditor = chatRoomInfoM1313Ujhhgtgfeyxiexzf.getChatroomnoticeEditor();
                if (chatroomnoticeEditor == null) {
                    chatroomnoticeEditor = "未知";
                }
                groupData = new GroupData(chatroomname, listM4253feyxiexzfUjhhgtg2, list, memberCount, map, str, str2, str3, chatroomnoticeEditor, chatRoomInfoM1313Ujhhgtgfeyxiexzf.getChatroomnoticePublishTime());
            }
            cursorM4894Ujhhgtgfeyxiexzf.close();
            return new GroupInfo(rContactInfoM1314Ujhhgtgfeyxiexzf.getUsername(), rContactInfoM1314Ujhhgtgfeyxiexzf.getConRemark(), rContactInfoM1314Ujhhgtgfeyxiexzf.getNickname(), groupData);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM4894Ujhhgtgfeyxiexzf, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static byte[] m1317Ujhhgtgfeyxiexzf(C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg : c3272feyxiexzfUjhhgtgArr) {
            length += ((((c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf * 2) + 7) & (-8)) / 8) + (c3272feyxiexzfUjhhgtg.f10289Ujhhgtgfeyxiexzf * 2) + m1323Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtg.f10285Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtg.f10286Ujhhgtgfeyxiexzf, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c3272feyxiexzfUjhhgtg.f10290Ujhhgtgfeyxiexzf;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC1264feyxiexzfUjhhgtg.f4633Ujhhgtgfeyxiexzf)) {
            int length2 = c3272feyxiexzfUjhhgtgArr.length;
            while (i < length2) {
                C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg2 = c3272feyxiexzfUjhhgtgArr[i];
                m1351feyxiexzfUjhhgtg(byteArrayOutputStream, c3272feyxiexzfUjhhgtg2, m1323Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtg2.f10285Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtg2.f10286Ujhhgtgfeyxiexzf, bArr));
                m1350feyxiexzfUjhhgtg(byteArrayOutputStream, c3272feyxiexzfUjhhgtg2);
                i++;
            }
        } else {
            for (C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg3 : c3272feyxiexzfUjhhgtgArr) {
                m1351feyxiexzfUjhhgtg(byteArrayOutputStream, c3272feyxiexzfUjhhgtg3, m1323Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtg3.f10285Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtg3.f10286Ujhhgtgfeyxiexzf, bArr));
            }
            int length3 = c3272feyxiexzfUjhhgtgArr.length;
            while (i < length3) {
                m1350feyxiexzfUjhhgtg(byteArrayOutputStream, c3272feyxiexzfUjhhgtgArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m1318Ujhhgtgfeyxiexzf(File file) {
        try {
            if (file.exists()) {
                m1319Ujhhgtgfeyxiexzf(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static void m1319Ujhhgtgfeyxiexzf(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m1319Ujhhgtgfeyxiexzf(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final boolean m1320Ujhhgtgfeyxiexzf(char c, char c2, boolean z) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final long m1321Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        List listMo1122Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1122Ujhhgtgfeyxiexzf(i);
        int i2 = i + 1;
        int size = listMo1122Ujhhgtgfeyxiexzf.size();
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtgType = EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) listMo1122Ujhhgtgfeyxiexzf.get(i3);
            if (annotation instanceof InterfaceC0868feyxiexzfUjhhgtg) {
                iNumber = ((InterfaceC0868feyxiexzfUjhhgtg) annotation).number();
                m1309Ujhhgtgfeyxiexzf(iNumber, i3, interfaceC1121feyxiexzfUjhhgtg);
            } else if (annotation instanceof InterfaceC0864feyxiexzfUjhhgtg) {
                enumC0860feyxiexzfUjhhgtgType = ((InterfaceC0864feyxiexzfUjhhgtg) annotation).type();
            } else if (annotation instanceof InterfaceC0865feyxiexzfUjhhgtg) {
                z2 = true;
            } else if (annotation instanceof InterfaceC0869feyxiexzfUjhhgtg) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL : 0L) | (z2 ? JSONWriter.MASK_IGNORE_NON_FIELD_GETTER : 0L) | enumC0860feyxiexzfUjhhgtgType.f3356Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final int m1322Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        List listMo1122Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1122Ujhhgtgfeyxiexzf(i);
        int iNumber = i + 1;
        int size = listMo1122Ujhhgtgfeyxiexzf.size();
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) listMo1122Ujhhgtgfeyxiexzf.get(i2);
            if (annotation instanceof InterfaceC0869feyxiexzfUjhhgtg) {
                return -2;
            }
            if (annotation instanceof InterfaceC0868feyxiexzfUjhhgtg) {
                iNumber = ((InterfaceC0868feyxiexzfUjhhgtg) annotation).number();
                m1309Ujhhgtgfeyxiexzf(iNumber, i2, interfaceC1121feyxiexzfUjhhgtg);
            }
        }
        return iNumber;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m1323Ujhhgtgfeyxiexzf(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC1264feyxiexzfUjhhgtg.f4634Ujhhgtgfeyxiexzf;
        byte[] bArr3 = AbstractC1264feyxiexzfUjhhgtg.f4635Ujhhgtgfeyxiexzf;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final List m1324Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        List<InterfaceC1121feyxiexzfUjhhgtg> listM4253feyxiexzfUjhhgtg;
        AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf();
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1434feyxiexzfUjhhgtg.f5030Ujhhgtgfeyxiexzf)) {
            InterfaceC0144Ujhhgtgfeyxiexzf interfaceC0144UjhhgtgfeyxiexzfM4209feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4209feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg);
            listM4253feyxiexzfUjhhgtg = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
            if (interfaceC0144UjhhgtgfeyxiexzfM4209feyxiexzfUjhhgtg != null) {
                listM4253feyxiexzfUjhhgtg = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM4253feyxiexzfUjhhgtg, 10));
            }
        } else {
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1434feyxiexzfUjhhgtg.f5031Ujhhgtgfeyxiexzf)) {
                throw new IllegalArgumentException("Class " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
            }
            listM4253feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(new C0646Ujhhgtgfeyxiexzf(2, interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(1)));
        }
        for (InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg2 : listM4253feyxiexzfUjhhgtg) {
            List listMo1122Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg2.mo1122Ujhhgtgfeyxiexzf(0);
            if (listMo1122Ujhhgtgfeyxiexzf == null || !listMo1122Ujhhgtgfeyxiexzf.isEmpty()) {
                Iterator it = listMo1122Ujhhgtgfeyxiexzf.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!(((Annotation) it.next()) instanceof InterfaceC0868feyxiexzfUjhhgtg));
            }
            throw new IllegalArgumentException(interfaceC1121feyxiexzfUjhhgtg2.mo1117Ujhhgtgfeyxiexzf() + " implementing oneOf type " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " should have @ProtoNumber annotation in its single property.");
        }
        return listM4253feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final AbstractC2059Ujhhgtgfeyxiexzf[] m1325Ujhhgtgfeyxiexzf() {
        return new AbstractC2059Ujhhgtgfeyxiexzf[]{C2325Ujhhgtgfeyxiexzf.f7593Ujhhgtgfeyxiexzf, C2334Ujhhgtgfeyxiexzf.f7623Ujhhgtgfeyxiexzf, C2329Ujhhgtgfeyxiexzf.f7605Ujhhgtgfeyxiexzf, C2332Ujhhgtgfeyxiexzf.f7617Ujhhgtgfeyxiexzf, C2331Ujhhgtgfeyxiexzf.f7611Ujhhgtgfeyxiexzf, C2992Ujhhgtgfeyxiexzf.f9297Ujhhgtgfeyxiexzf, C2576Ujhhgtgfeyxiexzf.f8327Ujhhgtgfeyxiexzf, C2578Ujhhgtgfeyxiexzf.f8341Ujhhgtgfeyxiexzf, C2559Ujhhgtgfeyxiexzf.f8290Ujhhgtgfeyxiexzf, C2740feyxiexzfUjhhgtg.f8706Ujhhgtgfeyxiexzf, C3046Ujhhgtgfeyxiexzf.f9426Ujhhgtgfeyxiexzf, C3054Ujhhgtgfeyxiexzf.f9444Ujhhgtgfeyxiexzf, C0333Ujhhgtgfeyxiexzf.f1951Ujhhgtgfeyxiexzf, C0337Ujhhgtgfeyxiexzf.f1963Ujhhgtgfeyxiexzf, C0516Ujhhgtgfeyxiexzf.f2460Ujhhgtgfeyxiexzf, C0946feyxiexzfUjhhgtg.f3792Ujhhgtgfeyxiexzf, C2436Ujhhgtgfeyxiexzf.f7879Ujhhgtgfeyxiexzf, C2340Ujhhgtgfeyxiexzf.f7635Ujhhgtgfeyxiexzf, C2318Ujhhgtgfeyxiexzf.f7579Ujhhgtgfeyxiexzf, C2456feyxiexzfUjhhgtg.f7979Ujhhgtgfeyxiexzf, C2442feyxiexzfUjhhgtg.f7904Ujhhgtgfeyxiexzf, C2437feyxiexzfUjhhgtg.f7883Ujhhgtgfeyxiexzf, C2448feyxiexzfUjhhgtg.f7913Ujhhgtgfeyxiexzf, C2763feyxiexzfUjhhgtg.f8748Ujhhgtgfeyxiexzf, C3174feyxiexzfUjhhgtg.f9814Ujhhgtgfeyxiexzf, C3169feyxiexzfUjhhgtg.f9806Ujhhgtgfeyxiexzf, C3199feyxiexzfUjhhgtg.f9885Ujhhgtgfeyxiexzf, C3203feyxiexzfUjhhgtg.f9893Ujhhgtgfeyxiexzf, C3185feyxiexzfUjhhgtg.f9835Ujhhgtgfeyxiexzf, C0496Ujhhgtgfeyxiexzf.f2415Ujhhgtgfeyxiexzf, C0490Ujhhgtgfeyxiexzf.f2404Ujhhgtgfeyxiexzf, C0522Ujhhgtgfeyxiexzf.f2470Ujhhgtgfeyxiexzf, C1369feyxiexzfUjhhgtg.f4850Ujhhgtgfeyxiexzf, C0775feyxiexzfUjhhgtg.f3067Ujhhgtgfeyxiexzf, C0765feyxiexzfUjhhgtg.f3038Ujhhgtgfeyxiexzf, feyxiexzfUjhhgtg.f3032Ujhhgtgfeyxiexzf, C1041feyxiexzfUjhhgtg.f4054Ujhhgtgfeyxiexzf, C1032feyxiexzfUjhhgtg.f4034Ujhhgtgfeyxiexzf, C3525Ujhhgtgfeyxiexzf.f11012Ujhhgtgfeyxiexzf, C0558Ujhhgtgfeyxiexzf.f2559Ujhhgtgfeyxiexzf, C0556Ujhhgtgfeyxiexzf.f2553Ujhhgtgfeyxiexzf, C0555Ujhhgtgfeyxiexzf.f2549Ujhhgtgfeyxiexzf, C0560Ujhhgtgfeyxiexzf.f2566Ujhhgtgfeyxiexzf, C0562Ujhhgtgfeyxiexzf.f2572Ujhhgtgfeyxiexzf, C0590Ujhhgtgfeyxiexzf.f2627Ujhhgtgfeyxiexzf, C1420feyxiexzfUjhhgtg.f4989Ujhhgtgfeyxiexzf, C2434Ujhhgtgfeyxiexzf.f7873Ujhhgtgfeyxiexzf, C3066Ujhhgtgfeyxiexzf.f9491Ujhhgtgfeyxiexzf, C3064Ujhhgtgfeyxiexzf.f9485Ujhhgtgfeyxiexzf, C3467Ujhhgtgfeyxiexzf.f10765Ujhhgtgfeyxiexzf, C1782Ujhhgtgfeyxiexzf.f5973Ujhhgtgfeyxiexzf, C2721feyxiexzfUjhhgtg.f8669Ujhhgtgfeyxiexzf, C2722feyxiexzfUjhhgtg.f8673Ujhhgtgfeyxiexzf, C0423Ujhhgtgfeyxiexzf.f2264Ujhhgtgfeyxiexzf, C0406Ujhhgtgfeyxiexzf.f2187Ujhhgtgfeyxiexzf, C2431Ujhhgtgfeyxiexzf.f7867Ujhhgtgfeyxiexzf, C1251feyxiexzfUjhhgtg.f4597Ujhhgtgfeyxiexzf, C0541Ujhhgtgfeyxiexzf.f2517Ujhhgtgfeyxiexzf, C0534Ujhhgtgfeyxiexzf.f2502Ujhhgtgfeyxiexzf, C3282Ujhhgtgfeyxiexzf.f10305Ujhhgtgfeyxiexzf, C0277Ujhhgtgfeyxiexzf.f1689Ujhhgtgfeyxiexzf, C2209Ujhhgtgfeyxiexzf.f7186Ujhhgtgfeyxiexzf, C1134feyxiexzfUjhhgtg.f4295Ujhhgtgfeyxiexzf, C0967feyxiexzfUjhhgtg.f3840Ujhhgtgfeyxiexzf, C0969feyxiexzfUjhhgtg.f3845Ujhhgtgfeyxiexzf, C0996feyxiexzfUjhhgtg.f3905Ujhhgtgfeyxiexzf, C0997feyxiexzfUjhhgtg.f3909Ujhhgtgfeyxiexzf, C0979feyxiexzfUjhhgtg.f3874Ujhhgtgfeyxiexzf, C3291Ujhhgtgfeyxiexzf.f10323Ujhhgtgfeyxiexzf, C0497Ujhhgtgfeyxiexzf.f2421Ujhhgtgfeyxiexzf, C0506Ujhhgtgfeyxiexzf.f2436Ujhhgtgfeyxiexzf, C2205Ujhhgtgfeyxiexzf.f7174Ujhhgtgfeyxiexzf, C2215Ujhhgtgfeyxiexzf.f7196Ujhhgtgfeyxiexzf, C1428feyxiexzfUjhhgtg.f5022Ujhhgtgfeyxiexzf, C0785feyxiexzfUjhhgtg.f3088Ujhhgtgfeyxiexzf, C2830feyxiexzfUjhhgtg.f8992Ujhhgtgfeyxiexzf, C0503Ujhhgtgfeyxiexzf.f2430Ujhhgtgfeyxiexzf, C1466feyxiexzfUjhhgtg.f5096Ujhhgtgfeyxiexzf, C0777feyxiexzfUjhhgtg.f3073Ujhhgtgfeyxiexzf, C0344Ujhhgtgfeyxiexzf.f1977Ujhhgtgfeyxiexzf, C0343Ujhhgtgfeyxiexzf.f1973Ujhhgtgfeyxiexzf, C0345Ujhhgtgfeyxiexzf.f1981Ujhhgtgfeyxiexzf, RunnableC2555feyxiexzfUjhhgtg.f8282Ujhhgtgfeyxiexzf, C2460feyxiexzfUjhhgtg.f7986Ujhhgtgfeyxiexzf, C2833feyxiexzfUjhhgtg.f9002Ujhhgtgfeyxiexzf, C3163feyxiexzfUjhhgtg.f9791Ujhhgtgfeyxiexzf, C0305Ujhhgtgfeyxiexzf.f1826Ujhhgtgfeyxiexzf, C0418Ujhhgtgfeyxiexzf.f2248Ujhhgtgfeyxiexzf, C1402feyxiexzfUjhhgtg.f4918Ujhhgtgfeyxiexzf, C1079feyxiexzfUjhhgtg.f4151Ujhhgtgfeyxiexzf, C1010feyxiexzfUjhhgtg.f3940Ujhhgtgfeyxiexzf, C2074Ujhhgtgfeyxiexzf.f6812Ujhhgtgfeyxiexzf, C0972feyxiexzfUjhhgtg.f3860Ujhhgtgfeyxiexzf, C0973feyxiexzfUjhhgtg.f3864Ujhhgtgfeyxiexzf, C2317Ujhhgtgfeyxiexzf.f7574Ujhhgtgfeyxiexzf, C2319Ujhhgtgfeyxiexzf.f7584Ujhhgtgfeyxiexzf, C2328Ujhhgtgfeyxiexzf.f7600Ujhhgtgfeyxiexzf, C1066feyxiexzfUjhhgtg.f4127Ujhhgtgfeyxiexzf, C1064feyxiexzfUjhhgtg.f4122Ujhhgtgfeyxiexzf, C1071feyxiexzfUjhhgtg.f4140Ujhhgtgfeyxiexzf, C1070feyxiexzfUjhhgtg.f4136Ujhhgtgfeyxiexzf, C1059feyxiexzfUjhhgtg.f4112Ujhhgtgfeyxiexzf, C1194feyxiexzfUjhhgtg.f4487Ujhhgtgfeyxiexzf, C1206feyxiexzfUjhhgtg.f4503Ujhhgtgfeyxiexzf, C1237feyxiexzfUjhhgtg.f4570Ujhhgtgfeyxiexzf, C2764feyxiexzfUjhhgtg.f8752Ujhhgtgfeyxiexzf, C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf, C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf, C1009feyxiexzfUjhhgtg.f3936Ujhhgtgfeyxiexzf, C1042feyxiexzfUjhhgtg.f4059Ujhhgtgfeyxiexzf, C1043feyxiexzfUjhhgtg.f4063Ujhhgtgfeyxiexzf, C2225Ujhhgtgfeyxiexzf.f7235Ujhhgtgfeyxiexzf, C2207Ujhhgtgfeyxiexzf.f7179Ujhhgtgfeyxiexzf, C3597feyxiexzfUjhhgtg.f11194Ujhhgtgfeyxiexzf, C3606feyxiexzfUjhhgtg.f11217Ujhhgtgfeyxiexzf, C0422Ujhhgtgfeyxiexzf.f2261Ujhhgtgfeyxiexzf, C2204Ujhhgtgfeyxiexzf.f7171Ujhhgtgfeyxiexzf, C2898Ujhhgtgfeyxiexzf.f9175Ujhhgtgfeyxiexzf, C1475feyxiexzfUjhhgtg.f5118Ujhhgtgfeyxiexzf, C2429Ujhhgtgfeyxiexzf.f7861Ujhhgtgfeyxiexzf, C3261feyxiexzfUjhhgtg.f10238Ujhhgtgfeyxiexzf, C3186feyxiexzfUjhhgtg.f9839Ujhhgtgfeyxiexzf, C2889feyxiexzfUjhhgtg.f9156Ujhhgtgfeyxiexzf, C2288Ujhhgtgfeyxiexzf.f7499Ujhhgtgfeyxiexzf};
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static byte[] m1326Ujhhgtgfeyxiexzf(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        m1336feyxiexzfUjhhgtg(file, bArr, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final EnumC0860feyxiexzfUjhhgtg m1327Ujhhgtgfeyxiexzf(long j) {
        long j2 = j & 25769803776L;
        if (j2 == 0) {
            return EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        }
        return j2 == 8589934592L ? EnumC0860feyxiexzfUjhhgtg.SIGNED : EnumC0860feyxiexzfUjhhgtg.FIXED;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static LayoutInflater m1328Ujhhgtgfeyxiexzf(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C0323Ujhhgtgfeyxiexzf(context));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m1329Ujhhgtgfeyxiexzf(C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, boolean z) {
        HashSet<C3641Ujhhgtgfeyxiexzf> hashSet;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2;
        float f;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5;
        if (!(c3655Ujhhgtgfeyxiexzf instanceof C3656Ujhhgtgfeyxiexzf) && c3655Ujhhgtgfeyxiexzf.m5337Ujhhgtgfeyxiexzf() && m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf)) {
            C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
        }
        C3641Ujhhgtgfeyxiexzf c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.mo1814Ujhhgtgfeyxiexzf(2);
        C3641Ujhhgtgfeyxiexzf c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.mo1814Ujhhgtgfeyxiexzf(4);
        int iM5288Ujhhgtgfeyxiexzf = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        int iM5288Ujhhgtgfeyxiexzf2 = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.m5288Ujhhgtgfeyxiexzf();
        HashSet<C3641Ujhhgtgfeyxiexzf> hashSet2 = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf;
        if (hashSet2 != null && c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.f11375Ujhhgtgfeyxiexzf) {
            for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf6 : hashSet2) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf6.f11376Ujhhgtgfeyxiexzf;
                boolean zM1308Ujhhgtgfeyxiexzf = m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf2);
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf2.f11598feyxiexzfUjhhgtg;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf2.f11600feyxiexzfUjhhgtg;
                if (c3655Ujhhgtgfeyxiexzf2.m5337Ujhhgtgfeyxiexzf() && zM1308Ujhhgtgfeyxiexzf) {
                    f = 0.0f;
                    C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf2, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
                } else {
                    f = 0.0f;
                }
                int i = c3655Ujhhgtgfeyxiexzf2.f11631Ujhhgtgfeyxiexzf[0];
                if (i != 3 || zM1308Ujhhgtgfeyxiexzf) {
                    if (!c3655Ujhhgtgfeyxiexzf2.m5337Ujhhgtgfeyxiexzf()) {
                        if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf7.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf;
                            c3655Ujhhgtgfeyxiexzf2.m5342feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2.m5329Ujhhgtgfeyxiexzf() + iM5289Ujhhgtgfeyxiexzf);
                            m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2, z);
                        } else if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf8 && c3641Ujhhgtgfeyxiexzf7.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf2 = iM5288Ujhhgtgfeyxiexzf - c3641Ujhhgtgfeyxiexzf8.m5289Ujhhgtgfeyxiexzf();
                            c3655Ujhhgtgfeyxiexzf2.m5342feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf2 - c3655Ujhhgtgfeyxiexzf2.m5329Ujhhgtgfeyxiexzf(), iM5289Ujhhgtgfeyxiexzf2);
                            m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2, z);
                        } else if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && (c3641Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf3.f11375Ujhhgtgfeyxiexzf && !c3655Ujhhgtgfeyxiexzf2.m5335Ujhhgtgfeyxiexzf()) {
                            m1344feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2, z);
                        }
                    }
                } else if (i == 3 && c3655Ujhhgtgfeyxiexzf2.f11585Ujhhgtgfeyxiexzf >= 0 && c3655Ujhhgtgfeyxiexzf2.f11584Ujhhgtgfeyxiexzf >= 0 && (c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf == 8 || (c3655Ujhhgtgfeyxiexzf2.f11581Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg == f))) {
                    if (!c3655Ujhhgtgfeyxiexzf2.m5335Ujhhgtgfeyxiexzf() && !c3655Ujhhgtgfeyxiexzf2.f11595feyxiexzfUjhhgtg && ((c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && (c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf5.f11375Ujhhgtgfeyxiexzf) || (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf8 && (c3641Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf7.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf4.f11375Ujhhgtgfeyxiexzf))) {
                        if (!c3655Ujhhgtgfeyxiexzf2.m5335Ujhhgtgfeyxiexzf()) {
                            m1345feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2, z);
                        }
                    }
                }
            }
        }
        if ((c3655Ujhhgtgfeyxiexzf instanceof C0527Ujhhgtgfeyxiexzf) || (hashSet = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.f11373Ujhhgtgfeyxiexzf) == null || !c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.f11375Ujhhgtgfeyxiexzf) {
            return;
        }
        for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf9 : hashSet) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf9.f11376Ujhhgtgfeyxiexzf;
            boolean zM1308Ujhhgtgfeyxiexzf2 = m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf3);
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf10 = c3655Ujhhgtgfeyxiexzf3.f11598feyxiexzfUjhhgtg;
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf11 = c3655Ujhhgtgfeyxiexzf3.f11600feyxiexzfUjhhgtg;
            if (c3655Ujhhgtgfeyxiexzf3.m5337Ujhhgtgfeyxiexzf() && zM1308Ujhhgtgfeyxiexzf2) {
                C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf3, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
            }
            boolean z2 = (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf10 && (c3641Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf11.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf2.f11375Ujhhgtgfeyxiexzf) || (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf11 && (c3641Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf10.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf.f11375Ujhhgtgfeyxiexzf);
            int i2 = c3655Ujhhgtgfeyxiexzf3.f11631Ujhhgtgfeyxiexzf[0];
            if (i2 != 3 || zM1308Ujhhgtgfeyxiexzf2) {
                if (!c3655Ujhhgtgfeyxiexzf3.m5337Ujhhgtgfeyxiexzf()) {
                    if (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf10 && c3641Ujhhgtgfeyxiexzf11.f11378Ujhhgtgfeyxiexzf == null) {
                        int iM5289Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf10.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf2;
                        c3655Ujhhgtgfeyxiexzf3.m5342feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf3, c3655Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf() + iM5289Ujhhgtgfeyxiexzf3);
                        m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3, z);
                    } else if (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf11 && c3641Ujhhgtgfeyxiexzf10.f11378Ujhhgtgfeyxiexzf == null) {
                        int iM5289Ujhhgtgfeyxiexzf4 = iM5288Ujhhgtgfeyxiexzf2 - c3641Ujhhgtgfeyxiexzf11.m5289Ujhhgtgfeyxiexzf();
                        c3655Ujhhgtgfeyxiexzf3.m5342feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf4 - c3655Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf(), iM5289Ujhhgtgfeyxiexzf4);
                        m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3, z);
                    } else if (z2 && !c3655Ujhhgtgfeyxiexzf3.m5335Ujhhgtgfeyxiexzf()) {
                        m1344feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3, z);
                    }
                }
            } else if (i2 == 3 && c3655Ujhhgtgfeyxiexzf3.f11585Ujhhgtgfeyxiexzf >= 0 && c3655Ujhhgtgfeyxiexzf3.f11584Ujhhgtgfeyxiexzf >= 0 && (c3655Ujhhgtgfeyxiexzf3.f11622Ujhhgtgfeyxiexzf == 8 || (c3655Ujhhgtgfeyxiexzf3.f11581Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf3.f11612feyxiexzfUjhhgtg == 0.0f))) {
                if (!c3655Ujhhgtgfeyxiexzf3.m5335Ujhhgtgfeyxiexzf() && !c3655Ujhhgtgfeyxiexzf3.f11595feyxiexzfUjhhgtg && z2 && !c3655Ujhhgtgfeyxiexzf3.m5335Ujhhgtgfeyxiexzf()) {
                    m1345feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean m1330Ujhhgtgfeyxiexzf(long j) {
        return (j & JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL) != 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final boolean m1331feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        return !interfaceC1121feyxiexzfUjhhgtg.mo1184Ujhhgtgfeyxiexzf() ? !(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf() instanceof AbstractC0835feyxiexzfUjhhgtg) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C0839feyxiexzfUjhhgtg.f3317Ujhhgtgfeyxiexzf) : !(interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf() == 1 && m1331feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final boolean m1332feyxiexzfUjhhgtg(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static InterfaceC0058Ujhhgtgfeyxiexzf m1333feyxiexzfUjhhgtg(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(2);
        if (iM2713feyxiexzfUjhhgtg == 0) {
            return new C2065feyxiexzfUjhhgtg(interfaceC3545feyxiexzfUjhhgtg);
        }
        if (iM2713feyxiexzfUjhhgtg == 1) {
            C0936feyxiexzfUjhhgtg c0936feyxiexzfUjhhgtg = new C0936feyxiexzfUjhhgtg();
            c0936feyxiexzfUjhhgtg.f3773Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
            c0936feyxiexzfUjhhgtg.f3774Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
            return c0936feyxiexzfUjhhgtg;
        }
        if (iM2713feyxiexzfUjhhgtg != 2) {
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        C1944feyxiexzfUjhhgtg c1944feyxiexzfUjhhgtg = new C1944feyxiexzfUjhhgtg();
        c1944feyxiexzfUjhhgtg.f6419Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
        c1944feyxiexzfUjhhgtg.f6420Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        return c1944feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m1334feyxiexzfUjhhgtg(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m1335feyxiexzfUjhhgtg(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        byte[] bArrM1326Ujhhgtgfeyxiexzf = m1326Ujhhgtgfeyxiexzf(file);
        try {
            int length = bArrM1326Ujhhgtgfeyxiexzf.length;
            File file3 = new File(file2.getParent(), file2.getName() + ".tmp");
            if (m1334feyxiexzfUjhhgtg(file3)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    randomAccessFile.setLength(length);
                    randomAccessFile.write(bArrM1326Ujhhgtgfeyxiexzf, 0, length);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (!file3.renameTo(file2) && (!file2.exists() || file2.delete())) {
                        file3.renameTo(file2);
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                new Exception("create file failed");
            }
        } catch (Exception e) {
            new Exception("save bytes failed", e);
        }
        m1318Ujhhgtgfeyxiexzf(file);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m1336feyxiexzfUjhhgtg(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                m1312Ujhhgtgfeyxiexzf(randomAccessFile);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static int[] m1337feyxiexzfUjhhgtg(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM2756Ujhhgtgfeyxiexzf = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2756Ujhhgtgfeyxiexzf += (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            iArr[i2] = iM2756Ujhhgtgfeyxiexzf;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static C3272feyxiexzfUjhhgtg[] m1338feyxiexzfUjhhgtg(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr) throws IOException {
        byte[] bArr3 = AbstractC1264feyxiexzfUjhhgtg.f4636Ujhhgtgfeyxiexzf;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC1264feyxiexzfUjhhgtg.f4637Ujhhgtgfeyxiexzf)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2756Ujhhgtgfeyxiexzf = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 2);
            byte[] bArrM2755Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2755Ujhhgtgfeyxiexzf(fileInputStream, (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4), (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2755Ujhhgtgfeyxiexzf);
            try {
                C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArrM1340feyxiexzfUjhhgtg = m1340feyxiexzfUjhhgtg(byteArrayInputStream, bArr2, iM2756Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtgArr);
                byteArrayInputStream.close();
                return c3272feyxiexzfUjhhgtgArrM1340feyxiexzfUjhhgtg;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC1264feyxiexzfUjhhgtg.f4631Ujhhgtgfeyxiexzf, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2756Ujhhgtgfeyxiexzf2 = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 1);
        byte[] bArrM2755Ujhhgtgfeyxiexzf2 = AbstractC1245feyxiexzfUjhhgtg.m2755Ujhhgtgfeyxiexzf(fileInputStream, (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4), (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2755Ujhhgtgfeyxiexzf2);
        try {
            C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArrM1339feyxiexzfUjhhgtg = m1339feyxiexzfUjhhgtg(byteArrayInputStream2, iM2756Ujhhgtgfeyxiexzf2, c3272feyxiexzfUjhhgtgArr);
            byteArrayInputStream2.close();
            return c3272feyxiexzfUjhhgtgArrM1339feyxiexzfUjhhgtg;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static C3272feyxiexzfUjhhgtg[] m1339feyxiexzfUjhhgtg(ByteArrayInputStream byteArrayInputStream, int i, C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C3272feyxiexzfUjhhgtg[0];
        }
        if (i != c3272feyxiexzfUjhhgtgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2756Ujhhgtgfeyxiexzf = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(byteArrayInputStream, iM2756Ujhhgtgfeyxiexzf), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg = c3272feyxiexzfUjhhgtgArr[i3];
            if (!c3272feyxiexzfUjhhgtg.f10286Ujhhgtgfeyxiexzf.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c3272feyxiexzfUjhhgtg.f10289Ujhhgtgfeyxiexzf = i4;
            c3272feyxiexzfUjhhgtg.f10292Ujhhgtgfeyxiexzf = m1337feyxiexzfUjhhgtg(byteArrayInputStream, i4);
        }
        return c3272feyxiexzfUjhhgtgArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static C3272feyxiexzfUjhhgtg[] m1340feyxiexzfUjhhgtg(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C3272feyxiexzfUjhhgtg[0];
        }
        if (i != c3272feyxiexzfUjhhgtgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            String str = new String(AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(byteArrayInputStream, (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2756Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 4);
            int iM2756Ujhhgtgfeyxiexzf = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg = null;
            if (c3272feyxiexzfUjhhgtgArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c3272feyxiexzfUjhhgtgArr.length; i3++) {
                    if (c3272feyxiexzfUjhhgtgArr[i3].f10286Ujhhgtgfeyxiexzf.equals(strSubstring)) {
                        c3272feyxiexzfUjhhgtg = c3272feyxiexzfUjhhgtgArr[i3];
                        break;
                    }
                }
            }
            if (c3272feyxiexzfUjhhgtg == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c3272feyxiexzfUjhhgtg.f10288Ujhhgtgfeyxiexzf = jM2756Ujhhgtgfeyxiexzf;
            int[] iArrM1337feyxiexzfUjhhgtg = m1337feyxiexzfUjhhgtg(byteArrayInputStream, iM2756Ujhhgtgfeyxiexzf);
            if (Arrays.equals(bArr, AbstractC1264feyxiexzfUjhhgtg.f4635Ujhhgtgfeyxiexzf)) {
                c3272feyxiexzfUjhhgtg.f10289Ujhhgtgfeyxiexzf = iM2756Ujhhgtgfeyxiexzf;
                c3272feyxiexzfUjhhgtg.f10292Ujhhgtgfeyxiexzf = iArrM1337feyxiexzfUjhhgtg;
            }
        }
        return c3272feyxiexzfUjhhgtgArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static C3272feyxiexzfUjhhgtg[] m1341feyxiexzfUjhhgtg(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC1264feyxiexzfUjhhgtg.f4632Ujhhgtgfeyxiexzf)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2756Ujhhgtgfeyxiexzf = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 1);
        byte[] bArrM2755Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2755Ujhhgtgfeyxiexzf(fileInputStream, (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4), (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2755Ujhhgtgfeyxiexzf);
        try {
            C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArrM1342feyxiexzfUjhhgtg = m1342feyxiexzfUjhhgtg(byteArrayInputStream, str, iM2756Ujhhgtgfeyxiexzf);
            byteArrayInputStream.close();
            return c3272feyxiexzfUjhhgtgArrM1342feyxiexzfUjhhgtg;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static C3272feyxiexzfUjhhgtg[] m1342feyxiexzfUjhhgtg(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C3272feyxiexzfUjhhgtg[0];
        }
        C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr = new C3272feyxiexzfUjhhgtg[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM2756Ujhhgtgfeyxiexzf = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            int iM2756Ujhhgtgfeyxiexzf2 = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
            c3272feyxiexzfUjhhgtgArr[i3] = new C3272feyxiexzfUjhhgtg(str, new String(AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(byteArrayInputStream, iM2756Ujhhgtgfeyxiexzf), StandardCharsets.UTF_8), AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 4), iM2756Ujhhgtgfeyxiexzf2, (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 4), (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 4), new int[iM2756Ujhhgtgfeyxiexzf2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg = c3272feyxiexzfUjhhgtgArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c3272feyxiexzfUjhhgtg.f10290Ujhhgtgfeyxiexzf;
            int i6 = c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf;
            TreeMap treeMap = c3272feyxiexzfUjhhgtg.f10293Ujhhgtgfeyxiexzf;
            int i7 = iAvailable - i5;
            int iM2756Ujhhgtgfeyxiexzf3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM2756Ujhhgtgfeyxiexzf3 += (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM2756Ujhhgtgfeyxiexzf3), 1);
                int iM2756Ujhhgtgfeyxiexzf4 = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
                while (iM2756Ujhhgtgfeyxiexzf4 > 0) {
                    AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
                    int iM2756Ujhhgtgfeyxiexzf5 = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 1);
                    if (iM2756Ujhhgtgfeyxiexzf5 != 6 && iM2756Ujhhgtgfeyxiexzf5 != 7) {
                        while (iM2756Ujhhgtgfeyxiexzf5 > 0) {
                            AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM2756Ujhhgtgfeyxiexzf6 = (int) AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 1); iM2756Ujhhgtgfeyxiexzf6 > 0; iM2756Ujhhgtgfeyxiexzf6--) {
                                AbstractC1245feyxiexzfUjhhgtg.m2756Ujhhgtgfeyxiexzf(byteArrayInputStream, 2);
                            }
                            iM2756Ujhhgtgfeyxiexzf5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM2756Ujhhgtgfeyxiexzf4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c3272feyxiexzfUjhhgtg.f10292Ujhhgtgfeyxiexzf = m1337feyxiexzfUjhhgtg(byteArrayInputStream, c3272feyxiexzfUjhhgtg.f10289Ujhhgtgfeyxiexzf);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c3272feyxiexzfUjhhgtgArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static void m1343feyxiexzfUjhhgtg(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static void m1344feyxiexzfUjhhgtg(C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, boolean z) {
        float f = c3655Ujhhgtgfeyxiexzf.f11619Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf2.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf;
        int iM5289Ujhhgtgfeyxiexzf2 = iM5288Ujhhgtgfeyxiexzf2 - c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
        if (iM5288Ujhhgtgfeyxiexzf == iM5288Ujhhgtgfeyxiexzf2) {
            f = 0.5f;
        } else {
            iM5288Ujhhgtgfeyxiexzf = iM5289Ujhhgtgfeyxiexzf;
            iM5288Ujhhgtgfeyxiexzf2 = iM5289Ujhhgtgfeyxiexzf2;
        }
        int iM5329Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf();
        int i = (iM5288Ujhhgtgfeyxiexzf2 - iM5288Ujhhgtgfeyxiexzf) - iM5329Ujhhgtgfeyxiexzf;
        if (iM5288Ujhhgtgfeyxiexzf > iM5288Ujhhgtgfeyxiexzf2) {
            i = (iM5288Ujhhgtgfeyxiexzf - iM5288Ujhhgtgfeyxiexzf2) - iM5329Ujhhgtgfeyxiexzf;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + iM5288Ujhhgtgfeyxiexzf;
        int i3 = i2 + iM5329Ujhhgtgfeyxiexzf;
        if (iM5288Ujhhgtgfeyxiexzf > iM5288Ujhhgtgfeyxiexzf2) {
            i3 = i2 - iM5329Ujhhgtgfeyxiexzf;
        }
        c3655Ujhhgtgfeyxiexzf.m5342feyxiexzfUjhhgtg(i2, i3);
        m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf, z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static void m1345feyxiexzfUjhhgtg(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2, boolean z) {
        float f = c3655Ujhhgtgfeyxiexzf2.f11619Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2.f11598feyxiexzfUjhhgtg;
        int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf() + c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf2.f11600feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf2.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf() - c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
        if (iM5288Ujhhgtgfeyxiexzf >= iM5289Ujhhgtgfeyxiexzf) {
            int iM5329Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2.m5329Ujhhgtgfeyxiexzf();
            if (c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf != 8) {
                int i = c3655Ujhhgtgfeyxiexzf2.f11581Ujhhgtgfeyxiexzf;
                if (i == 2) {
                    iM5329Ujhhgtgfeyxiexzf = (int) (c3655Ujhhgtgfeyxiexzf2.f11619Ujhhgtgfeyxiexzf * 0.5f * (c3655Ujhhgtgfeyxiexzf instanceof C3656Ujhhgtgfeyxiexzf ? c3655Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf() : c3655Ujhhgtgfeyxiexzf.f11609feyxiexzfUjhhgtg.m5329Ujhhgtgfeyxiexzf()));
                } else if (i == 0) {
                    iM5329Ujhhgtgfeyxiexzf = iM5288Ujhhgtgfeyxiexzf - iM5289Ujhhgtgfeyxiexzf;
                }
                iM5329Ujhhgtgfeyxiexzf = Math.max(c3655Ujhhgtgfeyxiexzf2.f11584Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf);
                int i2 = c3655Ujhhgtgfeyxiexzf2.f11585Ujhhgtgfeyxiexzf;
                if (i2 > 0) {
                    iM5329Ujhhgtgfeyxiexzf = Math.min(i2, iM5329Ujhhgtgfeyxiexzf);
                }
            }
            int i3 = iM5289Ujhhgtgfeyxiexzf + ((int) ((f * ((iM5288Ujhhgtgfeyxiexzf - iM5289Ujhhgtgfeyxiexzf) - iM5329Ujhhgtgfeyxiexzf)) + 0.5f));
            c3655Ujhhgtgfeyxiexzf2.m5342feyxiexzfUjhhgtg(i3, iM5329Ujhhgtgfeyxiexzf + i3);
            m1329Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2, z);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m1346feyxiexzfUjhhgtg(C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf) {
        float f = c3655Ujhhgtgfeyxiexzf.f11620Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf2.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf;
        int iM5289Ujhhgtgfeyxiexzf2 = iM5288Ujhhgtgfeyxiexzf2 - c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
        if (iM5288Ujhhgtgfeyxiexzf == iM5288Ujhhgtgfeyxiexzf2) {
            f = 0.5f;
        } else {
            iM5288Ujhhgtgfeyxiexzf = iM5289Ujhhgtgfeyxiexzf;
            iM5288Ujhhgtgfeyxiexzf2 = iM5289Ujhhgtgfeyxiexzf2;
        }
        int iM5326Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf();
        int i = (iM5288Ujhhgtgfeyxiexzf2 - iM5288Ujhhgtgfeyxiexzf) - iM5326Ujhhgtgfeyxiexzf;
        if (iM5288Ujhhgtgfeyxiexzf > iM5288Ujhhgtgfeyxiexzf2) {
            i = (iM5288Ujhhgtgfeyxiexzf - iM5288Ujhhgtgfeyxiexzf2) - iM5326Ujhhgtgfeyxiexzf;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = iM5288Ujhhgtgfeyxiexzf + i2;
        int i4 = i3 + iM5326Ujhhgtgfeyxiexzf;
        if (iM5288Ujhhgtgfeyxiexzf > iM5288Ujhhgtgfeyxiexzf2) {
            i3 = iM5288Ujhhgtgfeyxiexzf - i2;
            i4 = i3 - iM5326Ujhhgtgfeyxiexzf;
        }
        c3655Ujhhgtgfeyxiexzf.m5343feyxiexzfUjhhgtg(i3, i4);
        m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m1347feyxiexzfUjhhgtg(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2) {
        float f = c3655Ujhhgtgfeyxiexzf2.f11620Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2.f11599feyxiexzfUjhhgtg;
        int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf() + c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf2.f11601feyxiexzfUjhhgtg;
        int iM5288Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf2.f11378Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf() - c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
        if (iM5288Ujhhgtgfeyxiexzf >= iM5289Ujhhgtgfeyxiexzf) {
            int iM5326Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2.m5326Ujhhgtgfeyxiexzf();
            if (c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf != 8) {
                int i = c3655Ujhhgtgfeyxiexzf2.f11582Ujhhgtgfeyxiexzf;
                if (i == 2) {
                    iM5326Ujhhgtgfeyxiexzf = (int) (f * 0.5f * (c3655Ujhhgtgfeyxiexzf instanceof C3656Ujhhgtgfeyxiexzf ? c3655Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf() : c3655Ujhhgtgfeyxiexzf.f11609feyxiexzfUjhhgtg.m5326Ujhhgtgfeyxiexzf()));
                } else if (i == 0) {
                    iM5326Ujhhgtgfeyxiexzf = iM5288Ujhhgtgfeyxiexzf - iM5289Ujhhgtgfeyxiexzf;
                }
                iM5326Ujhhgtgfeyxiexzf = Math.max(c3655Ujhhgtgfeyxiexzf2.f11587Ujhhgtgfeyxiexzf, iM5326Ujhhgtgfeyxiexzf);
                int i2 = c3655Ujhhgtgfeyxiexzf2.f11588Ujhhgtgfeyxiexzf;
                if (i2 > 0) {
                    iM5326Ujhhgtgfeyxiexzf = Math.min(i2, iM5326Ujhhgtgfeyxiexzf);
                }
            }
            int i3 = iM5289Ujhhgtgfeyxiexzf + ((int) ((f * ((iM5288Ujhhgtgfeyxiexzf - iM5289Ujhhgtgfeyxiexzf) - iM5326Ujhhgtgfeyxiexzf)) + 0.5f));
            c3655Ujhhgtgfeyxiexzf2.m5343feyxiexzfUjhhgtg(i3, iM5326Ujhhgtgfeyxiexzf + i3);
            m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static boolean m1348feyxiexzfUjhhgtg(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = AbstractC1264feyxiexzfUjhhgtg.f4635Ujhhgtgfeyxiexzf;
        byte[] bArr3 = AbstractC1264feyxiexzfUjhhgtg.f4634Ujhhgtgfeyxiexzf;
        byte[] bArr4 = AbstractC1264feyxiexzfUjhhgtg.f4631Ujhhgtgfeyxiexzf;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream2, c3272feyxiexzfUjhhgtgArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg : c3272feyxiexzfUjhhgtgArr) {
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream2, c3272feyxiexzfUjhhgtg.f10287Ujhhgtgfeyxiexzf, 4);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream2, c3272feyxiexzfUjhhgtg.f10288Ujhhgtgfeyxiexzf, 4);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream2, c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf, 4);
                    String strM1323Ujhhgtgfeyxiexzf = m1323Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtg.f10285Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtg.f10286Ujhhgtgfeyxiexzf, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM1323Ujhhgtgfeyxiexzf.getBytes(charset).length;
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM1323Ujhhgtgfeyxiexzf.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                C2258feyxiexzfUjhhgtg c2258feyxiexzfUjhhgtg = new C2258feyxiexzfUjhhgtg(byteArray, 1, false);
                byteArrayOutputStream2.close();
                arrayList.add(c2258feyxiexzfUjhhgtg);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c3272feyxiexzfUjhhgtgArr.length) {
                    try {
                        C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg2 = c3272feyxiexzfUjhhgtgArr[i4];
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream3, i4);
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream3, c3272feyxiexzfUjhhgtg2.f10289Ujhhgtgfeyxiexzf);
                        i5 = i5 + 4 + (c3272feyxiexzfUjhhgtg2.f10289Ujhhgtgfeyxiexzf * i2);
                        int[] iArr = c3272feyxiexzfUjhhgtg2.f10292Ujhhgtgfeyxiexzf;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                C2258feyxiexzfUjhhgtg c2258feyxiexzfUjhhgtg2 = new C2258feyxiexzfUjhhgtg(byteArray2, 3, true);
                byteArrayOutputStream3.close();
                arrayList.add(c2258feyxiexzfUjhhgtg2);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c3272feyxiexzfUjhhgtgArr.length) {
                    try {
                        C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg3 = c3272feyxiexzfUjhhgtgArr[i10];
                        Iterator it = c3272feyxiexzfUjhhgtg3.f10293Ujhhgtgfeyxiexzf.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            m1352feyxiexzfUjhhgtg(byteArrayOutputStream5, iIntValue, c3272feyxiexzfUjhhgtg3);
                            byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            try {
                                m1353feyxiexzfUjhhgtg(byteArrayOutputStream6, c3272feyxiexzfUjhhgtg3);
                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream4, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream4, length4, 4);
                                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream4, iIntValue);
                                byteArrayOutputStream4.write(byteArray3);
                                byteArrayOutputStream4.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream6.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                C2258feyxiexzfUjhhgtg c2258feyxiexzfUjhhgtg3 = new C2258feyxiexzfUjhhgtg(byteArray5, 4, true);
                byteArrayOutputStream4.close();
                arrayList.add(c2258feyxiexzfUjhhgtg3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    C2258feyxiexzfUjhhgtg c2258feyxiexzfUjhhgtg4 = (C2258feyxiexzfUjhhgtg) arrayList.get(i14);
                    int i15 = c2258feyxiexzfUjhhgtg4.f7335Ujhhgtgfeyxiexzf;
                    byte[] bArr5 = c2258feyxiexzfUjhhgtg4.f7336Ujhhgtgfeyxiexzf;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, j, 4);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, size, 4);
                    if (c2258feyxiexzfUjhhgtg4.f7337Ujhhgtgfeyxiexzf) {
                        long length5 = bArr5.length;
                        byte[] bArrM2747Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2747Ujhhgtgfeyxiexzf(bArr5);
                        arrayList2.add(bArrM2747Ujhhgtgfeyxiexzf);
                        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArrM2747Ujhhgtgfeyxiexzf.length, 4);
                        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, length5, 4);
                        length = bArrM2747Ujhhgtgfeyxiexzf.length;
                    } else {
                        arrayList2.add(bArr5);
                        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArr5.length, 4);
                        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } else {
            byte[] bArr6 = AbstractC1264feyxiexzfUjhhgtg.f4632Ujhhgtgfeyxiexzf;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM1317Ujhhgtgfeyxiexzf = m1317Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtgArr, bArr6);
                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtgArr.length, 1);
                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArrM1317Ujhhgtgfeyxiexzf.length, 4);
                byte[] bArrM2747Ujhhgtgfeyxiexzf2 = AbstractC1245feyxiexzfUjhhgtg.m2747Ujhhgtgfeyxiexzf(bArrM1317Ujhhgtgfeyxiexzf);
                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArrM2747Ujhhgtgfeyxiexzf2.length, 4);
                byteArrayOutputStream.write(bArrM2747Ujhhgtgfeyxiexzf2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtgArr.length, 1);
                for (C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg4 : c3272feyxiexzfUjhhgtgArr) {
                    int size2 = c3272feyxiexzfUjhhgtg4.f10293Ujhhgtgfeyxiexzf.size() * 4;
                    String strM1323Ujhhgtgfeyxiexzf2 = m1323Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtg4.f10285Ujhhgtgfeyxiexzf, c3272feyxiexzfUjhhgtg4.f10286Ujhhgtgfeyxiexzf, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, strM1323Ujhhgtgfeyxiexzf2.getBytes(charset2).length);
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg4.f10292Ujhhgtgfeyxiexzf.length);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, size2, 4);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg4.f10287Ujhhgtgfeyxiexzf, 4);
                    byteArrayOutputStream.write(strM1323Ujhhgtgfeyxiexzf2.getBytes(charset2));
                    Iterator it2 = c3272feyxiexzfUjhhgtg4.f10293Ujhhgtgfeyxiexzf.keySet().iterator();
                    while (it2.hasNext()) {
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c3272feyxiexzfUjhhgtg4.f10292Ujhhgtgfeyxiexzf) {
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = AbstractC1264feyxiexzfUjhhgtg.f4633Ujhhgtgfeyxiexzf;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM1317Ujhhgtgfeyxiexzf2 = m1317Ujhhgtgfeyxiexzf(c3272feyxiexzfUjhhgtgArr, bArr7);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtgArr.length, 1);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArrM1317Ujhhgtgfeyxiexzf2.length, 4);
                    byte[] bArrM2747Ujhhgtgfeyxiexzf3 = AbstractC1245feyxiexzfUjhhgtg.m2747Ujhhgtgfeyxiexzf(bArrM1317Ujhhgtgfeyxiexzf2);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, bArrM2747Ujhhgtgfeyxiexzf3.length, 4);
                    byteArrayOutputStream.write(bArrM2747Ujhhgtgfeyxiexzf3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtgArr.length);
                for (C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg5 : c3272feyxiexzfUjhhgtgArr) {
                    String str = c3272feyxiexzfUjhhgtg5.f10285Ujhhgtgfeyxiexzf;
                    TreeMap treeMap = c3272feyxiexzfUjhhgtg5.f10293Ujhhgtgfeyxiexzf;
                    String strM1323Ujhhgtgfeyxiexzf3 = m1323Ujhhgtgfeyxiexzf(str, c3272feyxiexzfUjhhgtg5.f10286Ujhhgtgfeyxiexzf, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, strM1323Ujhhgtgfeyxiexzf3.getBytes(charset3).length);
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, treeMap.size());
                    AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg5.f10292Ujhhgtgfeyxiexzf.length);
                    AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg5.f10287Ujhhgtgfeyxiexzf, 4);
                    byteArrayOutputStream.write(strM1323Ujhhgtgfeyxiexzf3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c3272feyxiexzfUjhhgtg5.f10292Ujhhgtgfeyxiexzf) {
                        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static void m1349feyxiexzfUjhhgtg(C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf) {
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5;
        if (!(c3655Ujhhgtgfeyxiexzf instanceof C3656Ujhhgtgfeyxiexzf) && c3655Ujhhgtgfeyxiexzf.m5337Ujhhgtgfeyxiexzf() && m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf)) {
            C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
        }
        C3641Ujhhgtgfeyxiexzf c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.mo1814Ujhhgtgfeyxiexzf(3);
        C3641Ujhhgtgfeyxiexzf c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf.mo1814Ujhhgtgfeyxiexzf(5);
        int iM5288Ujhhgtgfeyxiexzf = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.m5288Ujhhgtgfeyxiexzf();
        int iM5288Ujhhgtgfeyxiexzf2 = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.m5288Ujhhgtgfeyxiexzf();
        HashSet<C3641Ujhhgtgfeyxiexzf> hashSet = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf;
        if (hashSet != null && c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf.f11375Ujhhgtgfeyxiexzf) {
            for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf6 : hashSet) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf6.f11376Ujhhgtgfeyxiexzf;
                boolean zM1308Ujhhgtgfeyxiexzf = m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf2);
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf2.f11599feyxiexzfUjhhgtg;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf2.f11601feyxiexzfUjhhgtg;
                if (c3655Ujhhgtgfeyxiexzf2.m5337Ujhhgtgfeyxiexzf() && zM1308Ujhhgtgfeyxiexzf) {
                    C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf2, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
                }
                int i = c3655Ujhhgtgfeyxiexzf2.f11631Ujhhgtgfeyxiexzf[1];
                if (i != 3 || zM1308Ujhhgtgfeyxiexzf) {
                    if (!c3655Ujhhgtgfeyxiexzf2.m5337Ujhhgtgfeyxiexzf()) {
                        if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf7.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf;
                            c3655Ujhhgtgfeyxiexzf2.m5343feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2.m5326Ujhhgtgfeyxiexzf() + iM5289Ujhhgtgfeyxiexzf);
                            m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2);
                        } else if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf8 && c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf2 = iM5288Ujhhgtgfeyxiexzf - c3641Ujhhgtgfeyxiexzf8.m5289Ujhhgtgfeyxiexzf();
                            c3655Ujhhgtgfeyxiexzf2.m5343feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf2 - c3655Ujhhgtgfeyxiexzf2.m5326Ujhhgtgfeyxiexzf(), iM5289Ujhhgtgfeyxiexzf2);
                            m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2);
                        } else if (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && (c3641Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf3.f11375Ujhhgtgfeyxiexzf) {
                            m1346feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2);
                        }
                    }
                } else if (i == 3 && c3655Ujhhgtgfeyxiexzf2.f11588Ujhhgtgfeyxiexzf >= 0 && c3655Ujhhgtgfeyxiexzf2.f11587Ujhhgtgfeyxiexzf >= 0 && (c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf == 8 || (c3655Ujhhgtgfeyxiexzf2.f11582Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg == 0.0f))) {
                    if (!c3655Ujhhgtgfeyxiexzf2.m5336Ujhhgtgfeyxiexzf() && !c3655Ujhhgtgfeyxiexzf2.f11595feyxiexzfUjhhgtg && ((c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf7 && (c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf8.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf5.f11375Ujhhgtgfeyxiexzf) || (c3641Ujhhgtgfeyxiexzf6 == c3641Ujhhgtgfeyxiexzf8 && (c3641Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf7.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf4.f11375Ujhhgtgfeyxiexzf))) {
                        if (!c3655Ujhhgtgfeyxiexzf2.m5336Ujhhgtgfeyxiexzf()) {
                            m1347feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf2);
                        }
                    }
                }
            }
        }
        if (c3655Ujhhgtgfeyxiexzf instanceof C0527Ujhhgtgfeyxiexzf) {
            return;
        }
        HashSet<C3641Ujhhgtgfeyxiexzf> hashSet2 = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.f11373Ujhhgtgfeyxiexzf;
        if (hashSet2 != null && c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf2.f11375Ujhhgtgfeyxiexzf) {
            for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf9 : hashSet2) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf9.f11376Ujhhgtgfeyxiexzf;
                boolean zM1308Ujhhgtgfeyxiexzf2 = m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf3);
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf10 = c3655Ujhhgtgfeyxiexzf3.f11599feyxiexzfUjhhgtg;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf11 = c3655Ujhhgtgfeyxiexzf3.f11601feyxiexzfUjhhgtg;
                if (c3655Ujhhgtgfeyxiexzf3.m5337Ujhhgtgfeyxiexzf() && zM1308Ujhhgtgfeyxiexzf2) {
                    C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf3, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
                }
                boolean z = (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf10 && (c3641Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf11.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf2.f11375Ujhhgtgfeyxiexzf) || (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf11 && (c3641Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf10.f11378Ujhhgtgfeyxiexzf) != null && c3641Ujhhgtgfeyxiexzf.f11375Ujhhgtgfeyxiexzf);
                int i2 = c3655Ujhhgtgfeyxiexzf3.f11631Ujhhgtgfeyxiexzf[1];
                if (i2 != 3 || zM1308Ujhhgtgfeyxiexzf2) {
                    if (!c3655Ujhhgtgfeyxiexzf3.m5337Ujhhgtgfeyxiexzf()) {
                        if (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf10 && c3641Ujhhgtgfeyxiexzf11.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf10.m5289Ujhhgtgfeyxiexzf() + iM5288Ujhhgtgfeyxiexzf2;
                            c3655Ujhhgtgfeyxiexzf3.m5343feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf3, c3655Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5289Ujhhgtgfeyxiexzf3);
                            m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3);
                        } else if (c3641Ujhhgtgfeyxiexzf9 == c3641Ujhhgtgfeyxiexzf11 && c3641Ujhhgtgfeyxiexzf10.f11378Ujhhgtgfeyxiexzf == null) {
                            int iM5289Ujhhgtgfeyxiexzf4 = iM5288Ujhhgtgfeyxiexzf2 - c3641Ujhhgtgfeyxiexzf11.m5289Ujhhgtgfeyxiexzf();
                            c3655Ujhhgtgfeyxiexzf3.m5343feyxiexzfUjhhgtg(iM5289Ujhhgtgfeyxiexzf4 - c3655Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf(), iM5289Ujhhgtgfeyxiexzf4);
                            m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3);
                        } else if (z && !c3655Ujhhgtgfeyxiexzf3.m5336Ujhhgtgfeyxiexzf()) {
                            m1346feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3);
                        }
                    }
                } else if (i2 == 3 && c3655Ujhhgtgfeyxiexzf3.f11588Ujhhgtgfeyxiexzf >= 0 && c3655Ujhhgtgfeyxiexzf3.f11587Ujhhgtgfeyxiexzf >= 0 && (c3655Ujhhgtgfeyxiexzf3.f11622Ujhhgtgfeyxiexzf == 8 || (c3655Ujhhgtgfeyxiexzf3.f11582Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf3.f11612feyxiexzfUjhhgtg == 0.0f))) {
                    if (!c3655Ujhhgtgfeyxiexzf3.m5336Ujhhgtgfeyxiexzf() && !c3655Ujhhgtgfeyxiexzf3.f11595feyxiexzfUjhhgtg && z && !c3655Ujhhgtgfeyxiexzf3.m5336Ujhhgtgfeyxiexzf()) {
                        m1347feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf, c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3);
                    }
                }
            }
        }
        C3641Ujhhgtgfeyxiexzf c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.mo1814Ujhhgtgfeyxiexzf(6);
        if (c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf3.f11373Ujhhgtgfeyxiexzf == null || !c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf3.f11375Ujhhgtgfeyxiexzf) {
            return;
        }
        int iM5288Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf3.m5288Ujhhgtgfeyxiexzf();
        for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf12 : c3641UjhhgtgfeyxiexzfMo1814Ujhhgtgfeyxiexzf3.f11373Ujhhgtgfeyxiexzf) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf12.f11376Ujhhgtgfeyxiexzf;
            boolean zM1308Ujhhgtgfeyxiexzf3 = m1308Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf4);
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf13 = c3655Ujhhgtgfeyxiexzf4.f11602feyxiexzfUjhhgtg;
            if (c3655Ujhhgtgfeyxiexzf4.m5337Ujhhgtgfeyxiexzf() && zM1308Ujhhgtgfeyxiexzf3) {
                C3656Ujhhgtgfeyxiexzf.m5349feyxiexzfUjhhgtg(c3655Ujhhgtgfeyxiexzf4, c3646Ujhhgtgfeyxiexzf, new C2493feyxiexzfUjhhgtg());
            }
            if (c3655Ujhhgtgfeyxiexzf4.f11631Ujhhgtgfeyxiexzf[1] != 3 || zM1308Ujhhgtgfeyxiexzf3) {
                if (!c3655Ujhhgtgfeyxiexzf4.m5337Ujhhgtgfeyxiexzf() && c3641Ujhhgtgfeyxiexzf12 == c3641Ujhhgtgfeyxiexzf13) {
                    if (c3655Ujhhgtgfeyxiexzf4.f11594feyxiexzfUjhhgtg) {
                        int i3 = iM5288Ujhhgtgfeyxiexzf3 - c3655Ujhhgtgfeyxiexzf4.f11616feyxiexzfUjhhgtg;
                        int i4 = c3655Ujhhgtgfeyxiexzf4.f11611feyxiexzfUjhhgtg + i3;
                        c3655Ujhhgtgfeyxiexzf4.f11615feyxiexzfUjhhgtg = i3;
                        c3655Ujhhgtgfeyxiexzf4.f11599feyxiexzfUjhhgtg.m5296Ujhhgtgfeyxiexzf(i3);
                        c3655Ujhhgtgfeyxiexzf4.f11601feyxiexzfUjhhgtg.m5296Ujhhgtgfeyxiexzf(i4);
                        c3641Ujhhgtgfeyxiexzf13.m5296Ujhhgtgfeyxiexzf(iM5288Ujhhgtgfeyxiexzf3);
                        c3655Ujhhgtgfeyxiexzf4.f11578Ujhhgtgfeyxiexzf = true;
                    }
                    m1349feyxiexzfUjhhgtg(c3646Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static void m1350feyxiexzfUjhhgtg(ByteArrayOutputStream byteArrayOutputStream, C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg) throws IOException {
        m1353feyxiexzfUjhhgtg(byteArrayOutputStream, c3272feyxiexzfUjhhgtg);
        int i = c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf;
        int[] iArr = c3272feyxiexzfUjhhgtg.f10292Ujhhgtgfeyxiexzf;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3272feyxiexzfUjhhgtg.f10293Ujhhgtgfeyxiexzf.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static void m1351feyxiexzfUjhhgtg(ByteArrayOutputStream byteArrayOutputStream, C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg.f10289Ujhhgtgfeyxiexzf);
        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg.f10290Ujhhgtgfeyxiexzf, 4);
        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg.f10287Ujhhgtgfeyxiexzf, 4);
        AbstractC1245feyxiexzfUjhhgtg.m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m1352feyxiexzfUjhhgtg(ByteArrayOutputStream byteArrayOutputStream, int i, C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg) throws IOException {
        int i2 = c3272feyxiexzfUjhhgtg.f10291Ujhhgtgfeyxiexzf;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3272feyxiexzfUjhhgtg.f10293Ujhhgtgfeyxiexzf.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m1353feyxiexzfUjhhgtg(ByteArrayOutputStream byteArrayOutputStream, C3272feyxiexzfUjhhgtg c3272feyxiexzfUjhhgtg) throws IOException {
        int i = 0;
        for (Map.Entry entry : c3272feyxiexzfUjhhgtg.f10293Ujhhgtgfeyxiexzf.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, iIntValue - i);
                AbstractC1245feyxiexzfUjhhgtg.m2761Ujhhgtgfeyxiexzf(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
